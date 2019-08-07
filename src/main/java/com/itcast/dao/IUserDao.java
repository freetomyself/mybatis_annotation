package com.itcast.dao;

import com.itcast.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: day01_eesy_01mybatis--com.itcast.dao
 * @author: WaHotDog 2019-08-04 12:22
 **/


public interface IUserDao {
@Select("select * from user")
   public List<User> findAll();
}
