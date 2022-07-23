package lesson8;

public class Main {
    public static void main(String[] args) {
        Test modulTest = new Test("Контрольный тест после 1го модуля");

        Question question1 = new Question();
        question1.setQuestion("The statements \"This is a String\".indexOf(\" \"); " +
                "will return: \n (Note: it is looking for the space character)");

        Option option1_1 = new Option("4", 1);
        option1_1.setCorrect(true);
        Option option1_2 = new Option("5", 1);
        Option option1_3 = new Option("4 7 9", 1);
        Option option1_4 = new Option("5 8 10", 1);
        Option option1_5 = new Option("None of the above.", 1);

//        question1.addOption(option1_1);
//        question1.addOption(option1_2);
//        question1.addOption(option1_3);
//        question1.addOption(option1_4);
//        question1.addOption(option1_5);

        question1.addOption(option1_1, option1_2, option1_3, option1_4, option1_5);
        modulTest.addQuestion(question1);


        Question question2 = new Question();
        question2.setQuestion("Which of the following are valid java statements to " +
                "increment the integer i by 1?");
        Option option2_1 = new Option("i++;", 1);
        option2_1.setCorrect(true);
        Option option2_2 = new Option("i=i+1;", 1);
        option2_2.setCorrect(true);
        Option option2_3 = new Option("i+=1;", 1);
        option2_3.setCorrect(true);
        Option option2_4 = new Option("i+1;", 1);

        question2.addOption(option2_1, option2_2, option2_3, option2_4);
        modulTest.addQuestion(question2);


        Question question3 = new Question();
        question3.setQuestion("Which of the following statements is true in Java?");
        Option option3_1 =new Option("One array can store different types of values.",1);
        Option option3_2 =new Option("An array index can be any numeric type, e.g. int, long, double, etc",1);
        Option option3_3 =new Option("Array elements are indexed from 1 to size of array.",1);
        Option option3_4 =new Option("An array can change size to fit in new values",1);
        Option option3_5 =new Option("None of the above",1);
        option3_5.setCorrect(true);

        question3.addOption(option3_1, option3_2, option3_3, option3_4,option3_5);
        modulTest.addQuestion(question3);


        Question question4 = new Question();
        question4.setQuestion("What is the value of each of the following Java expressions?");
        Option option4_1 = new Option("21/3.0",1);
        Option option4_2 = new Option("16/3",1);
        Option option4_3 = new Option("3+4*4>5*(4+3)-1",1);
        Option option4_4 = new Option("(true==false)?2:-2",1);
        // через сканер вводить ответ для каждого варианта?

        question4.addOption(option4_1, option4_2, option4_3, option4_4);
        modulTest.addQuestion(question4);


        Question question5 = new Question();
        question5.setQuestion("Which 2 of the following are legal statements of Java code?");
        Option option5_1 = new Option("--j;;",1);
        option5_1.setCorrect(true);
        Option option5_2 = new Option("j+;",1);
        Option option5_3 = new Option("j+=1;",1);
        option5_3.setCorrect(true);
        Option option5_4 = new Option("j--1;",1);

        question5.addOption(option5_1, option5_2, option5_3, option5_4);
        modulTest.addQuestion(question5);


        Question question6 = new Question();
        question6.setQuestion("Which of the following lines will compile without error?");
        Option option6_1 = new Option("double d = 1.0;",1);
        option6_1.setCorrect(true);
        Option option6_2 = new Option("int i = 1.0;",1);
        Option option6_3 = new Option("char c = 1;",1);
        option6_3.setCorrect(true);
        Option option6_4 = new Option("boolean b = 'true';",1);

        question6.addOption(option6_1, option6_2, option6_3, option6_4);
        modulTest.addQuestion(question6);


        Question question7 = new Question();
        question7.setQuestion("What be printed if you try to compile and run the following code? \n" +
                "public class Test{ \n public static void main(String[] args){ \n" +
                "float[] values = new float[5]; \n System.out.println(values[4]); \n } \n }");
        Option option7_1 = new Option("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException",1);
        Option option7_2 = new Option("0",1);
        Option option7_3 = new Option("0.0",1);
        option7_3.setCorrect(true);
        Option option7_4 = new Option("null",1);

        question7.addOption(option7_1, option7_2, option7_3, option7_4);
        modulTest.addQuestion(question7);


        Question question8 = new Question();
        question8.setQuestion("Which of the following are valid variable names in Java?");
        Option option8_1 = new Option("p",1);
        option8_1.setCorrect(true);
        Option option8_2 = new Option("7up",1);
        Option option8_3 = new Option("while",1);
        Option option8_4 = new Option("float",1);
        Option option8_5 = new Option("Test",1);

        question8.addOption(option8_1, option8_2, option8_3, option8_4,option8_5);
        modulTest.addQuestion(question8);


        Question question9 = new Question();
        question9.setQuestion("class TestClass { \n   public static void main(String[] args) { \n" +
                "      boolean i = true; \n      boolean j = !i; \n      i=!j; \n      boolean k = !i || !j; \n" +
                "      boolean o = i && k; \n \n      if(o) i = !j; \n \n         System.out.println(i + \" \" + j + " +
                "\" \" + k); \n   } \n}");
        Option option9_1 = new Option("true false true",1);
        option9_1.setCorrect(true);
        Option option9_2 = new Option("true true true",1);
        Option option9_3 = new Option("false true true",1);
        Option option9_4 = new Option("false true false",1);

        question9.addOption(option9_1, option9_2, option9_3, option9_4);
        modulTest.addQuestion(question9);


        Question question10 = new Question();
        question10.setQuestion("Which 1 of the following statements is false?");
        Option option10_1 = new Option("Variable names can be any length",1);
        Option option10_2 = new Option("A Class name cannot have spaces in it",1);
        Option option10_3 = new Option("A java method must return a value",1);
        option10_3.setCorrect(true);
        Option option10_4 = new Option("None of the above",1);

        question10.addOption(option10_1, option10_2, option10_3, option10_4);
        modulTest.addQuestion(question10);
        System.out.println();


        PrintUtils.printQuestion(question10);
        System.out.println();
        PrintUtils.printQuestion(question9);
//        int[] answers = PrintUtils.getAnswers();


        System.out.println();
    }
}
