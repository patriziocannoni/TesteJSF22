package br.com.cannoni.testejsf22.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserSessionMB implements Serializable {

	private static final long serialVersionUID = 3721957783771000407L;

	public String logout() {
		return "home";
	}
}
