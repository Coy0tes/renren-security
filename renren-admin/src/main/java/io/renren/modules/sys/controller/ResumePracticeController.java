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

import io.renren.modules.sys.entity.ResumePracticeEntity;
import io.renren.modules.sys.service.ResumePracticeService;
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
@RequestMapping("sys/resumepractice")
public class ResumePracticeController {
    @Autowired
    private ResumePracticeService resumePracticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumepractice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumePracticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumepractice:info")
    public R info(@PathVariable("id") Long id){
        ResumePracticeEntity resumePractice = resumePracticeService.getById(id);

        return R.ok().put("resumePractice", resumePractice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumepractice:save")
    public R save(@RequestBody ResumePracticeEntity resumePractice){
        resumePracticeService.save(resumePractice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumepractice:update")
    public R update(@RequestBody ResumePracticeEntity resumePractice){
        ValidatorUtils.validateEntity(resumePractice);
        resumePracticeService.updateById(resumePractice);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumepractice:delete")
    public R delete(@RequestBody Long[] ids){
        resumePracticeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
