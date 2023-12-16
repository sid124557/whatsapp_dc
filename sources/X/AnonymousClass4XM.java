package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.4XM  reason: invalid class name */
public class AnonymousClass4XM extends AnonymousClass0R6 implements AnonymousClass4AX {
    public C48652fF A00;
    public final int A01;
    public final LayoutInflater A02;
    public final C620733j A03;
    public final AnonymousClass5Y0 A04;
    public final AnonymousClass4A5 A05;
    public final C60152y5 A06;

    public synchronized int A0G() {
        C48652fF r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.A01.size();
    }

    public synchronized void A0K(C48652fF r3) {
        C48652fF r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A00 = r3;
        r3.A00(this);
        A05();
    }

    public /* bridge */ /* synthetic */ void A0H(C05570Ua r1) {
        ((AnonymousClass4Z4) r1).A07();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r3, int i) {
        C106655Zv r0;
        AnonymousClass4Z4 r32 = (AnonymousClass4Z4) r3;
        synchronized (this) {
            if (i < this.A00.A01.size()) {
                r0 = (C106655Zv) this.A00.A01.get(i);
            } else {
                r0 = null;
            }
            r32.A01 = r0;
            r32.A00 = i;
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4Z4(this.A02, viewGroup, this.A04, this.A05, this.A06, this.A01);
    }

    public void BaW(C48652fF r2) {
        if (r2.equals(this.A00)) {
            A05();
        }
    }

    public AnonymousClass4XM(Activity activity, C620733j r3, AnonymousClass5Y0 r4, AnonymousClass4A5 r5, C60152y5 r6, int i) {
        this.A02 = activity.getLayoutInflater();
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = i;
    }
}
