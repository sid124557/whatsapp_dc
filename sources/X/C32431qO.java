package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1qO  reason: invalid class name and case insensitive filesystem */
public class C32431qO extends AnonymousClass3UP {
    public final AnonymousClass1VX A00;
    public final String A01;
    public final String A02;

    public String B3m(AnonymousClass7US r9, boolean z) {
        Uri.Builder A012;
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = Uri.parse(C18300x5.A0f(C18300x5.A0C().encodedAuthority(r9.A02).encodedPath(str))).buildUpon();
            int i = 1;
            if (r9.A00 == 0) {
                i = 0;
            }
            A012 = buildUpon.appendQueryParameter("direct_ip", String.valueOf(i));
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2)) {
                A012.appendQueryParameter("hash", str2);
            }
        } else {
            A012 = A01(r9);
        }
        String str3 = r9.A03;
        if (str3 != null) {
            AnonymousClass3UP.A00(A012, "_nc_cat", str3);
        }
        String str4 = this.A02;
        if (str4 != null) {
            A012.appendQueryParameter("mode", str4);
        }
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass1VX r2 = this.A00;
        if (r2 != null) {
            for (String str5 : C18320x8.A1b(r2.A0R(C58422vE.A02, 4836))) {
                if (Collections.unmodifiableSet(C617131y.A00).contains(str5)) {
                    A0K.add(str5);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Mms4DownloadUrlGenerator/loadLowHitRateTypes ");
                    A0o.append(str5);
                    C18260x0.A1K(A0o, " is not a supported media type. ABProps LOW_CACHE_HIT_RATE_MEDIA_TYPES might have corrupted data");
                }
            }
        }
        if (A0K.contains(this.A01)) {
            A012.appendQueryParameter("_nc_map", "whatsapp-nofna");
        }
        return C18300x5.A0f(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 != null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32431qO(X.AnonymousClass1VX r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            r1.<init>(r3, r4, r5)
            if (r3 != 0) goto L_0x0008
            r0 = 0
            if (r6 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C626936e.A0C(r0)
            r1.A00 = r2
            r1.A01 = r6
            r1.A02 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32431qO.<init>(X.1VX, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
