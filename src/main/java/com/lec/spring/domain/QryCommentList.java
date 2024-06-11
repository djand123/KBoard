package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data //클래스에 대해 getter, setter, toString, equals, hashCode 메서드를 자동으로 생성합니다
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성합니다.
public class QryCommentList extends QryResult{

    @ToString.Exclude
    @JsonProperty("data")
    List<Comment> list;

}
