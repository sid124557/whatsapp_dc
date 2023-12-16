package X;

import android.text.TextUtils;

/* renamed from: X.3OD  reason: invalid class name */
public class AnonymousClass3OD implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass3NX A00;
    public final C59542x5 A01;
    public final C48752fP A02;

    public final AnonymousClass19Z A00(C55032pg r8, AnonymousClass1nF r9) {
        C48752fP r1 = this.A02;
        C55032pg r3 = r8;
        AnonymousClass1EB r0 = ((AnonymousClass1EU) r8.A00.A00).documentMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1EB.DEFAULT_INSTANCE;
        }
        AnonymousClass19Z r4 = (AnonymousClass19Z) r0.A0H();
        r1.A00(r9.A01, r3, r4, r9.A0y(), r9);
        return r4;
    }

    public void AyD(C55032pg r6, C624134x r7) {
        C624134x.A0W(r7, "FMessageDocumentProtobuf: message type is not supported ", AnonymousClass001.A0o(), r7 instanceof AnonymousClass1nF);
        AnonymousClass1nF r72 = (AnonymousClass1nF) r7;
        if (C624134x.A0d(r72)) {
            AnonymousClass3NX.A00(new C85674He(this, 0), r6, r72);
            return;
        }
        AnonymousClass33C r1 = r72.A01;
        if (r1 == null || (!r6.A02() && r1.A0W == null)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C624134x.A0S(r72, "FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=", A0o);
            C624134x.A0U(r72, "; media_wa_type=", A0o);
            return;
        }
        AnonymousClass19Z A002 = A00(r6, r72);
        if (AnonymousClass353.A04(r72)) {
            AnonymousClass1A4 r3 = r6.A00;
            C21801Df r0 = ((AnonymousClass1EU) r3.A00).buttonsMessage_;
            if (r0 == null) {
                r0 = C21801Df.DEFAULT_INSTANCE;
            }
            C208319m r2 = (C208319m) r0.A0H();
            C40802Hu.A00(A002, r2, r72).headerCase_ = 2;
            r2.A09(AnonymousClass23H.DOCUMENT);
            r3.A09((C21801Df) r2.A06());
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(r72.A01);
        AnonymousClass1A4 r4 = r6.A00;
        if (!isEmpty) {
            AnonymousClass1AL r02 = ((AnonymousClass1EU) r4.A00).documentWithCaptionMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r32 = (C209119u) r02.A0H();
            C130546c9 A0H = r32.A09().A0H();
            AnonymousClass1EB r03 = (AnonymousClass1EB) A002.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(A0H, r03);
            A0L.documentMessage_ = r03;
            A0L.bitField0_ |= 64;
            AnonymousClass1AL A003 = C209119u.A00(A0H, r32);
            AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(r4, A003);
            A0L2.documentWithCaptionMessage_ = A003;
            A0L2.bitField1_ |= 512;
            return;
        }
        r4.A0A(A002);
    }

    public C624134x BgW(C55962rC r9) {
        AnonymousClass1EU r1 = r9.A0B;
        if ((r1.bitField0_ & 64) != 0) {
            if ("medianotify".equals(r9.A0J)) {
                return null;
            }
        } else if ((r1.bitField1_ & 512) == 0) {
            return null;
        } else {
            AnonymousClass1AL r0 = r1.documentWithCaptionMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            AnonymousClass1EU r02 = r0.message_;
            if (r02 == null) {
                r02 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
            r9 = r9.A02(r02);
        }
        AnonymousClass1EB r3 = r9.A0B.documentMessage_;
        if (r3 == null) {
            r3 = AnonymousClass1EB.DEFAULT_INSTANCE;
        }
        AnonymousClass1nF r4 = new AnonymousClass1nF(r9.A0D, r9.A05);
        this.A02.A01(r3, r4, r9.A01, r9.A04(), r9.A0O);
        return r4;
    }

    public AnonymousClass3OD(AnonymousClass3NX r1, C59542x5 r2, C48752fP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
