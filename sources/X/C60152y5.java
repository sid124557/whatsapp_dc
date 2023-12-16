package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2y5  reason: invalid class name and case insensitive filesystem */
public class C60152y5 {
    public static final Set A04;
    public final Context A00;
    public final C43162Ra A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final AtomicInteger A03 = new AtomicInteger();

    public synchronized SharedPreferences A03(String str) {
        boolean z;
        SharedPreferences sharedPreferences;
        StringBuilder A0o;
        if (A04.contains(str)) {
            z = true;
        } else {
            z = false;
        }
        Map map = this.A02;
        sharedPreferences = (SharedPreferences) map.get(str);
        if (sharedPreferences == null) {
            String str2 = C58152un.A0A;
            if (str2.equals(str)) {
                sharedPreferences = this.A00.getSharedPreferences(str2, 0);
            } else {
                Context context = this.A00;
                File A042 = C18330xA.A04(context.getFilesDir().getParent(), "shared_prefs");
                if (!A042.exists()) {
                    try {
                        A042.mkdir();
                        if (!A042.exists()) {
                            A0o = AnonymousClass001.A0o();
                            AnonymousClass000.A10(A042, "SharedPreferencesFactory/Failed to create preference dir ", A0o);
                        } else if (!A042.isDirectory() || !A042.canRead() || !A042.canWrite()) {
                            A0o = AnonymousClass001.A0o();
                            AnonymousClass000.A10(A042, "SharedPreferencesFactory/Invalid preference dir ", A0o);
                            A0o.append(", isDirectory=");
                            A0o.append(A042.isDirectory());
                            A0o.append(", canRead=");
                            A0o.append(A042.canRead());
                            A0o.append(", canWrite=");
                            A0o.append(A042.canWrite());
                        }
                        C18280x3.A13(A0o);
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    } catch (SecurityException e) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        AnonymousClass000.A10(A042, "SharedPreferencesFactory/Unable to create LightSharedPreferences: ", A0o2);
                        C18280x3.A1C(A0o2, e);
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    map.put(str, sharedPreferences);
                }
                sharedPreferences = new AnonymousClass37K(new AnonymousClass7LF(C18270x1.A0A(A042, ".xml", AnonymousClass000.A0l(str))), this.A01, this.A03.getAndIncrement(), z);
                map.put(str, sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        A04 = C18280x3.A0h(new String[]{AnonymousClass000.A0X("_preferences", A0o), "ab-props", "ab-prechatd-props", "startup_prefs", "field-stats-events-sampling", "server_prop_preferences", "forced_blocked_shared_prefs", "debug_drawer", "com.whatsapp_payment_debug_preferences", AnonymousClass000.A0X("_preferences_payments_debug", AnonymousClass000.A0l("com.whatsapp"))});
    }

    public static SharedPreferences A01(AnonymousClass31B r1) {
        return r1.A0D.A03("keystore");
    }

    public C60152y5(Context context, C43162Ra r3) {
        this.A00 = context;
        this.A01 = r3;
    }

    public static SharedPreferences.Editor A00(C60152y5 r0, String str) {
        return r0.A03(str).edit();
    }

    public static SharedPreferences A02(C60152y5 r0, String str) {
        SharedPreferences A032 = r0.A03(str);
        C162457s7.A0D(A032);
        return A032;
    }
}
