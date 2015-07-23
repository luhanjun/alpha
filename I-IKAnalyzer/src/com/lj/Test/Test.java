package com.lj.Test;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import com.lj.IKAnalyzer.IKAnalyzer;

public class Test {

	public static void main(String[] args) throws IOException {
		IKAnalyzer analyzer=new IKAnalyzer();
		analyzer.analyzer();
		
//		 String text="基于java语言开发的轻量级的中文分词工具包";  
//        //创建分词对象  
//        Analyzer anal=new org.wltea.analyzer.lucene.IKAnalyzer(true);       
//        StringReader reader=new StringReader(text);  
//        //分词  
//        TokenStream ts=anal.tokenStream("", reader);  
//        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
//        //遍历分词数据  
//        while(ts.incrementToken()){  
//            System.out.print(term.toString()+"|");  
//        }  
//        reader.close();  
//        System.out.println(); 

	}
//	基于|java|语言|开发|的|轻量级|量级|的|中文|分词|工具包|工具|包|
//  基于|java|语言|开发|的|轻量级|的|中文|分词|工具包|
}
