package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Variables generated by hbm2java
 */
@Entity
@Table(name = "variables")
public class Variables implements java.io.Serializable {

	private int variableId;
	private CvUnits cvUnits;
	private String variableCode;
	private String variableName;
	private String sampleMedium;
	private String valueType;
	private String dataType;
	private String generalCategory;

	public Variables() {
	}

	public Variables(int variableId, CvUnits cvUnits, String variableCode,
			String variableName, String sampleMedium, String valueType,
			String dataType, String generalCategory) {
		this.variableId = variableId;
		this.cvUnits = cvUnits;
		this.variableCode = variableCode;
		this.variableName = variableName;
		this.sampleMedium = sampleMedium;
		this.valueType = valueType;
		this.dataType = dataType;
		this.generalCategory = generalCategory;
	}

	@Id
	@Column(name = "variable_id", unique = true, nullable = false)
	@SequenceGenerator(name="variables_variable_id_seq",sequenceName="variables_variable_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="variables_variable_id_seq")
	public int getVariableId() {
		return this.variableId;
	}

	public void setVariableId(int variableId) {
		this.variableId = variableId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "variable_units_id", nullable = false)
	public CvUnits getCvUnits() {
		return this.cvUnits;
	}

	public void setCvUnits(CvUnits cvUnits) {
		this.cvUnits = cvUnits;
	}

	@Column(name = "variable_code", nullable = false, length = 50)
	public String getVariableCode() {
		return this.variableCode;
	}

	public void setVariableCode(String variableCode) {
		this.variableCode = variableCode;
	}

	@Column(name = "variable_name", nullable = false)
	public String getVariableName() {
		return this.variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	@Column(name = "sample_medium", nullable = false)
	public String getSampleMedium() {
		return this.sampleMedium;
	}

	public void setSampleMedium(String sampleMedium) {
		this.sampleMedium = sampleMedium;
	}

	@Column(name = "value_type", nullable = false)
	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	@Column(name = "data_type", nullable = false)
	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Column(name = "general_category", nullable = false)
	public String getGeneralCategory() {
		return this.generalCategory;
	}

	public void setGeneralCategory(String generalCategory) {
		this.generalCategory = generalCategory;
	}

}
