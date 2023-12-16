package X;

import java.util.Hashtable;

/* renamed from: X.8QV  reason: invalid class name */
public class AnonymousClass8QV implements C185978uY {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public C185968uX A02;
    public C184668sK A03;
    public C184668sK A04;
    public byte[] A05;
    public byte[] A06;

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public AnonymousClass8QV(C185968uX r4) {
        int intValue;
        if (r4 instanceof C188608zC) {
            intValue = ((C188608zC) r4).B51();
        } else {
            Number number = (Number) A07.get(r4.B4N());
            if (number != null) {
                intValue = number.intValue();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("unknown digest passed: ");
                throw AnonymousClass000.A0F(r4.B4N(), A0o);
            }
        }
        this.A02 = r4;
        int B74 = r4.B74();
        this.A01 = B74;
        this.A00 = intValue;
        this.A05 = new byte[intValue];
        this.A06 = new byte[(intValue + B74)];
    }

    public int B24(byte[] bArr, int i) {
        C185968uX r6 = this.A02;
        byte[] bArr2 = this.A06;
        int i2 = this.A00;
        r6.B24(bArr2, i2);
        C184668sK r1 = this.A04;
        if (r1 != null) {
            ((C184668sK) r6).Bjv(r1);
            r6.update(bArr2, i2, r6.B74());
        } else {
            r6.update(bArr2, 0, bArr2.length);
        }
        int B24 = r6.B24(bArr, i);
        while (i2 < bArr2.length) {
            bArr2[i2] = 0;
            i2++;
        }
        C184668sK r0 = this.A03;
        if (r0 != null) {
            ((C184668sK) r6).Bjv(r0);
            return B24;
        }
        byte[] bArr3 = this.A05;
        r6.update(bArr3, 0, bArr3.length);
        return B24;
    }

    public int B9H() {
        return this.A01;
    }

    public void BFu(C834748n r9) {
        byte[] bArr;
        int length;
        C185968uX r6 = this.A02;
        r6.reset();
        byte[] bArr2 = ((AnonymousClass8QN) r9).A00;
        int length2 = bArr2.length;
        int i = this.A00;
        if (length2 > i) {
            r6.update(bArr2, 0, length2);
            bArr = this.A05;
            r6.B24(bArr, 0);
            length2 = this.A01;
        } else {
            bArr = this.A05;
            System.arraycopy(bArr2, 0, bArr, 0, length2);
        }
        while (true) {
            length = bArr.length;
            if (length2 >= length) {
                break;
            }
            bArr[length2] = 0;
            length2++;
        }
        byte[] bArr3 = this.A06;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = 0; i2 < i; i2 = AnonymousClass6CA.A0A(bArr, bArr[i2] ^ 54, i2)) {
        }
        for (int i3 = 0; i3 < i; i3 = AnonymousClass6CA.A0A(bArr3, bArr3[i3] ^ 92, i3)) {
        }
        boolean z = r6 instanceof C184668sK;
        if (z) {
            C184668sK Azm = ((C184668sK) r6).Azm();
            this.A04 = Azm;
            ((C185968uX) Azm).update(bArr3, 0, i);
        }
        r6.update(bArr, 0, length);
        if (z) {
            this.A03 = ((C184668sK) r6).Azm();
        }
    }

    public void BrT(byte b) {
        this.A02.BrT(b);
    }

    public void reset() {
        C185968uX r3 = this.A02;
        r3.reset();
        byte[] bArr = this.A05;
        r3.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A02.update(bArr, i, i2);
    }
}
