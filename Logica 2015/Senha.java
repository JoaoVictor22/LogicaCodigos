//http://www.tutorialspoint.com/compile_java_online.php

/*
 a - 4
 b - 6	
 c - <
 e - 3
 g - 9
 i - 1
 l - |
 n - ~
 o - 0
 q - ?
 s - 5
 t - 7
 u - &
 x - *
 z = %
 */

public class Senha {

	public static void main(String[] args) {

		java.lang.String s = System.console().readLine();
		s = s.toLowerCase();

		int p = s.indexOf(" ");
		while (p != -1) {
			s = s.substring(0, p) + s.substring(p + 1);
			p = s.indexOf(' ');
		}

		s = s.replace('a', '4');
		s = s.replace('b', '6');
		s = s.replace('c', '<');
		s = s.replace('e', '3');
		s = s.replace('g', '9');
		s = s.replace('i', '1');
		s = s.replace('l', '|');
		s = s.replace('n', '~');
		s = s.replace('o', '0');
		s = s.replace('q', '?');
		s = s.replace('s', '5');
		s = s.replace('u', '&');
		s = s.replace('x', '*');
		s = s.replace('z', '%');
	}
}
