package com.always.ssm_experiment_management_system_server.mapper;

import com.always.ssm_experiment_management_system_server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from all_user where user_account = #{user_account} and user_password = #{user_password}")
    User findByAccountAndPassword(String user_account, String user_password);
}

