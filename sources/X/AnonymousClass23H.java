package X;

/* renamed from: X.23H  reason: invalid class name */
public enum AnonymousClass23H implements C181358md {
    UNKNOWN(0),
    EMPTY(1),
    TEXT(2),
    DOCUMENT(3),
    IMAGE(4),
    VIDEO(5),
    LOCATION(6);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass23H(int i) {
        this.value = i;
    }

    public static AnonymousClass23H A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return EMPTY;
            case 2:
                return TEXT;
            case 3:
                return DOCUMENT;
            case 4:
                return IMAGE;
            case 5:
                return VIDEO;
            case 6:
                return LOCATION;
            default:
                return null;
        }
    }

    public final int BA3() {
        return this.value;
    }
}
