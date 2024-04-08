package com.test1;

public class Categories {
	private Integer injectionCode;
	private String brokenAuthentication;
	private String sensitiveDataExposure;
	private String xmlExternalEntities;
	private String brokenAccessControl;
	private Integer security_misconfiguration;
	private String crossSiteScripting;
	private String insecureCode;
	private String deserialization;
	private Integer componentCount;
	private String knownVulnerabilities;
	private String findbugsCount;
	private String summary;

	public Categories() {

	}

	public Categories(Integer injectionCode, String brokenAuthentication, String sensitiveDataExposure,
			String xmlExternalEntities, String brokenAccessControl, Integer security_misconfiguration,
			String crossSiteScripting, String insecureCode, String deserialization, Integer componentCount,
			String knownVulnerabilities, String findbugsCount, String summary) {
		super();
		this.injectionCode = injectionCode;
		this.brokenAuthentication = brokenAuthentication;
		this.sensitiveDataExposure = sensitiveDataExposure;
		this.xmlExternalEntities = xmlExternalEntities;
		this.brokenAccessControl = brokenAccessControl;
		this.security_misconfiguration = security_misconfiguration;
		this.crossSiteScripting = crossSiteScripting;
		this.insecureCode = insecureCode;
		this.deserialization = deserialization;
		this.componentCount = componentCount;
		this.knownVulnerabilities = knownVulnerabilities;
		this.findbugsCount = findbugsCount;
		this.summary = summary;
	}

	public Integer getInjectionCode() {
		return injectionCode;
	}

	public void setInjectionCode(Integer injectionCode) {
		this.injectionCode = injectionCode;
	}

	public String getBrokenAuthentication() {
		return brokenAuthentication;
	}

	public void setBrokenAuthentication(String brokenAuthentication) {
		this.brokenAuthentication = brokenAuthentication;
	}

	public String getSensitiveDataExposure() {
		return sensitiveDataExposure;
	}

	public void setSensitiveDataExposure(String sensitiveDataExposure) {
		this.sensitiveDataExposure = sensitiveDataExposure;
	}

	public String getXmlExternalEntities() {
		return xmlExternalEntities;
	}

	public void setXmlExternalEntities(String xmlExternalEntities) {
		this.xmlExternalEntities = xmlExternalEntities;
	}

	public String getBrokenAccessControl() {
		return brokenAccessControl;
	}

	public void setBrokenAccessControl(String brokenAccessControl) {
		this.brokenAccessControl = brokenAccessControl;
	}

	public Integer getSecurity_misconfiguration() {
		return security_misconfiguration;
	}

	public void setSecurity_misconfiguration(Integer security_misconfiguration) {
		this.security_misconfiguration = security_misconfiguration;
	}

	public String getCrossSiteScripting() {
		return crossSiteScripting;
	}

	public void setCrossSiteScripting(String crossSiteScripting) {
		this.crossSiteScripting = crossSiteScripting;
	}

	public String getInsecureCode() {
		return insecureCode;
	}

	public void setInsecureCode(String insecureCode) {
		this.insecureCode = insecureCode;
	}

	public String getDeserialization() {
		return deserialization;
	}

	public void setDeserialization(String deserialization) {
		this.deserialization = deserialization;
	}

	public Integer getComponentCount() {
		return componentCount;
	}

	public void setComponentCount(Integer componentCount) {
		this.componentCount = componentCount;
	}

	public String getKnownVulnerabilities() {
		return knownVulnerabilities;
	}

	public void setKnownVulnerabilities(String knownVulnerabilities) {
		this.knownVulnerabilities = knownVulnerabilities;
	}

	public String getFindbugsCount() {
		return findbugsCount;
	}

	public void setFindbugsCount(String findbugsCount) {
		this.findbugsCount = findbugsCount;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
