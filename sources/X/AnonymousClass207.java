package X;

/* renamed from: X.207  reason: invalid class name */
public enum AnonymousClass207 {
    DOCUMENT_MESSAGE(3),
    IMAGE_MESSAGE(4),
    JPEG_THUMBNAIL(6),
    VIDEO_MESSAGE(7),
    LOCATION_MESSAGE(8),
    MEDIA_NOT_SET(0);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        DOCUMENT_MESSAGE = new AnonymousClass207("DOCUMENT_MESSAGE", 0, 3);
        IMAGE_MESSAGE = new AnonymousClass207("IMAGE_MESSAGE", 1, 4);
        JPEG_THUMBNAIL = new AnonymousClass207("JPEG_THUMBNAIL", 2, 6);
        VIDEO_MESSAGE = new AnonymousClass207("VIDEO_MESSAGE", 3, 7);
        LOCATION_MESSAGE = new AnonymousClass207("LOCATION_MESSAGE", 4, 8);
        MEDIA_NOT_SET = new AnonymousClass207("MEDIA_NOT_SET", 5, 0);
    }

    /* access modifiers changed from: public */
    AnonymousClass207(int i) {
        this.value = i;
    }
}
