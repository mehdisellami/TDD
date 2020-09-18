package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static fr.parisnanterre.miage.rps.model.RPSEnum.*;
import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp(){


        rps= new RockPaperScissors() ;
    }

    @AfterMethod
    public void tearDown(){
        rps= null ;
    }

    @Parameters({"papier","pierre"})
    @Test
    public void testPlay(String p1, String p2){
        assertEquals(rps.Resultplay(valueOf(p1),valueOf(p2)),Result.WIN);
    }


    @Parameters({"papier","papier"})
    @Test
    public void  testTiePlay(String p1, String p2){
        assertEquals(rps.Resultplay(valueOf(p1),valueOf(p2)),Result.TIE);
    }

    @Parameters({"pierre","papier"})
    @Test
    public void  testLostPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.Resultplay(valueOf(p1.name()),valueOf(p2.name())),Result.LOST);
    }


}
