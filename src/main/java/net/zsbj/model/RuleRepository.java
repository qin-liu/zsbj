package net.zsbj.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 知识库
 */
@Entity
@Table(name = "tb_rule_repository")
public class RuleRepository {

    /**
     * 唯一id
     */
    private int id;

    /**
     * 知识库名称
     */
    private String name;

    /**
     * 知识库说明
     */
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
