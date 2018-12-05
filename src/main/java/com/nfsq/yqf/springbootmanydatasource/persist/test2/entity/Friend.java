package com.nfsq.yqf.springbootmanydatasource.persist.test2.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:00
 **/
@Getter
@Setter
public class Friend implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String friendName;
    private String password;
}
