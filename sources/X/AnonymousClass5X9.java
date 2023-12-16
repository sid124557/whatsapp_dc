package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5X9  reason: invalid class name */
public final class AnonymousClass5X9 {
    public static final C625435m A06 = new C625435m(13);
    public static final C625435m A07 = new C625435m(0);
    public static final C625435m A08 = new C625435m(21);
    public C30471mV A00;
    public Integer A01;
    public final AnonymousClass1VX A02;
    public final C620133d A03;
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final ConcurrentHashMap A05 = AnonymousClass0x9.A1D();

    public final void A00() {
        Log.i("statusdownload/cancel-all-status-downloads");
        C620133d r3 = this.A03;
        Iterator it = r3.A04().iterator();
        while (it.hasNext()) {
            C30471mV A0S = C18320x8.A0S(it);
            if (A0S.A1J.A00 instanceof C135166kE) {
                r3.A0B(A0S);
            }
        }
        this.A04.clear();
        this.A00 = null;
        this.A01 = null;
    }

    public AnonymousClass5X9(AnonymousClass1VX r2, C620133d r3) {
        C18260x0.A0Q(r2, r3);
        this.A02 = r2;
        this.A03 = r3;
    }

    public final void A01(C30471mV r3, int i) {
        Integer num;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0.A0A(C624134x.A08(r3, "statusdownload/queue-status-download ", A0o), A0o);
        A0o.append(' ');
        A0o.append(r3.A0n());
        C18260x0.A0y(", mode = ", A0o, i);
        if (!r3.equals(this.A00) || ((num = this.A01) != null && i < num.intValue())) {
            this.A00 = r3;
            this.A01 = Integer.valueOf(i);
            this.A03.A06(new C114735nW(r3, this), r3, i);
        }
    }
}
