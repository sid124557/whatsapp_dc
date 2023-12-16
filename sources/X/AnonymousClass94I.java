package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.94I  reason: invalid class name */
public class AnonymousClass94I extends LinearLayout implements View.OnClickListener, AnonymousClass4GJ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C166557yt A05;
    public C202179lV A06;
    public C116855qy A07;
    public boolean A08;

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setInternationalActivationView(C166467yj r5) {
        View view = this.A01;
        if (view != null && this.A02 != null && r5 != null) {
            view.setOnClickListener(this);
            boolean z = r5.A02;
            View view2 = this.A02;
            if (z) {
                view2.setVisibility(0);
                this.A01.setVisibility(8);
                return;
            }
            view2.setVisibility(8);
            this.A01.setVisibility(0);
            TextView A09 = AnonymousClass002.A09(this, R.id.international_desc);
            if (A09 != null) {
                A09.setText(r5.A00);
            }
        }
    }

    public AnonymousClass94I(Context context) {
        super(context);
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        int A042 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        C1899593h.A0m(this, R.id.change_icon, A042);
        C1899593h.A0m(this, R.id.reset_icon, A042);
        C1899593h.A0m(this, R.id.switch_payment_provider_icon, A042);
    }

    public void A00() {
        this.A05 = C1899693i.A0F(AnonymousClass3QD.A00(), Boolean.class, Boolean.TRUE, "isPinSet");
        this.A04.setText(R.string.f11nameremoved);
        this.A00.setVisibility(0);
    }

    public void onClick(View view) {
        AnonymousClass7ZK A002;
        String str;
        Intent A0C;
        int i;
        C133796hx r0;
        if (view.getId() == R.id.reset_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A06;
            boolean A1Z = AnonymousClass001.A1Z(this.A05.A00);
            C133686hm r2 = indiaUpiBankAccountDetailsActivity.A00;
            if (r2 == null || (r0 = r2.A08) == null) {
                str = null;
            } else {
                str = ((AnonymousClass99H) r0).A0B;
            }
            if (A1Z) {
                A0C = IndiaUpiPinPrimerFullSheetActivity.A0C(indiaUpiBankAccountDetailsActivity, r2, str, true);
                i = 1017;
            } else {
                A0C = IndiaUpiPinPrimerFullSheetActivity.A0C(indiaUpiBankAccountDetailsActivity, r2, str, false);
                i = 1016;
            }
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A0C, i);
        } else if (view.getId() == R.id.change_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            Intent A082 = AnonymousClass0x9.A08(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
            A082.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity2.A00);
            indiaUpiBankAccountDetailsActivity2.startActivity(A082);
        } else if (view.getId() == R.id.switch_payment_provider_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            C199089fy r3 = new C199089fy(indiaUpiBankAccountDetailsActivity3);
            C18270x1.A0w(new C191719Gb(indiaUpiBankAccountDetailsActivity3, r3, 104), indiaUpiBankAccountDetailsActivity3.A0I);
        } else if (view.getId() == R.id.upi_international_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity4 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            C134246ig A052 = indiaUpiBankAccountDetailsActivity4.A0D.A05(AnonymousClass001.A0f(), 182, "payment_bank_account_details", "payment_home");
            A052.A0Y = "payment_home";
            indiaUpiBankAccountDetailsActivity4.A0D.BKA(A052);
            if (!C161957qt.A02(indiaUpiBankAccountDetailsActivity4.A0D, indiaUpiBankAccountDetailsActivity4.A06.A07()) || (A002 = indiaUpiBankAccountDetailsActivity4.A0E.A00(indiaUpiBankAccountDetailsActivity4.A08.A0A)) == null || !A002.A02.equals("activated")) {
                Intent A083 = AnonymousClass0x9.A08(indiaUpiBankAccountDetailsActivity4, IndiaUpiInternationalActivationActivity.class);
                A083.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity4.A00);
                A083.putExtra("extra_referral_screen", "payment_bank_account_details");
                indiaUpiBankAccountDetailsActivity4.BpY(A083, 1019);
                return;
            }
            C621433s.A01(indiaUpiBankAccountDetailsActivity4, 105);
        }
    }
}
