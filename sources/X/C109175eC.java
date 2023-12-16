package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5eC  reason: invalid class name and case insensitive filesystem */
public final class C109175eC implements TextWatcher {
    public int A00 = -1;
    public int A01 = -1;
    public String A02 = "";
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final WaEditText A07;
    public final WaEditText A08;
    public final WaEditText A09;
    public final AnonymousClass4BE A0A;
    public final AnonymousClass5UC A0B;
    public final ArrayList A0C;

    public void afterTextChanged(Editable editable) {
        int i;
        boolean isLetterOrDigit;
        String str;
        boolean isLetterOrDigit2;
        if (!TextUtils.isEmpty(this.A02)) {
            WaEditText waEditText = this.A07;
            waEditText.removeTextChangedListener(this);
            waEditText.setText("");
            waEditText.addTextChangedListener(this);
        }
        if (!TextUtils.isEmpty(editable) || this.A00 != 0) {
            int i2 = this.A00;
            WaEditText waEditText2 = this.A07;
            if (i2 == 1) {
                waEditText2.removeTextChangedListener(this);
                char charAt = editable.charAt(this.A01);
                int i3 = this.A04;
                if (i3 != 1) {
                    isLetterOrDigit2 = Character.isDigit(charAt);
                } else {
                    isLetterOrDigit2 = Character.isLetterOrDigit(charAt);
                }
                if (isLetterOrDigit2) {
                    String ch = Character.toString(editable.charAt(this.A01));
                    if (i3 == 1) {
                        ch = C86664Kz.A1L(ch);
                    }
                    waEditText2.setText(ch);
                    WaEditText waEditText3 = this.A08;
                    if (waEditText3 != null && !C86634Kw.A1X(waEditText2)) {
                        waEditText3.requestFocus();
                    }
                } else {
                    waEditText2.setText("");
                }
                waEditText2.addTextChangedListener(this);
            } else {
                waEditText2.removeTextChangedListener(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = this.A06;
                    if (i4 >= i || i5 >= editable.length()) {
                        waEditText2.addTextChangedListener(this);
                        int i6 = this.A00;
                    } else {
                        char charAt2 = editable.charAt(i5);
                        int i7 = this.A04;
                        if (i7 != 1) {
                            isLetterOrDigit = Character.isDigit(charAt2);
                        } else {
                            isLetterOrDigit = Character.isLetterOrDigit(charAt2);
                        }
                        if (!isLetterOrDigit) {
                            i4--;
                        } else {
                            if (i5 < this.A00) {
                                str = Character.toString(editable.charAt(i5));
                            } else {
                                str = "";
                            }
                            TextView textView = (TextView) this.A0C.get(i4);
                            if (i7 == 1) {
                                str = C86664Kz.A1L(str);
                            }
                            textView.setText(str);
                        }
                        i4++;
                        i5++;
                    }
                }
                waEditText2.addTextChangedListener(this);
                int i62 = this.A00;
                if (i62 < i) {
                    ((View) this.A0C.get(i62)).requestFocus();
                }
                if (this.A05 != AnonymousClass0x9.A03(this.A0C, 1)) {
                    return;
                }
            }
            String A002 = this.A0B.A00();
            if (A002.length() == this.A0C.size()) {
                waEditText2.A05();
                AnonymousClass4BE r1 = this.A0A;
                if (r1 == null) {
                    Log.e("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged/invalid callback");
                    return;
                }
                Log.i("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged trigger callback");
                r1.BPJ(A002);
            }
        } else if (this.A07.hasFocus() && this.A03) {
            WaEditText waEditText4 = this.A09;
            C626936e.A04(waEditText4);
            waEditText4.setText("");
            waEditText4.requestFocus();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if (!C86634Kw.A1X(this.A07)) {
            this.A02 = charSequence.toString();
        } else if (this.A09 != null) {
            z = true;
        }
        this.A03 = z;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
    }

    public C109175eC(WaEditText waEditText, WaEditText waEditText2, WaEditText waEditText3, AnonymousClass4BE r5, AnonymousClass5UC r6, ArrayList arrayList, int i, int i2, int i3) {
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = arrayList;
        this.A09 = waEditText;
        this.A07 = waEditText2;
        this.A08 = waEditText3;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
    }
}
