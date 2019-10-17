package com.gwmall.upload.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author FengZongMin
 * @version 1.0
 * @ClassName UploadController
 * @Description TODO
 * @CreateDate 2019-10-17 18:55
 * @UpdateDate 2019-10-17 18:55
 **/
@RestController
@RequestMapping("upload")
public class UploadController {
    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile){

    }
}
