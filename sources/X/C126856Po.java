package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: X.6Po  reason: invalid class name and case insensitive filesystem */
public final class C126856Po extends C1691088a {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C126856Po(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
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
            java.io.FileInputStream r0 = r4.A03     // Catch:{ IOException -> 0x0027 }
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
            X.6tn r0 = new X.6tn     // Catch:{ all -> 0x004e }
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0027:
            r1 = move-exception
            X.6tn r0 = new X.6tn     // Catch:{ all -> 0x002e }
            r0.<init>(r1)     // Catch:{ all -> 0x002e }
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
            X.6tn r0 = new X.6tn     // Catch:{ all -> 0x0046 }
            r0.<init>(r1)     // Catch:{ all -> 0x0046 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C126856Po.close():void");
    }

    public Uri BE6() {
        return this.A02;
    }

    public long Bfx(C157677ih r13) {
        Throwable th;
        try {
            Uri uri = r13.A04;
            this.A02 = uri;
            A01();
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, "r");
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A03 = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j = r13.A03;
                long skip = fileInputStream.skip(j + startOffset) - startOffset;
                if (skip == j) {
                    long j2 = r13.A02;
                    if (j2 != -1) {
                        this.A00 = j2;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.A00 = -1;
                            } else {
                                long position = size - channel.position();
                                this.A00 = position;
                                if (position < 0) {
                                    th = AnonymousClass6CA.A0M();
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.A00 = j3;
                            if (j3 < 0) {
                                th = AnonymousClass6CA.A0M();
                            }
                        }
                    }
                    this.A04 = true;
                    A03(r13);
                    return this.A00;
                }
                th = AnonymousClass6CA.A0M();
            } else {
                th = new FileNotFoundException(AnonymousClass000.A0P(uri, "Could not open file descriptor for: ", AnonymousClass001.A0o()));
            }
            throw th;
        } catch (IOException e) {
            throw new C140476tn(e);
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
                    throw new C140476tn(e);
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
                throw new C140476tn(AnonymousClass6CA.A0M());
            }
        }
        return -1;
    }
}
