package com.admin.springbootadmin.model.network.response;

import com.admin.springbootadmin.model.enumClass.AdminUserRole;
import com.admin.springbootadmin.model.enumClass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminUserApiResponse {

    private Long id;

    private String account;

    private String password;

    private UserStatus status;

    private AdminUserRole role;

    private LocalDateTime lastLoginAt;

    private LocalDateTime passwordUpdatedAt;

    private int loginFailCount;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;
}
