package X;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0hy  reason: invalid class name and case insensitive filesystem */
public final class C10460hy implements Closeable {
    public final long A00;
    public final File A01;
    public final File A02;
    public final RandomAccessFile A03;
    public final FileChannel A04;
    public final FileLock A05;

    /* JADX INFO: finally extract failed */
    public static long A00(File file) {
        ZipException zipException;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            long j = 0;
            if (length >= 0) {
                long j2 = length - 65536;
                if (j2 >= 0) {
                    j = j2;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L);
                        int min = (int) Math.min(16384, reverseBytes2);
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = randomAccessFile.read(bArr, 0, min);
                            if (read == -1) {
                                break;
                            }
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            min = (int) Math.min(16384, reverseBytes2);
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        if (value == -1) {
                            return value - 1;
                        }
                        return value;
                    }
                    length--;
                } while (length >= j);
                zipException = new ZipException("End Of Central Directory signature not found");
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("File too short to be a zip file: ");
                zipException = new ZipException(AnonymousClass001.A0k(A0o, randomAccessFile.length()));
            }
            throw zipException;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public final List A02() {
        AnonymousClass0FA r3;
        boolean z;
        IOException th;
        ZipOutputStream zipOutputStream;
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        File file = this.A02;
        A0o.append(file.getName());
        String A0X = AnonymousClass000.A0X(".classes", A0o);
        File file2 = this.A01;
        File[] listFiles = file2.listFiles(new C10490i1(this));
        if (listFiles == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A0z(file2, "Failed to list secondary dex dir content (", A0o2);
            AnonymousClass000.A1F(").", "MultiDex", A0o2);
        } else {
            for (File file3 : listFiles) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass000.A0z(file3, "Trying to delete old file ", A0o3);
                Log.i("MultiDex", AnonymousClass000.A0N(file3, " of size ", A0o3));
                boolean delete = file3.delete();
                StringBuilder A0o4 = AnonymousClass001.A0o();
                if (!delete) {
                    AnonymousClass000.A0z(file3, "Failed to delete old file ", A0o4);
                    Log.w("MultiDex", A0o4.toString());
                } else {
                    AnonymousClass000.A0z(file3, "Deleted old file ", A0o4);
                    Log.i("MultiDex", A0o4.toString());
                }
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder A0l = AnonymousClass000.A0l("classes");
            A0l.append(2);
            ZipEntry entry = zipFile.getEntry(AnonymousClass000.A0X(".dex", A0l));
            int i = 2;
            while (entry != null) {
                StringBuilder A0l2 = AnonymousClass000.A0l(A0X);
                A0l2.append(i);
                r3 = new AnonymousClass0FA(file2, AnonymousClass000.A0X(".zip", A0l2));
                A0s.add(r3);
                Log.i("MultiDex", AnonymousClass000.A0P(r3, "Extraction is needed for file ", AnonymousClass001.A0o()));
                int i2 = 0;
                z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    File createTempFile = File.createTempFile(AnonymousClass000.A0V("tmp-", A0X, AnonymousClass001.A0o()), ".zip", r3.getParentFile());
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    AnonymousClass000.A0z(createTempFile, "Extracting ", A0o5);
                    Log.i("MultiDex", A0o5.toString());
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        ZipEntry zipEntry = new ZipEntry("classes.dex");
                        zipEntry.setTime(entry.getTime());
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bArr = new byte[16384];
                        for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        zipOutputStream.close();
                        if (createTempFile.setReadOnly()) {
                            StringBuilder A0o6 = AnonymousClass001.A0o();
                            AnonymousClass000.A0z(r3, "Renaming to ", A0o6);
                            Log.i("MultiDex", A0o6.toString());
                            if (createTempFile.renameTo(r3)) {
                                A01(inputStream);
                                createTempFile.delete();
                                r3.crc = A00(r3);
                                z = true;
                                StringBuilder A0o7 = AnonymousClass001.A0o();
                                A0o7.append("Extraction ");
                                if (z) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                A0o7.append(str);
                                AnonymousClass000.A10(r3, " '", A0o7);
                                A0o7.append("': length ");
                                A0o7.append(r3.length());
                                A0o7.append(" - crc: ");
                                Log.i("MultiDex", AnonymousClass001.A0k(A0o7, r3.crc));
                                if (!z) {
                                    r3.delete();
                                    if (r3.exists()) {
                                        StringBuilder A0o8 = AnonymousClass001.A0o();
                                        AnonymousClass000.A0z(r3, "Failed to delete corrupted secondary dex '", A0o8);
                                        AnonymousClass000.A1F("'", "MultiDex", A0o8);
                                    }
                                }
                            } else {
                                StringBuilder A0o9 = AnonymousClass001.A0o();
                                AnonymousClass000.A10(createTempFile, "Failed to rename \"", A0o9);
                                AnonymousClass000.A10(r3, "\" to \"", A0o9);
                                th = AnonymousClass002.A0C(AnonymousClass000.A0X("\"", A0o9));
                            }
                        } else {
                            StringBuilder A0o10 = AnonymousClass001.A0o();
                            AnonymousClass000.A10(createTempFile, "Failed to mark readonly \"", A0o10);
                            AnonymousClass000.A10(r3, "\" (tmp of \"", A0o10);
                            th = AnonymousClass002.A0C(AnonymousClass000.A0X("\")", A0o10));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A01(inputStream);
                        createTempFile.delete();
                    }
                    throw th;
                }
                if (z) {
                    i++;
                    StringBuilder A0l3 = AnonymousClass000.A0l("classes");
                    A0l3.append(i);
                    entry = zipFile.getEntry(AnonymousClass000.A0X(".dex", A0l3));
                } else {
                    StringBuilder A0o11 = AnonymousClass001.A0o();
                    AnonymousClass000.A10(r3, "Could not create zip file ", A0o11);
                    A0o11.append(" for secondary dex (");
                    A0o11.append(i);
                    th = AnonymousClass002.A0C(AnonymousClass000.A0e(A0o11));
                    throw th;
                }
            }
            try {
                zipFile.close();
                return A0s;
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
                return A0s;
            }
        } catch (IOException e2) {
            StringBuilder A0o12 = AnonymousClass001.A0o();
            AnonymousClass000.A10(r3, "Failed to read crc from ", A0o12);
            Log.w("MultiDex", A0o12.toString(), e2);
            z = false;
        } catch (Throwable th3) {
            try {
                zipFile.close();
                throw th3;
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        if (r8.getLong(X.AnonymousClass000.A0X("crc", X.AnonymousClass000.A0l("")), -1) != r6) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A03(android.content.Context r23, boolean r24) {
        /*
            r22 = this;
            java.lang.String r19 = ""
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MultiDexExtractor.load("
            r1.append(r0)
            r12 = r22
            java.io.File r0 = r12.A02
            r20 = r0
            java.lang.String r0 = r20.getPath()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r5 = r24
            r1.append(r5)
            r1.append(r0)
            r0 = r19
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0e(r1)
            java.lang.String r11 = "MultiDex"
            android.util.Log.i(r11, r0)
            java.nio.channels.FileLock r0 = r12.A05
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0213
            r21 = r23
            if (r24 != 0) goto L_0x015a
            long r6 = r12.A00
            java.lang.String r2 = "multidex.version"
            r1 = 4
            r0 = r21
            android.content.SharedPreferences r8 = r0.getSharedPreferences(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            java.lang.String r0 = "timestamp"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            r0 = -1
            long r13 = r8.getLong(r3, r0)
            long r9 = r20.lastModified()
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            r3 = 1
            long r9 = r9 - r3
        L_0x0065:
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x007c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r19)
            java.lang.String r3 = "crc"
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r4)
            long r3 = r8.getLong(r3, r0)
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "loading existing secondary dex files"
            android.util.Log.i(r11, r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = r20.getName()     // Catch:{ IOException -> 0x0178 }
            r1.append(r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = ".classes"
            java.lang.String r18 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0178 }
            r1 = 4
            r0 = r21
            android.content.SharedPreferences r13 = r0.getSharedPreferences(r2, r1)     // Catch:{ IOException -> 0x0178 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "dex.number"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0178 }
            r0 = 1
            int r17 = r13.getInt(r1, r0)     // Catch:{ IOException -> 0x0178 }
            int r0 = r17 + -1
            java.util.ArrayList r10 = X.AnonymousClass002.A0I(r0)     // Catch:{ IOException -> 0x0178 }
            r9 = 2
        L_0x00b2:
            r0 = r17
            if (r9 > r0) goto L_0x0200
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r18)     // Catch:{ IOException -> 0x0178 }
            r1.append(r9)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = ".zip"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0178 }
            java.io.File r0 = r12.A01     // Catch:{ IOException -> 0x0178 }
            X.0FA r8 = new X.0FA     // Catch:{ IOException -> 0x0178 }
            r8.<init>(r0, r1)     // Catch:{ IOException -> 0x0178 }
            boolean r0 = r8.isFile()     // Catch:{ IOException -> 0x0178 }
            if (r0 == 0) goto L_0x0146
            long r0 = A00(r8)     // Catch:{ IOException -> 0x0178 }
            r8.crc = r0     // Catch:{ IOException -> 0x0178 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "dex.crc."
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r9)     // Catch:{ IOException -> 0x0178 }
            r0 = -1
            long r4 = r13.getLong(r2, r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r19)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r2 = "dex.time."
            java.lang.String r2 = X.AnonymousClass000.A0Y(r2, r3, r9)     // Catch:{ IOException -> 0x0178 }
            long r2 = r13.getLong(r2, r0)     // Catch:{ IOException -> 0x0178 }
            long r0 = r8.lastModified()     // Catch:{ IOException -> 0x0178 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0108
            long r14 = r8.crc     // Catch:{ IOException -> 0x0178 }
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0108
            r10.add(r8)     // Catch:{ IOException -> 0x0178 }
            int r9 = r9 + 1
            goto L_0x00b2
        L_0x0108:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0178 }
            java.lang.String r9 = "Invalid extracted dex: "
            r10.append(r9)     // Catch:{ IOException -> 0x0178 }
            r10.append(r8)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r9 = " (key \""
            r10.append(r9)     // Catch:{ IOException -> 0x0178 }
            r9 = r19
            r10.append(r9)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r9 = "\"), expected modification time: "
            r10.append(r9)     // Catch:{ IOException -> 0x0178 }
            r10.append(r2)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r2 = ", modification time: "
            r10.append(r2)     // Catch:{ IOException -> 0x0178 }
            r10.append(r0)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = ", expected crc: "
            r10.append(r0)     // Catch:{ IOException -> 0x0178 }
            r10.append(r4)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = ", file crc: "
            r10.append(r0)     // Catch:{ IOException -> 0x0178 }
            long r0 = r8.crc     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = X.AnonymousClass001.A0k(r10, r0)     // Catch:{ IOException -> 0x0178 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0178 }
            goto L_0x0159
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "Missing extracted secondary dex file '"
            X.AnonymousClass000.A0z(r8, r0, r1)     // Catch:{ IOException -> 0x0178 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0178 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0178 }
        L_0x0159:
            throw r0     // Catch:{ IOException -> 0x0178 }
        L_0x015a:
            if (r24 == 0) goto L_0x0175
            java.lang.String r0 = "Forced extraction must be performed."
        L_0x015e:
            android.util.Log.i(r11, r0)
            java.util.List r10 = r12.A02()
            long r0 = r20.lastModified()
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0172
            r2 = 1
            long r0 = r0 - r2
        L_0x0172:
            long r6 = r12.A00
            goto L_0x018f
        L_0x0175:
            java.lang.String r0 = "Detected that extraction must be performed."
            goto L_0x015e
        L_0x0178:
            r1 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r11, r0, r1)
            java.util.List r10 = r12.A02()
            long r0 = r20.lastModified()
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x018f
            r2 = 1
            long r0 = r0 - r2
        L_0x018f:
            java.lang.String r4 = "multidex.version"
            r3 = 4
            r2 = r21
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r19)
            java.lang.String r2 = "timestamp"
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r4)
            r3.putLong(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            java.lang.String r0 = "crc"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r3.putLong(r0, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            java.lang.String r0 = "dex.number"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r10.size()
            int r0 = r0 + 1
            r3.putInt(r1, r0)
            java.util.Iterator r6 = r10.iterator()
            r5 = 2
        L_0x01ce:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r4 = r6.next()
            X.0FA r4 = (X.AnonymousClass0FA) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            java.lang.String r0 = "dex.crc."
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r5)
            long r0 = r4.crc
            r3.putLong(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            java.lang.String r0 = "dex.time."
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r5)
            long r0 = r4.lastModified()
            r3.putLong(r2, r0)
            int r5 = r5 + 1
            goto L_0x01ce
        L_0x01fd:
            r3.commit()
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "load found "
            X.AnonymousClass000.A1H(r0, r1, r10)
            java.lang.String r0 = " secondary dex files"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.i(r11, r0)
            return r10
        L_0x0213:
            java.lang.String r0 = "MultiDexExtractor was closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10460hy.A03(android.content.Context, boolean):java.util.List");
    }

    public void close() {
        this.A05.release();
        this.A04.close();
        this.A03.close();
    }

    public C10460hy(File file, File file2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A0z(file, "MultiDexExtractor(", A0o);
        AnonymousClass000.A0z(file2, ", ", A0o);
        Log.i("MultiDex", AnonymousClass000.A0e(A0o));
        this.A02 = file;
        this.A01 = file2;
        this.A00 = A00(file);
        File A0A = AnonymousClass002.A0A(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(A0A, "rw");
        this.A03 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.A04 = channel;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A0z(A0A, "Blocking on lock ", A0o2);
            Log.i("MultiDex", A0o2.toString());
            this.A05 = channel.lock();
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append(A0A.getPath());
            Log.i("MultiDex", AnonymousClass000.A0X(" locked", A0o3));
        } catch (IOException | Error | RuntimeException e) {
            A01(this.A04);
            throw e;
        } catch (IOException | Error | RuntimeException e2) {
            A01(this.A03);
            throw e2;
        }
    }

    public static void A01(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
