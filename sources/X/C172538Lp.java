package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.8Lp  reason: invalid class name and case insensitive filesystem */
public abstract class C172538Lp implements Iterable, Serializable {
    public static final C172538Lp A00 = new C128876Xu(C155597fA.A04);
    public static final C181028m1 A01;
    public int zzc = 0;

    public int A01() {
        C128876Xu r1 = (C128876Xu) this;
        if (r1 instanceof C128866Xt) {
            return ((C128866Xt) r1).zzd;
        }
        return r1.zzb.length;
    }

    public C172538Lp A02(int i) {
        C128876Xu r2 = (C128876Xu) this;
        int A002 = A00(0, i, r2.A01());
        if (A002 == 0) {
            return A00;
        }
        return new C128866Xt(r2.zzb, r2.A03(), A002);
    }

    public abstract boolean equals(Object obj);

    static {
        C181028m1 r0;
        if (C155367ek.A00()) {
            r0 = new C169688Ag();
        } else {
            r0 = new C169678Af();
        }
        A01 = r0;
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder A0Y = AnonymousClass6CA.A0Y(32);
            A0Y.append("Beginning index: ");
            A0Y.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0X(" < 0", A0Y));
        } else if (i2 < i) {
            StringBuilder A0Y2 = AnonymousClass6CA.A0Y(66);
            A0Y2.append("Beginning index larger than ending index: ");
            A0Y2.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", ", A0Y2, i2));
        } else {
            StringBuilder A0Y3 = AnonymousClass6CA.A0Y(37);
            A0Y3.append("End index: ");
            A0Y3.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(" >= ", A0Y3, i3));
        }
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A012 = A01();
            C128876Xu r0 = (C128876Xu) this;
            byte[] bArr = r0.zzb;
            int A03 = r0.A03();
            i = A012;
            for (int i2 = A03; i2 < A03 + A012; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new AnonymousClass8O1(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = AnonymousClass6CA.A0S(this);
        int A012 = A01();
        AnonymousClass000.A1M(A1X, A012);
        if (A012 <= 50) {
            concat = C1445672b.A00(this);
        } else {
            concat = String.valueOf(C1445672b.A00(A02(47))).concat("...");
        }
        A1X[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1X);
    }
}
