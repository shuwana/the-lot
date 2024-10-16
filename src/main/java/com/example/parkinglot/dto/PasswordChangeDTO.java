package com.example.parkinglot.dto;

import java.io.Serializable;

/**
 * A DTO representing a password change required data - current and new password.
 */
public record PasswordChangeDTO(String currentPassword, String newPassword) implements Serializable {
    private static final long serialVersionUID = 1L;
}
