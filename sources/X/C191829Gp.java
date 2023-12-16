package X;

import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.9Gp  reason: invalid class name and case insensitive filesystem */
public class C191829Gp extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final C989053r A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int max = Math.max(this.A01, this.A00);
        try {
            return this.A03.A0B(this.A02, max, max);
        } catch (C1000259c | IOException e) {
            Log.e("IndiaUpiQrTabActivity/loadImageRunnable Failed to load image", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A04.get();
        if (indiaUpiQrTabActivity != null && !indiaUpiQrTabActivity.BHW()) {
            Uri uri = this.A02;
            if (obj == null) {
                indiaUpiQrTabActivity.BjL();
                indiaUpiQrTabActivity.A05.A0H(R.string.f11nameremoved, 0);
                return;
            }
            AnonymousClass0x7.A1B(new C138236pz(uri, indiaUpiQrTabActivity.A0G, indiaUpiQrTabActivity.A0E), indiaUpiQrTabActivity.A04);
        }
    }

    public C191829Gp(Uri uri, IndiaUpiQrTabActivity indiaUpiQrTabActivity, C989053r r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass0x9.A14(indiaUpiQrTabActivity);
    }
}
