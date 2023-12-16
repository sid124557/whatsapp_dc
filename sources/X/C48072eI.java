package X;

import com.whatsapp.util.Log;

/* renamed from: X.2eI  reason: invalid class name and case insensitive filesystem */
public final class C48072eI {
    public final AnonymousClass4FV A00;

    public C48072eI(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(int i, int i2, String str, int i3) {
        int i4;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                if (i3 != 0) {
                    i4 = 11;
                    if (i3 != 1) {
                        i4 = 12;
                    }
                } else {
                    i4 = 13;
                }
            } else if (i3 != 0) {
                i4 = 7;
                if (i3 != 1) {
                    i4 = 8;
                }
            } else {
                i4 = 9;
            }
        } else if (i3 != 0) {
            i4 = 4;
            if (i3 != 1) {
                i4 = 5;
            }
        } else {
            i4 = 6;
        }
        A01(str, i, i4);
    }

    public final void A01(String str, int i, int i2) {
        if (i != 0) {
            AnonymousClass1YK r1 = new AnonymousClass1YK();
            r1.A02 = str;
            r1.A01 = Integer.valueOf(i);
            r1.A00 = Integer.valueOf(i2);
            this.A00.BhD(r1);
            return;
        }
        Log.i("EmailVerificationLogger/populateAndLogEmailVerificationAction/action or source is invalid");
    }
}
