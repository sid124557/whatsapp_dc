package X;

import android.util.Pair;

/* renamed from: X.1t3  reason: invalid class name */
public class AnonymousClass1t3 extends AnonymousClass5ZM {
    public final AnonymousClass2MF A00;
    public final C84644Dd A01;
    public final C56932sn A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Pair[] pairArr = (Pair[]) objArr;
        C626936e.A06(pairArr);
        C626936e.A06(pairArr[0]);
        Pair pair = pairArr[0];
        C56932sn r2 = this.A02;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        return r2.A01(this.A01, (String) pair.first, booleanValue);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C50612iT r3 = (C50612iT) obj;
        if (r3 != null) {
            AnonymousClass2MF r0 = this.A00;
            r3.A06 = r0.A01.containsKey(r3.A0G);
            this.A01.Bcd(r3);
        }
    }

    public AnonymousClass1t3(AnonymousClass2MF r1, C84644Dd r2, C56932sn r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
