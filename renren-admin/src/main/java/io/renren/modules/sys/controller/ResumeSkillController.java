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

import io.renren.modules.sys.entity.ResumeSkillEntity;
import io.renren.modules.sys.service.ResumeSkillService;
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
@RequestMapping("sys/resumeskill")
public class ResumeSkillController {
    @Autowired
    private ResumeSkillService resumeSkillService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumeskill:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumeSkillService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumeskill:info")
    public R info(@PathVariable("id") Long id){
        ResumeSkillEntity resumeSkill = resumeSkillService.getById(id);

        return R.ok().put("resumeSkill", resumeSkill);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumeskill:save")
    public R save(@RequestBody ResumeSkillEntity resumeSkill){
        resumeSkillService.save(resumeSkill);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumeskill:update")
    public R update(@RequestBody ResumeSkillEntity resumeSkill){
        ValidatorUtils.validateEntity(resumeSkill);
        resumeSkillService.updateById(resumeSkill);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumeskill:delete")
    public R delete(@RequestBody Long[] ids){
        resumeSkillService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
