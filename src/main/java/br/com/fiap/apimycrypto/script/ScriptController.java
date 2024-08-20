package br.com.fiap.apimycrypto.script;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("script")
public class ScriptController {

    private final ScriptResource scriptResource;

    public ScriptController(ScriptResource scriptResource) {
        this.scriptResource = scriptResource;
    }

    @GetMapping
    public List<Script> findAll() {
      return scriptResource.findAll();
    };

    @PostMapping
    public Script create(@RequestBody Script script) {
        return scriptResource.save(script);
    }
}
