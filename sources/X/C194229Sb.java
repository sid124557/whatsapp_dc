package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9Sb  reason: invalid class name and case insensitive filesystem */
public class C194229Sb {
    public final C153087ae A00;
    public final C1907099n A01;
    public final AnonymousClass9U4 A02;

    public Intent A00(Context context, AnonymousClass39S r5, AnonymousClass2z0 r6, String str, String str2, String str3) {
        C203719oC A0G;
        C1907099n r1 = this.A01;
        if (!r1.A01() || !r1.A0K(str)) {
            A0G = this.A02.A0G();
        } else {
            A0G = this.A02.A0H("P2M_LITE");
        }
        if (A0G != null) {
            Class BBC = A0G.BBC();
            if (BBC == null) {
                Log.e("PAY: PaymentIntents/getTransactionDetailsIntent -> transactionDetailClass is null");
            } else {
                Intent A08 = AnonymousClass0x9.A08(context, BBC);
                if (str2 != null) {
                    A08.putExtra("extra_transaction_id", str2);
                }
                if (r6 != null) {
                    C107395bF.A00(A08, r6);
                }
                if (r5 != null && !TextUtils.isEmpty(r5.A02)) {
                    A08.putExtra("extra_payment_receipt_type", "non_native");
                }
                if (str3 != null) {
                    A08.putExtra("referral_screen", str3);
                }
                A08.setFlags(603979776);
                return A08;
            }
        }
        return null;
    }

    public void A01(Intent intent) {
        C85204Fi A012 = this.A00.A01();
        if (A012 != null) {
            AnonymousClass1S3 r2 = (AnonymousClass1S3) A012;
            intent.putExtra("extra_payment_preset_min_amount", r2.A01.A00.toString());
            intent.putExtra("extra_payment_preset_max_amount", r2.A00.A00.toString());
        }
    }

    public C194229Sb(C153087ae r1, C1907099n r2, AnonymousClass9U4 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
