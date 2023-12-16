package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.1QM  reason: invalid class name */
public class AnonymousClass1QM extends AnonymousClass1QA {
    public final AnonymousClass2KG A00;
    public final AnonymousClass1VX A01;
    public final C28071fd A02;

    public final void A0D(Activity activity, AnonymousClass398 r21, String str, String str2, long j) {
        Activity activity2 = activity;
        String str3 = str;
        long j2 = j;
        super.A0D(activity2, r21, str3, str2, j2);
        AnonymousClass2KG r0 = this.A00;
        C70463aX r12 = new C70463aX(this, activity2, str3, 2, j2);
        C162457s7.A0J(activity2, 0);
        AnonymousClass5ZR r4 = r0.A00;
        AnonymousClass33p r02 = r0.A01;
        String[] strArr = C622534h.A09;
        if ((!RequestPermissionActivity.A0t(r02, strArr) && !RequestPermissionActivity.A0p(activity2, strArr)) || RequestPermissionActivity.A0n(activity2, r4, R.string.f11nameremoved, 0, 904)) {
            r12.run();
        }
    }

    public AnonymousClass1QM(C194449Sx r1, AnonymousClass2KG r2, AnonymousClass1VX r3, C28071fd r4) {
        super(r1);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
