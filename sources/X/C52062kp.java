package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.2kp  reason: invalid class name and case insensitive filesystem */
public class C52062kp {
    public final C54292oU A00;
    public final AnonymousClass2MP A01;

    public C54742pD A01(String str) {
        Context context = this.A00.A00;
        int i = context.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A02 = AnonymousClass35C.A02(AnonymousClass35C.A00(context.getPackageManager(), str));
        return new C54742pD(str, A02, i, AnonymousClass000.A1S(this.A01.A01.contains(Pair.create(str, A02)) ? 1 : 0));
    }

    public C52062kp(C54292oU r1, AnonymousClass2MP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C54742pD A00() {
        int length;
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            Context context = this.A00.A00;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
                throw new SecurityException(AnonymousClass000.A0Y("No packages associated with uid: ", AnonymousClass001.A0o(), callingUid));
            } else if (length == 1) {
                String str = packagesForUid[0];
                String A02 = AnonymousClass35C.A02(AnonymousClass35C.A00(context.getPackageManager(), str));
                return new C54742pD(str, A02, callingUid, AnonymousClass000.A1S(this.A01.A01.contains(Pair.create(str, A02)) ? 1 : 0));
            } else {
                throw new SecurityException(AnonymousClass000.A0Y("Multiple packages per uid are not supported, uid: ", AnonymousClass001.A0o(), callingUid));
            }
        } else {
            throw AnonymousClass001.A0e("This method should be called on behalf of an IPC transaction from binder thread");
        }
    }

    public C54742pD A02(String str) {
        try {
            C54742pD A012 = A01(str);
            A012.A00();
            return A012;
        } catch (PackageManager.NameNotFoundException e) {
            throw new SecurityException(AnonymousClass000.A0V("Package not found: ", str, AnonymousClass001.A0o()), e);
        }
    }
}
