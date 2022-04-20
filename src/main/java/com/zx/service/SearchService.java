package com.zx.service;

import com.zx.beans.Occupation;
import com.zx.beans.Page;

import java.util.List;

public interface SearchService {

    Page<Occupation> search(String data, String ocname, String salary, String requirement,int currectpage);
}
