package X;

/* renamed from: X.209  reason: invalid class name */
public enum AnonymousClass209 {
    DOCUMENT_MESSAGE(1),
    HYDRATED_TITLE_TEXT(2),
    IMAGE_MESSAGE(3),
    VIDEO_MESSAGE(4),
    LOCATION_MESSAGE(5),
    TITLE_NOT_SET(0);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        DOCUMENT_MESSAGE = new AnonymousClass209("DOCUMENT_MESSAGE", 0, 1);
        HYDRATED_TITLE_TEXT = new AnonymousClass209("HYDRATED_TITLE_TEXT", 1, 2);
        IMAGE_MESSAGE = new AnonymousClass209("IMAGE_MESSAGE", 2, 3);
        VIDEO_MESSAGE = new AnonymousClass209("VIDEO_MESSAGE", 3, 4);
        LOCATION_MESSAGE = new AnonymousClass209("LOCATION_MESSAGE", 4, 5);
        TITLE_NOT_SET = new AnonymousClass209("TITLE_NOT_SET", 5, 0);
    }

    /* access modifiers changed from: public */
    AnonymousClass209(int i) {
        this.value = i;
    }
}
