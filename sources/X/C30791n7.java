package X;

import android.os.Parcel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1n7  reason: invalid class name and case insensitive filesystem */
public class C30791n7 extends C624134x implements AnonymousClass4DV, AnonymousClass4B9, AnonymousClass4BA {
    public AnonymousClass39W A00;
    public List A01;

    public C624134x Az2(AnonymousClass2z0 r14, long j) {
        AnonymousClass39W A1v;
        List list;
        AnonymousClass2z0 r1 = r14;
        C162457s7.A0J(r14, 0);
        long j2 = j;
        if (C624134x.A0e(this)) {
            A1v = A1v();
        } else if (!C18300x5.A1T(this)) {
            return new C30791n7(r14, this, j, false);
        } else {
            A1v = A1v();
            if (A1v != null) {
                A1v.A09 = null;
                AnonymousClass39P r0 = A1v.A03;
                if (!(r0 == null || (list = r0.A03) == null)) {
                    list.clear();
                }
            }
        }
        return new C30791n7(r1, A1v, this, j2, false);
    }

    public C624134x Az3(AnonymousClass2z0 r11) {
        AnonymousClass2z0 r1 = r11;
        C162457s7.A0J(r11, 0);
        if (C624134x.A0e(this)) {
            return new C30791n7(r1, A1v(), this, this.A0K, true);
        }
        return new C30791n7(r11, this, this.A0K, true);
    }

    public final void A1w() {
        byte[] bArr;
        AnonymousClass39W r1 = this.A00;
        if (r1 != null) {
            bArr = r1.A05();
        } else {
            bArr = null;
        }
        C614630w A0y = A0y();
        if (A0y == null) {
            return;
        }
        if (bArr != null) {
            A0y.A04(bArr, true);
        } else {
            A0y.A03((byte[]) null);
        }
    }

    public final void A1x() {
        List list = this.A01;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (A0T instanceof AnonymousClass4DT) {
                    ((AnonymousClass4DT) A0T).Blw(this);
                }
            }
        }
    }

    public void Blz(AnonymousClass39W r1) {
        this.A00 = r1;
        A1w();
    }

    public final AnonymousClass39W A1v() {
        Parcel obtain = Parcel.obtain();
        C162457s7.A0D(obtain);
        AnonymousClass39W r1 = this.A00;
        if (r1 != null) {
            r1.writeToParcel(obtain, 0);
        }
        obtain.setDataPosition(0);
        return (AnonymousClass39W) AnonymousClass39W.CREATOR.createFromParcel(obtain);
    }

    public AnonymousClass39W B5s() {
        return this.A00;
    }

    public C30791n7(AnonymousClass2z0 r1, byte b, long j) {
        super(r1, b, j);
    }

    public C30791n7(AnonymousClass2z0 r7, AnonymousClass39W r8, C30791n7 r9, long j, boolean z) {
        super(r9, r7, j, z);
        this.A00 = r8;
        A1w();
    }

    public C30791n7(AnonymousClass2z0 r8, C30791n7 r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A00 = r9.A00;
        A1w();
    }
}
