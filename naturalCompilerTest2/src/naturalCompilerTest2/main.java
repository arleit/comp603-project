package naturalCompilerTest2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class main {
	public static void main(String[] args) throws IOException{		
		String inputFile = null;
		inputFile =  "C:/Users/piontkowskim/workspace/naturalCompilerTest2/testFile.txt"; //our input file,
		InputStream is = System.in;
		try {
			is = new FileInputStream(inputFile);
			System.out.println("opening stream");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("could not open");
			e.printStackTrace();
		}
		//ANTLRInputStream input = new ANTLRInputStream(is);
		
		HelloLexer lexer = new HelloLexer(new ANTLRFileStream(inputFile)); // not allowing us to cast an antlr stream to a char stream. odd since antlr stream impl charstream
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.program();
		HelloBaseVisitor visitor = new HelloBaseVisitor();
		visitor.visit(tree);
		//HelloInterpreter interpreter = new HelloInterpreter();
		is.close();
		
		
		//parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
		//ParserRuleContext tree = parser.component();
		//tree.inspect(parser); 
		//ParserRuleContext tree = parser.compilationUnit();
		//ParseTree tree = parser.component();
		//ParseTreeWalker.DEFAULT.walk(new HelloListener , tree);
		// show tree in text form
		//System.out.println(tree.toStringTree(parser));
		//HelloBaseVisitor<String> visitor = new HelloBaseVisitor();
		//String result = visitor.visit(tree);
		//System.out.println("visitor result = "+result);
	}

}
