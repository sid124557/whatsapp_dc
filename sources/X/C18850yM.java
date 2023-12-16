package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0yM  reason: invalid class name and case insensitive filesystem */
public class C18850yM extends Handler {
    public final /* synthetic */ C28871hu A00;
    public final /* synthetic */ C56982ss A01;
    public final /* synthetic */ C50012hU A02;
    public final /* synthetic */ C29431io A03;
    public final /* synthetic */ C620233e A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18850yM(Looper looper, C28871hu r2, C56982ss r3, C50012hU r4, C29431io r5, C620233e r6) {
        super(looper);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        C28871hu r2;
        C95814uZ r1;
        int i = message.what;
        if (i == 1) {
            r2 = this.A00;
            r1 = C18310x6.A0S((String) message.obj);
            C626936e.A06(r1);
        } else if (i == 2) {
            r1 = C18310x6.A0S((String) message.obj);
            C626936e.A06(r1);
            this.A03.A09(r1);
            r2 = this.A00;
        } else if (i == 8) {
            C620233e r0 = this.A04;
            r0.A0A();
            ConcurrentHashMap concurrentHashMap = r0.A09;
            C626936e.A06(concurrentHashMap);
            concurrentHashMap.clear();
            C29431io r3 = this.A03;
            r3.A09(C135166kE.A00);
            Iterator it = this.A01.A0F().iterator();
            while (it.hasNext()) {
                C95814uZ A0P = C18300x5.A0P(it);
                r3.A09(A0P);
                this.A00.A0A(A0P, true);
            }
            return;
        } else if (i == 9) {
            C620233e r02 = this.A04;
            r02.A0A();
            ConcurrentHashMap concurrentHashMap2 = r02.A09;
            C626936e.A06(concurrentHashMap2);
            concurrentHashMap2.clear();
            C29431io r8 = this.A03;
            r8.A09(C135166kE.A00);
            C56982ss r7 = this.A01;
            Iterator it2 = r7.A0F().iterator();
            while (it2.hasNext()) {
                C95814uZ A0P2 = C18300x5.A0P(it2);
                if (!(A0P2 instanceof C27991fJ)) {
                    r7.A0I(A0P2);
                    C28871hu r32 = this.A00;
                    C69253Wh.A01(r32.A00, new C70093Zw(r32, 16, A0P2));
                } else {
                    this.A00.A0A(A0P2, true);
                }
                r8.A09(A0P2);
            }
            return;
        } else {
            return;
        }
        r2.A0A(r1, false);
    }
}
