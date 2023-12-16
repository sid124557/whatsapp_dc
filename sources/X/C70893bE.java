package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3bE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70893bE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C130066bK A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ AnonymousClass3ZC A04;
    public final /* synthetic */ C47472dJ A05;
    public final /* synthetic */ byte[] A06;

    public final void run() {
        Object obj;
        C47472dJ r3 = this.A05;
        UserJid userJid = this.A03;
        byte[] bArr = this.A06;
        int i = this.A00;
        AnonymousClass3ZC r5 = this.A04;
        long j = this.A01;
        C130066bK r2 = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert jid=");
        A0o.append(userJid);
        A0o.append(" certBlob=[");
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        A0o.append(obj);
        A0o.append("] vlevel=");
        A0o.append(i);
        C18260x0.A1L(A0o, C18300x5.A0k(r5, ". privactMode=", A0o));
        try {
            ((C46592bt) r3.A06.get()).A00(userJid, r5, bArr, i, j);
        } finally {
            r2.A05((Object) null);
        }
    }

    public /* synthetic */ C70893bE(C130066bK r1, UserJid userJid, AnonymousClass3ZC r3, C47472dJ r4, byte[] bArr, int i, long j) {
        this.A05 = r4;
        this.A03 = userJid;
        this.A06 = bArr;
        this.A00 = i;
        this.A04 = r3;
        this.A01 = j;
        this.A02 = r1;
    }
}
