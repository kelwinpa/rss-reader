package com.reader.api.rss.repository;

import org.springframework.data.repository.CrudRepository;

import com.reader.api.rss.model.RssModel;

public interface RssRepository extends CrudRepository<RssModel, Long> {

}
