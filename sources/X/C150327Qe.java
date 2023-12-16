package X;

import android.app.Dialog;
import android.os.Handler;

/* renamed from: X.7Qe  reason: invalid class name and case insensitive filesystem */
public abstract class C150327Qe {
    public void A00() {
        if (this instanceof AnonymousClass6RC) {
            AnonymousClass6RC r3 = (AnonymousClass6RC) this;
            AnonymousClass6R3 r2 = (AnonymousClass6R3) r3.A01.A00;
            r2.A04.set((Object) null);
            Handler handler = r2.A03.A06;
            handler.sendMessage(handler.obtainMessage(3));
            Dialog dialog = r3.A00;
            if (dialog.isShowing()) {
                dialog.dismiss();
                return;
            }
            return;
        }
        C127086Qo r0 = (C127086Qo) ((AnonymousClass6RB) this).A00.get();
        if (r0 != null) {
            C127086Qo.A00(r0);
        }
    }
}
