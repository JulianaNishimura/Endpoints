package com.senai.exemplo.view;

import com.senai.exemplo.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class Endpoint {

    public Usuario us1;

    // GET /hello
    @GetMapping("/usuario")
    public String getInformations(){
        if (us1 == null) {
            return "Nenhum usuário Cadastrado";  // Retorna null, pois não encontramos o usuário
        }
        return us1.toString();  // Retorna o objeto Usuario
    }

    // POST /post
    @PostMapping("/usuario")
    public String postInformations(@RequestBody Usuario usuario){
        us1 = usuario;  // Cria o usuário
        return "Usuário Cadastrado! " + us1.toString();  // Retorna o usuário criado
    }

    // PUT /put
    @PutMapping("/usuario")
    public String putInformations(@RequestBody Usuario usuario) {
        if (us1 == null) {
            return null;  // Retorna null se o usuário não existir
        }
        us1.setNome(usuario.getNome());
        us1.setEmail(usuario.getEmail());
        us1.setCpf(usuario.getCpf());
        us1.setTelefone(usuario.getTelefone());
        return us1.toString();  // Retorna o usuário atualizado
    }

    // DELETE /delete
    @DeleteMapping("/usuario")
    public String deleteInformations() {
        if (us1 == null) {
            return "O usuário não foi encontrado...";  // Retorna null se o usuário não existir para exclusão
        }
        us1 = null;  // Exclui o usuário
        return "O usuário foi excluído com sucesso!";  // Retorna null indicando que o usuário foi excluído
    }

}
