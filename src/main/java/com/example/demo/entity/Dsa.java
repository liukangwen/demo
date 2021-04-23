package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lkw
 * @since 2021-04-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Dsa extends Model<Dsa> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String dsa;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
