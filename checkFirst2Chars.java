package tddjunit.hometask;

public class checkFirst2Chars {

	public String Remove(String string) {
		if(string.charAt(0)=='A'&&string.charAt(1)=='A')
			return string.substring(2,string.length());
else if(string.charAt(0)=='A')
			return string.substring(1,string.length());
else if(string.charAt(1)=='A')
			return ""+string.charAt(0)+string.substring(2,string.length());
else
		return string;// TODO Auto-generated method stub

	}

}
