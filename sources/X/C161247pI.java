package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7pI  reason: invalid class name and case insensitive filesystem */
public class C161247pI {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static String A03;
    public static String A04;
    public static String A05;
    public static boolean A06;
    public static final C150017Ou A07;
    public static final C150017Ou A08 = new C150017Ou("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", (Rect[]) null, (String[]) null, (C157467iL[][]) null, Integer.MAX_VALUE);
    public static final List A09 = AnonymousClass0x9.A18();
    public static final Semaphore A0A = new Semaphore(1);
    public static volatile C150017Ou A0B;
    public static volatile String A0C;
    public static volatile String A0D = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        C150017Ou r0 = new C150017Ou("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", (Rect[]) null, (String[]) null, (C157467iL[][]) null, Integer.MAX_VALUE);
        A07 = r0;
        A0B = r0;
        A00();
    }

    public static void A01(Context context, String str) {
        A0C = str;
        Context applicationContext = context.getApplicationContext();
        A02 = applicationContext;
        String packageName = applicationContext.getPackageName();
        if ("com.instagram.android".equals(packageName)) {
            A0D = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            A0B = A08;
        } else if ("com.whatsapp".equals(packageName) || "com.whatsapp.w4b".equals(packageName)) {
            A0D = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        }
        if (A01 == null) {
            AnonymousClass6CY r3 = new AnonymousClass6CY();
            A01 = r3;
            A02.registerReceiver(r3, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
    }

    public static void A02(boolean z) {
        if (A0C != null && A02 != null) {
            Semaphore semaphore = A0A;
            if (semaphore.tryAcquire()) {
                long j = A00;
                if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                    A06 = z;
                    C125986Kg r1 = new C125986Kg(A02);
                    C161847qe.A01(r1);
                    AnonymousClass7FF.A00(r1, "MapConfigUpdateDispatchable");
                    return;
                }
                semaphore.release();
            } else if (z) {
                try {
                    if (semaphore.tryAcquire(10, TimeUnit.SECONDS)) {
                        semaphore.release();
                    }
                } catch (InterruptedException unused) {
                    C158827kc.A07.A01();
                }
            }
        }
    }

    public static void A00() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder A0l = AnonymousClass000.A0l(language);
            if (country.length() == 2) {
                str2 = AnonymousClass000.A0V("_", country, AnonymousClass001.A0o());
            } else {
                str2 = "";
            }
            str = AnonymousClass000.A0X(str2, A0l);
        } else {
            str = "en";
        }
        A04 = str;
        A05 = AnonymousClass0x9.A0z(str);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }
}
