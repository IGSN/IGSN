package org.csiro.igsn.entity.postgres;

// Generated 04/08/2015 2:17:37 PM by Hibernate Tools 4.3.1

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.PrecisionModel;
import com.vividsolutions.jts.io.WKTReader;

/**
 * Sites generated by hbm2java
 */
@Entity
@Table(name = "sites")
public class Sites implements java.io.Serializable {

	private int siteId;
	private String siteCode;
	private String siteName;
	private double lat;
	private double lon;
	private int latlonDatumId;
	private Integer siteType;
	private Double elevation;
	private Integer elevationUnit;
	private Integer verticalDatum;
	private Double localX;
	private Double localY;
	private Integer localProjectionId;
	private String state;
	private String county;
	private String comments;
	private Polygon boundingBox;

	public Sites() {
	}

	public Sites(String siteCode, String siteName, double lat,
			double lon, int latlonDatumId) {		
		this.siteCode = siteCode;
		this.siteName = siteName;
		this.lat = lat;
		this.lon = lon;
		this.latlonDatumId = latlonDatumId;
	}

	public Sites(String siteCode, String siteName, double lat,
			double lon, int latlonDatumId, Integer siteType, Double elevation,
			Integer elevationUnit, Integer verticalDatum, Double localX,
			Double localY, Integer localProjectionId, String state,
			String county, String comments, Polygon boundingBox) {		
		this.siteCode = siteCode;
		this.siteName = siteName;
		this.lat = lat;
		this.lon = lon;
		this.latlonDatumId = latlonDatumId;
		this.siteType = siteType;
		this.elevation = elevation;
		this.elevationUnit = elevationUnit;
		this.verticalDatum = verticalDatum;
		this.localX = localX;
		this.localY = localY;
		this.localProjectionId = localProjectionId;
		this.state = state;
		this.county = county;
		this.comments = comments;
		this.boundingBox = boundingBox;
	}

	@Id
	@Column(name = "site_id", unique = true, nullable = false)
	@SequenceGenerator(name="sites_site_id_seq",sequenceName="sites_site_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sites_site_id_seq")
	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	@Column(name = "site_code", nullable = false, length = 80)
	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	@Column(name = "site_name", nullable = false)
	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Column(name = "lat", nullable = false, precision = 17, scale = 17)
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	@Column(name = "lon", nullable = false, precision = 17, scale = 17)
	public double getLon() {
		return this.lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	@Column(name = "latlon_datum_id", nullable = false)
	public int getLatlonDatumId() {
		return this.latlonDatumId;
	}

	public void setLatlonDatumId(int latlonDatumId) {
		this.latlonDatumId = latlonDatumId;
	}

	@Column(name = "site_type")
	public Integer getSiteType() {
		return this.siteType;
	}

	public void setSiteType(Integer siteType) {
		this.siteType = siteType;
	}

	@Column(name = "elevation", precision = 17, scale = 17)
	public Double getElevation() {
		return this.elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	@Column(name = "elevation_unit")
	public Integer getElevationUnit() {
		return this.elevationUnit;
	}

	public void setElevationUnit(Integer elevationUnit) {
		this.elevationUnit = elevationUnit;
	}

	@Column(name = "vertical_datum")
	public Integer getVerticalDatum() {
		return this.verticalDatum;
	}

	public void setVerticalDatum(Integer verticalDatum) {
		this.verticalDatum = verticalDatum;
	}

	@Column(name = "local_x", precision = 17, scale = 17)
	public Double getLocalX() {
		return this.localX;
	}

	public void setLocalX(Double localX) {
		this.localX = localX;
	}

	@Column(name = "local_y", precision = 17, scale = 17)
	public Double getLocalY() {
		return this.localY;
	}

	public void setLocalY(Double localY) {
		this.localY = localY;
	}

	@Column(name = "local_projection_id")
	public Integer getLocalProjectionId() {
		return this.localProjectionId;
	}

	public void setLocalProjectionId(Integer localProjectionId) {
		this.localProjectionId = localProjectionId;
	}

	@Column(name = "state")
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "county")
	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Column(name = "comments")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "bounding_box")
	@Type(type="org.hibernate.spatial.GeometryType")
	public Polygon getBoundingBox() {
		return this.boundingBox;
	}

	public void setBoundingBox(Polygon boundingBox) {
		this.boundingBox = boundingBox;
	}
	
	
	private static Geometry wktToGeometry(String wktPoint) {
        WKTReader fromText = new WKTReader(new GeometryFactory(new PrecisionModel(),4326));
        Geometry geom = null;
        try {
            geom = fromText.read(wktPoint);
        } catch (Exception e) {
            throw new RuntimeException("Not a WKT string:" + wktPoint);
        }
        return geom;
    }
	
	
	public static void main(String [] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.hibernate.igsn.jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Sites sf = new Sites("siteCode", "siteName", 2.00,2.00, 4326);
		Geometry geom = wktToGeometry("POLYGON((0 0,4 0,4 4,0 4,0 0))");
				
		sf.setBoundingBox((Polygon) geom);
		
		
		em.persist(sf);
        em.getTransaction().commit();
        em.close();
	}

}
