package com.whatsapp.businessdirectory.util;

import X.AnonymousClass0GH;
import X.AnonymousClass93D;
import X.C004805c;
import X.C107405bG;
import X.C111095hX;
import X.C150067Pa;
import X.C15110qn;
import X.C162457s7;
import X.C166477yk;
import X.C180278km;
import X.C622534h;
import X.C95874ug;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

public final class FacebookMapPreview implements C15110qn {
    public C95874ug A00;
    public final C180278km A01;

    public FacebookMapPreview(ViewGroup viewGroup, C180278km r6, C166477yk r7, C622534h r8) {
        C162457s7.A0J(viewGroup, 1);
        this.A01 = r6;
        Activity A04 = C111095hX.A04(viewGroup);
        C162457s7.A0K(A04, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C004805c r3 = (C004805c) A04;
        r8.A03(r3);
        C150067Pa r2 = new C150067Pa();
        r2.A00 = 8;
        r2.A08 = false;
        r2.A05 = false;
        r2.A07 = false;
        r2.A02 = r7;
        r2.A06 = C107405bG.A0D(r3);
        r2.A04 = "whatsapp_smb_business_discovery";
        C95874ug r1 = new C95874ug(r3, r2);
        this.A00 = r1;
        r1.A0E((Bundle) null);
        r3.A06.A00(this);
        viewGroup.addView(this.A00);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_CREATE)
    private final void onCreate() {
        C95874ug r2 = this.A00;
        r2.A0E((Bundle) null);
        r2.A0J(new AnonymousClass93D(this, 0));
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_DESTROY)
    private final void onDestroy() {
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_PAUSE)
    private final void onPause() {
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_RESUME)
    private final void onResume() {
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_START)
    private final void onStart() {
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_STOP)
    private final void onStop() {
    }
}
