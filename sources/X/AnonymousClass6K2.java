package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.6K2  reason: invalid class name */
public final class AnonymousClass6K2 extends AnonymousClass6K4 {
    public int A00 = -1;
    public Timeline A01;
    public C140536tu A02;
    public Object A03;
    public final AnonymousClass712 A04;
    public final ArrayList A05;
    public final C185778uE[] A06;

    public AnonymousClass6K2(C185778uE... r2) {
        AnonymousClass712 r0 = new AnonymousClass712();
        this.A06 = r2;
        this.A04 = r0;
        this.A05 = AnonymousClass0x2.A0i(r2);
    }

    public C187418xB B0v(AnonymousClass7Z2 r6, AnonymousClass7ZV r7, long j) {
        C185778uE[] r4 = this.A06;
        int length = r4.length;
        C187418xB[] r2 = new C187418xB[length];
        for (int i = 0; i < length; i++) {
            r2[i] = r4[i].B0v(r6, r7, j);
        }
        return new AnonymousClass81R(this.A04, r2);
    }

    public void BL3() {
        C140536tu r0 = this.A02;
        if (r0 == null) {
            super.BL3();
            return;
        }
        throw r0;
    }

    public void Biu(C187418xB r4) {
        AnonymousClass81R r42 = (AnonymousClass81R) r4;
        int i = 0;
        while (true) {
            C185778uE[] r1 = this.A06;
            if (i < r1.length) {
                r1[i].Biu(r42.A07[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void A00() {
        super.A00();
        this.A01 = null;
        this.A03 = null;
        this.A00 = -1;
        this.A02 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A06);
    }

    public void A01(C153737br r5, boolean z) {
        super.A01(r5, z);
        int i = 0;
        while (true) {
            C185778uE[] r2 = this.A06;
            if (i < r2.length) {
                A03(r2[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
