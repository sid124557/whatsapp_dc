package X;

import android.view.Window;

/* renamed from: X.0b6  reason: invalid class name */
public final class AnonymousClass0b6 implements C16470tS {
    public boolean A00;
    public final /* synthetic */ AnonymousClass03y A01;

    public AnonymousClass0b6(AnonymousClass03y r1) {
        this.A01 = r1;
    }

    public void BPH(C07890cz r3, boolean z) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass03y r1 = this.A01;
            r1.A01.B1r();
            Window.Callback callback = r1.A00;
            if (callback != null) {
                callback.onPanelClosed(C627136h.A03, r3);
            }
            this.A00 = false;
        }
    }

    public boolean BXO(C07890cz r3) {
        Window.Callback callback = this.A01.A00;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(C627136h.A03, r3);
        return true;
    }
}
