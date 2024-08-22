package br.com.fiap.apimycrypto.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Token login (@RequestBody Credentials credentials) {
        return authService.login(credentials);
    }
}
