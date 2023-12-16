package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import java.util.ArrayList;

/* renamed from: X.90y  reason: invalid class name and case insensitive filesystem */
public class C1893490y implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1893490y(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4FS r2;
        Runnable r1;
        switch (this.A02) {
            case 0:
                CatalogListActivity catalogListActivity = (CatalogListActivity) this.A00;
                C56962sq r12 = catalogListActivity.A0D;
                Jid A0I = ((AnonymousClass3ZH) this.A01).A0I(UserJid.class);
                C626936e.A06(A0I);
                r12.A0G(catalogListActivity, (UserJid) A0I);
                C621433s.A00(catalogListActivity, 106);
                return;
            case 1:
                C181898nW r0 = (C181898nW) this.A01;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (r0 != null) {
                    ((Activity) ((C1893290w) r0).A00).finish();
                    return;
                }
                return;
            case 2:
                C111485iA r3 = (C111485iA) this.A00;
                C621433s.A00(r3.A02, 1);
                r3.A00((ArrayList) this.A01);
                return;
            case 3:
                Runnable runnable = (Runnable) this.A01;
                ((ExportMigrationActivity) this.A00).A74(0);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                AnonymousClass7YE r4 = (AnonymousClass7YE) this.A01;
                PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) ((BusinessHubActivity) this.A00).A0D.getValue();
                if (C162457s7.A0P(r4.A00(), "EXTERNALLY_DISABLED")) {
                    r2 = paymentMerchantAccountViewModel.A08;
                    r1 = new C70123Zz(r4, 37, paymentMerchantAccountViewModel);
                } else {
                    AnonymousClass6CA.A0J(paymentMerchantAccountViewModel.A0B).A0H(AnonymousClass9WE.A00((Object) null));
                    r2 = paymentMerchantAccountViewModel.A08;
                    r1 = new C71263bp((Object) paymentMerchantAccountViewModel, 16);
                }
                r2.BkM(r1);
                return;
        }
    }
}
