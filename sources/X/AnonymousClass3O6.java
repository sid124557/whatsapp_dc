package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3O6  reason: invalid class name */
public class AnonymousClass3O6 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final C54472om A01;

    public void AyD(C55032pg r9, C624134x r10) {
        if (r10 instanceof C31991pD) {
            AnonymousClass1nB r102 = (AnonymousClass1nB) r10;
            AnonymousClass1A4 r6 = r9.A00;
            AnonymousClass1AL r0 = ((AnonymousClass1EU) r6.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r7 = (C209119u) r0.A0H();
            C130546c9 A0H = r7.A09().A0H();
            C209519y r4 = (C209519y) AnonymousClass0x7.A0X(A0H).A0H();
            this.A01.A02(r9, r4, r102);
            AnonymousClass1ED A0S = C18290x4.A0S(r4);
            A0S.bitField0_ |= AnonymousClass35S.A0F;
            A0S.viewOnce_ = true;
            AnonymousClass1ED r02 = (AnonymousClass1ED) r4.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(A0H, r02);
            A0L.videoMessage_ = r02;
            A0L.bitField0_ |= 256;
            AnonymousClass1AL A002 = C209119u.A00(A0H, r7);
            AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(r6, A002);
            A0L2.viewOnceMessageV2_ = A002;
            A0L2.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0T(r10, "FMessageViewOnceVideoProtobuf not support message: ", A0o);
        throw C18310x6.A0d(A0o);
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r1 = r6.A0B;
        if ((r1.bitField0_ & 256) == 0) {
            return null;
        }
        AnonymousClass1ED r2 = r1.videoMessage_;
        AnonymousClass1ED r4 = r2;
        if (r2 == null) {
            r2 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        if (r2.gifPlayback_ || (r2.bitField0_ & AnonymousClass35S.A0F) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        C31991pD r12 = new C31991pD(r6.A0D, r6.A05);
        C54472om.A00(r6, r4, r12, this.A01);
        return r12;
    }

    public AnonymousClass3O6(AnonymousClass1VX r1, C54472om r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
