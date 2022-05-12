package com.zx.service.impl;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.ResumeDao;
import com.zx.service.CompanyService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    private CompanyDao companyDao;
    private OccupationDao occupationDao;
    private ResumeDao resumeDao;



    @Override
    public void companyRegister(String cpyaccount, String cpypassword, String cpyname, String cpyphone, String cpyaddress, String cpyinfo) {


        companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.Register(cpyaccount,cpypassword,cpyname,cpyphone,cpyaddress,cpyinfo);

    }

    @Override
    public void jobPublish(String ocname, String workplace, String worktime, String salary, String requirement,int companyid) {
        occupationDao = sqlSessionTemplate.getMapper(OccupationDao.class);
        Occupation occupation = new Occupation();
        occupation.setOcname(ocname);
        occupation.setWorkplace(workplace);
        occupation.setWorktime(worktime);
        occupation.setSalary(salary);
        occupation.setRequirement(requirement);
        occupationDao.Jobpublish(occupation);
        System.out.println(companyid);
        System.out.println("发布成功"+occupation.getId());
        occupationDao.Jobpublish2(companyid,occupation.getId());
    }

    @Override
    public Company getOccupationsCompany(int companyid) {
        occupationDao = sqlSessionTemplate.getMapper(OccupationDao.class);
        return occupationDao.getOccupationsCompany(companyid);
    }

    @Override
    public Occupation jobQuery(int ocid){
        occupationDao = sqlSessionTemplate.getMapper(OccupationDao.class);
        return occupationDao.getOccupationById(ocid);
    }

    @Override
     public void updateOccupationById(Occupation occupation){
        occupationDao = sqlSessionTemplate.getMapper(OccupationDao.class);
        occupationDao.updateOccupationById(occupation);
    }

    @Override
    public void deleteOccupationById(int ocid,int cpyandocid){
        occupationDao = sqlSessionTemplate.getMapper(OccupationDao.class);
        occupationDao.deleteOccupationById(ocid);
        occupationDao.deleteCpyandocById(cpyandocid);

    }

    @Override
    public ArrayList<Student> getAdmissionById(int companyid){
        companyDao = sqlSessionTemplate.getMapper(CompanyDao.class);
        ArrayList<Student> students = companyDao.getAdmissionById(companyid);
        return students;
    }
    @Override
    public Resume getStudentResume(int resumeid){
        resumeDao = sqlSessionTemplate.getMapper(ResumeDao.class);
        Resume resume = resumeDao.getStudentResumeById(resumeid);
        return resume;
    }

    @Override
    public Company getCompanyById(int companyid){
        companyDao = sqlSessionTemplate.getMapper(CompanyDao.class);
        Company company = companyDao.getCompanyById(companyid);
        return company;
    }

    @Override
    public void updateCompanyById(Company company){
        companyDao = sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.updateCompanyById(company);
    }

    @Override
    public void companyUpdate(Company company) {
        companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.updateCompanyById(company);
    }

 /*   @Override
    public List<Occupation> companygetAdmissionById(int companyid) {
        CompanyDao companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
       return  companyDao.getAdmissionById(companyid);

    }  */  @Override
    public List<Student> companyGetAdmissionById(int companyid) {
         companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
       return  companyDao.getAdmissionById(companyid);

    }

    @Override
    public void login() {

        System.out.println("登录");
    }

    @Override
    public void test() {
      occupationDao=sqlSessionTemplate.getMapper(OccupationDao.class);
//  occupationDao.Jobpublish("java","java","java","12000","java");

    }

    @Override
    public void accept(int ocid, int studentid) {
        companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.accept(ocid,studentid);
    }

    @Override
    public void refuse(int ocid, int studentid) {
        companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.refuse(ocid,studentid);
    }
}
