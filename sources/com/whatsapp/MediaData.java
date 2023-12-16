package com.whatsapp;

import X.AnonymousClass000;
import java.io.File;
import java.io.Serializable;

public class MediaData implements Serializable {
    public static final long serialVersionUID = -3211751283609594L;
    public boolean autodownloadRetryEnabled;
    public long cachedDownloadedBytes;
    public byte[] cipherKey;
    public String directPath;
    public String doodleId;
    public int faceX;
    public int faceY;
    @Deprecated
    public int failErrorCode;
    public File file;
    public long fileSize;
    public int firstScanLength;
    public byte[] firstScanSidecar;
    public int gifAttribution;
    public boolean hasStreamingSidecar;
    public int height;
    public byte[] hmacKey;
    public InteractiveAnnotation[] interactiveAnnotations;
    public byte[] iv;
    public String mediaJobUuid;
    public byte[] mediaKey;
    public long mediaKeyTimestampMs;
    public long progress;
    @Deprecated
    public byte[] refKey;
    @Deprecated
    public boolean showDownloadedBytes;
    public int suspiciousContent;
    public float thumbnailHeightWidthRatio;
    public boolean transcoded;
    public boolean transferred;
    public long trimFrom;
    public long trimTo;
    @Deprecated
    public boolean uploadRetry;
    @Deprecated
    public String uploadUrl;
    public int width;

    public boolean equals(Object obj) {
        return AnonymousClass000.A1Y(this, obj);
    }
}
