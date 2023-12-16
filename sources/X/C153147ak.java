package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7ak  reason: invalid class name and case insensitive filesystem */
public abstract class C153147ak {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C184708sO A06;
    public C185228tI A07;
    public C184738sR A08;
    public AnonymousClass7F6 A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass7TH A0C = new AnonymousClass7TH();

    public void A00(boolean z) {
        int i;
        if (z) {
            this.A09 = new AnonymousClass7F6();
            this.A04 = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.A01 = i;
        this.A05 = -1;
        this.A02 = 0;
    }

    public boolean A01(AnonymousClass7F6 r10, C161457ph r11, long j) {
        if (this instanceof C125846Js) {
            C125846Js r6 = (C125846Js) this;
            boolean z = true;
            if (!r6.A00) {
                byte[] copyOf = Arrays.copyOf(r11.A02, r11.A00);
                byte b = copyOf[9] & 255;
                int A0C2 = AnonymousClass6CA.A0C(copyOf, 10, AnonymousClass6C9.A0F(copyOf, 11));
                ArrayList A0I = AnonymousClass002.A0I(3);
                A0I.add(copyOf);
                A0I.add(AnonymousClass6C7.A1a((((long) A0C2) * 1000000000) / 48000));
                A0I.add(AnonymousClass6C7.A1a((((long) 3840) * 1000000000) / 48000));
                C157797it r1 = new C157797it();
                r1.A0P = null;
                r1.A0R = "audio/opus";
                r1.A0N = null;
                r1.A03 = -1;
                r1.A09 = -1;
                r1.A04 = b;
                r1.A0E = 48000;
                r1.A0S = A0I;
                r1.A0K = null;
                r1.A0F = 0;
                r1.A0Q = null;
                r10.A00 = new C166637z1(r1);
                r6.A00 = true;
                return true;
            }
            if (r11.A03() != 1332770163) {
                z = false;
            }
            r11.A0H(0);
            return z;
        }
        C125826Jq r3 = (C125826Jq) this;
        byte[] bArr = r11.A02;
        if (r3.A00 == null) {
            AnonymousClass7NQ r0 = new AnonymousClass7NQ(bArr);
            r3.A00 = r0;
            int i = r0.A02;
            if (i == 0) {
                i = -1;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, r11.A00);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            AnonymousClass7NQ r02 = r3.A00;
            int i2 = r02.A00;
            int i3 = r02.A03;
            int i4 = r02.A01;
            C157797it r12 = new C157797it();
            r12.A0P = null;
            r12.A0R = "audio/flac";
            r12.A0N = null;
            r12.A03 = i2 * i3 * i4;
            r12.A09 = i;
            r12.A04 = i4;
            r12.A0E = i3;
            r12.A0S = singletonList;
            r12.A0K = null;
            r12.A0F = 0;
            r12.A0Q = null;
            r10.A00 = new C166637z1(r12);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) == 3) {
            AnonymousClass817 r5 = new AnonymousClass817(r3);
            r3.A01 = r5;
            r11.A0I(1);
            byte[] bArr2 = r11.A02;
            int i5 = r11.A01;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int A0G = AnonymousClass6C8.A0G(bArr2, i6, (bArr2[i5] & 255) << 16);
            r11.A01 = i7 + 1;
            int A0B2 = AnonymousClass6CA.A0B(bArr2, i7, A0G) / 18;
            r5.A02 = new long[A0B2];
            r5.A03 = new long[A0B2];
            for (int i8 = 0; i8 < A0B2; i8++) {
                r5.A02[i8] = r11.A08();
                r5.A03[i8] = r11.A08();
                r11.A0I(2);
            }
            return true;
        } else if (b2 != -1) {
            return true;
        } else {
            AnonymousClass817 r03 = r3.A01;
            if (r03 == null) {
                return false;
            }
            r03.A00 = j;
            r10.A01 = r03;
            return false;
        }
    }
}
