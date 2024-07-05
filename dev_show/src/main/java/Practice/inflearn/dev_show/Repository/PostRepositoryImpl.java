package Practice.inflearn.dev_show.Repository;


import Practice.inflearn.dev_show.domain.Post;
import Practice.inflearn.dev_show.domain.QPost;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {
    private final JPAQueryFactory jpaqueryfactory;

    @Override
    public List<Post> getList(int page) {

        jpaqueryfactory.select(QPost.post)
                .limit(10)
                .offset((long)(page -1) * 10)
                .fetch();

        return List.of();
    }
}
