package com.senai.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Login {
	
	static User user = new User(null, null);
	
	static List<User> usersList = new ArrayList<>();
	
//	Banco de dados de Credenciais do usuario
	public void setUserInList(User user) {
		usersList.add(user);
	}
	
	
//	Metodo de verificação de credenciais
	public User loginVerify(String username, String senha) {
	    for(User a : usersList) {
	        if(senha.equals(a.getSenha()) && username.equals(a.getUser())) {
	            return a;
	        }
	    }
	    return null;
	}

	
//	Metodo para ver Usuarios cadastrados
	public void viewUsers() {
		for(User a : usersList) {
			System.out.print(a.getUser() + " - " + a.getSenha());
		}
	}
}
