package naturalCompilerTest2;

import java.awt.RenderingHints.Key;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import naturalCompilerTest2.HelloParser.BlockContext;
import naturalCompilerTest2.HelloParser.ConditionContext;
import naturalCompilerTest2.HelloParser.ExpressionContext;
import naturalCompilerTest2.HelloParser.FactorContext;
import naturalCompilerTest2.HelloParser.ProgramContext;
import naturalCompilerTest2.HelloParser.StatementContext;
import naturalCompilerTest2.HelloParser.TermContext;

public class HelloInterpreter extends HelloBaseVisitor {

	//ArrayList<String> leaves = new ArrayList<String>();
	LinkedHashMap<String, ParserRuleContext> valueAndType = new LinkedHashMap<String, ParserRuleContext>();
	
	@Override
	public Object visitExpression(HelloParser.ExpressionContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			valueAndType.put("Expression", ctx);
			System.out.println("Expression: " + ctx.toString());
			return super.visitExpression(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitStatement(HelloParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			String leaf = ctx.toString();
			valueAndType.put("Statement", ctx);
			System.out.println("Statement: " + ctx.toString());
			return super.visitStatement(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitTerm(HelloParser.TermContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			String leaf = ctx.toString();
			valueAndType.put("Term", ctx);
			System.out.println("Term: " + ctx.toString());
			return super.visitTerm(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitCondition(HelloParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			String leaf = ctx.toString();
			valueAndType.put("Condition", ctx);
			System.out.println("Condition: " + ctx.toString());
			return super.visitCondition(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitProgram(HelloParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			valueAndType.put("Program", ctx);
			System.out.println("Program: " + ctx.toString());
			return super.visitProgram(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitBlock(HelloParser.BlockContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			String leaf = ctx.toString();
			valueAndType.put("Block", ctx);
			System.out.println("Block: " + ctx.toString());
			return super.visitBlock(ctx);
		} else {
		return null;
		}
	}

	@Override
	public Object visitFactor(HelloParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		if (ctx.getChildCount() == 0){
			String leaf = ctx.toString();
			valueAndType.put("Factor", ctx);
			System.out.println("Factor: " + ctx.toString());
			/* if(valueAndType.get(getValueAt(valueAndType.size()-1)).equals('-' | '+')){ //this should return key of previous entry
				if (valueAndType.get(getValueAt(valueAndType.size()-2)).equals('0' | '1' | '2' | '3')){ //..all numbers
					// add the two, print, and delete from hashmap?
					if(valueAndType.get(getValueAt(valueAndType.size()-1)).equals('+')){
						System.out.println((valueAndType.get(getValueAt(valueAndType.size()-2))) + valueAndType.get(getValueAt(valueAndType.size()-1)));
					} //need to convert to int, need to consider multiple factors
				} */
			//}
			return super.visitFactor(ctx);
		} else {
		return null;
		}
	}
	
	public Object getValueAt(int index){
		Iterator iterator = valueAndType.entrySet().iterator();
		int tempIndex = 0;
		 while(iterator.hasNext()){
	            Entry entry = (Entry) iterator.next();
	            if(tempIndex == index){
	                return entry;
	            }
	            tempIndex ++;
	        }
		return null;
	}

}
