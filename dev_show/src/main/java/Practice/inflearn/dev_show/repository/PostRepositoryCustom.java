package Practice.inflearn.dev_show.repository;


import Practice.inflearn.dev_show.domain.Post;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(com.hodolog.api.request.PostSearch postSearch);
}
