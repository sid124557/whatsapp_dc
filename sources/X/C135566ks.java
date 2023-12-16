package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;

/* renamed from: X.6ks  reason: invalid class name and case insensitive filesystem */
public class C135566ks extends C172738Mn {
    public final PowerManager.WakeLock A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final Mp4Ops A03;
    public final C153407bG A04;
    public final C56512s6 A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass3DM A08;
    public final AnonymousClass1VX A09;
    public final C135456kh A0A;
    public final C162287rd A0B;
    public final C149887Oh A0C;
    public final C162397rz A0D;
    public final AnonymousClass4FS A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0295, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b8, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ce, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cf, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02dd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02de, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ef, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f0, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0294, code lost:
        r2 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b7 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:23:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ce A[ExcHandler: 6pi (e X.6pi), Splitter:B:23:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02dd A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:23:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ef A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:23:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01fb A[Catch:{ 6z0 -> 0x0212, IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023f A[Catch:{ 6z0 -> 0x0212, IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0294 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:23:0x014d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7N0 A03() {
        /*
            r53 = this;
            r6 = r53
            X.6kh r5 = r6.A0A
            X.7kZ r8 = r5.A01
            android.os.PowerManager$WakeLock r0 = r6.A00
            r29 = r0
            X.6kk r28 = new X.6kk
            r28.<init>()
            X.2oU r0 = r6.A06
            r52 = r0
            X.4FS r1 = r6.A0E
            com.whatsapp.Mp4Ops r0 = r6.A03
            r32 = r0
            X.1VX r9 = r6.A09
            X.2qk r0 = r6.A01
            r51 = r0
            X.7bG r0 = r6.A04
            r50 = r0
            X.7rd r0 = r6.A0B
            r49 = r0
            X.2s6 r0 = r6.A05
            r48 = r0
            X.33p r0 = r6.A07
            r47 = r0
            X.7qj r10 = new X.7qj
            r11 = r51
            r12 = r32
            r13 = r50
            r14 = r48
            r15 = r52
            r16 = r0
            r17 = r9
            r18 = r49
            r19 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r10.A03()
            java.io.File r7 = r5.A06
            r0 = 422(0x1a6, float:5.91E-43)
            boolean r18 = r9.A0X(r0)
            int r0 = X.AnonymousClass8HT.A02(r18)
            r46 = 0
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r2)
            X.6ie r4 = r8.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            r0 = 13
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r4.A0P = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.A00 = r0
            java.io.File r0 = r5.A03
            r27 = r0
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "mediatranscodequeue/failed to load, check MediaLoadGifJob logs to see details."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "FailedToLoad"
            r4.A0Q = r0
            r1 = 2131889115(0x7f120bdb, float:1.9412884E38)
            X.8oe r0 = r5.A05
            r0.B1x(r1)
        L_0x0089:
            r8.A00()
            r1 = 0
        L_0x008d:
            r0 = r28
            r0.A02 = r1
            X.6ko r0 = r28.A00()
            return r0
        L_0x0096:
            long r14 = r5.A00
            long r0 = r5.A01
            r25 = r0
            r0 = 3656(0xe48, float:5.123E-42)
            int r10 = r9.A0N(r0)
            boolean r1 = r5.A04
            r0 = 3654(0xe46, float:5.12E-42)
            if (r1 == 0) goto L_0x00aa
            r0 = 594(0x252, float:8.32E-43)
        L_0x00aa:
            int r1 = r9.A0N(r0)
            r0 = 1280(0x500, float:1.794E-42)
            int r3 = java.lang.Math.min(r1, r0)
            r0 = 3655(0xe47, float:5.122E-42)
            int r0 = r9.A0N(r0)
            long r0 = (long) r0
            r23 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r23
            int r9 = (int) r0
            X.7Yn r22 = new X.7Yn
            r0 = r22
            r0.<init>(r10, r3, r9)
            X.7Oh r10 = r6.A0C
            X.2oU r0 = r10.A02
            r17 = r0
            X.4FS r0 = r10.A05
            r16 = r0
            X.1VX r0 = r10.A03
            r13 = r0
            X.2qk r12 = r10.A00
            X.7rd r1 = r10.A04
            X.7bG r0 = r10.A01
            X.8HT r11 = new X.8HT
            r30 = r11
            r31 = r12
            r33 = r0
            r34 = r17
            r35 = r13
            r36 = r1
            r37 = r16
            r38 = r27
            r39 = r7
            r40 = r3
            r41 = r9
            r42 = r14
            r44 = r25
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44)
            r5.A00(r11)
            X.5aV r0 = r5.A02
            if (r0 == 0) goto L_0x0104
            r46 = 1
            r11.A08 = r0
        L_0x0104:
            long r20 = r27.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r4.A0K = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r46)
            r4.A00 = r0
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r47)
            java.lang.String r0 = "video_transcode_saved_local_config"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x0133
            X.7n7 r0 = X.C160147n7.A00(r0)
        L_0x0124:
            r11.A05 = r0
            java.util.Objects.requireNonNull(r5)
            X.92O r0 = new X.92O
            r0.<init>(r5, r2)
            r11.A06 = r0
            r11.A0C = r2
            goto L_0x0135
        L_0x0133:
            r0 = 0
            goto L_0x0124
        L_0x0135:
            X.3DM r0 = r6.A08     // Catch:{ Exception -> 0x0143 }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0143 }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x0143 }
            goto L_0x0149
        L_0x0143:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0149:
            r16 = 0
            if (r29 == 0) goto L_0x0150
            r29.acquire()     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x0150:
            boolean r0 = r27.exists()     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 == 0) goto L_0x0266
            X.5Qm r13 = new X.5Qm     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r0 = r27
            r13.<init>(r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            int r0 = X.AnonymousClass8HT.A02(r18)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            java.lang.String r19 = "mediatranscodequeue/gif/trim"
            java.lang.String r18 = "mediatranscodequeue/gif/apply-gif-tag-only"
            if (r0 != r2) goto L_0x01d4
            int r12 = r13.A03     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            int r10 = r13.A01     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r12 < r10) goto L_0x0199
            int r10 = r10 * r3
            int r10 = r10 / r12
            r12 = r3
        L_0x0170:
            long r2 = X.C107655bf.A0G(r27)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            long r2 = r2 / r23
            X.38t r42 = X.C633138t.A04     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r41 = r49
            r43 = r27
            r44 = r20
            boolean r0 = r41.A0J(r42, r43, r44, r46)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x01ac
            r9 = r49
            r0 = r20
            boolean r0 = r9.A0F(r0, r2)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x01ac
            r1 = 13
            r0 = r22
            boolean r0 = X.C162287rd.A08(r0, r13, r1)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x01ac
            goto L_0x019d
        L_0x0199:
            int r12 = r12 * r3
            int r12 = r12 / r10
            r10 = r3
            goto L_0x0170
        L_0x019d:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01a6
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a6
            goto L_0x01e0
        L_0x01a6:
            com.whatsapp.util.Log.i((java.lang.String) r18)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            X.3Dh r1 = r6.A02     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            goto L_0x01f1
        L_0x01ac:
            java.lang.String r0 = "mediatranscodequeue/gif/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            float r0 = X.AnonymousClass8HT.A00(r12, r10)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r11.A00 = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            java.lang.String r0 = "transcode"
            r4.A0R = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r11.A0H()     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r8.A03(r13)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r8.A02(r12, r10)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            int r0 = r11.A01     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ea
            long r0 = r0 / r23
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r4.A0M = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            goto L_0x01ea
        L_0x01d4:
            boolean r0 = r13.A07     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x0273
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01ec
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ec
        L_0x01e0:
            com.whatsapp.util.Log.i((java.lang.String) r19)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            java.lang.String r0 = "trim"
            r4.A0R = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r11.A0I()     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x01ea:
            r3 = 0
            goto L_0x01f7
        L_0x01ec:
            com.whatsapp.util.Log.i((java.lang.String) r18)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            X.3Dh r1 = r6.A02     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x01f1:
            r0 = r27
            r1.A0a(r0, r7)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r3 = 1
        L_0x01f7:
            boolean r0 = r11.A0R     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x023f
            boolean r0 = r11.A0S     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 != 0) goto L_0x0208
            r2 = r51
            r1 = r50
            r0 = r48
            com.whatsapp.Mp4Ops.A01(r2, r1, r0, r7)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x0208:
            if (r3 == 0) goto L_0x0229
            r1 = r32
            r0 = r50
            r1.A05(r0, r7)     // Catch:{ 6z0 -> 0x0212, IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294 }
            goto L_0x0225
        L_0x0212:
            r22 = move-exception
            r0 = r52
            android.content.Context r0 = r0.A00     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            java.lang.String r23 = "only repair gif on upload"
            r18 = r0
            r19 = r51
            r20 = r50
            r21 = r7
            com.whatsapp.Mp4Ops.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            throw r22     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x0225:
            java.lang.String r0 = "checkAndRepair"
            r4.A0R = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x0229:
            r0 = r48
            com.whatsapp.GifHelper.A00(r0, r7)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            X.7rz r0 = r6.A0D     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            boolean r0 = r0.A0G(r7)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            if (r0 == 0) goto L_0x0238
            r3 = 1
            goto L_0x0244
        L_0x0238:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            goto L_0x0279
        L_0x023f:
            java.lang.String r0 = "cancel"
            r4.A0Q = r0     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r3 = 0
        L_0x0244:
            android.util.Pair r2 = X.C107655bf.A0N(r7)     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            int r1 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            java.lang.Object r0 = r2.first     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            r8.A02(r1, r0)     // Catch:{ IllegalStateException -> 0x0263, IllegalArgumentException -> 0x0261, 6pi -> 0x025f, FileNotFoundException -> 0x025d, IOException -> 0x025b, 6z0 -> 0x0259 }
            goto L_0x030a
        L_0x0259:
            r2 = move-exception
            goto L_0x027c
        L_0x025b:
            r2 = move-exception
            goto L_0x0296
        L_0x025d:
            r2 = move-exception
            goto L_0x02b9
        L_0x025f:
            r1 = move-exception
            goto L_0x02d0
        L_0x0261:
            r2 = move-exception
            goto L_0x02df
        L_0x0263:
            r2 = move-exception
            goto L_0x02f1
        L_0x0266:
            java.lang.String r0 = "mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            java.lang.String r0 = "transcode input file does not exist"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
            goto L_0x0279
        L_0x0273:
            java.lang.String r0 = "cannot transcode gif"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x0279:
            throw r1     // Catch:{ IllegalStateException -> 0x02ef, IllegalArgumentException -> 0x02dd, 6pi -> 0x02ce, FileNotFoundException -> 0x02b7, IOException -> 0x0294, 6z0 -> 0x027a }
        L_0x027a:
            r2 = move-exception
            r3 = 0
        L_0x027c:
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x034b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x034b }
            int r0 = r2.errorCode     // Catch:{ all -> 0x034b }
            r1.append(r0)     // Catch:{ all -> 0x034b }
            java.lang.String r0 = X.AnonymousClass000.A0e(r1)     // Catch:{ all -> 0x034b }
            goto L_0x02d7
        L_0x0294:
            r2 = move-exception
            r3 = 0
        L_0x0296:
            java.lang.String r0 = "mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x034b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "IOException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x034b }
            r4.A0Q = r0     // Catch:{ all -> 0x034b }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x030a
            boolean r0 = X.C86624Kv.A1Z(r2)     // Catch:{ all -> 0x034b }
            if (r0 == 0) goto L_0x030a
            r1 = 2131889102(0x7f120bce, float:1.9412858E38)
            goto L_0x0305
        L_0x02b7:
            r2 = move-exception
            r3 = 0
        L_0x02b9:
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x034b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "FileNotFoundException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x034b }
            r4.A0Q = r0     // Catch:{ all -> 0x034b }
            r1 = 2131889089(0x7f120bc1, float:1.9412832E38)
            goto L_0x0305
        L_0x02ce:
            r1 = move-exception
            r3 = 0
        L_0x02d0:
            java.lang.String r0 = "mediatranscodequeue/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "BadVideoException"
        L_0x02d7:
            r4.A0Q = r0     // Catch:{ all -> 0x034b }
            r1 = 2131889068(0x7f120bac, float:1.941279E38)
            goto L_0x0305
        L_0x02dd:
            r2 = move-exception
            r3 = 0
        L_0x02df:
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x034b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "IllegalArgumentException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x034b }
            goto L_0x0300
        L_0x02ef:
            r2 = move-exception
            r3 = 0
        L_0x02f1:
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x034b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034b }
            java.lang.String r0 = "IllegalStateException: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x034b }
        L_0x0300:
            r4.A0Q = r0     // Catch:{ all -> 0x034b }
            r1 = 2131889115(0x7f120bdb, float:1.9412884E38)
        L_0x0305:
            X.8oe r0 = r5.A05     // Catch:{ all -> 0x034b }
            r0.B1x(r1)     // Catch:{ all -> 0x034b }
        L_0x030a:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            X.C172738Mn.A02(r29)
            X.3DM r0 = r6.A08
            r0.A01()
            if (r3 == 0) goto L_0x0089
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x033d
            if (r46 != 0) goto L_0x033d
            r2 = 0
        L_0x031f:
            int r1 = X.C107655bf.A0F(r7)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r4.A06 = r0
            java.lang.Long r0 = X.AnonymousClass6C9.A0Z(r7)
            r4.A08 = r0
            r8.A01()
            r0 = r28
            r0.A00 = r1
            r0.A00 = r7
            r0.A03 = r2
            r1 = 1
            goto L_0x008d
        L_0x033d:
            byte[] r2 = X.C107085af.A04(r7)
            if (r0 <= 0) goto L_0x031f
            if (r2 != 0) goto L_0x031f
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x031f
        L_0x034b:
            r1 = move-exception
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            X.C172738Mn.A02(r29)
            X.3DM r0 = r6.A08
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135566ks.A03():X.7N0");
    }

    public C135566ks(PowerManager.WakeLock wakeLock, C55682qk r2, C64393Dh r3, Mp4Ops mp4Ops, C153407bG r5, C56512s6 r6, C54292oU r7, AnonymousClass33p r8, AnonymousClass3DM r9, AnonymousClass1VX r10, C135456kh r11, C162287rd r12, C149887Oh r13, C162397rz r14, AnonymousClass4FS r15) {
        super(r11);
        this.A06 = r7;
        this.A0E = r15;
        this.A03 = mp4Ops;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = r12;
        this.A04 = r5;
        this.A08 = r9;
        this.A05 = r6;
        this.A0D = r14;
        this.A07 = r8;
        this.A0C = r13;
        this.A0A = r11;
        this.A00 = wakeLock;
    }
}
