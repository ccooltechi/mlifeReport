package com.mobilelife.api.beans.operator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Operator")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operator {

    @XmlAttribute
	 private String operator_id ;
	    @XmlAttribute
	 private String operator_name ;
	    @XmlAttribute
	 private String operator_country ;
		/**
		 * @return the operator_id
		 */
		public String getOperator_id() {
			return operator_id;
		}
		/**
		 * @param operator_id the operator_id to set
		 */
		public void setOperator_id(String operator_id) {
			this.operator_id = operator_id;
		}
		/**
		 * @return the operator_name
		 */
		public String getOperator_name() {
			return operator_name;
		}
		/**
		 * @param operator_name the operator_name to set
		 */
		public void setOperator_name(String operator_name) {
			this.operator_name = operator_name;
		}
		/**
		 * @return the operator_country
		 */
		public String getOperator_country() {
			return operator_country;
		}
		/**
		 * @param operator_country the operator_country to set
		 */
		public void setOperator_country(String operator_country) {
			this.operator_country = operator_country;
		}

}
