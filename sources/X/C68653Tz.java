package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3Tz  reason: invalid class name and case insensitive filesystem */
public final class C68653Tz implements AnonymousClass672 {
    public final AnonymousClass32N A00;

    public C68653Tz(AnonymousClass32N r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BF0(String str, Map map) {
        Map map2 = map;
        C162457s7.A0J(map2, 1);
        AnonymousClass356.A03("WfacBanIncomingPushObserver/handleIncomingPushMessage");
        Object obj = map2.get("push_payload");
        if (obj != null && (obj instanceof C32211pk)) {
            C32211pk r2 = (C32211pk) obj;
            if (C162457s7.A0P(r2.A00, "wfac_ban")) {
                AnonymousClass32N r6 = this.A00;
                String str2 = r2.A02;
                String A002 = r6.A05.A00();
                boolean equals = "CHECKPOINTED".equals(A002);
                StringBuilder A0o = AnonymousClass001.A0o();
                if (!equals) {
                    AnonymousClass356.A03(AnonymousClass000.A0V("WfacManager/maybePostBanDecisionNotification not showing ban decision notification since ban state = ", A002, A0o));
                    return;
                }
                A0o.append("WfacManager/maybePostBanDecisionNotification showing underage ban notification for decision [");
                A0o.append(str2);
                AnonymousClass356.A03(AnonymousClass0x2.A0f(A0o));
                Context context = r6.A02.A00;
                C162457s7.A0D(context);
                String A0l = C18290x4.A0l(context, R.string.f11nameremoved);
                String A0l2 = C18290x4.A0l(context, R.string.f11nameremoved);
                String A0X = AnonymousClass0x2.A0X(context, A0l, 1, R.string.f11nameremoved);
                C162457s7.A0D(A0X);
                Intent A003 = AnonymousClass32N.A00(context, (String) null, str2, 14, -1, 4);
                C05610Ue A01 = C66553Lw.A01(context);
                A01.A0K = "critical_app_alerts@1";
                A01.A03 = 1;
                A01.A0C(A0X);
                C18270x1.A0s(A01, A0l, A0l2);
                C18270x1.A0r(A01, A0l2);
                AnonymousClass33T.A01(C624735e.A04(context, A003, 0), A01);
                AnonymousClass33T.A03(A01, r6.A03, 76);
            }
        }
    }

    public boolean BoG(C47742dk r3, Long l, String str) {
        AnonymousClass356.A03("WfacBanIncomingPushObserver/shouldHandlePush");
        if (r3 == null || !C162457s7.A0P(r3.A00(), "wfac_ban")) {
            return false;
        }
        return true;
    }
}
