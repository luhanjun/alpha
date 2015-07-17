package com.lj.IKAnalyzer;


import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.FieldCache;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;


public class IKAnalyzer {
	/**
	 * 分词
	 * @param word 需分词的文本
	 * @return
	 */
	public String analyzer(String word){
		String name="text";
		String text="IK Analyzer是一个结合词典分词和文法分词的中文分词开源工具包。它使用了全新的正向迭代最细粒度切分算法。";
		//步骤一：获取分词器
		//档内容进行分词处理，这部分工作就是由 Analyzer 来做的。Analyzer 类是一个抽象类，它有多个实现。针对不同的语言和应用需要选择适合的 Analyzer。Analyzer 把分词后的内容交给 IndexWriter 来建立索引
		Analyzer analyzer= new  org.wltea.analyzer.lucene.IKAnalyzer() ; 
		Directory directory=null;
		//IndexWriter 是 Lucene 用来创建索引的一个核心的类，他的作用是把一个个的 Document 对象加到索引中来
		IndexWriter iwriter=null;
		IndexReader ireader=null;
		IndexSearcher isearcher=null;
		//步骤二：创建索引
		
		//建立内存索引对象
		/*
		 *这个类代表了 Lucene 的索引的存储的位置，这是一个抽象类，它目前有两个实现，
		 *第一个是 FSDirectory，它表示一个存储在文件系统中的索引的位置。
		 *第二个是 RAMDirectory，它表示一个存储在内存当中的索引的位置。 
		 */
		directory=new RAMDirectory();
		//配置IndexWriterConfig 
		IndexWriterConfig iwConfig=new IndexWriterConfig(Version.LUCENE_40, analyzer);//Version.LUCENE_40 Lucene的版本;analyzer  默认的分词器 onfig
		//
		iwConfig.setOpenMode(OpenMode.CREATE_OR_APPEND);
		try {
			iwriter=new IndexWriter(directory, iwConfig);
			
			//Document 是用来描述文档的,可以把一个 Document 对象想象成数据库中的一个记录
			Document doc=new Document();
			//每个 Field 对象就是记录的一个字段
			Field fieldId=new Field("ID", "10000",Field.Store.YES,Field.Index.NOT_ANALYZED);
			Field fieldName=new Field(name, text, Field.Store.YES,Field.Index.ANALYZED);
			//写入索引
			doc.add(fieldId);
			doc.add(fieldName);
			
			// Document 对象加到索引中
			iwriter.addDocument(doc);
			iwriter.close();
			/*************************以上代码是创建索引，下面就开始进行搜索*********************************************/
			//实例化搜索器
			ireader=IndexReader.open(directory);
			isearcher=new IndexSearcher(ireader);//搜索器创建完成
			
			String keyword="中文分词工具包";
			//使用QueryParser 查询分词器构造Query 对象
			QueryParser qp=new QueryParser(Version.LUCENE_40, name, analyzer);
			qp.setDefaultOperator(QueryParser.AND_OPERATOR);
			
			//这是一个抽象类，他有多个实现，比如 TermQuery, BooleanQuery, PrefixQuery. 这个类的目的是把用户输入的查询字符串封装成 Lucene 能够识别的 Query。
			Query query=qp.parse(keyword);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
		
		
		
		
		
		return null;
	}

}
