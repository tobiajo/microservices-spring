package lab5.sentenceserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class SentenceController {

    @Autowired
    RestTemplate template;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return
                getWord("LAB4-SUBJECT") + " "
                        + getWord("LAB4-VERB") + " "
                        + getWord("LAB4-ARTICLE") + " "
                        + getWord("LAB4-ADJECTIVE") + " "
                        + getWord("LAB4-NOUN") + "."
                ;
    }

    public String getWord(String service) {
        return template.getForObject("http://" + service, String.class);
    }
}
