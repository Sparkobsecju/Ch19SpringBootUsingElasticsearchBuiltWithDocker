package com.example.ch19.persistence.repository;

import com.example.ch19.persistence.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
    /**
     * 透過圖書標題關鍵字模糊查詢圖書
     * @param title 圖書標題
     * @return 圖書列表
     */
    List<Book> findByTitleLike(String title);

    @Query("{\"match\": {\"title\": {\"query\": \"?0\"}}}")
    Page<Book> findByTitleCustom(String title, Pageable pageable);
}
