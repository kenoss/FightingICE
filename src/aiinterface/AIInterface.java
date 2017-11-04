package aiinterface;

import struct.FrameData;
import struct.GameData;
import struct.Key;

public interface AIInterface {

	int initialize(GameData gd, boolean playerNumber);

	void getInformation(FrameData fd);

	void processing();

	Key input();

	void close();

	default void roundEnd(int p1Hp, int p2Hp, int frames){};

}
