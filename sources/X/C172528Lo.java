package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.8Lo  reason: invalid class name and case insensitive filesystem */
public abstract class C172528Lo implements Iterable, Serializable {
    public static final C172528Lo A00 = new C128286Vm(C155587f9.A04);
    public static final C180978lw A01;
    public int zzfk = 0;

    public byte A01(int i) {
        C128286Vm r3 = (C128286Vm) this;
        if (!(r3 instanceof C128276Vl)) {
            return r3.zzfp[i];
        }
        C128276Vl r32 = (C128276Vl) r3;
        int i2 = r32.zzfn;
        if (((i2 - (i + 1)) | i) >= 0) {
            return r32.zzfp[r32.zzfm + i];
        }
        if (i < 0) {
            throw AnonymousClass6C7.A0T("Index < 0: ", AnonymousClass6CA.A0Y(22), i);
        }
        StringBuilder A0Y = AnonymousClass6CA.A0Y(40);
        A0Y.append("Index > length: ");
        A0Y.append(i);
        throw AnonymousClass6C7.A0T(", ", A0Y, i2);
    }

    public int A02() {
        C128286Vm r1 = (C128286Vm) this;
        if (r1 instanceof C128276Vl) {
            return ((C128276Vl) r1).zzfn;
        }
        return r1.zzfp.length;
    }

    public void A03(C150347Qg r4) {
        C128286Vm r0 = (C128286Vm) this;
        ((C128346Vs) r4).A0E(r0.zzfp, r0.A04(), r0.A02());
    }

    public abstract boolean equals(Object obj);

    static {
        C180978lw r0;
        if (C155357ej.A00 == null || C155357ej.A01) {
            r0 = new AnonymousClass8AP();
        } else {
            r0 = new AnonymousClass8AQ();
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
        int i = this.zzfk;
        if (i == 0) {
            int A02 = A02();
            C128286Vm r0 = (C128286Vm) this;
            byte[] bArr = r0.zzfp;
            int A04 = r0.A04();
            i = A02;
            for (int i2 = A04; i2 < A04 + A02; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzfk = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C172958Nq(this);
    }

    public final String toString() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = AnonymousClass6CA.A0S(this);
        AnonymousClass000.A1M(A0M, A02());
        return String.format("<ByteString@%s size=%d>", A0M);
    }
}
