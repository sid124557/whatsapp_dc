package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.8dq  reason: invalid class name and case insensitive filesystem */
public abstract class C176958dq extends C177088e3 implements C188118yL {
    public C183618qL[] A00;

    public static C183618qL A0A(C176958dq r1) {
        return r1.A0W(0);
    }

    public static C183618qL A0B(C176958dq r1) {
        return r1.A0W(1);
    }

    public static C176958dq A0C(Object obj) {
        if (obj == null || (obj instanceof C176958dq)) {
            return (C176958dq) obj;
        }
        if (obj instanceof C188568z8) {
            return A0C(((C183618qL) obj).Bqk());
        }
        if (obj instanceof byte[]) {
            try {
                return A0C(C177088e3.A0I((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct sequence from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            if (obj instanceof C183618qL) {
                C177088e3 Bqk = ((C183618qL) obj).Bqk();
                if (Bqk instanceof C176958dq) {
                    return (C176958dq) Bqk;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public static C176958dq A0D(C176908dl r2, boolean z) {
        if (!z) {
            C177088e3 A03 = AnonymousClass8Q0.A03(r2);
            if (r2.A02) {
                if (r2 instanceof C177008dv) {
                    return new C176928dn((C183618qL) A03);
                }
                return new C176938do((C183618qL) A03);
            } else if (A03 instanceof C176958dq) {
                C176958dq r1 = (C176958dq) A03;
                if (r2 instanceof C177008dv) {
                    return r1;
                }
                return (C176958dq) r1.A0P();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "unknown object in getInstance: ", r2);
                throw C18310x6.A0d(A0o);
            }
        } else if (r2.A02) {
            return A0C(AnonymousClass8Q0.A03(r2));
        } else {
            throw AnonymousClass001.A0c("object implicit - explicit expected.");
        }
    }

    public C177088e3 A0O() {
        return new C176948dp(this.A00, false);
    }

    public void A0Q(C159057l2 r10, boolean z) {
        C176678dO r6;
        C159057l2 r4;
        if (this instanceof C176918dm) {
            C176918dm r2 = (C176918dm) this;
            synchronized (r2) {
                byte[] bArr = r2.A00;
                if (bArr != null) {
                    r10.A03(bArr, 48, z);
                } else {
                    new C176938do(r2.A00).A0Q(r10, z);
                }
            }
        } else if (this instanceof C176938do) {
            C176938do r5 = (C176938do) this;
            if (z) {
                r10.A00.write(48);
            }
            if ((r10 instanceof C176668dN) || (r10 instanceof C176678dO)) {
                r4 = r10;
            } else {
                r4 = new C176668dN(r10.A00);
            }
            int length = r5.A00.length;
            int i = r5.A00;
            int i2 = 0;
            if (i < 0) {
                if (length > 16) {
                    int i3 = 0;
                    i = 0;
                    do {
                        i = AnonymousClass8Q0.A00(r5.A00, i3, i);
                        i3++;
                    } while (i3 < length);
                    r5.A00 = i;
                } else {
                    C177088e3[] r8 = new C177088e3[length];
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        C177088e3 A0P = r5.A00[i5].Bqk().A0P();
                        r8[i5] = A0P;
                        i4 += A0P.A0N();
                    }
                    r5.A00 = i4;
                    r10.A00(i4);
                    while (i2 < length) {
                        r4.A02(r8[i2], true);
                        i2++;
                    }
                    return;
                }
            }
            r10.A00(i);
            while (i2 < length) {
                r4.A02(r5.A00[i2].Bqk(), true);
                i2++;
            }
        } else if (this instanceof C176948dp) {
            C176948dp r7 = (C176948dp) this;
            if (z) {
                r10.A00.write(48);
            }
            if (r10 instanceof C176678dO) {
                r6 = (C176678dO) r10;
            } else {
                r6 = new C176678dO(r10.A00);
            }
            int length2 = r7.A00.length;
            int i6 = r7.A00;
            int i7 = 0;
            if (i6 < 0) {
                if (length2 > 16) {
                    int i8 = 0;
                    i6 = 0;
                    do {
                        i6 += AnonymousClass8Q0.A04(r7.A00, i8).A0N();
                        i8++;
                    } while (i8 < length2);
                    r7.A00 = i6;
                } else {
                    C177088e3[] r3 = new C177088e3[length2];
                    int i9 = 0;
                    for (int i10 = 0; i10 < length2; i10++) {
                        C177088e3 A04 = AnonymousClass8Q0.A04(r7.A00, i10);
                        r3[i10] = A04;
                        i9 += A04.A0N();
                    }
                    r7.A00 = i9;
                    r10.A00(i9);
                    while (i7 < length2) {
                        r3[i7].A0Q(r6, true);
                        i7++;
                    }
                    return;
                }
            }
            r10.A00(i6);
            while (i7 < length2) {
                AnonymousClass8Q0.A04(r7.A00, i7).A0Q(r6, true);
                i7++;
            }
        } else {
            r10.A04(this.A00, 48, z);
        }
    }

    public int A0U() {
        int length;
        if (!(this instanceof C176918dm)) {
            return this.A00.length;
        }
        C176918dm r1 = (C176918dm) this;
        synchronized (r1) {
            r1.A0X();
            length = r1.A00.length;
        }
        return length;
    }

    public Enumeration A0V() {
        Enumeration enumeration;
        if (!(this instanceof C176918dm)) {
            return new C1894891m(this);
        }
        C176918dm r2 = (C176918dm) this;
        synchronized (r2) {
            byte[] bArr = r2.A00;
            if (bArr != null) {
                enumeration = new C172858Nc(bArr);
            } else {
                enumeration = new C1894891m((C176958dq) r2);
            }
        }
        return enumeration;
    }

    public C183618qL A0W(int i) {
        C183618qL r0;
        if (!(this instanceof C176918dm)) {
            return this.A00[i];
        }
        C176918dm r1 = (C176918dm) this;
        synchronized (r1) {
            r1.A0X();
            r0 = r1.A00[i];
        }
        return r0;
    }

    public int hashCode() {
        int length = this.A00.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = AnonymousClass6CA.A05(this.A00[length].Bqk(), i * 257);
        }
    }

    public Iterator iterator() {
        return new C172948Np(this.A00);
    }

    public C176958dq(C183618qL[] r1, boolean z) {
        this.A00 = r1;
    }

    public String toString() {
        int A0U = A0U();
        if (A0U == 0) {
            return "[]";
        }
        StringBuffer A0X = AnonymousClass6CA.A0X();
        A0X.append('[');
        int i = 0;
        while (true) {
            A0X.append(this.A00[i]);
            i++;
            if (i >= A0U) {
                A0X.append(']');
                return A0X.toString();
            }
            A0X.append(", ");
        }
    }

    public C176958dq() {
        this.A00 = C161377pW.A03;
    }

    public C176958dq(C183618qL r3) {
        if (r3 != null) {
            this.A00 = new C183618qL[]{r3};
            return;
        }
        throw AnonymousClass001.A0g("'element' cannot be null");
    }

    public C176958dq(C161377pW r2) {
        this.A00 = r2.A04();
    }

    public C176958dq(C183618qL[] r4) {
        if (r4 != null) {
            int length = r4.length;
            int i = 0;
            while (i < length) {
                if (r4[i] != null) {
                    i++;
                }
            }
            this.A00 = C161377pW.A01(r4);
            return;
        }
        throw AnonymousClass001.A0g("'elements' cannot be null, or contain null");
    }
}
