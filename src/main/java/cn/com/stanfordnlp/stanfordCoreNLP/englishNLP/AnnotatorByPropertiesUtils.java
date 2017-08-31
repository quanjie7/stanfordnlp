package cn.com.stanfordnlp.stanfordCoreNLP.englishNLP;

import java.util.Properties;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.PropertiesUtils;

public class AnnotatorByPropertiesUtils {

	public static void main(String[] args) {
		//使用propertiesUtils设置而properties
		Properties props = PropertiesUtils.asProperties(
				"annotators","tokenize,ssplit,pos,lemma,parse,natlog",
				"ssplit.isOneSentence","true",
				"parse.model","edu/stanford/nlp/models/srparser/englishSR.ser.gz",
				"tokenize.language","en"
				);
		//构造StanfordCoreNLP对象
		StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
		//准备一段text
		String text = "In the Monday-morning quarterbacking that followed the 'Game of Thrones' finale, a frequent criticism has been that the seventh season moved too fast as it sped toward revealing Jon Snow's lineage and paving the way for the conclusive battles to come.";
		//构造一个Annotation对象
		Annotation annotation = new Annotation(text);
		//启动pipeline
		pipeline.annotate(annotation);
		
		

	}

}
