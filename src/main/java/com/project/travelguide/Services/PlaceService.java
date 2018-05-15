package com.project.travelguide.Services;

import org.springframework.web.multipart.MultipartFile;

public interface PlaceService {
    PlaceDetailsCommand savePlaceDetailsCommand(PlaceDetailsCommand command);
    PlaceDetails findById(Long l);
    PlaceDetailsCommand findCommandById(Long l);
    void saveImageFile(Long id, MultipartFile file);
}
