package X;

import android.text.TextUtils;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public class C67013Nq implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59542x5 A00;

    public void AyD(C55032pg r7, C624134x r8) {
        C18270x1.A16(r8, "Unexpected message type ", AnonymousClass001.A0o(), r8 instanceof C31911p3);
        C31911p3 r82 = (C31911p3) r8;
        AnonymousClass1A4 r4 = r7.A00;
        AnonymousClass1D0 r0 = ((AnonymousClass1EU) r4.A00).buttonsResponseMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1D0.DEFAULT_INSTANCE;
        }
        C130546c9 A0H = r0.A0H();
        String A13 = r82.A13();
        AnonymousClass1D0 r1 = (AnonymousClass1D0) C18320x8.A0C(A0H);
        A13.getClass();
        r1.responseCase_ = 2;
        r1.response_ = A13;
        AnonymousClass22U r02 = AnonymousClass22U.DISPLAY_TEXT;
        AnonymousClass1D0 r12 = (AnonymousClass1D0) C18320x8.A0C(A0H);
        r12.type_ = r02.value;
        r12.bitField0_ |= 8;
        if (!TextUtils.isEmpty(r82.A00)) {
            String str = r82.A00;
            AnonymousClass1D0 r13 = (AnonymousClass1D0) C18320x8.A0C(A0H);
            str.getClass();
            r13.bitField0_ |= 1;
            r13.selectedButtonId_ = str;
        }
        AnonymousClass1EF A02 = this.A00.A02(r7.A01, r82, r7.A09, r7.A03);
        AnonymousClass1D0 r14 = (AnonymousClass1D0) C18320x8.A0C(A0H);
        A02.getClass();
        r14.contextInfo_ = A02;
        r14.bitField0_ |= 4;
        AnonymousClass1EU A0T = C18290x4.A0T(r4);
        AnonymousClass1D0 r03 = (AnonymousClass1D0) A0H.A06();
        r03.getClass();
        A0T.buttonsResponseMessage_ = r03;
        A0T.bitField1_ |= 2;
    }

    public C624134x BgW(C55962rC r10) {
        AnonymousClass22U r1;
        String str;
        AnonymousClass1EU r12 = r10.A0B;
        if ((r12.bitField1_ & 2) == 0) {
            return null;
        }
        AnonymousClass1D0 r0 = r12.buttonsResponseMessage_;
        AnonymousClass1D0 r3 = r0;
        if (r0 == null) {
            r0 = AnonymousClass1D0.DEFAULT_INSTANCE;
        }
        int i = r0.type_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass22U.UNKNOWN;
        } else {
            r1 = AnonymousClass22U.DISPLAY_TEXT;
        }
        if (r1 == AnonymousClass22U.UNKNOWN) {
            return r10.A03(0);
        }
        AnonymousClass2z0 r4 = r10.A0D;
        long j = r10.A05;
        AnonymousClass1D0 r2 = r3;
        if (r3 == null) {
            r2 = AnonymousClass1D0.DEFAULT_INSTANCE;
        }
        if (r2.responseCase_ == 2) {
            str = (String) r2.response_;
        } else {
            str = "";
        }
        if (r3 == null) {
            r3 = AnonymousClass1D0.DEFAULT_INSTANCE;
        }
        return new C31911p3(r4, str, r3.selectedButtonId_, j);
    }

    public C67013Nq(C59542x5 r1) {
        this.A00 = r1;
    }
}
