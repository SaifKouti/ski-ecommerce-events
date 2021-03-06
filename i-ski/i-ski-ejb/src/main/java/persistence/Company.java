package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Company
 *
 */
@Entity

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@XmlElement
	private int idCompany;
	@XmlElement
	private String companyName;
	@XmlElement
	private String offreType;

	private static final long serialVersionUID = 1L;

	public Company() {
		super();
	}

	public Company(int idCompany, String companyName, String offreType) {
		super();
		this.idCompany = idCompany;
		this.companyName = companyName;
		this.offreType = offreType;

	}

	public Company(String companyName, String offreType) {

		this.companyName = companyName;
		this.offreType = offreType;
	}

	public int getIdCompany() {
		return this.idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOffreType() {
		return this.offreType;
	}

	public void setOffreType(String offreType) {
		this.offreType = offreType;
	}

	@Override
	public String toString() {
		return "The Name of the company" + companyName + ",and offre type is " + offreType;
	}

}
