package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RasterOverviews generated by hbm2java
 */
@Entity
@Table(name = "raster_overviews")
public class RasterOverviews implements java.io.Serializable {

	private RasterOverviewsId id;

	public RasterOverviews() {
	}

	public RasterOverviews(RasterOverviewsId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "OTableCatalog", column = @Column(name = "o_table_catalog")),
			@AttributeOverride(name = "OTableSchema", column = @Column(name = "o_table_schema")),
			@AttributeOverride(name = "OTableName", column = @Column(name = "o_table_name")),
			@AttributeOverride(name = "ORasterColumn", column = @Column(name = "o_raster_column")),
			@AttributeOverride(name = "RTableCatalog", column = @Column(name = "r_table_catalog")),
			@AttributeOverride(name = "RTableSchema", column = @Column(name = "r_table_schema")),
			@AttributeOverride(name = "RTableName", column = @Column(name = "r_table_name")),
			@AttributeOverride(name = "RRasterColumn", column = @Column(name = "r_raster_column")),
			@AttributeOverride(name = "overviewFactor", column = @Column(name = "overview_factor")) })
	public RasterOverviewsId getId() {
		return this.id;
	}

	public void setId(RasterOverviewsId id) {
		this.id = id;
	}

}