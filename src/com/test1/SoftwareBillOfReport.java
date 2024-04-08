package com.test1;

public class SoftwareBillOfReport {
	private Integer repoCode;
	private String repoName;
	private String branchName;
	private String featureName;
	private Integer buildId;
	private Integer issuesCount;
	private Integer criticalIssuesCount;
	private String trigerredBy;
	private String approvedBy;
	private String totalComponents;
	private String directDependencies;
	private String transientDependencies;
	private String executionSummary;

	public SoftwareBillOfReport() {

	}

	public SoftwareBillOfReport(Integer repoCode, String repoName, String branchName, String featureName,
			Integer buildId, Integer issuesCount, Integer criticalIssuesCount, String trigerredBy, String approvedBy,
			String totalComponents, String directDependencies, String transientDependencies, String executionSummary) {
		super();
		this.repoCode = repoCode;
		this.repoName = repoName;
		this.branchName = branchName;
		this.featureName = featureName;
		this.buildId = buildId;
		this.issuesCount = issuesCount;
		this.criticalIssuesCount = criticalIssuesCount;
		this.trigerredBy = trigerredBy;
		this.approvedBy = approvedBy;
		this.totalComponents = totalComponents;
		this.directDependencies = directDependencies;
		this.transientDependencies = transientDependencies;
		this.executionSummary = executionSummary;
	}

	public Integer getRepoCode() {
		return repoCode;
	}

	public void setRepoCode(Integer repoCode) {
		this.repoCode = repoCode;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public Integer getIssuesCount() {
		return issuesCount;
	}

	public void setIssuesCount(Integer issuesCount) {
		this.issuesCount = issuesCount;
	}

	public Integer getCriticalIssuesCount() {
		return criticalIssuesCount;
	}

	public void setCriticalIssuesCount(Integer criticalIssuesCount) {
		this.criticalIssuesCount = criticalIssuesCount;
	}

	public String getTrigerredBy() {
		return trigerredBy;
	}

	public void setTrigerredBy(String trigerredBy) {
		this.trigerredBy = trigerredBy;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getTotalComponents() {
		return totalComponents;
	}

	public void setTotalComponents(String totalComponents) {
		this.totalComponents = totalComponents;
	}

	public String getDirectDependencies() {
		return directDependencies;
	}

	public void setDirectDependencies(String directDependencies) {
		this.directDependencies = directDependencies;
	}

	public String getTransientDependencies() {
		return transientDependencies;
	}

	public void setTransientDependencies(String transientDependencies) {
		this.transientDependencies = transientDependencies;
	}

	public String getExecutionSummary() {
		return executionSummary;
	}

	public void setExecutionSummary(String executionSummary) {
		this.executionSummary = executionSummary;
	}

}
