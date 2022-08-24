package com.admiralxy.cinema.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {
    void storeAsImage(MultipartFile file, String folderName, String imageName);
    byte[] load(String path);
}
