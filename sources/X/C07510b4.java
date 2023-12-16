package X;

import android.view.Window;

/* renamed from: X.0b4  reason: invalid class name and case insensitive filesystem */
public final class C07510b4 implements C16470tS {
    public final /* synthetic */ AnonymousClass040 A00;

    public C07510b4(AnonymousClass040 r1) {
        this.A00 = r1;
    }

    public void BPH(C07890cz r10, boolean z) {
        C07890cz r0;
        C07890cz A02 = r10.A02();
        boolean z2 = false;
        if (A02 != r10) {
            z2 = true;
        }
        AnonymousClass040 r5 = this.A00;
        if (z2) {
            r10 = A02;
        }
        C04040Mo[] r4 = r5.A0h;
        int i = 0;
        if (r4 != null) {
            int length = r4.length;
            while (i < length) {
                C04040Mo r2 = r4[i];
                if (r2 == null || (r0 = r2.A0A) != r10) {
                    i++;
                } else if (z2) {
                    int i2 = r2.A01;
                    if (A02 == null) {
                        A02 = r0;
                    }
                    if (r2.A0C && !r5.A0Z) {
                        r5.A0D.A00.onPanelClosed(i2, A02);
                    }
                    r5.A0U(r2, true);
                    return;
                } else {
                    r5.A0U(r2, z);
                    return;
                }
            }
        }
    }

    public boolean BXO(C07890cz r4) {
        Window.Callback callback;
        if (r4 != r4.A02()) {
            return true;
        }
        AnonymousClass040 r2 = this.A00;
        if (!r2.A0X || (callback = r2.A08.getCallback()) == null || r2.A0Z) {
            return true;
        }
        callback.onMenuOpened(C627136h.A03, r4);
        return true;
    }
}
