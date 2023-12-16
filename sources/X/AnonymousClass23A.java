package X;

/* renamed from: X.23A  reason: invalid class name */
public enum AnonymousClass23A implements C181358md {
    FULL(1),
    TALL(2),
    COMPACT(3);
    
    public final int value;

    public static AnonymousClass23A A00(int i) {
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return TALL;
        }
        if (i != 3) {
            return null;
        }
        return COMPACT;
    }

    /* access modifiers changed from: public */
    AnonymousClass23A(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
