package X;

/* renamed from: X.23I  reason: invalid class name */
public enum AnonymousClass23I implements C181358md {
    INITIAL_BOOTSTRAP(0),
    INITIAL_STATUS_V3(1),
    FULL(2),
    RECENT(3),
    PUSH_NAME(4),
    NON_BLOCKING_DATA(5),
    ON_DEMAND(6);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass23I(int i) {
        this.value = i;
    }

    public static AnonymousClass23I A00(int i) {
        switch (i) {
            case 0:
                return INITIAL_BOOTSTRAP;
            case 1:
                return INITIAL_STATUS_V3;
            case 2:
                return FULL;
            case 3:
                return RECENT;
            case 4:
                return PUSH_NAME;
            case 5:
                return NON_BLOCKING_DATA;
            case 6:
                return ON_DEMAND;
            default:
                return null;
        }
    }

    public final int BA3() {
        return this.value;
    }
}
