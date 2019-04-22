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

import io.renren.modules.sys.entity.ResumeEducationEntity;
import io.renren.modules.sys.service.ResumeEducationService;
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
@RequestMapping("sys/resumeeducation")
public class ResumeEducationController {
    @Autowired
    private ResumeEducationService resumeEducationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumeeducation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeEducationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumeeducation:info")
    public R info(@PathVariable("id") Long id){
        ResumeEducationEntity resumeEducation = resumeEducationService.getById(id);

        return R.ok().put("resumeEducation", resumeEducation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumeeducation:save")
    public R save(@RequestBody ResumeEducationEntity resumeEducation){
        resumeEducationService.save(resumeEducation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumeeducation:update")
    public R update(@RequestBody ResumeEducationEntity resumeEducation){
        ValidatorUtils.validateEntity(resumeEducation);
        resumeEducationService.updateById(resumeEducation);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumeeducation:delete")
    public R delete(@RequestBody Long[] ids){
        resumeEducationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
