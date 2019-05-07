package com.pagehelper.www.pagehelper.service;

import com.github.pagehelper.PageInfo;
import com.pagehelper.www.pagehelper.entity.Employee;

import java.util.List;

/**
 * @author zhangqiyang
 * @date 2019/5/7 - 17:02
 * @description
 */
public interface UserService {
    /**
     * 查询所有员工
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageInfo<Employee> getAllEmplist(Integer pageNo,Integer pageSize);
}
