package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* renamed from: X.81Y  reason: invalid class name */
public final class AnonymousClass81Y implements AnonymousClass4FL {
    public C160767oH A00;
    public final Object A01;
    public final /* synthetic */ AnonymousClass6K4 A02;

    public AnonymousClass81Y(AnonymousClass6K4 r5, Object obj) {
        this.A02 = r5;
        this.A00 = new C160767oH((AnonymousClass7Z2) null, r5.A03.A02, 0);
        this.A01 = obj;
    }

    public final C150007Ot A00(C150007Ot r11) {
        long j = r11.A04;
        long j2 = r11.A03;
        if (j == j && j2 == j2) {
            return r11;
        }
        int i = r11.A00;
        int i2 = r11.A02;
        return new C150007Ot(r11.A05, r11.A06, i, i2, r11.A01, j, j2);
    }

    public final boolean A01(AnonymousClass7Z2 r8, int i) {
        if (r8 != null) {
            AnonymousClass6K4 r0 = this.A02;
            Object obj = this.A01;
            if (r0 instanceof AnonymousClass6K3) {
                AnonymousClass8LX r6 = (AnonymousClass8LX) obj;
                int i2 = 0;
                while (true) {
                    List list = r6.A04;
                    if (i2 >= list.size()) {
                        return false;
                    }
                    if (((AnonymousClass81T) list.get(i2)).A04.A03 == r8.A03) {
                        r8 = r8.A00(r8.A02 + r6.A01);
                        break;
                    }
                    i2++;
                }
            }
        } else {
            r8 = null;
        }
        AnonymousClass6K4 r2 = this.A02;
        Object obj2 = this.A01;
        if (r2 instanceof AnonymousClass6K3) {
            i += ((AnonymousClass8LX) obj2).A02;
        }
        C160767oH r1 = this.A00;
        if (r1.A00 == i && Util.A0D(r1.A01, r8)) {
            return true;
        }
        this.A00 = new C160767oH(r8, r2.A03.A02, i);
        return true;
    }

    public void BRb(AnonymousClass7Z2 r3, C150007Ot r4, int i) {
        if (A01(r3, i)) {
            this.A00.A0A(A00(r4));
        }
    }

    public void BVI(AnonymousClass7Z2 r3, AnonymousClass7A4 r4, C150007Ot r5, int i) {
        if (A01(r3, i)) {
            this.A00.A06(r4, A00(r5));
        }
    }

    public void BVM(AnonymousClass7Z2 r3, AnonymousClass7A4 r4, C150007Ot r5, Object obj, Object obj2, int i) {
        if (A01(r3, i)) {
            this.A00.A09(r4, A00(r5), obj);
        }
    }

    public void BVQ(AnonymousClass7Z2 r3, AnonymousClass7A4 r4, C150007Ot r5, IOException iOException, int i, boolean z) {
        if (A01(r3, i)) {
            this.A00.A08(r4, A00(r5), iOException, z);
        }
    }

    public void BVZ(AnonymousClass7Z2 r3, AnonymousClass7A4 r4, C150007Ot r5, int i) {
        if (A01(r3, i)) {
            this.A00.A07(r4, A00(r5));
        }
    }

    public void BW8(AnonymousClass7Z2 r2, int i) {
        if (A01(r2, i)) {
            this.A00.A02();
        }
    }

    public void BW9(AnonymousClass7Z2 r2, int i) {
        if (A01(r2, i)) {
            this.A00.A03();
        }
    }

    public void BZR(AnonymousClass7Z2 r2, int i) {
        if (A01(r2, i)) {
            this.A00.A04();
        }
    }
}
