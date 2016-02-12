package screens;


import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Forer on 2/12/2016.
 */
public class GameScreen extends MyScreen {
    Texture img;
    int x = 0;
    int y = 0;

    public GameScreen () {
        img = new Texture("badlogic.jpg");
    }

    public void update(float dt) {

    }

    public void render(SpriteBatch sb) {
        sb.draw(img, x, y);
    }

    public void keyDown(int keycode) {
        if (keycode == Input.Keys.LEFT) {x--;}
        if (keycode == Input.Keys.RIGHT) {x++;}
        if (keycode == Input.Keys.DOWN) {y--;}
        if (keycode == Input.Keys.UP) {y++;}
    }

    public void keyUp(int keycode) {

    }
}
