package com.example.carpool.Controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carpool.Model.Member;
import com.example.carpool.Repository.MemberRepository;



@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	MemberRepository memberRepository;

	@PostMapping("/RegisterMember,consumes = { MediaType.APPLICATION_JSON_VALUE }")
	public ResponseEntity<Member> createRegistration(@RequestBody Member member) throws ParseException {
		System.out.print("10");		
		List<Member> members = new ArrayList<Member>();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

		
		Date inputRegdDate =   (Date) formatter.parse(member.getRegdDate());
		memberRepository.findByPhoneNoAndRegdDate(member.getPhoneNo(),inputRegdDate ).forEach(members::add);
		try {
			if(members.size()==0) {
				String membID=member.getPhoneNo()+member.getRegdDate();
				Member memberToSave = new Member(membID,member.getPhoneNo(),member.getRegdDate(),member.getIsDriver());
				Member memberSaved = memberRepository.save(memberToSave);
						
				return new ResponseEntity<>( memberSaved, HttpStatus.CREATED);
			}
			else {
				return new ResponseEntity<>( members.get(0), HttpStatus.OK);
			}
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	

}
