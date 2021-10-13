package org.generation.LojaGames.seguranca;

import java.util.Optional;

import org.generation.LojaGames.model.Usuario;
import org.generation.LojaGames.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario= repository.findByUsuario(username);
		
		usuario.orElseThrow(()-> new UsernameNotFoundException(username+ "NOT FOUND"));
		
		return usuario.map(UsuarioDetailsImpl :: new).get();
	}

}
