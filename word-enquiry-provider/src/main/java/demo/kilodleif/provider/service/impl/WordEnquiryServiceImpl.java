package demo.kilodleif.provider.service.impl;

import demo.kilodleif.provider.entity.Word;
import demo.kilodleif.provider.service.WordEnquiryService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author kilodleif
 * @date 2018-12-26 14:03
 */
@Service(version = "0.0.1")
public class WordEnquiryServiceImpl implements WordEnquiryService {

    @Override
    public Word getWordDetail() {
        return new Word(1, "heureux", "happy");
    }
}
