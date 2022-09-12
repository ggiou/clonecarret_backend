package com.example.intermediate.repository;

import com.example.intermediate.domain.Like;
import com.example.intermediate.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByLikeIdAndPostId(Long likeId, Long postId);
    List<Like> findByMember (Member member);
}