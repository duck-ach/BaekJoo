package baekjoon;

import java.util.*;

public class lottoQuestion {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			int lotto = (int) (Math.random() * 45 + 1);
			System.out.print(lotto + " ");

		}
	}

}
