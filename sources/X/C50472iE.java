package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;

/* renamed from: X.2iE  reason: invalid class name and case insensitive filesystem */
public class C50472iE {
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public DialogInterface.OnClickListener A06;
    public DialogInterface.OnClickListener A07;
    public CharSequence A08;
    public CharSequence A09;
    public Object[] A0A;
    public Object[] A0B;

    public DialogFragment A00() {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
        Bundle A002 = C57022sw.A00(this.A0A, this.A00, this.A05, this.A01, this.A03, this.A04, -1);
        if (this.A05 != 0) {
            C57022sw.A01(A002, "title_params_values", "title_params_types", this.A0B);
        }
        CharSequence charSequence = this.A09;
        if (charSequence != null) {
            A002.putCharSequence("title", charSequence);
        }
        CharSequence charSequence2 = this.A08;
        if (charSequence2 != null) {
            A002.putCharSequence("message", charSequence2);
        }
        int i = this.A02;
        if (i != 0) {
            A002.putInt("message_view_id", i);
        }
        if (!(this.A03 == 0 || (onClickListener2 = this.A06) == null)) {
            legacyMessageDialogFragment.A00 = onClickListener2;
        }
        if (!(this.A04 == 0 || (onClickListener = this.A07) == null)) {
            legacyMessageDialogFragment.A01 = onClickListener;
        }
        legacyMessageDialogFragment.A0u(A002);
        return legacyMessageDialogFragment;
    }

    public void A01(DialogInterface.OnClickListener onClickListener, int i) {
        this.A03 = i;
        this.A06 = onClickListener;
    }
}
