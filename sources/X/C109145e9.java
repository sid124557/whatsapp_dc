package X;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* renamed from: X.5e9  reason: invalid class name and case insensitive filesystem */
public class C109145e9 implements TextWatcher {
    public int A00;
    public C159157lD A01;
    public boolean A02 = false;
    public boolean A03;

    public synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        Editable editable2 = editable;
        if (this.A03) {
            if (editable2.length() == 0) {
                z = false;
            }
            this.A03 = z;
        } else if (!this.A02) {
            int selectionEnd = Selection.getSelectionEnd(editable2) - 1;
            C159157lD r4 = this.A01;
            r4.A07();
            int length = editable2.length();
            String str = null;
            char c = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable2.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        boolean z3 = false;
                        if (z2) {
                            z3 = true;
                        }
                        str = r4.A05(c, z3);
                        r4.A07 = str;
                        z2 = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z2 = true;
                }
            }
            if (c != 0) {
                boolean z4 = false;
                if (z2) {
                    z4 = true;
                }
                str = r4.A05(c, z4);
                r4.A07 = str;
            }
            if (str != null) {
                if (!r4.A0G) {
                    i = r4.A01;
                } else {
                    int i3 = 0;
                    i = 0;
                    while (i3 < r4.A02 && i < r4.A07.length()) {
                        if (r4.A0B.charAt(i3) == r4.A07.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A02 = true;
                editable2.replace(0, editable2.length(), str, 0, str.length());
                if (str.equals(editable2.toString())) {
                    Selection.setSelection(editable2, i);
                }
                this.A02 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r5 <= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0013
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0013
            if (r5 != 0) goto L_0x0014
            int r0 = r3.length()
            if (r0 != r4) goto L_0x0014
            r0 = 1
        L_0x0011:
            r2.A00 = r0
        L_0x0013:
            return
        L_0x0014:
            if (r6 != 0) goto L_0x0023
            int r1 = r4 + r5
            int r0 = r3.length()
            if (r1 != r0) goto L_0x0023
            r0 = 0
            if (r5 > 0) goto L_0x0011
        L_0x0021:
            r0 = 3
            goto L_0x0011
        L_0x0023:
            if (r5 <= 0) goto L_0x0021
            r1 = r4
        L_0x0026:
            int r0 = r4 + r5
            if (r1 >= r0) goto L_0x0037
            char r0 = r3.charAt(r1)
            boolean r0 = android.telephony.PhoneNumberUtils.isNonSeparator(r0)
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0037:
            r0 = 2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109145e9.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A03) {
            if (this.A00 == 3 && i3 > 0) {
                int i4 = i;
                while (true) {
                    if (i4 < i + i3) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                            break;
                        }
                        i4++;
                    } else {
                        this.A00 = 2;
                        break;
                    }
                }
            }
            if (this.A00 == 1 && i3 > 0) {
                int i5 = i;
                while (true) {
                    if (i5 < i + i3) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i5))) {
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
            if (this.A00 != 3) {
                return;
            }
            this.A03 = true;
            this.A01.A07();
        }
    }

    public C109145e9(String str) {
        boolean z = false;
        C626936e.A0B(str != null ? true : z);
        C162167rN.A00();
        this.A01 = new C159157lD(str);
    }
}
