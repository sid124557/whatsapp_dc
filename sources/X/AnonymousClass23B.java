package X;

/* renamed from: X.23B  reason: invalid class name */
public enum AnonymousClass23B implements C181358md {
    UNKNOWN(0),
    KEEP_FOR_ALL(1),
    UNDO_KEEP_FOR_ALL(2);
    
    public final int value;

    public static AnonymousClass23B A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return KEEP_FOR_ALL;
        }
        if (i != 2) {
            return null;
        }
        return UNDO_KEEP_FOR_ALL;
    }

    /* access modifiers changed from: public */
    AnonymousClass23B(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
