package com.onlinestorage.services.interfaces;


import com.onlinestorage.entities.FileMetaDTO;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public interface IFileStoreService {
    String storeFile(byte[] content, String fileName, int subFileType, long fileSize, LocalDateTime dateOfSave) throws IOException, NoSuchAlgorithmException;

    byte[] getFile(UUID md5) throws IOException;

    Collection<FileMetaDTO> getMetaFiles(int subtype);
}
