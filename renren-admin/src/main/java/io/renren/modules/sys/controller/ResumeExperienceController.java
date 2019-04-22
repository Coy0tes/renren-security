package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.ResumeExperienceEntity;
import io.renren.modules.sys.service.ResumeExperienceService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:01:42
 */
@RestController
@RequestMapping("sys/resumeexperience")
public class ResumeExperienceController {
    @Autowired
    private ResumeExperienceService resumeExperienceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumeexperience:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeExperienceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumeexperience:info")
    public R info(@PathVariable("id") Long id){
        ResumeExperienceEntity resumeExperience = resumeExperienceService.getById(id);

        return R.ok().put("resumeExperience", resumeExperience);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumeexperience:save")
    public R save(@RequestBody ResumeExperienceEntity resumeExperience){
        resumeExperienceService.save(resumeExperience);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumeexperience:update")
    public R update(@RequestBody ResumeExperienceEntity resumeExperience){
        ValidatorUtils.validateEntity(resumeExperience);
        resumeExperienceService.updateById(resumeExperience);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumeexperience:delete")
    public R delete(@RequestBody Long[] ids){
        resumeExperienceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
