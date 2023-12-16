package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.90u  reason: invalid class name and case insensitive filesystem */
public class C1893090u implements C1227165l {
    public Object A00;
    public final int A01;

    public C1893090u(C116505qO r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BP1() {
        switch (this.A01) {
            case 0:
                ((C116505qO) this.A00).Az5();
                return;
            case 1:
                C116505qO r7 = (C116505qO) this.A00;
                String str = r7.A0F;
                Context context = r7.A0K;
                C150197Pr r5 = r7.A0Z;
                C111095hX r4 = r7.A0M;
                if (str != null) {
                    r4.BkW(context, Uri.parse(str), (C624134x) null);
                }
                r5.A02 = true;
                r5.A00 = 1;
                r7.Az5();
                return;
            default:
                C116505qO r1 = (C116505qO) this.A00;
                if (r1.A0I) {
                    r1.B2u(false);
                    return;
                } else {
                    r1.B2a();
                    return;
                }
        }
    }
}
