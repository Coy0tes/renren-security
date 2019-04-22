package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeEducationDao;
import io.renren.modules.sys.entity.ResumeEducationEntity;
import io.renren.modules.sys.service.ResumeEducationService;


@Service("resumeEducationService")
public class ResumeEducationServiceImpl extends ServiceImpl<ResumeEducationDao, ResumeEducationEntity> implements ResumeEducationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeEducationEntity> page = this.page(
                new Query<ResumeEducationEntity>().getPage(params),
                new QueryWrapper<ResumeEducationEntity>()
        );

        return new PageUtils(page);
    }

}
