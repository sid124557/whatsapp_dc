package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6KN  reason: invalid class name */
public final class AnonymousClass6KN extends C1675681o implements C185788uF {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    public AnonymousClass6KN(Context context) {
        super(false);
        this.A05 = context.getResources();
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
            X.6tz r0 = new X.6tz     // Catch:{ all -> 0x004e }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0027:
            r1 = move-exception
            X.6tz r0 = new X.6tz     // Catch:{ all -> 0x002e }
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
            X.6tz r0 = new X.6tz     // Catch:{ all -> 0x0046 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KN.close():void");
    }

    public Uri BE6() {
        return this.A02;
    }

    public long Bfw(C161387pX r8) {
        Throwable th;
        try {
            Uri uri = r8.A04;
            this.A02 = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    int parseInt = Integer.parseInt(this.A02.getLastPathSegment());
                    A01();
                    AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                    this.A01 = openRawResourceFd;
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    InputStream inputStream = this.A03;
                    long j = r8.A03;
                    if (inputStream.skip(j) >= j) {
                        long j2 = r8.A02;
                        long j3 = -1;
                        if (j2 != -1) {
                            this.A00 = j2;
                        } else {
                            long length = this.A01.getLength();
                            if (length != -1) {
                                j3 = length - j;
                            }
                            this.A00 = j3;
                        }
                        this.A04 = true;
                        A03(r8);
                        return this.A00;
                    }
                    th = AnonymousClass6CA.A0M();
                } catch (NumberFormatException unused) {
                    th = new C140586tz("Resource identifier must be an integer.");
                }
            } else {
                th = new C140586tz("URI must use scheme rawresource");
            }
            throw th;
        } catch (IOException e) {
            throw new C140586tz(e);
        }
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
                    throw new C140586tz(e);
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
                throw new C140586tz((IOException) AnonymousClass6CA.A0M());
            }
        }
        return -1;
    }
}
