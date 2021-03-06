package com.zx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.beans.*;
import com.zx.dao.AdminDao;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.PageDao;
import com.zx.service.AdminService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service//使用控制反转时创建对象时首字母小写对于Servie注解反转的
public class AdminServiceImpl  implements AdminService {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }




    @Override
    public Admin adminLogin(String usercode,String password) {

        AdminDao adminDao= sqlSessionTemplate.getMapper(AdminDao.class);

        Admin admin=adminDao.login(usercode,password);
        System.out.println(admin);

        if(admin==null){
            return null;
        }else{
            return admin;
        }

    }

    @Override
    public Page<Company> getCompanyList( int pagenum,  int pagesize) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Company> page=new Page<>();

        PageHelper.startPage(pagenum,pagesize);
        List<Company> companies=pageDao.getAllCompanyAdmin();   //这两步不可分开，否则数据丢失
        return getCompanyPage(page, companies);
    }

    @Override
    public List<Permission> selectPermission(int roleid) {
        AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        return adminDao.findPermissionByRoleId(roleid);
    }

    @Override
    public void updateCompanyState(List<Company> companies1, int state) {
        CompanyDao companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        for (Company company:companies1) {
            System.out.println(company.getId());
            System.out.println(state);
            companyDao.updateCompanyStateAdmin(company.getId(),state);
            if(state==1){   //若企业审核通过
                if(companyDao.selectCpyandroByAdmin(company.getId())!=null){  //如果已经存在表中
                    companyDao.updateCpyandroByAdmin(company.getId(),3); //则更新表中的角色属性
                }else
                companyDao.insertCpyandroByAdmin(company.getId(),3);   //如果没在表中就添加
            }else   if(state==-1){   //若企业审核没通过
                if(companyDao.selectCpyandroByAdmin(company.getId())!=null){  //如果已经存在表中
                    companyDao.updateCpyandroByAdmin(company.getId(),4); //则更新表中的角色属性
                }else
                companyDao.insertCpyandroByAdmin(company.getId(),4);   //如果没在表中就添加
            }else   if(state==-2){   //若企业审核被封
                if(companyDao.selectCpyandroByAdmin(company.getId())!=null){  //如果已经存在表中
                    companyDao.updateCpyandroByAdmin(company.getId(),5); //则更新表中的角色属性
                }else
                    companyDao.insertCpyandroByAdmin(company.getId(),5);   //如果没在表中就添加
            }
        }
    }

    @Override
    public Page<Company> getCompanyByCpyNameAndCpyAddress(String cpyName, String cpyAddress, int currectpage, int limit) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Company> page=new Page<>();
        PageHelper.startPage(currectpage,limit);
        List<Company> companies=pageDao.getCompanyByCpyNameAndCpyAddress(cpyName,cpyAddress);
        return getCompanyPage(page, companies);


    }

    private Page<Company> getCompanyPage(Page<Company> page, List<Company> companies) {
        PageInfo<Company> pageInfo=new PageInfo<>(companies);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Company> list=new ArrayList<>(companies);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }

    @Override
    public Page<Temporary> getOccupationByPage(int currectpage, int limit) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Temporary> page=new Page<>();
        PageHelper.startPage(currectpage,limit);
        List<Temporary> occupations=pageDao.getAllOccupation(currectpage,limit);
        return getOccupationPage(page, occupations);

    }


    private Page<Temporary> getOccupationPage(Page<Temporary> page, List<Temporary> occupations) {
        PageInfo<Temporary> pageInfo=new PageInfo<>(occupations);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Temporary> list=new ArrayList<>(occupations);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }

    @Override
    public void updateOccupationState(List<Temporary> occupations, int state) {
        OccupationDao occupationDao=sqlSessionTemplate.getMapper(OccupationDao.class);
        for (Temporary occupation:occupations) {
            System.out.println(occupation.getId());
            System.out.println(state);
            occupationDao.updateOccupationStateAdmin(occupation.getId(),state);
        }

    }

    @Override
    public Page<Temporary> getOccupationByOcName(String ocName, String workPlace, String cpyName, String requirement, int currectpage, int limit) {
        System.out.println(ocName+" "+workPlace+" "+cpyName+" "+" "+requirement);
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Temporary> page=new Page<>();
        PageHelper.startPage(currectpage,limit);
        List<Temporary> occupations=pageDao.getOccupationByOcName(ocName,workPlace,cpyName,requirement);
        return getOccupationPage(page, occupations);
    }

    @Override
    public Company getCompanyByIdAndOccupation(int companyId) {
       OccupationDao occupationDao=sqlSessionTemplate.getMapper(OccupationDao.class);
        return occupationDao.occupationByCompanyAdmin(companyId);

    }

    @Override
    public Page<Student> getStudent(int currectpage, int limit) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Student> page=new Page<>();
        PageHelper.startPage(currectpage,limit);
        List<Student> students=pageDao.getAllStudent();
        return getStudentPage(page, students);
    }

    private Page<Student> getStudentPage(Page<Student> page, List<Student> students) {
        PageInfo<Student> pageInfo=new PageInfo<>(students);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Student> list=new ArrayList<>(students);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }

    @Override
    public List<Occupation> getStudentByIdAndOccupation(int parseInt) {
        OccupationDao occupationDao=sqlSessionTemplate.getMapper(OccupationDao.class);
        return occupationDao.occupationByStudentAdmin(parseInt);
    }

    @Override
    public Student getStudentByIdAdmin(int parseInt) {
       AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        return adminDao.getStudentByIdAdmin(parseInt);
    }

    @Override
    public Resume getResumeByResumeId(int parseInt) {
        AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        return adminDao.getResumeByResumeId(parseInt);
    }

    @Override
    public Page<Admin> getAdminList(int currectpage, int limit) {
        AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        Page<Admin> page=new Page<>();
        PageHelper.startPage(currectpage,limit);
        List<Admin> admins=adminDao.getAdminList();
        return getAdminPage(page, admins);

    }

    private Page<Admin> getAdminPage(Page<Admin> page, List<Admin> admins) {
        PageInfo<Admin> pageInfo=new PageInfo<>(admins);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Admin> list=new ArrayList<>(admins);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }

    @Override
    public void updateAdminInfo(String field, String value,int id) {
        AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        if(field.equals("state")){
          adminDao.updateAdminState( id,Integer.parseInt(value));
          if(value.equals("1")){
              adminDao.updateAdandro(id,1);
          }else  if(value.equals("2")){
              adminDao.updateAdandro(id,2);
          }else {
              adminDao.updateAdandro(id,0);
          }
        }else {
            if(field.equals("adminpassword")){
                String adminpassword=value;
                adminDao.updateAdminInfo(id,null,adminpassword,null);
            }else if (field.equals("adminname")){
                String adminname=value;
                adminDao.updateAdminInfo(id,adminname,null,null);
            }else if (field.equals("adminphone")){
                String adminphone=value;
                adminDao.updateAdminInfo(id,null,null,adminphone);
            }
        }

    }

    @Override
    public void addAdmin(Admin admin) {
        AdminDao adminDao=sqlSessionTemplate.getMapper(AdminDao.class);
        adminDao.addAdmin(admin);
       adminDao.insertAdandro(admin.getId());

    }
}

