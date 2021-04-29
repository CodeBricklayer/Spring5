package com.tanp.spring.demo8.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author CodeBricklayer
 * @ClassName UserDaoImpl
 * @Description
 * @date 2021/4/28 23:18
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money+? where user_name = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money-? where user_name = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
