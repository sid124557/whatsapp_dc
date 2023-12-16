package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3Ty  reason: invalid class name and case insensitive filesystem */
public class C68643Ty implements AnonymousClass672 {
    public final C43792Tm A00;

    public void BF0(String str, Map map) {
        StringBuilder A0o;
        C43792Tm r6 = this.A00;
        C51072jE r2 = r6.A08;
        if (r2.A00() == 10) {
            String A002 = r6.A09.A00();
            if (!"IN_REVIEW".equals(A002)) {
                A0o = AnonymousClass001.A0o();
                A0o.append("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since ban appeal state=");
                A0o.append(A002);
            } else {
                Log.i("banmanager/checkIfNeedToPostBanAppealDecisionNotification showing ban appeals notification");
                Context context = r6.A03.A00;
                String string = context.getString(R.string.f11nameremoved);
                String string2 = context.getString(R.string.f11nameremoved);
                String string3 = context.getString(R.string.f11nameremoved, AnonymousClass000.A1b(string));
                Intent A07 = C18320x8.A07();
                A07.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
                A07.putExtra("launch_source", 4);
                C05610Ue A01 = C66553Lw.A01(context);
                A01.A0K = "critical_app_alerts@1";
                A01.A03 = 1;
                A01.A0C(string3);
                C18270x1.A0s(A01, string, string2);
                C18270x1.A0r(A01, string2);
                AnonymousClass33T.A01(C624735e.A04(context, A07, 0), A01);
                AnonymousClass33T.A03(A01, r6.A04, 42);
                return;
            }
        } else {
            A0o = AnonymousClass001.A0o();
            A0o.append("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since reg state=");
            A0o.append(r2.A00());
        }
        AnonymousClass0x2.A19(A0o);
    }

    public boolean BoG(C47742dk r2, Long l, String str) {
        return "ban_appeals".equals(str);
    }

    public C68643Ty(C43792Tm r1) {
        this.A00 = r1;
    }
}
