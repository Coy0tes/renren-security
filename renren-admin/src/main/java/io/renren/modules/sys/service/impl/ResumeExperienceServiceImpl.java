package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeExperienceDao;
import io.renren.modules.sys.entity.ResumeExperienceEntity;
import io.renren.modules.sys.service.ResumeExperienceService;


@Service("resumeExperienceService")
public class ResumeExperienceServiceImpl extends ServiceImpl<ResumeExperienceDao, ResumeExperienceEntity> implements ResumeExperienceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeExperienceEntity> page = this.page(
                new Query<ResumeExperienceEntity>().getPage(params),
                new QueryWrapper<ResumeExperienceEntity>()
        );

        return new PageUtils(page);
    }

}
