package Practice.inflearn.dev_show.Repository;


import Practice.inflearn.dev_show.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
