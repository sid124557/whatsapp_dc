package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Vj  reason: invalid class name and case insensitive filesystem */
public final class C05890Vj {
    public final AnonymousClass0u5 A02(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return new C08210dZ(context);
        }
        List A01 = A01(context);
        if (A01.isEmpty()) {
            return null;
        }
        return A00(context, A01);
    }

    public static final AnonymousClass0u5 A00(Context context, List list) {
        Iterator it = list.iterator();
        AnonymousClass0u5 r5 = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(AnonymousClass001.A0m(it)).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                C162457s7.A0K(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                AnonymousClass0u5 r1 = (AnonymousClass0u5) newInstance;
                if (!r1.isAvailableOnDevice()) {
                    continue;
                } else if (r5 != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    r5 = r1;
                }
            } catch (Throwable unused) {
            }
        }
        return r5;
    }

    public static final List A01(Context context) {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList A0s = AnonymousClass001.A0s();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (!(bundle == null || (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) == null)) {
                    A0s.add(string);
                }
            }
        }
        return C73723fy.A0F(A0s);
    }
}
