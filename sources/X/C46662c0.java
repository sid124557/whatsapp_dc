package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2c0  reason: invalid class name and case insensitive filesystem */
public final class C46662c0 {
    public final C29441ip A00;
    public final C56422rx A01;
    public final C60032xt A02;
    public final C66543Lv A03;
    public final C50312hy A04;
    public final AnonymousClass1VX A05;

    public final void A00(UserJid userJid, AnonymousClass3ST r15, String str) {
        String str2;
        AnonymousClass2z0 r0;
        String str3 = "extensions-layout-prefetch-failed-error";
        if (this.A05.A0Y(C58422vE.A02, 3406)) {
            if (!this.A00.A0F()) {
                str3 = "extensions-layout-prefetch-network-error";
            }
            C60032xt r1 = this.A02;
            C624134x r02 = r15.A0P;
            if (r02 == null || (r0 = r02.A1J) == null) {
                str2 = null;
            } else {
                str2 = r0.A01;
            }
            r1.A02(this.A01, this.A03, this.A04, userJid, (Boolean) null, "galaxy_message", str, str2, (String) null, str3, (String) null);
        }
    }

    public C46662c0(C29441ip r2, C56422rx r3, C60032xt r4, C66543Lv r5, C50312hy r6, AnonymousClass1VX r7) {
        C18260x0.A0c(r3, r5, r6, r2);
        C162457s7.A0J(r7, 6);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
    }
}
