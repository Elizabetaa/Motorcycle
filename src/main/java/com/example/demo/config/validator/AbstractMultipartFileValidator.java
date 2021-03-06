package com.example.demo.config.validator;


import org.springframework.web.multipart.MultipartFile;

class AbstractMultipartFileValidator {
    boolean isPresent(MultipartFile file) {
        return !isAbsent(file);
    }

    boolean isAbsent(MultipartFile file) {
        return file == null || file.isEmpty() && file.getOriginalFilename().isEmpty();
    }
}