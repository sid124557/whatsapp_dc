package X;

import com.whatsapp.util.Log;

/* renamed from: X.3bC  reason: invalid class name and case insensitive filesystem */
public final class C70873bC implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C95804uY A01;
    public final /* synthetic */ AnonymousClass3RO A02;
    public final /* synthetic */ AnonymousClass2SQ A03;
    public final /* synthetic */ C84814Du A04;
    public final /* synthetic */ C69873Yv A05;
    public final /* synthetic */ C69903Yy A06;

    public C70873bC(C95804uY r1, AnonymousClass3RO r2, AnonymousClass2SQ r3, C84814Du r4, C69873Yv r5, C69903Yy r6, long j) {
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = j;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
    }

    public final void run() {
        C69903Yy r8 = this.A06;
        C56842se r7 = this.A03.A02;
        C95804uY r6 = this.A01;
        long j = this.A00;
        AnonymousClass3RO r5 = this.A02;
        AnonymousClass5UP r1 = r7.A0E;
        if (!C18300x5.A1S(r1) || !r1.A01.A0Y(C58422vE.A02, 5185)) {
            C69873Yv r4 = this.A05;
            C84814Du r3 = this.A04;
            Log.e((Throwable) new C136776nF("Unable to start reactions senders list job", 0));
            if (!r4.element) {
                r3.BkD(new AnonymousClass1hB());
                r4.element = true;
                return;
            }
            return;
        }
        AnonymousClass1gw r12 = new AnonymousClass1gw(r6, r5, String.valueOf(j));
        r7.A07.A02(r12);
        r8.element = r12;
    }
}
