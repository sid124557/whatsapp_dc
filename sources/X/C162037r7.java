package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7r7  reason: invalid class name and case insensitive filesystem */
public class C162037r7 {
    public Set A00 = AnonymousClass002.A0K();
    public Set A01 = AnonymousClass002.A0K();
    public Set A02 = AnonymousClass002.A0K();
    public Set A03 = AnonymousClass002.A0K();
    public Set A04 = AnonymousClass002.A0K();
    public Set A05 = AnonymousClass002.A0K();
    public Set A06;
    public Set A07;
    public Set A08;
    public Set A09;
    public Set A0A;
    public Set A0B;

    public static final int A00(Collection collection) {
        int hashCode;
        int i = 0;
        if (collection != null) {
            for (Object next : collection) {
                if (next instanceof byte[]) {
                    hashCode = C161007oo.A00((byte[]) next);
                } else {
                    hashCode = next.hashCode();
                }
                i += hashCode;
            }
        }
        return i;
    }

    public static final boolean A05(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        while (i < length) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            i = AnonymousClass6CA.A0A(bArr5, bArr[i] & bArr3[i], i);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public final boolean A0B(Collection collection, Collection collection2) {
        boolean equals;
        if (collection != collection2) {
            if (!(collection == null || collection2 == null || collection.size() != collection2.size())) {
                for (Object next : collection) {
                    for (Object next2 : collection2) {
                        if (next != next2) {
                            if (!(next == null || next2 == null)) {
                                if (!(next instanceof byte[]) || !(next2 instanceof byte[])) {
                                    equals = next.equals(next2);
                                } else {
                                    equals = Arrays.equals((byte[]) next, (byte[]) next2);
                                }
                                if (equals) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] A052 = C162077rB.A05(str2);
        String[] A053 = C162077rB.A05(str);
        int length = A053.length;
        int length2 = A052.length;
        if (length > length2) {
            int i = length - length2;
            int i2 = -1;
            while (!A053[i - 1].equals("")) {
                while (true) {
                    i2++;
                    if (i2 >= length2) {
                        return true;
                    }
                    if (i2 != -1) {
                        if (!A052[i2].equalsIgnoreCase(A053[i2 + i])) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void A07(C176618dI r4) {
        Set<C176958dq> set = this.A00;
        C176958dq A0C = C176958dq.A0C(r4);
        if (!set.isEmpty()) {
            for (C176958dq A042 : set) {
                if (A04(A0C, A042)) {
                    throw new C143406yp("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    public void A08(C176618dI r4) {
        Set<C176958dq> set = this.A06;
        C176958dq A0C = C176958dq.A0C(r4.A01);
        if (set == null) {
            return;
        }
        if (!set.isEmpty() || A0C.A0U() != 0) {
            for (C176958dq A042 : set) {
                if (A04(A0C, A042)) {
                    return;
                }
            }
            throw new C143406yp("Subject distinguished name is not from a permitted subtree");
        }
    }

    public final boolean A09(String str, String str2) {
        boolean A032;
        String A0c = AnonymousClass6C9.A0c(str.indexOf(64), str);
        if (str2.indexOf(64) != -1) {
            if (!str.equalsIgnoreCase(str2)) {
                A032 = A0c.equalsIgnoreCase(str2.substring(1));
            }
            return true;
        } else if (str2.charAt(0) != '.') {
            A032 = A0c.equalsIgnoreCase(str2);
        } else {
            A032 = A03(A0c, str2);
        }
        if (!A032) {
            return false;
        }
        return true;
    }

    public final boolean A0A(String str, String str2) {
        boolean A032;
        String A0c = AnonymousClass6C9.A0c(str.indexOf(58), str);
        int indexOf = A0c.indexOf("//");
        if (indexOf != -1) {
            A0c = A0c.substring(indexOf + 2);
        }
        int lastIndexOf = A0c.lastIndexOf(58);
        if (lastIndexOf != -1) {
            A0c = A0c.substring(0, lastIndexOf);
        }
        String A0c2 = AnonymousClass6C9.A0c(A0c.indexOf(58), A0c);
        String A0c3 = AnonymousClass6C9.A0c(A0c2.indexOf(64), A0c2);
        int indexOf2 = A0c3.indexOf(47);
        if (indexOf2 != -1) {
            A0c3 = A0c3.substring(0, indexOf2);
        }
        if (!str2.startsWith(".")) {
            A032 = A0c3.equalsIgnoreCase(str2);
        } else {
            A032 = A03(A0c3, str2);
        }
        if (A032) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C162037r7)) {
            return false;
        }
        C162037r7 r4 = (C162037r7) obj;
        if (!A0B(r4.A00, this.A00) || !A0B(r4.A01, this.A01) || !A0B(r4.A02, this.A02) || !A0B(r4.A03, this.A03) || !A0B(r4.A05, this.A05) || !A0B(r4.A04, this.A04) || !A0B(r4.A06, this.A06) || !A0B(r4.A07, this.A07) || !A0B(r4.A08, this.A08) || !A0B(r4.A09, this.A09) || !A0B(r4.A0B, this.A0B) || !A0B(r4.A0A, this.A0A)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return A00(this.A00) + A00(this.A01) + A00(this.A02) + A00(this.A03) + A00(this.A05) + A00(this.A04) + A00(this.A06) + A00(this.A07) + A00(this.A08) + A00(this.A09) + A00(this.A0B) + A00(this.A0A);
    }

    public static final String A01(Set set) {
        StringBuilder A0p = AnonymousClass001.A0p();
        for (Object A0A2 : set) {
            if (A0p.length() > 1) {
                C18320x8.A1K(A0p);
            }
            C176308cn A0A3 = C176308cn.A0A(A0A2);
            C18290x4.A1R(A0p, A0A3.A01.A01);
            try {
                byte[] A0L = A0A3.A00.Bqk().A0L();
                A0p.append(AnonymousClass6C9.A0g(A0L, A0L.length));
            } catch (IOException e) {
                AnonymousClass000.A1B(e, A0p);
            }
        }
        return AnonymousClass000.A0f(A0p);
    }

    public static final void A02(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(C162077rB.A00);
    }

    public static boolean A04(C176958dq r8, C176958dq r9) {
        boolean A062;
        if (r9.A0U() >= 1 && r9.A0U() <= r8.A0U()) {
            C176538dA A0B2 = C176538dA.A0B(r9.A0W(0));
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < r8.A0U()) {
                    if (C161947qs.A06(A0B2, C176538dA.A0B(r8.A0W(i)))) {
                        break;
                    }
                    i2 = i;
                    i++;
                } else {
                    i = i2;
                    break;
                }
            }
            if (r9.A0U() <= r8.A0U() - i) {
                int i3 = 0;
                while (i3 < r9.A0U()) {
                    C176538dA A0B3 = C176538dA.A0B(r9.A0W(i3));
                    C176538dA A0B4 = C176538dA.A0B(r8.A0W(i + i3));
                    if (A0B3.A00.A01.length == A0B4.A00.A01.length && A0B3.A0N().A01.A0T(A0B4.A0N().A01)) {
                        if (A0B3.A00.A01.length != 1 || !A0B3.A0N().A01.A0T(C177118e6.A0Y)) {
                            A062 = C161947qs.A06(A0B3, A0B4);
                        } else {
                            A062 = A0B4.A0N().A00.toString().startsWith(A0B3.A0N().A00.toString());
                        }
                        if (A062) {
                            i3++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String A06(Set set) {
        int length;
        int i;
        StringBuilder A0p = AnonymousClass001.A0p();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (A0p.length() > 1) {
                C18320x8.A1K(A0p);
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder A0o = AnonymousClass001.A0o();
            int i2 = 0;
            while (true) {
                length = bArr.length;
                i = length / 2;
                if (i2 >= i) {
                    break;
                }
                if (A0o.length() > 0) {
                    A0o.append(".");
                }
                A0o.append(Integer.toString(bArr[i2] & 255));
                i2++;
            }
            A0o.append("/");
            boolean z = true;
            while (i < length) {
                if (z) {
                    z = false;
                } else {
                    A0o.append(".");
                }
                A0o.append(Integer.toString(bArr[i] & 255));
                i++;
            }
            AnonymousClass000.A1B(A0o, A0p);
        }
        return AnonymousClass000.A0f(A0p);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A02(A0o, "permitted:");
        Set set = this.A06;
        if (set != null) {
            A02(A0o, "DN:");
            A02(A0o, set.toString());
        }
        Set set2 = this.A07;
        if (set2 != null) {
            A02(A0o, "DNS:");
            A02(A0o, set2.toString());
        }
        Set set3 = this.A08;
        if (set3 != null) {
            A02(A0o, "Email:");
            A02(A0o, set3.toString());
        }
        Set set4 = this.A0B;
        if (set4 != null) {
            A02(A0o, "URI:");
            A02(A0o, set4.toString());
        }
        Set set5 = this.A09;
        if (set5 != null) {
            A02(A0o, "IP:");
            A02(A0o, A06(set5));
        }
        Set set6 = this.A0A;
        if (set6 != null) {
            A02(A0o, "OtherName:");
            A02(A0o, A01(set6));
        }
        A02(A0o, "excluded:");
        if (!this.A00.isEmpty()) {
            A02(A0o, "DN:");
            A02(A0o, this.A00.toString());
        }
        if (!this.A01.isEmpty()) {
            A02(A0o, "DNS:");
            A02(A0o, this.A01.toString());
        }
        if (!this.A02.isEmpty()) {
            A02(A0o, "Email:");
            A02(A0o, this.A02.toString());
        }
        if (!this.A05.isEmpty()) {
            A02(A0o, "URI:");
            A02(A0o, this.A05.toString());
        }
        if (!this.A03.isEmpty()) {
            A02(A0o, "IP:");
            A02(A0o, A06(this.A03));
        }
        if (!this.A04.isEmpty()) {
            A02(A0o, "OtherName:");
            A02(A0o, A01(this.A04));
        }
        return A0o.toString();
    }
}
