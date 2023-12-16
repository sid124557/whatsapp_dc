package X;

/* renamed from: X.59U  reason: invalid class name */
public enum AnonymousClass59U implements C181358md {
    NONE(0),
    PBKDF2_HMAC_SHA512(1),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BA3() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw AnonymousClass001.A0c("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: public */
    AnonymousClass59U(int i) {
        this.value = i;
    }
}
