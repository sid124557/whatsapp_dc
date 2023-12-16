package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3av  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70703av implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C61252zx A01;
    public final /* synthetic */ AnonymousClass1QN A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass3ST A04;
    public final /* synthetic */ String A05;

    public final void run() {
        C61252zx r3 = this.A01;
        AnonymousClass1QN r4 = this.A02;
        long j = this.A00;
        AnonymousClass3ST r6 = this.A04;
        UserJid userJid = this.A03;
        String str = this.A05;
        String A002 = C380125b.A00(r3, r4.A0D);
        r4.A05.A0F(new AnonymousClass3M2(r4, userJid, r6, str, j), r3.A0A, A002);
    }

    public /* synthetic */ C70703av(C61252zx r1, AnonymousClass1QN r2, UserJid userJid, AnonymousClass3ST r4, String str, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
        this.A04 = r4;
        this.A03 = userJid;
        this.A05 = str;
    }
}
