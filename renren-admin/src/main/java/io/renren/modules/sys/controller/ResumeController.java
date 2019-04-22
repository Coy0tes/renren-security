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

import io.renren.modules.sys.entity.ResumeEntity;
import io.renren.modules.sys.service.ResumeService;
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
@RequestMapping("sys/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resume:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resume:info")
    public R info(@PathVariable("id") Long id){
        ResumeEntity resume = resumeService.getById(id);

        return R.ok().put("resume", resume);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resume:save")
    public R save(@RequestBody ResumeEntity resume){
        resumeService.save(resume);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resume:update")
    public R update(@RequestBody ResumeEntity resume){
        ValidatorUtils.validateEntity(resume);
        resumeService.updateById(resume);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resume:delete")
    public R delete(@RequestBody Long[] ids){
        resumeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
