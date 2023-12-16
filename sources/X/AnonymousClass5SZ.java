package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5SZ  reason: invalid class name */
public final class AnonymousClass5SZ {
    public final C56972sr A00;
    public final C614930z A01;
    public final C613630k A02;
    public final AnonymousClass4FS A03;

    public final void A01(Context context, Runnable runnable, String str, String str2) {
        C162457s7.A0J(context, 0);
        C18270x1.A10(str, 1, str2);
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0i(false);
        A002.A0U(R.string.f11nameremoved);
        A002.A0g(AnonymousClass0x2.A0X(context, str2, 1, R.string.f11nameremoved));
        A002.A0Y(new C107985cE(context, this, runnable, str), R.string.f11nameremoved);
        C1235268t.A04(A002, runnable, 77, R.string.f11nameremoved);
        A002.A0S();
    }

    public final boolean A02(AnonymousClass65R r4) {
        C162457s7.A0J(r4, 0);
        if (!this.A01.A06()) {
            return false;
        }
        AnonymousClass0x7.A1B(new AnonymousClass68N(this, 2, r4), this.A03);
        return true;
    }

    public final void A00() {
        if (this.A01.A07()) {
            this.A03.BkM(new C71263bp((Object) this, 12));
        }
    }

    public AnonymousClass5SZ(C56972sr r1, C614930z r2, C613630k r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r1, r4, r2, r3);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
