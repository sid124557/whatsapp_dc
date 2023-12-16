package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0Nm  reason: invalid class name and case insensitive filesystem */
public class C04270Nm {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;
    public boolean A04 = true;
    public boolean A05 = false;

    public AnonymousClass0MY A00() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.A03)) {
            int i = this.A00;
            if (C02580Gu.A00(i)) {
                if (i != 0) {
                    z = AnonymousClass000.A1S(i & 32768);
                } else {
                    z = this.A05;
                }
                if (TextUtils.isEmpty(this.A01) && !z) {
                    throw AnonymousClass001.A0c("Negative text must be set and non-empty.");
                } else if (TextUtils.isEmpty(this.A01) || !z) {
                    return new AnonymousClass0MY(this.A03, this.A02, this.A01, this.A00, this.A04, this.A05);
                } else {
                    throw AnonymousClass001.A0c("Negative text must not be set if device credential authentication is allowed.");
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Authenticator combination is unsupported on API ");
                A0o.append(Build.VERSION.SDK_INT);
                A0o.append(": ");
                if (i == 15) {
                    str = "BIOMETRIC_STRONG";
                } else if (i == 255) {
                    str = "BIOMETRIC_WEAK";
                } else if (i == 32768) {
                    str = "DEVICE_CREDENTIAL";
                } else if (i == 32783) {
                    str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                } else if (i != 33023) {
                    str = String.valueOf(i);
                } else {
                    str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                }
                throw AnonymousClass000.A0F(str, A0o);
            }
        } else {
            throw AnonymousClass001.A0c("Title must be set and non-empty.");
        }
    }
}
