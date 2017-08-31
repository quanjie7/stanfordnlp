package cn.com.stanfordnlp.stanfordCoreNLP.englishNLP;

import java.util.List;
import java.util.Map;

import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.coref.CorefCoreAnnotations.CorefChainAnnotation;
import edu.stanford.nlp.coref.data.CorefChain;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations.TreeAnnotation;
import edu.stanford.nlp.util.CoreMap;

public class InterpretingTheOutput {

	public static void main(String[] args) {
		String text = "In the Monday-morning quarterbacking that followed the "
				+ "'Game of Thrones' finale, a frequent criticism has been that "
				+ "the seventh season moved too fast as it sped toward revealing "
				+ "Jon Snow's lineage and paving the way for the conclusive "
				+ "battles to come.I am sad.";
		Annotation document = new Annotation(text);
		
		List<CoreMap> sentences = document.get(SentencesAnnotation.class);
		
		//遍历sentences
		for(CoreMap sentence:sentences){
			for(CoreLabel token:sentence.get(TokensAnnotation.class)){
				String word = token.get(TextAnnotation.class);
				String pos = token.get(PartOfSpeechAnnotation.class);
				String ne = token.get(NamedEntityTagAnnotation.class);
			}
			Tree tree = sentence.get(TreeAnnotation.class);
			SemanticGraph dependencies = sentence.get(CollapsedCCProcessedDependenciesAnnotation.class);
		
		}
		Map<Integer, CorefChain> graph = document.get(CorefChainAnnotation.class);

	}

}
