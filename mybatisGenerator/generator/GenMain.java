package generator;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GenMain {

	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		List<String> warnings = new ArrayList<>();
		ConfigurationParser configurationParser = new ConfigurationParser(warnings);
		Configuration configuration = configurationParser.parseConfiguration(GenMain.class.getResourceAsStream("generatorConfig.xml"));

		boolean overwrite = true;
		DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);

		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
		myBatisGenerator.generate(null);
	}
}
