package X;

/* renamed from: X.2kc  reason: invalid class name and case insensitive filesystem */
public final class C51932kc {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C79413wa(this));

    public C51932kc(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final Boolean A00() {
        AnonymousClass66R r2 = this.A01;
        if (!C18310x6.A0F(r2).contains("pref_has_avatar_config")) {
            return null;
        }
        return Boolean.valueOf(C18280x3.A1W(C18310x6.A0F(r2), "pref_has_avatar_config"));
    }

    public final String A01() {
        return C18280x3.A0Z(C18310x6.A0F(this.A01), "pref_avatar_art_revision");
    }
}
