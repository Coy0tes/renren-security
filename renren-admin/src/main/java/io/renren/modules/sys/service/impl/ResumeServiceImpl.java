package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeDao;
import io.renren.modules.sys.entity.ResumeEntity;
import io.renren.modules.sys.service.ResumeService;


@Service("resumeService")
public class ResumeServiceImpl extends ServiceImpl<ResumeDao, ResumeEntity> implements ResumeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeEntity> page = this.page(
                new Query<ResumeEntity>().getPage(params),
                new QueryWrapper<ResumeEntity>()
        );

        return new PageUtils(page);
    }

}
