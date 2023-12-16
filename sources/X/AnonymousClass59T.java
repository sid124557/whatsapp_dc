package X;

/* renamed from: X.59T  reason: invalid class name */
public enum AnonymousClass59T implements C181358md {
    UTF8(0),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BA3() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw AnonymousClass001.A0c("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: public */
    AnonymousClass59T(int i) {
        this.value = i;
    }
}
