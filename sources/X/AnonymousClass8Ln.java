package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.8Ln  reason: invalid class name */
public abstract class AnonymousClass8Ln implements Iterable, Serializable {
    public static final AnonymousClass8Ln A00 = new AnonymousClass6VD(C155637fE.A05);
    public int zzc = 0;

    public int A01() {
        AnonymousClass6VD r1 = (AnonymousClass6VD) this;
        if (r1 instanceof AnonymousClass6VC) {
            return ((AnonymousClass6VC) r1).zzc;
        }
        return r1.zza.length;
    }

    public abstract boolean equals(Object obj);

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

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A01 = A01();
            byte[] bArr = ((AnonymousClass6VD) this).zza;
            i = A01;
            for (int i2 = 0; i2 < A01; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new AnonymousClass8O0(this);
    }

    public final String toString() {
        AnonymousClass8Ln r1;
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = AnonymousClass6CA.A0S(this);
        int A01 = A01();
        AnonymousClass000.A1M(A1X, A01);
        if (A01 <= 50) {
            concat = AnonymousClass72S.A00(this);
        } else {
            AnonymousClass6VD r3 = (AnonymousClass6VD) this;
            int A002 = A00(0, 47, r3.A01());
            if (A002 == 0) {
                r1 = A00;
            } else {
                r1 = new AnonymousClass6VC(r3.zza, A002);
            }
            concat = AnonymousClass72S.A00(r1).concat("...");
        }
        A1X[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1X);
    }
}
