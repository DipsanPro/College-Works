import java.util.Scanner;

public class QuizTime {

    static class Question {
        String text;
        String answer;

        public Question(String text, String answer) {
            this.text = text;
            this.answer = answer;
        }

        public boolean isCorrect(String userAnswer) {
            return userAnswer.trim().equalsIgnoreCase(answer);
        }
    }

    static class Quiz {
        Question[] questions = new Question[25];
        int count = 0;

        public void add(Question q) {
            if (count < 25) {
                questions[count] = q;
                count++;
            } else {
                System.out.println("Cannot add more than 25 questions.");
            }
        }

        public void giveQuiz() {
            Scanner scanner = new Scanner(System.in);
            int correctAnswers = 0;

            for (int i = 0; i < count; i++) {
                System.out.println("Q" + (i + 1) + ": " + questions[i].text);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();

                if (questions[i].isCorrect(userAnswer)) {
                    System.out.println("Correct!\n");
                    correctAnswers++;
                } else {
                    System.out.println("Wrong. Correct answer: " + questions[i].answer + "\n");
                }
            }

            System.out.println("Quiz finished! You got " + correctAnswers + " out of " + count + " correct.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        //Questions
        quiz.add(new Question("What is the capital of France?", "Paris"));
        quiz.add(new Question("What is 2 + 2?", "4"));
        quiz.add(new Question("What color is the sky on a clear day?", "Blue"));

        quiz.giveQuiz();
    }
}
