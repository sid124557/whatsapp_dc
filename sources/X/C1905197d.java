package X;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.payments.ui.BrazilPaymentIntegrityAppealActivity;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;

/* renamed from: X.97d  reason: invalid class name and case insensitive filesystem */
public abstract class C1905197d extends C89644eZ {
    public View A00;
    public Button A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass94s A07;

    public void A75() {
        AnonymousClass94s r0;
        if (this instanceof BrazilPaymentReportPaymentActivity) {
            r0 = ((BrazilPaymentReportPaymentActivity) this).A00;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            r0 = ((BrazilPaymentDPOActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportP2pActivity) {
            r0 = ((BrazilPaymentContactSupportP2pActivity) this).A00;
        } else if (this instanceof BrazilPaymentContactSupportActivity) {
            BrazilPaymentContactSupportActivity brazilPaymentContactSupportActivity = (BrazilPaymentContactSupportActivity) this;
            if (brazilPaymentContactSupportActivity instanceof BrazilPaymentIntegrityAppealActivity) {
                r0 = ((BrazilPaymentIntegrityAppealActivity) brazilPaymentContactSupportActivity).A00;
            } else {
                r0 = brazilPaymentContactSupportActivity.A00;
            }
        } else {
            r0 = ((BrazilPaymentContactOmbudsmanActivity) this).A00;
        }
        this.A07 = r0;
        C626936e.A06(r0.A01.A07());
        C205049qL.A02(this, this.A07.A01, 12);
        C205049qL.A02(this, this.A07.A09, 13);
    }

    public void A74() {
        int i;
        Spanned fromHtml;
        int i2;
        int i3;
        this.A00 = findViewById(R.id.transaction_header);
        this.A06 = C18310x6.A0L(this, R.id.describe_problem_instructions);
        this.A02 = (EditText) findViewById(R.id.describe_problem_field);
        this.A04 = C18310x6.A0L(this, R.id.describe_problem_field_error);
        this.A01 = (Button) findViewById(R.id.contact_support_send_button);
        this.A05 = C18310x6.A0L(this, R.id.help_center_link);
        this.A03 = C18310x6.A0L(this, R.id.describe_contact_info);
        this.A00.setVisibility(8);
        int i4 = Build.VERSION.SDK_INT;
        Resources resources = getResources();
        boolean z = this instanceof BrazilPaymentReportPaymentActivity;
        if (z) {
            i = R.string.f11nameremoved;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            i = R.string.f11nameremoved;
        } else if ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
        }
        String string = resources.getString(i);
        if (i4 >= 24) {
            fromHtml = Html.fromHtml(string, 63);
        } else {
            fromHtml = Html.fromHtml(string);
        }
        this.A06.setText(fromHtml);
        EditText editText = this.A02;
        if (z) {
            i2 = R.string.f11nameremoved;
        } else if (this instanceof BrazilPaymentDPOActivity) {
            i2 = R.string.f11nameremoved;
        } else {
            i2 = R.string.f11nameremoved;
        }
        editText.setHint(i2);
        this.A02.addTextChangedListener(new C203959oa(this, 0));
        this.A02.setOnFocusChangeListener(new C204319pA(this, 0));
        Button button = this.A01;
        if (z || (this instanceof BrazilPaymentDPOActivity)) {
            i3 = R.string.f11nameremoved;
        } else {
            i3 = R.string.f11nameremoved;
        }
        button.setText(i3);
        C204249p3.A02(this.A01, this, 16);
        C204249p3.A02(this.A05, this, 17);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            if (this instanceof BrazilPaymentReportPaymentActivity) {
                i = R.string.f11nameremoved;
            } else if (this instanceof BrazilPaymentDPOActivity) {
                i = R.string.f11nameremoved;
            } else if ((this instanceof BrazilPaymentContactSupportP2pActivity) || (this instanceof BrazilPaymentContactSupportActivity)) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
            supportActionBar.A0B(i);
        }
        A75();
        A74();
        if (getIntent() != null) {
            this.A07.A0I(getIntent().getStringExtra("extra_transaction_id"));
        }
        AnonymousClass94s r2 = this.A07;
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("product_flow", "p2m");
        A0K.A01(r2.A06);
        r2.A07.BKE(A0K, C18290x4.A0Z(), (Integer) null, r2.A0E(), (String) null);
    }
}
