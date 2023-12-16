package X;

import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.4at  reason: invalid class name and case insensitive filesystem */
public final class C88844at extends C116835qw {
    public AnonymousClass4C1 A00;
    public AnonymousClass4C1 A01;
    public AnonymousClass4C1 A02;
    public AnonymousClass4C1 A03;
    public final C88844at A04 = this;
    public final C64333Db A05;

    public static void A02(C88854au r1, C64333Db r2, C107695bk r3, MediaComposerFragment mediaComposerFragment) {
        mediaComposerFragment.A0D = (AnonymousClass5GV) r1.A19.A00.get();
        mediaComposerFragment.A06 = (C54292oU) r2.AaB.get();
        mediaComposerFragment.A0S = C72343dZ.A00(r3.A5r);
        mediaComposerFragment.A0R = C72343dZ.A00(r1.A00);
        mediaComposerFragment.A0Q = C72343dZ.A00(r1.A01);
    }

    public final void A03() {
        this.A03 = C72343dZ.A01(new C118035st(this.A04, this.A05, 0));
        this.A02 = C72343dZ.A01(new C118035st(this.A04, this.A05, 1));
        this.A00 = C72343dZ.A01(new C118035st(this.A04, this.A05, 2));
        this.A01 = C72343dZ.A01(new C118035st(this.A04, this.A05, 3));
    }

    public C88844at(C64333Db r1) {
        this.A05 = r1;
        A03();
    }
}
