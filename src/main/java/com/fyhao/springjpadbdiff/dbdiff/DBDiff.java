package com.fyhao.springjpadbdiff.dbdiff;

import java.util.ArrayList;
import java.util.List;

public class DBDiff {

	String repo;
	String path;
	String sourceCommit;
	String targetCommit;
	public DBDiff(String repo, String path, String sourceCommit, String targetCommit) {
		this.repo = repo;
		this.path = path;
		this.sourceCommit = sourceCommit;
		this.targetCommit = targetCommit;
	}
	
	public void analyze() {
		
	}
	
	public List<String> getOutputSQL() {
		return new ArrayList<String>();
	}
}
