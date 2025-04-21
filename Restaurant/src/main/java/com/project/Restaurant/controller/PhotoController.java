package com.project.Restaurant.controller;

import com.project.Restaurant.domain.dto.PhotoDto;
import com.project.Restaurant.domain.entity.Photo;
import com.project.Restaurant.mapper.PhotoMapper;
import com.project.Restaurant.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/photos")
public class PhotoController {

    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public ResponseEntity<PhotoDto> uploadPhoto(@RequestParam("file") MultipartFile file) {
        Photo savedPhoto = photoService.uploadPhoto(file);
        return ResponseEntity.ok(photoMapper.toDto(savedPhoto));
    }
}
