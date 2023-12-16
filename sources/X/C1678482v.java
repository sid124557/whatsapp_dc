package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.82v  reason: invalid class name and case insensitive filesystem */
public final class C1678482v implements C188148yO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.Config A03 = Bitmap.Config.ARGB_8888;
    public final C183748qZ A04;
    public final C142446xD A05;
    public final C151077Ti A06;
    public final C157827iw A07;

    public C1678482v(C183748qZ r2, C142446xD r3, C151077Ti r4, C157827iw r5, int i, int i2, int i3) {
        C162457s7.A0J(r3, 4);
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = r3;
        this.A04 = r2;
        this.A07 = r5;
        this.A06 = r4;
    }

    public C142446xD BBh() {
        return this.A05;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C188148yO r3 = (C188148yO) obj;
        C162457s7.A0J(r3, 1);
        return r3.BBh().compareTo(this.A05);
    }

    public void run() {
        LinkedHashMap A0r = C18320x8.A0r();
        C157827iw r4 = this.A07;
        C172258Kh A012 = r4.A01(this.A03, this.A02, this.A00);
        Iterator it = C175708Zk.A02(0, this.A01).iterator();
        while (it.hasNext()) {
            int A002 = ((C72013d2) it).A00();
            if (C172258Kh.A01(A012)) {
                Bitmap A003 = C172258Kh.A00(A012);
                boolean A004 = this.A06.A00(A003, A002);
                if (A003 != null && A004) {
                    AnonymousClass0x2.A1H(r4.A02(A003), A0r, A002);
                }
            }
            A012.close();
            for (C172258Kh r0 : A0r.values()) {
                if (r0 != null) {
                    r0.close();
                }
            }
            this.A04.BSi();
        }
        A012.close();
        this.A04.BdH(A0r);
    }
}
