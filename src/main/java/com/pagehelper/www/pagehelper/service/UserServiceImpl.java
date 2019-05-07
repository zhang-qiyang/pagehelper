package com.pagehelper.www.pagehelper.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pagehelper.www.pagehelper.dao.UserDao;
import com.pagehelper.www.pagehelper.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangqiyang
 * @date 2019/5/7 - 17:03
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<Employee> getAllEmplist(Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> list = userDao.getAllEmpByPage();
        //将查询到的员工集合封装进pageinfo
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
