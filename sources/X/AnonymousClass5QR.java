package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.5QR  reason: invalid class name */
public class AnonymousClass5QR {
    public final C59042wF A00;
    public final C103205Ly A01;
    public final AnonymousClass5M0 A02;
    public final C113895mA A03;
    public final C55602qc A04;

    public AnonymousClass5ZT A00(View view, C89644eZ r15, AnonymousClass4VH r16, C627736r r17, C185168tC r18) {
        return this.A01.A00(view, r15, r15, r16, this.A00.A01(r15, view), this.A02.A00(r15, r17), r18, (AnonymousClass5H0) null, true, AnonymousClass001.A1X(Build.VERSION.SDK_INT, 26));
    }

    public AnonymousClass5ZT A01(C89654ea r14, KeyboardPopupLayout keyboardPopupLayout, AnonymousClass4VH r16, C627736r r17, C185168tC r18) {
        return this.A01.A00(keyboardPopupLayout, r14, r14, r16, this.A00.A01(r14, keyboardPopupLayout), this.A02.A00(r14, r17), r18, new AnonymousClass5H0(this), false, AnonymousClass001.A1X(Build.VERSION.SDK_INT, 26));
    }

    public AnonymousClass5QR(C59042wF r1, C103205Ly r2, AnonymousClass5M0 r3, C113895mA r4, C55602qc r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
