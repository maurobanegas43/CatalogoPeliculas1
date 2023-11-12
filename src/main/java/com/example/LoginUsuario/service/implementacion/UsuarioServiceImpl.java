package com.example.LoginUsuario.service.implementacion;

import com.example.LoginUsuario.model.Usuario;
import com.example.LoginUsuario.repository.UsuarioRepository;
import com.example.LoginUsuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServiceImpl  implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> listAll() {

        return usuarioRepository.findAll();
    }

    @Override
    public Usuario listById(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario create(Usuario usuario) {
        return  usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById((id));

    }
}
