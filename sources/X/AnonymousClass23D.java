package X;

/* renamed from: X.23D  reason: invalid class name */
public enum AnonymousClass23D implements C181358md {
    UNKNOWN(0),
    FBPAY(1),
    NOVI(2),
    UPI(3);
    
    public final int value;

    public static AnonymousClass23D A00(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FBPAY;
        }
        if (i == 2) {
            return NOVI;
        }
        if (i != 3) {
            return null;
        }
        return UPI;
    }

    /* access modifiers changed from: public */
    AnonymousClass23D(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
