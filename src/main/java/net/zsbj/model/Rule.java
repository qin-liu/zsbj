package net.zsbj.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 知识对象
 */
@Data
@Entity
@Table(name = "tb_rule")
public class Rule implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY, generator="Mysql")
	@Column(name = "id")
	private Integer id;
	/**
	 * 类别id
	 */
	@Column(name = "rule_category_id")
	private Integer ruleCategoryId;
	/**
	 * 所属知识库id
	 */
	@Column(name = "rule_repository_id")
	private Integer ruleRepositoryId;
	/**
	 * 是否启用
	 */
	@Column(name = "is_valid")
	private String isValid;
	/**
	 * 版本号
	 */
	@Column(name = "version")
	private String version;

}
