package com.stantabcorp.i18n;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/*
 * (C) STAN-TAb Corp. 2017 All rights reserved https://stantabcorp.com
 */

public class i18n {
	
	public HashMap<String, Translation> langs = new HashMap<String, Translation>();
	
	public i18n(){
		
	}
	
	public void addLang(String path, String lang) throws FileNotFoundException, IOException{
		Properties properties = new Properties();
		properties.load(new FileInputStream(path));
		Translation trans = new Translation();
		for(String key : properties.stringPropertyNames()) {
			String value = properties.getProperty(key);
			trans.addWord(key, value);
		}
		langs.put(lang, trans);
	}
	
	public Translation getLang(String lang){
		if(langs.containsKey(lang)){
			return langs.get(lang);
		}
		return null;
	}

}
