package org.generation.LojaGames.service;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.LojaGames.model.Usuario;
import org.generation.LojaGames.model.UsuarioLogin;
import org.generation.LojaGames.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarUsuarios(){
		return repository.findAll();
	}
	
	public Optional<Usuario> cadastrarUsuario(Usuario usuario){
		if(repository.findByUsuario(usuario.getUsuario()).isPresent()) {
			return Optional.empty();
		}
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		
		return Optional.of(repository.save(usuario));	
	}
	
	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin){
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario= repository.findByUsuario(usuarioLogin.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {
			String auth=usuarioLogin.get().getUsuario()+ " : " + usuarioLogin.get().getSenha();
			byte[] encodeAuth= Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader="Basic " + new String(encodeAuth);
			
			usuarioLogin.get().setId(usuario.get().getId());
			usuarioLogin.get().setNome(usuario.get().getNome());
			usuarioLogin.get().setUsuario(usuario.get().getUsuario());
			usuarioLogin.get().setSenha(usuario.get().getSenha());
			usuarioLogin.get().setToken(authHeader);
			
			return usuarioLogin;
		}
	}
		return Optional.empty();
		
	}
}
