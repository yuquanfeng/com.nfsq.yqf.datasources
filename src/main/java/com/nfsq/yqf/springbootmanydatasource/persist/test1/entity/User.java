package com.nfsq.yqf.springbootmanydatasource.persist.test1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:14:57
 **/
@Setter
@Getter
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private String password;
}
