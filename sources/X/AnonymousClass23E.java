package X;

/* renamed from: X.23E  reason: invalid class name */
public enum AnonymousClass23E implements C181358md {
    GENERAL_ERROR(0),
    SUCCESS(1),
    NOT_FOUND(2),
    DECRYPTION_ERROR(3);
    
    public final int value;

    public static AnonymousClass23E A00(int i) {
        if (i == 0) {
            return GENERAL_ERROR;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return NOT_FOUND;
        }
        if (i != 3) {
            return null;
        }
        return DECRYPTION_ERROR;
    }

    /* access modifiers changed from: public */
    AnonymousClass23E(int i) {
        this.value = i;
    }

    public final int BA3() {
        return this.value;
    }
}
