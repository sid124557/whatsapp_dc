package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.6ka  reason: invalid class name and case insensitive filesystem */
public class C135386ka extends AnonymousClass8HR {
    public final C620733j A00;
    public final C182548ob A01;
    public final AnonymousClass33O A02;

    public C135386ka(Context context, C64393Dh r8, C620733j r9, AnonymousClass5Y0 r10, C182548ob r11, AnonymousClass65N r12, AnonymousClass33O r13, String str) {
        super(context, r8, r10, r12, str);
        this.A00 = r9;
        this.A01 = r11;
        this.A02 = r13;
    }

    public void run() {
        C106985aV r1;
        File A0R = C107655bf.A0R(this.A01, this.A04);
        if (A0R.exists()) {
            r1 = C106985aV.A02(this.A00, this.A00, this.A02, this.A02, A0R);
        } else {
            r1 = null;
        }
        this.A01.BVW(r1);
    }
}
