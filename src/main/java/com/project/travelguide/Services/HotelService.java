package com.project.travelguide.Services;

import org.springframework.web.multipart.MultipartFile;

public interface HotelService {
    HotelCommand saveHotelCommand(HotelCommand command);
    Hotels findById(Long l);
    HotelCommand findCommandById(Long l);
    void saveImageFile(Long id, MultipartFile file);
}
