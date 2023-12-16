package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.03u  reason: invalid class name */
public class AnonymousClass03u extends C04520Op {
    public /* bridge */ /* synthetic */ Intent A05(Context context, Object obj) {
        Bundle bundleExtra;
        C06760Zc r6 = (C06760Zc) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = r6.A02;
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                AnonymousClass0NZ r2 = new AnonymousClass0NZ(r6.A03);
                r2.A02 = null;
                int i = r6.A01;
                int i2 = r6.A00;
                r2.A01 = i;
                r2.A00 = i2;
                r6 = r2.A00();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r6);
        if (C08270df.A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "CreateIntent created the following intent: ", intent);
        }
        return intent;
    }

    public /* bridge */ /* synthetic */ Object A07(Intent intent, int i) {
        return new C06800Zg(i, intent);
    }
}
