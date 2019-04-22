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
@TableName("resume_training")
public class ResumeTrainingEntity implements Serializable {
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
	 * 机构名
	 */
	private String name;
	/**
	 * 学历
	 */
	private String degree;
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
