package cn.com.stanfordnlp.stanfordCoreNLP.englishNLP;

import java.util.Properties;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.PropertiesUtils;

public class TestMain {

	public static void main(String[] args) {
		StanfordCoreNLP pipeline = new StanfordCoreNLP(
				PropertiesUtils.asProperties(
					"annotators", "tokenize,ssplit,pos,lemma,parse,natlog",
					"ssplit.isOneSentence", "true",
					"parse.model", "edu/stanford/nlp/models/srparser/englishSR.ser.gz",
					"tokenize.language", "en"));

			// read some text in the text variable
			
			
        String text = "The backbone of the CoreNLP package is formed by two classes: "
        		+ "Annotation and Annotator. Annotations are the data structure which hold the results of annotators.";
        Annotation document = new Annotation(text);

	}

}
