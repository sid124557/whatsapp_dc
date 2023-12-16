package com.whatsapp.userban.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C53742na;
import X.C64333Db;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public class BanAppealActivity extends C89644eZ {
    public BanAppealViewModel A00;
    public String A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public BanAppealActivity(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 128);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A00 = (BanAppealViewModel) AnonymousClass0x9.A0H(this).A01(BanAppealViewModel.class);
        String stringExtra = getIntent().getStringExtra("appeal_request_token");
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        int A012 = C18320x8.A01(getIntent(), "launch_source");
        BanAppealViewModel banAppealViewModel = this.A00;
        if (stringExtra != null) {
            C18270x1.A0j(C18270x1.A03(banAppealViewModel.A09.A04), "support_ban_appeal_token", stringExtra);
        }
        if (intExtra >= 0) {
            C53742na r2 = banAppealViewModel.A09;
            C18260x0.A0y("BanAppealRepository/storeBanViolationType ", AnonymousClass001.A0o(), intExtra);
            C18270x1.A0h(C18270x1.A03(r2.A04), "support_ban_appeal_violation_type", intExtra);
        }
        banAppealViewModel.A00 = A012;
        if (bundle == null) {
            this.A00.A0E();
        } else {
            this.A01 = bundle.getString("first_fragment_tag_save_instance_state");
        }
        AnonymousClass1Ha.A21(this, this.A00.A0B, 197);
        AnonymousClass1Ha.A21(this, this.A00.A01, 198);
        AnonymousClass1Ha.A21(this, this.A00.A0A, 199);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("BanAppealActivity/onNewIntent");
        BanAppealViewModel banAppealViewModel = this.A00;
        if (banAppealViewModel.A00 == 4) {
            banAppealViewModel.A0E();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("first_fragment_tag_save_instance_state", this.A01);
    }

    public void onStart() {
        super.onStart();
        this.A00.A05.A05(42, "BanAppealActivity");
    }

    public BanAppealActivity() {
        this(0);
    }
}
