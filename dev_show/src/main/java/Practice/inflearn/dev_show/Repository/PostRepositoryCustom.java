package Practice.inflearn.dev_show.Repository;

import Practice.inflearn.dev_show.domain.Post;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(int page);
}