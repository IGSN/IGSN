package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SampleFeaturesMapping generated by hbm2java
 */
@Entity
@Table(name = "sample_features_mapping")
public class SampleFeaturesMapping implements java.io.Serializable {

	private int objectId;
	private CvSamplingfeature cvSamplingfeature;
	private Sample sample;

	public SampleFeaturesMapping() {
	}

	public SampleFeaturesMapping(int objectId,
			CvSamplingfeature cvSamplingfeature, Sample sample) {
		this.objectId = objectId;
		this.cvSamplingfeature = cvSamplingfeature;
		this.sample = sample;
	}

	@Id
	@Column(name = "object_id", unique = true, nullable = false)
	public int getObjectId() {
		return this.objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feature_id", nullable = false)
	public CvSamplingfeature getCvSamplingfeature() {
		return this.cvSamplingfeature;
	}

	public void setCvSamplingfeature(CvSamplingfeature cvSamplingfeature) {
		this.cvSamplingfeature = cvSamplingfeature;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sample_id", nullable = false)
	public Sample getSample() {
		return this.sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

}
