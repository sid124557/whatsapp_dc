package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.HashMap;

/* renamed from: X.9G4  reason: invalid class name */
public class AnonymousClass9G4 extends AnonymousClass9U0 {
    public HashMap A02(Context context) {
        C162457s7.A0J(context, 0);
        HashMap A02 = super.A02(context);
        boolean A05 = A05();
        int i = R.string.f11nameremoved;
        if (A05) {
            i = R.string.f11nameremoved;
        }
        A02.put(0, context.getString(i));
        return A02;
    }

    public HashMap A03(Context context, C624034w r12, AnonymousClass39S r13) {
        Context context2 = context;
        C162457s7.A0J(context, 0);
        C624034w r5 = r12;
        HashMap A03 = super.A03(context, r12, r13);
        if (this.A09.A0C.A0M(r13.A0K)) {
            A03.put(C18290x4.A0c(), A00(context2, r5, (AnonymousClass399) null, (AnonymousClass394) null, context.getString(R.string.f11nameremoved), 5));
        }
        return A03;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9G4(Resources resources, C56422rx r2, C56612sH r3, C620733j r4, C66473Lo r5, AnonymousClass1VX r6, C1907099n r7, AnonymousClass9U4 r8, C195219Wq r9, C106715a2 r10) {
        super(resources, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C18260x0.A0f(r3, r6, r10, resources, r9);
        C18260x0.A0g(r4, r8, r2, r7, r5);
    }
}
