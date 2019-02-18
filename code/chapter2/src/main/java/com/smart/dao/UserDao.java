package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhiqin.li on 2019/1/5.
 */

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;
    private final static String MATCH_COUNT_SQL = " SELECT COUNT(*) FROM t_user WHERE usr_name=? and password=? ";
    private final static String QUERY_BY_USERNAME = " SELECT usr_id, usr_name, credits FROM t_user WHERE usr_name=?";
    private final static String UPDATE_LOGIN_INFO_SQL = " UPDATE t_user SET last_visit=?,last_ip=?,credits=? WHERE usr_id=? ";

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String userName, String password) {
        return jdbcTemplate.queryForObject(MATCH_COUNT_SQL, new Object[]{userName, password}, Integer.class);
    }

    public User findUserByUserName(final String userName) {
        final User user = new User();
        jdbcTemplate.query(QUERY_BY_USERNAME, new Object[]{userName},
                new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("usr_id"));
                        user.setUserName(userName);
                        user.setCredits(resultSet.getInt("credits"));
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user) {
        int intVal = jdbcTemplate.update(UPDATE_LOGIN_INFO_SQL, new Object[]{user.getLastVisit(), user.getLastIp(), user.getCredits(), user.getUserId()});
        System.out.println(intVal);
    }
}
