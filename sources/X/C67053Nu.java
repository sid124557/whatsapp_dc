package X;

import android.text.TextUtils;

/* renamed from: X.3Nu  reason: invalid class name and case insensitive filesystem */
public class C67053Nu implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59542x5 A00;

    public void AyD(C55032pg r7, C624134x r8) {
        C624134x.A0W(r8, "FMessageQuickReplyForTemplateProtobuf: message type is not supported ", AnonymousClass001.A0o(), r8 instanceof C31921p4);
        C31921p4 r82 = (C31921p4) r8;
        AnonymousClass1A4 r4 = r7.A00;
        AnonymousClass1DH r0 = ((AnonymousClass1EU) r4.A00).templateButtonReplyMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1DH.DEFAULT_INSTANCE;
        }
        C130546c9 A0H = r0.A0H();
        String A13 = r82.A13();
        AnonymousClass1DH r1 = (AnonymousClass1DH) C18320x8.A0C(A0H);
        A13.getClass();
        r1.bitField0_ |= 2;
        r1.selectedDisplayText_ = A13;
        if (!TextUtils.isEmpty(r82.A02)) {
            String str = r82.A02;
            AnonymousClass1DH r12 = (AnonymousClass1DH) C18320x8.A0C(A0H);
            str.getClass();
            r12.bitField0_ |= 1;
            r12.selectedId_ = str;
        }
        int i = r82.A00;
        AnonymousClass1DH r13 = (AnonymousClass1DH) C18320x8.A0C(A0H);
        r13.bitField0_ |= 8;
        r13.selectedIndex_ = i;
        Integer num = r82.A01;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass1DH r14 = (AnonymousClass1DH) C18320x8.A0C(A0H);
            r14.bitField0_ |= 16;
            r14.selectedCarouselCardIndex_ = intValue;
        }
        AnonymousClass1EF A02 = this.A00.A02(r7.A01, r82, r7.A09, r7.A03);
        AnonymousClass1DH r15 = (AnonymousClass1DH) C18320x8.A0C(A0H);
        A02.getClass();
        r15.contextInfo_ = A02;
        r15.bitField0_ |= 4;
        AnonymousClass1EU A0T = C18290x4.A0T(r4);
        AnonymousClass1DH r02 = (AnonymousClass1DH) A0H.A06();
        r02.getClass();
        A0T.templateButtonReplyMessage_ = r02;
        A0T.bitField0_ |= 8388608;
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r2 = r6.A0B;
        if ((r2.bitField0_ & 8388608) == 0) {
            return null;
        }
        AnonymousClass1DH r4 = r2.templateButtonReplyMessage_;
        if (r4 == null) {
            r4 = AnonymousClass1DH.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        C31921p4 r1 = new C31921p4(r6.A0D, r6.A05);
        r1.A1Z(r4.selectedDisplayText_);
        r1.A02 = r4.selectedId_;
        r1.A00 = r4.selectedIndex_;
        if ((r4.bitField0_ & 16) != 0) {
            r1.A01 = Integer.valueOf(r4.selectedCarouselCardIndex_);
        }
        return r1;
    }

    public C67053Nu(C59542x5 r1) {
        this.A00 = r1;
    }
}
