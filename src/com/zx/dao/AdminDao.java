package com.zx.dao;

import com.zx.beans.Admin;

public interface AdminDao   {
    Admin login(String usercode, String password);
}
