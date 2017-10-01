package lab7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab7.dao.AdjectiveClient;
import lab7.dao.ArticleClient;
import lab7.dao.NounClient;
import lab7.dao.SubjectClient;
import lab7.dao.VerbClient;
import lab7.domain.Word;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	public Word getNoun() {
		return nounClient.getWord();
	}	
}
