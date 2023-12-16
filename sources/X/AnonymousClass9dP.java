package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9dP  reason: invalid class name */
public class AnonymousClass9dP implements C203479nl {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ C203469nk A01;
    public final /* synthetic */ C197419d8 A02;

    public void BXu(AnonymousClass39L r8, AnonymousClass4DV r9, String str, String str2, List list) {
        C197419d8 r0 = this.A02;
        r0.A0W.A03(r9, r0.A0A, 9);
        PaymentOptionsBottomSheet A002 = PaymentOptionsBottomSheet.A00(str, (String) null, list, false);
        C89644eZ r2 = this.A00;
        A002.A06 = new C197489dF(r2, r8, this, r9, str2);
        C86644Kx.A1C(A002, r2);
    }

    public AnonymousClass9dP(C89644eZ r1, C203469nk r2, C197419d8 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass39L r8, AnonymousClass4DV r9, String str) {
        C197419d8 r0 = this.A02;
        AnonymousClass4FS r6 = r0.A0Y;
        C66543Lv r1 = r0.A0L;
        AnonymousClass9b0 r3 = r0.A0S;
        AnonymousClass35F.A02(r0.A0F, r1, r0.A0N, r3, new C196529b1(r8, this, r9, str), r9, r6);
    }

    public void BOs(AnonymousClass39L r9, C95814uZ r10, AnonymousClass9XZ r11, C194069Rl r12, AnonymousClass4DV r13, String str, String str2, String str3, HashMap hashMap) {
        C197419d8 r4 = this.A02;
        r4.A0W.A03(r13, r4.A0A, 5);
        String str4 = r4.A0A;
        if ("WhatsappPay".equals(str4) || "p2m_lite".equals(str4)) {
            if (this.A01.BH6()) {
                WaButtonWithLoader waButtonWithLoader = r4.A05.A0B;
                waButtonWithLoader.A06 = true;
                waButtonWithLoader.A00();
            } else {
                this.A00.Bp9(R.string.f11nameremoved);
            }
            A00(r9, r13, str);
        } else if ("GlobalPayment".equals(str4) || "CustomPaymentInstructions".equals(str4)) {
            this.A01.BPi(r9, r10, r12, r13);
        } else {
            boolean equals = "checkout_lite".equals(str4);
            Objects.requireNonNull(r13.B5s());
            AnonymousClass39S r0 = r13.B5s().A01;
            if (equals) {
                Objects.requireNonNull(r0);
                List list = r0.A0K;
                Objects.requireNonNull(list);
                C626936e.A0B(!list.isEmpty());
                AnonymousClass3SP r02 = (AnonymousClass3SP) ((AnonymousClass394) C18290x4.A0k(list)).A00;
                Objects.requireNonNull(r02);
                C89644eZ r3 = this.A00;
                String str5 = r02.A02;
                r3.startActivity(C192769Lm.A00(r3, r4.A0O, AnonymousClass32Y.A03(r4.A09.A00), str5));
                return;
            }
            Objects.requireNonNull(r0);
            Objects.requireNonNull(r13.B5s().A01.A0I);
            C626936e.A0B(!r13.B5s().A01.A0I.isEmpty());
            String str6 = ((AnonymousClass399) r13.B5s().A01.A0I.get(0)).A02;
            C89644eZ r32 = this.A00;
            C19340zH A002 = AnonymousClass5V0.A00(r32);
            A002.A0i(false);
            A002.A0h(r32.getString(R.string.f11nameremoved));
            C86624Kv.A0i(r32, A002, new Object[]{str6}, R.string.f11nameremoved);
            A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            A002.A0Y(new AnonymousClass9X4(r32, this, r13, str6), R.string.f11nameremoved);
            C18280x3.A0q(A002);
        }
    }

    public void BWT(C95814uZ r5, AnonymousClass4DV r6, long j) {
        C197419d8 r3 = this.A02;
        r3.A0W.A03(r6, r3.A0A, 8);
        Intent A1N = new C627736r().A1N(r3.A01, r5);
        A1N.putExtra("extra_quoted_message_row_id", j);
        r3.A01.startActivity(A1N);
    }

    public void BXN(String str) {
        C194519Tf r1 = this.A02.A02;
        r1.A04 = "wa_p2m_lite_receipt_support";
        r1.A01(this.A00);
    }

    public void BXP(C95814uZ r10, AnonymousClass4DV r11, String str) {
        AnonymousClass39S r4;
        C197419d8 r3 = this.A02;
        AnonymousClass2z0 r5 = null;
        r3.A0W.A03(r11, r3.A0A, 7);
        String str2 = null;
        if (r11 instanceof C624134x) {
            r5 = ((C624134x) r11).A1J;
        }
        AnonymousClass39W B5s = r11.B5s();
        if (B5s == null || (r4 = B5s.A01) == null) {
            r4 = null;
        } else {
            str2 = r4.A0D;
        }
        C194229Sb r2 = r3.A0U;
        C89644eZ r32 = this.A00;
        Intent A002 = r2.A00(r32, r4, r5, str2, str, "order_details");
        if (A002 == null) {
            Log.e("Pay: PaymentCheckoutOrderDetailsCoordinator/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            r32.startActivity(A002);
        }
    }

    public void BPj(C95814uZ r1, int i) {
    }

    public void Ba7(int i) {
    }
}
