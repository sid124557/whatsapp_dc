package X;

import com.whatsapp.R;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.67X  reason: invalid class name */
public class AnonymousClass67X extends C04550Os {
    public Object A00;
    public final int A01;

    public AnonymousClass67X(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (1 - this.A01 != 0) {
            super.A00();
            return;
        }
        Log.i("AppAuthenticationActivity/failed");
        ((AppAuthenticationActivity) this.A00).A01 = 3;
    }

    public void A01(int i, CharSequence charSequence) {
        if (this.A01 != 0) {
            Log.i("AppAuthenticationActivity/error");
            AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A00;
            appAuthenticationActivity.A01 = 3;
            appAuthenticationActivity.A06.A03(true);
            if (i == 7) {
                Log.i("AppAuthenticationActivity/error-too-many-attempts");
                C69263Wi r3 = appAuthenticationActivity.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, 30);
                r3.A0P(appAuthenticationActivity.getString(R.string.f11nameremoved, objArr), 1);
                return;
            }
            return;
        }
        if (i == 7) {
            C89654ea r5 = (C89654ea) this.A00;
            C69263Wi r4 = r5.A05;
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, 30);
            r4.A0P(r5.getString(R.string.f11nameremoved, objArr2), 1);
        }
        Log.i("AppAuthSettingsActivity/error");
        ((AppAuthSettingsActivity) this.A00).A74();
    }

    public void A02(AnonymousClass0L0 r5) {
        if (this.A01 != 0) {
            Log.i("AppAuthenticationActivity/success");
            AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A00;
            appAuthenticationActivity.A01 = 3;
            appAuthenticationActivity.A06.A03(false);
            appAuthenticationActivity.A6j();
            appAuthenticationActivity.finish();
            return;
        }
        Log.i("AppAuthSettingsActivity/success");
        AppAuthSettingsActivity appAuthSettingsActivity = (AppAuthSettingsActivity) this.A00;
        appAuthSettingsActivity.A04.A03(false);
        C18270x1.A0l(C18270x1.A03(appAuthSettingsActivity.A09), "privacy_fingerprint_enabled", true);
        appAuthSettingsActivity.A0C.A07();
        appAuthSettingsActivity.A75(true);
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A09.A01();
        appAuthSettingsActivity.A04.A01(appAuthSettingsActivity);
    }
}
