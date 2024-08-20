package br.com.fiap.apimycrypto.script;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScriptService {

    private final ScriptResource scriptResource;

    public ScriptService(ScriptResource scriptResource) {
        this.scriptResource = scriptResource;
    }

    public List<Script> findAll() {
        return scriptResource.findAll();
    };

    public Script create(Script script) {
        return scriptResource.save(script);
    }
}
