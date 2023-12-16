package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: X.0OV  reason: invalid class name */
public final class AnonymousClass0OV {
    public int A00 = 0;
    public Bundle A01;
    public final Intent A02 = new Intent("android.intent.action.VIEW");
    public final AnonymousClass0H0 A03 = new AnonymousClass0H0();

    public AnonymousClass0KG A00() {
        Intent intent = this.A02;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A08 = AnonymousClass002.A08();
            AnonymousClass0HD.A00(A08, (IBinder) null, "android.support.customtabs.extra.SESSION");
            intent.putExtras(A08);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        AnonymousClass0KF r0 = new AnonymousClass0KF((Integer) null);
        Bundle A082 = AnonymousClass002.A08();
        Integer num = r0.A00;
        if (num != null) {
            A082.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(A082);
        Bundle bundle = this.A01;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.A00);
        if (Build.VERSION.SDK_INT >= 24) {
            A01();
        }
        return new AnonymousClass0KG(intent);
    }

    public final void A01() {
        Bundle A08;
        String A002 = AnonymousClass0H2.A00();
        if (!TextUtils.isEmpty(A002)) {
            Intent intent = this.A02;
            if (intent.hasExtra("com.android.browser.headers")) {
                A08 = intent.getBundleExtra("com.android.browser.headers");
            } else {
                A08 = AnonymousClass002.A08();
            }
            if (!A08.containsKey("Accept-Language")) {
                A08.putString("Accept-Language", A002);
                intent.putExtra("com.android.browser.headers", A08);
            }
        }
    }
}
