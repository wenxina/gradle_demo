package com.example.hl.utils;

import java.io.File;
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

/**
 * @author wang
 * 此类为mybatis-generator工具类
 */
public class MybatisGenerator {

	public static void main(String[] args) {
		// 创建一个警告列表，整个MBG运行过程中的所有警告信息都放在这个列表中，执行完成后统一System.out
		List<String> warnings = new ArrayList<String>();
		// ShellCallback为文件和并传入参数
		boolean overwrite = true;
		// mybatisConfiguration.xml文件
		// 若出现空指针，直接写绝对路径即可。
		String genCfg = "/mybatisGenerator/mybatisConfiguration.xml";
		File configFile = new File(MybatisGenerator.class.getResource(genCfg).getFile());
		// 创建配置解析器
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			// 调用配置解析器创建配置对象（Configuration对象非常简单，可以简单理解为包含两个列表，一个列表是List<Context>
			// contexts，包含了解析出来的Context对象，一个是List<String>
			// classPathEntries，包含了配置的classPathEntry的location值）
			config = cp.parseConfiguration(configFile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}
		// 创建一个默认的ShellCallback对象，shellcallback接口主要用来处理文件的创建和合并，传入overwrite参数；默认的shellcallback是不支持文件合并的；
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		// 创建一个MyBatisGenerator对象。MyBatisGenerator类是真正用来执行生成动作的类
		MyBatisGenerator myBatisGenerator = null;
		try {
			// 创建一个MyBatisGenerator对象。MyBatisGenerator类是真正用来执行生成动作的类
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		}
		try {
			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (warnings.size() > 0) {
			System.out.println("配置出现错误!");
			for (String warning : warnings) {
				System.out.println("------》》" + warning);
			}
		} else {
			System.out.println("逆向创建完成!");
		}
	}
}
