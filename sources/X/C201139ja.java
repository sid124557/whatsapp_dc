package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import java.util.Iterator;

/* renamed from: X.9ja  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201139ja implements Runnable {
    public final /* synthetic */ C193749Pv A00;
    public final /* synthetic */ AnonymousClass9WN A01;
    public final /* synthetic */ String A02;

    public final void run() {
        AnonymousClass9W2 r0;
        C166557yt r02;
        AnonymousClass9WN r03 = this.A01;
        String str = this.A02;
        C193749Pv r4 = this.A00;
        AnonymousClass36F r5 = r03.A04;
        Integer[] numArr = new Integer[2];
        boolean A1Y = C18300x5.A1Y(numArr, 417);
        numArr[1] = 418;
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1P(numArr2, 40, A1Y ? 1 : 0);
        Iterator it = r5.A0V(numArr, numArr2, A1Y).iterator();
        while (it.hasNext()) {
            C624034w A0E = C1899693i.A0E(it);
            AnonymousClass1S4 r1 = A0E.A0A;
            if (r1 instanceof AnonymousClass99L) {
                AnonymousClass99L r12 = (AnonymousClass99L) r1;
                String str2 = A0E.A0K;
                if (!(str2 == null || (r0 = r12.A0G) == null || (r02 = r0.A08) == null || !str.equals(r02.A00))) {
                    Context context = r4.A00;
                    Intent A08 = AnonymousClass0x9.A08(context, IndiaUpiPaymentTransactionDetailsActivity.class);
                    AnonymousClass9WY.A03(A08, r4.A01, r4.A04);
                    A08.setFlags(268435456);
                    A08.putExtra("extra_update_mandate_transaction_id", str2);
                    context.startActivity(A08);
                    r4.A02.BTW();
                    return;
                }
            }
        }
        AnonymousClass9WN r8 = r4.A03;
        Context context2 = r4.A00;
        C202849mg r6 = r4.A02;
        String str3 = r4.A04;
        boolean z = r4.A05;
        r8.A05.BKB(C18290x4.A0Z(), (Integer) null, "qr_code_scan_error", str3);
        r8.A00.BkS(new C201149jb(context2, r6, z));
    }

    public /* synthetic */ C201139ja(C193749Pv r1, AnonymousClass9WN r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }
}
