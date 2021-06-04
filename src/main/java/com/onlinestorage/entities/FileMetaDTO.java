package com.onlinestorage.entities;


import java.util.Date;
import java.util.UUID;

public class FileMetaDTO {
    private UUID hash;

    private String fileName;

    private long fileSize;

    private Date dateOfSave;

    public FileMetaDTO(String fileName) {
        this.fileName = fileName;
    }

    public UUID getHash() {
        return hash;
    }

    public void setHash(UUID hash) {
        this.hash = hash;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public Date getDateOfSave() {
        return dateOfSave;
    }

    public void setDateOfSave(Date dateOfSave) {
        this.dateOfSave = dateOfSave;
    }
}
