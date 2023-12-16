package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8LM  reason: invalid class name */
public final class AnonymousClass8LM implements Cloneable {
    public Object A00;
    public List A01 = AnonymousClass001.A0s();

    public final int A00() {
        if (this.A00 == null) {
            Iterator it = this.A01.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final void A01() {
        if (this.A00 == null) {
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        Object clone;
        AnonymousClass8LM r3 = new AnonymousClass8LM();
        try {
            List list = this.A01;
            if (list == null) {
                r3.A01 = null;
            } else {
                r3.A01.addAll(list);
            }
            Object obj = this.A00;
            if (obj != null) {
                if (obj instanceof C160607nx) {
                    clone = ((C160607nx) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        Object[] objArr = new byte[bArr.length][];
                        r3.A00 = objArr;
                        while (i < bArr.length) {
                            objArr[i] = bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof C160607nx[]) {
                        C160607nx[] r4 = (C160607nx[]) obj;
                        Object[] objArr2 = new C160607nx[r4.length];
                        r3.A00 = objArr2;
                        while (i < r4.length) {
                            objArr2[i] = r4[i].clone();
                            i++;
                        }
                    }
                }
                r3.A00 = clone;
                return r3;
            }
            return r3;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass8LM)) {
            return false;
        }
        AnonymousClass8LM r5 = (AnonymousClass8LM) obj;
        if (this.A00 == null || r5.A00 == null) {
            List list2 = this.A01;
            if (list2 != null && (list = r5.A01) != null) {
                return list2.equals(list);
            }
            try {
                int A002 = A00();
                byte[] bArr = new byte[A002];
                new C161777qQ(bArr, A002);
                A01();
                int A003 = r5.A00();
                byte[] bArr2 = new byte[A003];
                new C161777qQ(bArr2, A003);
                r5.A01();
                return Arrays.equals(bArr, bArr2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw AnonymousClass001.A0g("zzrk");
        }
    }

    public final int hashCode() {
        try {
            int A002 = A00();
            byte[] bArr = new byte[A002];
            new C161777qQ(bArr, A002);
            A01();
            return Arrays.hashCode(bArr) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
