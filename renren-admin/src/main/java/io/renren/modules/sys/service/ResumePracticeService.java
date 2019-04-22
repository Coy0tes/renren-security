package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.ResumePracticeEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:06:05
 */
public interface ResumePracticeService extends IService<ResumePracticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

