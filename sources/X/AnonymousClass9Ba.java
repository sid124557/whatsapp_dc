package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity;

/* renamed from: X.9Ba  reason: invalid class name */
public abstract class AnonymousClass9Ba extends AnonymousClass9CF {
    public C116985rC A00;
    public AnonymousClass9ER A01;
    public String A02;

    public String A7V() {
        if (this instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
            return "payment_intro_prompt";
        }
        if (this instanceof IndiaUpiPaymentsValuePropsActivity) {
            return "payment_intro_screen";
        }
        return "incentive_value_prop";
    }

    public void A7W() {
        this.A01.A00.A0B("valuePropsContinue");
        A7a(this.A02);
        C116985rC r1 = this.A00;
        if (r1.A07()) {
            r1.A04();
            C162457s7.A0J(this.A06, 0);
            Intent A08 = AnonymousClass0x9.A08(this, IndiaUpiPaymentsAccountSetupActivity.class);
            this.A0o = true;
            A7O(A08);
            A08.putExtra("extra_previous_screen", A7V());
            AnonymousClass5VI.A00(A08, "valuePropsContinue");
            A6T(A08, true);
            return;
        }
        finish();
    }

    public void A7X() {
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            AnonymousClass97T.A11(indiaUpiIncentivesValuePropsActivity.A01);
            C134246ig A05 = indiaUpiIncentivesValuePropsActivity.A0S.A05(AnonymousClass001.A0f(), C18290x4.A0a(), "incentive_value_prop", (String) null);
            A05.A01 = Boolean.valueOf(AnonymousClass97T.A12(indiaUpiIncentivesValuePropsActivity));
            AnonymousClass97T.A0t(A05, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        AnonymousClass97T.A11(this.A01);
        this.A0S.A0A(AnonymousClass001.A0f(), C18290x4.A0a(), A7V(), this.A02, this.A0i, this.A0h, AnonymousClass000.A1U(this.A02, 11));
    }

    public void A7Y(TextSwitcher textSwitcher) {
        int i = this.A02;
        int i2 = R.string.f11nameremoved;
        if (i == 11) {
            i2 = R.string.f11nameremoved;
        }
        textSwitcher.setText(Html.fromHtml(getString(i2)));
        Context context = textSwitcher.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.f0nameremoved);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.f0nameremoved);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        C18270x1.A0w(new C203999oe(textSwitcher, 2, this), this.A04);
    }

    public void A7a(String str) {
        String str2 = str;
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            C134246ig A05 = indiaUpiIncentivesValuePropsActivity.A0S.A05(AnonymousClass001.A0f(), C18290x4.A0c(), "incentive_value_prop", str);
            A05.A01 = Boolean.valueOf(AnonymousClass97T.A12(indiaUpiIncentivesValuePropsActivity));
            AnonymousClass97T.A0t(A05, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        this.A0S.A0A(AnonymousClass001.A0f(), 36, A7V(), str2, this.A0i, this.A0h, AnonymousClass000.A1U(this.A02, 11));
    }

    public void A7Z(Long l) {
        int i;
        Uri uri;
        AnonymousClass303 r3 = null;
        if (!(getIntent() == null || (uri = (Uri) getIntent().getParcelableExtra("extra_deep_link_url")) == null)) {
            try {
                String queryParameter = uri.getQueryParameter("campaignID");
                if (!TextUtils.isEmpty(queryParameter)) {
                    AnonymousClass303 r1 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
                    r1.A03("campaign_id", queryParameter);
                    r3 = r1;
                }
            } catch (Exception unused) {
            }
        }
        C134246ig A04 = this.A0S.A04(r3, C18290x4.A0Z(), (Integer) null, A7V(), this.A02, this.A0i, this.A0h, AnonymousClass000.A1U(this.A02, 11));
        if (l != null) {
            long longValue = l.longValue();
            if (longValue <= 10) {
                i = 1;
            } else if (longValue <= 15) {
                i = 2;
            } else {
                i = 4;
                if (longValue <= 20) {
                    i = 3;
                }
            }
            A04.A09 = Integer.valueOf(i);
            C18260x0.A1R(AnonymousClass001.A0o(), "PAY: logContactBucketUserActionEvent event:", A04);
        }
        this.A0C.BhD(A04);
    }

    public void onBackPressed() {
        super.onBackPressed();
        A7X();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = C1899593h.A0Z(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A7X();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        String str;
        super.onResume();
        this.A01.A00(getIntent());
        this.A01.A00.A0B("valuePropsShown");
        AnonymousClass9ER r4 = this.A01;
        int i = this.A03;
        long j = (long) this.A02;
        String str2 = this.A02;
        boolean A12 = AnonymousClass97T.A12(this);
        AnonymousClass316 r6 = r4.A00;
        if (i == 2) {
            str = "skip2fa";
        } else {
            str = "with2fa";
        }
        r6.A0C("setupMode", false, str);
        r6.A0C.markerAnnotate(r6.A0A.A07, "paymentsEntryPoint", j);
        if (str2 != null) {
            r6.A0C("referralScreen", false, str2);
        }
        r6.A0D("paymentsAccountExists", A12, false);
    }
}
