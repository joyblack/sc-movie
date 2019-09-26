package com.joy.movieserviceuser.user.domain.repository;

import com.joy.movieserviceuser.common.domain.repository.BaseRepository;
import com.joy.movieserviceuser.user.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long>, BaseRepository<UserEntity> {
}
