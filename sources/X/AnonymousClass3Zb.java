package X;

import com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.3Zb  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Zb implements Runnable {
    public final /* synthetic */ PhoenixExtensionsBottomSheetActivity A00;

    public final void run() {
        PhoenixExtensionsBottomSheetActivity phoenixExtensionsBottomSheetActivity = this.A00;
        if (phoenixExtensionsBottomSheetActivity.A0D.A0Y(C58422vE.A02, 6715)) {
            C95814uZ A03 = C106405Yw.A03(Jid.Companion.A03(phoenixExtensionsBottomSheetActivity.getIntent().getStringExtra("extra_business_jid")));
            boolean z = A03 instanceof C95804uY;
            AnonymousClass30V r1 = phoenixExtensionsBottomSheetActivity.A00;
            if (r1 != null) {
                int i = 4;
                if (z) {
                    i = 26;
                }
                r1.A03(A03, i);
                return;
            }
            throw C18270x1.A0S("navigationTimeSpentManager");
        }
    }

    public /* synthetic */ AnonymousClass3Zb(PhoenixExtensionsBottomSheetActivity phoenixExtensionsBottomSheetActivity) {
        this.A00 = phoenixExtensionsBottomSheetActivity;
    }
}
