package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ResumeSkillDao;
import io.renren.modules.sys.entity.ResumeSkillEntity;
import io.renren.modules.sys.service.ResumeSkillService;


@Service("resumeSkillService")
public class ResumeSkillServiceImpl extends ServiceImpl<ResumeSkillDao, ResumeSkillEntity> implements ResumeSkillService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResumeSkillEntity> page = this.page(
                new Query<ResumeSkillEntity>().getPage(params),
                new QueryWrapper<ResumeSkillEntity>()
        );

        return new PageUtils(page);
    }

}
