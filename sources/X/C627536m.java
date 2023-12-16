package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: X.36m  reason: invalid class name and case insensitive filesystem */
public final class C627536m {
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A02(X.C48092eK r14, java.io.File r15, int r16, int r17) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "file-utils/truncate-from-end compressedFile:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " compressedInputFileSizeLimit:"
            r1.append(r0)
            r3 = r16
            r1.append(r3)
            java.lang.String r0 = " bufferSize:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " uncompressedTruncatedFileSize:"
            r11 = r17
            X.C18260x0.A0y(r0, r1, r11)
            r4 = 0
            if (r15 != 0) goto L_0x0035
            java.lang.String r0 = "file-utils/truncate-from-end/no-compressed-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r4)
        L_0x0034:
            return r0
        L_0x0035:
            long r5 = r15.length()
            long r1 = (long) r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            java.lang.String r0 = "file-utils/truncate-from-end/too-small-no-truncation-required"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r15)
            return r0
        L_0x004a:
            r15.length()
            r13 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r0 = "uncompressed-crashlog"
            java.io.File r3 = java.io.File.createTempFile(r0, r4)     // Catch:{ IOException -> 0x0153, all -> 0x016a }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x0144 }
            r5.<init>(r3, r0)     // Catch:{ SyncFailedException -> 0x0144 }
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x013a }
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r15)     // Catch:{ all -> 0x013a }
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0130 }
            r6.<init>(r2, r13)     // Catch:{ all -> 0x0130 }
            r3.getAbsolutePath()     // Catch:{ all -> 0x0089 }
        L_0x006c:
            r1 = 0
            r10 = 0
        L_0x006e:
            if (r10 >= r11) goto L_0x0081
            int r0 = r17 - r10
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0089 }
            int r0 = r6.read(r12, r1, r0)     // Catch:{ all -> 0x0089 }
            if (r0 <= 0) goto L_0x0081
            r5.write(r12, r1, r0)     // Catch:{ all -> 0x0089 }
            int r10 = r10 + r0
            goto L_0x006e
        L_0x0081:
            r0 = 0
            r5.seek(r0)     // Catch:{ all -> 0x0089 }
            if (r10 == r11) goto L_0x006c
            goto L_0x0093
        L_0x0089:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0130 }
        L_0x0092:
            throw r1     // Catch:{ all -> 0x0130 }
        L_0x0093:
            r6.close()     // Catch:{ all -> 0x0130 }
            r2.close()     // Catch:{ all -> 0x013a }
            java.io.FileDescriptor r2 = r5.getFD()     // Catch:{ all -> 0x013a }
            r2.sync()     // Catch:{ all -> 0x013a }
            java.lang.String r2 = r15.getName()     // Catch:{ IOException -> 0x011c }
            java.io.File r9 = r14.A01(r2)     // Catch:{ IOException -> 0x011c }
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r9)     // Catch:{ IOException -> 0x011c }
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0112 }
            r8.<init>(r2)     // Catch:{ all -> 0x0112 }
            long r6 = (long) r10     // Catch:{ all -> 0x0112 }
            r5.seek(r6)     // Catch:{ all -> 0x0108 }
            int r15 = r17 - r10
            r6 = 0
            r14 = 0
        L_0x00b9:
            if (r14 >= r15) goto L_0x00cc
            int r7 = r15 - r14
            int r7 = java.lang.Math.min(r13, r7)     // Catch:{ all -> 0x0108 }
            int r7 = r5.read(r12, r6, r7)     // Catch:{ all -> 0x0108 }
            if (r7 <= 0) goto L_0x00cc
            r8.write(r12, r6, r7)     // Catch:{ all -> 0x0108 }
            int r14 = r14 + r7
            goto L_0x00b9
        L_0x00cc:
            r5.seek(r0)     // Catch:{ all -> 0x0108 }
            r1 = 0
        L_0x00d0:
            if (r1 >= r10) goto L_0x00e3
            int r0 = r10 - r1
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0108 }
            int r0 = r5.read(r12, r6, r0)     // Catch:{ all -> 0x0108 }
            if (r0 <= 0) goto L_0x00e3
            r8.write(r12, r6, r0)     // Catch:{ all -> 0x0108 }
            int r1 = r1 + r0
            goto L_0x00d0
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "file-utils/truncate-from-end uncompressedSize:"
            r1.append(r0)     // Catch:{ all -> 0x0108 }
            r1.append(r11)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = " compressedSize:"
            java.lang.String r0 = X.AnonymousClass000.A0N(r9, r0, r1)     // Catch:{ all -> 0x0108 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0108 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0108 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r9)     // Catch:{ all -> 0x0108 }
            r8.close()     // Catch:{ all -> 0x0112 }
            r2.close()     // Catch:{ IOException -> 0x011c }
            r5.close()     // Catch:{ SyncFailedException -> 0x0144 }
            goto L_0x0166
        L_0x0108:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x010d }
            goto L_0x0111
        L_0x010d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0112 }
        L_0x0111:
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x011c }
        L_0x011b:
            throw r1     // Catch:{ IOException -> 0x011c }
        L_0x011c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "file-utils/unable to create compressed file"
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x013a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x013a }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r4)     // Catch:{ all -> 0x013a }
            r5.close()     // Catch:{ SyncFailedException -> 0x0144 }
            goto L_0x0166
        L_0x0130:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x013a }
        L_0x0139:
            throw r1     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SyncFailedException -> 0x0144 }
        L_0x0143:
            throw r1     // Catch:{ SyncFailedException -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            java.lang.String r0 = "file-utils/truncate-from-end"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0151 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0151 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r4)     // Catch:{ IOException -> 0x0151 }
            goto L_0x0164
        L_0x0151:
            r2 = move-exception
            goto L_0x0155
        L_0x0153:
            r2 = move-exception
            r3 = r4
        L_0x0155:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "fileutils/unable to create tempfile/"
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x016c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x016c }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r4)     // Catch:{ all -> 0x016c }
        L_0x0164:
            if (r3 == 0) goto L_0x0034
        L_0x0166:
            r3.delete()
            return r0
        L_0x016a:
            r0 = move-exception
            goto L_0x016e
        L_0x016c:
            r0 = move-exception
            r4 = r3
        L_0x016e:
            if (r4 == 0) goto L_0x0173
            r4.delete()
        L_0x0173:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627536m.A02(X.2eK, java.io.File, int, int):android.util.Pair");
    }

    public static File A06(String str, String str2) {
        try {
            File A04 = C18330xA.A04(str, str2);
            if (A04.getCanonicalPath().startsWith(str)) {
                return A04;
            }
            return null;
        } catch (IOException unused) {
        }
    }

    public static void A0A(C130786cX r5, File file) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1, false);
        try {
            deflaterOutputStream = new DeflaterOutputStream(AnonymousClass0x9.A0h(file), deflater);
            int A0D = r5.A0D((C186358vA) null);
            if (A0D > 4096) {
                A0D = ZipDecompressor.UNZIP_BUFFER_SIZE;
            }
            C130306bk r1 = new C130306bk(deflaterOutputStream, A0D);
            r5.Bsj(r1);
            if (r1.A00 > 0) {
                r1.A0L();
            }
            deflaterOutputStream.close();
            deflater.end();
            return;
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static boolean A0R(File file, InputStream inputStream) {
        BufferedOutputStream A0d;
        try {
            A0d = AnonymousClass0x7.A0d(file);
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A0d.write(bArr, 0, read);
                } else {
                    A0d.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "FileUtils/saveInputStreamToFile/could not save file to:", A0o);
            C18280x3.A1C(A0o, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static boolean A0S(File file, InputStream inputStream, long j) {
        BufferedOutputStream A0d;
        try {
            A0d = AnonymousClass0x7.A0d(file);
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            long j2 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A0d.write(bArr, 0, read);
                    j2 += (long) read;
                } else {
                    A0d.close();
                    return true;
                }
            } while (j2 <= j);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FileUtils/saveInputStreamToFileWithMaxBytes file size of ");
            A0o.append(j2);
            throw AnonymousClass002.A0C(AnonymousClass000.A0Z(" but max of ", A0o, j));
        } catch (IOException e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "FileUtils/saveInputStreamToFileWithMaxBytes/could not save file to:", A0o2);
            C18280x3.A1C(A0o2, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] A0V(File file) {
        InflaterInputStream inflaterInputStream;
        Inflater inflater = new Inflater(false);
        try {
            inflaterInputStream = new InflaterInputStream(AnonymousClass0x9.A0g(file), inflater);
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            A0I(inflaterInputStream, A0e);
            byte[] byteArray = A0e.toByteArray();
            inflaterInputStream.close();
            inflater.end();
            return byteArray;
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
        throw th;
    }

    public static long A00(AnonymousClass0QU r8, File file) {
        if (r8 != null) {
            r8.A02();
        }
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList A18 = AnonymousClass0x9.A18();
        A18.add(file);
        long j = 0;
        while (A18.peek() != null) {
            if (r8 != null) {
                r8.A02();
            }
            Object poll = A18.poll();
            C626936e.A06(poll);
            File[] listFiles = ((File) poll).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (r8 != null) {
                        r8.A02();
                    }
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            A18.add(file2);
                        } else {
                            j += file2.length();
                        }
                    }
                }
            }
        }
        return j;
    }

    public static Uri A01(Context context, File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        return FileProvider.A00(context, file, C58152un.A07);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088 A[SYNTHETIC, Splitter:B:49:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0093 A[SYNTHETIC, Splitter:B:54:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2 A[SYNTHETIC, Splitter:B:59:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b8 A[SYNTHETIC, Splitter:B:72:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00c2 A[SYNTHETIC, Splitter:B:77:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d0 A[SYNTHETIC, Splitter:B:82:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A05(java.io.File r13, java.io.File r14, java.lang.String r15) {
        /*
            java.lang.String r3 = "compress/close/fail "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r15)
            java.lang.String r0 = ".gz"
            java.io.File r12 = X.C18270x1.A0A(r14, r0, r1)
            boolean r0 = r12.exists()
            r11 = 0
            if (r0 == 0) goto L_0x001f
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "compress/fail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r11
        L_0x001f:
            java.io.FileOutputStream r4 = X.AnonymousClass0x9.A0h(r12)     // Catch:{ FileNotFoundException -> 0x007d, all -> 0x0079 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ FileNotFoundException -> 0x0076, all -> 0x00b4 }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0076, all -> 0x00b4 }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r9 = new byte[r10]     // Catch:{ FileNotFoundException -> 0x0073, all -> 0x0071 }
            long r7 = r13.length()     // Catch:{ FileNotFoundException -> 0x0073, all -> 0x0071 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            java.io.BufferedInputStream r5 = X.AnonymousClass0x7.A0c(r13)     // Catch:{ FileNotFoundException -> 0x0073, all -> 0x0071 }
            r2 = 0
            int r1 = r5.read(r9, r2, r10)     // Catch:{ FileNotFoundException -> 0x004b }
        L_0x0040:
            r0 = -1
            if (r1 == r0) goto L_0x004e
            r6.write(r9, r2, r1)     // Catch:{ FileNotFoundException -> 0x004b }
            int r1 = r5.read(r9, r2, r10)     // Catch:{ FileNotFoundException -> 0x004b }
            goto L_0x0040
        L_0x004b:
            r1 = move-exception
            goto L_0x0081
        L_0x004d:
            r5 = r11
        L_0x004e:
            if (r5 == 0) goto L_0x0059
            r5.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0059
        L_0x0054:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r12 = r11
        L_0x0059:
            r6.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0066
        L_0x005d:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1O(r0, r3, r1)
            r12 = r11
        L_0x0066:
            r4.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            goto L_0x00ab
        L_0x0070:
            return r12
        L_0x0071:
            r2 = move-exception
            goto L_0x00b6
        L_0x0073:
            r1 = move-exception
            r5 = r11
            goto L_0x0081
        L_0x0076:
            r1 = move-exception
            r6 = r11
            goto L_0x0080
        L_0x0079:
            r2 = move-exception
            r4 = r11
            r6 = r11
            goto L_0x00b6
        L_0x007d:
            r1 = move-exception
            r4 = r11
            r6 = r11
        L_0x0080:
            r5 = r11
        L_0x0081:
            java.lang.String r0 = "compress/fail "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x0091
            r5.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0091
        L_0x008c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r12 = r11
        L_0x0091:
            if (r6 == 0) goto L_0x00a0
            r6.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x00a0
        L_0x0097:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1O(r0, r3, r1)
            r12 = r11
        L_0x00a0:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00af
        L_0x00a6:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
        L_0x00ab:
            X.C18260x0.A1O(r0, r3, r1)
            return r11
        L_0x00af:
            return r12
        L_0x00b0:
            return r12
        L_0x00b1:
            r2 = move-exception
            r11 = r5
            goto L_0x00b6
        L_0x00b4:
            r2 = move-exception
            r6 = r11
        L_0x00b6:
            if (r11 == 0) goto L_0x00c0
            r11.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00c0:
            if (r6 == 0) goto L_0x00ce
            r6.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00ce
        L_0x00c6:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1O(r0, r3, r1)
        L_0x00ce:
            if (r4 == 0) goto L_0x00dc
            r4.close()     // Catch:{ IOException -> 0x00d4 }
            throw r2
        L_0x00d4:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1O(r0, r3, r1)
        L_0x00dc:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627536m.A05(java.io.File, java.io.File, java.lang.String):java.io.File");
    }

    public static String A08(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String A09(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf2, lastIndexOf);
        }
        return str.substring(lastIndexOf2);
    }

    public static void A0H(File file, byte[] bArr) {
        if (bArr != null) {
            BufferedOutputStream A0d = AnonymousClass0x7.A0d(file);
            try {
                A0d.write(bArr);
                A0d.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public static void A0I(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0J(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        long j = 0;
        while (true) {
            FileChannel fileChannel2 = fileChannel;
            if (j < fileChannel.size()) {
                fileChannel2.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
                j += 131072;
            } else {
                return;
            }
        }
    }

    public static File A03(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File A0A = AnonymousClass002.A0A(externalCacheDir, str);
            if (A0A.exists() || A0A.mkdirs()) {
                return A0A;
            }
        }
        Log.e("FileUtils/createCacheFolder couldn't create external cache folder");
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File A0A2 = AnonymousClass002.A0A(cacheDir, str);
            if (A0A2.exists() || A0A2.mkdirs()) {
                return A0A2;
            }
        }
        return null;
    }

    public static File A04(Uri uri) {
        if (uri.getPath() == null || (uri.getScheme() != null && !"file".equals(uri.getScheme()))) {
            return null;
        }
        return C18310x6.A0a(uri);
    }

    public static String A07(File file, MessageDigest messageDigest, long j) {
        BufferedInputStream bufferedInputStream;
        if (!file.exists() || j > file.length()) {
            return null;
        }
        messageDigest.reset();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        try {
            bufferedInputStream = new BufferedInputStream(A0g);
            long j2 = 0;
            int i = 0;
            while (true) {
                if (i == -1) {
                    break;
                }
                i = bufferedInputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                if (i > 0) {
                    long j3 = ((long) i) + j2;
                    if (j3 >= j) {
                        messageDigest.update(bArr, 0, (int) (j - j2));
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                    j2 = j3;
                }
            }
            String A07 = C627236i.A07(messageDigest.digest());
            bufferedInputStream.close();
            A0g.close();
            return A07;
        } catch (Throwable th) {
            try {
                A0g.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0B(C61072zf r24, File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            long j = 0;
            for (File length : listFiles) {
                j += length.length();
            }
            if (j > 0) {
                ArrayList A0i = AnonymousClass0x2.A0i(listFiles);
                AnonymousClass4IU.A00(A0i, 18);
                long A02 = r24.A02();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = A0i.iterator();
                while (it.hasNext()) {
                    File A0f = AnonymousClass0x9.A0f(it);
                    long lastModified = A0f.lastModified();
                    if (currentTimeMillis - lastModified >= 604800000 || j > 20000000 || (j > 2000000 && 50000000 > A02 && A02 > 0)) {
                        long length2 = A0f.length();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18270x1.A0y(A0f, "cleanup/", A0o);
                        A0o.append(":");
                        A0o.append(currentTimeMillis);
                        A0o.append(" - ");
                        A0o.append(lastModified);
                        A0o.append(" fileLength=");
                        A0o.append(length2);
                        A0o.append(" directoryLengthBeforeCleanup=");
                        A0o.append(j);
                        C18260x0.A12(" storageAvailableBeforeCleanup=", A0o, A02);
                        if (!A0f.delete()) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            C18260x0.A1L(A0o2, AnonymousClass0x7.A0p(A0f, "cleanup/failed to delete ", A0o2));
                        } else {
                            j -= length2;
                            A02 += length2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0C(AnonymousClass306 r2, File file, File file2) {
        FileOutputStream A0h;
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        try {
            r2.A05(A0g);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                C18260x0.A1D("fileutils/copymedia/parent/mk ", AnonymousClass001.A0o(), parentFile.mkdirs());
            }
            A0h = AnonymousClass0x9.A0h(file2);
            A0I(A0g, A0h);
            A0h.close();
            A0g.close();
            return;
        } catch (Throwable th) {
            try {
                A0g.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0D(AnonymousClass306 r2, File file, File file2) {
        if (!file.renameTo(file2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("fileutils/moveFile/rename failed, copying and deleting: ");
            A0o.append(file);
            C18260x0.A1P(A0o, " -> ", file2);
            A0C(r2, file, file2);
            A0O(file);
        }
    }

    public static void A0E(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > j) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A0y(file2, "cleanup/", A0o);
                    C18290x4.A1Q(A0o, ":");
                    A0o.append(" - ");
                    C18260x0.A1I(A0o, file2.lastModified());
                    if (!file2.delete()) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C18260x0.A1L(A0o2, AnonymousClass0x7.A0p(file2, "cleanup/failed to delete ", A0o2));
                    }
                }
            }
        }
    }

    public static void A0F(File file, String str) {
        int length;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null && (length = listFiles.length) > 0) {
            int i = 0;
            do {
                File file2 = listFiles[i];
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A0y(file2, str, A0o);
                C18280x3.A11(file2, " ", A0o);
                A0o.append(" drw=");
                String str2 = "1";
                String str3 = "0";
                if (file2.isDirectory()) {
                    str3 = str2;
                }
                A0o.append(str3);
                String str4 = "0";
                if (file2.canRead()) {
                    str4 = str2;
                }
                A0o.append(str4);
                if (!file2.canWrite()) {
                    str2 = "0";
                }
                C18260x0.A1L(A0o, str2);
                i++;
            } while (i < length);
        }
    }

    public static void A0G(File file, Set set) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("file-utils/deletefilesindir/delete/");
                    C18260x0.A1J(A0o, file2.getPath());
                    A0O(file2);
                } else if (set == null || !set.contains(file2.getName())) {
                    A0G(file2, (Set) null);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("file-utils/deletefilesindir/exclude/");
                    C18260x0.A1J(A0o2, file2.getPath());
                }
            }
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("file-utils/deletefilesindir/delete/dir/");
        C18260x0.A1J(A0o3, file.getPath());
        A0O(file);
    }

    public static boolean A0K(Uri uri, C620633i r6, AnonymousClass5ZR r7, boolean z) {
        String scheme = uri.getScheme();
        if (!"settings".equals(uri.getAuthority()) && ("file".equals(scheme) || "content".equals(scheme))) {
            try {
                AnonymousClass5UR A0R = r6.A0R();
                if (A0R == null) {
                    Log.w("file-utils/ringtone-available/false cr=null");
                    return false;
                }
                C624535b.A03(A0R.A06(uri));
                return true;
            } catch (SQLiteException | FileNotFoundException | NullPointerException e) {
                Log.i(AnonymousClass000.A0P(uri, "file-utils/ringtone-available/false/file-not-found ", AnonymousClass001.A0o()), e);
                return false;
            } catch (IllegalStateException e2) {
                Log.i(AnonymousClass000.A0P(uri, "file-utils/ringtone-available/false/illegal-state ", AnonymousClass001.A0o()), e2);
                return false;
            } catch (IllegalArgumentException e3) {
                Log.i(AnonymousClass000.A0P(uri, "file-utils/ringtone-available/false/illegal-argument ", AnonymousClass001.A0o()), e3);
                return false;
            } catch (SecurityException e4) {
                if (uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    Log.i("file-utils/ringtone-available/false/access-denied", e4);
                    if (!r7.A0E()) {
                        return z;
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A1H(A0o, "file-utils/ringtone-available/true/cannot-check ", uri);
                    Log.i(A0o.toString(), e4);
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean A0L(C56512s6 r3, File file, File file2) {
        AnonymousClass202 r32;
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(file);
            try {
                r32 = new AnonymousClass202(r3.A00(), file2);
                byte[] bArr = new byte[AnonymousClass35S.A0F];
                while (true) {
                    int read = A0g.read(bArr);
                    if (read >= 0) {
                        r32.write(bArr, 0, read);
                    } else {
                        r32.close();
                        A0g.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyexternalfile/failed to copy external file", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static boolean A0M(C56512s6 r2, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fileutils/moveFile/rename failed, copying and deleting: ");
        A0o.append(file);
        C18260x0.A1P(A0o, " -> ", file2);
        boolean A0L = A0L(r2, file, file2);
        if (!file.delete()) {
            Log.w("fileutils/moveFile/could not delete source file");
        }
        return A0L;
    }

    public static boolean A0N(C48092eK r3, File file, File file2) {
        AnonymousClass202 r32;
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(file);
            try {
                r32 = new AnonymousClass202(r3.A00, file2);
                byte[] bArr = new byte[AnonymousClass35S.A0F];
                while (true) {
                    int read = A0g.read(bArr);
                    if (read >= 0) {
                        r32.write(bArr, 0, read);
                    } else {
                        r32.close();
                        A0g.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyinternalfile/failed to copy internal file", e);
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static boolean A0O(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        C18260x0.A1S(AnonymousClass001.A0o(), "file-utils/delete-file/failed ", file);
        return false;
    }

    public static boolean A0P(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File A0P : listFiles) {
                        if (!A0P(A0P)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(file, "trash/delete-recursive/out-of-memory ", A0o);
                C18280x3.A1C(A0o, e);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0Q(File file) {
        StringBuilder sb;
        String str;
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            boolean isDirectory = file.isDirectory();
            sb = AnonymousClass001.A0o();
            if (isDirectory) {
                C18260x0.A0r("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ", absolutePath, sb);
                A0E(file, -1);
                return true;
            }
            str = "FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.";
        } else if (file.mkdirs()) {
            return true;
        } else {
            sb = AnonymousClass001.A0o();
            str = "FileUtils/prepareEmptyDir/Could not make directory ";
        }
        C18260x0.A0r(str, absolutePath, sb);
        return false;
    }

    public static boolean A0T(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (!str.matches("[\\w-.,'\\s]+")) {
                str2 = "FileUtils/fileNameInvalid/file name contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character";
            } else if (!str.contains("..")) {
                return false;
            } else {
                str2 = "FileUtils/fileNameInvalid/file name cannot contain ..";
            }
            Log.e(str2);
        }
        return true;
    }

    public static byte[] A0U(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        try {
            A0g.read(bArr);
            A0g.close();
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
