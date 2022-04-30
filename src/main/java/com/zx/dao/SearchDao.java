package com.zx.dao;

import com.zx.beans.Occupation;
import com.zx.beans.Temporary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchDao {
    List<Temporary> searchOccupation(@Param("data") String data, @Param("ocname") String ocname, @Param("salary") String salary, @Param("requirement") String requirement) ;


}
