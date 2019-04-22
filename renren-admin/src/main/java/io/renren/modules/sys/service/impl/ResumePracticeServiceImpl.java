package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumePracticeDao;
import io.renren.modules.sys.entity.ResumePracticeEntity;
import io.renren.modules.sys.service.ResumePracticeService;


@Service("resumePracticeService")
public class ResumePracticeServiceImpl extends ServiceImpl<ResumePracticeDao, ResumePracticeEntity> implements ResumePracticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumePracticeEntity> page = this.page(
                new Query<ResumePracticeEntity>().getPage(params),
                new QueryWrapper<ResumePracticeEntity>()
        );

        return new PageUtils(page);
    }

}
