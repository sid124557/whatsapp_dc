package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.loginfailure.LogoutMessageActivity;

/* renamed from: X.546  reason: invalid class name */
public class AnonymousClass546 extends C109665ez {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass546(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = z;
    }

    public void A07(View view) {
        if (this.A03 != 0) {
            LogoutMessageActivity logoutMessageActivity = (LogoutMessageActivity) this.A01;
            C85244Fm r4 = logoutMessageActivity.A00;
            if (r4 != null) {
                Activity activity = (Activity) this.A00;
                boolean z = this.A02;
                String A0Z = C18280x3.A0Z(AnonymousClass1Hf.A27(logoutMessageActivity), "secondary_button_url");
                if (!z || A0Z == null || C159707mK.A00(A0Z)) {
                    A0Z = null;
                }
                C86604Kt.A12(activity, r4, A0Z);
                C05680Um.A00(activity);
                return;
            }
            throw C18270x1.A0S("linkLauncher");
        }
        LogoutMessageActivity logoutMessageActivity2 = (LogoutMessageActivity) this.A01;
        PhoneUserJid A2m = AnonymousClass4SG.A2m(logoutMessageActivity2);
        if (A2m != null) {
            AnonymousClass33p r0 = logoutMessageActivity2.A09;
            C18270x1.A0j(C18270x1.A03(r0), "saved_user_before_logout", A2m.user);
        }
        boolean z2 = this.A02;
        String A0Z2 = C18280x3.A0Z(AnonymousClass1Hf.A27(logoutMessageActivity2), "main_button_url");
        if (!z2 || A0Z2 == null || C159707mK.A00(A0Z2)) {
            String A0b = logoutMessageActivity2.A09.A0b();
            C162457s7.A0D(A0b);
            String A0Z3 = logoutMessageActivity2.A09.A0Z();
            C162457s7.A0D(A0Z3);
            Intent A012 = C627736r.A01(logoutMessageActivity2);
            if (logoutMessageActivity2.A06.A0H() < AnonymousClass0x2.A0B(AnonymousClass1Hf.A27(logoutMessageActivity2), "post_reg_notification_time") + 1800000) {
                A012.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0b);
                A012.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0Z3);
                A012.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
            }
            AnonymousClass317 r02 = logoutMessageActivity2.A01;
            if (r02 != null) {
                r02.A01();
                AnonymousClass317 r1 = logoutMessageActivity2.A01;
                if (r1 != null) {
                    r1.A0B(0, true);
                    logoutMessageActivity2.startActivity(A012);
                } else {
                    throw C18270x1.A0S("registrationManager");
                }
            } else {
                throw C18270x1.A0S("registrationManager");
            }
        } else {
            C85244Fm r12 = logoutMessageActivity2.A00;
            if (r12 != null) {
                C86604Kt.A12((Context) this.A00, r12, A0Z2);
            } else {
                throw C18270x1.A0S("linkLauncher");
            }
        }
        C05680Um.A00((Activity) this.A00);
    }
}
