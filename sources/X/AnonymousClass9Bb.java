package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity;

/* renamed from: X.9Bb  reason: invalid class name */
public abstract class AnonymousClass9Bb extends AnonymousClass9CG implements C202559mD {
    public C617332a A00;
    public C153607bd A01;
    public AnonymousClass9WM A02;
    public AnonymousClass9AA A03;

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AnonymousClass9U1 r5 = this.A0L;
        this.A01 = r5.A04;
        C69263Wi r2 = this.A05;
        AnonymousClass31C r4 = this.A0H;
        AnonymousClass9U4 r8 = this.A0P;
        this.A03 = new AnonymousClass9AA(this, r2, this.A00, r4, r5, this.A0K, this.A0M, r8, this);
        onConfigurationChanged(AnonymousClass001.A0M(this));
        C197109ca r42 = this.A0S;
        Integer A0Z = C18290x4.A0Z();
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        r42.BKB(A0Z, (Integer) null, str, this.A0e);
    }

    public void A7W(AnonymousClass99H r4) {
        Intent A08 = AnonymousClass0x9.A08(this, IndiaUpiSimVerificationActivity.class);
        A7O(A08);
        A08.putExtra("extra_in_setup", true);
        A08.putExtra("extra_selected_bank", r4);
        A08.putExtra("extra_referral_screen", this.A0e);
        startActivity(A08);
        finish();
    }

    public void BZ8(AnonymousClass34V r4) {
        if (!C196719bd.A02(this, "upi-get-psp-routing-and-list-keys", r4.A00, false)) {
            C160757oG r2 = this.A0p;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onPspRoutingAndListKeysError: ");
            A0o.append(r4);
            C1899593h.A1J(r2, "; showGenericError", A0o);
            A7V();
        }
    }

    public void onBackPressed() {
        String str;
        C197109ca r4 = this.A0S;
        Integer A0f = AnonymousClass001.A0f();
        Integer A0a = C18290x4.A0a();
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        r4.BKB(A0f, A0a, str, this.A0e);
        super.onBackPressed();
    }

    public void A7V() {
        BjL();
        AnonymousClass9WM.A00(this, (DialogInterface.OnDismissListener) null, getString(R.string.f11nameremoved)).show();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() == 16908332) {
            C197109ca r4 = this.A0S;
            Integer A0f = AnonymousClass001.A0f();
            Integer A0a = C18290x4.A0a();
            if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
                str = "notify_verification_prompt";
            } else {
                str = "notify_verification_screen";
            }
            r4.BKB(A0f, A0a, str, this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStop() {
        super.onStop();
        if (isFinishing()) {
            this.A03.A00 = null;
        }
    }
}
