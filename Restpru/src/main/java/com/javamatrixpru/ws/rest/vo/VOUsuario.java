package com.javamatrixpru.ws.rest.vo;

public class VOUsuario {
	private int     Nuser;
	private String  Nombres;
	private String  Apellidos;
	private String	Email;
	private String  Numtel;
	private String  Ciudad;
	private String  País;
	private String  Password;
	private boolean UserValido;
	
	public boolean isUserValido() {
		return UserValido;
	}
	public void setUserValido(boolean userValido) {
		UserValido = userValido;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getNuser() {
		return Nuser;
	}
	public void setNuser(int nuser) {
		Nuser = nuser;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNumtel() {
		return Numtel;
	}
	public void setNumtel(String numtel) {
		Numtel = numtel;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getPaís() {
		return País;
	}
	public void setPaís(String país) {
		País = país;
	}
	
	
}
