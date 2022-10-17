package com.demo.test;

public class GetterandSetter { 
	private String first_name, last_name, uname, password, email, type;
	
	
	
		public GetterandSetter() {
		super();
	}



		public GetterandSetter(String first_name, String last_name, String uname, String password, String email,
			String type) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.type = type;
	}


	
		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		 
}
