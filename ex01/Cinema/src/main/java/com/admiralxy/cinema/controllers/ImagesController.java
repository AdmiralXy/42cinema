package com.admiralxy.cinema.controllers;

import com.admiralxy.cinema.services.interfaces.IStorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("images/{folderName}/{imageName}")
public class ImagesController {

    private final IStorageService storageService;

    public ImagesController(IStorageService storageService) {
        this.storageService = storageService;
    }

    @ResponseBody
    @GetMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<?> index(@PathVariable("folderName") String folderName, @PathVariable("imageName") String imageName) {
        String imagePath = String.format("src/main/resources/images/%s/%s", folderName, imageName);
        String placeholderPath = "src/main/resources/images/placeholder.jpg";

        byte[] image = this.storageService.load(imagePath);
        byte[] placeholder = this.storageService.load(placeholderPath);

        if (image.length > 0)
            return new ResponseEntity<>(image, HttpStatus.OK);
        else if (placeholder.length > 0)
            return new ResponseEntity<>(placeholder, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
