package X;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: X.81q  reason: invalid class name and case insensitive filesystem */
public class C1675881q implements C185788uF {
    public C185788uF A00;
    public C185788uF A01;
    public C185788uF A02;
    public C185788uF A03;
    public C185788uF A04;
    public C185788uF A05;
    public C185788uF A06;
    public C185788uF A07;
    public final Context A08;
    public final C185788uF A09;
    public final List A0A = AnonymousClass001.A0s();

    public final void A00(C185788uF r4) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                r4.Awq((C184768sU) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public C1675881q(Context context, C184768sU r9, String str) {
        AnonymousClass6KP r1 = new AnonymousClass6KP((AnonymousClass7FD) null, r9, str, 8000, 8000);
        this.A08 = context.getApplicationContext();
        this.A09 = r1;
        if (r9 != null) {
            Awq(r9);
        }
    }

    public Uri BE6() {
        C185788uF r0 = this.A03;
        if (r0 == null) {
            return null;
        }
        return r0.BE6();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bfw(X.C161387pX r5) {
        /*
            r4 = this;
            X.8uF r0 = r4.A03
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C159197lM.A02(r0)
            android.net.Uri r3 = r5.A04
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.8uF r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.6KM r0 = new X.6KM
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.8uF r0 = r4.A01
        L_0x0043:
            r4.A03 = r0
            long r0 = r0.Bfw(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            X.8uF r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            java.lang.Object r0 = X.AnonymousClass6C8.A0d(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            X.8uF r0 = (X.C185788uF) r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            r4.A06 = r0     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x00fc }
            goto L_0x006f
        L_0x0068:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r1, r0)
        L_0x006f:
            X.8uF r0 = r4.A06
            if (r0 != 0) goto L_0x0043
            X.8uF r0 = r4.A09
            r4.A06 = r0
            goto L_0x0043
        L_0x0078:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            X.8uF r0 = r4.A07
            if (r0 != 0) goto L_0x008e
            X.6KO r0 = new X.6KO
            r0.<init>()
            r4.A07 = r0
            r4.A00(r0)
        L_0x008e:
            X.8uF r0 = r4.A07
            goto L_0x0043
        L_0x0091:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00aa
            X.8uF r0 = r4.A02
            if (r0 != 0) goto L_0x00a7
            X.6KI r0 = new X.6KI
            r0.<init>()
            r4.A02 = r0
            r4.A00(r0)
        L_0x00a7:
            X.8uF r0 = r4.A02
            goto L_0x0043
        L_0x00aa:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c6
            X.8uF r0 = r4.A05
            if (r0 != 0) goto L_0x00c2
            android.content.Context r1 = r4.A08
            X.6KN r0 = new X.6KN
            r0.<init>(r1)
            r4.A05 = r0
            r4.A00(r0)
        L_0x00c2:
            X.8uF r0 = r4.A05
            goto L_0x0043
        L_0x00c6:
            X.8uF r0 = r4.A09
            goto L_0x0043
        L_0x00ca:
            java.lang.String r1 = r3.getPath()
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00e8
            X.8uF r0 = r4.A04
            if (r0 != 0) goto L_0x00e4
            X.6KJ r0 = new X.6KJ
            r0.<init>()
            r4.A04 = r0
            r4.A00(r0)
        L_0x00e4:
            X.8uF r0 = r4.A04
            goto L_0x0043
        L_0x00e8:
            X.8uF r0 = r4.A00
            if (r0 != 0) goto L_0x00f8
            android.content.Context r1 = r4.A08
            X.6KK r0 = new X.6KK
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00f8:
            X.8uF r0 = r4.A00
            goto L_0x0043
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.AnonymousClass6CA.A0Q(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675881q.Bfw(X.7pX):long");
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        C185788uF r0 = this.A03;
        if (r0 != null) {
            try {
                r0.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A03.read(bArr, i, i2);
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        this.A0A.add(r2);
        C185788uF r0 = this.A04;
        if (r0 != null) {
            r0.Awq(r2);
        }
        C185788uF r02 = this.A00;
        if (r02 != null) {
            r02.Awq(r2);
        }
        C185788uF r03 = this.A01;
        if (r03 != null) {
            r03.Awq(r2);
        }
        C185788uF r04 = this.A05;
        if (r04 != null) {
            r04.Awq(r2);
        }
    }
}
