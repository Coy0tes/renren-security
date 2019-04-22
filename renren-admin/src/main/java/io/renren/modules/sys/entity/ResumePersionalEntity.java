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
 * @date 2019-04-22 17:07:31
 */
@Data
@TableName("resume_persional")
public class ResumePersionalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 电话
	 */
	private String mobile;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 户籍
	 */
	private String oldAddress;
	/**
	 * 现住址
	 */
	private String address;
	/**
	 * 相关经验年限
	 */
	private String leave;

}
