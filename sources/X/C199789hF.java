package X;

import java.util.List;

/* renamed from: X.9hF  reason: invalid class name and case insensitive filesystem */
public class C199789hF implements Runnable {
    public final /* synthetic */ AnonymousClass9V8 A00;
    public final /* synthetic */ AnonymousClass9SP A01;

    public C199789hF(AnonymousClass9V8 r1, AnonymousClass9SP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass9V8 r1 = this.A00;
        C193399Oi r0 = r1.A03;
        C195349Xk r3 = r1.A04;
        AnonymousClass9W5 r2 = r0.A00;
        List A05 = r2.A05(r0.A01);
        if (!A05.isEmpty()) {
            C104855Sp r22 = r2.A04;
            AnonymousClass32L r12 = ((C194339Sm) C18290x4.A0k(A05)).A08;
            if (!r22.A02(r12)) {
                r22.A00.A01(C1899693i.A00(r3, r12), "download_pause");
            }
        }
    }
}
