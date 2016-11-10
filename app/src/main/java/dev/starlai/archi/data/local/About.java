package dev.starlai.archi.data.local;

/**
 * Created by izayoi on 11/9/2016.
 */

public class About {
    private String currentVersion;
    private String latestVersion;
    private String versionDate;
    private String author;
    private String contact;

    public About(String currentVersion, String latestVersion, String versionDate, String author, String contact) {
        this.currentVersion = currentVersion;
        this.latestVersion = latestVersion;
        this.versionDate = versionDate;
        this.author = author;
        this.contact = contact;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
