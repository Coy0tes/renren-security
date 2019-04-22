package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeEstimateDao;
import io.renren.modules.sys.entity.ResumeEstimateEntity;
import io.renren.modules.sys.service.ResumeEstimateService;


@Service("resumeEstimateService")
public class ResumeEstimateServiceImpl extends ServiceImpl<ResumeEstimateDao, ResumeEstimateEntity> implements ResumeEstimateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeEstimateEntity> page = this.page(
                new Query<ResumeEstimateEntity>().getPage(params),
                new QueryWrapper<ResumeEstimateEntity>()
        );

        return new PageUtils(page);
    }

}
