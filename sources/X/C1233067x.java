package X;

import android.app.Activity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.67x  reason: invalid class name and case insensitive filesystem */
public class C1233067x extends C103055Lj {
    public Object A00;
    public final int A01;

    public C1233067x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            Log.i("AuthenticationActivity/fingerprint-success-animation-end");
            C18290x4.A18((Activity) this.A00);
            return;
        }
        Log.i("AppAuthenticationActivity/fingerprint-success-animation-end");
        AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A00;
        appAuthenticationActivity.A6j();
        appAuthenticationActivity.finish();
    }
}
