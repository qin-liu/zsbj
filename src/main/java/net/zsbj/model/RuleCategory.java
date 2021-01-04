package net.zsbj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 知识类别
 */
@Data
@Entity
@Table(name = "tb_rule_category")
public class RuleCategory implements Serializable {
    /**
     * 唯一id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="Mysql")
    @Column(name = "id")
    private Integer id;

    /**
     * 知识类别名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 知识类别说明
     */
    @Column(name = "description")
    private String description;

    /**
     * 所属知识库id
     */
    @Column(name = "rule_repository_id")
    private Integer ruleRepositoryId;
}
