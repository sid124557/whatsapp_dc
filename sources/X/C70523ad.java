package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3ad  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70523ad implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass2PW A03;
    public final /* synthetic */ UserJid A04;

    public final void run() {
        AnonymousClass2PW r5 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        long j = this.A02;
        UserJid userJid = this.A04;
        AnonymousClass1ZV r7 = new AnonymousClass1ZV();
        r7.A01 = Integer.valueOf(i);
        r7.A02 = Integer.valueOf(i2);
        r7.A03 = Long.valueOf(j);
        boolean z = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass1VX r3 = r5.A00;
        C58422vE r1 = C58422vE.A02;
        boolean A0Y = r3.A0Y(r1, 2888);
        Boolean valueOf = Boolean.valueOf(A0Y);
        boolean A0Y2 = r3.A0Y(r1, 2887);
        Boolean valueOf2 = Boolean.valueOf(A0Y2);
        C44602Ws r0 = r5.A02;
        if (!A0Y && !A0Y2) {
            z = false;
        }
        r0.A00(userJid, new AnonymousClass3SE(r7, userJid, valueOf, valueOf2, countDownLatch), z);
        try {
            countDownLatch.await();
            r5.A01.BhD(r7);
        } catch (InterruptedException e) {
            Log.e("log interrupted", e);
        }
    }

    public /* synthetic */ C70523ad(AnonymousClass2PW r1, UserJid userJid, int i, int i2, long j) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = userJid;
    }
}
