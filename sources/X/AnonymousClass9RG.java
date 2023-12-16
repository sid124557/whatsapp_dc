package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9RG  reason: invalid class name */
public class AnonymousClass9RG {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C194619Tt A01;
    public final /* synthetic */ C202479m5 A02;

    public AnonymousClass9RG(Activity activity, C194619Tt r2, C202479m5 r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public void A00(AnonymousClass34V r7, boolean z) {
        String A0F;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        A0o.append(z);
        C18260x0.A1Q(A0o, " error: ", r7);
        C194619Tt r2 = this.A01;
        C69263Wi r5 = r2.A02;
        Activity activity = this.A00;
        r5.A0K((AnonymousClass4FU) activity);
        if (!activity.isFinishing()) {
            Context context = r2.A04.A00;
            if (z) {
                A0F = context.getString(R.string.f11nameremoved);
            } else {
                A0F = AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            }
            r5.A0W(A0F, 0);
        }
        this.A02.BaJ(r7);
    }
}
