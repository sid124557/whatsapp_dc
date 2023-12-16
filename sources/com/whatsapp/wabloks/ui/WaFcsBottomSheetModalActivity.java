package com.whatsapp.wabloks.ui;

import X.AnonymousClass002;
import X.AnonymousClass49F;
import X.AnonymousClass49G;
import X.AnonymousClass7UQ;
import X.AnonymousClass9RA;
import X.C08270df;
import X.C162457s7;
import X.C18270x1;
import X.C1899693i;
import X.C1905097c;
import X.C191959Hf;
import X.C197919e5;
import X.C200799iu;
import X.C203789oJ;
import X.C204149ot;
import X.C44122Ut;
import X.C47382dA;
import X.C54522or;
import X.C60482yd;
import X.C626936e;
import X.C84704Dj;
import X.C84734Dm;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Map;
import java.util.Queue;

public class WaFcsBottomSheetModalActivity extends C1905097c implements C84704Dj, C84734Dm, C203789oJ {
    public C44122Ut A00;
    public AnonymousClass7UQ A01;
    public C54522or A02;
    public C60482yd A03;
    public FcsBottomSheetBaseContainer A04;
    public Map A05;

    public C47382dA BEP() {
        return C1899693i.A09(this, getSupportFragmentManager(), this.A00, this.A05);
    }

    public void Bnc(boolean z) {
        this.A04.Bnc(z);
    }

    public void Brn(AnonymousClass49G r4) {
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A04;
        AnonymousClass9RA r2 = fcsBottomSheetBaseContainer.A0F;
        if (r2 != null) {
            C200799iu r1 = new C200799iu(r4, fcsBottomSheetBaseContainer);
            if (r2.A00) {
                r2.A01.add(r1);
            } else {
                r1.run();
            }
        } else {
            throw C18270x1.A0S("bkPendingScreenTransitionCallbacks");
        }
    }

    public void Bro(AnonymousClass49F r5, AnonymousClass49G r6, boolean z) {
        Toolbar toolbar;
        ProgressBar progressBar;
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A04;
        C191959Hf r0 = fcsBottomSheetBaseContainer.A0I;
        if (r0 != null) {
            r0.A00(r5, r6);
        }
        if (z && (toolbar = fcsBottomSheetBaseContainer.A05) != null) {
            Menu menu = toolbar.getMenu();
            C162457s7.A0D(menu);
            MenuInflater menuInflater = fcsBottomSheetBaseContainer.A0R().getMenuInflater();
            C162457s7.A0D(menuInflater);
            fcsBottomSheetBaseContainer.A0y(menu, menuInflater);
            Menu menu2 = toolbar.getMenu();
            C162457s7.A0D(menu2);
            if (menu2.size() == 0 && (progressBar = fcsBottomSheetBaseContainer.A04) != null) {
                progressBar.setVisibility(4);
            }
        }
    }

    public void A5R() {
        super.A5R();
        FdsContentFragmentManager fdsContentFragmentManager = this.A04.A0G;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (!queue.isEmpty()) {
                    ((Runnable) queue.remove()).run();
                } else {
                    return;
                }
            }
        }
    }

    public FcsBottomSheetBaseContainer A74() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fds_observer_id");
        String stringExtra2 = intent.getStringExtra("fds_on_back");
        String stringExtra3 = intent.getStringExtra("fds_on_back_params");
        String stringExtra4 = intent.getStringExtra("fds_button_style");
        String stringExtra5 = intent.getStringExtra("fds_state_name");
        int intExtra = intent.getIntExtra("fcs_bottom_sheet_max_height_percentage", 100);
        boolean booleanExtra = intent.getBooleanExtra("fcs_show_divider_under_nav_bar", false);
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = new FcsBottomSheetBaseContainer();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("fds_observer_id", stringExtra);
        A08.putString("fds_on_back", stringExtra2);
        A08.putString("fds_on_back_params", stringExtra3);
        A08.putString("fds_button_style", stringExtra4);
        A08.putString("fds_state_name", stringExtra5);
        A08.putInt("fcs_bottom_sheet_max_height_percentage", intExtra);
        A08.putBoolean("fcs_show_divider_under_nav_bar", booleanExtra);
        fcsBottomSheetBaseContainer.A0u(A08);
        return fcsBottomSheetBaseContainer;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(getResources().getColor(R.color.f5nameremoved));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        C54522or A022 = this.A03.A02(getIntent().getStringExtra("fds_observer_id"));
        this.A02 = A022;
        A022.A00(new C204149ot(this, 9), C197919e5.class, this);
        FcsBottomSheetBaseContainer A74 = A74();
        this.A04 = A74;
        C08270df supportFragmentManager = getSupportFragmentManager();
        C626936e.A06(supportFragmentManager);
        A74.A1O(supportFragmentManager, "fds_bottom_sheet_container");
    }

    public void onDestroy() {
        super.onDestroy();
        C54522or r0 = this.A02;
        if (r0 != null) {
            r0.A03(this);
        }
        this.A02 = null;
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        FdsContentFragmentManager fdsContentFragmentManager = this.A04.A0G;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FdsContentFragmentManager fdsContentFragmentManager = this.A04.A0G;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = false;
        }
    }

    public AnonymousClass7UQ B4k() {
        return this.A01;
    }

    public void Bnb(boolean z) {
    }
}
