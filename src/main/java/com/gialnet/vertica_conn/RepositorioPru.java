package com.gialnet.vertica_conn;

import org.hibernate.validator.constraints.EAN;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioPru {

    private final JdbcTemplate jdbc;

    public RepositorioPru(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Tuplas> ListTuplas(){

        String sql = "SELECT * from nombres";

        return this.jdbc.query(sql, new BeanPropertyRowMapper(Tuplas.class));
    }
}
