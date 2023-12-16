package X;

/* renamed from: X.1ee  reason: invalid class name and case insensitive filesystem */
public final class C27781ee extends C50432iA {
    public final C51932kc A00;
    public final C49192g8 A01;
    public final C67493Pm A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27781ee(X.C29441ip r13, X.C56612sH r14, X.C620733j r15, X.AnonymousClass4FV r16, X.C52512lb r17, X.C51932kc r18, X.C67473Pk r19, X.C49192g8 r20, X.C67493Pm r21, X.C67503Pn r22, X.AnonymousClass4FS r23) {
        /*
            r12 = this;
            r4 = r14
            r5 = r15
            r6 = r16
            r9 = r22
            r11 = r23
            X.C18260x0.A0f(r14, r11, r6, r15, r9)
            r3 = r13
            r10 = r17
            X.C18260x0.A0U(r13, r10)
            r0 = 11
            r1 = r18
            X.C162457s7.A0J(r1, r0)
            r2 = r12
            r7 = r19
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r8
            r0 = r20
            r12.A01 = r0
            r12.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27781ee.<init>(X.1ip, X.2sH, X.33j, X.4FV, X.2lb, X.2kc, X.3Pk, X.2g8, X.3Pm, X.3Pn, X.4FS):void");
    }

    public C58852vv A00() {
        String A012 = this.A00.A01();
        AnonymousClass66R r6 = this.A02.A00.A01;
        boolean A0P = C162457s7.A0P(A012, C18310x6.A0F(r6).getString("pref_avatar_sticker_search_dictionary_revision", (String) null));
        C49192g8 r4 = this.A01;
        boolean A0P2 = C162457s7.A0P(r4.A01(), C18310x6.A0F(r6).getString("pref_avatar_sticker_search_dictionary_filters", (String) null));
        boolean A0P3 = C162457s7.A0P(r4.A00(), C18310x6.A0F(r6).getString("pref_avatar_sticker_search_dictionary_country_code", (String) null));
        if (!A0P || !A0P2 || !A0P3) {
            return new C58852vv((AnonymousClass225) null, (String) null, (String) null, (String) null, 0, 0);
        }
        return super.A00();
    }
}
