package X;

/* renamed from: X.7k1  reason: invalid class name and case insensitive filesystem */
public abstract class C158467k1 {
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public static byte[] A00(char[] cArr) {
        int length;
        int i = 0;
        if (cArr == null || (length = cArr.length) <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((length + 1) * 2)];
        do {
            int i2 = i * 2;
            char c = cArr[i];
            AnonymousClass6CA.A0f(bArr, c, i2);
            i = AnonymousClass6CA.A0D(bArr, c, i2 + 1, i);
        } while (i != length);
        return bArr;
    }

    public C834748n A01(int i) {
        if ((this instanceof C177238eI) || (this instanceof C177218eG) || !(this instanceof C177228eH)) {
            return A02(i);
        }
        int i2 = i / 8;
        return new AnonymousClass8QN(((C177228eH) this).A04(3, i2), 0, i2);
    }

    public C834748n A02(int i) {
        int i2;
        byte[] A04;
        if (this instanceof C177238eI) {
            i2 = i / 8;
            A04 = ((C177238eI) this).A04(i2);
        } else if (this instanceof C177218eG) {
            C177218eG r1 = (C177218eG) this;
            i2 = i / 8;
            if (i2 <= r1.A00.B74()) {
                A04 = r1.A04();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Can't generate a derived key ");
                A0o.append(i2);
                throw AnonymousClass000.A0F(" bytes long.", A0o);
            }
        } else if (this instanceof C177228eH) {
            i2 = i / 8;
            A04 = ((C177228eH) this).A04(1, i2);
        } else {
            i2 = i / 8;
            A04 = ((C177208eF) this).A04(i2);
        }
        return new AnonymousClass8QN(A04, 0, i2);
    }

    public C834748n A03(int i, int i2) {
        int i3;
        int i4;
        byte[] A04;
        if (this instanceof C177238eI) {
            i3 = i / 8;
            i4 = i2 / 8;
            A04 = ((C177238eI) this).A04(i3 + i4);
        } else if (this instanceof C177218eG) {
            C177218eG r1 = (C177218eG) this;
            i3 = i / 8;
            i4 = i2 / 8;
            int i5 = i3 + i4;
            if (i5 <= r1.A00.B74()) {
                A04 = r1.A04();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Can't generate a derived key ");
                A0o.append(i5);
                throw AnonymousClass000.A0F(" bytes long.", A0o);
            }
        } else if (this instanceof C177228eH) {
            C177228eH r12 = (C177228eH) this;
            int i6 = i / 8;
            int i7 = i2 / 8;
            byte[] A042 = r12.A04(1, i6);
            return new AnonymousClass8QP(new AnonymousClass8QN(A042, 0, i6), r12.A04(2, i7), 0, i7);
        } else {
            i3 = i / 8;
            i4 = i2 / 8;
            A04 = ((C177208eF) this).A04(i3 + i4);
        }
        return new AnonymousClass8QP(new AnonymousClass8QN(A04, 0, i3), A04, i3, i4);
    }
}
