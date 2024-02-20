package com.bessie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bessie.mapper.StuMapper;
import com.bessie.pojo.Stu;
import com.bessie.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bessie
 * @since 2024-02-20
 */
//@Service
//public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {
//
//}

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Transactional
    @Override
    public void save(Stu stu){
        stuMapper.insert(stu);
    }
}

