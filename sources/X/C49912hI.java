package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.2hI  reason: invalid class name and case insensitive filesystem */
public class C49912hI {
    public String A00 = "static.whatsapp.net";
    public final AnonymousClass1VX A01;
    public final C29011i8 A02;
    public final AnonymousClass4FS A03;
    public final Object A04 = AnonymousClass002.A0D();

    public String A00(String str) {
        if (!this.A01.A0Y(C58422vE.A02, 2565)) {
            return str;
        }
        A01();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(this.A00);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa/static");
        encodedAuthority.encodedPath(AnonymousClass000.A0X(parse.getEncodedPath(), A0o));
        return C18300x5.A0f(AnonymousClass3UP.A00(Uri.parse(C18300x5.A0f(buildUpon)).buildUpon(), "_nc_cat", "1"));
    }

    public final void A01() {
        C47502dM r3;
        synchronized (this.A04) {
            AnonymousClass4FS r32 = this.A03;
            C29011i8 r2 = this.A02;
            Objects.requireNonNull(r2);
            r32.BkM(new C71283br((Object) r2, 18));
            AnonymousClass5LI A0B = r2.A0B();
            String str = "static.whatsapp.net";
            if (A0B != null) {
                List list = A0B.A0A;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            r3 = (C47502dM) it2.next();
                            if ("primary".equals(r3.A08)) {
                                break;
                            }
                        }
                    } else {
                        r3 = (C47502dM) it.next();
                        Set set = r3.A0A;
                        if (set != null && set.contains("1")) {
                            break;
                        }
                    }
                }
                str = r3.A04;
            }
            this.A00 = str;
            C18260x0.A0q("StaticContentUrlGenerator/StaticContentUrlGenerator Using route: ", str, AnonymousClass001.A0o());
        }
    }

    public C49912hI(AnonymousClass1VX r2, C29011i8 r3, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
