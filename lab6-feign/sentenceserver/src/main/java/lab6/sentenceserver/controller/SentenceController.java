package lab6.sentenceserver.controller;

import lab6.sentenceserver.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SentenceController {

    @Autowired
    SentenceService sentenceService;

    /**
     * Display a small list of Sentences to the caller:
     */
    @GetMapping("/sentence")
    public @ResponseBody
    String getSentences() {
        return String.format("%s\n%s\n%s\n%s\n%s\n%s",
                "<h3>Some Sentences</h3><br/>",
                sentenceService.buildSentence() + "<br/><br/>",
                sentenceService.buildSentence() + "<br/><br/>",
                sentenceService.buildSentence() + "<br/><br/>",
                sentenceService.buildSentence() + "<br/><br/>",
                sentenceService.buildSentence() + "<br/><br/>");
    }
}
