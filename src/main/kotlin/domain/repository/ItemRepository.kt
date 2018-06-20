package com.example.spring.boot.KotlinWebAppTemplate.domain.repository

import com.example.spring.boot.KotlinWebAppTemplate.domain.model.Item
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select

@Mapper
interface ItemRepository {

    @Insert("""
        INSERT INTO item
            (title)
        VALUES
            (#{title})
    """)
    @Options(useGeneratedKeys = true)
    fun insert(item: Item)

    @Select("""
        SELECT
            id, title
        FROM
            item
        WHERE
            id = #{id}
    """)
    fun select(id: Int): Item

    @Select("""
        SELECT
            id, title
        FROM
            item
    """)
    fun findAll(): List<Item>

}