package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.2fQ  reason: invalid class name and case insensitive filesystem */
public final class C48762fQ {
    public final C56612sH A00;
    public final C54292oU A01;

    public final void A00(BroadcastReceiver broadcastReceiver, Bundle bundle, String str) {
        Intent A07 = C18320x8.A07();
        A07.setPackage("com.facebook.katana");
        A07.setAction(str);
        Context context = this.A01.A00;
        AnonymousClass29G.A00(context, A07);
        context.sendOrderedBroadcast(A07, (String) null, broadcastReceiver, (Handler) null, 1, (String) null, bundle);
    }

    public final boolean A01() {
        String str;
        StringBuilder sb;
        String str2;
        Log.i("FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication");
        Context context = this.A01.A00;
        if (AnonymousClass345.A00(context, "com.facebook.katana") == -1) {
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app not installed";
        } else {
            PackageManager packageManager = context.getPackageManager();
            C162457s7.A0D(packageManager);
            try {
                int i = 64;
                if (C107385bE.A06()) {
                    i = 134217728;
                }
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", i);
                if (packageInfo != null) {
                    if (!AnonymousClass0x9.A15(C18290x4.A12("ijxLJi1yGs1JpL-X1SExmchvork")).contains(AnonymousClass35C.A01(packageInfo))) {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app is not trusted";
                    } else if (AnonymousClass345.A00(context, "com.facebook.katana") >= 446613853) {
                        return true;
                    } else {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app version is old";
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                sb = AnonymousClass001.A0o();
                str2 = "FoaBackupTokenInterAppCommunicationManager/could not find package; packageName=";
                C18260x0.A0u(str2, "com.facebook.katana", sb, e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
                Log.i(str);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                sb = AnonymousClass001.A0o();
                str2 = "FoaBackupTokenInterAppCommunicationManager/failed to get package info for packageName=";
                C18260x0.A0u(str2, "com.facebook.katana", sb, e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
                Log.i(str);
                return false;
            }
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
        }
        Log.i(str);
        return false;
    }

    public C48762fQ(C56612sH r1, C54292oU r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
