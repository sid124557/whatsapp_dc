package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bM  reason: invalid class name and case insensitive filesystem */
public final class C46272bM {
    public final Context A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass3Au A03;
    public final AnonymousClass3At A04;

    public C46272bM(Context context, AnonymousClass33p r3, AnonymousClass1VX r4, AnonymousClass3Au r5, AnonymousClass3At r6) {
        C626936e.A06(context);
        this.A00 = context.getApplicationContext();
        C626936e.A06(r5);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void A00() {
        AnonymousClass4CC r0;
        ActivityInfo activityInfo;
        Intent A07 = C18320x8.A07();
        Context context = this.A00;
        C18320x8.A10(A07, context.getPackageName(), "com.facebook.phoneid.PhoneIdRequestReceiver");
        PendingIntent A002 = C624735e.A00(context, 0, A07, 201326592);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("auth", A002);
        if (this.A02.A0Y(C58422vE.A01, 3651)) {
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C107385bE.A06()) {
                i = 134217728;
            }
            Intent A072 = C18320x8.A07();
            A072.setAction("com.facebook.GET_PHONE_ID");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(A072, 0);
            ArrayList A0s = AnonymousClass001.A0s();
            String packageName = context.getPackageName();
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        String str = packageInfo.packageName;
                        if (!str.equals(packageName)) {
                            boolean A042 = AnonymousClass35C.A04(packageInfo);
                            if (!A042) {
                                if (C57762uA.A00().contains(AnonymousClass35C.A01(packageInfo))) {
                                }
                            }
                            A0s.add(new AnonymousClass5HB(str, A042));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("could not find package; packageName=");
                        A0o.append(next.activityInfo.packageName);
                        C18260x0.A1Q(A0o, " ", e);
                    }
                }
            }
            boolean A012 = C57762uA.A01(context);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass5HB r1 = (AnonymousClass5HB) it.next();
                String str2 = r1.A00;
                Intent A073 = C18320x8.A07();
                A073.setAction("com.facebook.GET_PHONE_ID");
                A073.setPackage(str2);
                if (r1.A01 || !A012) {
                    r0 = this.A03;
                } else {
                    r0 = this.A04;
                }
                context.sendOrderedBroadcast(A073, (String) null, new C18440xQ(r0), (Handler) null, 1, (String) null, A08);
            }
            return;
        }
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        ArrayList A0s2 = AnonymousClass001.A0s();
        String packageName2 = context.getPackageName();
        for (PackageInfo next2 : installedPackages) {
            if (!next2.packageName.equals(packageName2)) {
                try {
                    PackageManager packageManager2 = context.getPackageManager();
                    String str3 = next2.packageName;
                    int i2 = 64;
                    if (C107385bE.A06()) {
                        i2 = 134217728;
                    }
                    PackageInfo packageInfo2 = packageManager2.getPackageInfo(str3, i2);
                    if (AnonymousClass35C.A04(packageInfo2)) {
                        A0s2.add(packageInfo2.packageName);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("could not find package; packageName=");
                    C18260x0.A15(next2.packageName, A0o2, e2);
                }
            }
        }
        Iterator it2 = A0s2.iterator();
        while (it2.hasNext()) {
            String A0m = AnonymousClass001.A0m(it2);
            Intent A074 = C18320x8.A07();
            A074.setAction("com.facebook.GET_PHONE_ID");
            A074.setPackage(A0m);
            context.sendOrderedBroadcast(A074, (String) null, new C18440xQ(this.A03), (Handler) null, 1, (String) null, A08);
        }
    }
}
