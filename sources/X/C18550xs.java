package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* renamed from: X.0xs  reason: invalid class name and case insensitive filesystem */
public class C18550xs extends ContextWrapper {
    public LayoutInflater A00;
    public final C1222963v A01;
    public final C18570xu A02;
    public final C620733j A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18550xs(android.content.Context r3, X.C1222963v r4, X.C620733j r5) {
        /*
            r2 = this;
            boolean r0 = X.C620733j.A0B
            if (r0 != 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r3)
            java.util.Locale r1 = r0.locale
            java.util.Locale r0 = r5.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            java.util.Locale r0 = r5.A04
            r1.setLocale(r0)
            android.content.Context r3 = r3.createConfigurationContext(r1)
        L_0x0022:
            r2.<init>(r3)
            r2.A03 = r5
            r2.A01 = r4
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r0 = r0.getResources()
            boolean r1 = r0 instanceof X.C18570xu
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r0 = r0.getResources()
            if (r1 == 0) goto L_0x0042
            X.0xu r0 = (X.C18570xu) r0
        L_0x003f:
            r2.A02 = r0
            return
        L_0x0042:
            X.0xu r0 = X.C18570xu.A02(r0, r5)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18550xs.<init>(android.content.Context, X.63v, X.33j):void");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        AnonymousClass4NA r2 = new AnonymousClass4NA(this, LayoutInflater.from(getBaseContext()), ((C111365hy) this.A01).A00);
        this.A00 = r2;
        return r2;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return new C18550xs(super.createConfigurationContext(configuration), this.A01, this.A03);
    }

    public Resources getResources() {
        return this.A02;
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C621633u.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void startActivity(Intent intent) {
        C621633u.A03(intent);
        super.startActivity(intent);
    }

    public void sendBroadcast(Intent intent, String str) {
        C621633u.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }

    public void sendBroadcast(Intent intent) {
        C621633u.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C621633u.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }
}
