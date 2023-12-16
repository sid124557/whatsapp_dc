package X;

import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2gF  reason: invalid class name and case insensitive filesystem */
public class C49262gF {
    public String A00 = "";
    public final C54292oU A01;
    public final AnonymousClass33T A02;

    public void A00(String str) {
        A01(C54292oU.A00(this.A01).getString(R.string.f11nameremoved), str, 2, false);
    }

    public void A01(String str, String str2, int i, boolean z) {
        boolean equals;
        Log.i("errorreporter/reporterror");
        synchronized (this) {
            String A04 = C627236i.A04(AnonymousClass000.A0h(AnonymousClass000.A0m(str, str2), i));
            if (A04 == null) {
                A04 = "invalid";
            }
            equals = this.A00.equals(A04);
            if (!equals) {
                this.A00 = A04;
            }
        }
        if (equals) {
            Log.e("Same as the last shown notification; skipping");
            return;
        }
        Context context = this.A01.A00;
        PendingIntent A002 = C624735e.A00(context, 1, C627736r.A03(context), 0);
        C05610Ue A012 = C66553Lw.A01(context);
        A012.A0K = "critical_app_alerts@1";
        A012.A0J = "err";
        A012.A03 = 1;
        A012.A0C(str);
        A012.A0B(str);
        A012.A0A(str2);
        A012.A0X = z;
        A012.A09 = A002;
        AnonymousClass33T.A02(A012, R.drawable.notifybar_error);
        A012.A06 = 1;
        AnonymousClass33T.A03(A012, this.A02, i);
    }

    public C49262gF(C54292oU r2, AnonymousClass33T r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}
