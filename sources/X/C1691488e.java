package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.88e  reason: invalid class name and case insensitive filesystem */
public final class C1691488e implements C187668xc {
    public C187668xc A00;
    public C187668xc A01;
    public C187668xc A02;
    public C187668xc A03;
    public C187668xc A04;
    public C187668xc A05;
    public C187668xc A06;
    public C187668xc A07;
    public final Context A08;
    public final C187668xc A09;
    public final List A0A = AnonymousClass001.A0s();

    public final void A00(C187668xc r4) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                r4.Awr((C178288hI) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public Map BCF() {
        C187668xc r0 = this.A03;
        if (r0 == null) {
            return Collections.emptyMap();
        }
        return r0.BCF();
    }

    public Uri BE6() {
        C187668xc r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.BE6();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bfx(X.C157677ih r5) {
        /*
            r4 = this;
            X.8xc r0 = r4.A03
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C161487pm.A04(r0)
            android.net.Uri r3 = r5.A04
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.8xc r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.6Po r0 = new X.6Po
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.8xc r0 = r4.A01
        L_0x0043:
            r4.A03 = r0
            long r0 = r0.Bfx(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            X.8xc r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x0105 }
            java.lang.Object r0 = X.AnonymousClass6C8.A0d(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x0105 }
            X.8xc r0 = (X.C187668xc) r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x0105 }
            r4.A06 = r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x0105 }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x0105 }
            goto L_0x006f
        L_0x0068:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r1, r0)
        L_0x006f:
            X.8xc r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            X.8xc r0 = r4.A09
            r4.A06 = r0
            goto L_0x0043
        L_0x0078:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            X.8xc r0 = r4.A07
            if (r0 != 0) goto L_0x008e
            X.6Pp r0 = new X.6Pp
            r0.<init>()
            r4.A07 = r0
            r4.A00(r0)
        L_0x008e:
            X.8xc r0 = r4.A07
            goto L_0x0043
        L_0x0091:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00aa
            X.8xc r0 = r4.A02
            if (r0 != 0) goto L_0x00a7
            X.6Pl r0 = new X.6Pl
            r0.<init>()
            r4.A02 = r0
            r4.A00(r0)
        L_0x00a7:
            X.8xc r0 = r4.A02
            goto L_0x0043
        L_0x00aa:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bd
            X.8xc r0 = r4.A09
            goto L_0x0043
        L_0x00bd:
            X.8xc r0 = r4.A05
            if (r0 != 0) goto L_0x00cd
            android.content.Context r1 = r4.A08
            com.google.android.exoplayer2.upstream.RawResourceDataSource r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource
            r0.<init>(r1)
            r4.A05 = r0
            r4.A00(r0)
        L_0x00cd:
            X.8xc r0 = r4.A05
            goto L_0x0043
        L_0x00d1:
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f3
        L_0x00df:
            X.8xc r0 = r4.A00
            if (r0 != 0) goto L_0x00ef
            android.content.Context r1 = r4.A08
            X.6Pn r0 = new X.6Pn
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00ef:
            X.8xc r0 = r4.A00
            goto L_0x0043
        L_0x00f3:
            X.8xc r0 = r4.A04
            if (r0 != 0) goto L_0x0101
            X.6Pm r0 = new X.6Pm
            r0.<init>()
            r4.A04 = r0
            r4.A00(r0)
        L_0x0101:
            X.8xc r0 = r4.A04
            goto L_0x0043
        L_0x0105:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691488e.Bfx(X.7ih):long");
    }

    public void close() {
        C187668xc r0 = this.A03;
        if (r0 != null) {
            try {
                r0.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C187668xc r0 = this.A03;
        r0.getClass();
        return r0.read(bArr, i, i2);
    }

    public C1691488e(Context context, C187668xc r3) {
        this.A08 = context.getApplicationContext();
        r3.getClass();
        this.A09 = r3;
    }

    public void Awr(C178288hI r2) {
        r2.getClass();
        this.A09.Awr(r2);
        this.A0A.add(r2);
        C187668xc r0 = this.A04;
        if (r0 != null) {
            r0.Awr(r2);
        }
        C187668xc r02 = this.A00;
        if (r02 != null) {
            r02.Awr(r2);
        }
        C187668xc r03 = this.A01;
        if (r03 != null) {
            r03.Awr(r2);
        }
        C187668xc r04 = this.A06;
        if (r04 != null) {
            r04.Awr(r2);
        }
        C187668xc r05 = this.A07;
        if (r05 != null) {
            r05.Awr(r2);
        }
        C187668xc r06 = this.A02;
        if (r06 != null) {
            r06.Awr(r2);
        }
        C187668xc r07 = this.A05;
        if (r07 != null) {
            r07.Awr(r2);
        }
    }
}
