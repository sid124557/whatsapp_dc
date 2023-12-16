package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3SE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SE implements AnonymousClass4B0 {
    public final /* synthetic */ AnonymousClass1ZV A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ CountDownLatch A04;

    public final void BVe(Integer num) {
        int intValue;
        Boolean bool = this.A02;
        AnonymousClass1ZV r4 = this.A00;
        Boolean bool2 = this.A03;
        UserJid userJid = this.A01;
        CountDownLatch countDownLatch = this.A04;
        if (bool.booleanValue()) {
            r4.A00 = num;
        }
        if (bool2.booleanValue() && num != null && ((intValue = num.intValue()) == 2 || intValue == 3)) {
            r4.A04 = userJid.getRawString();
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ AnonymousClass3SE(AnonymousClass1ZV r1, UserJid userJid, Boolean bool, Boolean bool2, CountDownLatch countDownLatch) {
        this.A02 = bool;
        this.A00 = r1;
        this.A03 = bool2;
        this.A01 = userJid;
        this.A04 = countDownLatch;
    }
}
