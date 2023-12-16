package X;

import com.whatsapp.R;

/* renamed from: X.9bT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9bT implements C202489m6 {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ C194599Tr A01;
    public final /* synthetic */ Runnable A02;

    public final void BZj(AnonymousClass34V r13) {
        C194599Tr r4 = this.A01;
        C624034w r0 = this.A00;
        Runnable runnable = this.A02;
        if (r13 == null) {
            AnonymousClass4FS r1 = r4.A0D;
            String str = r0.A0K;
            int i = r0.A03;
            C56612sH r02 = r4.A01;
            AnonymousClass0x7.A1B(new C191849Gr(r4.A0A, runnable, str, i, r02.A0H(), r02.A0H()), r1);
            return;
        }
        int i2 = 0;
        if (r13.A00 == 443) {
            i2 = R.string.f11nameremoved;
        }
        C69263Wi r03 = r4.A00;
        if (i2 == 0) {
            i2 = R.string.f11nameremoved;
        }
        r03.A0H(i2, 0);
        r03.A0D();
    }

    public /* synthetic */ AnonymousClass9bT(C624034w r1, C194599Tr r2, Runnable runnable) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = runnable;
    }
}
