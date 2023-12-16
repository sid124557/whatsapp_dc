package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.3E5  reason: invalid class name */
public final class AnonymousClass3E5 implements AnonymousClass49C {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass49C A01;
    public final /* synthetic */ C56962sq A02;
    public final /* synthetic */ AnonymousClass3ZH A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3E5(Activity activity, AnonymousClass49C r2, C56962sq r3, AnonymousClass3ZH r4, boolean z) {
        this.A04 = z;
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void BaR(boolean z) {
        if (z) {
            boolean z2 = this.A04;
            int i = R.string.f11nameremoved;
            if (z2) {
                i = R.string.f11nameremoved;
            }
            C56962sq r0 = this.A02;
            C69263Wi r5 = r0.A05;
            Activity activity = this.A00;
            Object[] objArr = new Object[1];
            C18290x4.A1K(r0.A0H, this.A03, objArr);
            r5.A0P(activity.getString(i, objArr), 1);
        }
        AnonymousClass49C r02 = this.A01;
        if (r02 != null) {
            r02.BaR(z);
        }
    }
}
