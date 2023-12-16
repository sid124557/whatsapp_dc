package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5Su  reason: invalid class name and case insensitive filesystem */
public class C104905Su {
    public final C45742aV A00;
    public final AnonymousClass5ZU A01;
    public final C61072zf A02;
    public final C47542dQ A03;
    public final AnonymousClass319 A04;
    public final AnonymousClass4FS A05;

    public AnonymousClass043 A00(Activity activity, AnonymousClass4FU r10, AnonymousClass3ZH r11) {
        Activity activity2 = activity;
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0T(R.string.f11nameremoved);
        AnonymousClass4FU r4 = r10;
        AnonymousClass3ZH r6 = r11;
        A002.A0Y(new C1236569g(activity2, r4, this, r6, 1), R.string.f11nameremoved);
        A002.A0X(new C1236569g(activity2, r4, this, r6, 2), R.string.f11nameremoved);
        return A002.create();
    }

    public void A01(Activity activity, AnonymousClass4FU r6, AnonymousClass3ZH r7, C95814uZ r8) {
        if (this.A04.A0D((C837249n) null, r8, 1, 2).size() > 0) {
            C621433s.A01(activity, 10);
        } else {
            A02(activity, r6, r7, false);
        }
    }

    public C104905Su(C45742aV r1, AnonymousClass5ZU r2, C61072zf r3, C47542dQ r4, AnonymousClass319 r5, AnonymousClass4FS r6) {
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void A02(Context context, AnonymousClass4FU r12, AnonymousClass3ZH r13, boolean z) {
        r12.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
        AnonymousClass4FS r0 = this.A05;
        C61072zf r6 = this.A02;
        C47542dQ r7 = this.A03;
        Context context2 = context;
        C18270x1.A0w(new C33641tS(context2, r12, this.A00, this.A01, r6, r7, r13, z), r0);
    }
}
