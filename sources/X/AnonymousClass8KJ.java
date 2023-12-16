package X;

import android.content.Context;
import java.util.Collections;

/* renamed from: X.8KJ  reason: invalid class name */
public class AnonymousClass8KJ implements C84724Dl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C03500Kl A01;
    public final /* synthetic */ AnonymousClass80b A02;

    public void BaN(C46202bF r5) {
        AnonymousClass7RT r2;
        C181448mm r0;
        C160367nW r3 = new C160367nW(new C146747Bl(true), 1);
        if (r5.A00 == 5) {
            r2 = new C131186dB(r5.A01, r3);
        } else {
            r2 = new C131176dA(r3, r5.A02);
        }
        AnonymousClass0W9 r1 = this.A01.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.Ba8(r2);
        }
    }

    public AnonymousClass8KJ(Context context, C03500Kl r2, AnonymousClass80b r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
    }

    public void BaH(C150917Ss r5) {
        C159377lj.A02(this.A00, r5, C157967jD.A01, this.A02.A00, Collections.emptyMap());
    }
}
