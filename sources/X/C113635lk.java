package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.5lk  reason: invalid class name and case insensitive filesystem */
public class C113635lk implements AnonymousClass4E8 {
    public final C106125Xs A00;
    public final AnonymousClass5L9 A01;

    public String BDW() {
        return "MediaMergerDailyCron";
    }

    public /* synthetic */ void BQW() {
    }

    public void BQX() {
        C106125Xs r1 = this.A00;
        if (!r1.A0C.A02() || r1.A03.A04() == null || r1.A01() == 5) {
            AnonymousClass5L9 r3 = this.A01;
            C72303dV r0 = r3.A05;
            r0.A05();
            if (r0.A09 && r3.A06.A0X(1456)) {
                Byte[] bArr = new Byte[5];
                bArr[0] = (byte) 1;
                C18310x6.A1T(bArr, (byte) 3, 1);
                bArr[2] = (byte) 2;
                C18310x6.A1T(bArr, (byte) 20, 3);
                bArr[4] = (byte) 13;
                Random random = r3.A0A;
                byte byteValue = bArr[random.nextInt(5)].byteValue();
                Integer[] numArr = new Integer[3];
                AnonymousClass000.A1P(numArr, 2, 0);
                C86624Kv.A1V(numArr, 1);
                AnonymousClass000.A1P(numArr, 3, 2);
                int intValue = numArr[random.nextInt(3)].intValue();
                File A0K = r3.A01.A0K(byteValue, 0, intValue);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("mediafilemergemanager/dir=");
                A0o.append(A0K);
                A0o.append("; type=");
                A0o.append(byteValue);
                C18260x0.A0w("; dirType=", A0o, intValue);
                AnonymousClass4FS r8 = r3.A09;
                C55682qk r2 = r3.A00;
                AnonymousClass4FV r6 = r3.A07;
                C106695a0 r7 = r3.A08;
                C18270x1.A0w(new C138216px(r2, r3.A02, r3.A03, r3.A04, r6, r7, r8, A0K, byteValue), r8);
            }
        }
    }

    public C113635lk(C106125Xs r1, AnonymousClass5L9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
