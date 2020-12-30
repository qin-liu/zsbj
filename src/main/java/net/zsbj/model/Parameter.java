package net.zsbj.model;

import lombok.Data;

import javax.persistence.*;

/**
 * 知识图参数
 */
@Data
@Entity
@Table(name = "tb_parameter")
public class Parameter {
    /**
     * 唯一id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="Mysql")
    @Column(name = "id")
    private Integer id;

    /**
     * 参数名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 参数说明
     */
    @Column(name = "description")
    private String description;

    /**
     * 度量单位
     */
    @Column(name = "unit_measure")
    private String unitMeasure;

    /**
     * 数据类型
     */
    @Column(name = "data_type")
    private String dataType;

    /**
     * 参数代号
     */
    @Column(name = "symbol")
    private String symbol;
}
