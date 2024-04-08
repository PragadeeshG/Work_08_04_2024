package com.test1;

public class SonarCheck {
	private String sonarQube;
	private String codeQuality;
	private String languages;
	private String platforms;
	private String devOpsIntegration;
	private String qualityGate;
	private String highOperabliity;
	private Integer fastAnalysis;
	private String rules;
	private String ideIntegration;
	private String sharedConfig;

	public SonarCheck() {

	}

	public SonarCheck(String sonarQube, String codeQuality, String languages, String platforms,
			String devOpsIntegration, String qualityGate, String highOperabliity, Integer fastAnalysis, String rules,
			String ideIntegration, String sharedConfig) {
		super();
		this.sonarQube = sonarQube;
		this.codeQuality = codeQuality;
		this.languages = languages;
		this.platforms = platforms;
		this.devOpsIntegration = devOpsIntegration;
		this.qualityGate = qualityGate;
		this.highOperabliity = highOperabliity;
		this.fastAnalysis = fastAnalysis;
		this.rules = rules;
		this.ideIntegration = ideIntegration;
		this.sharedConfig = sharedConfig;
	}

	public String getSonarQube() {
		return sonarQube;
	}

	public void setSonarQube(String sonarQube) {
		this.sonarQube = sonarQube;
	}

	public String getCodeQuality() {
		return codeQuality;
	}

	public void setCodeQuality(String codeQuality) {
		this.codeQuality = codeQuality;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getDevOpsIntegration() {
		return devOpsIntegration;
	}

	public void setDevOpsIntegration(String devOpsIntegration) {
		this.devOpsIntegration = devOpsIntegration;
	}

	public String getQualityGate() {
		return qualityGate;
	}

	public void setQualityGate(String qualityGate) {
		this.qualityGate = qualityGate;
	}

	public String getHighOperabliity() {
		return highOperabliity;
	}

	public void setHighOperabliity(String highOperabliity) {
		this.highOperabliity = highOperabliity;
	}

	public Integer getFastAnalysis() {
		return fastAnalysis;
	}

	public void setFastAnalysis(Integer fastAnalysis) {
		this.fastAnalysis = fastAnalysis;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getIdeIntegration() {
		return ideIntegration;
	}

	public void setIdeIntegration(String ideIntegration) {
		this.ideIntegration = ideIntegration;
	}

	public String getSharedConfig() {
		return sharedConfig;
	}

	public void setSharedConfig(String sharedConfig) {
		this.sharedConfig = sharedConfig;
	}

}
