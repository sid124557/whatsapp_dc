package X;

import android.text.TextUtils;

/* renamed from: X.3Nm  reason: invalid class name and case insensitive filesystem */
public class C66973Nm implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59542x5 A00;

    public void AyD(C55032pg r7, C624134x r8) {
        if (r8 instanceof C30421mQ) {
            C30421mQ r82 = (C30421mQ) r8;
            String str = r82.A00;
            String A1v = r82.A1v();
            AnonymousClass1A4 r3 = r7.A00;
            C21481Bz r0 = ((AnonymousClass1EU) r3.A00).contactMessage_;
            if (r0 == null) {
                r0 = C21481Bz.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            if (!TextUtils.isEmpty(str)) {
                C21481Bz r1 = (C21481Bz) C18320x8.A0C(A0H);
                str.getClass();
                r1.bitField0_ |= 1;
                r1.displayName_ = str;
            }
            if (!TextUtils.isEmpty(A1v)) {
                C21481Bz r12 = (C21481Bz) C18320x8.A0C(A0H);
                A1v.getClass();
                r12.bitField0_ |= 2;
                r12.vcard_ = A1v;
            }
            AnonymousClass3Z2 r2 = r7.A01;
            byte[] bArr = r7.A09;
            if (C59542x5.A01(r2, r82, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A00, r7, r2, r82, bArr);
                C21481Bz r13 = (C21481Bz) C18320x8.A0C(A0H);
                A002.getClass();
                r13.contextInfo_ = A002;
                r13.bitField0_ |= 4;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r3);
            C21481Bz r02 = (C21481Bz) A0H.A06();
            r02.getClass();
            A0T.contactMessage_ = r02;
            A0T.bitField0_ |= 8;
            return;
        }
        throw AnonymousClass001.A0c("FMessageContactSerializer/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 8) == 0) {
            return null;
        }
        AnonymousClass2z0 r0 = r6.A0D;
        long j = r6.A05;
        C21481Bz r2 = r1.contactMessage_;
        if (r2 == null) {
            r2 = C21481Bz.DEFAULT_INSTANCE;
        }
        C626936e.A06(r2);
        C30421mQ r12 = new C30421mQ(r0, j);
        if ((r2.bitField0_ & 2) != 0) {
            r12.A1w(r2.vcard_);
        }
        if ((r2.bitField0_ & 1) != 0) {
            r12.A00 = r2.displayName_;
        }
        return r12;
    }

    public C66973Nm(C59542x5 r1) {
        this.A00 = r1;
    }
}
