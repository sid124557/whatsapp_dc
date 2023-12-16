package X;

/* renamed from: X.23C  reason: invalid class name */
public enum AnonymousClass23C implements C181358md {
    DEFAULT(0),
    OFF(1),
    ON(2);
    
    public final int value;

    public static AnonymousClass23C A00(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return null;
        }
        return ON;
    }

    /* access modifiers changed from: public */
    AnonymousClass23C(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
