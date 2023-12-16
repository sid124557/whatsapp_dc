package X;

import android.os.Bundle;
import com.whatsapp.dialogs.ProgressDialogFragment;

/* renamed from: X.5X0  reason: invalid class name */
public class AnonymousClass5X0 {
    public static boolean A02;
    public static final String A03 = ProgressDialogFragment.class.getName();
    public ProgressDialogFragment A00;
    public final C89654ea A01;

    public void A00(String str, String str2) {
        if (this.A00 == null) {
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("title", str);
            A08.putString("message", str2);
            progressDialogFragment.A0u(A08);
            this.A00 = progressDialogFragment;
            progressDialogFragment.A1O(this.A01.getSupportFragmentManager(), A03);
        }
        A02 = true;
    }

    public AnonymousClass5X0(C89654ea r1) {
        this.A01 = r1;
    }
}
