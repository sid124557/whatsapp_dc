package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.1Pz  reason: invalid class name and case insensitive filesystem */
public final class C22761Pz extends C113155ky {
    public final C64773Ex A00;
    public final C47922e3 A01;
    public final AnonymousClass5U1 A02;
    public final AnonymousClass3LY A03;
    public final C44652Wy A04;
    public final C48252eb A05;

    public C22761Pz(C64773Ex r2, C47922e3 r3, AnonymousClass5U1 r4, AnonymousClass3LY r5, C44652Wy r6, C48252eb r7) {
        C162457s7.A0J(r2, 1);
        C162457s7.A0J(r4, 6);
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
    }

    public boolean A00(C624134x r5) {
        C162457s7.A0J(r5, 0);
        C95814uZ r1 = r5.A1J.A00;
        if (r1 != null) {
            AnonymousClass3ZH A06 = this.A00.A06(r1);
            if (A06 == null) {
                this.A01.A01(AnonymousClass22M.A0L, (String) null);
            } else if (!this.A05.A00(A06) || !this.A02.A03(r5)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean A01(C89644eZ r4, C624134x r5) {
        C162457s7.A0J(r5, 0);
        C95814uZ r0 = r5.A1J.A00;
        if (r0 == null) {
            return false;
        }
        this.A04.A00(1, r0.getRawString());
        r4.Boo(this.A03.A00(r5));
        return true;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_spam_report);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        return C18290x4.A0l(r3.getContext(), R.string.f11nameremoved);
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 31;
    }
}
