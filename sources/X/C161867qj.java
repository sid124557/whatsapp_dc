package X;

import android.graphics.Color;
import com.whatsapp.Mp4Ops;

/* renamed from: X.7qj  reason: invalid class name and case insensitive filesystem */
public class C161867qj {
    public static final float[] A09 = {0.25f, 0.25f, 0.25f, 0.25f, 0.75f, 0.75f, 0.75f, 0.75f};
    public static final float[] A0A = {0.25f, 0.3f, 0.75f, 0.8f, 0.25f, 0.3f, 0.75f, 0.8f};
    public static final int[] A0B = {14557250, 14687296, 3292341, 3292341, 1423676, 1423676, 15990016, 15990016};
    public static final int[] A0C = {4408575, 4408575, 10296875, 10296875, 4696576, 4696576, 3014647, 3014647};
    public final C55682qk A00;
    public final Mp4Ops A01;
    public final C153407bG A02;
    public final C56512s6 A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;
    public final AnonymousClass1VX A06;
    public final C162287rd A07;
    public final AnonymousClass4FS A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v203, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x052e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0533, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0538, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x055e, code lost:
        if (r39 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05b7, code lost:
        if (r39 == null) goto L_0x05bc;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v98, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r4v12, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0538 A[ExcHandler: 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException (e java.lang.Throwable), PHI: r13 
      PHI: (r13v2 java.io.File) = (r13v0 java.io.File), (r13v0 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v3 java.io.File), (r13v0 java.io.File), (r13v0 java.io.File) binds: [B:113:0x01ea, B:119:0x01fd, B:140:0x02a7, B:141:?, B:230:0x0534, B:144:0x02b7, B:149:0x02c7, B:212:0x04d2, B:147:0x02be, B:148:?, B:138:0x029b, B:139:?, B:117:0x01f2, B:118:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:113:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x056a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0183 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0195 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0199 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019e A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a8 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd, all -> 0x05cd }, LOOP:0: B:5:0x003e->B:97:0x01a8, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r64 = this;
            r63 = r64
            r0 = r63
            X.1VX r0 = r0.A06
            r62 = r0
            r1 = 422(0x1a6, float:5.91E-43)
            boolean r0 = r0.A0X(r1)
            int r0 = X.AnonymousClass8HT.A02(r0)
            r3 = 1
            if (r0 != r3) goto L_0x05df
            r0 = r63
            X.33p r0 = r0.A05
            r61 = r0
            boolean r0 = r61.A2H()
            if (r0 != 0) goto L_0x05da
            r61.A10()
            java.lang.String r0 = "transcoderCompliance/run test"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7n7 r2 = new X.7n7
            r2.<init>()
            java.util.HashSet r31 = X.AnonymousClass002.A0K()
            java.util.HashSet r29 = X.AnonymousClass002.A0K()
            r27 = 0
            r30 = 0
            r28 = r30
            r21 = r30
        L_0x003e:
            java.lang.String r44 = "x"
            r1 = 422(0x1a6, float:5.91E-43)
            r0 = r62
            boolean r1 = r0.A0X(r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = r63
            X.7rd r4 = r0.A07     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            android.media.MediaCodecInfo r11 = X.C162287rd.A03(r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r13 = 0
            if (r11 != 0) goto L_0x01ac
            java.lang.String r0 = "transcoderCompliance/no media encoder found"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = 3
            X.7hU r6 = new X.7hU     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r6.<init>(r13, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x005e:
            r21 = r6
            java.lang.String r8 = r6.A06     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r8 == 0) goto L_0x0565
            int r7 = r6.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r7 <= 0) goto L_0x0565
            int r10 = r6.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r10 <= 0) goto L_0x0565
            java.lang.String r5 = r6.A07     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r5 == 0) goto L_0x0565
            int r4 = r6.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r4 <= 0) goto L_0x0565
            int r9 = r6.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r9 <= 0) goto L_0x0565
            r0 = r31
            X.C18270x1.A1K(r0, r9)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = r29
            X.C18270x1.A1K(r0, r10)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r1 = r6.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r1 == 0) goto L_0x0173
            if (r1 == r3) goto L_0x012d
            r0 = 2
            if (r1 == r0) goto L_0x0104
            r0 = 3
            if (r1 == r0) goto L_0x0173
            r0 = 4
            if (r1 == r0) goto L_0x00bd
            r0 = r29
            java.lang.Integer r4 = A01(r0, r10)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r4 != 0) goto L_0x009c
            r27 = 1
            goto L_0x00b6
        L_0x009c:
            r0 = r31
            r0.add(r4)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r15 = r4.intValue()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r5 = r2.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r4 = r2.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r0 = r2.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            X.7n7 r2 = new X.7n7     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r9 = r2
            r10 = r5
            r11 = r8
            r12 = r4
            r13 = r7
            r14 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x00b6:
            java.lang.String r0 = "transcoderCompliance/attempt/change_decoder"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x0175
        L_0x00bd:
            if (r30 == 0) goto L_0x00c6
            r0 = r30
            int r0 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r1 != r0) goto L_0x00c6
            goto L_0x0101
        L_0x00c6:
            r4 = 2
            r0 = 1
            if (r10 == r3) goto L_0x00d5
            if (r10 == r4) goto L_0x00d3
            r4 = 4
            r0 = 3
            if (r10 == r0) goto L_0x00d5
            if (r10 == r4) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r10 = r0
            goto L_0x00d6
        L_0x00d5:
            r10 = r4
        L_0x00d6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = r29
            boolean r0 = r0.contains(r4)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r0 != 0) goto L_0x0101
            r0 = r31
            r0.add(r4)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r5 = r2.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r4 = r2.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r0 = r2.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            X.7n7 r2 = new X.7n7     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r11 = r2
            r12 = r5
            r13 = r8
            r14 = r4
            r15 = r7
            r16 = r0
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x00fb:
            java.lang.String r0 = "transcoderCompliance/attempt/invert_decoder"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x0175
        L_0x0101:
            r27 = 1
            goto L_0x00fb
        L_0x0104:
            r0 = r31
            java.lang.Integer r6 = A01(r0, r9)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r6 != 0) goto L_0x010f
            r27 = 1
            goto L_0x0127
        L_0x010f:
            r0.add(r6)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r13 = r6.intValue()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r7 = r2.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r6 = r2.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r0 = r2.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            X.7n7 r2 = new X.7n7     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r8 = r2
            r9 = r5
            r10 = r7
            r11 = r4
            r12 = r6
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x0127:
            java.lang.String r0 = "transcoderCompliance/attempt/change_encoder"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x0175
        L_0x012d:
            if (r30 == 0) goto L_0x0136
            r0 = r30
            int r0 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r1 != r0) goto L_0x0136
            goto L_0x0170
        L_0x0136:
            r6 = 2
            r0 = 1
            if (r9 == r3) goto L_0x0145
            if (r9 == r6) goto L_0x0143
            r6 = 4
            r0 = 3
            if (r9 == r0) goto L_0x0145
            if (r9 == r6) goto L_0x0143
            goto L_0x0146
        L_0x0143:
            r9 = r0
            goto L_0x0146
        L_0x0145:
            r9 = r6
        L_0x0146:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = r31
            boolean r0 = r0.contains(r6)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r0 != 0) goto L_0x0170
            r0 = r31
            r0.add(r6)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r7 = r2.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r6 = r2.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            int r0 = r2.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            X.7n7 r2 = new X.7n7     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r10 = r2
            r11 = r5
            r12 = r7
            r13 = r4
            r14 = r6
            r15 = r9
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x016a:
            java.lang.String r0 = "transcoderCompliance/attempt/invert_encoder"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x0175
        L_0x0170:
            r27 = 1
            goto L_0x016a
        L_0x0173:
            r27 = 1
        L_0x0175:
            if (r30 == 0) goto L_0x01a6
            r0 = r30
            int r0 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r1 == r0) goto L_0x01a6
            r0 = r30
            int r1 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r1 == r3) goto L_0x0195
            r0 = 2
            if (r1 == r0) goto L_0x0192
            r0 = 4
            if (r1 == r0) goto L_0x018f
            r0 = 5
            if (r1 != r0) goto L_0x01a6
            java.lang.String r1 = "change-decoder"
            goto L_0x0197
        L_0x018f:
            java.lang.String r1 = "invert-decoder"
            goto L_0x0197
        L_0x0192:
            java.lang.String r1 = "change-encoder"
            goto L_0x0197
        L_0x0195:
            java.lang.String r1 = "invert-encoder"
        L_0x0197:
            if (r28 != 0) goto L_0x019e
            java.lang.StringBuilder r28 = X.C18330xA.A0A(r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x01a6
        L_0x019e:
            X.AnonymousClass001.A1M(r28)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r0 = r28
            r0.append(r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x01a6:
            if (r27 != 0) goto L_0x056a
            r30 = r21
            goto L_0x003e
        L_0x01ac:
            java.lang.String r43 = r11.getName()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "mp4"
            r5 = 2132017196(0x7f14002c, float:1.9672664E38)
            X.2s6 r6 = r0.A03     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
            X.2gw r0 = r6.A00()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
            java.io.File r39 = r0.A00(r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
            java.io.FileOutputStream r8 = X.AnonymousClass0x9.A0h(r39)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
            r0 = r63
            X.2oU r1 = r0.A04     // Catch:{ all -> 0x0546 }
            android.content.Context r0 = r1.A00     // Catch:{ all -> 0x0546 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0546 }
            java.io.InputStream r9 = r0.openRawResource(r5)     // Catch:{ all -> 0x0546 }
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r10]     // Catch:{ all -> 0x053a }
            r5 = 0
            int r0 = r9.read(r7, r5, r10)     // Catch:{ all -> 0x053a }
        L_0x01da:
            if (r0 < 0) goto L_0x01e4
            r8.write(r7, r5, r0)     // Catch:{ all -> 0x053a }
            int r0 = r9.read(r7, r5, r10)     // Catch:{ all -> 0x053a }
            goto L_0x01da
        L_0x01e4:
            r9.close()     // Catch:{ all -> 0x0546 }
            r8.close()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
            boolean r0 = r39.exists()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = "transcoderCompliance/test files not found"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            r0 = 3
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            r6.<init>(r13, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            goto L_0x0560
        L_0x01fd:
            X.5Qm r5 = new X.5Qm     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r39
            r5.<init>(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r8 = r5.A03     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r7 = r5.A01     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r47 = X.C162287rd.A01(r11)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r46 = r11.getName()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r5 = r11.getName()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = "OMX.qcom.video.encoder.avc"
            boolean r0 = r5.equals(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r50 = 16
            if (r0 == 0) goto L_0x0220
            r50 = 32
        L_0x0220:
            r42 = 0
            r41 = 0
            r52 = r42
            r45 = r2
            r48 = r8
            r49 = r7
            r51 = r42
            X.7hY r40 = X.AnonymousClass8HT.A04(r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r40
            int r7 = r0.A00     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 39
            if (r7 == r0) goto L_0x024f
            r0 = 2130706688(0x7f000100, float:1.7014638E38)
            if (r7 == r0) goto L_0x024c
            switch(r7) {
                case 19: goto L_0x0243;
                case 20: goto L_0x0246;
                case 21: goto L_0x0249;
                default: goto L_0x0242;
            }     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
        L_0x0242:
            goto L_0x0252
        L_0x0243:
            java.lang.String r11 = "COLOR_FormatYUV420Planar"
            goto L_0x025c
        L_0x0246:
            java.lang.String r11 = "COLOR_FormatYUV420PackedPlanar"
            goto L_0x025c
        L_0x0249:
            java.lang.String r11 = "COLOR_FormatYUV420SemiPlanar"
            goto L_0x025c
        L_0x024c:
            java.lang.String r11 = "COLOR_TI_FormatYUV420PackedSemiPlanar"
            goto L_0x025c
        L_0x024f:
            java.lang.String r11 = "COLOR_FormatYUV420PackedSemiPlanar"
            goto L_0x025c
        L_0x0252:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = "COLOR_NOT_FOUND_id="
            java.lang.String r11 = X.AnonymousClass000.A0Y(r0, r5, r7)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
        L_0x025c:
            java.io.File r13 = r6.A02()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r63
            X.4FS r5 = r0.A08     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            com.whatsapp.Mp4Ops r6 = r0.A01     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.2qk r7 = r0.A00     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.7bG r0 = r0.A02     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r57 = 0
            r59 = -1
            r55 = 640(0x280, float:8.97E-43)
            r56 = 5000000(0x4c4b40, float:7.006492E-39)
            X.8HT r38 = new X.8HT     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r45 = r38
            r46 = r7
            r47 = r6
            r48 = r0
            r49 = r1
            r50 = r62
            r51 = r4
            r52 = r5
            r53 = r39
            r54 = r13
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r38
            r0.A05 = r2     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r38.A0H()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            boolean r0 = r13.exists()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r0 != 0) goto L_0x02a7
            java.lang.String r0 = "transcoderCompliance/transcoded h264 missing"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            r1 = 0
            r0 = 3
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            r6.<init>(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            goto L_0x0560
        L_0x02a7:
            X.6DM r4 = new X.6DM     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r4.<init>()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ all -> 0x052e }
            r4.setDataSource(r0)     // Catch:{ all -> 0x052e }
            android.graphics.Bitmap r37 = r4.getFrameAtTime()     // Catch:{ all -> 0x052e }
            r4.close()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r36 = 0
            if (r37 != 0) goto L_0x02c7
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            r0 = r42
            r6.<init>(r13, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538, all -> 0x05b2 }
            goto L_0x0560
        L_0x02c7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = "transcoderCompliance/output_frame="
            r1.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r37.getHeight()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r44
            r1.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r37.getWidth()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r38
            X.7hY r12 = r0.A07     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r35 = -1
            r10 = 0
            r34 = 0
            r33 = 0
        L_0x02ee:
            float[] r0 = A09     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = r0[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r37.getWidth()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            float r0 = (float) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r32 = r0
            float[] r0 = A0A     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = r0[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r37.getHeight()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            float r0 = (float) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r26 = r0
            r4 = r37
            r1 = r32
            int r25 = r4.getPixel(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int[] r24 = A0B     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = r24[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r25
            int r23 = A00(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = r23
            r0 = r33
            if (r1 <= r0) goto L_0x0322
            r33 = r1
        L_0x0322:
            int[] r22 = A0C     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = r22[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r25
            int r1 = A00(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r36
            if (r1 <= r0) goto L_0x0332
            r36 = r1
        L_0x0332:
            r0 = r38
            byte[] r8 = r0.A0E     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r8 == 0) goto L_0x043e
            int r6 = r12.A05     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r9 = r12.A08     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = r12.A07     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r4 = r12.A02     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r12.A04     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r14 = r9 * r1
            int r4 = r4 + r32
            r1 = 2
            int r4 = r4 / r1
            int r7 = r4 * 2
            int r0 = r0 + r26
            int r0 = r0 / r1
            int r5 = r0 * 2
            int r15 = r5 * r9
            int r15 = r15 + r7
            r0 = 3
            r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r6 == r3) goto L_0x0376
            if (r6 == r1) goto L_0x0376
            if (r6 == r0) goto L_0x035e
            r0 = 4
            if (r6 != r0) goto L_0x04be
        L_0x035e:
            double r4 = (double) r5     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 * r19
            double r0 = (double) r9     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 * r0
            double r0 = (double) r7     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r0 = r0 * r19
            int r7 = (int) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r7 * 2
            double r0 = (double) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 + r0
            int r7 = (int) r4     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r7 = r7 + r14
            int r1 = r7 + 1
            r0 = 4
            r9 = r1
            if (r6 != r0) goto L_0x0396
            r9 = r7
            r7 = r1
            goto L_0x0396
        L_0x0376:
            double r0 = (double) r14     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r17 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r0 = r0 * r17
            int r4 = (int) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r16 = r4 + r14
            double r4 = (double) r5     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 * r17
            double r0 = (double) r9     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 * r0
            double r0 = (double) r7     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r0 = r0 * r19
            double r4 = r4 + r0
            r0 = r16
            if (r6 != r3) goto L_0x038c
            r0 = r14
        L_0x038c:
            double r0 = (double) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r0 = r0 + r4
            int r7 = (int) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r6 != r3) goto L_0x0393
            r14 = r16
        L_0x0393:
            double r0 = (double) r14     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            double r4 = r4 + r0
            int r9 = (int) r4     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
        L_0x0396:
            int r0 = r8.length     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r15 >= r0) goto L_0x04be
            if (r7 >= r0) goto L_0x04be
            if (r9 >= r0) goto L_0x04be
            byte r1 = r8[r15]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            byte r4 = r8[r7]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            byte r0 = r8[r9]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r1 >= 0) goto L_0x03a7
            int r1 = r1 + 256
        L_0x03a7:
            if (r4 >= 0) goto L_0x03ab
            int r4 = r4 + 256
        L_0x03ab:
            if (r0 >= 0) goto L_0x03af
            int r0 = r0 + 256
        L_0x03af:
            double r8 = (double) r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r0 + -128
            double r6 = (double) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 4609017635648170885(0x3ff6851eb851eb85, double:1.4075)
            double r0 = r0 * r6
            double r0 = r0 + r8
            int r14 = (int) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = r4 + -128
            double r4 = (double) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r15 = 4599895594602931945(0x3fd61cac083126e9, double:0.3455)
            double r15 = r15 * r4
            double r0 = r8 - r15
            r15 = 4604632480691000233(0x3fe6f0d844d013a9, double:0.7169)
            double r6 = r6 * r15
            double r0 = r0 - r6
            int r6 = (int) r0     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 4610690722909739024(0x3ffc76c8b4395810, double:1.779)
            double r4 = r4 * r0
            double r8 = r8 + r4
            int r1 = (int) r8     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 3
            int[] r5 = new int[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 0
            r5[r0] = r14     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r5[r3] = r6     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 2
            r5[r0] = r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r6 = r24[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.red(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 0
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r4 = X.AnonymousClass001.A0A(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.green(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r5[r3]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = X.AnonymousClass001.A0A(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r4 = java.lang.Math.max(r4, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.blue(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r4, r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r34
            if (r1 <= r0) goto L_0x040e
            r34 = r1
        L_0x040e:
            r6 = r22[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.red(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 0
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r4 = X.AnonymousClass001.A0A(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.green(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r5[r3]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r0 = X.AnonymousClass001.A0A(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r4 = java.lang.Math.max(r4, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = android.graphics.Color.blue(r6)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r4, r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r34
            if (r1 > r0) goto L_0x043b
            r1 = r41
        L_0x043b:
            r41 = r1
            goto L_0x043f
        L_0x043e:
            r5 = 0
        L_0x043f:
            int r0 = r10 % 2
            if (r0 != r3) goto L_0x0451
            r1 = r25
            r0 = r35
            int r1 = A00(r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 24
            if (r1 <= r0) goto L_0x0451
            r42 = 1
        L_0x0451:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r7 = "transcoderCompliance/pixel at "
            r4 = r44
            r1 = r32
            r0 = r26
            X.AnonymousClass6C7.A1J(r7, r4, r6, r1, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = " expected="
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r24[r10]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = A02(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = ", actual="
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = A02(r25)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = ", decoder="
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            if (r5 != 0) goto L_0x0482
            goto L_0x04a9
        L_0x0482:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = "("
            r4.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 0
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r4.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = ","
            r4.append(r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r5[r3]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r4.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r4.append(r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r4.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r0 = X.AnonymousClass000.A0e(r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            goto L_0x04ab
        L_0x04a9:
            java.lang.String r0 = "-"
        L_0x04ab:
            r6.append(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = ", diff="
            r0 = r23
            X.C18260x0.A0w(r1, r6, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            int r10 = r10 + 1
            r35 = r25
            r0 = 8
            if (r10 < r0) goto L_0x02ee
            goto L_0x04c6
        L_0x04be:
            r0 = 0
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r6.<init>(r13, r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            goto L_0x0560
        L_0x04c6:
            java.lang.String r5 = ", color="
            r1 = 46
            r0 = r34
            if (r0 <= r1) goto L_0x04f9
            r0 = r41
            if (r0 >= r1) goto L_0x04e2
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = "transcoderCompliance/decoder/invert matches, codec="
            r0 = r43
            X.C18260x0.A0p(r1, r0, r5, r11, r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = 4
            goto L_0x04f1
        L_0x04e2:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = "transcoderCompliance/decoder/colors differs too much, codec="
            r0 = r43
            X.C18260x0.A0p(r1, r0, r5, r11, r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = 5
        L_0x04f1:
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r40
            r6.<init>(r0, r12, r13, r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            goto L_0x0560
        L_0x04f9:
            r0 = r33
            if (r0 > r1) goto L_0x0501
            if (r42 != 0) goto L_0x0501
            r1 = 0
            goto L_0x0526
        L_0x0501:
            r0 = r36
            if (r0 >= r1) goto L_0x0517
            if (r42 != 0) goto L_0x0517
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = "transcoderCompliance/colors invert matches, codec="
            r0 = r43
            X.C18260x0.A0p(r1, r0, r5, r11, r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = 1
            goto L_0x0526
        L_0x0517:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            java.lang.String r1 = "transcoderCompliance/colors differ too much, codec="
            r0 = r43
            X.C18260x0.A0p(r1, r0, r5, r11, r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r1 = 2
        L_0x0526:
            X.7hU r6 = new X.7hU     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            r0 = r40
            r6.<init>(r0, r12, r13, r1)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
            goto L_0x0560
        L_0x052e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0533 }
            goto L_0x0537
        L_0x0533:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
        L_0x0537:
            throw r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0538 }
        L_0x0538:
            r1 = move-exception
            goto L_0x0553
        L_0x053a:
            r1 = move-exception
            if (r9 == 0) goto L_0x0545
            r9.close()     // Catch:{ all -> 0x0541 }
            goto L_0x0545
        L_0x0541:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0546 }
        L_0x0545:
            throw r1     // Catch:{ all -> 0x0546 }
        L_0x0546:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x054b }
            goto L_0x054f
        L_0x054b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
        L_0x054f:
            throw r1     // Catch:{ 6pi | 6z0 | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0550, all -> 0x05b4 }
        L_0x0550:
            r1 = move-exception
            r39 = 0
        L_0x0553:
            java.lang.String r0 = "transcoderCompliance/fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05b6 }
            r0 = 3
            X.7hU r6 = new X.7hU     // Catch:{ all -> 0x05b6 }
            r6.<init>(r13, r0)     // Catch:{ all -> 0x05b6 }
            if (r39 == 0) goto L_0x005e
        L_0x0560:
            X.C18270x1.A0x(r39)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x005e
        L_0x0565:
            java.lang.String r0 = "transcoderCompliance/no encoder/decoder data, early exit"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x056a:
            r0 = r21
            int r0 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r0 != 0) goto L_0x05c3
            int r4 = r2.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r4 > 0) goto L_0x0578
            int r0 = r2.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            if (r0 <= 0) goto L_0x05c3
        L_0x0578:
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "media_codec_encoder"
            java.lang.String r0 = r2.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r3.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "media_codec_decoder"
            java.lang.String r0 = r2.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r3.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "color_format_encoder"
            int r0 = r2.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r3.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "color_format_decoder"
            int r0 = r2.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r3.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r1 = "forced_frame_conv_id_encoder"
            int r0 = r2.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            r3.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r0 = "forced_frame_conv_id_decoder"
            r3.put(r0, r4)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r2 = r3.toString()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r61)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            java.lang.String r0 = "video_transcode_saved_local_config"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
            goto L_0x05c3
        L_0x05b2:
            r0 = move-exception
            goto L_0x05b9
        L_0x05b4:
            r0 = move-exception
            goto L_0x05bc
        L_0x05b6:
            r0 = move-exception
            if (r39 == 0) goto L_0x05bc
        L_0x05b9:
            X.C18270x1.A0x(r39)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x05bc:
            throw r0     // Catch:{ UnsupportedEncodingException | JSONException -> 0x05bd }
        L_0x05bd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05cd }
            if (r21 == 0) goto L_0x05df
        L_0x05c3:
            r0 = r21
            java.io.File r0 = r0.A05
            if (r0 == 0) goto L_0x05df
            X.C18270x1.A0x(r0)
            return
        L_0x05cd:
            r1 = move-exception
            if (r21 == 0) goto L_0x05d9
            r0 = r21
            java.io.File r0 = r0.A05
            if (r0 == 0) goto L_0x05d9
            X.C18270x1.A0x(r0)
        L_0x05d9:
            throw r1
        L_0x05da:
            java.lang.String r0 = "transcoderCompliance/skip test"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x05df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161867qj.A03():void");
    }

    public C161867qj(C55682qk r1, Mp4Ops mp4Ops, C153407bG r3, C56512s6 r4, C54292oU r5, AnonymousClass33p r6, AnonymousClass1VX r7, C162287rd r8, AnonymousClass4FS r9) {
        this.A04 = r5;
        this.A08 = r9;
        this.A01 = mp4Ops;
        this.A06 = r7;
        this.A00 = r1;
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
    }

    public static int A00(int i, int i2) {
        return Math.max(Math.max(AnonymousClass001.A0A(Color.red(i), Color.red(i2)), AnonymousClass001.A0A(Color.green(i), Color.green(i2))), Color.blue(i) - Color.blue(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A01(java.util.Set r4, int r5) {
        /*
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x0004:
            int r3 = r2.intValue()
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x002f
            r0 = 3
            if (r3 == r2) goto L_0x002a
            r2 = 4
            if (r3 == r0) goto L_0x002f
            if (r3 == r2) goto L_0x0025
            r2 = 0
        L_0x0015:
            r1 = 0
            if (r2 == 0) goto L_0x0034
            int r0 = r2.intValue()
            if (r0 == r5) goto L_0x0034
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x0004
            return r2
        L_0x0025:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x0015
        L_0x002a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0015
        L_0x002f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0015
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161867qj.A01(java.util.Set, int):java.lang.Integer");
    }

    public static final String A02(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1N(A0o, i);
        A0o.append(" (");
        A0o.append(Color.red(i));
        A0o.append(",");
        A0o.append(Color.green(i));
        A0o.append(",");
        A0o.append(Color.blue(i));
        return AnonymousClass000.A0e(A0o);
    }
}
