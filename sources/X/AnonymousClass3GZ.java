package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3GZ  reason: invalid class name */
public final class AnonymousClass3GZ implements AnonymousClass4FW {
    public final C52312lH A00;

    public void BWg(Collection collection, Map map) {
        AnonymousClass39W r1;
        C162457s7.A0J(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if ((A0T instanceof C30791n7) && (r1 = ((C30791n7) A0T).A00) != null && r1.A04()) {
                Iterator it2 = r1.A03.A03.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((AnonymousClass395) it2.next()).A01.A00.equals("cta_cancel_reminder")) {
                        C52312lH r4 = this.A00;
                        if (A0T != null) {
                            long j = A0T.A1L;
                            AlarmManager A07 = r4.A01.A07();
                            if (A07 != null) {
                                PendingIntent A002 = r4.A00(A0T, j, 0);
                                A07.cancel(A002);
                                A002.cancel();
                            }
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public AnonymousClass3GZ(C52312lH r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
