package com.example.demo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 角色权限关联表
 * </p>
 *
 * @author lkw
 * @since 2021-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRolePrivilege extends Model<SysRolePrivilege> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long privilegeId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
