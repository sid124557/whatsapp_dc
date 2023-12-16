package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;

/* renamed from: X.9pG  reason: invalid class name and case insensitive filesystem */
public class C204379pG implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204379pG(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(C204379pG r20) {
        String str;
        C204379pG r0 = r20;
        BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) r0.A00;
        C624034w r3 = (C624034w) r0.A01;
        brazilPaymentTransactionDetailActivity.A6P(R.string.f11nameremoved, SearchActionVerificationClientService.NOTIFICATION_ID);
        AnonymousClass9PI r14 = brazilPaymentTransactionDetailActivity.A00;
        AnonymousClass9NN r15 = new AnonymousClass9NN(brazilPaymentTransactionDetailActivity);
        C56612sH r2 = brazilPaymentTransactionDetailActivity.A06;
        AnonymousClass9U5 r1 = r14.A03;
        String A03 = r1.A07.A03();
        String A022 = AnonymousClass35J.A02(r14.A01, r2);
        C27991fJ A032 = AnonymousClass34R.A03(r3.A0C);
        UserJid userJid = r3.A0D;
        if (userJid != null && (str = r3.A0K) != null) {
            String str2 = r3.A0L;
            C35351wj A0W = C1899693i.A0W(A03);
            C56052rL A012 = C56052rL.A01();
            C1899593h.A1M(A012);
            C56052rL A0U = C1899593h.A0U();
            C56052rL.A0D(A0U, "action", "br-cancel-unilateral");
            C56052rL.A06(userJid, A0U, "receiver");
            if (C1899593h.A1a(str, false)) {
                C56052rL.A0D(A0U, "transaction_id", str);
            }
            if (C626836d.A0N(str2, false)) {
                C56052rL.A0D(A0U, "message_id", str2);
            }
            C1899593h.A1N(A0U, A022);
            if (A032 != null) {
                C56052rL.A06(A032, A0U, "group");
            }
            AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, A0W);
            r1.A0F(new C203899oU(brazilPaymentTransactionDetailActivity, r14.A02, r14.A00, r14, r15, 6), A033, A03, 0);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C52792m3 r2;
        Dialog dialog;
        String str2;
        switch (this.A02) {
            case 2:
                r2 = (C52792m3) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_negative";
                break;
            case 3:
                r2 = (C52792m3) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_neutral";
                break;
            case 5:
                Context context = (Context) this.A01;
                if (((C196709bc) this.A00).A06.A00()) {
                    str = "https://faq.whatsapp.com/payments/26000350";
                } else {
                    str = "https://faq.whatsapp.com/payments/26000351";
                }
                C626936e.A06(str);
                context.startActivity(C627736r.A17(context, str, (String) null, false, false));
                return;
            case 6:
                C194659Tz r4 = (C194659Tz) this.A00;
                Intent intent = new Intent("android.intent.action.VIEW", r4.A02.A00());
                r4.A01.A0A((Context) this.A01, intent);
                return;
            case 7:
                Context context2 = (Context) this.A00;
                ((DialogFragment) this.A01).A1L();
                context2.startActivity(AnonymousClass0x9.A08(context2, BrazilPaymentSettingsActivity.class));
                return;
            case 8:
                ((DialogFragment) this.A01).A1L();
                BrazilPaymentActivity brazilPaymentActivity = ((C196989cH) this.A00).A00.A05;
                brazilPaymentActivity.startActivity(AnonymousClass0x9.A08(brazilPaymentActivity, BrazilPaymentDPOActivity.class));
                C203499no r3 = brazilPaymentActivity.A0L;
                AnonymousClass303 A0K = C1899593h.A0K();
                A0K.A03("product_flow", "p2m");
                AnonymousClass9Wg.A02(A0K, r3, 120, "payment_disabled_alert", (String) null, 1);
                return;
            case 9:
                A00(this);
                return;
            case 10:
                dialogInterface.dismiss();
                new Handler(((Context) this.A00).getMainLooper()).post((Runnable) this.A01);
                return;
            case 11:
                ((Activity) this.A01).finish();
                return;
            default:
                r2 = (C52792m3) this.A00;
                dialog = (Dialog) this.A01;
                str2 = "on_press_positive";
                break;
        }
        r2.A00(str2);
        dialog.dismiss();
    }
}
