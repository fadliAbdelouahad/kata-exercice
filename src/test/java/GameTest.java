import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }


    @Test
    public void canScoreGutterGame(){
        game.roll(0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0);
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void canScoreGameOfOnes(){
        game.roll(1,1 , 1,1 , 1,1 , 1,1 , 1,1 , 1,1 , 1,1 , 1,1 , 1,1 , 1,1);
        assertThat(game.score()).isEqualTo(20);
    }

    @Test
    public void canScoreSpare(){
        game.roll(5,5 , 3,0, 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0);
        assertThat(game.score()).isEqualTo(16);

    }

    @Test
    public void canScoreStrike(){
        game.roll(10 , 3,3, 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0 , 0,0);
        assertThat(game.score()).isEqualTo(22);

    }

    @Test
    public void canScorePerfectGame(){
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score()).isEqualTo(300);

    }
}
