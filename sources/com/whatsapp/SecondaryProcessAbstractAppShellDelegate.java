package com.whatsapp;

import X.AnonymousClass25i;
import X.AnonymousClass2VW;
import X.AnonymousClass3DO;
import X.AnonymousClass47u;
import X.C107695bk;
import X.C389229y;
import X.C626936e;
import X.C64333Db;
import X.C70173a4;
import android.content.Context;
import android.content.res.Configuration;
import com.whatsapp.util.Log;

public class SecondaryProcessAbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_WHATSAPP_LIB_NAME = "whatsapp";
    public static final String TAG = "SecondaryProcessAbstractAppShellDelegate";
    public final Context appContext;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(AnonymousClass47u r5) {
        C107695bk r3 = ((C64333Db) r5).AcK.A00;
        installAnrDetector((AnonymousClass2VW) r3.A03.get(), new AnonymousClass25i(), r3.AQE());
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
        Log.i("SecondaryProcessAbstractAppShellDelegate/onCreate");
        AnonymousClass47u r3 = (AnonymousClass47u) C389229y.A02(this.appContext, AnonymousClass47u.class);
        ((AnonymousClass3DO) ((C64333Db) r3).AcK.A00.AAK.get()).A01(new C70173a4(r3, 26, this), "anr_detector_secondary_process");
        C626936e.A01 = false;
    }

    public SecondaryProcessAbstractAppShellDelegate(Context context) {
        this.appContext = context;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installAnrDetector(X.AnonymousClass2VW r4, X.AnonymousClass25i r5, X.C42962Qf r6) {
        /*
            r3 = this;
            java.lang.String r2 = "whatsapp"
            java.lang.String r1 = "SecondaryProcessAbstractAppShellDelegate/installAnrDetector/exception"
            android.content.Context r0 = r3.appContext     // Catch:{ IOException -> 0x001e }
            X.C155137eL.A00(r0)     // Catch:{ IOException -> 0x001e }
            android.content.Context r0 = r3.appContext     // Catch:{  }
            boolean r0 = X.AnonymousClass34Z.A01(r0, r2)     // Catch:{  }
            if (r0 != 0) goto L_0x0017
            android.content.Context r0 = r3.appContext     // Catch:{  }
            com.whatsapp.nativelibloader.WhatsAppLibLoader.A00(r0, r2)     // Catch:{  }
        L_0x0017:
            r4.A00()
            com.whatsapp.wamsys.JniBridge.setDependencies(r6)
            return
        L_0x001e:
            r0 = move-exception
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SecondaryProcessAbstractAppShellDelegate.installAnrDetector(X.2VW, X.25i, X.2Qf):void");
    }
}
