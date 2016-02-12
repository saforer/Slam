package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forer on 2/12/2016.
 */
public class ScreenMgr implements InputProcessor {
    public static ScreenMgr inst;

    List<MyScreen> screenList = new ArrayList<MyScreen>();

    public ScreenMgr () {
        screenList.add(new GameScreen());
    }

    public static ScreenMgr getInst() {
        if (inst == null) {
            inst = new ScreenMgr();
        }
        return inst;
    }

    public void render(SpriteBatch sb) {
        float dt = Gdx.graphics.getDeltaTime();
        for (MyScreen s : screenList) {
            s.update(dt);
        }

        for (MyScreen s : screenList) {
            s.render(sb);
        }
    }

    @Override
    public boolean keyDown(int keycode) {
        screenList.get(screenList.size()-1).keyDown(keycode);
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        screenList.get(screenList.size()-1).keyUp(keycode);
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
