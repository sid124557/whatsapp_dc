package com.whatsapp.wabloks.base;

import X.AnonymousClass10r;
import X.AnonymousClass4UC;
import X.C06270Wx;
import X.C183538qC;
import X.C29441ip;
import X.C46202bF;
import X.C626936e;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class GenericBkLayoutViewModel extends AnonymousClass10r {
    public final C29441ip A00;
    public final AnonymousClass4UC A01 = new AnonymousClass4UC();

    public boolean A0F(C46202bF r4) {
        int i;
        int i2 = r4.A00;
        if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            if (this.A00.A0F()) {
                Log.d("BkLayoutViewModel: Unexpected error");
                i = R.string.f11nameremoved;
            } else {
                Log.d("BkLayoutViewModel: Network error");
                i = R.string.f11nameremoved;
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            C06270Wx.A03(this.A01, i);
            return false;
        }
        Log.d("BkLayoutViewModel: Error status unknown");
        C626936e.A0D(false, "BkLayoutViewModel: invalid error status");
        return false;
    }

    public GenericBkLayoutViewModel(C29441ip r2, C183538qC r3) {
        super(r3);
        this.A00 = r2;
    }
}
