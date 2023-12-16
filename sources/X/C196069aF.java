package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.9aF  reason: invalid class name and case insensitive filesystem */
public class C196069aF implements C181738nF {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass5Y9 A01;
    public final /* synthetic */ C196249aX A02;

    public C196069aF(Activity activity, AnonymousClass5Y9 r2, C196249aX r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
    }

    public void BYv(C149847Od r5, boolean z) {
        AnonymousClass4FU r3 = (AnonymousClass4FU) this.A00;
        r3.BjL();
        r3.Box(new Object[0], R.string.f11nameremoved, R.string.f11nameremoved);
        this.A01.A0Q.remove(this);
    }
}
