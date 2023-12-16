package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import java.util.List;

/* renamed from: X.9BY  reason: invalid class name */
public abstract class AnonymousClass9BY extends AnonymousClass97U implements View.OnClickListener, C203189nG, C203169nE, C202819md, C202169lU {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ListView A04;
    public SwitchCompat A05;
    public C194539Ti A06;
    public C1906899l A07;
    public C1906999m A08;
    public C194489Tb A09;
    public C620933l A0A;
    public C29271iY A0B;
    public AnonymousClass9U5 A0C;
    public AnonymousClass9U4 A0D;
    public AnonymousClass9b0 A0E;
    public AnonymousClass948 A0F;
    public AnonymousClass9S2 A0G;
    public C194399Ss A0H;
    public AnonymousClass9bQ A0I;

    public String B9i(C166587yw r2) {
        return ((BrazilFbPayHubActivity) this).A08.A01(r2);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        return ((BrazilFbPayHubActivity) this).A09.A00(bundle, this, i);
    }

    public void Brm(List list) {
        AnonymousClass948 r0 = this.A0F;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        C192759Ll.A00(this.A04);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A012 = C1899693i.A01(this, R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
            C1899593h.A0j(this, supportActionBar, A012);
        }
        this.A01 = findViewById(R.id.payment_methods_container);
        this.A02 = findViewById(R.id.p2p_onboarding_nudge_container);
        findViewById(R.id.p2p_onboarding_nudge_button).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        this.A0F = new AnonymousClass948(brazilFbPayHubActivity, brazilFbPayHubActivity.A08, brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A04 = listView;
        listView.setAdapter(this.A0F);
        AnonymousClass4FS r8 = this.A04;
        AnonymousClass9U4 r7 = this.A0D;
        AnonymousClass2T7 r20 = new AnonymousClass2T7();
        C620933l r15 = this.A0A;
        C1906899l r12 = this.A07;
        AnonymousClass9U5 r6 = this.A0C;
        AnonymousClass9b0 r3 = this.A0E;
        C1906999m r13 = this.A08;
        C29271iY r16 = this.A0B;
        AnonymousClass9U5 r17 = r6;
        AnonymousClass9U4 r18 = r7;
        AnonymousClass9b0 r19 = r3;
        AnonymousClass9bQ r9 = new AnonymousClass9bQ(this, this.A06, r12, r13, this.A09, r15, r16, r17, r18, r19, r20, this, this, new C197499dH(), r8, (String) null, false);
        this.A0I = r9;
        r9.A01(false, false);
        this.A04.setOnItemClickListener(new C204329pB(this, 0));
        findViewById(R.id.add_new_account).setOnClickListener(this);
        C107335b8.A0E(C86654Ky.A0M(this, R.id.change_pin_icon), A012);
        C107335b8.A0E(C86654Ky.A0M(this, R.id.add_new_account_icon), A012);
        C107335b8.A0E(C86654Ky.A0M(this, R.id.fingerprint_setting_icon), A012);
        C107335b8.A0E(C86654Ky.A0M(this, R.id.delete_payments_account_icon), A012);
        C107335b8.A0E(C86654Ky.A0M(this, R.id.request_payment_account_info_icon), A012);
        this.A03 = findViewById(R.id.pin_container);
        this.A00 = findViewById(R.id.fingerprint_container);
        this.A05 = (SwitchCompat) findViewById(R.id.toggle_fingerprint);
        AnonymousClass4FS r92 = brazilFbPayHubActivity.A04;
        AnonymousClass9U4 r82 = brazilFbPayHubActivity.A0D;
        AnonymousClass9VB r72 = brazilFbPayHubActivity.A04;
        AnonymousClass9bR r62 = brazilFbPayHubActivity.A00;
        AnonymousClass9TR r5 = brazilFbPayHubActivity.A05;
        AnonymousClass9S2 r11 = new AnonymousClass9S2(brazilFbPayHubActivity, r62, brazilFbPayHubActivity.A01, r82, brazilFbPayHubActivity.A03, r72, r5, r92);
        this.A0G = r11;
        AnonymousClass9W3 r63 = r11.A05;
        boolean A062 = r63.A00.A06();
        boolean z = false;
        AnonymousClass9BY r32 = (AnonymousClass9BY) r11.A08;
        if (A062) {
            r32.A00.setVisibility(0);
            if (r63.A01() == 1) {
                z = true;
            }
            r32.A05.setChecked(z);
            r11.A00 = true;
        } else {
            r32.A00.setVisibility(8);
        }
        C204249p3.A02(findViewById(R.id.change_pin), this, 20);
        C204249p3.A02(this.A00, this, 21);
        this.A0H = brazilFbPayHubActivity.A09;
        C203969ob.A00(findViewById(R.id.delete_payments_account_action), this, 4);
        C203969ob.A00(findViewById(R.id.request_dyi_report_action), this, 5);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_new_account || view.getId() == R.id.p2p_onboarding_nudge_button) {
            BMA(AnonymousClass000.A1T(this.A0F.getCount()));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9bQ r2 = this.A0I;
        AnonymousClass9H0 r1 = r2.A02;
        if (r1 != null) {
            r1.A0D(true);
        }
        r2.A02 = null;
        AnonymousClass4DI r12 = r2.A00;
        if (r12 != null) {
            r2.A09.A07(r12);
        }
    }

    public void onResume() {
        super.onResume();
        this.A0I.A00(true);
        AnonymousClass9S2 r4 = this.A0G;
        boolean A032 = r4.A07.A03();
        boolean z = false;
        AnonymousClass9BY r2 = (AnonymousClass9BY) r4.A08;
        if (A032) {
            r2.A03.setVisibility(0);
            AnonymousClass9W3 r1 = r4.A05;
            if (r1.A00.A06()) {
                r4.A00 = false;
                if (r1.A01() == 1) {
                    z = true;
                }
                r2.A05.setChecked(z);
                r4.A00 = true;
                return;
            }
            return;
        }
        r2.A03.setVisibility(8);
    }

    public /* synthetic */ String B9j(C166587yw r2) {
        return null;
    }

    public Dialog onCreateDialog(int i) {
        return ((BrazilFbPayHubActivity) this).A09.A00((Bundle) null, this, i);
    }
}
