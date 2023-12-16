package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.2yO  reason: invalid class name and case insensitive filesystem */
public class C60342yO {
    public boolean A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final AnonymousClass36E A03;
    public final C56492s4 A04;
    public final C61072zf A05;
    public final AnonymousClass1VX A06;
    public final C55002pd A07;
    public final C54672p6 A08;
    public final AnonymousClass5LM A09;
    public final C55572qZ A0A;
    public final AnonymousClass1I7 A0B;
    public final C56902sk A0C;
    public final C47662dc A0D;
    public final C56852sf A0E;
    public final C29011i8 A0F;
    public final WebpUtils A0G;
    public final C45122Yt A0H;
    public final C107105ah A0I;
    public final C107085af A0J;
    public final AnonymousClass4FS A0K;
    public final C34171uL A0L;
    public final URL A0M;

    public static final void A00(C47662dc r8, File file, File file2) {
        AnonymousClass201 r5;
        AnonymousClass3G7 r1 = new AnonymousClass3G7(r8.A0A);
        byte[] bArr = r8.A0d;
        C626936e.A06(bArr);
        C42162Na B1Z = r1.B1Z(bArr);
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(file);
            try {
                FileOutputStream A0h = AnonymousClass0x9.A0h(file2);
                try {
                    r5 = new AnonymousClass201(B1Z, A0h, file.length());
                    byte[] bArr2 = new byte[DefaultCrypto.BUFFER_SIZE];
                    for (int read = A0g.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE); read > 0; read = A0g.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE)) {
                        r5.write(bArr2);
                    }
                    if (!r5.A01) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("normaldownloadhandler/decryptFile Decryption failure in express path download for file ");
                        A0o.append(file2.getCanonicalPath());
                        A0o.append(", enc hash: ");
                        A0o.append(r8.A0G);
                        A0o.append(", plain text hash: ");
                        C18260x0.A1K(A0o, r8.A0H);
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("normaldownloadhandler/decryptFile Decryption successful for file: ");
                        A0o2.append(file2.getCanonicalPath());
                        Log.d(AnonymousClass000.A0N(file2, ", plaintext filesize: ", A0o2));
                    }
                    r5.close();
                    A0h.close();
                    A0g.close();
                    return;
                } catch (Throwable th) {
                    A0h.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0g.close();
                throw th2;
            }
        } catch (IOException unused) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("normaldownloadhandler/decryptFile Decryption failure in express path download, enc hash: ");
            A0o3.append(r8.A0G);
            A0o3.append(", plain text hash: ");
            C18260x0.A1K(A0o3, r8.A0H);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public final void A02(String str) {
        if (str == null) {
            Log.e("normalDownloadHandler/cancelExpressPathFileCleanUp cancel work with empty enc hash");
            return;
        }
        C18260x0.A0q("normalDownloadHandler/cancelExpressPathFileCleanUp canceling work for enc hash: ", str, AnonymousClass001.A0o());
        C72333dY.A01(this.A0L).A0B(str);
    }

    public C60342yO(C55682qk r2, C64393Dh r3, AnonymousClass36E r4, C56492s4 r5, C61072zf r6, AnonymousClass1VX r7, C55002pd r8, C54672p6 r9, AnonymousClass5LM r10, C55572qZ r11, AnonymousClass1I7 r12, C56902sk r13, C47662dc r14, C56852sf r15, C29011i8 r16, WebpUtils webpUtils, C45122Yt r18, C107105ah r19, C107085af r20, AnonymousClass4FS r21, C34171uL r22, URL url) {
        this.A06 = r7;
        this.A01 = r2;
        this.A0K = r21;
        this.A0G = webpUtils;
        this.A02 = r3;
        this.A05 = r6;
        this.A0F = r16;
        this.A0I = r19;
        this.A0H = r18;
        this.A03 = r4;
        this.A0J = r20;
        this.A0L = r22;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
        this.A0M = url;
        this.A0D = r14;
        this.A0E = r15;
        this.A04 = r5;
        this.A09 = r10;
        this.A0B = r12;
        this.A0C = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06c8, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0774, code lost:
        if (r6.A0C() == false) goto L_0x0776;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x07aa, code lost:
        if (r6.A0C() != false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0824, code lost:
        if (r6.A0C() != false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0298, code lost:
        if (r33 > 0) goto L_0x029a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:347:0x06a9, B:360:0x06bf] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:399:0x0718 */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x062b A[Catch:{ all -> 0x066e }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x064a A[SYNTHETIC, Splitter:B:310:0x064a] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x06b8 A[Catch:{ all -> 0x0837, NoSuchAlgorithmException -> 0x077a, all -> 0x0842 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0705 A[Catch:{ all -> 0x0837, NoSuchAlgorithmException -> 0x077a, all -> 0x0842 }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0718 A[PHI: r8 
      PHI: (r8v6 java.lang.String) = (r8v7 java.lang.String), (r8v11 java.lang.String), (r8v18 java.lang.String), (r8v18 java.lang.String), (r8v26 java.lang.String), (r8v26 java.lang.String), (r8v36 java.lang.String), (r8v36 java.lang.String), (r8v36 java.lang.String), (r8v36 java.lang.String), (r8v51 java.lang.String), (r8v51 java.lang.String), (r8v51 java.lang.String), (r8v51 java.lang.String), (r8v52 java.lang.String), (r8v52 java.lang.String), (r8v17 java.lang.String), (r8v17 java.lang.String), (r8v17 java.lang.String), (r8v17 java.lang.String), (r8v58 java.lang.String) binds: [B:397:0x0717, B:393:0x0711, B:380:0x06fc, B:381:?, B:351:0x06af, B:352:?, B:318:0x065d, B:319:?, B:304:0x063f, B:305:?, B:264:0x05e2, B:265:?, B:229:0x0542, B:230:?, B:211:0x0522, B:212:?, B:105:0x02dc, B:106:?, B:94:0x02c1, B:95:?, B:77:0x0273] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:399:0x0718] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0725 A[Catch:{ all -> 0x0837, NoSuchAlgorithmException -> 0x077a, all -> 0x0842 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0136 A[Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x079e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a A[ADDED_TO_REGION, Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x07da A[Catch:{ all -> 0x0837, NoSuchAlgorithmException -> 0x077a, all -> 0x0842 }] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0810 A[Catch:{ all -> 0x0837, NoSuchAlgorithmException -> 0x077a, all -> 0x0842 }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018b A[Catch:{ NumberFormatException -> 0x022f, all -> 0x070a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0260 A[Catch:{ NumberFormatException -> 0x022f, all -> 0x070a }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0278 A[Catch:{ 1fo -> 0x02e7, 4uq -> 0x07a4, IllegalArgumentException -> 0x0718, IOException -> 0x07a2 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:427:0x0761=Splitter:B:427:0x0761, B:454:0x07b7=Splitter:B:454:0x07b7, B:399:0x0718=Splitter:B:399:0x0718, B:407:0x0728=Splitter:B:407:0x0728, B:462:0x07dd=Splitter:B:462:0x07dd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C625435m A01(X.AnonymousClass7US r49, java.io.File r50, java.lang.String r51, java.net.URL r52, boolean r53) {
        /*
            r48 = this;
            java.lang.String r25 = "normaldownloadhandler/normal download Start decryption for file: "
            java.lang.String r17 = "normaldownloadhandler/downloadnormal Already have full enc file on local, filepath: "
            java.lang.String r24 = ", already downloaded bytes: "
            java.lang.String r23 = ", plain text hash: "
            java.lang.String r22 = ", enc hash: "
            r5 = r48
            X.2dc r4 = r5.A0D
            int r0 = r4.A00
            r33 = r0
            int r0 = r0 + 15
            int r0 = r0 / 16
            int r32 = r0 * 16
            java.io.File r10 = r4.A0D
            java.lang.String r11 = "; url="
            r12 = r52
            if (r10 == 0) goto L_0x0851
            long r2 = r10.length()
            X.2sf r6 = r5.A0E
            r6.A09 = r2
            X.2sk r0 = r5.A0C
            r45 = r0
            r0.A0B(r2)
            if (r53 == 0) goto L_0x007d
            r0 = r32
            long r0 = (long) r0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x007d
            X.38t r0 = r4.A0A
            X.3G7 r1 = new X.3G7
            r1.<init>(r0)
            byte[] r0 = r4.A0d
            X.C626936e.A06(r0)
            X.2Na r14 = r1.B1Z(r0)
            X.2qk r11 = r5.A01
            com.whatsapp.stickers.WebpUtils r9 = r5.A0G
            X.3Dh r8 = r5.A02
            X.5ah r7 = r5.A0I
            X.2Yt r6 = r5.A0H
            X.36E r3 = r5.A03
            X.5af r2 = r5.A0J
            X.1I7 r1 = r5.A0B
            int r0 = r1.A12
            r12 = r8
            r13 = r3
            r15 = r1
            r16 = r45
            r17 = r4
            r18 = r9
            r19 = r6
            r20 = r7
            r21 = r2
            r22 = r10
            r23 = r0
            r24 = r32
            X.AnonymousClass36U.A05(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = 14
            r1 = 0
            r0 = 0
            X.35m r9 = X.C625435m.A00(r0, r2, r1)
        L_0x007c:
            return r9
        L_0x007d:
            r7 = 0
            r0 = 0
            int r21 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r21 <= 0) goto L_0x0085
            r7 = 1
        L_0x0085:
            r5.A00 = r7     // Catch:{ all -> 0x0842 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r20 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x077a }
            java.security.MessageDigest r19 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x077a }
            r47 = r50
            long r0 = r4.A07     // Catch:{ IOException -> 0x012b }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0129
            X.1VX r7 = r5.A06     // Catch:{ IOException -> 0x012b }
            boolean r7 = X.C56952sp.A0I(r7)     // Catch:{ IOException -> 0x012b }
            if (r7 == 0) goto L_0x0129
            X.2qk r15 = r5.A01     // Catch:{ IOException -> 0x012b }
            r7 = r19
            java.lang.String r16 = X.C615131b.A01(r15, r10, r7)     // Catch:{ IOException -> 0x012b }
            java.lang.String r7 = r4.A0G     // Catch:{ IOException -> 0x012b }
            r8 = r16
            boolean r8 = r8.equals(r7)     // Catch:{ IOException -> 0x012b }
            if (r8 == 0) goto L_0x0129
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0l(r17)     // Catch:{ IOException -> 0x012b }
            java.lang.String r8 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x012b }
            r13 = r22
            r9 = r23
            X.C18260x0.A0p(r8, r13, r7, r9, r14)     // Catch:{ IOException -> 0x012b }
            java.lang.String r8 = r4.A0H     // Catch:{ IOException -> 0x012b }
            r14.append(r8)     // Catch:{ IOException -> 0x012b }
            r8 = r24
            X.C18260x0.A10(r8, r14, r2)     // Catch:{ IOException -> 0x012b }
            long r13 = r47.length()     // Catch:{ IOException -> 0x012b }
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r25)     // Catch:{ IOException -> 0x012b }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x012b }
            X.C18260x0.A1J(r1, r0)     // Catch:{ IOException -> 0x012b }
            r0 = r47
            A00(r4, r10, r0)     // Catch:{ IOException -> 0x012b }
        L_0x00e4:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x012b }
            r6.A0D = r0     // Catch:{ IOException -> 0x012b }
            r0 = 3
            r6.A03 = r0     // Catch:{ IOException -> 0x012b }
            r1 = r20
            r0 = r47
            java.lang.String r40 = X.C615131b.A01(r15, r0, r1)     // Catch:{ IOException -> 0x012b }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x012b }
            r0 = 0
            X.7L0 r9 = new X.7L0     // Catch:{ IOException -> 0x012b }
            r9.<init>(r0, r1)     // Catch:{ IOException -> 0x012b }
            X.1I7 r8 = r5.A0B     // Catch:{ IOException -> 0x012b }
            r0 = r2
            r34 = r8
            r35 = r9
            r36 = r4
            r37 = r10
            r38 = r47
            r39 = r16
            r41 = r12
            X.35m r9 = X.AnonymousClass36U.A03(r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ IOException -> 0x012c }
            r6.A08()     // Catch:{ IOException -> 0x012c }
            int r8 = r9.A01     // Catch:{ IOException -> 0x012c }
            boolean r8 = X.AnonymousClass000.A1T(r8)     // Catch:{ IOException -> 0x012c }
            if (r8 == 0) goto L_0x0132
            r5.A02(r7)     // Catch:{ IOException -> 0x012c }
            X.3Dh r8 = r5.A02     // Catch:{ IOException -> 0x012c }
            r7 = r47
            X.AnonymousClass36U.A08(r8, r9, r10, r7)     // Catch:{ IOException -> 0x012c }
            goto L_0x0794
        L_0x0129:
            r0 = r2
            goto L_0x0132
        L_0x012b:
            r0 = r2
        L_0x012c:
            java.lang.String r7 = "normaldownloadhandler/downloadnormal error when suspect local has full data and try to return early"
            com.whatsapp.util.Log.e((java.lang.String) r7)     // Catch:{ all -> 0x0842 }
        L_0x0132:
            X.2pd r9 = r5.A07     // Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }
            if (r21 > 0) goto L_0x0138
            r2 = 0
        L_0x0138:
            if (r53 == 0) goto L_0x0140
            if (r33 <= 0) goto L_0x0140
            int r7 = r32 + -1
            long r7 = (long) r7     // Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }
            goto L_0x0142
        L_0x0140:
            r7 = -1
        L_0x0142:
            r18 = 1
            r35 = r49
            r36 = r51
            r34 = r9
            r37 = r12
            r38 = r2
            r40 = r7
            r42 = r18
            X.4GL r29 = r34.A01(r35, r36, r37, r38, r40, r42)     // Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }
            r6.A07()     // Catch:{ all -> 0x070a }
            r2 = r29
            X.3PZ r2 = (X.AnonymousClass3PZ) r2     // Catch:{ all -> 0x070a }
            java.lang.Boolean r7 = r2.A00     // Catch:{ all -> 0x070a }
            r6.A0K = r7     // Catch:{ all -> 0x070a }
            java.net.HttpURLConnection r13 = r2.A01     // Catch:{ all -> 0x070a }
            int r2 = r13.getResponseCode()     // Catch:{ all -> 0x070a }
            java.lang.Long r2 = X.AnonymousClass0x9.A0m(r2)     // Catch:{ all -> 0x070a }
            r6.A0U = r2     // Catch:{ all -> 0x070a }
            java.lang.String r2 = "x-fb-application-protocol"
            java.lang.String r2 = r13.getHeaderField(r2)     // Catch:{ all -> 0x070a }
            r6.A0a = r2     // Catch:{ all -> 0x070a }
            java.lang.String r2 = "X-WA-Metadata"
            java.lang.String r3 = r13.getHeaderField(r2)     // Catch:{ all -> 0x070a }
            X.7L0 r31 = new X.7L0     // Catch:{ all -> 0x070a }
            r2 = r31
            r2.<init>(r3, r7)     // Catch:{ all -> 0x070a }
            int r3 = r13.getResponseCode()     // Catch:{ all -> 0x070a }
            r2 = 416(0x1a0, float:5.83E-43)
            if (r3 != r2) goto L_0x0244
            java.lang.String r2 = "Content-Range"
            java.lang.String r7 = r13.getHeaderField(r2)     // Catch:{ all -> 0x070a }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x070a }
            if (r2 != 0) goto L_0x0244
            java.lang.String r2 = "*/"
            boolean r2 = r7.contains(r2)     // Catch:{ all -> 0x070a }
            if (r2 == 0) goto L_0x0244
            r2 = 47
            int r2 = r7.lastIndexOf(r2)     // Catch:{ NumberFormatException -> 0x022f }
            int r2 = r2 + 1
            java.lang.String r2 = r7.substring(r2)     // Catch:{ NumberFormatException -> 0x022f }
            long r8 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x022f }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0244
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r17)     // Catch:{ NumberFormatException -> 0x022f }
            java.lang.String r2 = r10.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x022f }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r22
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x022f }
            java.lang.String r8 = r4.A0G     // Catch:{ NumberFormatException -> 0x022f }
            r3.append(r8)     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r23
            X.C47662dc.A00(r4, r2, r3)     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r24
            X.C18260x0.A10(r2, r3, r0)     // Catch:{ NumberFormatException -> 0x022f }
            long r14 = r47.length()     // Catch:{ NumberFormatException -> 0x022f }
            long r2 = r4.A07     // Catch:{ NumberFormatException -> 0x022f }
            int r9 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x01ec
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r25)     // Catch:{ NumberFormatException -> 0x022f }
            java.lang.String r2 = r10.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x022f }
            X.C18260x0.A1J(r3, r2)     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r47
            A00(r4, r10, r2)     // Catch:{ NumberFormatException -> 0x022f }
        L_0x01ec:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x022f }
            r6.A0D = r2     // Catch:{ NumberFormatException -> 0x022f }
            r2 = 3
            r6.A03 = r2     // Catch:{ NumberFormatException -> 0x022f }
            X.2qk r3 = r5.A01     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r19
            java.lang.String r39 = X.C615131b.A01(r3, r10, r2)     // Catch:{ NumberFormatException -> 0x022f }
            r9 = r20
            r2 = r47
            java.lang.String r40 = X.C615131b.A01(r3, r2, r9)     // Catch:{ NumberFormatException -> 0x022f }
            X.1I7 r2 = r5.A0B     // Catch:{ NumberFormatException -> 0x022f }
            r34 = r2
            r35 = r31
            r36 = r4
            r37 = r10
            r38 = r47
            r41 = r12
            X.35m r9 = X.AnonymousClass36U.A03(r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ NumberFormatException -> 0x022f }
            r6.A08()     // Catch:{ NumberFormatException -> 0x022f }
            r5.A02(r8)     // Catch:{ NumberFormatException -> 0x022f }
            X.3Dh r3 = r5.A02     // Catch:{ NumberFormatException -> 0x022f }
            r2 = r47
            X.AnonymousClass36U.A08(r3, r9, r10, r2)     // Catch:{ NumberFormatException -> 0x022f }
            r29.close()     // Catch:{ 1fo -> 0x0726, 4uq -> 0x07db, IllegalArgumentException -> 0x0717, IOException -> 0x07b5 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x022f:
            r8 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x070a }
            java.lang.String r2 = "MediaDownload/MMS download parse of Content-Range response header failed; mediaHash="
            X.C47662dc.A00(r4, r2, r3)     // Catch:{ all -> 0x070a }
            r3.append(r11)     // Catch:{ all -> 0x070a }
            r3.append(r12)     // Catch:{ all -> 0x070a }
            java.lang.String r2 = "; responseContentRange="
            X.C18260x0.A0v(r2, r7, r3, r8)     // Catch:{ all -> 0x070a }
        L_0x0244:
            int r2 = r13.getContentLength()     // Catch:{ all -> 0x070a }
            long r2 = (long) r2     // Catch:{ all -> 0x070a }
            long r16 = r0 + r2
            X.2zf r2 = r5.A05     // Catch:{ all -> 0x070a }
            long r14 = r2.A02()     // Catch:{ all -> 0x070a }
            X.1VX r2 = r5.A06     // Catch:{ all -> 0x070a }
            r44 = r2
            long r7 = X.C56952sp.A03(r44)     // Catch:{ all -> 0x070a }
            long r7 = r7 + r16
            r2 = 4
            int r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0278
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "MediaDownload/MMS download failed due to insufficient space; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x070a }
            X.C18260x0.A1S(r1, r11, r12)     // Catch:{ all -> 0x070a }
            boolean r0 = r5.A00     // Catch:{ all -> 0x070a }
            r8 = 0
            X.35m r9 = X.C625435m.A00(r8, r2, r0)     // Catch:{ all -> 0x031d }
            r29.close()     // Catch:{ 1fo -> 0x02e7, 4uq -> 0x07a4, IllegalArgumentException -> 0x0718, IOException -> 0x07a2 }
            goto L_0x0770
        L_0x0278:
            r8 = 0
            X.1I7 r7 = r5.A0B     // Catch:{ all -> 0x0708 }
            boolean r2 = r7.A06     // Catch:{ all -> 0x0708 }
            if (r2 == 0) goto L_0x02cc
            int r3 = r7.A12     // Catch:{ all -> 0x031d }
            r2 = r18
            if (r2 != r3) goto L_0x02cc
            X.2qZ r2 = r5.A0A     // Catch:{ all -> 0x031d }
            r18 = r2
            X.38t r2 = r4.A0A     // Catch:{ all -> 0x031d }
            r15 = r2
            long r2 = r4.A07     // Catch:{ all -> 0x031d }
            r25 = r2
            r39 = 0
            boolean r2 = r4.A0R     // Catch:{ all -> 0x031d }
            if (r2 != 0) goto L_0x029a
            r40 = 0
            if (r33 <= 0) goto L_0x029c
        L_0x029a:
            r40 = 1
        L_0x029c:
            int r2 = r4.A04     // Catch:{ all -> 0x031d }
            r14 = r2
            boolean r9 = r4.A0Y     // Catch:{ all -> 0x031d }
            boolean r3 = r4.A0X     // Catch:{ all -> 0x031d }
            boolean r2 = r4.A0T     // Catch:{ all -> 0x031d }
            r34 = r18
            r35 = r15
            r36 = r14
            r37 = r25
            r41 = r9
            r42 = r3
            r43 = r2
            boolean r2 = r34.A02(r35, r36, r37, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x031d }
            if (r2 != 0) goto L_0x02cc
            boolean r1 = r5.A00     // Catch:{ all -> 0x031d }
            r0 = 24
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x031d }
            r29.close()     // Catch:{ 1fo -> 0x02e7, 4uq -> 0x07a4, IllegalArgumentException -> 0x0718, IOException -> 0x07a2 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x02cc:
            java.util.concurrent.FutureTask r2 = r7.A02     // Catch:{ all -> 0x0708 }
            boolean r2 = r2.isCancelled()     // Catch:{ all -> 0x0708 }
            if (r2 == 0) goto L_0x02ea
            boolean r1 = r5.A00     // Catch:{ all -> 0x031d }
            r0 = 13
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x031d }
            r29.close()     // Catch:{ 1fo -> 0x02e7, 4uq -> 0x07a4, IllegalArgumentException -> 0x0718, IOException -> 0x07a2 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x02e7:
            r2 = move-exception
            goto L_0x0728
        L_0x02ea:
            if (r21 <= 0) goto L_0x0320
            long r14 = r10.length()     // Catch:{ all -> 0x031d }
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0320
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x031d }
            java.lang.String r2 = "normaldownloadhandler/downloadnormal Already have partial enc file on local, filepath: "
            r3.append(r2)     // Catch:{ all -> 0x031d }
            java.lang.String r2 = r10.getCanonicalPath()     // Catch:{ all -> 0x031d }
            r3.append(r2)     // Catch:{ all -> 0x031d }
            r2 = r22
            r3.append(r2)     // Catch:{ all -> 0x031d }
            java.lang.String r2 = r4.A0G     // Catch:{ all -> 0x031d }
            r3.append(r2)     // Catch:{ all -> 0x031d }
            r2 = r23
            X.C47662dc.A00(r4, r2, r3)     // Catch:{ all -> 0x031d }
            r2 = r24
            X.C18260x0.A10(r2, r3, r0)     // Catch:{ all -> 0x031d }
            r7.A0C(r0)     // Catch:{ all -> 0x031d }
            goto L_0x0320
        L_0x031d:
            r1 = move-exception
            goto L_0x070c
        L_0x0320:
            X.38t r2 = r4.A0A     // Catch:{ all -> 0x0708 }
            r40 = r2
            X.3G7 r3 = new X.3G7     // Catch:{ all -> 0x0708 }
            r3.<init>(r2)     // Catch:{ all -> 0x0708 }
            byte[] r2 = r4.A0d     // Catch:{ all -> 0x0708 }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x0708 }
            X.2Na r30 = r3.B1Z(r2)     // Catch:{ all -> 0x0708 }
            r9 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x06d9 }
            r2 = r47
            r3.<init>(r2, r9)     // Catch:{ IOException -> 0x06d9 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x06d9 }
            r9.<init>(r3)     // Catch:{ IOException -> 0x06d9 }
            X.8SR r28 = new X.8SR     // Catch:{ IOException -> 0x06d9 }
            r3 = r28
            r2 = r20
            r3.<init>(r9, r2)     // Catch:{ IOException -> 0x06d9 }
            int r2 = r13.getContentLength()     // Catch:{ all -> 0x06ca }
            long r2 = (long) r2     // Catch:{ all -> 0x06ca }
            long r8 = r10.length()     // Catch:{ all -> 0x06ca }
            long r2 = r2 + r8
            X.201 r27 = new X.201     // Catch:{ all -> 0x06ca }
            r13 = r28
            r9 = r27
            r8 = r30
            r9.<init>(r8, r13, r2)     // Catch:{ all -> 0x06ca }
            boolean r2 = r10.exists()     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            if (r2 == 0) goto L_0x03b5
            long r13 = r10.length()     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            r8 = 0
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x03b5
            X.2qk r2 = r5.A01     // Catch:{ IOException -> 0x039e }
            java.io.FileInputStream r2 = X.C107655bf.A0T(r2, r10)     // Catch:{ IOException -> 0x039e }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x039e }
            r3.<init>(r2)     // Catch:{ IOException -> 0x039e }
            X.6tY r13 = new X.6tY     // Catch:{ IOException -> 0x039e }
            r2 = r19
            r13.<init>(r3, r2)     // Catch:{ IOException -> 0x039e }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r14]     // Catch:{ all -> 0x0394 }
        L_0x0383:
            r8 = 0
            int r3 = r13.read(r9, r8, r14)     // Catch:{ all -> 0x0394 }
            if (r3 < 0) goto L_0x0390
            r2 = r27
            r2.write(r9, r8, r3)     // Catch:{ all -> 0x0394 }
            goto L_0x0383
        L_0x0390:
            r13.close()     // Catch:{ IOException -> 0x039e }
            goto L_0x03b5
        L_0x0394:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0399 }
            goto L_0x039d
        L_0x0399:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x039e }
        L_0x039d:
            throw r1     // Catch:{ IOException -> 0x039e }
        L_0x039e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            java.lang.String r0 = "MediaDownload/MMS download failed in pre-download with Exception; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            r1.append(r11)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            java.net.URL r0 = r5.A0M     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            throw r2     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
        L_0x03b5:
            r2 = 1
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            r8.<init>(r10, r2)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            java.security.DigestOutputStream r26 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            r3 = r26
            r2 = r19
            r3.<init>(r8, r2)     // Catch:{ IOException -> 0x0687, all -> 0x0680 }
            X.2s4 r8 = r5.A04     // Catch:{ IOException -> 0x060e, all -> 0x060b }
            boolean r2 = r4.A0Y     // Catch:{ IOException -> 0x060e, all -> 0x060b }
            int r2 = X.AnonymousClass0x9.A00(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x060e, all -> 0x060b }
            r13 = 0
            r2 = r29
            java.io.InputStream r25 = X.C18310x6.A0b(r8, r2, r3, r13)     // Catch:{ IOException -> 0x060e, all -> 0x060b }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r3]     // Catch:{ IOException -> 0x049f }
            r8 = 0
            r2 = r25
            int r13 = r2.read(r9, r13, r3)     // Catch:{ IOException -> 0x049f }
            r2 = r32
            long r2 = (long) r2
            r23 = r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r22 = X.AnonymousClass001.A1U(r2)
        L_0x03ed:
            if (r13 < 0) goto L_0x04c0
            long r14 = r6.A03()     // Catch:{ IOException -> 0x049f }
            r20 = -1
            int r2 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0410
            long r2 = r6.A0A     // Catch:{ IOException -> 0x049f }
            int r14 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x0410
            long r18 = r6.A01()     // Catch:{ IOException -> 0x049f }
            int r14 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x0410
            long r2 = X.AnonymousClass0x7.A0E(r2)     // Catch:{ IOException -> 0x049f }
            r6.A0H = r2     // Catch:{ IOException -> 0x049f }
            r2 = 2
            r6.A03 = r2     // Catch:{ IOException -> 0x049f }
        L_0x0410:
            r2 = r26
            r2.write(r9, r8, r13)     // Catch:{ IOException -> 0x049f }
            r2 = r27
            r2.write(r9, r8, r13)     // Catch:{ IOException -> 0x049f }
            long r2 = (long) r13     // Catch:{ IOException -> 0x049f }
            long r0 = r0 + r2
            X.5LM r13 = r5.A09     // Catch:{ IOException -> 0x049f }
            if (r13 == 0) goto L_0x0422
            r13.A0A = r0     // Catch:{ IOException -> 0x049f }
        L_0x0422:
            r6.A0A(r0, r2)     // Catch:{ IOException -> 0x049f }
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1W(r2)
            r5.A00 = r2     // Catch:{ IOException -> 0x049f }
            boolean r2 = X.AnonymousClass36O.A06(r40)     // Catch:{ IOException -> 0x049f }
            if (r2 == 0) goto L_0x045b
            byte[] r2 = r4.A0c     // Catch:{ IOException -> 0x049f }
            if (r33 <= 0) goto L_0x045b
            if (r2 == 0) goto L_0x045b
            if (r53 != 0) goto L_0x045b
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 < 0) goto L_0x045b
            if (r22 != 0) goto L_0x045b
            X.4FS r3 = r5.A0K     // Catch:{ IOException -> 0x049f }
            r39 = 27
            X.3c6 r2 = new X.3c6     // Catch:{ IOException -> 0x049f }
            r34 = r2
            r35 = r5
            r36 = r10
            r37 = r30
            r38 = r32
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ IOException -> 0x049f }
            r3.BkM(r2)     // Catch:{ IOException -> 0x049f }
            r22 = 1
        L_0x045b:
            r2 = r45
            r2.A0B(r0)     // Catch:{ IOException -> 0x049f }
            r7.A08()     // Catch:{ IOException -> 0x049f }
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A10     // Catch:{ IOException -> 0x049f }
            boolean r2 = r2.getAndSet(r8)     // Catch:{ IOException -> 0x049f }
            if (r2 == 0) goto L_0x048f
            long r2 = r16 - r0
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x049f }
            java.lang.String r13 = "NormalDownloadHandler/downloadFile/bytesRemainingToDownload="
            X.C18260x0.A10(r13, r14, r2)     // Catch:{ IOException -> 0x049f }
            r14 = 52428800(0x3200000, double:2.5903269E-316)
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x048f
            r13 = 488(0x1e8, float:6.84E-43)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ IOException -> 0x049f }
            r2 = r44
            boolean r2 = r2.A0Y(r3, r13)     // Catch:{ IOException -> 0x049f }
            if (r2 == 0) goto L_0x048f
            java.lang.String r0 = "NormalDownloadHandler/downloadFile/cancelDownloadToHostSwitch"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x049f }
            goto L_0x049c
        L_0x048f:
            r7.A0C(r0)     // Catch:{ IOException -> 0x049f }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2 = r25
            int r13 = r2.read(r9, r8, r3)     // Catch:{ IOException -> 0x049f }
            goto L_0x03ed
        L_0x049c:
            r1 = 20
            goto L_0x04c1
        L_0x049f:
            r3 = move-exception
            r6.A0B(r3)     // Catch:{ all -> 0x05fc }
            java.net.URL r2 = r5.A0M     // Catch:{ all -> 0x05fc }
            java.lang.String r0 = X.C614230q.A00(r2)     // Catch:{ all -> 0x05fc }
            r6.A0b = r0     // Catch:{ all -> 0x05fc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fc }
            java.lang.String r0 = "MediaDownload/MMS download failed with IOException; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x05fc }
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r11, r1)     // Catch:{ all -> 0x05fc }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x05fc }
            int r1 = X.C1451674l.A00(r3)     // Catch:{ all -> 0x05fc }
            goto L_0x04c1
        L_0x04c0:
            r1 = 0
        L_0x04c1:
            if (r53 == 0) goto L_0x052d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fc }
            java.lang.String r0 = "MediaDownload/ProgressiveJpeg/prefetched first scan bytesDownloaded="
            r2.append(r0)     // Catch:{ all -> 0x05fc }
            long r0 = r6.A05()     // Catch:{ all -> 0x05fc }
            r2.append(r0)     // Catch:{ all -> 0x05fc }
            java.lang.String r1 = " firstChunkSize="
            r0 = r32
            X.C18260x0.A0w(r1, r2, r0)     // Catch:{ all -> 0x05fc }
            boolean r0 = r5.A00     // Catch:{ all -> 0x05fc }
            if (r0 == 0) goto L_0x050d
            X.2qk r14 = r5.A01     // Catch:{ all -> 0x05fc }
            com.whatsapp.stickers.WebpUtils r13 = r5.A0G     // Catch:{ all -> 0x05fc }
            X.3Dh r9 = r5.A02     // Catch:{ all -> 0x05fc }
            X.5ah r8 = r5.A0I     // Catch:{ all -> 0x05fc }
            X.2Yt r3 = r5.A0H     // Catch:{ all -> 0x05fc }
            X.36E r2 = r5.A03     // Catch:{ all -> 0x05fc }
            X.5af r1 = r5.A0J     // Catch:{ all -> 0x05fc }
            int r0 = r7.A12     // Catch:{ all -> 0x05fc }
            r33 = r14
            r34 = r9
            r35 = r2
            r36 = r30
            r37 = r7
            r38 = r45
            r39 = r4
            r40 = r13
            r41 = r3
            r42 = r8
            r43 = r1
            r44 = r10
            r45 = r0
            r46 = r32
            X.AnonymousClass36U.A05(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x05fc }
        L_0x050d:
            boolean r1 = r5.A00     // Catch:{ all -> 0x05fc }
            r0 = 14
            r8 = 0
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x05fa }
            r25.close()     // Catch:{ IOException -> 0x05f8, all -> 0x05f6 }
            r26.close()     // Catch:{ IOException -> 0x05f3, all -> 0x0683 }
            r27.close()     // Catch:{ all -> 0x066a }
            r28.close()     // Catch:{ IOException -> 0x0664 }
            r29.close()     // Catch:{ 1fo -> 0x05ed, 4uq -> 0x07af, IllegalArgumentException -> 0x0718, IOException -> 0x07ad }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x052d:
            r8 = 0
            if (r1 == 0) goto L_0x0547
            boolean r0 = r5.A00     // Catch:{ all -> 0x05fa }
            X.35m r7 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x05fa }
            r25.close()     // Catch:{ IOException -> 0x05f8, all -> 0x05f6 }
            r26.close()     // Catch:{ IOException -> 0x05f3, all -> 0x0683 }
            r27.close()     // Catch:{ all -> 0x066a }
            r28.close()     // Catch:{ IOException -> 0x0664 }
            r29.close()     // Catch:{ 1fo -> 0x05ed, 4uq -> 0x07af, IllegalArgumentException -> 0x0718, IOException -> 0x07ad }
            goto L_0x07a6
        L_0x0547:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05fa }
            r6.A0D = r0     // Catch:{ all -> 0x05fa }
            r0 = 3
            r6.A03 = r0     // Catch:{ all -> 0x05fa }
            java.security.MessageDigest r0 = r26.getMessageDigest()     // Catch:{ all -> 0x05fa }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x05fa }
            java.lang.String r18 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x05fa }
            r0 = r27
            boolean r0 = r0.A01     // Catch:{ all -> 0x05fa }
            if (r0 == 0) goto L_0x0580
            java.security.MessageDigest r0 = r28.getMessageDigest()     // Catch:{ all -> 0x05fa }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x05fa }
            java.lang.String r19 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x05fa }
        L_0x056e:
            r13 = r7
            r14 = r31
            r15 = r4
            r16 = r10
            r17 = r47
            r20 = r12
            X.35m r9 = X.AnonymousClass36U.A03(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x05fa }
            r6.A08()     // Catch:{ all -> 0x05fa }
            goto L_0x0583
        L_0x0580:
            r19 = r8
            goto L_0x056e
        L_0x0583:
            r25.close()     // Catch:{ IOException -> 0x05f8, all -> 0x05f6 }
            r26.close()     // Catch:{ IOException -> 0x05f3, all -> 0x0683 }
            r27.close()     // Catch:{ all -> 0x066a }
            r28.close()     // Catch:{ IOException -> 0x0664 }
            boolean r0 = X.C56952sp.A0I(r44)     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x059a
            java.lang.String r0 = r4.A0G     // Catch:{ all -> 0x05f0 }
            r5.A02(r0)     // Catch:{ all -> 0x05f0 }
        L_0x059a:
            X.3Dh r2 = r5.A02     // Catch:{ all -> 0x05f0 }
            r0 = r47
            X.AnonymousClass36U.A08(r2, r9, r10, r0)     // Catch:{ all -> 0x05f0 }
            java.lang.String r7 = r4.A0H     // Catch:{ all -> 0x05f0 }
            java.lang.String r3 = r4.A0L     // Catch:{ all -> 0x05f0 }
            java.io.File r1 = r2.A0V(r7, r3)     // Catch:{ all -> 0x05f0 }
            int r0 = r9.A01     // Catch:{ all -> 0x05f0 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x05e2
            if (r1 == 0) goto L_0x05bc
            boolean r0 = X.AnonymousClass36O.A04(r40)     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x05bc
            r1.delete()     // Catch:{ all -> 0x05f0 }
        L_0x05bc:
            boolean r0 = X.AnonymousClass36O.A06(r40)     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x05e2
            boolean r0 = r4.A0R     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x05e2
            java.io.File r2 = r2.A0W(r7, r3)     // Catch:{ all -> 0x05f0 }
            if (r2 == 0) goto L_0x05e2
            boolean r0 = r2.exists()     // Catch:{ all -> 0x05f0 }
            if (r0 == 0) goto L_0x05e2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05f0 }
            java.lang.String r0 = "MediaDownload/deleteAnimatedStickerThumbnail/deleting file:"
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r2, r0, r1)     // Catch:{ all -> 0x05f0 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x05f0 }
            r2.delete()     // Catch:{ all -> 0x05f0 }
        L_0x05e2:
            r29.close()     // Catch:{ 1fo -> 0x05ed, 4uq -> 0x07af, IllegalArgumentException -> 0x0718, IOException -> 0x07ad }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x05ed:
            r2 = move-exception
            goto L_0x0728
        L_0x05f0:
            r1 = move-exception
            goto L_0x070c
        L_0x05f3:
            r2 = move-exception
            goto L_0x0689
        L_0x05f6:
            r1 = move-exception
            goto L_0x0673
        L_0x05f8:
            r2 = move-exception
            goto L_0x0610
        L_0x05fa:
            r1 = move-exception
            goto L_0x05fe
        L_0x05fc:
            r1 = move-exception
            r8 = 0
        L_0x05fe:
            r25.close()     // Catch:{ all -> 0x0602 }
            goto L_0x0606
        L_0x0602:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0609, all -> 0x0607 }
        L_0x0606:
            throw r1     // Catch:{ IOException -> 0x0609, all -> 0x0607 }
        L_0x0607:
            r1 = move-exception
            goto L_0x0673
        L_0x0609:
            r2 = move-exception
            goto L_0x0610
        L_0x060b:
            r1 = move-exception
            r8 = 0
            goto L_0x0673
        L_0x060e:
            r2 = move-exception
            r8 = 0
        L_0x0610:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0672 }
            java.lang.String r0 = "MediaDownload/MMS download failed to open url connection input stream; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x0672 }
            r1.append(r11)     // Catch:{ all -> 0x0670 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r12, r1)     // Catch:{ all -> 0x066e }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x066e }
            X.2p6 r1 = r5.A08     // Catch:{ all -> 0x066e }
            boolean r0 = r1.A02(r2)     // Catch:{ all -> 0x066e }
            if (r0 == 0) goto L_0x064a
            r1.A00()     // Catch:{ all -> 0x066e }
            boolean r1 = r5.A00     // Catch:{ all -> 0x066e }
            r0 = 15
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x066e }
            r26.close()     // Catch:{ IOException -> 0x067e, all -> 0x067c }
            r27.close()     // Catch:{ all -> 0x0668 }
            r28.close()     // Catch:{ IOException -> 0x0662 }
            r29.close()     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x064a:
            int r1 = X.C1451674l.A00(r2)     // Catch:{ all -> 0x066e }
            boolean r0 = r5.A00     // Catch:{ all -> 0x066e }
            X.35m r7 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x066e }
            r26.close()     // Catch:{ IOException -> 0x067e, all -> 0x067c }
            r27.close()     // Catch:{ all -> 0x0668 }
            r28.close()     // Catch:{ IOException -> 0x0662 }
            r29.close()     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
            goto L_0x0820
        L_0x0662:
            r7 = move-exception
            goto L_0x0665
        L_0x0664:
            r7 = move-exception
        L_0x0665:
            r3 = 9
            goto L_0x06dc
        L_0x0668:
            r1 = move-exception
            goto L_0x066b
        L_0x066a:
            r1 = move-exception
        L_0x066b:
            r3 = 9
            goto L_0x06ce
        L_0x066e:
            r1 = move-exception
            goto L_0x0673
        L_0x0670:
            r1 = move-exception
            goto L_0x0673
        L_0x0672:
            r1 = move-exception
        L_0x0673:
            r26.close()     // Catch:{ all -> 0x0677 }
            goto L_0x067b
        L_0x0677:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x067e, all -> 0x067c }
        L_0x067b:
            throw r1     // Catch:{ IOException -> 0x067e, all -> 0x067c }
        L_0x067c:
            r1 = move-exception
            goto L_0x0684
        L_0x067e:
            r2 = move-exception
            goto L_0x0689
        L_0x0680:
            r1 = move-exception
            r8 = 0
            goto L_0x0684
        L_0x0683:
            r1 = move-exception
        L_0x0684:
            r3 = 9
            goto L_0x06bf
        L_0x0687:
            r2 = move-exception
            r8 = 0
        L_0x0689:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06bc }
            java.lang.String r0 = "MediaDownload/MMS download encountered error while dealing with server file; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x06bc }
            r1.append(r11)     // Catch:{ all -> 0x06bc }
            r1.append(r12)     // Catch:{ all -> 0x06bc }
            java.lang.String r0 = "; serverFile="
            java.lang.String r0 = X.AnonymousClass000.A0P(r10, r0, r1)     // Catch:{ all -> 0x06bc }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x06bc }
            boolean r0 = r5.A00     // Catch:{ all -> 0x06bc }
            r3 = 9
            X.35m r9 = X.C625435m.A00(r8, r3, r0)     // Catch:{ all -> 0x06ba }
            r27.close()     // Catch:{ all -> 0x06c8 }
            r28.close()     // Catch:{ IOException -> 0x06d7 }
            r29.close()     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x06ba:
            r1 = move-exception
            goto L_0x06bf
        L_0x06bc:
            r1 = move-exception
            r3 = 9
        L_0x06bf:
            r27.close()     // Catch:{ all -> 0x06c3 }
            goto L_0x06c7
        L_0x06c3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06c8 }
        L_0x06c7:
            throw r1     // Catch:{ all -> 0x06c8 }
        L_0x06c8:
            r1 = move-exception
            goto L_0x06ce
        L_0x06ca:
            r1 = move-exception
            r3 = 9
            r8 = 0
        L_0x06ce:
            r28.close()     // Catch:{ all -> 0x06d2 }
            goto L_0x06d6
        L_0x06d2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x06d7 }
        L_0x06d6:
            throw r1     // Catch:{ IOException -> 0x06d7 }
        L_0x06d7:
            r7 = move-exception
            goto L_0x06dc
        L_0x06d9:
            r7 = move-exception
            r3 = 9
        L_0x06dc:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0706 }
            java.lang.String r0 = "MediaDownload/MMS download encountered error while dealing with download file; mediaHash="
            X.C47662dc.A00(r4, r0, r2)     // Catch:{ all -> 0x0706 }
            r2.append(r11)     // Catch:{ all -> 0x0706 }
            r2.append(r12)     // Catch:{ all -> 0x0706 }
            java.lang.String r1 = "; downloadFile="
            r0 = r47
            java.lang.String r0 = X.AnonymousClass000.A0P(r0, r1, r2)     // Catch:{ all -> 0x0706 }
            com.whatsapp.util.Log.w(r0, r7)     // Catch:{ all -> 0x0706 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0706 }
            X.35m r9 = X.C625435m.A00(r8, r3, r0)     // Catch:{ all -> 0x0706 }
            r29.close()     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x0706:
            r1 = move-exception
            goto L_0x070c
        L_0x0708:
            r1 = move-exception
            goto L_0x070c
        L_0x070a:
            r1 = move-exception
            r8 = 0
        L_0x070c:
            r29.close()     // Catch:{ all -> 0x0710 }
            goto L_0x0714
        L_0x0710:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
        L_0x0714:
            throw r1     // Catch:{ 1fo -> 0x0715, 4uq -> 0x07b3, IllegalArgumentException -> 0x0718, IOException -> 0x07b1 }
        L_0x0715:
            r2 = move-exception
            goto L_0x0728
        L_0x0717:
            r8 = 0
        L_0x0718:
            boolean r1 = r5.A00     // Catch:{ all -> 0x0837 }
            r0 = 1
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x0726:
            r2 = move-exception
            r8 = 0
        L_0x0728:
            X.C56852sf.A00(r6, r2, r12)     // Catch:{ all -> 0x0837 }
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0837 }
            if (r0 != 0) goto L_0x0732
            r0 = r2
        L_0x0732:
            boolean r0 = r0 instanceof org.chromium.net.CronetException     // Catch:{ all -> 0x0837 }
            if (r0 == 0) goto L_0x0811
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0837 }
            if (r0 != 0) goto L_0x073d
            r0 = r2
        L_0x073d:
            java.lang.Integer r1 = X.C154457dC.A00(r0)     // Catch:{ all -> 0x0837 }
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0837 }
            if (r0 != 0) goto L_0x0748
            r0 = r2
        L_0x0748:
            boolean r0 = X.C154457dC.A01(r0)     // Catch:{ all -> 0x0837 }
            if (r0 == 0) goto L_0x0761
            if (r1 == 0) goto L_0x0761
            int r1 = r1.intValue()     // Catch:{ all -> 0x0837 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0837 }
            X.35m r9 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x0761:
            boolean r1 = r5.A00     // Catch:{ all -> 0x0837 }
            r0 = 22
            X.35m r9 = X.C625435m.A00(r8, r0, r1)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
            goto L_0x0776
        L_0x0770:
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0794
        L_0x0776:
            r6.A07()     // Catch:{ all -> 0x0842 }
            goto L_0x0794
        L_0x077a:
            r3 = move-exception
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0842 }
            java.lang.String r0 = "MediaDownload/MMS download failed in pre-download with Exception; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x0842 }
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r11, r1)     // Catch:{ all -> 0x0842 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x0842 }
            boolean r1 = r5.A00     // Catch:{ all -> 0x0842 }
            r0 = 26
            X.35m r9 = X.C625435m.A00(r2, r0, r1)     // Catch:{ all -> 0x0842 }
        L_0x0794:
            long r3 = r6.A02()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            r6.A09()
            return r9
        L_0x07a2:
            r2 = move-exception
            goto L_0x07b7
        L_0x07a4:
            r4 = move-exception
            goto L_0x07dd
        L_0x07a6:
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0829
            goto L_0x0826
        L_0x07ad:
            r2 = move-exception
            goto L_0x07b7
        L_0x07af:
            r4 = move-exception
            goto L_0x07dd
        L_0x07b1:
            r2 = move-exception
            goto L_0x07b7
        L_0x07b3:
            r4 = move-exception
            goto L_0x07dd
        L_0x07b5:
            r2 = move-exception
            r8 = 0
        L_0x07b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0837 }
            java.lang.String r0 = "MediaDownload/MMS download failed with IOException while retrieving response code; mediaHash="
            X.C47662dc.A00(r4, r0, r1)     // Catch:{ all -> 0x0837 }
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r11, r1)     // Catch:{ all -> 0x0837 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0837 }
            X.C56852sf.A00(r6, r2, r12)     // Catch:{ all -> 0x0837 }
            int r1 = X.C1451674l.A00(r2)     // Catch:{ all -> 0x0837 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0837 }
            X.35m r7 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0829
            goto L_0x0826
        L_0x07db:
            r4 = move-exception
            r8 = 0
        L_0x07dd:
            r6.A07()     // Catch:{ all -> 0x0837 }
            X.C56852sf.A00(r6, r4, r12)     // Catch:{ all -> 0x0837 }
            int r3 = r4.responseCode     // Catch:{ all -> 0x0837 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r3)     // Catch:{ all -> 0x0837 }
            r6.A0U = r0     // Catch:{ all -> 0x0837 }
            X.1i8 r2 = r5.A0F     // Catch:{ all -> 0x0837 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0837 }
            java.lang.String r0 = "routeselector/onmediatransfererrororresponsecode/code "
            X.C18260x0.A0y(r0, r1, r3)     // Catch:{ all -> 0x0837 }
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x07ff
            r0 = 403(0x193, float:5.65E-43)
            if (r3 != r0) goto L_0x0802
        L_0x07ff:
            r2.A0E()     // Catch:{ all -> 0x0837 }
        L_0x0802:
            int r1 = r4.downloadStatus     // Catch:{ all -> 0x0837 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0837 }
            X.35m r7 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0829
            goto L_0x0826
        L_0x0811:
            int r1 = r2.downloadStatus     // Catch:{ all -> 0x0837 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0837 }
            X.35m r7 = X.C625435m.A00(r8, r1, r0)     // Catch:{ all -> 0x0837 }
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0829
            goto L_0x0826
        L_0x0820:
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0829
        L_0x0826:
            r6.A07()     // Catch:{ all -> 0x0842 }
        L_0x0829:
            long r3 = r6.A02()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0836
            r6.A09()
        L_0x0836:
            return r7
        L_0x0837:
            r1 = move-exception
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0842 }
            if (r0 != 0) goto L_0x0841
            r6.A07()     // Catch:{ all -> 0x0842 }
        L_0x0841:
            throw r1     // Catch:{ all -> 0x0842 }
        L_0x0842:
            r5 = move-exception
            long r3 = r6.A02()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0850
            r6.A09()
        L_0x0850:
            throw r5
        L_0x0851:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            X.C47662dc.A00(r4, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r12, r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60342yO.A01(X.7US, java.io.File, java.lang.String, java.net.URL, boolean):X.35m");
    }
}
