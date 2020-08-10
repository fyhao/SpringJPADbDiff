package com.fyhao.springjpadbdiff.dbdiff;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class DbdffApplicationTests {

	@Test
	void contextLoads() {
		String repo = "https://github.com/fyhao/SpringWebApps";
		String path = "./";
		String sourceCommit = "015486b5d0e1c8effd4ce7cb77d3ea6570434e36";
		String targetCommit = "13a01a031798d3c660a2a8463fb836dcb50545f0";
		DBDiff dbDiff = new DBDiff(repo, path, sourceCommit, targetCommit);
		dbDiff.analyze();
		List<String> output = dbDiff.getOutputSQL();
		assertThat(output).hasSize(0);
	}

}
