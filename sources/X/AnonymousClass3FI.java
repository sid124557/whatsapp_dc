package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.3FI  reason: invalid class name */
public class AnonymousClass3FI implements C182358oH {
    public static final String A07 = "2.23.26.14".replace(' ', '_');
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C54292oU A05;
    public final C620733j A06;

    public synchronized String A00() {
        String str;
        str = this.A00;
        if (str == null) {
            str = A03(this.A05, "2.23.26.14", false);
            this.A00 = str;
        }
        return str;
    }

    public synchronized String A01() {
        String str;
        str = this.A01;
        if (str == null) {
            str = A03(this.A05, "2.23.26.14", true);
            this.A01 = str;
        }
        return str;
    }

    public synchronized String A02() {
        String str;
        str = this.A02;
        if (str == null) {
            str = A04((Map) null);
            this.A02 = str;
        }
        return str;
    }

    public synchronized String A05(Map map) {
        String str;
        str = this.A03;
        if (str == null) {
            str = A04(map);
            this.A03 = str;
        }
        return str;
    }

    public void BVk() {
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public final String A03(C54292oU r12, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(str.replace(' ', '_'));
        if (z) {
            str2 = ".beta";
        } else {
            str2 = "";
        }
        String A0X = AnonymousClass000.A0X(str2, A0o);
        String replace = "Android".replace(' ', '_');
        synchronized (this) {
        }
        String replace2 = C18320x8.A0a(r12.A00).replace(' ', '_');
        try {
            str3 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e) {
            Log.e("app/user-agent/release", e);
            str3 = str5;
        }
        try {
            str4 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/manufacturer", e2);
            str4 = str5;
        }
        try {
            str5 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/model", e3);
        }
        StringBuilder A0l = AnonymousClass000.A0l(replace2);
        A0l.append("/");
        A0l.append(A0X);
        C18260x0.A0p(" ", replace, "/", str3, A0l);
        A0l.append(" Device/");
        A0l.append(str4);
        String A0U = AnonymousClass000.A0U("-", str5, "", A0l);
        C18260x0.A0q("UserAgent: ", A0U, AnonymousClass001.A0o());
        return A0U;
    }

    public final String A04(Map map) {
        C60002xq r3 = new C60002xq(true);
        r3.A00 = A00();
        Map map2 = r3.A01;
        map2.put("FBAN", "WhatsAppAndroid");
        map2.put("FBAV", A07);
        map2.put("FBBV", String.valueOf(232614005));
        Object A09 = this.A06.A09();
        if (map != null && map.containsKey(A09) && (A09 = map.get(A09)) == null) {
            A09 = "en_US";
        }
        map2.put("FBLC", A09);
        map2.put("FBPN", this.A05.A00.getPackageName());
        return r3.A00();
    }

    public AnonymousClass3FI(C54292oU r1, C620733j r2) {
        this.A05 = r1;
        this.A06 = r2;
    }
}
