package com.lec.spring.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data //클래스에 대해 getter, setter, toString, equals, hashCode 메서드를 자동으로 생성합니다
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성합니다.
@AllArgsConstructor //모든 필드를 포함하는 생성자를 생성합니다
@Builder // builder pattern 사용 가능
public class Post {
    private Long id;
    private String subject;
    private String content;
    private LocalDateTime regDate;
    private Long viewCnt;

    private User user; //글 작성자 (FK)

    // 첨부파일
    @ToString.Exclude
    @Builder.Default //builder 제공안함
    private List<Attachment> fileList = new ArrayList<>();
}
