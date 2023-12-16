package X;

import android.app.Activity;
import android.os.Looper;

/* renamed from: X.4fO  reason: invalid class name and case insensitive filesystem */
public class C89854fO extends AnonymousClass5c4 {
    public final C86834Ma A00;
    public final C183538qC A01;

    public C89854fO(C183538qC r3, C183538qC r4) {
        this.A01 = r3;
        this.A00 = new C86834Ma(Looper.getMainLooper(), r3, r4);
    }

    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        C86834Ma r2 = this.A00;
        if (r2.hasMessages(0)) {
            r2.removeMessages(0);
        }
        ((C55602qc) this.A01.get()).A02();
    }

    public void onActivityResumed(Activity activity) {
        boolean z;
        super.onActivityResumed(activity);
        if (activity instanceof C89644eZ) {
            z = ((C89644eZ) activity).A0D;
        } else {
            z = activity instanceof C89184bt;
        }
        if (z) {
            this.A00.sendEmptyMessageDelayed(0, 3000);
        }
    }
}
