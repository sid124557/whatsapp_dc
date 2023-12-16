package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;

/* renamed from: X.7z7  reason: invalid class name and case insensitive filesystem */
public final class C166697z7 implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiAadhaarCardVerificationActivity A02;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2 != 2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r2 = r4.A02
            com.whatsapp.wds.components.button.WDSButton r3 = r2.A04
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = "confirmButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0011:
            android.widget.EditText r0 = r2.A00
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "aadhaarNumber1"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001c:
            int r1 = X.C86624Kv.A03(r0)
            r0 = 4
            if (r1 != r0) goto L_0x0036
            android.widget.EditText r0 = r2.A01
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "aadhaarNumber2"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002e:
            int r2 = X.C86624Kv.A03(r0)
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.setEnabled(r0)
            int r1 = r5.length()
            int r0 = r4.A00
            if (r1 < r0) goto L_0x0047
            android.widget.EditText r0 = r4.A01
            r0.requestFocus()
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166697z7.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public C166697z7(EditText editText, IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity, int i) {
        this.A02 = indiaUpiAadhaarCardVerificationActivity;
        this.A00 = i;
        this.A01 = editText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
