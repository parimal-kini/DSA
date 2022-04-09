package com.parimalkini;

public class e_GoalParser {
    public static void main(String[] args) {
//        String command = "G()(al)";
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        command = finalAns(command);
        return command.replace("()","o");
    }
    static String finalAns(String s){
        return s.replace("(al)","al");
    }
}
