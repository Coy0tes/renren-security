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
@TableName("resume_experience")
public class ResumeExperienceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 公司
	 */
	private Long companyId;
	/**
	 * 职位
	 */
	private String post;
	/**
	 * 开发环境
	 */
	private String environment;
	/**
	 * 开发技术
	 */
	private String skill;
	/**
	 * 工作职责
	 */
	private String myResponsibility;
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

}
