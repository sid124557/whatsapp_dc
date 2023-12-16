package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3ae  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70533ae implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3ZH A02;
    public final /* synthetic */ AnonymousClass1gA A03;
    public final /* synthetic */ UserJid A04;

    public final void run() {
        AnonymousClass1gA r0 = this.A03;
        UserJid userJid = this.A04;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass3ZH r1 = this.A02;
        r0.A02.A0X(userJid, i, j);
        r1.A01 = i;
        r1.A09 = j;
    }

    public /* synthetic */ C70533ae(AnonymousClass3ZH r1, AnonymousClass1gA r2, UserJid userJid, int i, long j) {
        this.A03 = r2;
        this.A04 = userJid;
        this.A00 = i;
        this.A01 = j;
        this.A02 = r1;
    }
}
