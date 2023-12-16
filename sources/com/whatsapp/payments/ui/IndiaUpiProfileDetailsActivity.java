package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass303;
import X.AnonymousClass4L0;
import X.AnonymousClass5V0;
import X.AnonymousClass6C7;
import X.AnonymousClass95E;
import X.AnonymousClass97T;
import X.AnonymousClass9AE;
import X.AnonymousClass9DA;
import X.AnonymousClass9OL;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C136986na;
import X.C153527bU;
import X.C160757oG;
import X.C166157yE;
import X.C166557yt;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C194259Se;
import X.C197109ca;
import X.C204019og;
import X.C204219p0;
import X.C204249p3;
import X.C204749pr;
import X.C205049qL;
import X.C40602Ha;
import X.C621433s;
import X.C64333Db;
import X.C69263Wi;
import X.C86654Ky;
import X.C88834as;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import java.util.List;

public class IndiaUpiProfileDetailsActivity extends AnonymousClass9DA {
    public ImageView A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public ConstraintLayout A0B;
    public RecyclerView A0C;
    public C166557yt A0D;
    public AnonymousClass9AE A0E;
    public C136986na A0F;
    public C153527bU A0G;
    public IndiaUpiNumberSettingsViewModel A0H;
    public C194259Se A0I;
    public Boolean A0J;
    public String A0K;
    public boolean A0L;
    public final C160757oG A0M;

    public void A5r() {
        if (!this.A0L) {
            this.A0L = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r2 = A0I2.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I2, r2, r1, this);
            AnonymousClass97T.A0i(A0I2, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A0I = C1899593h.A0Q(r2);
            this.A0G = (C153527bU) r1.A6Q.get();
        }
    }

    public final void A7W() {
        C166157yE A002;
        if (A7a(12) && (A002 = this.A0G.A00()) != null) {
            IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = this.A0H;
            C136986na r5 = this.A0F;
            indiaUpiNumberSettingsViewModel.A0D(this.A0M.A04(), this.A0D, A002, r5, this.A0M.A0C(), "active");
        }
    }

    public void A7Y(boolean z) {
        this.A02.setVisibility(8);
        this.A05.setVisibility(8);
        this.A0B.setVisibility(8);
        List A012 = this.A0G.A01();
        C166157yE A002 = this.A0G.A00();
        if (!z && A002 != null) {
            A012.remove(A002);
        }
        int size = A012.size();
        int i = 0;
        RecyclerView recyclerView = this.A0C;
        if (size == 0) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
        this.A0C.setAdapter(new AnonymousClass95E(new AnonymousClass9OL(this, A012), this, A012));
        boolean A062 = this.A0G.A06();
        LinearLayout linearLayout = this.A01;
        if (A062) {
            if (A002 != null) {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = this.A03;
                if (z) {
                    i = 8;
                }
                linearLayout2.setVisibility(i);
                this.A01.setEnabled(!z);
            } else if (!this.A0G.A05()) {
                i = 8;
            }
        }
        linearLayout.setVisibility(i);
        this.A03.setVisibility(8);
        this.A01.setEnabled(!z);
    }

    public final boolean A7Z() {
        String A0Q = this.A0D.A0Q(2965);
        if (!TextUtils.isEmpty(A0Q)) {
            List A0t = C18310x6.A0t(A0Q);
            String A072 = this.A0M.A07();
            if (!TextUtils.isEmpty(A072)) {
                return A0t.contains(A072);
            }
        }
        return false;
    }

