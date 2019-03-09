package com.msi.model;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {

	private static final long serialVersionUID = 1L;

	public CustomUser(UserModel userModel) {
		super(userModel.getUserName(), userModel.getPassword(), userModel.getGrantedAuthoritiesList());
	}
}