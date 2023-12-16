package X;

import android.text.TextUtils;

/* renamed from: X.3Tr  reason: invalid class name and case insensitive filesystem */
public abstract class C68573Tr implements AnonymousClass4DW {
    public final C59542x5 A00;
    public final AnonymousClass39N A01;

    public void AyC(C55032pg r7, C31901p2 r8) {
        AnonymousClass22W r0;
        if (r8.A00 != null) {
            AnonymousClass1A4 r3 = r7.A00;
            C21521Cd r02 = ((AnonymousClass1EU) r3.A00).interactiveResponseMessage_;
            if (r02 == null) {
                r02 = C21521Cd.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            String str = r8.A00.A04;
            if (!TextUtils.isEmpty(str)) {
                C130546c9 A0K = C18300x5.A0K(AnonymousClass1BI.DEFAULT_INSTANCE);
                AnonymousClass1BI r1 = (AnonymousClass1BI) A0K.A00;
                str.getClass();
                r1.bitField0_ |= 1;
                r1.text_ = str;
                AnonymousClass39N r03 = r8.A00;
                if (r03 == null || (r0 = r03.A00) == null) {
                    r0 = AnonymousClass22W.DEFAULT;
                }
                AnonymousClass1BI r12 = (AnonymousClass1BI) C18320x8.A0C(A0K);
                r12.format_ = r0.value;
                r12.bitField0_ |= 2;
                C21521Cd r13 = (C21521Cd) C18320x8.A0C(A0H);
                AnonymousClass1BI r04 = (AnonymousClass1BI) A0K.A06();
                r04.getClass();
                r13.body_ = r04;
                r13.bitField0_ |= 1;
            }
            AnonymousClass3Z2 r2 = r7.A01;
            byte[] bArr = r7.A09;
            if (C59542x5.A01(r2, r8, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A00, r7, r2, r8, bArr);
                C21521Cd r14 = (C21521Cd) C18320x8.A0C(A0H);
                A002.getClass();
                r14.contextInfo_ = A002;
                r14.bitField0_ |= 4;
            }
            C21521Cd r05 = (C21521Cd) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r05);
            A0L.interactiveResponseMessage_ = r05;
            A0L.bitField1_ |= 32;
        }
    }

    public C68573Tr(C59542x5 r1, AnonymousClass39N r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int B9E() {
        return 36;
    }
}
