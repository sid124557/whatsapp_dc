package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.9Lt  reason: invalid class name */
public class AnonymousClass9Lt {
    public static void A00(Context context, C624034w r7, C203719oC r8, String str, int i) {
        if (r8 != null) {
            C95814uZ r5 = r7.A0C;
            Intent A08 = AnonymousClass0x9.A08(context, r8.BBC());
            C107395bF.A00(A08, new AnonymousClass2z0(r5, r7.A0L, r7.A0Q));
            A08.putExtra("extra_transaction_id", r7.A0K);
            A08.putExtra("extra_transaction_detail_data", new AnonymousClass38V(r7));
            A08.putExtra("referral_screen", str);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A08.putExtra("extra_origin_screen", (String) null);
            }
            A08.putExtra("extra_payment_flow_entry_point", i);
            context.startActivity(A08);
        }
    }
}
