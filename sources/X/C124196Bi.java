package X;

import com.whatsapp.R;

/* renamed from: X.6Bi  reason: invalid class name and case insensitive filesystem */
public class C124196Bi implements AnonymousClass4DF {
    public Object A00;
    public final int A01;

    public C124196Bi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BX8(C95804uY r6) {
        C69263Wi r3;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                C162457s7.A0J(r6, 0);
                C102685Jw r1 = (C102685Jw) this.A00;
                r3 = r1.A00;
                runnable = new C70113Zy(r1, 46, r6);
                break;
            case 1:
                C18260x0.A1R(C18270x1.A0X(r6), "NewsletterCreationActivity Channel created: ", r6);
                C96924xG r4 = (C96924xG) this.A00;
                r4.A77().A05(13, true);
                r3 = r4.A05;
                runnable = new C70123Zz(r4, 4, r6);
                break;
            default:
                C96924xG r32 = (C96924xG) this.A00;
                r32.A77().A05(13, false);
                r32.BjL();
                C18290x4.A18(r32);
                return;
        }
        r3.A0S(runnable);
    }

    public /* synthetic */ void onError(Throwable th) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                C162457s7.A0J(th, 0);
                C96924xG r3 = (C96924xG) this.A00;
                r3.A77().A05(14, true);
                C86624Kv.A1D(r3.A05, r3, 44);
                return;
            default:
                C162457s7.A0J(th, 0);
                C96924xG r2 = (C96924xG) this.A00;
                r2.A77().A05(14, false);
                r2.BjL();
                r2.Bot(R.string.f11nameremoved);
                return;
        }
    }
}
