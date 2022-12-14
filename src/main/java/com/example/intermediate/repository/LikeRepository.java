package com.example.intermediate.repository;

import com.example.intermediate.domain.Member;
import com.example.intermediate.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByIdAndPostId(Long likeId, Long postId);

    void deleteAllByPostId(Long postId);
    List<Like> findAllByPostId(Long postId);

    List<Like> findByMember (Member member);

}
