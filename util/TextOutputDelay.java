package util;

import java.util.concurrent.TimeUnit;

public class TextOutputDelay {
	public static void main(String[] args) throws Exception {
		printWithDelays("Welcome to my scary game", TimeUnit.MILLISECONDS, 100);
		printWithDelays("\n", TimeUnit.MILLISECONDS, 200);
		printWithDelays("Play if you dare.....", TimeUnit.MILLISECONDS, 100);

	}

	public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
		for (char ch : data.toCharArray()) {
			System.out.print(ch);
			unit.sleep(delay);
		}
	}
}