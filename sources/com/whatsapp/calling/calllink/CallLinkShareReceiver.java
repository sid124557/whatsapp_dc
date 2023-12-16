package com.whatsapp.calling.calllink;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass5Z0;
import X.C107305b5;
import X.C107575bX;
import X.C626936e;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

public class CallLinkShareReceiver extends BroadcastReceiver {
    public AnonymousClass5Z0 A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = AnonymousClass2A1.A00(context).AJu();
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!C107575bX.A0F(packageName)) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (charSequence != null) {
                        packageName = charSequence;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                if (!intent.hasExtra("extra_entry_point")) {
                    str = "CallLinkShareReceiver/onReceive entryPoint extra not available";
                } else if (!intent.hasExtra("extra_is_video")) {
                    str = "CallLinkShareReceiver/onReceive isVideo extra not available";
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("extra_is_video", false);
                    int intExtra = intent.getIntExtra("extra_entry_point", 0);
                    AnonymousClass5Z0 r2 = this.A00;
                    r2.A01.BhD(C107305b5.A02(packageName, 2, intExtra, booleanExtra));
                    return;
                }
                C626936e.A0D(false, str);
            }
        }
    }

    public CallLinkShareReceiver(int i) {
        this.A02 = false;
        this.A01 = AnonymousClass002.A0D();
    }

    public CallLinkShareReceiver() {
        this(0);
    }
}
