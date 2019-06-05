package com.moonstudio.jpa;

import com.moonstudio.pojo.Msg;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
@CacheConfig(cacheNames = "msg")
public interface MsgJpa extends JpaRepository<Msg, Long>, JpaSpecificationExecutor<Msg>, Serializable {
    @Cacheable
    @Query("select c.age,c.opinion from Msg c WHERE c.age=:age ")
    public List<Msg> findByAge(@Param("age") String age);
}