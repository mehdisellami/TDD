package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.*;

import static fr.parisnanterre.miage.rps.model.RPSEnum.*;
import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() {


        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        rps = null;
    }

    @Parameters({"papier", "pierre"})
    @Test
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.Resultplay(valueOf(p1), valueOf(p2)), Result.WIN);
    }


    @Parameters({"papier", "papier"})
    @Test
    public void testTiePlay(String p1, String p2) {
        assertEquals(rps.Resultplay(valueOf(p1), valueOf(p2)), Result.TIE);
    }

    @Parameters({"pierre", "papier"})
    @Test
    public void testLostPlay(String p1, String p2) {
        assertEquals(rps.Resultplay(valueOf(p1), valueOf(p2)), Result.LOST);
    }



    @DataProvider(name = "winData")
    public Object[][] createWinData() {
        return new Object[][]{
                {"papier", "pierre" },
                {"ciseaux", "papier"},
                {"pierre", "ciseaux"}
        };
    }

    @DataProvider(name = "lostData")
    public Object[][] createLostData() {
        return new Object[][]{
                    {"pierre", "papier"},
                    {"papier", "ciseaux"},
                    {"ciseaux","pierre"}
            };


        }

    @DataProvider(name = "tieData")
    public Object[][] createTieData() {
        return new Object[][]{
                {"papier", "papier" },
                {"ciseaux", "ciseaux"},
                {"pierre","pierre"}
        };
    }


    @Test(dataProvider = "winData")
    public void testWinPlay ( RPSEnum p1 , RPSEnum p2 ) {
        assertEquals(rps.Resultplay(p1, p2), Result.WIN);
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay ( RPSEnum p1 , RPSEnum p2 ) {
        assertEquals(rps.Resultplay(p1, p2), Result.WIN);
    }


    @Test(dataProvider = "lostData")
    public void testLostPlay ( RPSEnum p1 , RPSEnum p2 ) {
        assertEquals(rps.Resultplay(p1, p2), Result.WIN);
    }



}