package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.ResumePersionalEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:07:31
 */
public interface ResumePersionalService extends IService<ResumePersionalEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

