package com.example.spring.boot.KotlinWebAppTemplate.app

import com.example.spring.boot.KotlinWebAppTemplate.domain.repository.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView


@Controller
class ItemController @Autowired constructor(private val itemRepository: ItemRepository) {
    @RequestMapping("/")
    fun root(): ModelAndView{
        return items()
    }

    @RequestMapping("/items")
    fun items(): ModelAndView = ModelAndView("/item").apply { addObject("items", itemRepository.findAll()) }
}