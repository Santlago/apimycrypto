package br.com.fiap.apimycrypto.user;

import br.com.fiap.apimycrypto.user.dto.UserFormRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService service;
    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserFormRequest userForm, UriComponentsBuilder uriBuilder) {
        var user = service.created(userForm.toModel());
        var uri = uriBuilder
                .path("/users/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity
                .created(uri)
                .body(user);
    }
}
