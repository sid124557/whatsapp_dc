package X;

/* renamed from: X.239  reason: invalid class name */
public enum AnonymousClass239 implements C181358md {
    E2EE(0),
    HOSTED(1);
    
    public final int value;

    public static AnonymousClass239 A00(int i) {
        if (i == 0 || i != 1) {
            return E2EE;
        }
        return HOSTED;
    }

    /* access modifiers changed from: public */
    AnonymousClass239(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
