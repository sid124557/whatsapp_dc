package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2la  reason: invalid class name and case insensitive filesystem */
public final class C52502la {
    public final C55682qk A00;
    public final C69253Wh A01;
    public final Map A02 = C18320x8.A0r();

    public final void A00(String str, String str2, String str3) {
        C162457s7.A0J(str, 0);
        A02(str, str2, str3, new C81443zt(this, str2, str3));
    }

    public final void A01(String str, String str2, String str3, Throwable th) {
        C162457s7.A0J(str, 0);
        A02(str, str2, str3, new AnonymousClass404(this, str2, str3, th));
    }

    public final void A02(String str, String str2, String str3, AnonymousClass4GP r8) {
        boolean z;
        StringBuilder A0o;
        String str4;
        synchronized (this) {
            Map map = this.A02;
            C45252Zh r3 = (C45252Zh) map.get(str);
            if (r3 == null) {
                map.put(str, new C45252Zh(str2));
                this.A01.A00.postDelayed(new C71323bv(40, str, this), C625635p.A0L);
                z = true;
            } else {
                List list = r3.A02;
                if (list.size() < 10 && str3 != null) {
                    list.add(str3);
                }
                r3.A00++;
                z = false;
            }
        }
        if (z) {
            r8.invoke();
            A0o = AnonymousClass001.A0o();
            str4 = "ThrottlingCrashLogs; first report for '";
        } else {
            A0o = AnonymousClass001.A0o();
            str4 = "ThrottlingCrashLogs; throttled report for '";
        }
        A0o.append(str4);
        A0o.append(str);
        A0o.append("': name='");
        A0o.append(str2);
        A0o.append("', debug='");
        A0o.append(str3);
        C18270x1.A1E(A0o, '\'');
    }

    public C52502la(C55682qk r2, C69253Wh r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
