package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass2GU;
import X.AnonymousClass303;
import X.AnonymousClass3ZO;
import X.AnonymousClass5VI;
import X.AnonymousClass94R;
import X.AnonymousClass98s;
import X.AnonymousClass99N;
import X.AnonymousClass99P;
import X.AnonymousClass9JZ;
import X.AnonymousClass9LX;
import X.AnonymousClass9QM;
import X.AnonymousClass9RU;
import X.AnonymousClass9T5;
import X.AnonymousClass9TR;
import X.AnonymousClass9VU;
import X.AnonymousClass9W3;
import X.AnonymousClass9WM;
import X.AnonymousClass9b9;
import X.AnonymousClass9bR;
import X.C102085Hk;
import X.C111095hX;
import X.C116985rC;
import X.C162457s7;
import X.C166587yw;
import X.C1899693i;
import X.C191599Fn;
import X.C192779Ln;
import X.C194089Rn;
import X.C194479Ta;
import X.C194649Ty;
import X.C194939Vd;
import X.C196689ba;
import X.C203199nH;
import X.C203499no;
import X.C204359pE;
import X.C205039qK;
import X.C50472iE;
import X.C617332a;
import X.C620933l;
import X.C73723fy;
import X.C84564Cv;
import X.C85034Er;
import X.C86654Ky;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

public class BrazilPaymentSettingsFragment extends Hilt_BrazilPaymentSettingsFragment implements C203199nH, C84564Cv {
    public C116985rC A00;
    public C111095hX A01;
    public AnonymousClass99P A02;
    public C617332a A03;
    public AnonymousClass2GU A04;
    public AnonymousClass9bR A05;
    public C194479Ta A06;
    public AnonymousClass9WM A07;
    public C194089Rn A08;
    public AnonymousClass9RU A09;
    public AnonymousClass9VU A0A;
    public AnonymousClass99N A0B;
    public C203499no A0C;
    public C102085Hk A0D;
    public AnonymousClass9W3 A0E;
    public AnonymousClass9TR A0F;
    public C196689ba A0G;
    public C194649Ty A0H;
    public C191599Fn A0I;
    public AnonymousClass9QM A0J;

    public void A1c(int i) {
        if (i == 2) {
            C191599Fn r0 = this.A0I;
            if (r0 != null) {
                String str = r0.A01;
                AnonymousClass9JZ r4 = r0.A00;
                String A032 = this.A0H.A03("generic_context", true);
                Intent A033 = C1899693i.A03(A1D());
                if (A032 == null) {
                    A032 = "brpay_p_add_credential_router";
                }
                A033.putExtra("screen_name", A032);
                AnonymousClass98s.A0a(A033, "referral_screen", "push_provisioning");
                AnonymousClass98s.A0a(A033, "credential_push_data", str);
                AnonymousClass98s.A0a(A033, "credential_card_network", r4.toString());
                AnonymousClass98s.A0a(A033, "onboarding_context", "generic_context");
                A0m(A033);
                return;
            }
            Log.e("BrazilPaymentSettingsViewModel instance is null and cannot continue to push prov");
            return;
        }
        super.A1c(i);
    }

    public void BMA(boolean z) {
        A1h((String) null, "payment_home.add_payment_method");
    }

    public void A1Z() {
        if (this.A0m.A02.A0X(1359)) {
            AnonymousClass303 r2 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            r2.A03("hc_entrypoint", "wa_payment_hub_support");
            r2.A03("app_type", "consumer");
            this.A0C.BKE(r2, AnonymousClass001.A0f(), 39, "payment_home", (String) null);
            A0m(AnonymousClass0x9.A08(A0G(), BrazilPaymentCareTransactionSelectorActivity.class));
            return;
        }
        super.A1Z();
    }

    public final void A1n(String str, String str2) {
        Intent A032 = C1899693i.A03(A1D());
        A032.putExtra("screen_name", str2);
        AnonymousClass98s.A0a(A032, "onboarding_context", "generic_context");
        AnonymousClass98s.A0a(A032, "referral_screen", str);
        AnonymousClass5VI.A00(A032, "payment_settings");
        startActivityForResult(A032, 2);
    }

    public void BP2(AnonymousClass3ZO r2) {
        C194939Vd r0 = this.A0v;
        if (r0 != null) {
            r0.A05(r2);
        }
    }

    public void BRL(AnonymousClass3ZO r7) {
        if (this.A02.A0X(1724)) {
            C203499no r0 = this.A0C;
            Integer A0f = AnonymousClass001.A0f();
            r0.BJy(r7, A0f, A0f, "payment_home", this.A16);
        }
    }

    public void Bld(boolean z) {
        View view = this.A0B;
        if (view != null) {
            FrameLayout A0L = C86654Ky.A0L(view, R.id.action_required_container);
            C194939Vd r0 = this.A0v;
            int i = 0;
            if (r0 != null) {
                if (r0.A0C.A04() != null) {
                    this.A0Z.A04(C192779Ln.A00(this.A0W, this.A0v.A0C.A04()));
                }
                List A022 = this.A0Z.A02();
                if (!A022.isEmpty()) {
                    A0L.removeAllViews();
                    AnonymousClass94R r4 = new AnonymousClass94R(A0G());
                    r4.A00(new AnonymousClass9T5(new AnonymousClass9b9(A0L, this), (AnonymousClass3ZO) C73723fy.A0E(A022).get(0), A022.size()));
                    A0L.addView(r4);
                    int size = A022.size();
                    Set set = this.A04.A00;
                    if (size > 1) {
                        set.add(this);
                    } else {
                        set.remove(this);
                    }
                }
            }
            if (!z) {
                i = 8;
            }
            A0L.setVisibility(i);
        }
    }

    public void A0a() {
        super.A0a();
        this.A04.A00.remove(this);
    }

    public void A0f() {
        super.A0f();
        C194939Vd r0 = this.A0v;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        if (i == 2 && i2 == -1) {
            A0m(AnonymousClass0x9.A08(A1D(), BrazilFbPayHubActivity.class));
        }
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        super.A0p(bundle);
        AnonymousClass99P r2 = this.A02;
        String str = null;
        Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
        if (!r2.A0G() || !r2.A0H()) {
            r2.A0F((C85034Er) null, "payment_settings", true);
        }
        if (this.A02.A0X(698)) {
            this.A0B.A0E();
        }
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null) {
            Uri uri = (Uri) bundle2.getParcelable("extra_deep_link_url");
            if (uri != null && AnonymousClass9LX.A00(uri, this.A0G)) {
                C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
                A002.A01(new C204359pE(0), R.string.f11nameremoved);
                A002.A00().A1O(A0T(), (String) null);
            }
            str2 = bundle2.getString("notification-type", (String) null);
            str = bundle2.getString("step-up-id", (String) null);
        }
        C194939Vd r0 = this.A0v;
        if (r0 != null) {
            r0.A07(str2, str);
        }
        this.A0d = new C205039qK(this, 0);
        if (!this.A0H.A05.A03()) {
            C620933l r22 = this.A0i;
            if ((!r22.A03().contains("payment_account_recoverable") || !r22.A03().contains("payment_account_recoverable_time_ms")) && this.A02.A0X(2000)) {
                this.A09.A00(A1D());
            }
        }
        C162457s7.A0J(this.A02, 0);
    }

    public void BgE() {
        Intent A032 = C1899693i.A03(A0R());
        A032.putExtra("screen_name", "brpay_p_doc_upload_intro");
        startActivityForResult(A032, 1);
    }

    public boolean BoN() {
        return true;
    }

    public void BXr(C166587yw r1) {
    }
}
