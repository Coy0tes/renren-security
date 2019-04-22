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

import io.renren.modules.sys.entity.ResumePersionalEntity;
import io.renren.modules.sys.service.ResumePersionalService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:07:31
 */
@RestController
@RequestMapping("sys/resumepersional")
public class ResumePersionalController {
    @Autowired
    private ResumePersionalService resumePersionalService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:resumepersional:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resumePersionalService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:resumepersional:info")
    public R info(@PathVariable("id") Long id){
        ResumePersionalEntity resumePersional = resumePersionalService.getById(id);

        return R.ok().put("resumePersional", resumePersional);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:resumepersional:save")
    public R save(@RequestBody ResumePersionalEntity resumePersional){
        resumePersionalService.save(resumePersional);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:resumepersional:update")
    public R update(@RequestBody ResumePersionalEntity resumePersional){
        ValidatorUtils.validateEntity(resumePersional);
        resumePersionalService.updateById(resumePersional);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:resumepersional:delete")
    public R delete(@RequestBody Long[] ids){
        resumePersionalService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
