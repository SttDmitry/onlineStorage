package com.onlinestorage.repositories.interfaces;


import com.onlinestorage.entities.FileMetaDTO;

import java.util.Collection;
import java.util.UUID;

public interface IFileMetaProvider {
    String checkFileExists(UUID fileHash);

    void saveFileMeta(UUID Hash, String fileName, int subType);

    Collection<FileMetaDTO> getMetaFiles(int subType);
}
