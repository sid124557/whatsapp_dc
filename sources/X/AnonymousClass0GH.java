package X;

/* renamed from: X.0GH  reason: invalid class name */
public enum AnonymousClass0GH {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static AnonymousClass0GH A00(AnonymousClass0GC r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            return ON_DESTROY;
        }
        if (ordinal == 3) {
            return ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return ON_PAUSE;
    }

    public AnonymousClass0GC A01() {
        switch (ordinal()) {
            case 0:
            case 4:
                return AnonymousClass0GC.CREATED;
            case 1:
            case 3:
                return AnonymousClass0GC.STARTED;
            case 2:
                return AnonymousClass0GC.RESUMED;
            case 5:
                return AnonymousClass0GC.DESTROYED;
            default:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(this);
                throw AnonymousClass000.A0F(" has no target state", A0o);
        }
    }
}
