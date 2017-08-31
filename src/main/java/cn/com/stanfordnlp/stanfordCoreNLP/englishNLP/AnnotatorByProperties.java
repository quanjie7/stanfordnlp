package cn.com.stanfordnlp.stanfordCoreNLP.englishNLP;

import java.util.Properties;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class AnnotatorByProperties {

	public static void main(String[] args) {
		//创建annotators属性
		Properties props = new Properties();
		props.setProperty("annotators", "tokenize,ssplit,pos,lemma,ner,parse,dcoref");
		
		//实例化StanfordCoreNLP
		StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
		
		//准备一段文本
		String  text = "In the Monday-morning quarterbacking that followed the 'Game of Thrones' finale, a frequent criticism has been that the seventh season moved too fast as it sped toward revealing Jon Snow's lineage and paving the way for the conclusive battles to come.";
		
		//用上述的text，创建了一个空的Annotation对象
		Annotation document = new Annotation(text);
		
		//启动pipeline
		pipeline.annotate(document);
	}

}
