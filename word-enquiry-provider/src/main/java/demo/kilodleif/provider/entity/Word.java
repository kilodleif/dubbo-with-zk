package demo.kilodleif.provider.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kilodleif
 * @date 2018-12-26 12:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Word implements Serializable {

    private Integer wordId;

    private String wordName;

    private String wordMeaning;

}
