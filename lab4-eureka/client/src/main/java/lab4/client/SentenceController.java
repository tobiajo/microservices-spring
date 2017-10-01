package lab4.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Controller
public class SentenceController {

    @Autowired
    DiscoveryClient client;

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
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
