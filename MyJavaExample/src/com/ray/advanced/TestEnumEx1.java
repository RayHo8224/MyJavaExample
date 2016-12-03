package com.ray.advanced;

enum Language{
	English,Chinese ,Japanese 
}
public class TestEnumEx1 {
	
	public static String getLanguage(Language language){
		switch(language){
		case English:
			return "英文";
		case Chinese:
			return "中文";
		case Japanese:
			return "日文";
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String language = getLanguage(Language.English);
		System.out.println(Language.English+":"+language);  	// English:英文
	}

}
