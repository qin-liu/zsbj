package net.zsbj.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 故障
 */
@Data
@Entity
@Table(name = "tb_fault")
public class Fault {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="Mysql")
    @Column(name = "id")
    private Integer id;
    /**
     * 名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 故障代码
     */
    @Column(name = "code")
    private String code;
    /**
     * 故障类别
     */
    @Column(name = "fault_category")
    private String faultCategory;
    /**
     * 故障等级
     */
    @Column(name = "fault_level")
    private Integer faultLevel;
    /**
     * 故障说明
     */
    @Column(name = "description")
    private String description;
}
