package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3b8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70833b8 implements Runnable {
    public final /* synthetic */ AnonymousClass4AC A00;
    public final /* synthetic */ C56162rW A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        C56162rW r5 = this.A01;
        Integer num = this.A03;
        AnonymousClass4AC r4 = this.A00;
        UserJid userJid = this.A02;
        boolean z = this.A06;
        String str = this.A04;
        String str2 = this.A05;
        if (r5.A05(num)) {
            r4.BLI((C41572Kt) null, 3, "extensions-metadata-response-error", true);
            return;
        }
        r5.A06.A09(num, "metadata_network_start");
        r5.A01.A00(userJid.getRawString()).Bh4(new C67253Oo(r4, r5, userJid, num, str, str2, z));
    }

    public /* synthetic */ C70833b8(AnonymousClass4AC r1, C56162rW r2, UserJid userJid, Integer num, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A03 = num;
        this.A00 = r1;
        this.A02 = userJid;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
    }
}
