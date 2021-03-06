package com.aut.generator;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.aut.generator.util.GLogger;

/**
 * 
 * @modify diyvan
 */

public class GeneratorMain
{

	/**
	 * 通过数据库表生成文件,pdf-b_for_easyui为模板的根目录
	 * 
	 * @throws Exception
	 */
	public static void generateByTable(GeneratorFacade g, String template) throws Exception
	{
		for (String string : initList())
		{
			g.generateByTable(string, template); // 通过数据库表生成文件,template为模板的根目录

		}
	}

	public static void generateByProcedure(GeneratorFacade g, String procedureName, String template) throws Exception
	{
		g.generateByProcedure(procedureName, template);//通过存储过程生成文件
	}

	/**
	 * 需要生成的表加如list中,可以批量生成，也可以单表生成
	 * 
	 * @return
	 */
	public static List<String> initList()
	{
		String generateTables = GeneratorProperties.getRequiredProperty("generateTables");
		List<String> list = Arrays.asList(generateTables.split(","));

		//由于struts2中第二个字母大写会报错，以下程序默认将第二个字母替换成小写
		String secondChar = null;
		String tableName = null;
		String newTableName = null;
		int listSize = list.size();
		for (int i = 0; i < listSize; i++)
		{
			tableName = list.get(i);
			secondChar = tableName.substring(1, 2);
			if (secondChar.equals(secondChar.toUpperCase()))
			{
				newTableName = tableName.substring(0, 1) + secondChar.toLowerCase() + tableName.substring(2, tableName.length());
				list.set(i, newTableName);
			}
		}
		return list;
	}

	/**
	 * 请直接修改以下代码调用不同的方法以执行相关生成任务.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception
	{
		/**
		 * 有三点需要引起特别的注意 
		 * (1)数据库连接等一些配置在generator.xml中进行配置
		 * (2)表无主键，无法生成 
		 * (3)外键关联的表无读权限，无法生成
		 */
		GeneratorProperties.addProperFileName("generator-recipon.xml");
		GeneratorFacade g = new GeneratorFacade();
		generateByTable(g, "ricepon_back_end");// pdf-b框架下的模板
//		generateByTable(g, "lqting_model");// lqting框架下的模板
		GLogger.println("代码生成完毕！");
		//打开文件夹
		System.out.println(GeneratorProperties.getRequiredProperty("outRoot"));
		try
		{
			Runtime.getRuntime().exec("cmd.exe /c start " + GeneratorProperties.getRequiredProperty("outRoot"));
		}
		catch (Exception ex)
		{
			Runtime.getRuntime().exec("nautilus --browser ./" + GeneratorProperties.getRequiredProperty("outRoot"));
		}
	}
	
//	public static void main(String[] args) throws IOException
//	{
//		String l = "nautilus ./" + GeneratorProperties.getRequiredProperty("outRoot");
//		System.out.println(l);
//		Runtime.getRuntime().exec(l);
//	}
}
