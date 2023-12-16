package X;

import android.app.Activity;

/* renamed from: X.1eC  reason: invalid class name and case insensitive filesystem */
public final class C27611eC extends AnonymousClass3P2 {
    public final /* synthetic */ C113245l7 A00;
    public final /* synthetic */ C93884pV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27611eC(C113245l7 r8, C93884pV r9, C56612sH r10, C28891hw r11, C66543Lv r12, C66493Lq r13, AnonymousClass2U1 r14, C56832sd r15) {
        super(r10, r11, r12, r13, r14, r15);
        this.A00 = r8;
        this.A01 = r9;
    }

    public void BdP(AnonymousClass2RJ r9, C27991fJ r10) {
        C27991fJ r5 = r10;
        C18260x0.A0O(r10, r9);
        Activity activity = (Activity) AnonymousClass0x9.A14(this.A00.A2z.getActivity()).get();
        if (activity != null && !activity.isFinishing()) {
            super.BdP(r9, r10);
            String A002 = AnonymousClass27F.A00(activity, r9);
            C93884pV r4 = this.A01;
            r4.A01.A0S(new C71613cO(this, activity, r4, r5, A002, 4));
        }
    }

    public void Be8() {
        super.Be8();
        Activity activity = (Activity) AnonymousClass0x9.A14(this.A00.A2z.getActivity()).get();
        if (activity != null && !activity.isFinishing()) {
            this.A01.A01.A0S(new C117155rT(this, 7, activity));
        }
    }
}
