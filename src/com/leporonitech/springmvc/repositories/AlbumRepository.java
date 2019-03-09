package com.leporonitech.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leporonitech.springmvc.domains.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
