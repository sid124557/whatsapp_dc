package X;

/* renamed from: X.3Nt  reason: invalid class name and case insensitive filesystem */
public class C67043Nt implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C59122wO A00;

    public void AyD(C55032pg r12, C624134x r13) {
        C624134x r8 = r13;
        if (this instanceof C28081ff) {
            C28081ff r5 = (C28081ff) this;
            C18270x1.A16(r13, "Message type is not supported ", AnonymousClass001.A0o(), r13 instanceof C30991nZ);
            C30991nZ r82 = (C30991nZ) r8;
            AnonymousClass39W r1 = r82.A00;
            if (r1 != null) {
                r5.A01.A00(r1).A0C(r12, r82);
                AnonymousClass1A4 r4 = r12.A00;
                C209219v r3 = (C209219v) AnonymousClass1A4.A01(r4);
                AnonymousClass1DR r0 = ((AnonymousClass1ER) r3.A00).header_;
                if (r0 == null) {
                    r0 = AnonymousClass1DR.DEFAULT_INSTANCE;
                }
                C209319w r2 = (C209319w) r0.A0H();
                C21991Dy r02 = ((AnonymousClass1EU) r4.A00).locationMessage_;
                if (r02 == null) {
                    r02 = C21991Dy.DEFAULT_INSTANCE;
                }
                AnonymousClass173 r6 = (AnonymousClass173) r02.A0H();
                r5.A00.A01(r6, r12.A01, r82, r12.A09, r12.A03);
                r2.A09();
                AnonymousClass1DR r14 = (AnonymousClass1DR) C18320x8.A0C(r2);
                C130786cX A06 = r6.A06();
                A06.getClass();
                r14.media_ = A06;
                C209219v.A00(r2, r4, r3, r14, 8);
            }
        } else if (r13 instanceof AnonymousClass1n9) {
            AnonymousClass1n9 r83 = (AnonymousClass1n9) r8;
            AnonymousClass1A4 r32 = r12.A00;
            C21991Dy r03 = ((AnonymousClass1EU) r32.A00).locationMessage_;
            if (r03 == null) {
                r03 = C21991Dy.DEFAULT_INSTANCE;
            }
            AnonymousClass173 r62 = (AnonymousClass173) r03.A0H();
            this.A00.A01(r62, r12.A01, r83, r12.A09, r12.A03);
            if (AnonymousClass353.A04(r83)) {
                C21801Df r04 = ((AnonymousClass1EU) r32.A00).buttonsMessage_;
                if (r04 == null) {
                    r04 = C21801Df.DEFAULT_INSTANCE;
                }
                C208319m r22 = (C208319m) r04.A0H();
                C40802Hu.A00(r62, r22, r83).headerCase_ = 5;
                r22.A09(AnonymousClass23H.LOCATION);
                r32.A09((C21801Df) r22.A06());
                return;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r32);
            C21991Dy r05 = (C21991Dy) r62.A06();
            r05.getClass();
            A0T.locationMessage_ = r05;
            A0T.bitField0_ |= 16;
        } else {
            throw AnonymousClass001.A0c("FMessageStaticLocationSerializer/not supported message");
        }
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 16) == 0) {
            return null;
        }
        C21991Dy r4 = r1.locationMessage_;
        if (r4 == null) {
            r4 = C21991Dy.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        AnonymousClass1n9 r12 = new AnonymousClass1n9(r6.A0D, r6.A05);
        C59122wO.A00(r4, r12, r6.A0O);
        return r12;
    }

    public C67043Nt(C59122wO r1) {
        this.A00 = r1;
    }
}
