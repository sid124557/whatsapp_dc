package X;

import android.os.Build;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.2Zc  reason: invalid class name and case insensitive filesystem */
public class C45212Zc {
    public boolean A00;
    public final C183538qC A01;
    public final Map A02 = AnonymousClass001.A0t();

    public synchronized Object A00(String str) {
        Object obj;
        if (!this.A00) {
            String A0Y = C18320x8.A0J(this.A01).A0Y();
            Map map = this.A02;
            map.put("device_id", A0Y);
            map.put("app_build", "beta");
            map.put("release_channel", "beta");
            map.put("app_version", "2.23.26.14");
            map.put("os_version", Build.VERSION.RELEASE);
            map.put("platform", "android");
            this.A00 = true;
        }
        Map map2 = this.A02;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
            Objects.requireNonNull(obj);
        } else {
            throw AnonymousClass000.A0F(" has not been set on UserInfo", AnonymousClass000.A0l(str));
        }
        return obj;
    }

    public C45212Zc(C183538qC r2) {
        this.A01 = r2;
    }
}
