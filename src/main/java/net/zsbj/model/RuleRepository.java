package net.zsbj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 知识库
 */
@Data
@Entity
@Table(name = "tb_rule_repository")
public class RuleRepository implements Serializable {

    /**
     * 唯一id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="Mysql")
    @Column(name = "id")
    private Integer id;

    /**
     * 知识 库                                  名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 知识库说明
     */
    @Column(name = "description")
    private String description;

}
