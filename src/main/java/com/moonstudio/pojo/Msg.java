package com.moonstudio.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="msg")
@ApiModel("消息实体")
public class Msg implements Serializable {
    @Id
    @GeneratedValue
    @ApiModelProperty("消息id")
    @Column(name="id")
    public String id;
    @ApiModelProperty("年龄")
    @Column(name="age")
    public String age;
    @ApiModelProperty("短信内容")
    @Column(name="opinion")
    public String opinion;

    public Msg(String id, String age, String opinion) {
        this.id = id;
        this.age = age;
        this.opinion = opinion;
    }

    public Msg() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String remtwo) {
        this.opinion = opinion;
    }
}
