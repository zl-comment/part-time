package com.zx.dao;

import com.zx.beans.Occupation;
import com.zx.beans.Student;

import java.util.ArrayList;
import java.util.List;

public interface OccupationDao {
    Student getOccupationsStudent(int studentid);

    void deleteOccupationsByIdStudent(int stuandocid);
}
