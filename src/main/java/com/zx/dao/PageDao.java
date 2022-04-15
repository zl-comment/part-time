package com.zx.dao;

import com.zx.beans.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageDao {

    List<Company> getAllCompanyAdmin();


    List<Company> getCompanyByCpyNameAndCpyAddress(@Param("cpyName") String cpyName,@Param("cpyAddress") String cpyAddress);

    List<Temporary> getAllOccupation(int currectpage, int limit);

    List<Temporary> getOccupationByOcName(@Param("ocName") String ocName,@Param("workPlace") String workPlace,@Param("cpyName") String cpyName,@Param("requirement") String requirement);

}
