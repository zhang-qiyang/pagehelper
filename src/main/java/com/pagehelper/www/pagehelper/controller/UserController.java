package com.pagehelper.www.pagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.pagehelper.www.pagehelper.entity.Employee;
import com.pagehelper.www.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqiyang
 * @date 2019/5/7 - 17:12
 * @description
 */
@RestController
@RequestMapping("/emp")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getEmps")
    public Map<String, Object> getAllEmpList(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                             @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                             ModelMap model){
        PageInfo<Employee> page = userService.getAllEmplist(pageNo, pageSize);
        Map<String,Object> map=new HashMap<>();
        map.put("emps",page);
        return map;
    }
}
