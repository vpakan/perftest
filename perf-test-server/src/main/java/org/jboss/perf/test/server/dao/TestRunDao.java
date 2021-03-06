package org.jboss.perf.test.server.dao;

import java.util.List;

import org.jboss.perf.test.server.model.TestRun;


public interface TestRunDao {
	public TestRun save(TestRun testRun);
	public TestRun getTestRunById(Long testRunId);
	public List<TestRun> getAllTestRuns(long testSuiteRunId);
	public List<TestRun> getSuccessfullTestRuns(long testSuiteRunId);
	public List<TestRun> getFailedTestRuns(long testSuiteRunId);
	public TestRun getTestRunByTestSuiteRunIdAndByMethod(long testSuiteRunId, String method);
	public TestRun getTestRunByTestSuiteRunIdAndByMethodId(long testSuiteRunId, long methodId);
	public TestRun getTestedTestRunByTestSuiteRunId(long testSuiteRunId);
	public List<TestRun> getTestRunsForView3(long projectId, List<String> builds, String testSuite, long methodId);
}
