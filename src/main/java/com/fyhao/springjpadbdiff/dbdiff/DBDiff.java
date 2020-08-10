package com.fyhao.springjpadbdiff.dbdiff;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBDiff {

	static Logger log = LoggerFactory.getLogger(DBDiff.class);
	String repo;
	String path;
	String sourceCommit;
	String targetCommit;
	
	Properties prop = null;
	
	public DBDiff(String repo, String path, String sourceCommit, String targetCommit) {
		this.repo = repo;
		this.path = path;
		this.sourceCommit = sourceCommit;
		this.targetCommit = targetCommit;
		prop = new Properties();
		try {
			prop.load(new FileInputStream("dev.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void analyze() {
		String env = prop.getProperty("env");
		log.info("analyze env " + env);
		if(env.equals("dev")) {
			
		}
	}
	
	public List<String> getOutputSQL() {
		return new ArrayList<String>();
	}
}
