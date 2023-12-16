package X;

/* renamed from: X.3Wc  reason: invalid class name and case insensitive filesystem */
public final class C69203Wc implements AnonymousClass4BY {
    public final C56982ss A00;

    public C69203Wc(C56982ss r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public C95814uZ BLb(C95814uZ r4) {
        C95814uZ r2;
        AnonymousClass31A A002 = C56982ss.A00(this.A00, r4);
        if (A002 == null || (r2 = A002.A05()) == null) {
            r2 = r4;
        }
        if (!C162457s7.A0P(r2, r4)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MatChatJidNormalizer/normalizeChatJid originalJid=");
            A0o.append(r4);
            C18260x0.A1R(A0o, " normalizedJid=", r2);
        }
        return r2;
    }
}
