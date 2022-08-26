package com.admiralxy.cinema.services;

import com.admiralxy.cinema.services.interfaces.IStorageService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class StorageService implements IStorageService {

    @Override
    public void storeAsImage(MultipartFile file, String folderName, String imageName) {
        try {
            File tmp = new File(String.format("src/main/resources/images/%s/%s.jpg", folderName, imageName));

            ByteArrayInputStream bytesInput = new ByteArrayInputStream(file.getBytes());
            ByteArrayOutputStream bytesOutput = new ByteArrayOutputStream();

            BufferedImage image = ImageIO.read(bytesInput);

            if (image == null)
                throw new IOException();

            ImageIO.write(image, "jpg", bytesOutput);

            OutputStream outputStream = Files.newOutputStream(Paths.get(tmp.getAbsolutePath()));
            bytesOutput.writeTo(outputStream);
        } catch (IOException ignored) {}
    }

    @Override
    public byte[] load(String path) {
        try {
            File file = new File(path);
            return Files.readAllBytes(file.toPath());
        } catch (IOException exception) {
            return new byte[0];
        }
    }
}
