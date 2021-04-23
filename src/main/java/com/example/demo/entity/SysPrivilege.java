package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author lkw
 * @since 2021-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysPrivilege extends Model<SysPrivilege> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名称
     */
    private String privilegeName;

    /**
     * 权限url
     */
    private String privilegeUrl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
