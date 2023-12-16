package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.9iw  reason: invalid class name and case insensitive filesystem */
public class C200819iw implements Runnable {
    public final /* synthetic */ AnonymousClass9V8 A00;
    public final /* synthetic */ AnonymousClass9TM A01;
    public final /* synthetic */ boolean A02;

    public C200819iw(AnonymousClass9V8 r1, AnonymousClass9TM r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public void run() {
        boolean z = this.A02;
        AnonymousClass9V8 r1 = this.A00;
        C193399Oi r0 = r1.A03;
        if (z) {
            C195349Xk r3 = r1.A04;
            AnonymousClass9W5 r2 = r0.A00;
            List A05 = r2.A05(r0.A01);
            if (!A05.isEmpty()) {
                C104855Sp r22 = r2.A04;
                AnonymousClass32L r12 = ((C194339Sm) C18290x4.A0k(A05)).A08;
                if (!r22.A02(r12)) {
                    r22.A00.A01(C1899693i.A00(r3, r12), "download_resume");
                    return;
                }
                return;
            }
            return;
        }
        C195349Xk r4 = r1.A04;
        AnonymousClass9W5 r32 = r0.A00;
        List A052 = r32.A05(r0.A01);
        if (!A052.isEmpty()) {
            r32.A09(AnonymousClass9JK.DOWNLOAD_START, r4, (AnonymousClass9KQ) null, Collections.singletonList(((C194339Sm) C18290x4.A0k(A052)).A08), -1, true);
        }
    }
}
