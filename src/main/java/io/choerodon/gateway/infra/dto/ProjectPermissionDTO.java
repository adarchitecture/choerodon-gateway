package io.choerodon.gateway.infra.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

import io.choerodon.mybatis.domain.AuditDomain;

/**
 * @author scp
 * @date 2020/4/16
 * @description
 */
@Table(name = "fd_project_permission")
public class ProjectPermissionDTO extends AuditDomain {
    @Id
    private Long id;
    @ApiModelProperty("用户id")
    private Long memberId;
    @ApiModelProperty("项目id")
    private Long projectId;
    @ApiModelProperty("角色id")
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
