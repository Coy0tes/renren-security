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

import io.renren.modules.sys.entity.ResumeTrainingEntity;
import io.renren.modules.sys.service.ResumeTrainingService;
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
@RequestMapping("sys/resumetraining")
public class ResumeTrainingController {
    @Autowired
    private ResumeTrainingService resumeTrainingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumetraining:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeTrainingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumetraining:info")
    public R info(@PathVariable("id") Long id){
        ResumeTrainingEntity resumeTraining = resumeTrainingService.getById(id);

        return R.ok().put("resumeTraining", resumeTraining);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumetraining:save")
    public R save(@RequestBody ResumeTrainingEntity resumeTraining){
        resumeTrainingService.save(resumeTraining);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumetraining:update")
    public R update(@RequestBody ResumeTrainingEntity resumeTraining){
        ValidatorUtils.validateEntity(resumeTraining);
        resumeTrainingService.updateById(resumeTraining);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumetraining:delete")
    public R delete(@RequestBody Long[] ids){
        resumeTrainingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
