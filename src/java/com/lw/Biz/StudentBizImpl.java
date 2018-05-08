package com.lw.Biz;

import com.lw.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentBiz")
public class StudentBizImpl implements StudentBiz {
    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public String getStudentById(Integer id) {
        return studentDao.getStudentById(id);
    }
}
