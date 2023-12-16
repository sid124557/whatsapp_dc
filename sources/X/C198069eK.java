package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9eK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198069eK implements C84134Bd {
    public final /* synthetic */ C95814uZ A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ AnonymousClass3QO A02;
    public final /* synthetic */ AnonymousClass9PL A03;
    public final /* synthetic */ AnonymousClass9VS A04;
    public final /* synthetic */ C624134x A05;
    public final /* synthetic */ AnonymousClass39M A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ CountDownLatch A08;

    public final void AwB(Object obj) {
        AnonymousClass9VS r4 = this.A04;
        AnonymousClass9PL r3 = this.A03;
        AnonymousClass39M r8 = this.A06;
        C95814uZ r5 = this.A00;
        UserJid userJid = this.A01;
        C624134x r7 = this.A05;
        Integer num = this.A07;
        AnonymousClass3QO r2 = this.A02;
        CountDownLatch countDownLatch = this.A08;
        if (AnonymousClass001.A0K(obj) == 0) {
            r3.A01 = 1;
            r3.A03 = r4.A02(r5, userJid, r7, r8, num);
            r3.A02 = r2;
        } else {
            r3.A01 = 3;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ C198069eK(C95814uZ r1, UserJid userJid, AnonymousClass3QO r3, AnonymousClass9PL r4, AnonymousClass9VS r5, C624134x r6, AnonymousClass39M r7, Integer num, CountDownLatch countDownLatch) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = r6;
        this.A07 = num;
        this.A02 = r3;
        this.A08 = countDownLatch;
    }
}
