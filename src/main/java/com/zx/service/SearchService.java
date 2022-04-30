package com.zx.service;

import com.zx.beans.Occupation;
import com.zx.beans.Page;
import com.zx.beans.Temporary;

import java.util.List;

public interface SearchService {

    Page<Temporary> search(String data, String ocname, String salary, String requirement, int currectpage);
}
