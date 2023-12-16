package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.3Fm  reason: invalid class name and case insensitive filesystem */
public class C64913Fm implements AnonymousClass664 {
    public final Context A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass4FV A02;

    public void BQV() {
        ActivityInfo activityInfo;
        if (this.A01.A0Y(C58422vE.A02, 3085)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PIDSCN");
            C18260x0.A1J(A0o, ": collect");
            Intent A07 = C18320x8.A07();
            A07.setAction("com.facebook.GET_PHONE_ID");
            Context context = this.A00;
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(A07, 0);
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C107385bE.A06()) {
                i = 134217728;
            }
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        AnonymousClass1Z5 r2 = new AnonymousClass1Z5();
                        r2.A00 = packageManager.getApplicationLabel(next.activityInfo.applicationInfo).toString();
                        r2.A01 = next.activityInfo.packageName;
                        r2.A03 = AnonymousClass35C.A01(packageInfo);
                        r2.A02 = C627236i.A02(packageInfo.applicationInfo.publicSourceDir);
                        this.A02.BhA(r2);
                        StringBuilder A0l = AnonymousClass000.A0l("PIDSCN");
                        A0l.append(": ");
                        A0l.append(r2.A01);
                        A0l.append(", NAME: ");
                        A0l.append(r2.A00);
                        A0l.append(", CERT: ");
                        A0l.append(r2.A03);
                        A0l.append(", SHA: ");
                        C18260x0.A1J(A0l, r2.A02);
                    } catch (PackageManager.NameNotFoundException e) {
                        StringBuilder A0l2 = AnonymousClass000.A0l("PIDSCN");
                        A0l2.append(": cannot find ");
                        A0l2.append(next.activityInfo.packageName);
                        C18260x0.A1P(A0l2, " ", e);
                    }
                }
            }
        }
    }

    public C64913Fm(Context context, AnonymousClass1VX r2, AnonymousClass4FV r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BDW() {
        return "PIDSCN";
    }
}
