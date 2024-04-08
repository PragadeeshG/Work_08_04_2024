package com.test1;

public class CodeAnalysis {
	private Integer appCode;
	private Integer dependencyList;
	private String thirdPartySource;
	private String openSourceLib;
	private String vulnerabiities;
	private String dataFlow_Trace;
	private boolean taint_analysis;
	private String findBugsPlugin;
	private String comprehensiveRule;
	private String cloudDetection;
	private String securityHotspots;
	private String issuedescription;
	private String codeHighlights;
	private String fileSystem;

	public CodeAnalysis() {

	}

	public CodeAnalysis(Integer appCode, Integer dependencyList, String thirdPartySource, String openSourceLib,
			String vulnerabiities, String dataFlow_Trace, boolean taint_analysis, String findBugsPlugin,
			String comprehensiveRule, String cloudDetection, String securityHotspots, String issuedescription,
			String codeHighlights, String fileSystem) {
		super();
		this.appCode = appCode;
		this.dependencyList = dependencyList;
		this.thirdPartySource = thirdPartySource;
		this.openSourceLib = openSourceLib;
		this.vulnerabiities = vulnerabiities;
		this.dataFlow_Trace = dataFlow_Trace;
		this.taint_analysis = taint_analysis;
		this.findBugsPlugin = findBugsPlugin;
		this.comprehensiveRule = comprehensiveRule;
		this.cloudDetection = cloudDetection;
		this.securityHotspots = securityHotspots;
		this.issuedescription = issuedescription;
		this.codeHighlights = codeHighlights;
		this.fileSystem = fileSystem;
	}

	public Integer getAppCode() {
		return appCode;
	}

	public void setAppCode(Integer appCode) {
		this.appCode = appCode;
	}

	public Integer getDependencyList() {
		return dependencyList;
	}

	public void setDependencyList(Integer dependencyList) {
		this.dependencyList = dependencyList;
	}

	public String getThirdPartySource() {
		return thirdPartySource;
	}

	public void setThirdPartySource(String thirdPartySource) {
		this.thirdPartySource = thirdPartySource;
	}

	public String getOpenSourceLib() {
		return openSourceLib;
	}

	public void setOpenSourceLib(String openSourceLib) {
		this.openSourceLib = openSourceLib;
	}

	public String getVulnerabiities() {
		return vulnerabiities;
	}

	public void setVulnerabiities(String vulnerabiities) {
		this.vulnerabiities = vulnerabiities;
	}

	public String getDataFlow_Trace() {
		return dataFlow_Trace;
	}

	public void setDataFlow_Trace(String dataFlow_Trace) {
		this.dataFlow_Trace = dataFlow_Trace;
	}

	public boolean isTaint_analysis() {
		return taint_analysis;
	}

	public void setTaint_analysis(boolean taint_analysis) {
		this.taint_analysis = taint_analysis;
	}

	public String getFindBugsPlugin() {
		return findBugsPlugin;
	}

	public void setFindBugsPlugin(String findBugsPlugin) {
		this.findBugsPlugin = findBugsPlugin;
	}

	public String getComprehensiveRule() {
		return comprehensiveRule;
	}

	public void setComprehensiveRule(String comprehensiveRule) {
		this.comprehensiveRule = comprehensiveRule;
	}

	public String getCloudDetection() {
		return cloudDetection;
	}

	public void setCloudDetection(String cloudDetection) {
		this.cloudDetection = cloudDetection;
	}

	public String getSecurityHotspots() {
		return securityHotspots;
	}

	public void setSecurityHotspots(String securityHotspots) {
		this.securityHotspots = securityHotspots;
	}

	public String getIssuedescription() {
		return issuedescription;
	}

	public void setIssuedescription(String issuedescription) {
		this.issuedescription = issuedescription;
	}

	public String getCodeHighlights() {
		return codeHighlights;
	}

	public void setCodeHighlights(String codeHighlights) {
		this.codeHighlights = codeHighlights;
	}

	public String getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}

}
