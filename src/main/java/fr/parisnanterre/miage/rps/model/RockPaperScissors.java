package fr.parisnanterre.miage.rps.model;

public class RockPaperScissors {

    public RockPaperScissors() {
    }

    public Result Resultplay(RPSEnum p1, RPSEnum p2){
        if (p1==p2){
            return Result.TIE;
        }
        else if ((p1.name()=="ROCK" && p2.name()=="PAPER")       ){
            return Result.LOST;
        }

        else if ((p1.name()=="PAPER" && p2.name()=="SCISSORS")       ){
            return Result.LOST;
        }
        else if ((p1.name()=="SCISSORS" && p2.name()=="ROCK")       ){
            return Result.LOST;
        }

        else    return Result.WIN;

}

}
