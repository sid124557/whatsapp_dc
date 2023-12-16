package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.migration.export.api.ExportMigrationContentProvider;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.30Q  reason: invalid class name */
public class AnonymousClass30Q {
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final Context A01;
    public final PackageManager A02;
    public final C55682qk A03;
    public final C56612sH A04;
    public final C56022rI A05;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(2);
        A06 = timeUnit.toMillis(1);
    }

    public void A02() {
        C56022rI r0 = this.A05;
        long currentTimeMillis = System.currentTimeMillis();
        C183538qC r2 = r0.A02;
        C18270x1.A0i(AnonymousClass0x2.A0E(r2), "/export/provider_closed/timestamp", currentTimeMillis);
        C18270x1.A0g(AnonymousClass0x2.A0E(r2), "/export/provider/timestamp");
        PackageManager packageManager = this.A02;
        ComponentName componentName = this.A00;
        packageManager.setComponentEnabledSetting(componentName, 0, 1);
        if (AnonymousClass001.A1T(packageManager.getComponentEnabledSetting(componentName))) {
            this.A03.A0A("xpm-provider-disable-failed", false, A01());
        }
    }

    public AnonymousClass30Q(Context context, C55682qk r4, C56612sH r5, C56022rI r6) {
        this.A04 = r5;
        this.A01 = context;
        this.A02 = context.getPackageManager();
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = new ComponentName(context, ExportMigrationContentProvider.class);
    }

    public String A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long A0B = AnonymousClass0x2.A0B(C18300x5.A0B(this.A05.A02), "/export/provider_closed/timestamp");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("providerState: ");
        A0o.append(this.A02.getComponentEnabledSetting(this.A00));
        A0o.append("; closedUnsuccessfully: ");
        A0o.append(A0B);
        A0o.append("; currentTime: ");
        A0o.append(currentTimeMillis);
        return AnonymousClass000.A0X(";", A0o);
    }

    public String A01() {
        String str;
        int length;
        long currentTimeMillis = System.currentTimeMillis();
        long A0B = AnonymousClass0x2.A0B(C18300x5.A0B(this.A05.A02), "/export/provider/timestamp");
        Context context = this.A01;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str2 = ">";
        if (applicationInfo != null) {
            try {
                str = AnonymousClass002.A0B(applicationInfo.dataDir).getCanonicalFile().toString();
            } catch (IOException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A17(e, "<failed: ", str2, A0o);
                str = A0o.toString();
            }
        } else {
            str = null;
        }
        try {
            Signature[] signatureArr = this.A02.getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                str2 = "<no signatures>";
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("providerState: ");
                A0o2.append(this.A02.getComponentEnabledSetting(this.A00));
                A0o2.append("; lastAccessTime: ");
                A0o2.append(A0B);
                A0o2.append("; currentTime: ");
                A0o2.append(currentTimeMillis);
                A0o2.append("; dataDir: ");
                A0o2.append(str);
                A0o2.append("; signature: ");
                A0o2.append(str2);
                return AnonymousClass000.A0X(";", A0o2);
            }
            if (length > 1) {
                str2 = "<multiple signatures>";
            } else {
                try {
                    str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray()), 11);
                } catch (NoSuchAlgorithmException e2) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    AnonymousClass000.A17(e2, "<failed: ", str2, A0o3);
                    str2 = A0o3.toString();
                }
            }
            StringBuilder A0o22 = AnonymousClass001.A0o();
            A0o22.append("providerState: ");
            A0o22.append(this.A02.getComponentEnabledSetting(this.A00));
            A0o22.append("; lastAccessTime: ");
            A0o22.append(A0B);
            A0o22.append("; currentTime: ");
            A0o22.append(currentTimeMillis);
            A0o22.append("; dataDir: ");
            A0o22.append(str);
            A0o22.append("; signature: ");
            A0o22.append(str2);
            return AnonymousClass000.A0X(";", A0o22);
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder A0o4 = AnonymousClass001.A0o();
            C18270x1.A1H(A0o4, "<failed: ", e3);
            str2 = AnonymousClass000.A0X(str2, A0o4);
        }
    }

    public void A03() {
        long currentTimeMillis = System.currentTimeMillis();
        C183538qC r10 = this.A05.A02;
        long j = C18300x5.A0B(r10).getLong("/export/provider/timestamp", 0);
        long j2 = currentTimeMillis - j;
        if (j == 0 || j2 < 0 || j2 > 60000) {
            C18270x1.A0o(C18300x5.A0B(r10), "/export/provider/timestamp", currentTimeMillis);
        }
    }
}
