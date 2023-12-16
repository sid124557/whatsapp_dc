package X;

import java.io.File;

/* renamed from: X.5Qm  reason: invalid class name and case insensitive filesystem */
public class C104315Qm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final File A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:23|24|25|26|27|(3:29|30|(1:50))|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104315Qm(java.io.File r13) {
        /*
            r12 = this;
            java.lang.String r10 = ") "
            java.lang.String r9 = ") or height ("
            java.lang.String r4 = " "
            r12.<init>()
            r12.A05 = r13
            X.C172218Kd.A04(r13)     // Catch:{ IOException -> 0x0010 }
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r12.A07 = r0
            if (r0 == 0) goto L_0x0032
            X.7L1 r1 = X.C172218Kd.A04(r13)     // Catch:{ Exception -> 0x0022 }
            int r0 = r1.A01     // Catch:{ Exception -> 0x0022 }
            r12.A03 = r0     // Catch:{ Exception -> 0x0022 }
            int r0 = r1.A00     // Catch:{ Exception -> 0x0022 }
            r12.A01 = r0     // Catch:{ Exception -> 0x0022 }
            return
        L_0x0022:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "media_file not found: "
            X.C18260x0.A0k(r13, r0, r1, r2)
            X.6pi r0 = new X.6pi
            r0.<init>()
            throw r0
        L_0x0032:
            X.6DM r3 = new X.6DM
            r3.<init>()
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0105 }
            r3.setDataSource(r0)     // Catch:{ Exception -> 0x0105 }
            boolean r0 = com.whatsapp.GifHelper.A01(r13)     // Catch:{ all -> 0x0142 }
            r12.A06 = r0     // Catch:{ all -> 0x0142 }
            r0 = 9
            java.lang.String r8 = r3.extractMetadata(r0)     // Catch:{ all -> 0x0142 }
            r0 = 18
            java.lang.String r7 = r3.extractMetadata(r0)     // Catch:{ all -> 0x0142 }
            r0 = 19
            java.lang.String r2 = r3.extractMetadata(r0)     // Catch:{ all -> 0x0142 }
            long r5 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x00ef }
            r12.A04 = r5     // Catch:{ Exception -> 0x00ef }
            r0 = 0
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00d2
            int r4 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x006f }
            r12.A03 = r4     // Catch:{ Exception -> 0x006f }
            int r4 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x006f }
            r12.A01 = r4     // Catch:{ Exception -> 0x006f }
            goto L_0x00a1
        L_0x006f:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r4 = "videometa/cannot parse width ("
            X.AnonymousClass001.A1K(r4, r7, r9, r5)     // Catch:{ all -> 0x0142 }
            r5.append(r2)     // Catch:{ all -> 0x0142 }
            r5.append(r10)     // Catch:{ all -> 0x0142 }
            A00(r12, r5)     // Catch:{ all -> 0x0142 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0142 }
            com.whatsapp.util.Log.w(r4, r6)     // Catch:{ all -> 0x0142 }
            android.graphics.Bitmap r1 = r3.getFrameAtTime(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x00bd }
            if (r1 == 0) goto L_0x00bd
            int r0 = r1.getWidth()     // Catch:{ all -> 0x0142 }
            r12.A03 = r0     // Catch:{ all -> 0x0142 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0142 }
            r12.A01 = r1     // Catch:{ all -> 0x0142 }
            int r0 = r12.A03     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0127
            if (r1 == 0) goto L_0x0127
        L_0x00a1:
            r0 = 20
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00ad }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00ad }
            r12.A00 = r0     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            r0 = 24
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00b9 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00b9 }
            r12.A02 = r0     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            r3.close()
            return
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "videometa/cannot get frame"
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            A00(r12, r1)     // Catch:{ all -> 0x0142 }
            X.C18280x3.A13(r1)     // Catch:{ all -> 0x0142 }
            X.6pi r0 = new X.6pi     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            goto L_0x0141
        L_0x00d2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "videometa/no duration:"
            X.AnonymousClass001.A1K(r0, r8, r4, r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ all -> 0x0142 }
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = X.AnonymousClass000.A0N(r13, r4, r1)     // Catch:{ all -> 0x0142 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0142 }
            X.6pi r0 = new X.6pi     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            goto L_0x0141
        L_0x00ef:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "videometa/cannot parse duration:"
            X.AnonymousClass001.A1K(r0, r8, r4, r1)     // Catch:{ all -> 0x0142 }
            A00(r12, r1)     // Catch:{ all -> 0x0142 }
            X.C18280x3.A1C(r1, r2)     // Catch:{ all -> 0x0142 }
            X.6pi r0 = new X.6pi     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            goto L_0x0141
        L_0x0105:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "videometa/cannot process file:"
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            A00(r12, r1)     // Catch:{ all -> 0x0142 }
            r1.append(r4)     // Catch:{ all -> 0x0142 }
            java.io.File r0 = r12.A05     // Catch:{ all -> 0x0142 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0142 }
            r1.append(r0)     // Catch:{ all -> 0x0142 }
            X.C18280x3.A1C(r1, r2)     // Catch:{ all -> 0x0142 }
            X.6pi r0 = new X.6pi     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
            goto L_0x0141
        L_0x0127:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "videometa/bad width ("
            X.AnonymousClass001.A1K(r0, r7, r9, r1)     // Catch:{ all -> 0x0142 }
            r1.append(r2)     // Catch:{ all -> 0x0142 }
            r1.append(r10)     // Catch:{ all -> 0x0142 }
            A00(r12, r1)     // Catch:{ all -> 0x0142 }
            X.C18280x3.A13(r1)     // Catch:{ all -> 0x0142 }
            X.6pi r0 = new X.6pi     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
        L_0x0141:
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0147 }
            throw r1
        L_0x0147:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104315Qm.<init>(java.io.File):void");
    }

    public static void A00(C104315Qm r3, StringBuilder sb) {
        File file = r3.A05;
        sb.append(file.getAbsolutePath());
        sb.append(" ");
        sb.append(file.length());
    }

    public int A01() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        long j = this.A04;
        if (j != 0) {
            return (int) ((this.A05.length() * 8000) / j);
        }
        return 0;
    }

    public boolean A02() {
        return AnonymousClass000.A1U(Math.abs(this.A02 % 180), 90);
    }
}
