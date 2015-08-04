package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CvClassification generated by hbm2java
 */
@Entity
@Table(name = "cv_classification")
public class CvClassification implements java.io.Serializable {

	private int classificationId;
	private String identifier;
	private String terms;
	private Set<Sample> samples = new HashSet<Sample>(0);

	public CvClassification() {
	}

	public CvClassification(int classificationId, String identifier) {
		this.classificationId = classificationId;
		this.identifier = identifier;
	}

	public CvClassification(int classificationId, String identifier,
			String terms, Set<Sample> samples) {
		this.classificationId = classificationId;
		this.identifier = identifier;
		this.terms = terms;
		this.samples = samples;
	}

	@Id
	@Column(name = "classification_id", unique = true, nullable = false)
	public int getClassificationId() {
		return this.classificationId;
	}

	public void setClassificationId(int classificationId) {
		this.classificationId = classificationId;
	}

	@Column(name = "identifier", nullable = false, length = 100)
	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Column(name = "terms", length = 300)
	public String getTerms() {
		return this.terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cvClassification")
	public Set<Sample> getSamples() {
		return this.samples;
	}

	public void setSamples(Set<Sample> samples) {
		this.samples = samples;
	}

}