    public final boolean A7a(int i) {
        if (!this.A0M.A0Q()) {
            return true;
        }
        Intent A052 = C1899593h.A05(this);
        A052.putExtra("extra_payments_entry_type", i);
        A052.putExtra("extra_skip_value_props_display", false);
        A052.putExtra("extra_referral_screen", "payments_profile");
        A052.putExtra("extra_payment_name", this.A0D);
        A7O(A052);
        startActivity(A052);
        return false;
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass303 r8;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A0D = (C166557yt) getIntent().getParcelableExtra("extra_payment_name");
        this.A0K = C1899593h.A0a(this);
        this.A0J = Boolean.valueOf(getIntent().getBooleanExtra("extra_mapper_recover_alias", false));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        this.A0M.A06("onCreate");
        C69263Wi r7 = this.A05;
        C194259Se r12 = this.A0I;
        AnonymousClass9U1 r82 = this.A0L;
        AnonymousClass9U5 r10 = this.A0M;
        C197109ca r11 = this.A0S;
        C40602Ha r9 = this.A0K;
        this.A0E = new AnonymousClass9AE(this, r7, r82, r9, r10, r11, r12);
        this.A0F = new C136986na(this, r7, this.A0H, r82, r9, r10, r12);
        TextView A0L2 = C18310x6.A0L(this, R.id.profile_name);
        this.A0A = A0L2;
        A0L2.setText((CharSequence) C1899593h.A0X(this.A0D));
        TextView A0L3 = C18310x6.A0L(this, R.id.profile_vpa);
        this.A09 = A0L3;
        A0L3.setText((CharSequence) this.A0M.A04().A00);
        this.A05 = (LinearLayout) findViewById(R.id.set_up_upi_number_container);
        this.A08 = C18310x6.A0L(this, R.id.upi_number_text);
        this.A07 = C18310x6.A0L(this, R.id.upi_number_subtext);
        this.A00 = C86654Ky.A0M(this, R.id.linked_number_image);
        this.A02 = (LinearLayout) findViewById(R.id.linked_upi_number_container);
        this.A04 = (LinearLayout) findViewById(R.id.remove_upi_number_container);
        this.A0B = (ConstraintLayout) findViewById(R.id.shimmer_layout_row);
        this.A06 = (LinearLayout) findViewById(R.id.setup_upi_numbers_container_phase2);
        this.A01 = (LinearLayout) findViewById(R.id.add_upi_number_container_phase2);
        this.A0C = (RecyclerView) findViewById(R.id.upi_numbers_list_phase2);
        this.A03 = (LinearLayout) findViewById(R.id.recover_upi_number_container);
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) AnonymousClass4L0.A0F(new C204749pr(this, 1), this).A01(IndiaUpiNumberSettingsViewModel.class);
        this.A0H = indiaUpiNumberSettingsViewModel;
        C205049qL.A02(this, indiaUpiNumberSettingsViewModel.A00, 37);
        C204249p3.A02(this.A04, this, 86);
        C204249p3.A02(this.A05, this, 87);
        C204249p3.A02(this.A01, this, 88);
        C204249p3.A02(this.A03, this, 89);
        if (bundle == null && this.A0J.booleanValue()) {
            A7Y(true);
            A7W();
        }
        if (!A7Z()) {
            A7X(false);
        } else if (!this.A0J.booleanValue()) {
            A7Y(false);
        }
        if (A7Z()) {
            r8 = A7V();
        } else {
            r8 = null;
        }
        this.A0S.BKE(r8, 0, (Integer) null, "payments_profile", this.A0K);
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        if (i == 28) {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            C204219p0.A01(r2, this, 58, R.string.f11nameremoved);
        } else if (i != 38) {
            return super.onCreateDialog(i);
        } else {
            this.A0S.BKB(C18290x4.A0Z(), (Integer) null, "alias_remove_confirm_dialog", "payments_profile");
            r2 = AnonymousClass5V0.A00(this);
            r2.A0U(R.string.f11nameremoved);
            r2.A0T(R.string.f11nameremoved);
            C204219p0.A01(r2, this, 59, R.string.f11nameremoved);
            C204219p0.A00(r2, this, 60, R.string.f11nameremoved);
        }
        return r2.create();
    }

    public IndiaUpiProfileDetailsActivity(int i) {
        this.A0L = false;
        C204019og.A00(this, 85);
    }

    public final AnonymousClass303 A7V() {
        String str;
        AnonymousClass303 A0K2 = C1899593h.A0K();
        for (C166157yE r2 : this.A0G.A01()) {
            String str2 = r2.A03;
            if (str2.equals("numeric_id")) {
                str = "numeric_alias";
            } else if (str2.equals("mobile_number")) {
                str = "phone_num_alias";
            }
            A0K2.A03(str, r2.A02);
        }
        return A0K2;
    }

    public void A7X(boolean z) {
        int i;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (A7Z()) {
            A7Y(z);
            return;
        }
        this.A06.setVisibility(8);
        if (z) {
            this.A0B.setVisibility(0);
            this.A02.setVisibility(8);
            linearLayout = this.A05;
        } else {
            List A012 = this.A0G.A01();
            this.A0B.setVisibility(8);
            if (A012.size() == 0) {
                this.A02.setVisibility(8);
                linearLayout2 = this.A05;
            } else {
                C166157yE r2 = (C166157yE) A012.get(0);
                this.A05.setVisibility(8);
                this.A02.setVisibility(0);
                this.A08.setText((CharSequence) r2.A00.A00);
                TextView textView = this.A07;
                String str = r2.A02;
                boolean equals = str.equals("active_pending");
                if (equals) {
                    i = R.string.f11nameremoved;
                } else {
                    boolean equals2 = str.equals("deregistered_pending");
                    i = R.string.f11nameremoved;
                    if (equals2) {
                        i = R.string.f11nameremoved;
                    }
                }
                textView.setText(i);
                if (equals || str.equals("deregistered_pending")) {
                    this.A00.setImageResource(R.drawable.ic_auto_pay);
                    linearLayout = this.A04;
                } else {
                    this.A00.setImageResource(R.drawable.ic_settings_phone);
                    linearLayout2 = this.A04;
                }
            }
            linearLayout2.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0 && intent != null) {
            C621433s.A01(this, 28);
        }
    }

    public void onResume() {
        super.onResume();
        A7X(false);
    }

    public IndiaUpiProfileDetailsActivity() {
        this(0);
        this.A0M = C160757oG.A00("IndiaUpiProfileDetailsActivity", "onboarding", "IN");
    }
}
