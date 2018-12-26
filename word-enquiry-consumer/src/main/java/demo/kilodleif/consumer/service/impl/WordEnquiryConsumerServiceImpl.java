package demo.kilodleif.consumer.service.impl;

import demo.kilodleif.consumer.service.WordEnquiryConsumerService;
import demo.kilodleif.provider.service.WordEnquiryService;
import demo.kilodleif.provider.entity.Word;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author kilodleif
 * @date 2018-12-26 14:12
 */
@Service
public class WordEnquiryConsumerServiceImpl implements WordEnquiryConsumerService {

    @Reference(version = "0.0.1")
    private WordEnquiryService wordEnquiryService;

    @Override
    public Word consumeWordEnquiryService() {
        return wordEnquiryService.getWordDetail();
    }
}
