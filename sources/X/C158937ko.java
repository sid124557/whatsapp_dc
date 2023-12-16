package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.7ko  reason: invalid class name and case insensitive filesystem */
public class C158937ko {
    public static C158937ko A04;
    public AnonymousClass7K0 A00;
    public AnonymousClass7K0 A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new AnonymousClass91L(this, 2));
    public final Object A03 = AnonymousClass002.A0D();

    public static C158937ko A00() {
        C158937ko r0 = A04;
        if (r0 != null) {
            return r0;
        }
        C158937ko r02 = new C158937ko();
        A04 = r02;
        return r02;
    }

    public final void A01() {
        AnonymousClass7K0 r0 = this.A01;
        if (r0 != null) {
            this.A00 = r0;
            this.A01 = null;
            C178918iJ r02 = (C178918iJ) r0.A02.get();
            if (r02 != null) {
                AnonymousClass6C7.A10(C159097l7.A0P, ((C170128Bz) r02).A00, 0);
            } else {
                this.A00 = null;
            }
        }
    }

    public void A02(C178918iJ r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                AnonymousClass7K0 r1 = this.A00;
                if (!r1.A01) {
                    r1.A01 = true;
                    this.A02.removeCallbacksAndMessages(r1);
                }
            }
        }
    }

    public void A03(C178918iJ r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                AnonymousClass7K0 r1 = this.A00;
                if (r1.A01) {
                    r1.A01 = false;
                    A04(r1);
                }
            }
        }
    }

    public final void A04(AnonymousClass7K0 r6) {
        int i = r6.A00;
        if (i != -2) {
            if (i <= 0) {
                int i2 = i;
                i = 2750;
                if (i2 == -1) {
                    i = 1500;
                }
            }
            Handler handler = this.A02;
            handler.removeCallbacksAndMessages(r6);
            handler.sendMessageDelayed(Message.obtain(handler, 0, r6), (long) i);
        }
    }

    public final boolean A05(C178918iJ r3) {
        AnonymousClass7K0 r0 = this.A00;
        if (r0 == null || r3 == null || r0.A02.get() != r3) {
            return false;
        }
        return true;
    }

    public final boolean A06(AnonymousClass7K0 r5, int i) {
        C178918iJ r1 = (C178918iJ) r5.A02.get();
        if (r1 == null) {
            return false;
        }
        this.A02.removeCallbacksAndMessages(r5);
        Handler handler = C159097l7.A0P;
        handler.sendMessage(handler.obtainMessage(1, i, 0, ((C170128Bz) r1).A00));
        return true;
    }
}
