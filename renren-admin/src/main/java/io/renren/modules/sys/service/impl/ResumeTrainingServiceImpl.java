package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeTrainingDao;
import io.renren.modules.sys.entity.ResumeTrainingEntity;
import io.renren.modules.sys.service.ResumeTrainingService;


@Service("resumeTrainingService")
public class ResumeTrainingServiceImpl extends ServiceImpl<ResumeTrainingDao, ResumeTrainingEntity> implements ResumeTrainingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeTrainingEntity> page = this.page(
                new Query<ResumeTrainingEntity>().getPage(params),
                new QueryWrapper<ResumeTrainingEntity>()
        );

        return new PageUtils(page);
    }

}
