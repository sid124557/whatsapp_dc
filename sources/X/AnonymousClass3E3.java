package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.3E3  reason: invalid class name */
public final class AnonymousClass3E3 implements AnonymousClass49C {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C56962sq A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3E3(Activity activity, C56962sq r2, boolean z) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = z;
    }

    public void BaR(boolean z) {
        if (!z) {
            C56962sq r2 = this.A01;
            C18270x1.A0g(C18270x1.A03(r2.A0K), "block_list_receive_time");
            Activity activity = this.A00;
            if (!activity.isFinishing()) {
                C69263Wi r22 = r2.A05;
                boolean z2 = this.A02;
                int i = R.string.f11nameremoved;
                if (z2) {
                    i = R.string.f11nameremoved;
                }
                r22.A0W(activity.getString(i), 0);
            }
        }
    }
}
