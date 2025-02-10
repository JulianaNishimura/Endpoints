package com.senai.exemplo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Endpoint {

    public Usuario us1;

    @GetMapping("/hello")
    public String getInformations(){
        if(us1 == null){
            return "<h1>Usuário não encontrado</h1>";
        }
        return "<h1>Informações do Usuário:</h1>" + "<p>Nome: " + us1.getNome() + "</p>" + "<p>Email: " + us1.getEmail() + "</p>" + "<p>cpf: " + us1.getCpf() + "</p>" + "<p>Telefone: " + us1.getTelefone() + "</p>";
    }

    @PostMapping("/post")
    public String postInformations(@RequestBody Usuario usuario){
        us1 = usuario;
        return "<h1>Usuário criado com sucesso!</h1>";
    }

    // PUT /put
    @PutMapping("/put")
    public String putInformations(@RequestBody Usuario usuario) {
        if (us1 == null) {
            return "<h1>Usuário não encontrado para atualização!<h1>";
        }
        us1.setNome(usuario.getNome());
        us1.setEmail(usuario.getEmail());
        us1.setCpf(usuario.getCpf());
        us1.setTelefone(usuario.getTelefone());
        return "<h1>Usuário atualizado com sucesso!</h1>" +
                "<p>Nome: " + us1.getNome() + "</p>" +
                "<p>Email: " + us1.getEmail() + "</p>" +
                "<p>Cpf: " + us1.getCpf() + "</p>" +
                "<p>Telefone: " + us1.getTelefone() + "</p>";
    }

    // DELETE /delete
    @DeleteMapping("/delete")
    public String deleteInformations() {
        if (us1 == null) {
            return "<h1>Usuário não encontrado para exclusão!<h1>";
        }
        us1 = null;  // Exclui o usuário
        return "<h1>Usuário excluído com sucesso!</h1>";
    }

}
