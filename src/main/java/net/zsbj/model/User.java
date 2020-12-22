package net.zsbj.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
/**
 * 用户类
 */
public class User {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "name")
    private String name;


    /**
     * 用户密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户密码
     */
    @Column(name = "description")
    private String description;
}
