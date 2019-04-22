package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumePersionalDao;
import io.renren.modules.sys.entity.ResumePersionalEntity;
import io.renren.modules.sys.service.ResumePersionalService;


@Service("resumePersionalService")
public class ResumePersionalServiceImpl extends ServiceImpl<ResumePersionalDao, ResumePersionalEntity> implements ResumePersionalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumePersionalEntity> page = this.page(
                new Query<ResumePersionalEntity>().getPage(params),
                new QueryWrapper<ResumePersionalEntity>()
        );

        return new PageUtils(page);
    }

}
