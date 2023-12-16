package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver;

/* renamed from: X.2lE  reason: invalid class name and case insensitive filesystem */
public class C52282lE {
    public ComponentName A00;
    public ComponentName A01;
    public final C54292oU A02;

    public int A00() {
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A01;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionPreferenceStateReceiver.class);
            this.A01 = componentName;
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        C18260x0.A0w("CompanionStateHolder/getCompanionPreferenceState/state=", AnonymousClass001.A0o(), componentEnabledSetting);
        return componentEnabledSetting;
    }

    public C52282lE(C54292oU r1) {
        this.A02 = r1;
    }

    public void A01(int i) {
        C18260x0.A0w("CompanionStateHolder/setCompanionPreferenceState/state=", AnonymousClass001.A0o(), i);
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A01;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionPreferenceStateReceiver.class);
            this.A01 = componentName;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
    }

    public void A02(boolean z) {
        C18260x0.A1D("CompanionStateHolder/setCompanionLogoutState/state=", AnonymousClass001.A0o(), z);
        int A012 = C18280x3.A01(z ? 1 : 0);
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A00;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionLogoutStateReceiver.class);
            this.A00 = componentName;
        }
        packageManager.setComponentEnabledSetting(componentName, A012, 1);
    }
}
