package br.com.api.weplant.repositories;

import br.com.api.weplant.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}