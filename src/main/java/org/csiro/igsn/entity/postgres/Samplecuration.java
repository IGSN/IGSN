package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Samplecuration generated by hbm2java
 */
@Entity
@Table(name = "samplecuration")
public class Samplecuration implements java.io.Serializable {

	private int sampleCurationId;
	private Sample sample;
	private String curationLocation;
	private String curator;
	private Date curationStart;
	private Date curationEnd;
	private String comments;

	public Samplecuration() {
	}

	public Samplecuration(int sampleCurationId, Sample sample) {
		this.sampleCurationId = sampleCurationId;
		this.sample = sample;
	}

	public Samplecuration(int sampleCurationId, Sample sample,
			String curationLocation, String curator, Date curationStart,
			Date curationEnd, String comments) {
		this.sampleCurationId = sampleCurationId;
		this.sample = sample;
		this.curationLocation = curationLocation;
		this.curator = curator;
		this.curationStart = curationStart;
		this.curationEnd = curationEnd;
		this.comments = comments;
	}

	@Id
	@Column(name = "sample_curation_id", unique = true, nullable = false)
	public int getSampleCurationId() {
		return this.sampleCurationId;
	}

	public void setSampleCurationId(int sampleCurationId) {
		this.sampleCurationId = sampleCurationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sample_id", nullable = false)
	public Sample getSample() {
		return this.sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

	@Column(name = "curation_location")
	public String getCurationLocation() {
		return this.curationLocation;
	}

	public void setCurationLocation(String curationLocation) {
		this.curationLocation = curationLocation;
	}

	@Column(name = "curator")
	public String getCurator() {
		return this.curator;
	}

	public void setCurator(String curator) {
		this.curator = curator;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "curation_start", length = 29)
	public Date getCurationStart() {
		return this.curationStart;
	}

	public void setCurationStart(Date curationStart) {
		this.curationStart = curationStart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "curation_end", length = 29)
	public Date getCurationEnd() {
		return this.curationEnd;
	}

	public void setCurationEnd(Date curationEnd) {
		this.curationEnd = curationEnd;
	}

	@Column(name = "comments")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
