package com.whatsapp.extensions.phoenix;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass3Zb;
import X.AnonymousClass4HY;
import X.C106405Yw;
import X.C162457s7;
import X.C18270x1;
import X.C197989eC;
import X.C54522or;
import X.C58422vE;
import X.C60482yd;
import X.C69323Wo;
import X.C85744Hl;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView;
import com.whatsapp.extensions.phoenix.view.PhoenixExtensionsBottomSheetContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;

public final class PhoenixExtensionsBottomSheetActivity extends WaFcsBottomSheetModalActivity {
    public AnonymousClass30V A00;
    public boolean A01;
    public boolean A02;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0x9.A0K(this).ABN(this);
        }
    }

    public void A66() {
        if (this.A0D.A0Y(C58422vE.A02, 6715)) {
            AnonymousClass30V r4 = this.A00;
            if (r4 != null) {
                r4.A03(C106405Yw.A03(Jid.Companion.A03(getIntent().getStringExtra("extra_business_jid"))), 63);
            } else {
                throw C18270x1.A0S("navigationTimeSpentManager");
            }
        }
        super.A66();
    }

    public FcsBottomSheetBaseContainer A74() {
        AnonymousClass1VX r7 = this.A0D;
        C162457s7.A0C(r7);
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        String stringExtra2 = getIntent().getStringExtra("extra_business_jid");
        String stringExtra3 = getIntent().getStringExtra("flow_id");
        PhoenixExtensionsBottomSheetContainer phoenixExtensionsBottomSheetContainer = new PhoenixExtensionsBottomSheetContainer();
        Bundle A0F = AnonymousClass0x7.A0F("fds_observer_id", stringExtra);
        A0F.putString("business_jid", stringExtra2);
        A0F.putString("flow_id", stringExtra3);
        A0F.putInt("fcs_bottom_sheet_max_height_percentage", r7.A0O(C58422vE.A02, 3319));
        A0F.putBoolean("fcs_show_divider_under_nav_bar", true);
        phoenixExtensionsBottomSheetContainer.A0u(A0F);
        return phoenixExtensionsBottomSheetContainer;
    }

    public PhoenixExtensionsBottomSheetActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 60);
    }

    public boolean A6C() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C54522or r2 = this.A02;
        if (r2 != null) {
            r2.A00(new C85744Hl(this, 3), C69323Wo.class, r2);
            r2.A00(new C85744Hl(this, 4), C197989eC.class, r2);
        }
    }

    public void onDestroy() {
        String stringExtra = getIntent().getStringExtra("fds_observer_id");
        if (stringExtra != null) {
            synchronized (this.A03) {
                C60482yd.A03.remove(stringExtra);
            }
        }
        this.A04.BkM(new AnonymousClass3Zb(this));
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        PhoenixExtensionsBottomSheetContainer phoenixExtensionsBottomSheetContainer;
        super.onResume();
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A04;
        if (fcsBottomSheetBaseContainer instanceof PhoenixExtensionsBottomSheetContainer) {
            phoenixExtensionsBottomSheetContainer = (PhoenixExtensionsBottomSheetContainer) fcsBottomSheetBaseContainer;
        } else {
            phoenixExtensionsBottomSheetContainer = null;
        }
        String stringExtra = getIntent().getStringExtra("extra_error_message");
        if (phoenixExtensionsBottomSheetContainer != null) {
            ExtensionsInitialLoadingView extensionsInitialLoadingView = phoenixExtensionsBottomSheetContainer.A02;
            if (extensionsInitialLoadingView != null) {
                extensionsInitialLoadingView.setErrorMessage(stringExtra);
            }
            phoenixExtensionsBottomSheetContainer.A1Y();
        }
    }

    public PhoenixExtensionsBottomSheetActivity() {
        this(0);
    }
}
