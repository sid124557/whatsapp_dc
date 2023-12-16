package X;

/* renamed from: X.2dE  reason: invalid class name and case insensitive filesystem */
public class C47422dE {
    public final C55682qk A00;
    public final C56492s4 A01;
    public final C54292oU A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass33K A04;
    public final C83974An A05;
    public final C51852kU A06;
    public final C49912hI A07;
    public final C55132pq A08;
    public final String A09;
    public final String A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        r2.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C18260x0.A0q("NetworkResourceDownload/download/finally/", r4, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
        r1 = X.AnonymousClass002.A0B(X.AnonymousClass000.A0V("/", r9, X.AnonymousClass000.A0l(r13)));
        r0 = r1.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r0 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
        X.C18280x3.A10(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r1.exists() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r7.A02(r4, 3);
        r10.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r10.renameTo(r1) == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.C18260x0.A0q("NetworkResourceDownload/saved/", r9, X.AnonymousClass001.A0o());
        r7.A02(r4, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016d, code lost:
        r7.A02(r4, 8);
        r10.delete();
        r1 = X.AnonymousClass002.A0C("NetworkResourceDownload/file-rename-failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A00() {
        /*
            r14 = this;
            X.1VX r8 = r14.A03
            r1 = 3005(0xbbd, float:4.211E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r0, r1)
            if (r0 == 0) goto L_0x019e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NetworkResourceDownload/id: "
            r1.append(r0)
            java.lang.String r4 = r14.A0A
            X.C18260x0.A1J(r1, r4)
            X.2oU r0 = r14.A02
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "NetworkResource"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            java.lang.String r13 = r0.getAbsolutePath()
            r0 = 21
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x017e }
            java.lang.String r9 = r14.A09     // Catch:{ IOException -> 0x017e }
            java.lang.String r3 = "NetworkResourceDownload/download/finally/"
            java.lang.String r1 = "downloading-"
            java.lang.String r0 = ".tmp"
            java.io.File r10 = java.io.File.createTempFile(r1, r0)     // Catch:{ all -> 0x017c }
            X.2kU r7 = r14.A06     // Catch:{ all -> 0x017c }
            int r1 = r7.A00(r4)     // Catch:{ all -> 0x017c }
            r0 = 5
            if (r1 != r0) goto L_0x0048
            r0 = 2
            r7.A02(r4, r0)     // Catch:{ all -> 0x017c }
        L_0x0048:
            r0 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x017c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x017c }
            r6 = 0
            java.util.HashMap r5 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "cat"
            java.lang.String r0 = "nw_media"
            r5.put(r1, r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "id"
            r5.put(r0, r4)     // Catch:{ all -> 0x0163 }
            X.2hI r1 = r14.A07     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "/wa/static/network_resource"
            android.net.Uri$Builder r0 = X.AnonymousClass351.A00(r8, r1, r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r5 = X.AnonymousClass351.A01(r0, r5)     // Catch:{ all -> 0x0163 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "NetworkResourceDownload/download from: "
            X.C18260x0.A0q(r0, r5, r1)     // Catch:{ all -> 0x0163 }
            X.33K r1 = r14.A04     // Catch:{ all -> 0x015a }
            X.2pq r0 = r14.A08     // Catch:{ all -> 0x015a }
            X.4GL r5 = r1.A01(r0, r5, r6)     // Catch:{ all -> 0x015a }
            r0 = r5
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0150 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x0150 }
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x0150 }
            r0 = 200(0xc8, float:2.8E-43)
            r12 = 22
            r11 = 0
            if (r8 != r0) goto L_0x00fe
            X.2s4 r1 = r14.A01     // Catch:{ all -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0150 }
            java.io.InputStream r6 = X.C18310x6.A0b(r1, r5, r0, r12)     // Catch:{ all -> 0x0150 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x0146 }
        L_0x009b:
            int r1 = r6.read(r8)     // Catch:{ all -> 0x0146 }
            r0 = -1
            if (r1 == r0) goto L_0x00ae
            X.4An r0 = r14.A05     // Catch:{ all -> 0x0146 }
            boolean r0 = r0.BHR()     // Catch:{ all -> 0x0146 }
            if (r0 != 0) goto L_0x0137
            r2.write(r8, r11, r1)     // Catch:{ all -> 0x0146 }
            goto L_0x009b
        L_0x00ae:
            r2.flush()     // Catch:{ all -> 0x0146 }
            r6.close()     // Catch:{ all -> 0x0150 }
            r5.close()     // Catch:{ all -> 0x015a }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0163 }
            X.C18260x0.A0q(r3, r4, r0)     // Catch:{ all -> 0x0163 }
            r2.close()     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r13)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)     // Catch:{ all -> 0x017c }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x017c }
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00d8
            X.C18280x3.A10(r0)     // Catch:{ all -> 0x017c }
        L_0x00d8:
            boolean r0 = r1.exists()     // Catch:{ all -> 0x017c }
            r2 = 3
            if (r0 == 0) goto L_0x00e6
            r7.A02(r4, r2)     // Catch:{ all -> 0x017c }
            r10.delete()     // Catch:{ all -> 0x017c }
            goto L_0x00f8
        L_0x00e6:
            boolean r0 = r10.renameTo(r1)     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x016d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x017e }
            java.lang.String r0 = "NetworkResourceDownload/saved/"
            X.C18260x0.A0q(r0, r9, r1)     // Catch:{ IOException -> 0x017e }
            r7.A02(r4, r2)     // Catch:{ IOException -> 0x017e }
        L_0x00f8:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "NetworkResourceDownload/ response code: "
            X.C18260x0.A0x(r0, r1, r8)     // Catch:{ all -> 0x0150 }
            X.2s4 r6 = r14.A01     // Catch:{ all -> 0x0150 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0150 }
            java.io.InputStream r6 = r5.B46(r6, r1, r0)     // Catch:{ all -> 0x0150 }
            r0 = 6
            r7.A02(r4, r0)     // Catch:{ all -> 0x0146 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "NetworkResourceDownload/responseCode:"
            r1.append(r0)     // Catch:{ all -> 0x0146 }
            r1.append(r8)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "; error="
            r1.append(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = X.C624535b.A00(r6)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0146 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0146 }
            goto L_0x0145
        L_0x0137:
            r0 = 7
            r7.A02(r4, r0)     // Catch:{ all -> 0x0146 }
            r10.delete()     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "NetworkResourceDownload/user-canceled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0146 }
            r0.<init>(r1)     // Catch:{ all -> 0x0146 }
        L_0x0145:
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0150 }
        L_0x014f:
            throw r1     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0155 }
            goto L_0x0159
        L_0x0155:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x015a }
        L_0x0159:
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0163 }
            X.C18260x0.A0q(r3, r4, r0)     // Catch:{ all -> 0x0163 }
            throw r1     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0168 }
            goto L_0x017b
        L_0x0168:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x017c }
            goto L_0x017b
        L_0x016d:
            r0 = 8
            r7.A02(r4, r0)     // Catch:{ all -> 0x017c }
            r10.delete()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "NetworkResourceDownload/file-rename-failed"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x017c }
        L_0x017b:
            throw r1     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x017e:
            r3 = move-exception
            X.2qk r2 = r14.A00     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = "NetworkResourceDownload/"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0199 }
            r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0199 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "NetworkResourceDownload/IOException/"
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ all -> 0x0199 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0199 }
            throw r0     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x019e:
            java.lang.String r1 = "NetworkResourceDownload/ABProp disabled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47422dE.A00():java.lang.Boolean");
    }

    public C47422dE(C55682qk r1, C56492s4 r2, C54292oU r3, AnonymousClass1VX r4, AnonymousClass33K r5, C83974An r6, C51852kU r7, C49912hI r8, C55132pq r9, String str, String str2) {
        this.A0A = str;
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A09 = str2;
        this.A01 = r2;
        this.A04 = r5;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
    }
}
