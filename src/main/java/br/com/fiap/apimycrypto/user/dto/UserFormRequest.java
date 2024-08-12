package br.com.fiap.apimycrypto.user.dto;

import br.com.fiap.apimycrypto.user.User;

import java.time.LocalDateTime;

public record UserFormRequest(
        String email,
        String password
) {

    public User toModel() {
        return User.builder()
                .email(email)
                .password(password)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
