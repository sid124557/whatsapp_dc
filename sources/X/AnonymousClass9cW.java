package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.9cW  reason: invalid class name */
public class AnonymousClass9cW implements C203099n7 {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ AnonymousClass9Bw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass9cW(C52792m3 r1, AnonymousClass9Bw r2, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = str2;
    }

    public void BRQ(boolean z) {
        String A0e;
        AnonymousClass9Bw r3 = this.A01;
        if (!r3.A0D.A0X(2928) || !"p2m_context".equals(this.A03)) {
            this.A00.A00("on_success");
            return;
        }
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("account_compliance_status", "COMPLETED");
        AbstractMap A0d = C1899593h.A0d(r3);
        if (A0d == null || (A0e = C18320x8.A0e("fds_resource_id", A0d)) == null) {
            Log.e("PayBloksActivity/onDobCheckComplete resource id is null");
            return;
        }
        r3.A79(this.A00);
        r3.A7B(A0e, this.A02, A0t);
    }

    public void BS6(AnonymousClass34V r5) {
        AnonymousClass9Bw r3 = this.A01;
        if (r3.A0I.A00(r3, r5)) {
            this.A00.A00("on_failure");
            return;
        }
        int i = r5.A00;
        if (i == 10755) {
            this.A00.A00("on_failure");
            r3.Boo(PaymentsUnavailableDialogFragment.A00());
            return;
        }
        HashMap A0t = AnonymousClass001.A0t();
        C1899693i.A0v(A0t, i);
        this.A00.A01("on_exception", A0t);
    }
}
