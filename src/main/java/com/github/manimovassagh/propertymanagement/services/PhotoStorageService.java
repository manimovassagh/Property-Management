package com.github.manimovassagh.propertymanagement.services;

public interface PhotoStorageService {

    // Saves the photo and returns its URL
    String uploadPhoto(byte[] photoData, String originalFilename);

    // Optionally, deletes the photo by URL
    void deletePhoto(String photoUrl);
}