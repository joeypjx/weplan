package org.weplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.weplan.mapper.UserMapper;
import org.weplan.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	
	@ApiOperation("新增用户")
	@RequestMapping(method = RequestMethod.POST)
	public User insertUser(@RequestBody User user) throws Exception {

		userMapper.insertSelective(user);
		return user;
	}
}