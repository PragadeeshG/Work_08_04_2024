package com.test1;

public class IntegrationToDeployment {
	private Integer pipelineId;
	private String buildTemplate;
	private boolean sonarStepsAdded;
	private Integer coverage_measure;
	private String nexusBuild;
	private String wasScan;
	private Integer nexusIssues;
	private Integer sonar_issues;
	private String securitySummary;
	private Integer findbugsIssues;
	private String gitleaksReport;
	private String remarks;

	public IntegrationToDeployment() {

	}

	public IntegrationToDeployment(Integer pipelineId, String buildTemplate, boolean sonarStepsAdded,
			Integer coverage_measure, String nexusBuild, String wasScan, Integer nexusIssues, Integer sonar_issues,
			String securitySummary, Integer findbugsIssues, String gitleaksReport, String remarks) {
		super();
		this.pipelineId = pipelineId;
		this.buildTemplate = buildTemplate;
		this.sonarStepsAdded = sonarStepsAdded;
		this.coverage_measure = coverage_measure;
		this.nexusBuild = nexusBuild;
		this.wasScan = wasScan;
		this.nexusIssues = nexusIssues;
		this.sonar_issues = sonar_issues;
		this.securitySummary = securitySummary;
		this.findbugsIssues = findbugsIssues;
		this.gitleaksReport = gitleaksReport;
		this.remarks = remarks;
	}

	public Integer getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(Integer pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getBuildTemplate() {
		return buildTemplate;
	}

	public void setBuildTemplate(String buildTemplate) {
		this.buildTemplate = buildTemplate;
	}

	public boolean isSonarStepsAdded() {
		return sonarStepsAdded;
	}

	public void setSonarStepsAdded(boolean sonarStepsAdded) {
		this.sonarStepsAdded = sonarStepsAdded;
	}

	public Integer getCoverage_measure() {
		return coverage_measure;
	}

	public void setCoverage_measure(Integer coverage_measure) {
		this.coverage_measure = coverage_measure;
	}

	public String getNexusBuild() {
		return nexusBuild;
	}

	public void setNexusBuild(String nexusBuild) {
		this.nexusBuild = nexusBuild;
	}

	public String getWasScan() {
		return wasScan;
	}

	public void setWasScan(String wasScan) {
		this.wasScan = wasScan;
	}

	public Integer getNexusIssues() {
		return nexusIssues;
	}

	public void setNexusIssues(Integer nexusIssues) {
		this.nexusIssues = nexusIssues;
	}

	public Integer getSonar_issues() {
		return sonar_issues;
	}

	public void setSonar_issues(Integer sonar_issues) {
		this.sonar_issues = sonar_issues;
	}

	public String getSecuritySummary() {
		return securitySummary;
	}

	public void setSecuritySummary(String securitySummary) {
		this.securitySummary = securitySummary;
	}

	public Integer getFindbugsIssues() {
		return findbugsIssues;
	}

	public void setFindbugsIssues(Integer findbugsIssues) {
		this.findbugsIssues = findbugsIssues;
	}

	public String getGitleaksReport() {
		return gitleaksReport;
	}

	public void setGitleaksReport(String gitleaksReport) {
		this.gitleaksReport = gitleaksReport;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
