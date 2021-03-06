package org.zerock.guestbook.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.zerock.guestbook.entity.Board2;


public interface BoardRepository extends JpaRepository<Board2, Long>
, QuerydslPredicateExecutor<Board2>{


//    @Query("select b, w from Board b left join b.writer w where b.bno =:bno")
//    Object getBoardWithWriter(@Param("bno") Long bno);
//
//    @Query("SELECT b, r FROM Board b LEFT JOIN Reply r ON r.board = b WHERE b.bno = :bno")
//    List<Object[]> getBoardWithReply(@Param("bno") Long bno);
//
//    @Query(value ="SELECT b, w, count(r) " +
//            " FROM Board b " +
//            " LEFT JOIN b.writer w " +
//            " LEFT JOIN Reply r ON r.board = b " +
//            " GROUP BY b",
//            countQuery ="SELECT count(b) FROM Board b")
//    Page<Object[]> getBoardWithReplyCount(Pageable pageable);
//
//
//    @Query("SELECT b, w, count(r) " +
//            " FROM Board b LEFT JOIN b.writer w " +
//            " LEFT OUTER JOIN Reply r ON r.board = b" +
//            " WHERE b.gno1 = :gno1")
//    Object getBoardByBno(@Param("gno1") Long gno1);
	
	
}