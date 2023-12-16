package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6ku  reason: invalid class name and case insensitive filesystem */
public class C135586ku extends C172738Mn {
    public static final C148257Hr A0K = new C148257Hr(30, 72);
    public static final C148257Hr A0L = new C148257Hr(48, 96);
    public final PowerManager.WakeLock A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final Mp4Ops A03;
    public final C153407bG A04;
    public final C56512s6 A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass3DM A08;
    public final AnonymousClass319 A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final C66833My A0C;
    public final C135476kj A0D;
    public final C162287rd A0E;
    public final C149887Oh A0F;
    public final AnonymousClass306 A0G;
    public final C989053r A0H;
    public final C162397rz A0I;
    public final AnonymousClass4FS A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C135526ko A04(X.C135486kk r8, X.C30471mV r9, java.io.File r10) {
        /*
            r7 = this;
            r6 = 0
            if (r9 == 0) goto L_0x00c4
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x00c4
            X.33C r0 = r9.A01
            if (r0 == 0) goto L_0x00c4
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00c4
            X.306 r1 = r7.A0G     // Catch:{ IOException -> 0x00bb }
            X.33C r0 = r9.A01     // Catch:{ IOException -> 0x00bb }
            java.io.File r0 = r0.A0F     // Catch:{ IOException -> 0x00bb }
            X.C627536m.A0C(r1, r0, r10)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r1 = r9.A04     // Catch:{ IOException -> 0x00bb }
            X.2qk r0 = r7.A01     // Catch:{ IOException -> 0x00bb }
            java.lang.String r0 = X.C615131b.A00(r0, r10)     // Catch:{ IOException -> 0x00bb }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x00bb }
            if (r0 != 0) goto L_0x0030
            X.C627536m.A0O(r10)     // Catch:{ IOException -> 0x00bb }
            return r6
        L_0x0030:
            X.6kj r3 = r7.A0D     // Catch:{ IOException -> 0x00bb }
            boolean r5 = r3.A05     // Catch:{ IOException -> 0x00bb }
            X.2z0 r0 = r9.A1J     // Catch:{ IOException -> 0x00bb }
            X.4uZ r0 = r0.A00     // Catch:{ IOException -> 0x00bb }
            boolean r0 = r0 instanceof X.C135166kE     // Catch:{ IOException -> 0x00bb }
            if (r5 != r0) goto L_0x0052
            X.3My r1 = r7.A0C     // Catch:{ IOException -> 0x00bb }
            X.30w r0 = r9.A0y()     // Catch:{ IOException -> 0x00bb }
            X.C626936e.A06(r0)     // Catch:{ IOException -> 0x00bb }
            r1.A00(r0)     // Catch:{ IOException -> 0x00bb }
            X.30w r0 = r9.A0y()     // Catch:{ IOException -> 0x00bb }
            byte[] r2 = r0.A09()     // Catch:{ IOException -> 0x00bb }
            if (r2 != 0) goto L_0x0066
        L_0x0052:
            if (r5 == 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            X.7Hr r0 = A0K     // Catch:{ IOException -> 0x00bb }
            r2 = 30
            goto L_0x005e
        L_0x005a:
            X.7Hr r0 = A0L     // Catch:{ IOException -> 0x00bb }
            r2 = 48
        L_0x005e:
            int r1 = r0.A01     // Catch:{ IOException -> 0x00bb }
            r0 = r5 ^ 1
            byte[] r2 = X.C989053r.A09(r10, r2, r1, r0)     // Catch:{ IOException -> 0x00bb }
        L_0x0066:
            X.7kZ r4 = r3.A01     // Catch:{ IOException -> 0x00bb }
            java.io.File r0 = r3.A03     // Catch:{ IOException -> 0x00bb }
            long r0 = r0.length()     // Catch:{ IOException -> 0x00bb }
            X.6ie r3 = r4.A03     // Catch:{ IOException -> 0x00bb }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00bb }
            r3.A0K = r0     // Catch:{ IOException -> 0x00bb }
            r0 = 3
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ IOException -> 0x00bb }
            r3.A0P = r0     // Catch:{ IOException -> 0x00bb }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x00bb }
            r3.A01 = r0     // Catch:{ IOException -> 0x00bb }
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00bb }
            r3.A00 = r0     // Catch:{ IOException -> 0x00bb }
            int r0 = r9.A0B     // Catch:{ IOException -> 0x00bb }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ IOException -> 0x00bb }
            r3.A06 = r0     // Catch:{ IOException -> 0x00bb }
            java.lang.Long r0 = X.AnonymousClass6C9.A0Z(r10)     // Catch:{ IOException -> 0x00bb }
            r3.A08 = r0     // Catch:{ IOException -> 0x00bb }
            long r0 = X.C989053r.A01(r10)     // Catch:{ IOException -> 0x00bb }
            long r0 = X.C18290x4.A0B(r0)     // Catch:{ IOException -> 0x00bb }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00bb }
            r3.A05 = r0     // Catch:{ IOException -> 0x00bb }
            r4.A01()     // Catch:{ IOException -> 0x00bb }
            int r0 = r9.A0B     // Catch:{ IOException -> 0x00bb }
            r8.A00 = r0     // Catch:{ IOException -> 0x00bb }
            r0 = 1
            r8.A01 = r0     // Catch:{ IOException -> 0x00bb }
            r8.A00 = r10     // Catch:{ IOException -> 0x00bb }
            r8.A03 = r2     // Catch:{ IOException -> 0x00bb }
            r8.A02 = r0     // Catch:{ IOException -> 0x00bb }
            X.6ko r0 = r8.A00()     // Catch:{ IOException -> 0x00bb }
            return r0
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/attemptReuseExistingVideo"
            com.whatsapp.util.Log.e(r0, r1)
            X.C627536m.A0O(r10)
        L_0x00c4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135586ku.A04(X.6kk, X.1mV, java.io.File):X.6ko");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d9, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03da, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03dd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03de, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0404, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0405, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x041f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0420, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044e, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0451, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0452, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ce, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d1, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        com.whatsapp.util.Log.d("ProcessVideoTask/errorComputingHash", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x036a A[Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x038c A[Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03d9 A[ExcHandler: 6z0 (e X.6z0), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03dd A[ExcHandler: IOException (e java.io.IOException), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0404 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x041f A[ExcHandler: 6pi (e X.6pi), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x044d A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0451 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:16:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e6 A[Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e7 A[Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7N0 A03() {
        /*
            r54 = this;
            r8 = r54
            X.2oU r0 = r8.A06
            r53 = r0
            X.4FS r1 = r8.A0J
            com.whatsapp.Mp4Ops r0 = r8.A03
            r20 = r0
            X.1VX r0 = r8.A0A
            r52 = r0
            X.2qk r0 = r8.A01
            r51 = r0
            X.7bG r0 = r8.A04
            r50 = r0
            X.7rd r0 = r8.A0E
            r22 = r0
            X.2s6 r0 = r8.A05
            r49 = r0
            X.33p r0 = r8.A07
            r19 = r0
            X.7qj r9 = new X.7qj
            r10 = r51
            r11 = r20
            r12 = r50
            r13 = r49
            r14 = r53
            r15 = r0
            r16 = r52
            r17 = r22
            r18 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r9.A03()
            X.6kj r9 = r8.A0D
            java.io.File r7 = r9.A06
            java.io.File r10 = r9.A03
            long r31 = r10.length()
            long r0 = r9.A00
            r16 = r0
            long r4 = r9.A01
            boolean r0 = r9.A06
            r30 = r0
            r3 = 0
            if (r0 == 0) goto L_0x00ff
            X.7Yn r29 = r22.A0C()
        L_0x0058:
            X.7Oh r6 = r8.A0F
            r0 = r29
            int r0 = r0.A02
            r15 = r0
            r0 = r29
            int r12 = r0.A01
            X.2oU r11 = r6.A02
            X.4FS r3 = r6.A05
            X.1VX r2 = r6.A03
            X.2qk r1 = r6.A00
            X.7rd r0 = r6.A04
            X.7bG r6 = r6.A01
            X.8HT r14 = new X.8HT
            r34 = r1
            r35 = r20
            r36 = r6
            r37 = r11
            r38 = r2
            r39 = r0
            r40 = r3
            r41 = r10
            r42 = r7
            r43 = r15
            r44 = r12
            r45 = r16
            r47 = r4
            r33 = r14
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47)
            r9.A00(r14)
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r19)
            java.lang.String r0 = "video_transcode_saved_local_config"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x00fd
            X.7n7 r0 = X.C160147n7.A00(r0)
        L_0x00a3:
            r14.A05 = r0
            X.5aV r0 = r9.A02
            r28 = 0
            if (r0 == 0) goto L_0x00af
            r28 = 1
            r14.A08 = r0
        L_0x00af:
            X.7kZ r12 = r9.A01
            X.6kk r11 = new X.6kk
            r11.<init>()
            r1 = 422(0x1a6, float:5.91E-43)
            r0 = r52
            boolean r2 = r0.A0X(r1)
            int r0 = X.AnonymousClass8HT.A02(r2)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.6ie r6 = r12.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A04 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r31)
            r6.A0K = r0
            r0 = 3
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A0P = r0
            boolean r0 = r9.A05
            r27 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r27)
            r6.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)
            r6.A00 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r12.A00 = r0
            java.util.Objects.requireNonNull(r9)
            r1 = 2
            X.92O r0 = new X.92O
            r0.<init>(r9, r1)
            r14.A06 = r0
            goto L_0x010b
        L_0x00fd:
            r0 = 0
            goto L_0x00a3
        L_0x00ff:
            boolean r2 = r9.A05
            boolean r1 = r9.A04
            r0 = r22
            X.7Yn r29 = r0.A0D(r2, r3, r1)
            goto L_0x0058
        L_0x010b:
            X.3DM r0 = r8.A08     // Catch:{ Exception -> 0x0119 }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x0119 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0119 }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x0119 }
            goto L_0x011f
        L_0x0119:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x011f:
            android.os.PowerManager$WakeLock r0 = r8.A00     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r26 = r0
            if (r0 == 0) goto L_0x0128
            r26.acquire()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x0128:
            boolean r0 = r10.exists()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x03c7
            int r1 = X.AnonymousClass8HT.A02(r2)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = 1
            if (r1 != r0) goto L_0x0334
            X.5Qm r13 = new X.5Qm     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r13.<init>(r10)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r3 = r13.A03     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r2 = r13.A01     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r3 == 0) goto L_0x032d
            if (r2 == 0) goto L_0x032d
            int r0 = java.lang.Math.max(r3, r2)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r0 = java.lang.Math.min(r15, r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            android.util.Pair r1 = X.C162287rd.A04(r3, r2, r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r25 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r24 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            boolean r0 = r9.A08     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r23 = r0
            long r0 = r13.A04     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r20 = r0
            long r18 = X.C18290x4.A0B(r20)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r2 = r31
            r15 = r22
            r0 = r18
            boolean r22 = r15.A0F(r2, r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r1 = 5178(0x143a, float:7.256E-42)
            r0 = r52
            boolean r3 = r0.A0X(r1)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r12.A03(r13)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r1 = 0
            int r18 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r18 != 0) goto L_0x0217
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0217
            if (r28 != 0) goto L_0x0217
            if (r23 != 0) goto L_0x018b
            if (r22 == 0) goto L_0x0217
        L_0x018b:
            if (r3 != 0) goto L_0x0217
            java.lang.String r0 = "mediatranscodequeue/attemptToDedupeVideo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r51
            java.lang.String r1 = X.C615131b.A00(r0, r10)     // Catch:{ IOException -> 0x01d0, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            if (r30 == 0) goto L_0x01ad
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            java.lang.String r2 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r0)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
        L_0x01ad:
            boolean r0 = r9.A07     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x01c4
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            java.lang.String r2 = "-mute"
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r0)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
        L_0x01c4:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            java.lang.String r2 = "mediatranscodequeue/computedHash="
            X.C18260x0.A0s(r2, r1, r0)     // Catch:{ IOException -> 0x01ce, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, 6z0 -> 0x03d9 }
            goto L_0x01d7
        L_0x01ce:
            r2 = move-exception
            goto L_0x01d2
        L_0x01d0:
            r2 = move-exception
            r1 = 0
        L_0x01d2:
            java.lang.String r0 = "ProcessVideoTask/errorComputingHash"
            com.whatsapp.util.Log.d(r0, r2)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x01d7:
            X.319 r0 = r8.A09     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r3 = r0
            X.1mV r0 = r0.A0C(r1)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x01e7
            X.6ko r2 = r8.A04(r11, r0, r7)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r2 == 0) goto L_0x01e7
            goto L_0x0208
        L_0x01e7:
            if (r1 == 0) goto L_0x0215
            r2 = 3
            java.util.Collection r0 = r3.A0H(r1, r2)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x01f2:
            boolean r0 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x0215
            java.lang.Object r2 = r3.next()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            X.1mV r2 = (X.C30471mV) r2     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            boolean r0 = r2 instanceof X.C31971pB     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x01f2
            X.6ko r2 = r8.A04(r11, r2, r7)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r2 == 0) goto L_0x01f2
        L_0x0208:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            X.C172738Mn.A02(r26)
            X.3DM r0 = r8.A08
            r0.A01()
            return r2
        L_0x0215:
            r11.A01 = r1     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x0217:
            r1 = r25
            r0 = r24
            r12.A02(r1, r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r51
            X.7nN r0 = X.C162397rz.A06(r0, r10)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = 8
            if (r1 != r0) goto L_0x02a8
            java.lang.String r0 = "mediatranscodequeue/needs dolby EAC3 Audio track removal"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r49
            java.io.File r2 = r0.A03(r10)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            r0 = r50
            X.6ic r15 = r0.A03(r10, r2)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ Error -> 0x024d }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ Error -> 0x024d }
            com.whatsapp.Mp4Ops$LibMp4OperationResult r3 = com.whatsapp.Mp4Ops.mp4removeDolbyEAC3Track(r1, r0)     // Catch:{ Error -> 0x024d }
            goto L_0x025c
        L_0x024d:
            r1 = move-exception
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.String r1 = "integrity check error"
            r0 = 0
            X.6z0 r3 = new X.6z0     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            r3.<init>(r0, r1)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            goto L_0x027d
        L_0x025c:
            r1 = r50
            X.C153407bG.A00(r3, r1, r15, r2)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            boolean r0 = r3.success     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            if (r0 != 0) goto L_0x0290
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.String r0 = "mp4ops/check/error_message/"
            r1.append(r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.String r0 = r3.errorMessage     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            X.C18260x0.A1K(r1, r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            boolean r0 = r3.ioException     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = "No space"
            java.io.IOException r3 = X.AnonymousClass002.A0C(r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
        L_0x027d:
            throw r3     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
        L_0x027e:
            int r2 = r3.errorCode     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            java.lang.String r0 = "removeDolbyEAC3Track failed, error_code: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            X.6z0 r3 = new X.6z0     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            r3.<init>(r2, r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            goto L_0x027d
        L_0x0290:
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            r14.A0A = r2     // Catch:{ 6z0 -> 0x0298, IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd }
            goto L_0x02a9
        L_0x0298:
            r4 = move-exception
            r0 = r53
            android.content.Context r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r5 = "remove dolby audio track fail"
            r1 = r51
            r2 = r50
            r3 = r7
            com.whatsapp.Mp4Ops.A00(r0, r1, r2, r3, r4, r5)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            throw r4     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x02a8:
            r2 = r10
        L_0x02a9:
            if (r18 < 0) goto L_0x02e4
            r18 = 0
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e4
            if (r23 != 0) goto L_0x02e1
            r1 = 3
            r0 = r29
            boolean r0 = X.C162287rd.A08(r0, r13, r1)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 != 0) goto L_0x02e1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = "mediatranscodequeue/trim/from="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r16
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = ", to="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r2.append(r4)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = ", duration="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r20
            X.C18260x0.A1I(r2, r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = "trim"
            r6.A0R = r0     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x0342
        L_0x02e1:
            long r20 = r4 - r16
            goto L_0x031d
        L_0x02e4:
            if (r22 != 0) goto L_0x02f2
            if (r23 != 0) goto L_0x02f2
            java.lang.String r0 = "mediatranscodequeue/copy/not-need-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            boolean r3 = r8.A07(r12, r2, r7)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x0366
        L_0x02f2:
            r1 = 228(0xe4, float:3.2E-43)
            r0 = r52
            boolean r0 = r0.A0X(r1)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            if (r0 == 0) goto L_0x031d
            if (r28 != 0) goto L_0x031d
            if (r22 == 0) goto L_0x031d
            if (r23 != 0) goto L_0x031d
            r30 = r8
            r31 = r12
            r32 = r29
            r34 = r25
            r35 = r24
            r36 = r20
            r30.A05(r31, r32, r33, r34, r35, r36)     // Catch:{ 6pi | 6z0 | IOException -> 0x0312 }
            goto L_0x0345
        L_0x0312:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/transcodeVideoWithFallback/exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            boolean r3 = r8.A07(r12, r2, r7)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x0366
        L_0x031d:
            r30 = r8
            r31 = r12
            r32 = r29
            r34 = r25
            r35 = r24
            r36 = r20
            r30.A05(r31, r32, r33, r34, r35, r36)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x0345
        L_0x032d:
            X.6pi r1 = new X.6pi     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x03d8
        L_0x0334:
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0347
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0347
            java.lang.String r0 = "trim"
            r6.A0R = r0     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x0342:
            r14.A0I()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x0345:
            r3 = 1
            goto L_0x0366
        L_0x0347:
            long r0 = r10.length()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            double r4 = (double) r0     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = r29
            int r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            long r2 = (long) r0     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 * r0
            double r0 = (double) r2     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x03d4
            java.lang.String r0 = "mediatranscodequeue/copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            boolean r3 = r8.A07(r12, r10, r7)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x0366:
            boolean r0 = r14.A0R     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            if (r0 != 0) goto L_0x038c
            boolean r0 = r9.A07     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            if (r0 == 0) goto L_0x037b
            boolean r0 = r14.A0S     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            if (r0 != 0) goto L_0x037b
            r2 = r51
            r1 = r50
            r0 = r49
            com.whatsapp.Mp4Ops.A01(r2, r1, r0, r7)     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
        L_0x037b:
            X.7rz r0 = r8.A0I     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            boolean r0 = r0.A0G(r7)     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            if (r0 == 0) goto L_0x0385
            r4 = 1
            goto L_0x0391
        L_0x0385:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            throw r0     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
        L_0x038c:
            java.lang.String r0 = "cancel"
            r6.A0Q = r0     // Catch:{ IllegalStateException -> 0x03c4, IllegalArgumentException -> 0x03c1, 6pi -> 0x03bf, FileNotFoundException -> 0x03bd, IOException -> 0x03bb, 6z0 -> 0x03b9 }
            r4 = 0
        L_0x0391:
            android.util.Pair r2 = X.C107655bf.A0N(r7)     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            int r1 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            java.lang.Object r0 = r2.first     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            r12.A02(r1, r0)     // Catch:{ IllegalStateException -> 0x03b6, IllegalArgumentException -> 0x03b3, 6pi -> 0x03b1, FileNotFoundException -> 0x03af, IOException -> 0x03ad, 6z0 -> 0x03aa }
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            goto L_0x048b
        L_0x03aa:
            r2 = move-exception
            goto L_0x042d
        L_0x03ad:
            r2 = move-exception
            goto L_0x03e0
        L_0x03af:
            r2 = move-exception
            goto L_0x0407
        L_0x03b1:
            r1 = move-exception
            goto L_0x0422
        L_0x03b3:
            r2 = move-exception
            goto L_0x0467
        L_0x03b6:
            r2 = move-exception
            goto L_0x0454
        L_0x03b9:
            r2 = move-exception
            goto L_0x03db
        L_0x03bb:
            r2 = move-exception
            goto L_0x03df
        L_0x03bd:
            r2 = move-exception
            goto L_0x0406
        L_0x03bf:
            r1 = move-exception
            goto L_0x0421
        L_0x03c1:
            r2 = move-exception
            goto L_0x044f
        L_0x03c4:
            r2 = move-exception
            goto L_0x0453
        L_0x03c7:
            java.lang.String r0 = "mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            java.lang.String r0 = "transcode input file does not exist"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
            goto L_0x03d8
        L_0x03d4:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass6CA.A0N()     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x03d8:
            throw r1     // Catch:{ IllegalStateException -> 0x0451, IllegalArgumentException -> 0x044d, 6pi -> 0x041f, FileNotFoundException -> 0x0404, IOException -> 0x03dd, 6z0 -> 0x03d9 }
        L_0x03d9:
            r2 = move-exception
            r3 = 1
        L_0x03db:
            r4 = 0
            goto L_0x042d
        L_0x03dd:
            r2 = move-exception
            r3 = 1
        L_0x03df:
            r4 = 0
        L_0x03e0:
            java.lang.String r0 = "mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04eb }
            r8.A06(r2)     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "IOException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x04eb }
            r6.A0Q = r0     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04eb }
            if (r0 == 0) goto L_0x0483
            boolean r0 = X.C86624Kv.A1Z(r2)     // Catch:{ all -> 0x04eb }
            if (r0 == 0) goto L_0x0483
            r1 = 2131889102(0x7f120bce, float:1.9412858E38)
            goto L_0x047e
        L_0x0404:
            r2 = move-exception
            r3 = 1
        L_0x0406:
            r4 = 0
        L_0x0407:
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04eb }
            r8.A06(r2)     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "FileNotFoundException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x04eb }
            r6.A0Q = r0     // Catch:{ all -> 0x04eb }
            r1 = 2131889091(0x7f120bc3, float:1.9412836E38)
            goto L_0x047e
        L_0x041f:
            r1 = move-exception
            r3 = 1
        L_0x0421:
            r4 = 0
        L_0x0422:
            java.lang.String r0 = "mediatranscodequeue/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04eb }
            r8.A06(r1)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "BadVideoException"
            goto L_0x0447
        L_0x042d:
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04eb }
            r8.A06(r2)     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x04eb }
            int r0 = r2.errorCode     // Catch:{ all -> 0x04eb }
            r1.append(r0)     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = X.AnonymousClass000.A0e(r1)     // Catch:{ all -> 0x04eb }
        L_0x0447:
            r6.A0Q = r0     // Catch:{ all -> 0x04eb }
            r1 = 2131889070(0x7f120bae, float:1.9412793E38)
            goto L_0x047e
        L_0x044d:
            r2 = move-exception
            r3 = 1
        L_0x044f:
            r4 = 0
            goto L_0x0467
        L_0x0451:
            r2 = move-exception
            r3 = 1
        L_0x0453:
            r4 = 0
        L_0x0454:
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04eb }
            r8.A06(r2)     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "IllegalStateException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x04eb }
            goto L_0x0479
        L_0x0467:
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04eb }
            r8.A06(r2)     // Catch:{ all -> 0x04eb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04eb }
            java.lang.String r0 = "IllegalArgumentException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x04eb }
        L_0x0479:
            r6.A0Q = r0     // Catch:{ all -> 0x04eb }
            r1 = 2131889116(0x7f120bdc, float:1.9412886E38)
        L_0x047e:
            X.8oe r0 = r9.A05     // Catch:{ all -> 0x04eb }
            r0.B1x(r1)     // Catch:{ all -> 0x04eb }
        L_0x0483:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            android.os.PowerManager$WakeLock r0 = r8.A00
            r26 = r0
        L_0x048b:
            X.C172738Mn.A02(r26)
            X.3DM r0 = r8.A08
            r0.A01()
            if (r4 == 0) goto L_0x04e6
            if (r27 == 0) goto L_0x04e1
            X.7Hr r0 = A0L
            r2 = 48
        L_0x049b:
            int r1 = r0.A01
            r0 = r27 ^ 1
            byte[] r4 = X.C989053r.A09(r7, r2, r1, r0)
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b0
            if (r4 != 0) goto L_0x04b0
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x04b0:
            int r2 = X.C107655bf.A0F(r7)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r6.A06 = r0
            java.lang.Long r0 = X.AnonymousClass6C9.A0Z(r7)
            r6.A08 = r0
            long r0 = X.C989053r.A01(r7)
            long r0 = X.C18290x4.A0B(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A05 = r0
            r12.A01()
            r11.A00 = r2
            r11.A01 = r3
            r11.A00 = r7
            r11.A03 = r4
            r0 = 1
        L_0x04da:
            r11.A02 = r0
            X.6ko r2 = r11.A00()
            return r2
        L_0x04e1:
            X.7Hr r0 = A0K
            r2 = 30
            goto L_0x049b
        L_0x04e6:
            r12.A00()
            r0 = 0
            goto L_0x04da
        L_0x04eb:
            r1 = move-exception
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            android.os.PowerManager$WakeLock r0 = r8.A00
            X.C172738Mn.A02(r0)
            X.3DM r0 = r8.A08
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135586ku.A03():X.7N0");
    }

    public final void A05(C158797kZ r13, C152347Yn r14, AnonymousClass8HT r15, int i, int i2, long j) {
        C134226ie r5 = r13.A03;
        r5.A0R = "transcode";
        r5.A0D = AnonymousClass0x9.A0m(r14.A02);
        C135476kj r1 = this.A0D;
        r15.A0D = r1.A07;
        int i3 = r14.A00;
        int i4 = 9;
        if (r1.A05) {
            i4 = 6;
        }
        r15.A00 = C162287rd.A00(i3, i, i2, i4, j);
        r15.A0H();
        long j2 = (long) r15.A01;
        if (j2 > 0) {
            r5.A0M = Long.valueOf(C18290x4.A0B(j2));
        }
    }

    public final void A06(Exception exc) {
        C94934sK r1 = new C94934sK();
        r1.A01 = C18290x4.A0c();
        r1.A06 = exc.toString();
        this.A0B.BhB(r1);
    }

    public final boolean A07(C158797kZ r7, File file, File file2) {
        r7.A03.A0R = "checkAndRepair";
        File file3 = file2;
        this.A02.A0a(file, file2);
        try {
            return this.A03.A05(this.A04, file2);
        } catch (AnonymousClass6z0 e) {
            Mp4Ops.A00(this.A06.A00, this.A01, this.A04, file3, e, "only repair on upload");
            throw e;
        } catch (IOException e2) {
            Log.e("mediatranscodequeue/repair/io-exception/", e2);
            throw e2;
        }
    }

    public C135586ku(PowerManager.WakeLock wakeLock, C55682qk r3, C64393Dh r4, Mp4Ops mp4Ops, C153407bG r6, C56512s6 r7, C54292oU r8, AnonymousClass33p r9, AnonymousClass3DM r10, AnonymousClass319 r11, AnonymousClass1VX r12, AnonymousClass4FV r13, C66833My r14, C135476kj r15, C162287rd r16, C149887Oh r17, AnonymousClass306 r18, C989053r r19, C162397rz r20, AnonymousClass4FS r21) {
        super(r15);
        this.A06 = r8;
        this.A0J = r21;
        this.A03 = mp4Ops;
        this.A0A = r12;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r13;
        this.A0H = r19;
        this.A0E = r16;
        this.A04 = r6;
        this.A08 = r10;
        this.A09 = r11;
        this.A05 = r7;
        this.A0I = r20;
        this.A07 = r9;
        this.A0G = r18;
        this.A0F = r17;
        this.A0C = r14;
        this.A00 = wakeLock;
        this.A0D = r15;
    }
}
