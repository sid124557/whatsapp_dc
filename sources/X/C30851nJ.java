package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1nJ  reason: invalid class name and case insensitive filesystem */
public class C30851nJ extends C30301mE {
    public AnonymousClass1A8 A00;
    public boolean A01 = false;

    public C30851nJ(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 38, j);
    }

    public HashMap A1v() {
        C626936e.A06(this.A00);
        HashMap A0t = AnonymousClass001.A0t();
        for (AnonymousClass1BA A002 : this.A00.keys_) {
            Pair A003 = C60542yj.A00(A002);
            A0t.put(A003.first, A003.second);
        }
        return A0t;
    }

    public void A1w(HashMap hashMap) {
        C52402lQ r5;
        C130546c9 A0G = AnonymousClass1A8.DEFAULT_INSTANCE.A0G();
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            AnonymousClass33J r1 = (AnonymousClass33J) A0w.getKey();
            C60542yj r0 = (C60542yj) A0w.getValue();
            if (r0 != null) {
                r5 = r0.A00;
            } else {
                r5 = null;
            }
            C130546c9 A0G2 = AnonymousClass1BA.DEFAULT_INSTANCE.A0G();
            AnonymousClass1AH A012 = r1.A01();
            AnonymousClass1BA r12 = (AnonymousClass1BA) C18320x8.A0C(A0G2);
            A012.getClass();
            r12.keyId_ = A012;
            r12.bitField0_ |= 1;
            if (r5 != null) {
                C130546c9 A0G3 = C21471By.DEFAULT_INSTANCE.A0G();
                C172548Lq A09 = C18270x1.A09(A0G3, r5.A02);
                C21471By r13 = (C21471By) A0G3.A00;
                r13.bitField0_ |= 1;
                r13.keyData_ = A09;
                long j = r5.A00;
                C21471By r14 = (C21471By) C18320x8.A0C(A0G3);
                r14.bitField0_ |= 4;
                r14.timestamp_ = j;
                C21511Cc A013 = r5.A01.A01();
                C21471By r15 = (C21471By) C18320x8.A0C(A0G3);
                A013.getClass();
                r15.fingerprint_ = A013;
                r15.bitField0_ |= 2;
                C21471By r02 = (C21471By) A0G3.A06();
                AnonymousClass1BA r16 = (AnonymousClass1BA) C18320x8.A0C(A0G2);
                r02.getClass();
                r16.keyData_ = r02;
                r16.bitField0_ |= 2;
            }
            C130786cX A06 = A0G2.A06();
            AnonymousClass1A8 r2 = (AnonymousClass1A8) C18320x8.A0C(A0G);
            A06.getClass();
            C188248ya r17 = r2.keys_;
            if (!((AnonymousClass8T6) r17).A00) {
                r17 = C130786cX.A07(r17);
                r2.keys_ = r17;
            }
            r17.add(A06);
        }
        this.A00 = (AnonymousClass1A8) A0G.A06();
    }
}
