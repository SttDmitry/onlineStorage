package com.onlinestorage.repositories.interfaces;


import com.onlinestorage.entities.FileMetaDTO;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public interface IFileMetaProvider {
    String checkFileExists(UUID fileHash);

    void saveFileMeta(UUID Hash, String fileName, int subType, long fileSize, LocalDateTime dateOfSave);

    Collection<FileMetaDTO> getMetaFiles(int subType);
}
