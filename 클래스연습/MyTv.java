package Ŭ��������;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴� 
		isPowerOn = !isPowerOn;
	}

	void volumeUp() {
// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��
		if (volume < MAX_VOLUME)
			volume++;
	}

	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��
		if (volume > MIN_VOLUME)
			volume--;

	}

	void channelUp() {
		// (4) channel�� ���� 1������Ų��
		// channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}

	void channelDown() {
		// (5) channel�� ���� 1���ҽ�Ų��
		// channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNE�� �ٲ۴�
		if (channel == MIN_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel--;
		}
	}
}
