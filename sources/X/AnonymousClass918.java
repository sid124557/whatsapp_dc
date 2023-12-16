package X;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.whatsapp.R;
import com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet;
import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.918  reason: invalid class name */
public class AnonymousClass918 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass918(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        String A0F;
        if (this.A03 != 0) {
            BusinessHubActivity businessHubActivity = (BusinessHubActivity) this.A00;
            String str = this.A02;
            AnonymousClass7YE r8 = (AnonymousClass7YE) this.A01;
            AnonymousClass66R r2 = businessHubActivity.A0D;
            ((PaymentMerchantAccountViewModel) r2.getValue()).A0D(C627136h.A03);
            String A0F2 = AnonymousClass002.A0F(businessHubActivity, str, new Object[1], 0, R.string.f11nameremoved);
            C162457s7.A0D(A0F2);
            if (C162457s7.A0P(r8.A00(), "EXTERNALLY_DISABLED")) {
                A0F = businessHubActivity.getString(R.string.f11nameremoved);
            } else {
                boolean A0P = C162457s7.A0P(r8.A00(), "INITED");
                int i = R.string.f11nameremoved;
                if (A0P) {
                    i = R.string.f11nameremoved;
                }
                A0F = AnonymousClass002.A0F(businessHubActivity, str, new Object[1], 0, i);
            }
            C162457s7.A0H(A0F);
            int B72 = ((PaymentMerchantAccountViewModel) r2.getValue()).A05.A0G().B72();
            String string = businessHubActivity.getString(R.string.f11nameremoved);
            C1893490y r22 = new C1893490y(businessHubActivity, 4, r8);
            String string2 = businessHubActivity.getString(R.string.f11nameremoved);
            AlertDialog.Builder builder = new AlertDialog.Builder(businessHubActivity, B72);
            builder.setMessage(A0F);
            builder.setTitle(A0F2);
            if (string != null) {
                builder.setPositiveButton(string, r22);
            }
            if (string2 != null) {
                builder.setNegativeButton(string2, (DialogInterface.OnClickListener) null);
            }
            builder.create().show();
            return;
        }
        FoundPixQrCodeBottomSheet foundPixQrCodeBottomSheet = (FoundPixQrCodeBottomSheet) this.A00;
        C166327yV r23 = (C166327yV) this.A01;
        String str2 = this.A02;
        C620633i r0 = foundPixQrCodeBottomSheet.A00;
        if (r0 != null) {
            ClipboardManager A0C = r0.A0C();
            if (A0C != null) {
                String str3 = r23.A00;
                A0C.setPrimaryClip(ClipData.newPlainText(str3, str3));
            }
            Toast.makeText(foundPixQrCodeBottomSheet.A0Q(), R.string.f11nameremoved, 1).show();
            C203499no r3 = foundPixQrCodeBottomSheet.A02;
            if (r3 != null) {
                r3.BKB(1, 186, "pix_qr_code_found_prompt", str2);
                return;
            }
            throw C18270x1.A0S("paymentUIEventLogger");
        }
        throw C18270x1.A0S("systemServices");
    }
}
