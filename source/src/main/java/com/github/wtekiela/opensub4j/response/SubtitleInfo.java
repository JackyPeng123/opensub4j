/**
 * Copyright (c) 2017 Wojciech Tekiela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.response;

public class SubtitleInfo {

    @OpenSubtitlesApi(fieldName = "IDSubtitle")
    private int id;

    @OpenSubtitlesApi(fieldName = "IDSubtitleFile")
    private int subtitleFileId;

    @OpenSubtitlesApi(fieldName = "subDownloadsCnt")
    private int downloadsNo;

    @OpenSubtitlesApi(fieldName = "languageName")
    private String language;

    @OpenSubtitlesApi(fieldName = "subFileName")
    private String fileName;

    @OpenSubtitlesApi(fieldName = "subFormat")
    private String format;

    @OpenSubtitlesApi(fieldName = "subtitlesLink")
    private String osLink;

    @OpenSubtitlesApi(fieldName = "subDownloadLink")
    private String downloadLink;

    @OpenSubtitlesApi(fieldName = "zipDownloadLink")
    private String zipDownloadLink;

    @OpenSubtitlesApi(fieldName = "subEncoding")
    private String encoding;

    public SubtitleInfo() {
    }

    public SubtitleInfo(int id, int subtitleFileId, String language, String fileName, String format, int downloadsNo,
                        String osLink, String downloadLink, String zipDownloadLink, String encoding) {
        this.id = id;
        this.subtitleFileId = subtitleFileId;
        this.language = language;
        this.fileName = fileName;
        this.format = format;
        this.downloadsNo = downloadsNo;
        this.osLink = osLink;
        this.downloadLink = downloadLink;
        this.zipDownloadLink = zipDownloadLink;
        this.encoding = encoding;
    }

    public int getId() {
        return id;
    }

    public int getSubtitleFileId() {
        return subtitleFileId;
    }

    public int getDownloadsNo() {
        return downloadsNo;
    }

    public String getLanguage() {
        return language;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFormat() {
        return format;
    }

    public String getOsLink() {
        return osLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public String getZipDownloadLink() {
        return zipDownloadLink;
    }

    public String getEncoding() {
        return encoding;
    }
}
