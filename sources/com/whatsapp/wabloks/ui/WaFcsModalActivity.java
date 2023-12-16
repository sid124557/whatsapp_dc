package com.whatsapp.wabloks.ui;

import X.AnonymousClass9HU;
import X.C197999eD;
import X.C204149ot;
import X.C54522or;
import android.os.Bundle;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Queue;

public class WaFcsModalActivity extends AnonymousClass9HU {
    public FdsContentFragmentManager A00;

    public void A5R() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (queue.isEmpty()) {
                    break;
                }
                ((Runnable) queue.remove()).run();
            }
        }
        super.A5R();
    }

    public void onPause() {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = false;
        }
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        FdsContentFragmentManager fdsContentFragmentManager = this.A00;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A02 = false;
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C54522or r2 = this.A00;
        if (r2 != null) {
            r2.A00(new C204149ot(this, 10), C197999eD.class, this);
        }
    }
}
