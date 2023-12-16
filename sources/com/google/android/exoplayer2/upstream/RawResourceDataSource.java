package com.google.android.exoplayer2.upstream;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6CA;
import X.AnonymousClass6u1;
import X.C1691088a;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends C1691088a {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final String A06;

    public RawResourceDataSource(Context context) {
        super(false);
        this.A05 = context.getResources();
        this.A06 = context.getPackageName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004b, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r4.A04 = false;
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch:{ IOException -> 0x0027 }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x000b:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x001f
            r4.A04 = r2
            r4.A00()
        L_0x001f:
            return
        L_0x0020:
            r1 = move-exception
            X.6u1 r0 = new X.6u1     // Catch:{ all -> 0x004e }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0027:
            r1 = move-exception
            X.6u1 r0 = new X.6u1     // Catch:{ all -> 0x002e }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x003f }
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x0038:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
            goto L_0x0055
        L_0x003f:
            r1 = move-exception
            X.6u1 r0 = new X.6u1     // Catch:{ all -> 0x0046 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
            goto L_0x0055
        L_0x004e:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
        L_0x0055:
            r4.A04 = r2
            r4.A00()
        L_0x005a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    public Uri BE6() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bfx(X.C157677ih r10) {
        /*
            r9 = this;
            android.net.Uri r4 = r10.A04
            r9.A02 = r4
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "rawresource"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r7 = 1
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = r4.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0037
            java.util.List r0 = r4.getPathSegments()
            int r0 = r0.size()
            if (r0 != r7) goto L_0x0037
            java.lang.String r1 = r4.getLastPathSegment()
            r1.getClass()
            java.lang.String r0 = "\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0090
        L_0x0037:
            java.lang.String r0 = r4.getScheme()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r3 = r4.getPath()
            r3.getClass()
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r3 = r3.substring(r7)
        L_0x0054:
            java.lang.String r2 = r4.getHost()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = ""
        L_0x0064:
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r3, r1)
            android.content.res.Resources r2 = r9.A05
            java.lang.String r1 = "raw"
            java.lang.String r0 = r9.A06
            int r1 = r2.getIdentifier(r3, r1, r0)
            if (r1 != 0) goto L_0x009b
            java.lang.String r1 = "Resource not found."
            X.6u1 r0 = new X.6u1
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x007c:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18290x4.A1R(r0, r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0064
        L_0x0088:
            java.lang.String r1 = "URI must either use scheme rawresource or android.resource"
            X.6u1 r0 = new X.6u1
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0090:
            java.lang.String r0 = r4.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x00ff }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x00ff }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ff }
        L_0x009b:
            r9.A01()
            android.content.res.Resources r0 = r9.A05
            android.content.res.AssetFileDescriptor r8 = r0.openRawResourceFd(r1)
            r9.A01 = r8
            if (r8 == 0) goto L_0x00ef
            java.io.FileDescriptor r0 = r8.getFileDescriptor()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            r9.A03 = r2
            long r0 = r8.getStartOffset()     // Catch:{ IOException -> 0x00e8 }
            r2.skip(r0)     // Catch:{ IOException -> 0x00e8 }
            long r3 = r10.A03     // Catch:{ IOException -> 0x00e8 }
            long r1 = r2.skip(r3)     // Catch:{ IOException -> 0x00e8 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e3
            long r1 = r10.A02
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            r9.A00 = r1
        L_0x00ce:
            r9.A04 = r7
            r9.A03(r10)
            long r0 = r9.A00
            return r0
        L_0x00d6:
            long r1 = r8.getLength()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00e0
            long r5 = r1 - r3
        L_0x00e0:
            r9.A00 = r5
            goto L_0x00ce
        L_0x00e3:
            java.io.EOFException r0 = X.AnonymousClass6CA.A0M()     // Catch:{ IOException -> 0x00e8 }
            throw r0     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            X.6u1 r1 = new X.6u1
            r1.<init>((java.io.IOException) r0)
            throw r1
        L_0x00ef:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Resource is compressed: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r4, r0, r1)
            X.6u1 r0 = new X.6u1
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00ff:
            java.lang.String r0 = "Resource identifier must be an integer."
            X.6u1 r1 = new X.6u1
            r1.<init>((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.Bfx(X.7ih):long");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = AnonymousClass6CA.A02(j, (long) i2);
                } catch (IOException e) {
                    throw new AnonymousClass6u1(e);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A02(read);
                return read;
            } else if (this.A00 != -1) {
                throw new AnonymousClass6u1((IOException) AnonymousClass6CA.A0M());
            }
        }
        return -1;
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(AnonymousClass000.A0Y("rawresource:///", AnonymousClass001.A0o(), i));
    }
}
