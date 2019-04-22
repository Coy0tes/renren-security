package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.ResumeExperienceEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:01:42
 */
public interface ResumeExperienceService extends IService<ResumeExperienceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

