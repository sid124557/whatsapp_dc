package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.concurrent.FutureTask;

/* renamed from: X.36U  reason: invalid class name */
public class AnonymousClass36U {
    public static HashSet A00;

    public static int A00(AnonymousClass7L0 r4, C47662dc r5, File file, String str, URL url) {
        String str2 = r5.A0G;
        if (str2 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash=");
            C18260x0.A1M(A0o, r5.A0H);
            str2 = r4.A01;
        }
        if (str == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C47662dc.A00(r5, "MediaDownload/MMS download failed to calculate hash; mediaHash=", A0o2);
            A0o2.append("; url=");
            A0o2.append(url);
            AnonymousClass000.A10(file, "; downloadFile=", A0o2);
            A0o2.append("; downloadFile.exists?=");
            A0o2.append(file.exists());
            AnonymousClass0x2.A19(A0o2);
            return 27;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C47662dc.A00(r5, "MediaDownload/MMS download failed due to hash mismatch; mediaHash=", A0o3);
            A0o3.append("; url=");
            A0o3.append(url);
            A0o3.append("; receivedHash=");
            A0o3.append(str2);
            C18260x0.A0t("; localHash=", str, A0o3);
            return 32;
        }
    }

    public static int A01(C47662dc r7, String str, URL url) {
        if (str == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            String str2 = r7.A0H;
            A0o.append(str2);
            A0o.append("; url=");
            A0o.append(url);
            C18260x0.A0p("; mediaHash=", str2, "; calculatedHash=", str, A0o);
            A0o.append("; mediaSize=");
            A0o.append(r7.A07);
            AnonymousClass0x2.A19(A0o);
            return 1;
        }
        String str3 = r7.A0H;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass001.A1K("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=", str3, "; url=", A0o2);
        A0o2.append(url);
        C18260x0.A0p("; mediaHash=", str3, "; calculatedHash=", str, A0o2);
        A0o2.append("; mediaSize=");
        A0o2.append(r7.A07);
        AnonymousClass0x2.A19(A0o2);
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (X.C30471mV) r14;
        r4 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.C64393Dh r11, X.C61072zf r12, X.AnonymousClass1VX r13, X.C624134x r14) {
        /*
            boolean r0 = r14 instanceof X.C30471mV
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r0 = r14
            X.1mV r0 = (X.C30471mV) r0
            r6 = 0
            r9 = 0
            boolean r10 = r14 instanceof X.AnonymousClass4DU
            X.38t r5 = X.AnonymousClass36O.A02(r14)
            java.lang.String r7 = r0.A04
            java.lang.String r8 = r0.A07
            r4 = r11
            java.io.File r1 = r4.A0M(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0027
            X.3QS r0 = new X.3QS
            r0.<init>(r12, r13, r1)
            r0.Brp()
            long r0 = r0.A00
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36U.A02(X.3Dh, X.2zf, X.1VX, X.34x):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C30471mV A04(X.C55682qk r15, X.AnonymousClass319 r16, X.C47662dc r17, X.AnonymousClass1R1 r18) {
        /*
            r8 = r17
            java.util.concurrent.Callable r0 = r8.A0N     // Catch:{ Exception -> 0x000d }
            java.lang.Object r1 = r0.call()     // Catch:{ Exception -> 0x000d }
            X.2Lt r1 = (X.C41832Lt) r1     // Catch:{ Exception -> 0x000d }
            if (r1 == 0) goto L_0x0012
            goto L_0x0015
        L_0x000d:
            java.lang.String r0 = "failed to get streaming sidecar"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0012:
            r2 = -1
            goto L_0x0029
        L_0x0015:
            X.38t r0 = r8.A0A
            boolean r0 = X.AnonymousClass36O.A04(r0)
            if (r0 == 0) goto L_0x0012
            int[] r2 = r1.A01
            if (r2 == 0) goto L_0x0012
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x0012
            long r2 = X.C18310x6.A0C(r2)
        L_0x0029:
            java.lang.String r0 = "mediadownload/findexistingfile"
            X.33M r1 = X.AnonymousClass33M.A01(r0)
            java.lang.String r7 = r8.A0H
            X.C626936e.A06(r7)
            X.38t r0 = r8.A0A
            byte r0 = r0.A00
            r14 = 0
            r4 = r16
            java.util.Collection r4 = r4.A0H(r7, r0)
            r1.A07()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/findExistingFile/sameFileMessages.size() = "
            r1.append(r0)
            int r0 = r4.size()
            X.C18260x0.A1F(r1, r0)
            java.util.Iterator r13 = r4.iterator()
        L_0x0056:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x013d
            X.1mV r1 = X.C18320x8.A0S(r13)
            r0 = r18
            int r4 = X.C989053r.A00(r1, r0)
            int r0 = r8.A01
            if (r4 != r0) goto L_0x0056
            java.io.File r6 = X.C30471mV.A01(r1)
            X.C626936e.A06(r6)
            java.lang.String r12 = r8.A0M
            java.lang.String r5 = "MediaDownload/call/could not get hash for existing file; file="
            if (r12 == 0) goto L_0x010c
            r9 = -1
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x010c
            java.lang.String r11 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r11)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            java.io.BufferedInputStream r4 = X.AnonymousClass0x7.A0c(r6)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            X.6uL r0 = new X.6uL     // Catch:{ all -> 0x0102 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0102 }
            X.6tY r9 = new X.6tY     // Catch:{ all -> 0x0102 }
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0102 }
            X.1zy r10 = new X.1zy     // Catch:{ all -> 0x00f8 }
            r10.<init>(r9, r4)     // Catch:{ all -> 0x00f8 }
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r11)     // Catch:{ all -> 0x00ee }
            X.C615131b.A02(r10, r0)     // Catch:{ all -> 0x00ee }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x00ee }
            boolean r0 = r11.equals(r7)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "MediaDownload/call/file exists for hash and full hash matches"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00ee }
            goto L_0x00c0
        L_0x00b1:
            java.lang.String r0 = r9.A00()     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "MediaDownload/call/file exists for hash and partial hash matches"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00ee }
        L_0x00c0:
            r10.close()     // Catch:{ all -> 0x00f8 }
            r9.close()     // Catch:{ all -> 0x0102 }
            r4.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            goto L_0x013b
        L_0x00ca:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r11)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = ") does not match to stored value ("
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r7)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "), probably the file has been replaced"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x00ee }
            r10.close()     // Catch:{ all -> 0x00f8 }
            r9.close()     // Catch:{ all -> 0x0102 }
            r4.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            goto L_0x0056
        L_0x00ee:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f8 }
        L_0x00f7:
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0102 }
        L_0x0101:
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
        L_0x010b:
            throw r1     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
        L_0x010c:
            java.lang.String r4 = X.C615131b.A00(r15, r6)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            boolean r0 = r4.equals(r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            if (r0 != 0) goto L_0x013c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            java.lang.String r0 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r1.append(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            r1.append(r4)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            java.lang.String r0 = ") does not match to stored value ("
            r1.append(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            r1.append(r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            java.lang.String r0 = "), probably the file has been replaced"
            X.C18260x0.A1L(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0131 }
            goto L_0x0056
        L_0x0131:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A0k(r6, r5, r0, r1)
            goto L_0x0056
        L_0x013b:
            return r1
        L_0x013c:
            return r1
        L_0x013d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36U.A04(X.2qk, X.319, X.2dc, X.1R1):X.1mV");
    }

    public static void A05(C55682qk r16, C64393Dh r17, AnonymousClass36E r18, C42162Na r19, AnonymousClass1I7 r20, C56902sk r21, C47662dc r22, WebpUtils webpUtils, C45122Yt r24, C107105ah r25, C107085af r26, File file, int i, int i2) {
        File A0V;
        BufferedInputStream A0c;
        C47662dc r2 = r22;
        byte[] bArr = r2.A0c;
        String str = r2.A0H;
        String str2 = r2.A0L;
        int i3 = r2.A00;
        long j = r2.A07;
        C633138t r8 = r2.A0A;
        C55682qk r4 = r16;
        C64393Dh r5 = r17;
        if (C989053r.A05(r4, r5, r18, r19, r8, webpUtils, file, str, str2, bArr, i2, i3, j)) {
            C56902sk r3 = r21;
            if (C106695a0.A03(r8) || AnonymousClass36O.A06(r8)) {
                C18260x0.A0q("MediaDownload/createProgressiveThumbnail/created progressive thumbnail:", str, AnonymousClass001.A0o());
                File A0W = r5.A0W(str, str2);
                if (A0W != null) {
                    A07(r4, r3, r2, r24, r25, r26, A0W);
                }
            } else {
                boolean z = r2.A0Y;
                if (AnonymousClass36O.A04(r8) && z && !r2.A0Q && r3.A0H() == null && (A0V = r5.A0V(str, str2)) != null) {
                    try {
                        A0c = AnonymousClass0x7.A0c(A0V);
                        r3.A0G(AnonymousClass72M.A00(A0c));
                        A0c.close();
                    } catch (IOException e) {
                        Log.e("MediaDownload/createProgressiveThumbnail/created progressive/thumbnail could not be read", e);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            r20.A0B();
            if (AnonymousClass36O.A06(r8) && i == 2) {
                r3.A05();
                return;
            }
            return;
        }
        return;
        throw th;
    }

    public static void A08(C64393Dh r2, C625435m r3, File file, File file2) {
        int i = r3.A01;
        if (AnonymousClass000.A1T(i) && !file.equals(file2)) {
            file.delete();
        } else if (i == 1) {
            file.delete();
            AnonymousClass1I7.A00(r2, file2);
        }
    }

    public static C625435m A03(AnonymousClass1I7 r7, AnonymousClass7L0 r8, C47662dc r9, File file, File file2, String str, String str2, URL url) {
        String str3;
        int A002 = A00(r8, r9, file2, str, url);
        FutureTask futureTask = r7.A02;
        if (!futureTask.isCancelled()) {
            if (A002 != 0) {
                return C625435m.A00((String) null, A002, true);
            }
            if (file.equals(file2)) {
                str3 = r8.A02;
            } else {
                int A01 = A01(r9, str2, url);
                if (!futureTask.isCancelled()) {
                    if (A01 != 0) {
                        int i = 31;
                        if (A01 != 1) {
                            i = 7;
                        }
                        return C625435m.A00((String) null, i, true);
                    }
                    String str4 = r9.A0J;
                    str3 = "enc";
                    if (str4 != null) {
                        String A02 = C106695a0.A02(str4);
                        if (!TextUtils.isEmpty(A02)) {
                            str3 = A02;
                        }
                    }
                }
            }
            return new C625435m((File) null, str3, 0, true, false);
        }
        return C625435m.A00((String) null, 13, false);
    }

    public static void A07(C55682qk r4, C56902sk r5, C47662dc r6, C45122Yt r7, C107105ah r8, C107085af r9, File file) {
        C633138t r3;
        AnonymousClass2QF A002;
        if ((r5.A00() != 1 || !AnonymousClass36O.A09(r6.A0A)) && (r3 = r6.A0A) != C633138t.A0X && (A002 = new C46042az(r4, r7, r8, r9).A00(new C149557Mx(r3, file, r6.A0J, r6.A0Q))) != null) {
            byte[] bArr = A002.A02;
            if (bArr != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("mediadownload/createMessageThumbnailToStoreInDB/updated for mediaHash=");
                C18260x0.A1J(A0o, r6.A0H);
                r5.A0G(bArr);
            }
            Pair pair = A002.A01;
            if (pair != null) {
                r5.A0A(C18280x3.A03(pair));
                r5.A08(C18290x4.A03(pair));
            }
            Pair pair2 = A002.A00;
            if (pair2 != null) {
                int A03 = C18280x3.A03(pair2);
                synchronized (r5) {
                    r5.A09 = Integer.valueOf(A03);
                }
                int A032 = C18290x4.A03(pair2);
                synchronized (r5) {
                    r5.A0A = Integer.valueOf(A032);
                }
            }
            byte[] bArr2 = A002.A03;
            synchronized (r5) {
                r5.A0K = bArr2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught Magi exception: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught IO exception: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fe, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught exception: ", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C55682qk r20, X.C64393Dh r21, X.C153407bG r22, X.C54292oU r23, X.AnonymousClass4FV r24, X.AnonymousClass1I7 r25, X.C56902sk r26, X.C47662dc r27, X.C162287rd r28, X.C45122Yt r29, java.io.File r30) {
        /*
            java.lang.String r7 = "MediaDownload/Failed to parse document"
            r10 = r27
            X.38t r6 = r10.A0A
            boolean r0 = X.C106695a0.A03(r6)
            r5 = 0
            r8 = r26
            r9 = r30
            if (r0 == 0) goto L_0x0142
            java.lang.String r13 = r9.getAbsolutePath()
            java.lang.String r0 = r10.A0K
            X.1aY r4 = new X.1aY
            r4.<init>()
            r11 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = X.C627536m.A08(r0)
            java.lang.String r12 = X.AnonymousClass0x9.A0z(r0)
        L_0x0027:
            r15 = r12
            java.lang.Class<X.36U> r3 = X.AnonymousClass36U.class
            monitor-enter(r3)
            goto L_0x002e
        L_0x002c:
            r12 = r11
            goto L_0x0027
        L_0x002e:
            java.util.HashSet r2 = A00     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x0042
            java.lang.String r2 = "bundle"
            java.lang.String r1 = "class"
            java.lang.String r0 = "dylib"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x013f }
            java.util.HashSet r2 = X.C18280x3.A0h(r0)     // Catch:{ all -> 0x013f }
            A00 = r2     // Catch:{ all -> 0x013f }
        L_0x0042:
            monitor-exit(r3)
            if (r12 == 0) goto L_0x005c
            int r1 = r12.length()
            r0 = 4
            if (r1 <= r0) goto L_0x0052
            boolean r0 = r2.contains(r12)
            if (r0 == 0) goto L_0x005c
        L_0x0052:
            java.lang.String r14 = r10.A0J
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r4.A02 = r0
            monitor-enter(r8)
            goto L_0x005e
        L_0x005c:
            r15 = 0
            goto L_0x0052
        L_0x005e:
            java.lang.Long r0 = r8.A0E     // Catch:{ all -> 0x013c }
            monitor-exit(r8)
            r4.A00 = r0
            long r0 = r9.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A01 = r0
            r4.A05 = r15
            r4.A07 = r14
            long r2 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.Class<com.whatsapp.media.magi.Magi> r19 = com.whatsapp.media.magi.Magi.class
            monitor-enter(r19)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            long r0 = com.whatsapp.media.magi.Magi.A00     // Catch:{ all -> 0x00ec }
            r17 = 0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x008b
            java.lang.String r0 = "magi"
            X.C159587m8.A00(r0)     // Catch:{ all -> 0x00ec }
            long r0 = com.whatsapp.media.magi.Magi.create(r5)     // Catch:{ all -> 0x00ec }
            com.whatsapp.media.magi.Magi.A00 = r0     // Catch:{ all -> 0x00ec }
        L_0x008b:
            monitor-exit(r19)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            com.whatsapp.media.magi.Magi$MagiClassifyResult r12 = com.whatsapp.media.magi.Magi.classify(r0, r13, r12, r14)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            if (r12 == 0) goto L_0x00e7
            int r13 = r12.returnValue     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r0 = -1
            if (r13 == r0) goto L_0x00dd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.String r0 = "MediaDownload/Classify returned: "
            r1.append(r0)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r1.append(r13)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.String r0 = ", extension (hint): "
            r1.append(r0)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r1.append(r15)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.String r0 = ", mimetype: "
            X.C18260x0.A0s(r0, r14, r1)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r13)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r4.A02 = r0     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            long r0 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r4.A03 = r0     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            if (r13 != 0) goto L_0x00c6
            r8.A09(r5)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            goto L_0x0103
        L_0x00c6:
            r0 = 1
            if (r13 != r0) goto L_0x00cc
            com.whatsapp.media.magi.Magi$MagiCheckResult r11 = r12.checkResult     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            goto L_0x0103
        L_0x00cc:
            r0 = 2
            if (r13 != r0) goto L_0x00d7
            r0 = 3
            r8.A09(r0)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            com.whatsapp.media.magi.Magi$MagiCheckResult r11 = r12.checkResult     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r5 = 1
            goto L_0x0103
        L_0x00d7:
            java.lang.String r0 = "MediaDownload/Classify failed."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            goto L_0x0103
        L_0x00dd:
            com.whatsapp.media.magi.Magi$MagiCheckResult r0 = r12.checkResult     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            java.lang.String r0 = r0.errorMsg     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            X.6yk r1 = new X.6yk     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            goto L_0x00eb
        L_0x00e7:
            java.io.FileNotFoundException r1 = X.C18330xA.A05(r13)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
        L_0x00eb:
            throw r1     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
            throw r0     // Catch:{ IOException -> 0x00f6, 6yk -> 0x00ef, Exception -> 0x00fd }
        L_0x00ef:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught Magi exception: "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0103
        L_0x00f6:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught IO exception: "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0103
        L_0x00fd:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught exception: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0103:
            java.lang.Long r0 = r4.A02
            long r12 = r0.longValue()
            r1 = 2
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            r1 = 1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d9
        L_0x0115:
            if (r11 == 0) goto L_0x01d9
            java.lang.String r3 = "/"
            java.util.List r0 = r11.extensions
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cf
        L_0x0129:
            java.lang.Object r0 = r1.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cf
            r2.append(r3)
            goto L_0x0129
        L_0x013c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x013f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0142:
            boolean r0 = X.C106695a0.A03(r6)
            if (r0 == 0) goto L_0x0159
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r10.A0J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0159
            X.35P r0 = new X.35P
            r0.<init>(r9)
            goto L_0x01e1
        L_0x0159:
            boolean r0 = X.AnonymousClass36O.A09(r6)
            if (r0 != 0) goto L_0x018c
            boolean r0 = X.AnonymousClass36O.A03(r6)
            if (r0 != 0) goto L_0x018c
            boolean r0 = X.AnonymousClass36O.A06(r6)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r10.A0J
            r1 = r29
            X.7bC r1 = r1.A00(r9, r0)
            if (r1 == 0) goto L_0x017d
            X.20j r0 = X.C369520j.RECEIVE
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x01e0
        L_0x017d:
            java.lang.String r0 = "MediaDownload/suspicious sticker found, file deleted"
        L_0x017f:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            r8.A09(r0)
            r0 = r21
            X.AnonymousClass1I7.A00(r0, r9)
            return
        L_0x018c:
            r0 = r28
            boolean r0 = r0.A0H(r6, r9)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r15 = "check on download"
            goto L_0x01a7
        L_0x0197:
            boolean r0 = X.C106695a0.A03(r6)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r10.A0J
            boolean r0 = X.C989053r.A08(r0)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r15 = "check on download for documents"
        L_0x01a7:
            r0 = 0
            r2 = r22
            com.whatsapp.Mp4Ops.A04(r2, r9, r0)     // Catch:{ 6z0 -> 0x01ae }
            goto L_0x01f9
        L_0x01ae:
            r1 = move-exception
            r0 = r25
            java.util.concurrent.FutureTask r0 = r0.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x01e0
            r0 = r23
            android.content.Context r0 = r0.A00
            r10 = r0
            r12 = r2
            r13 = r9
            r14 = r1
            r11 = r20
            com.whatsapp.Mp4Ops.A00(r10, r11, r12, r13, r14, r15)
            int r1 = r1.errorCode
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x01e0
            java.lang.String r0 = "MediaDownload/suspicious video/audio found, file deleted"
            goto L_0x017f
        L_0x01cf:
            java.lang.String r0 = r2.toString()
            r4.A04 = r0
            java.lang.String r0 = r11.mimetype
            r4.A06 = r0
        L_0x01d9:
            r0 = r24
            r0.BhD(r4)
            if (r5 == 0) goto L_0x0142
        L_0x01e0:
            return
        L_0x01e1:
            r0.A04()     // Catch:{ 6yo -> 0x01f0, IOException -> 0x01ee }
            boolean r1 = r0.A03     // Catch:{ 6yo -> 0x01f0, IOException -> 0x01ee }
            r0 = 0
            if (r1 == 0) goto L_0x01ea
            r0 = 3
        L_0x01ea:
            r8.A09(r0)     // Catch:{ 6yo -> 0x01f0, IOException -> 0x01ee }
            return
        L_0x01ee:
            r1 = move-exception
            goto L_0x01f5
        L_0x01f0:
            r1 = move-exception
            r0 = 3
            r8.A09(r0)
        L_0x01f5:
            com.whatsapp.util.Log.e(r7, r1)
            return
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36U.A06(X.2qk, X.3Dh, X.7bG, X.2oU, X.4FV, X.1I7, X.2sk, X.2dc, X.7rd, X.2Yt, java.io.File):void");
    }
}
