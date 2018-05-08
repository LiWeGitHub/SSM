package com.lw.Dao;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    String getStudentById(Integer id);
}
