package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-22 17:01:42
 */
@Data
@TableName("resume")
public class ResumeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 简历名
	 */
	private String name;
	/**
	 * 创建时间
	 */
	private Date createdat;
	/**
	 * 创建人
	 */
	private String createdby;
	/**
	 * 更新时间
	 */
	private Date updateat;
	/**
	 * 更新人
	 */
	private String updateby;
	/**
	 * 个人信息
	 */
	private Long persionalId;
	/**
	 * 技能
	 */
	private Long skillId;
	/**
	 * 工作经验
	 */
	private Long experienceId;
	/**
	 * 实习经历
	 */
	private Long practiceId;
	/**
	 * 教育背景
	 */
	private Long educationId;
	/**
	 * 有无培训
	 */
	private Long trainingId;
	/**
	 * 自我评价
	 */
	private Long estimateId;

}
