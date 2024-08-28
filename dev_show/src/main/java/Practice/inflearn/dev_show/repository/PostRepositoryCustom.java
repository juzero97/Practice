package Practice.inflearn.dev_show.repository;


import Practice.inflearn.dev_show.domain.Post;
import Practice.inflearn.dev_show.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
