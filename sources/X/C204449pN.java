package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9pN  reason: invalid class name and case insensitive filesystem */
public class C204449pN implements View.OnLongClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C204449pN(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass94y r4 = (AnonymousClass94y) obj;
            String str = this.A01;
            ClipboardManager A0C = r4.A0M.A0C();
            if (A0C != null) {
                try {
                    A0C.setPrimaryClip(ClipData.newPlainText(str, str));
                    r4.A0H.A0H(R.string.f11nameremoved, 0);
                    return true;
                } catch (NullPointerException | SecurityException e) {
                    r4.A0f.A0A("getTransactionIdRow paymentTransactionID", e);
                }
            }
            r4.A0H.A0H(R.string.f11nameremoved, 0);
            return true;
        }
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) obj;
        String str2 = this.A01;
        ClipboardManager A0C2 = indiaUpiPaymentSettingsFragment.A08.A0C();
        if (A0C2 == null) {
            return true;
        }
        try {
            A0C2.setPrimaryClip(ClipData.newPlainText(str2, str2));
            indiaUpiPaymentSettingsFragment.A0L.A0P(C08310eF.A09(indiaUpiPaymentSettingsFragment).getString(R.string.f11nameremoved), 1);
            return true;
        } catch (NullPointerException | SecurityException e2) {
            Log.e("indiaupi/clipboard/", e2);
            return true;
        }
    }
}
