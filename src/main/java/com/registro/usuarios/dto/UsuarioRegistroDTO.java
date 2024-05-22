package com.registro.usuarios.dto;

public class UsuarioRegistroDTO {

	private Long id;

	private String nombre;

	private String apellido;
	
	private String username;

	private String email;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioRegistroDTO(Long id, String nombre, String apellido, String email, String password, String username) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public UsuarioRegistroDTO(String nombre, String apellido, String email, String password, String username) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
	}

	public UsuarioRegistroDTO() {
		super();

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
}
