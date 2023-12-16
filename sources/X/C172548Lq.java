package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.8Lq  reason: invalid class name and case insensitive filesystem */
public abstract class C172548Lq implements Iterable, Serializable {
    public static final C181348mc A00;
    public static final C172548Lq A01 = new C130256bf(C155647fF.A05);
    public int hash = 0;

    public static C172548Lq A01(byte[] bArr) {
        return A02(bArr, 0, bArr.length);
    }

    public int A03() {
        C130256bf r1 = (C130256bf) this;
        if (r1 instanceof C130246be) {
            return ((C130246be) r1).bytesLength;
        }
        return r1.bytes.length;
    }

    public C172548Lq A04(int i) {
        C130256bf r2 = (C130256bf) this;
        int A002 = A00(0, i, r2.A03());
        if (A002 == 0) {
            return A01;
        }
        return new C130246be(r2.bytes, r2.A08(), A002);
    }

    public void A06(byte[] bArr, int i) {
        C130256bf r3 = (C130256bf) this;
        if (r3 instanceof C130246be) {
            C130246be r32 = (C130246be) r3;
            System.arraycopy(r32.bytes, r32.bytesOffset, bArr, 0, i);
            return;
        }
        System.arraycopy(r3.bytes, 0, bArr, 0, i);
    }

    public abstract boolean equals(Object obj);

    static {
        C181348mc r0;
        if (C155397eo.A00 == null || C155397eo.A01) {
            r0 = new AnonymousClass8CW();
        } else {
            r0 = new AnonymousClass8CX();
        }
        A00 = r0;
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i < 0) {
            A0o.append("Beginning index: ");
            A0o.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0X(" < 0", A0o));
        } else if (i2 < i) {
            A0o.append("Beginning index larger than ending index: ");
            A0o.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", ", A0o, i2));
        } else {
            A0o.append("End index: ");
            A0o.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(" >= ", A0o, i3));
        }
    }

    public static C172548Lq A02(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new C130256bf(A00.Azn(bArr, i, i2));
    }

    public final String A05() {
        Charset charset = C155647fF.A04;
        if (A03() == 0) {
            return "";
        }
        C130256bf r0 = (C130256bf) this;
        return AnonymousClass6CA.A0W(charset, r0.bytes, r0.A08(), r0.A03());
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A03 = A03();
            C130256bf r0 = (C130256bf) this;
            byte[] bArr = r0.bytes;
            int A08 = r0.A08();
            i = A03;
            for (int i2 = A08; i2 < A08 + A03; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new AnonymousClass8O2(this);
    }

    public final String toString() {
        String A0X;
        Locale locale = Locale.ROOT;
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = AnonymousClass6CA.A0S(this);
        int A03 = A03();
        AnonymousClass000.A1M(A1X, A03);
        if (A03 <= 50) {
            A0X = AnonymousClass734.A00(this);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass734.A00(A04(47)));
            A0X = AnonymousClass000.A0X("...", A0o);
        }
        A1X[2] = A0X;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1X);
    }

    public final byte[] A07() {
        int A03 = A03();
        if (A03 == 0) {
            return C155647fF.A05;
        }
        byte[] bArr = new byte[A03];
        A06(bArr, A03);
        return bArr;
    }
}
