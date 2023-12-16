package X;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.7Qd  reason: invalid class name and case insensitive filesystem */
public abstract class C150317Qd {
    public void A00(C180818lg r8) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A06) {
            if (AnonymousClass000.A1T((basePendingResult.A09.getCount() > 0 ? 1 : (basePendingResult.A09.getCount() == 0 ? 0 : -1)))) {
                r8.BPP(basePendingResult.A01);
            } else {
                basePendingResult.A08.add(r8);
            }
        }
    }
}
