package com.example.carpool.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.carpool.Model.Member;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	List<Member> findByPhoneNoAndRegdDate(String phoneNo, Date regdDate);
	
}
