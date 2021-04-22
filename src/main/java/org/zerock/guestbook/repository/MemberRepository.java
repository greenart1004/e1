package org.zerock.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.zerock.guestbook.entity.Member1;

public interface MemberRepository extends JpaRepository<Member1, String>
, QuerydslPredicateExecutor<Member1>{

}
