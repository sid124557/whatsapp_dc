package X;

import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: X.2i5  reason: invalid class name and case insensitive filesystem */
public class C50382i5 {
    public final C56492s4 A00;
    public final C29441ip A01;
    public final AnonymousClass310 A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;
    public final C55132pq A06;
    public final C187958y5 A07;
    public final AnonymousClass3FI A08;
    public final AnonymousClass4FS A09;

    public boolean A01() {
        try {
            PackageManager packageManager = this.A04.A00.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 0);
            return C18300x5.A08("market://details?id=com.whatsapp").resolveActivity(packageManager) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public C50382i5(C56492s4 r1, C29441ip r2, AnonymousClass310 r3, C56612sH r4, C54292oU r5, AnonymousClass33p r6, C55132pq r7, C187958y5 r8, AnonymousClass3FI r9, AnonymousClass4FS r10) {
        this.A04 = r5;
        this.A03 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
        this.A07 = r8;
    }

    public Uri A00() {
        String str;
        if (!A01()) {
            str = "https://www.whatsapp.com/android/current/WhatsApp.apk";
        } else {
            str = "market://details?id=com.whatsapp";
        }
        return Uri.parse(str);
    }
}
