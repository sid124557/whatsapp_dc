package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.R;
import com.whatsapp.registration.PreRegNotificationLearnMoreReceiver;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3Tw  reason: invalid class name and case insensitive filesystem */
public final class C68623Tw implements AnonymousClass672 {
    public final AnonymousClass317 A00;

    public C68623Tw(AnonymousClass317 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BF0(String str, Map map) {
        String str2;
        AnonymousClass317 r5 = this.A00;
        if (!r5.A0w.A02()) {
            str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/not-verified";
        } else {
            AnonymousClass33p r3 = r5.A0c;
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r3), "chat_transfer_in_progress")) {
                str2 = "RegistrationManager/checkIfNeedToPostPreRegistrationNotification/skipped-chat-transfer-in-progress";
            } else {
                Log.i("RegistrationManager/checkIfNeedToPostPreRegistrationNotification");
                Context context = r5.A0a.A00;
                String string = context.getString(R.string.f11nameremoved);
                SharedPreferences.Editor A03 = C18270x1.A03(r3);
                A03.putBoolean("show_pre_reg_do_not_share_code_warning", true);
                A03.apply();
                C05610Ue A02 = r5.A02(string, context.getString(R.string.f11nameremoved), AnonymousClass002.A0F(context, string, new Object[1], 0, R.string.f11nameremoved));
                A02.A0O.add(new C05480Tm(R.drawable.ic_link, context.getString(R.string.f11nameremoved), C624735e.A01(context, 0, AnonymousClass0x9.A08(context, PreRegNotificationLearnMoreReceiver.class), 268435456)));
                AnonymousClass33T.A03(A02, r5.A0b, 20);
                return;
            }
        }
        Log.i(str2);
    }

    public boolean BoG(C47742dk r2, Long l, String str) {
        return "PreRegistration".equalsIgnoreCase(str);
    }
}
