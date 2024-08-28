package Practice.inflearn.dev_show.repository;


import Practice.inflearn.dev_show.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {

}
