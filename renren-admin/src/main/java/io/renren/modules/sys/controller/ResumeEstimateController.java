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

import io.renren.modules.sys.entity.ResumeEstimateEntity;
import io.renren.modules.sys.service.ResumeEstimateService;
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
@RequestMapping("sys/resumeestimate")
public class ResumeEstimateController {
    @Autowired
    private ResumeEstimateService resumeEstimateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumeestimate:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeEstimateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumeestimate:info")
    public R info(@PathVariable("id") Long id){
        ResumeEstimateEntity resumeEstimate = resumeEstimateService.getById(id);

        return R.ok().put("resumeEstimate", resumeEstimate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumeestimate:save")
    public R save(@RequestBody ResumeEstimateEntity resumeEstimate){
        resumeEstimateService.save(resumeEstimate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumeestimate:update")
    public R update(@RequestBody ResumeEstimateEntity resumeEstimate){
        ValidatorUtils.validateEntity(resumeEstimate);
        resumeEstimateService.updateById(resumeEstimate);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumeestimate:delete")
    public R delete(@RequestBody Long[] ids){
        resumeEstimateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
