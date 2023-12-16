package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* renamed from: X.0Cu  reason: invalid class name and case insensitive filesystem */
public class C01940Cu extends C125336Hk {
    public AnonymousClass84O A00;
    public final Handler A01 = new AnonymousClass021(Looper.getMainLooper(), this);
    public final C153427bI A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C01940Cu(X.C153427bI r3, X.AnonymousClass84O r4, int r5) {
        /*
            r2 = this;
            X.0Kq r0 = new X.0Kq
            r0.<init>(r5)
            A02(r3)
            r2.<init>(r0)
            r2.A02 = r3
            r2.A00 = r4
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.021 r0 = new X.021
            r0.<init>(r1, r2)
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01940Cu.<init>(X.7bI, X.84O, int):void");
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r1) {
        super.A0M((AnonymousClass6IO) r1);
    }

    /* renamed from: A0O */
    public void A0H(AnonymousClass6IO r4) {
        C835248t A0L;
        AnonymousClass84O A0I = ((AnonymousClass84O) ((C151627Vn) r4.A00).A00()).A0I();
        if (A0I != null && A0I.A0D() == 13366 && (A0L = A0I.A0L(38)) != null) {
            C158977kt.A00();
            Handler handler = this.A01;
            handler.sendMessage(handler.obtainMessage(0, A0L));
        }
    }

    /* renamed from: A0P */
    public void A0I(AnonymousClass6IO r4) {
        C835248t A0L;
        AnonymousClass84O A0I = ((AnonymousClass84O) ((C151627Vn) r4.A00).A00()).A0I();
        if (A0I != null && A0I.A0D() == 13366 && (A0L = A0I.A0L(40)) != null) {
            C158977kt.A00();
            Handler handler = this.A01;
            handler.sendMessage(handler.obtainMessage(0, A0L));
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r1, int i) {
        super.A0N((AnonymousClass6IO) r1, i);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return super.A0K(viewGroup);
    }

    public static void A02(C153427bI r0) {
        r0.A04();
    }
}
