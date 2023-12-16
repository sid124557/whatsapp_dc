package X;

/* renamed from: X.208  reason: invalid class name */
public enum AnonymousClass208 {
    DOCUMENT_MESSAGE(1),
    HIGHLY_STRUCTURED_MESSAGE(2),
    IMAGE_MESSAGE(3),
    VIDEO_MESSAGE(4),
    LOCATION_MESSAGE(5),
    TITLE_NOT_SET(0);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        DOCUMENT_MESSAGE = new AnonymousClass208("DOCUMENT_MESSAGE", 0, 1);
        HIGHLY_STRUCTURED_MESSAGE = new AnonymousClass208("HIGHLY_STRUCTURED_MESSAGE", 1, 2);
        IMAGE_MESSAGE = new AnonymousClass208("IMAGE_MESSAGE", 2, 3);
        VIDEO_MESSAGE = new AnonymousClass208("VIDEO_MESSAGE", 3, 4);
        LOCATION_MESSAGE = new AnonymousClass208("LOCATION_MESSAGE", 4, 5);
        TITLE_NOT_SET = new AnonymousClass208("TITLE_NOT_SET", 5, 0);
    }

    /* access modifiers changed from: public */
    AnonymousClass208(int i) {
        this.value = i;
    }
}
