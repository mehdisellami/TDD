package fr.parisnanterre.miage.rps.model;

public class RockPaperScissors {

    public RockPaperScissors() {
    }

    public Result Resultplay(RPSEnum p1, RPSEnum p2){
        if (p1==p2){
            return Result.TIE;
        }

        else    return Result.WIN;

}

}
