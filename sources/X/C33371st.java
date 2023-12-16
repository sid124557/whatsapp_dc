package X;

import android.content.Context;
import android.widget.Toast;
import com.whatsapp.R;

/* renamed from: X.1st  reason: invalid class name and case insensitive filesystem */
public final class C33371st extends AnonymousClass5ZM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C614930z A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            C614930z r2 = this.A02;
            r2.A0A.A1A(0);
            Toast.makeText(this.A01, R.string.f11nameremoved, 0).show();
            r2.A05.A0A("maybeSwitchToMostRecentAccount/no inactive accounts", true, (String) null);
            return;
        }
        this.A02.A0A(this.A01, str, (String) null, (AnonymousClass4GP) null, this.A00, false, false);
    }

    public C33371st(Context context, C614930z r2, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return ((C613630k) this.A02.A0G.get()).A05();
    }
}
