package X;

/* renamed from: X.7TM  reason: invalid class name */
public final class AnonymousClass7TM {
    public int A00 = -1;
    public boolean A01;
    public final C152597Zm A02 = new C152597Zm();
    public final C161467pi A03 = new C161467pi(new byte[65025], 0);

    public boolean A00(C187648xa r10) {
        C152597Zm r6;
        int i;
        int i2;
        C161487pm.A04(AnonymousClass000.A1W(r10));
        if (this.A01) {
            this.A01 = false;
            this.A03.A0Q(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                C152597Zm r62 = this.A02;
                if (!r62.A00(r10, -1) || !r62.A01(r10, true)) {
                    return false;
                }
                int i4 = r62.A01;
                if ((r62.A03 & 1) == 1 && this.A03.A00 == 0) {
                    int i5 = 0;
                    i3 = 0;
                    do {
                        int i6 = i3;
                        if (i3 >= r62.A02) {
                            break;
                        }
                        i3++;
                        i2 = r62.A06[i6];
                        i5 += i2;
                    } while (i2 == 255);
                    i4 += i5;
                } else {
                    i3 = 0;
                }
                r10.BpP(i4);
                this.A00 = i3;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8;
                int i10 = i3 + i8;
                r6 = this.A02;
                if (i10 >= r6.A02) {
                    break;
                }
                i8++;
                i = r6.A06[i9 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                C161467pi r2 = this.A03;
                r2.A0P(r2.A00 + i7);
                r10.readFully(r2.A02, r2.A00, i7);
                r2.A0R(r2.A00 + i7);
                this.A01 = AnonymousClass001.A1X(r6.A06[i11 - 1], 255);
            }
            if (i11 == r6.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }
}
