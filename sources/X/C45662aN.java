package X;

import android.content.Context;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;

/* renamed from: X.2aN  reason: invalid class name and case insensitive filesystem */
public final class C45662aN {
    public final WfalManager A00;
    public final C54292oU A01;
    public final AnonymousClass2IV A02;

    public final boolean A00(AnonymousClass223 r7, C624134x r8) {
        boolean A002;
        Integer A012;
        C18270x1.A14(r8, r7);
        WfalManager wfalManager = this.A00;
        if (!wfalManager.A02()) {
            return false;
        }
        int ordinal = r7.ordinal();
        Context context = this.A01.A00;
        if (ordinal != 0) {
            C162457s7.A0D(context);
            A002 = C57672u1.A01(context);
        } else {
            C162457s7.A0D(context);
            A002 = C57672u1.A00(context);
        }
        if (A002 || wfalManager.A01(r7) != null) {
            AnonymousClass2IV r0 = this.A02;
            long j = r8.A1L;
            C56012rH r4 = r0.A00;
            if (!r4.A05(r7, j)) {
                return true;
            }
            if (!r4.A02) {
                Log.e("[WAFFLE] WaffleStatusCrosspostStateCache/getNonBlocking cache not initialized");
            } else {
                synchronized (r4.A00) {
                    A012 = r4.A01(r7, j);
                }
                if (A012 == null || 4 != A012.intValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C45662aN(WfalManager wfalManager, C54292oU r2, AnonymousClass2IV r3) {
        C18260x0.A0R(r2, wfalManager);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = wfalManager;
    }
}
