package com.stantabcorp.i18n;

import java.util.HashMap;

/*
 * (C) STAN-TAb Corp. 2017 All rights reserved https://stantabcorp.com
 */

public class Translation {
	
	public HashMap<String, String> words = new HashMap<String, String>();
	
	public String getWord(String word_id){
		if(words.containsKey(word_id)){
			return words.get(word_id);
		}else{
			return "";
		}
	}
	
	public void addWord(String word_id, String word){
		words.put(word_id, word);
	}

}
