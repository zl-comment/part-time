package com.zx.servlet;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.impl.CompanyDaoImpl;
import com.zx.dao.impl.OccupationDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


@WebServlet(name = "OccupationServlet", urlPatterns = "/OccupationServlet")
public class OccupationServlet extends BaseServlet {
    public void Jobpublish(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String ocname = request.getParameter("ocname");
        String workplace = request.getParameter("workplace");
        String worktime = request.getParameter("worktime");
        String salary = request.getParameter("salary");
        String requirement = request.getParameter("requirement");
        String companyid = request.getParameter("companyid");
        OccupationDao occupationDao = new OccupationDaoImpl();
        occupationDao.Jobpublish(ocname, workplace, worktime, salary, requirement);
        int occupationid = occupationDao.jobIdBy(ocname, workplace, worktime, salary, requirement);
        CompanyDao companyDao=new CompanyDaoImpl();
        companyDao.addOccupation(Integer.parseInt(companyid),occupationid);
        try {
            getOccupations(request,response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }


    public void getOccupations(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        String companyid=request.getParameter("companyid");
        OccupationDao occupationDao = new OccupationDaoImpl();
        Company   company = occupationDao.getOccupationsCompany(Integer.parseInt(companyid));



        request.setAttribute("companyid",companyid);
        request.setAttribute("occupations",company.getOccupations());
        request.getRequestDispatcher("/Jobmanage.jsp").forward(request, response);



    }
    public void getoccupationById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String companyid=request.getParameter("companyid");
        String ocid = request.getParameter("ocid");
        System.out.println(ocid);
        OccupationDao occupationDao = new OccupationDaoImpl();
        Occupation occupation = occupationDao.getOccupationById(Integer.parseInt(ocid));
        request.setAttribute("companyid",companyid);
        request.setAttribute("oc",occupation);
        request.getRequestDispatcher("/Jobquery.jsp").forward(request,response);
    }

    public void deleteoccupationById(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String companyid=request.getParameter("companyid");
        String ocid = request.getParameter("ocid");
        String cpyandocid = request.getParameter("cpyandocid");
        OccupationDao occupationDao = new OccupationDaoImpl();
        occupationDao.deleteCpyandocById(Integer.parseInt(cpyandocid));
        occupationDao.deleteOccupationById(Integer.parseInt(ocid));
        Company   company = occupationDao.getOccupationsCompany(Integer.parseInt(companyid));
        request.setAttribute("companyid",companyid);
        request.setAttribute("company", company);
        request.setAttribute("occupations",company.getOccupations());

        request.getRequestDispatcher("/Jobmanage.jsp").forward(request,response);
    }
    public void updateoccupationById(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        String ocid = request.getParameter("ocid");
        String companyid = request.getParameter("companyid");
        System.out.println(companyid);
        String ocname = request.getParameter("ocname");
        String workplace = request.getParameter("workplace");
        String worktime = request.getParameter("worktime");
        String salary = request.getParameter("salary");
        String requirement = request.getParameter("requirement");
        Occupation occupation = new Occupation(Integer.parseInt(ocid),ocname,salary,requirement,workplace,worktime);



        OccupationDao occupationDao = new OccupationDaoImpl();
        //Company   company = occupationDao.getOccupationsCompany(Integer.parseInt(companyid));
        occupationDao.updateOccupationById(occupation);
        Company company = occupationDao.getOccupationsCompany(Integer.parseInt(companyid));

        request.setAttribute("companyid",companyid);
        request.setAttribute("occupations",company.getOccupations());
        request.getRequestDispatcher("/Jobmanage.jsp").forward(request,response);
    }


}
