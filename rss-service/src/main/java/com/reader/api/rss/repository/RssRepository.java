package com.reader.api.rss.repository;

import org.springframework.data.repository.CrudRepository;

import com.reader.api.rss.entity.RssEntity;

public interface RssRepository extends CrudRepository<RssEntity, Long> {

}
