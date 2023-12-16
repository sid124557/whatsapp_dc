package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3O5  reason: invalid class name */
public class AnonymousClass3O5 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final C51992ki A01;

    public void AyD(C55032pg r9, C624134x r10) {
        if (r10 instanceof AnonymousClass1n3) {
            AnonymousClass1nA r102 = (AnonymousClass1nA) r10;
            AnonymousClass1A4 r6 = r9.A00;
            AnonymousClass1AL r0 = ((AnonymousClass1EU) r6.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r7 = (C209119u) r0.A0H();
            C130546c9 A0H = r7.A09().A0H();
            C51992ki r1 = this.A01;
            AnonymousClass1EE r02 = ((AnonymousClass1EU) A0H.A00).imageMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C207219b A02 = r1.A02(r9, (C207219b) r02.A0H(), r102);
            if (A02 != null) {
                AnonymousClass1EE A0V = AnonymousClass0x7.A0V(A02);
                A0V.bitField0_ |= 524288;
                A0V.viewOnce_ = true;
                AnonymousClass1EE r03 = (AnonymousClass1EE) A02.A06();
                AnonymousClass1EU A0L = AnonymousClass0x2.A0L(A0H, r03);
                A0L.imageMessage_ = r03;
                A0L.bitField0_ |= 4;
                AnonymousClass1AL A002 = C209119u.A00(A0H, r7);
                AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(r6, A002);
                A0L2.viewOnceMessageV2_ = A002;
                A0L2.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0T(r10, "FMessageViewOnceImageProtobuf not support: ", A0o);
        throw C18310x6.A0d(A0o);
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        AnonymousClass1EE r2 = r1.imageMessage_;
        AnonymousClass1EE r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 524288) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1EE.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        AnonymousClass1n3 r12 = new AnonymousClass1n3(r6.A0D, r6.A05);
        C51992ki.A00(r6, r4, r12, this.A01);
        return r12;
    }

    public AnonymousClass3O5(AnonymousClass1VX r1, C51992ki r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
