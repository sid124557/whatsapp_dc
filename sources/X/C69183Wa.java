package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.3Wa  reason: invalid class name and case insensitive filesystem */
public class C69183Wa implements C186688vm {
    public Runnable A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C29441ip A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass31C A06;
    public final C29101iH A07;
    public final C52032km A08;
    public final C60902zM A09;
    public final C60902zM A0A;
    public final AnonymousClass4FS A0B;
    public final Runnable A0C = new C117095rN(this, 10);
    public final List A0D = Collections.singletonList("20210210");

    public void A00() {
        AnonymousClass4FS r1 = this.A0B;
        r1.BjN(this.A0C);
        Runnable runnable = this.A00;
        if (runnable != null) {
            r1.BjN(runnable);
        }
        this.A09.A02();
        this.A0A.A02();
        C18270x1.A0m(C18310x6.A0F(this.A08.A01));
    }

    public void A01(C60612yq r6) {
        this.A09.A02();
        C52032km r4 = this.A08;
        C18270x1.A0i(C18270x1.A04(r4.A01), "request_refresh_rate_seconds", r6.A00);
        for (C52022kl r0 : r6.A01) {
            String str = r0.A01;
            r4.A01(str, r0.A00);
            r4.A02(str, System.currentTimeMillis());
        }
        C69263Wi r3 = this.A01;
        C29101iH r2 = this.A07;
        Objects.requireNonNull(r2);
        r3.A0S(new C117095rN(r2, 9));
    }

    public C69183Wa(C69263Wi r6, C56972sr r7, C29441ip r8, C56612sH r9, AnonymousClass1VX r10, AnonymousClass31C r11, C29101iH r12, C52032km r13, AnonymousClass4FS r14) {
        this.A04 = r9;
        this.A05 = r10;
        this.A01 = r6;
        this.A02 = r7;
        this.A0B = r14;
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r13;
        this.A03 = r8;
        this.A09 = new C60902zM(AnonymousClass0x9.A1C(), 5, 16000);
        this.A0A = new C60902zM(AnonymousClass0x9.A1C(), 5, 16000);
    }

    public final void A02(List list, long j) {
        C70363aN r2;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (this.A08.A00(A0m) == 1) {
                A0s.add(A0m);
            }
        }
        if (A0s.isEmpty()) {
            r2 = null;
        } else {
            r2 = new C70363aN(this, list, A0s, 22);
        }
        this.A00 = r2;
        if (r2 == null) {
            this.A0A.A02();
        } else {
            this.A0B.Bkn(r2, "ToSGatingRepository/postTosAcceptanceState", j);
        }
    }
}
