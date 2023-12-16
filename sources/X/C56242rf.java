package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2rf  reason: invalid class name and case insensitive filesystem */
public abstract class C56242rf {
    public void A00() {
        if (this instanceof AnonymousClass4H8) {
            AnonymousClass4H8 r1 = (AnonymousClass4H8) this;
            if (1 - r1.A01 == 0) {
                Log.i("companion/registration/link code expired");
                Activity activity = (Activity) r1.A00;
                activity.runOnUiThread(C69963Zi.A00(activity, 39));
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass4H8) {
            AnonymousClass4H8 r1 = (AnonymousClass4H8) this;
            if (1 - r1.A01 == 0) {
                Activity activity = (Activity) r1.A00;
                activity.runOnUiThread(C69963Zi.A00(activity, 38));
            }
        }
    }

    public void A03() {
        if (this instanceof AnonymousClass4H8) {
            AnonymousClass4H8 r1 = (AnonymousClass4H8) this;
            if (1 - r1.A01 == 0) {
                Context context = (Context) r1.A00;
                Intent A07 = C18320x8.A07();
                A07.setClassName(context.getPackageName(), "com.whatsapp.companionmode.registration.CompanionBootstrapActivity");
                A07.addFlags(268468224);
                context.startActivity(A07);
            }
        }
    }

    public void A04(String str) {
    }

    public void A01() {
    }
}
