package com.bessie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bessie.pojo.Stu;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bessie
 * @since 2024-02-20
 */

//public interface StuService extends IService<Stu> {
//
//}

public interface StuService {
    public void save(Stu stu);
}