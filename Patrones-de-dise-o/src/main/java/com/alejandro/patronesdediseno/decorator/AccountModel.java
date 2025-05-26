package com.alejandro.patronesdediseno.decorator;

public class AccountModel {
	
	private Integer id;
	private String client;
	
	
	public AccountModel(Integer id, String client) {
		super();
		this.id = id;
		this.client = client;
	}
	
	public AccountModel() {}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "AccountModel [id=" + id + ", client=" + client + "]";
	}

}
