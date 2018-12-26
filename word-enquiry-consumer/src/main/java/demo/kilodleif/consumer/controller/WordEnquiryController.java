package demo.kilodleif.consumer.controller;

import demo.kilodleif.consumer.service.WordEnquiryConsumerService;
import demo.kilodleif.provider.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kilodleif
 * @date 2018-12-26 12:34
 */
@RestController
public class WordEnquiryController {

    @Autowired
    private WordEnquiryConsumerService wordEnquiryConsumerService;

    @GetMapping("/getWordDetail")
    public Word getWordDetail(){
        return wordEnquiryConsumerService.consumeWordEnquiryService();
    }

}
