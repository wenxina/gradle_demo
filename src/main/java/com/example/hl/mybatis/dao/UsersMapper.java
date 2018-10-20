package com.example.hl.mybatis.dao;

import com.example.hl.mybatis.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 与数据库交互
 */
@Repository
@Mapper//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
public interface UsersMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}