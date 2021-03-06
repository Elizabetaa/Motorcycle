package com.example.demo.service;

import com.example.demo.model.entity.enums.BlogCategoryNameEnum;
import com.example.demo.model.service.AddBlogServiceModel;
import com.example.demo.model.view.BlogDetailsViewModel;
import com.example.demo.model.view.BlogViewModel;

import java.io.IOException;
import java.util.List;

public interface BlogService {
    void addBlog(AddBlogServiceModel map) throws IOException;

    List<BlogViewModel> findFirstFour();

    List<BlogViewModel> findByCategory(BlogCategoryNameEnum motorcycle);

    BlogDetailsViewModel findById(Long id);

    void initBlog() throws IOException;
}
