class paracapitais
{	public static void main(String args[])
	{

		String s = System.console().readLine("s: ");
		s = s.trim().toLowerCase();
		int p = s.indexOf("  ");
		while (p != -1)
		{	s = s.substring(0,p)+' '+s.substring(p+2);
			p = s.indexOf("  ");
		}
		if ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z'))
		{	s = (char)(s.charAt(0)-32)+s.substring(1);
		}
		p = s.indexOf(' ');
		while (p != -1)
		{	if ((s.charAt(p+1) >= 'a') && (s.charAt(p+1) <= 'z'))
			{	s = s.substring(0,p+1)+(char)(s.charAt(p+1)-32)+s.substring(p+2);
			}
			p = s.indexOf(' ',p+1);
		}
		System.out.println(s);

	}
}

