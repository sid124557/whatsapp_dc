package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreTransferSelectorActivity;

/* renamed from: X.0wD  reason: invalid class name and case insensitive filesystem */
public class C17770wD implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C17770wD(RestoreTransferSelectorActivity restoreTransferSelectorActivity, int i, int i2) {
        this.A02 = i2;
        this.A01 = restoreTransferSelectorActivity;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int i = this.A02;
        RestoreTransferSelectorActivity restoreTransferSelectorActivity = (RestoreTransferSelectorActivity) this.A01;
        int i2 = this.A00;
        if (i != 0) {
            RestoreTransferSelectorActivity.A0Z(restoreTransferSelectorActivity, i2);
        } else {
            RestoreTransferSelectorActivity.A0a(restoreTransferSelectorActivity, i2);
        }
    }
}
