package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public final class C29571ju extends AnonymousClass9U0 {
    public final Resources A00;
    public final C1907099n A01;
    public final C106715a2 A02;

    public List A04(Context context, AnonymousClass9XZ r14, AnonymousClass39S r15, HashMap hashMap, boolean z, boolean z2) {
        String str;
        C162457s7.A0J(context, 0);
        C194069Rl r1 = (C194069Rl) hashMap.get(C18280x3.A0S());
        ArrayList A0s = AnonymousClass001.A0s();
        if (r1 != null) {
            String string = context.getString(R.string.f11nameremoved);
            AnonymousClass399 r0 = r1.A02;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            C626936e.A06(str);
            A0s.add(new C195339Xj(new C51872kW((SpannableString) null, false), new C51882kX((SpannableString) null, false), new C51892kY((SpannableString) null, false), "CustomPaymentInstructions", string, str, context.getString(R.string.f11nameremoved), R.drawable.note_icon));
        }
        return A0s;
    }

    public boolean A07(C624034w r5, AnonymousClass213 r6, AnonymousClass39S r7, HashMap hashMap, int i, boolean z) {
        String str;
        if (hashMap.isEmpty()) {
            Log.e(C160757oG.A01("BrazilPaymentCheckoutOrderDetailsViewConfigurationFactory", "shouldShowPaymentButton, missing default Whatsapp payment option in the map"));
        } else if (4 == i || 3 == i || !this.A01.A02.A0Y(C58422vE.A02, 3771) || ((str = r7.A02) != null && str.length() != 0)) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public C29571ju(Resources resources, C56422rx r2, C56612sH r3, C620733j r4, C66473Lo r5, AnonymousClass1VX r6, C1907099n r7, AnonymousClass9U4 r8, C195219Wq r9, C106715a2 r10) {
        super(resources, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        this.A02 = r10;
        this.A00 = resources;
        this.A01 = r7;
    }

    public boolean A05() {
        return true;
    }

    public boolean A06(C624034w r2, C95814uZ r3, AnonymousClass39S r4) {
        return true;
    }

    public boolean A08(String str, List list, boolean z) {
        return false;
    }
}
