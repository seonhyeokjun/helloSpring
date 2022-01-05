package com.hello.hellospring;

import com.hello.hellospring.aop.TimeTraceAop;
import com.hello.hellospring.repository.*;
import com.hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    //private DataSource dataSource;
    //private EntityManager em;
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

//    @Autowired
//    public SpringConfig(DataSource dataSource){
//        this.dataSource = dataSource;
//    }

//    @Autowired
//    public SpringConfig(EntityManager em){
//        this.em = em;
//    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        //return new MemoryMemberRepository();
//        //return new JdbcMemberRepository(dataSource);
//        //return new JdbcTemplateMemberRepository(dataSource);
//        //return new JpaMemberRepository(em);
//    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
}
