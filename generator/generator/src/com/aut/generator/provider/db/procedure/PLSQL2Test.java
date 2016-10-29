package com.aut.generator.provider.db.procedure;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;

import org.antlr.runtime.Parser;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class PLSQL2Test {
	public static void main(String[] args) throws IOException, RecognitionException {
		System.out.println("good");
		String file = "./src/new_type.plsql";
		CharStream cs = new ANTLRFileStream(file);

		PLSQL2Lexer lexer = new PLSQL2Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		PLSQL2Parser parser = new PLSQL2Parser(tokens);
		Parser parser2 = parser;
		antlr.TreeParser a ;
		@SuppressWarnings("unused")
		RuleReturnScope result = parser.sqlplus_file();
		CommonTree tree = (CommonTree) result.getTree();
		System.out.println(tree.toStringTree());
		List procedureList = parser.getProcedureList();
		System.out.println(procedureList);
		List functionList = parser.getFunctionList();
		System.out.println(functionList);
		List typeList = parser.getTypeList();
		System.out.println(typeList);
	}
	
	
	public static void traverseTree(CommonTree tree){
		if(tree==null){
			return;
		}
		Token token = tree.getToken();
		System.out.print(tree.getText());
		System.out.print(tree.getType());
		System.out.println();
		List children = tree.getChildren();
		if(children==null){
			return;
		}
		for (Object object : children) {
			CommonTree subTree = (CommonTree) object;
			traverseTree(subTree);
		}
	}
}
