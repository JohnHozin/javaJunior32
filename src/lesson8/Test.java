package lesson8;

public class Test {
    private String name;
    private Question[] questions = new Question[50];

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        for (int i = 0; i < questions.length; i++){
            if (questions[i] == null){
                questions[i] = question;
                break;
            }
        }
    }
}
