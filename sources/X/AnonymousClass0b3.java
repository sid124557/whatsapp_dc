package X;

import android.view.Window;

/* renamed from: X.0b3  reason: invalid class name */
public final class AnonymousClass0b3 implements C16470tS {
    public final /* synthetic */ AnonymousClass040 A00;

    public AnonymousClass0b3(AnonymousClass040 r1) {
        this.A00 = r1;
    }

    public void BPH(C07890cz r2, boolean z) {
        this.A00.A0V(r2);
    }

    public boolean BXO(C07890cz r3) {
        Window.Callback callback = this.A00.A08.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(C627136h.A03, r3);
        return true;
    }
}
