
package com.molaimat.jsf;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProjectBean {

	private String name1;
	private String name2;
	
	public ProjectBean() {
		super();
		setName1("Mohammad");
		setName2("Al-Olaimat");
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}
	
}
