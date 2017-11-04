package gamescene;

import enumerate.GameSceneName;
import loader.ResourceLoader;

public class Launcher extends GameScene {
	int count = 0;

	public Launcher() {
		// 以下4行の処理はgamesceneパッケージ内クラスのコンストラクタには必ず含める
		this.gameSceneName = GameSceneName.LAUNCH;
		this.isGameEndFlag = false;
		this.isTransitionFlag = false;
		this.nextGameScene = null;
		//////////////////////////////////////
	}

	@Override
	public void initialize() {
		System.out.println("Launcher initialize");

		String[] characterName = { "ZEN", "GARNET" };
		String[] temp = ResourceLoader.getInstance().loadFileNames("./data/ai", ".jar");
		// ResourceLoader.getInstance().loadResource(characterName);

		String[] name = { "NewFTGTestAI"};
		for (int i = 0; i < temp.length; i++) {
			ResourceLoader.getInstance().loadAI(name[i]);
			System.out.println("Loaded " + temp[i]);
			
		}
		System.out.println("done");

	}

	@Override
	public void update() {
		// System.out.println("Launcher update");
		// this.isGameEndFlag = true;

		// Image img = new
		// Image(GraphicManager.getInstance().getProjectileImageContainer().get(count++));
		// GraphicManager.getInstance().drawImage(img, 200, 200, true);
		if (count >= 6) {
			count = 0;
		}

	}

	@Override
	public void close() {

	}

}
