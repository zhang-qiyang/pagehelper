package com.pagehelper.www.pagehelper.dao;

import com.pagehelper.www.pagehelper.entity.Employee;

import java.util.List;

/**
 * @author zhangqiyang
 * @date 2019/5/7 - 16:41
 * @description
 */
public interface UserDao {
    /**
     * 获取所有员工信息
     * @return
     */
    List<Employee> getAllEmpByPage();
}
