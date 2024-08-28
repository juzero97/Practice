package Practice.inflearn.dev_show.domain;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob
    private String content;

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public com.hodolog.api.domain.PostEditor.PostEditorBuilder toEditor() {
        return com.hodolog.api.domain.PostEditor.builder()
                .title(title)
                .content(content);
    }

    public void edit(com.hodolog.api.domain.PostEditor postEditor) {
        title = postEditor.getTitle();
        content = postEditor.getContent();
    }
}









