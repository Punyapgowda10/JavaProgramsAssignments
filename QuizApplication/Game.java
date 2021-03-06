package com.QuizApplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"who is the strongest Avenger?","What is the closest planet to sun?","what is the capital of australia?"};
    String[] option1={"Ironman","Earth","Sydney"};
    String[] option2={"Thor","Venus","Perth"};
    String[] option3={"Hulk","Mercury","Melbourne"};
    String[] option4={"Dr Strange","Jupiter","Canberra"};
    int[] answers={2,3,4};


    public void initGame()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=option1[i];
            questions[i].option2=option2[i];
            questions[i].option3=option3[i];
            questions[i].option4=option4[i];
            questions[i].correctAnswer=answers[i];
        }

    }

    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Well played bud");
                player.score=player.score+5;
            }
            else{
                System.out.println("sorry bud we can't help you");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name+" your score is "+player.score);
    }

}
