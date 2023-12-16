package com.whatsapp.extensions.webview;

import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass30V;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C08270df;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C58422vE;
import X.C626936e;
import X.C64333Db;
import X.C69993Zl;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

public final class WaFlowsWebViewBottomsheetModalActivity extends C89644eZ {
    public AnonymousClass30V A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = (AnonymousClass30V) A002.ANL.get();
        }
    }

    public void A66() {
        if (this.A0D.A0Y(C58422vE.A02, 6715)) {
            AnonymousClass30V r4 = this.A00;
            if (r4 != null) {
                r4.A03(C95814uZ.A00.A05(getIntent().getStringExtra("chat_id")), 63);
            } else {
                throw C18270x1.A0S("navigationTimeSpentManager");
            }
        }
        super.A66();
    }

    public void onDestroy() {
        C69993Zl.A00(this.A04, this, 19);
        super.onDestroy();
    }

    public WaFlowsWebViewBottomsheetModalActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 61);
    }

    public boolean A6C() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        setContentView((int) R.layout.f8nameremoved);
        getWindow().setStatusBarColor(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = new FlowsWebBottomSheetContainer();
        Bundle A08 = AnonymousClass002.A08();
        C18310x6.A0z(intent, A08, "screen_params");
        C18310x6.A0z(intent, A08, "chat_id");
        C18310x6.A0z(intent, A08, "flow_id");
        A08.putAll(intent.getExtras());
        flowsWebBottomSheetContainer.A0u(A08);
        C08270df supportFragmentManager = getSupportFragmentManager();
        C626936e.A06(supportFragmentManager);
        flowsWebBottomSheetContainer.A1O(supportFragmentManager, "extensions_bottom_sheet_container");
    }

    public WaFlowsWebViewBottomsheetModalActivity() {
        this(0);
    }
}
