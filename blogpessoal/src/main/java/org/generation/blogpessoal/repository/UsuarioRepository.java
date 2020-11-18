package org.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	public Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha);

	public Optional<Usuario> findByUsuario(String usuario);
}