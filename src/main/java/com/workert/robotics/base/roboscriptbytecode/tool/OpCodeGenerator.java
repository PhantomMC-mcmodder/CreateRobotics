package com.workert.robotics.base.roboscriptbytecode.tool;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class OpCodeGenerator {
	// tool i made to make it less of a pain to add opcodes
	private static List<String> opCodes = new ArrayList<>();
	private static final String path = "src/main/java/com/workert/robotics/base/roboscriptbytecode/OpCode.java";

	private static void defineOpCodes() {
		opCodes.add("OP_CONSTANT");
		opCodes.add("OP_NEGATE");
		opCodes.add("OP_RETURN");
	}


	public static void main(String[] args) throws IOException {
		defineOpCodes();
		PrintWriter writer = new PrintWriter(path, "UTF-8");
		writer.println("package com.workert.robotics.base.roboscriptbytecode;");
		writer.println();
		writer.println("// These are similar to TokenTypes, and represent different instructions for the VM");
		writer.println("public interface OpCode {");
		for (int i = 0; i < opCodes.size(); i++) {
			writer.println("    byte " + opCodes.get(i) + " = " + i + ";");
		}
		writer.println("}");
		writer.close();
	}
}