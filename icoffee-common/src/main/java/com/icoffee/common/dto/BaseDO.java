package com.icoffee.common.dto;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

/**
 * @Name BaseDO
 * @Description 实体类基类
 * @Author chenly
 * @Create 2019-11-29 16:39
 */
@MappedSuperclass
@Data
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    private String id = UUID.randomUUID().toString().replace("-","");
}