package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3U0  reason: invalid class name */
public final class AnonymousClass3U0 implements AnonymousClass672 {
    public final AnonymousClass33p A00;
    public final AnonymousClass317 A01;

    public boolean BoG(C47742dk r9, Long l, String str) {
        boolean equals = "PostRegSMBTakeover".equals(str);
        boolean equals2 = "PostRegistration".equals(str);
        C183538qC r3 = this.A00.A01;
        if ((C18300x5.A0B(r3).getInt("migration_state_on_provider_side", 0) != 1 || !equals) && equals2) {
            if (l == null || TimeUnit.MILLISECONDS.toSeconds(l.longValue()) >= AnonymousClass0x2.A0A(C18300x5.A0B(r3), "last_login_time") + ((long) 60)) {
                return true;
            }
            Log.i("PostRegistrationIncomingPushObserver/post-registration-notification/notification-delayed");
        }
        return false;
    }

    public AnonymousClass3U0(AnonymousClass33p r1, AnonymousClass317 r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BF0(String str, Map map) {
        C626936e.A06(str);
        if (str != null) {
            AnonymousClass317 r5 = this.A01;
            Log.i("RegistrationManager/checkIfNeedToPostPostRegistrationNotification");
            r5.A0b.A05(20, str);
            AnonymousClass33p r4 = r5.A0c;
            C18270x1.A0i(C18270x1.A03(r4), "post_reg_notification_time", r5.A0Z.A0H());
            r4.A20(true);
            SharedPreferences.Editor A03 = C18270x1.A03(r4);
            A03.remove("show_pre_reg_do_not_share_code_warning");
            A03.apply();
            r5.A06();
        }
    }
}
