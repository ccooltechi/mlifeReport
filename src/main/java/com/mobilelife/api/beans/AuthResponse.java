package com.mobilelife.api.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "auth")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthResponse {
	
    @XmlElement
    private ErrorReposne error;
    @XmlAttribute
	private String authtoken ;


	/**
	 * @return the authtoken
	 */
	public String getAuthtoken() {
		return authtoken;
	}

	/**
	 * @param authtoken the authtoken to set
	 */
	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}

	/**
	 * @return the error
	 */
	public ErrorReposne getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(ErrorReposne error) {
		this.error = error;
	}

    
}
