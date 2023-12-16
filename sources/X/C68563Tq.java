package X;

import android.text.TextUtils;

/* renamed from: X.3Tq  reason: invalid class name and case insensitive filesystem */
public class C68563Tq implements AnonymousClass4DW {
    public final C59542x5 A00;

    public void AyC(C55032pg r7, C31901p2 r8) {
        AnonymousClass39N r2 = r8.A00;
        if (r2 != null && r2.A05 == 1) {
            AnonymousClass1A4 r3 = r7.A00;
            AnonymousClass1DC r0 = ((AnonymousClass1EU) r3.A00).listResponseMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1DC.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            String str = r2.A04;
            AnonymousClass1DC r1 = (AnonymousClass1DC) C18320x8.A0C(A0H);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.title_ = str;
            String str2 = r2.A02;
            if (!TextUtils.isEmpty(str2)) {
                AnonymousClass1DC r12 = (AnonymousClass1DC) C18320x8.A0C(A0H);
                str2.getClass();
                r12.bitField0_ |= 16;
                r12.description_ = str2;
            }
            AnonymousClass22X r02 = AnonymousClass22X.SINGLE_SELECT;
            AnonymousClass1DC r13 = (AnonymousClass1DC) C18320x8.A0C(A0H);
            r13.listType_ = r02.value;
            r13.bitField0_ |= 2;
            AnonymousClass1AQ r03 = r13.singleSelectReply_;
            if (r03 == null) {
                r03 = AnonymousClass1AQ.DEFAULT_INSTANCE;
            }
            C130546c9 A0H2 = r03.A0H();
            String str3 = r2.A03;
            if (str3 != null) {
                AnonymousClass1AQ r14 = (AnonymousClass1AQ) C18320x8.A0C(A0H2);
                r14.bitField0_ |= 1;
                r14.selectedRowId_ = str3;
            }
            AnonymousClass1AQ r04 = (AnonymousClass1AQ) A0H2.A06();
            AnonymousClass1DC r15 = (AnonymousClass1DC) C18320x8.A0C(A0H);
            r04.getClass();
            r15.singleSelectReply_ = r04;
            r15.bitField0_ |= 4;
            AnonymousClass3Z2 r22 = r7.A01;
            byte[] bArr = r7.A09;
            if (C59542x5.A01(r22, r8, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A00, r7, r22, r8, bArr);
                AnonymousClass1DC r16 = (AnonymousClass1DC) C18320x8.A0C(A0H);
                A002.getClass();
                r16.contextInfo_ = A002;
                r16.bitField0_ |= 8;
            }
            AnonymousClass1DC r05 = (AnonymousClass1DC) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r05);
            A0L.listResponseMessage_ = r05;
            A0L.bitField0_ |= 1073741824;
        }
    }

    public C68563Tq(C59542x5 r1) {
        this.A00 = r1;
    }

    public int B9E() {
        return 26;
    }
}
