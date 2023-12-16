package X;

/* renamed from: X.22A  reason: invalid class name */
public enum AnonymousClass22A {
    EMOJI,
    GIFS,
    AVATAR_STICKERS,
    STICKERS;

    /* access modifiers changed from: public */
    static {
        AnonymousClass22A[] r0;
        A00 = C73653fr.A00(r0);
    }

    public String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "EMOJI";
        }
        if (ordinal == 1) {
            return "GIFS";
        }
        if (ordinal == 2) {
            return "AVATAR_STICKERS";
        }
        if (ordinal == 3) {
            return "STICKERS";
        }
        throw C73153f1.A00();
    }
}
