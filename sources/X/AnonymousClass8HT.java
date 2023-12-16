package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Mp4Ops;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8HT  reason: invalid class name */
public class AnonymousClass8HT implements C184448rq {
    public static int A0T;
    public static String A0U;
    public static final byte[] A0V = {102, 116, 121, 112};
    public static final int[] A0W = {19, 20, 21, 39, 2141391872, 2130706688, 25, 2141391876, 2130706433, 2141391875, 2141391873, 11, 2130706944};
    public float A00 = 3.0f;
    public int A01;
    public long A02;
    public long A03;
    public C183828qj A04;
    public C160147n7 A05;
    public C182558oc A06;
    public C156997hY A07;
    public C106985aV A08;
    public File A09;
    public File A0A;
    public File A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public byte[] A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final C55682qk A0J;
    public final Mp4Ops A0K;
    public final C153407bG A0L;
    public final C54292oU A0M;
    public final AnonymousClass1VX A0N;
    public final C162287rd A0O;
    public final AnonymousClass4FS A0P;
    public final File A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;

    public static float A00(int i, int i2) {
        return Math.max(2.0f, Math.min(10.0f, 153600.0f / ((float) (i * i2))));
    }

    public static void A07(Bitmap bitmap, ByteBuffer byteBuffer, long j) {
        bitmap.copyPixelsToBuffer(byteBuffer);
        VideoFrameConverter.setOverlay(j, byteBuffer, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static boolean A0E(String str, String[] strArr) {
        if (strArr != null) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            for (String lowerCase2 : strArr) {
                if (lowerCase.startsWith(lowerCase2.toLowerCase(locale))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0F(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(AnonymousClass0x9.A0z(Build.MANUFACTURER));
            if (jSONArray.length() != 0) {
                int i = 0;
                while (i < jSONArray.length()) {
                    if (!Build.MODEL.equalsIgnoreCase(jSONArray.getString(i))) {
                        i++;
                    }
                }
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r13 == 180) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r0.A0N.A0X(6407) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        if (r0.A0C != false) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0354 A[Catch:{ all -> 0x04cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03cf A[Catch:{ all -> 0x04cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0491 A[Catch:{ all -> 0x04cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0498 A[Catch:{ all -> 0x04cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0291  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(boolean r56) {
        /*
            r55 = this;
            r1 = 1
            r0 = r55
            r0.A0S = r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.io.File r1 = r0.A0Q
            r54 = r1
            java.io.File r1 = r54.getAbsoluteFile()
            r2.append(r1)
            java.lang.String r1 = ".png"
            java.io.File r4 = X.AnonymousClass6C7.A0S(r1, r2)
            X.7g3 r20 = new X.7g3
            r1 = r20
            r1.<init>(r0, r4)
            if (r56 == 0) goto L_0x002f
            X.1VX r2 = r0.A0N
            r1 = 6407(0x1907, float:8.978E-42)
            boolean r1 = r2.A0X(r1)
            r19 = 1
            if (r1 != 0) goto L_0x0031
        L_0x002f:
            r19 = 0
        L_0x0031:
            X.1VX r8 = r0.A0N
            X.2oU r1 = r0.A0M
            android.content.Context r1 = r1.A00
            r53 = r1
            X.7rd r7 = r0.A0O
            java.io.File r3 = r0.A0A
            X.7dk r12 = new X.7dk
            r12.<init>()
            X.5aV r5 = r0.A08
            int r2 = r0.A0G
            int r6 = r0.A0F
            float r9 = r0.A00
            r1 = 1920(0x780, float:2.69E-42)
            if (r2 < r1) goto L_0x0053
            X.6uw r10 = X.C141046uw.Quality1080p
        L_0x0050:
            if (r19 == 0) goto L_0x007c
            goto L_0x0064
        L_0x0053:
            r1 = 1280(0x500, float:1.794E-42)
            if (r2 < r1) goto L_0x005a
            X.6uw r10 = X.C141046uw.Quality720p
            goto L_0x0050
        L_0x005a:
            r1 = 848(0x350, float:1.188E-42)
            if (r2 < r1) goto L_0x0061
            X.6uw r10 = X.C141046uw.Quality480p
            goto L_0x0050
        L_0x0061:
            X.6uw r10 = X.C141046uw.Quality360p
            goto L_0x0050
        L_0x0064:
            X.85V r2 = new X.85V     // Catch:{ Exception -> 0x0076 }
            r2.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = r3.getPath()     // Catch:{ Exception -> 0x0076 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0076 }
            X.7Uf r13 = r2.B2y(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0086
        L_0x0076:
            X.6pi r0 = new X.6pi
            r0.<init>()
            throw r0
        L_0x007c:
            java.lang.String r2 = r3.getPath()
            r1 = r53
            X.7Uf r13 = X.C159277lY.A01(r1, r2)
        L_0x0086:
            if (r13 == 0) goto L_0x0522
            r3 = 1
            X.7jf r1 = r7.A0B(r13, r10)
            int r11 = r1.A0A
            int r10 = r1.A08
            r7 = 0
            if (r5 == 0) goto L_0x011c
            android.graphics.Bitmap r15 = X.C86664Kz.A0Y(r11, r10)
            r5.A06(r7, r15)
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.PNG
            java.io.FileOutputStream r5 = X.AnonymousClass0x9.A0h(r4)
            r2 = 100
            r15.compress(r14, r2, r5)
            r5.close()
            android.net.Uri r4 = android.net.Uri.fromFile(r4)
            X.C162457s7.A0J(r4, r7)
            r15 = 1065353216(0x3f800000, float:1.0)
            int r13 = r13.A04
            r5 = 180(0xb4, float:2.52E-43)
            if (r13 == 0) goto L_0x00bc
            float r14 = (float) r10
            float r2 = (float) r11
            if (r13 != r5) goto L_0x00be
        L_0x00bc:
            float r14 = (float) r11
            float r2 = (float) r10
        L_0x00be:
            float r14 = r14 / r2
            int r13 = r13 % r5
            if (r13 == 0) goto L_0x00c4
            float r14 = r15 / r14
        L_0x00c4:
            X.8Kh r16 = X.C154787dk.A00(r4)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r16 == 0) goto L_0x00e7
            android.graphics.Bitmap r2 = X.C172258Kh.A00(r16)     // Catch:{ all -> 0x00d9 }
            int r5 = r2.getHeight()     // Catch:{ all -> 0x00d9 }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r16.close()
            goto L_0x00e7
        L_0x00dd:
            r16.close()
            if (r2 <= 0) goto L_0x00e7
            if (r5 <= 0) goto L_0x00e7
            float r13 = (float) r2
            float r2 = (float) r5
            float r13 = r13 / r2
        L_0x00e7:
            X.7Lx r5 = new X.7Lx
            r5.<init>()
            java.lang.String r2 = r4.toString()
            r5.A02 = r2
            r5.A01 = r15
            r4 = 0
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fc
            float r15 = r15 * r14
            float r4 = r15 / r13
        L_0x00fc:
            r5.A00 = r4
            r5.A03 = r3
            X.7Ly r13 = new X.7Ly
            r13.<init>(r5)
            r2 = 2
            X.8uH[] r5 = new X.C185808uH[r2]
            r4 = r19 ^ 1
            X.85R r2 = new X.85R
            r2.<init>(r4)
            r5[r7] = r2
            X.85P r2 = new X.85P
            r2.<init>(r12, r13)
            java.util.List r2 = X.AnonymousClass0x9.A1A(r2, r5, r3)
            r1.A0G = r2
        L_0x011c:
            if (r19 == 0) goto L_0x0197
            float r9 = A00(r11, r10)
            r5 = 15
        L_0x0124:
            int r11 = r11 * r10
            float r2 = (float) r11
            float r2 = r2 * r9
            int r2 = (int) r2
            int r4 = java.lang.Math.min(r6, r2)
            r1.A09 = r7
            r1.A0J = r3
            r2 = 10
            r1.A02 = r2
            r1.A01 = r5
            r1.A00 = r4
            r1.A0H = r3
            java.lang.String r2 = "video/avc"
            android.media.MediaCodec r4 = android.media.MediaCodec.createDecoderByType(r2)
            android.media.MediaCodecInfo r2 = r4.getCodecInfo()
            int r11 = X.C162287rd.A01(r2)
            int r6 = r1.A0A
            int r5 = r1.A08
            android.media.MediaCodecInfo r2 = r4.getCodecInfo()
            java.lang.String r10 = r2.getName()
            android.media.MediaCodecInfo r2 = r4.getCodecInfo()
            java.lang.String r4 = r2.getName()
            java.lang.String r2 = "OMX.qcom.video.encoder.avc"
            boolean r2 = r4.equals(r2)
            r14 = 16
            if (r2 == 0) goto L_0x0168
            r14 = 32
        L_0x0168:
            r21 = 0
            X.7n7 r2 = r0.A05
            r16 = r7
            r9 = r2
            r12 = r6
            r13 = r5
            r15 = r7
            X.7hY r2 = A04(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.A07 = r2
            X.4FS r2 = r0.A0P
            r22 = r2
            java.io.File r11 = r0.A0A
            long r6 = r0.A0H
            long r4 = r0.A0I
            boolean r2 = r0.A0D
            if (r2 != 0) goto L_0x018b
            boolean r2 = r0.A0C
            r10 = 0
            if (r2 == 0) goto L_0x018c
        L_0x018b:
            r10 = 1
        L_0x018c:
            r2 = 3768(0xeb8, float:5.28E-42)
            boolean r18 = r8.A0X(r2)
            r16 = 0
            if (r19 == 0) goto L_0x01cc
            goto L_0x019a
        L_0x0197:
            r5 = 30
            goto L_0x0124
        L_0x019a:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r11, r2)     // Catch:{ Exception -> 0x01cc }
            X.8Kd r14 = X.C172218Kd.A01(r2, r3)     // Catch:{ Exception -> 0x01cc }
            com.facebook.animated.gif.GifImage r15 = r14.A01     // Catch:{ all -> 0x01c0 }
            int r13 = r15.getFrameCount()     // Catch:{ all -> 0x01c0 }
            r12 = 0
            r2 = 0
        L_0x01ad:
            if (r12 >= r13) goto L_0x01bc
            int[] r8 = r15.getFrameDurations()     // Catch:{ all -> 0x01ba }
            r8 = r8[r12]     // Catch:{ all -> 0x01ba }
            long r8 = (long) r8     // Catch:{ all -> 0x01ba }
            long r2 = r2 + r8
            int r12 = r12 + 1
            goto L_0x01ad
        L_0x01ba:
            r9 = move-exception
            goto L_0x01c3
        L_0x01bc:
            r14.close()     // Catch:{ Exception -> 0x01ce }
            goto L_0x01ce
        L_0x01c0:
            r9 = move-exception
            r2 = 0
        L_0x01c3:
            r14.close()     // Catch:{ all -> 0x01c7 }
            goto L_0x01cb
        L_0x01c7:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch:{ Exception -> 0x01ce }
        L_0x01cb:
            throw r9     // Catch:{ Exception -> 0x01ce }
        L_0x01cc:
            r2 = 0
        L_0x01ce:
            X.7JS r8 = new X.7JS
            r8.<init>(r11)
            int r9 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r9 > 0) goto L_0x01d9
            r6 = 0
        L_0x01d9:
            int r9 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r9 > 0) goto L_0x01df
            r4 = -1
        L_0x01df:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.7av r9 = new X.7av
            r12 = r9
            r14 = r6
            r16 = r4
            r12.<init>(r13, r14, r16)
            r8.A01 = r9
            if (r19 == 0) goto L_0x01f6
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r4.toMicros(r2)
            r8.A00 = r2
        L_0x01f6:
            X.7av r2 = r8.A01
            if (r2 != 0) goto L_0x0206
            r14 = -1
            X.7av r2 = new X.7av
            r12 = r2
            r16 = r14
            r12.<init>(r13, r14, r16)
            r8.A01 = r2
        L_0x0206:
            X.7aw r6 = new X.7aw
            r6.<init>(r8)
            X.6x5 r8 = X.C142366x5.VIDEO
            X.7hL r3 = new X.7hL
            r3.<init>(r8)
            java.util.List r2 = r3.A02
            r2.add(r6)
            X.7aW r5 = new X.7aW
            r5.<init>(r3)
            X.6x5 r7 = X.C142366x5.AUDIO
            X.7hL r4 = new X.7hL
            r4.<init>(r7)
            java.util.List r2 = r4.A02
            r2.add(r6)
            X.7aW r3 = new X.7aW
            r3.<init>(r4)
            X.7Sn r2 = new X.7Sn
            r2.<init>()
            r2.A00(r5)
            r2.A00(r3)
            X.7bV r3 = new X.7bV
            r3.<init>(r2)
            X.7hd r4 = new X.7hd
            r4.<init>()
            r4.A04 = r1
            java.lang.String r2 = r54.getPath()
            r4.A0B = r2
            r4.A05 = r3
            r4.A0A = r11
            r4.A0D = r10
            r2 = r20
            r4.A09 = r2
            X.6O6 r2 = new X.6O6
            r2.<init>()
            r4.A07 = r2
            if (r18 == 0) goto L_0x0339
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x0261:
            X.7QD r11 = new X.7QD
            r11.<init>()
            X.7QR r2 = new X.7QR
            r2.<init>(r4)
            r11.A0C = r2
            r2 = r53
            r11.A00 = r2
            X.71y r2 = new X.71y
            r2.<init>()
            r11.A06 = r2
            r11.A0D = r3
            X.7Qc r2 = new X.7Qc
            r2.<init>()
            r11.A09 = r2
            X.71z r2 = new X.71z
            r2.<init>()
            r11.A07 = r2
            X.720 r2 = new X.720
            r2.<init>()
            r11.A08 = r2
            if (r19 == 0) goto L_0x0330
            X.85V r3 = new X.85V
            r3.<init>()
        L_0x0296:
            r11.A05 = r3
            X.721 r2 = new X.721
            r2.<init>()
            r11.A0A = r2
            X.71x r2 = new X.71x
            r2.<init>()
            r11.A04 = r2
            if (r19 == 0) goto L_0x02af
            X.7TL r2 = new X.7TL
            r2.<init>()
            r11.A01 = r2
        L_0x02af:
            r53.getClass()
            X.7QR r2 = r11.A0C
            r2.getClass()
            X.71y r2 = r11.A06
            r2.getClass()
            java.util.concurrent.ExecutorService r2 = r11.A0D
            r2.getClass()
            X.7Qc r2 = r11.A09
            r2.getClass()
            X.71z r2 = r11.A07
            r2.getClass()
            X.721 r3 = r11.A0A
            if (r3 != 0) goto L_0x02d6
            X.721 r3 = new X.721
            r3.<init>()
            r11.A0A = r3
        L_0x02d6:
            X.8lL r9 = r11.A05
            if (r9 != 0) goto L_0x02e3
            android.content.Context r2 = r11.A00
            X.85W r9 = new X.85W
            r9.<init>(r2)
            r11.A05 = r9
        L_0x02e3:
            X.7dk r6 = r11.A02
            if (r6 != 0) goto L_0x02eb
            X.7dk r6 = X.AnonymousClass76T.A00
            r11.A02 = r6
        L_0x02eb:
            X.71x r5 = r11.A04
            if (r5 != 0) goto L_0x02f6
            X.71x r5 = new X.71x
            r5.<init>()
            r11.A04 = r5
        L_0x02f6:
            X.7Fp r4 = r11.A0B
            if (r4 != 0) goto L_0x0306
            X.7rJ r2 = new X.7rJ
            r2.<init>()
            X.7Fp r4 = new X.7Fp
            r4.<init>(r2, r3)
            r11.A0B = r4
        L_0x0306:
            X.7hf r3 = r11.A03
            if (r3 != 0) goto L_0x0311
            X.7hf r3 = new X.7hf
            r3.<init>()
            r11.A03 = r3
        L_0x0311:
            X.7QR r2 = r11.A0C
            android.content.Context r10 = r11.A00
            r52 = r10
            X.71y r10 = r11.A06
            r51 = r10
            java.util.concurrent.ExecutorService r10 = r11.A0D
            r50 = r10
            X.7Qc r10 = r11.A09
            r49 = r10
            X.71z r10 = r11.A07
            r48 = r10
            X.720 r10 = r11.A08
            r47 = r10
            X.7TL r10 = r11.A01
            r46 = r10
            goto L_0x034d
        L_0x0330:
            X.85W r3 = new X.85W
            r2 = r53
            r3.<init>(r2)
            goto L_0x0296
        L_0x0339:
            java.lang.String r10 = "VideoliteTranscodeQueue"
            java.util.concurrent.LinkedBlockingQueue r11 = new java.util.concurrent.LinkedBlockingQueue
            r11.<init>()
            r12 = 1
            r15 = 0
            r14 = r12
            r9 = r22
            r13 = r12
            java.util.concurrent.ThreadPoolExecutor r3 = r9.B18(r10, r11, r12, r13, r14, r15)
            goto L_0x0261
        L_0x034d:
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x04cc }
            X.7bV r13 = r2.A05     // Catch:{ all -> 0x04cc }
            if (r13 == 0) goto L_0x03cf
            X.85V r20 = new X.85V     // Catch:{ all -> 0x04cc }
            r20.<init>()     // Catch:{ all -> 0x04cc }
            java.lang.String r10 = "MediaCompositionMetadataExtractor.extractVideoMetadata"
            android.os.Trace.beginSection(r10)     // Catch:{ all -> 0x04cc }
            r12 = r8
            java.util.HashMap r10 = r13.A02(r8)     // Catch:{ all -> 0x04cc }
            if (r10 != 0) goto L_0x0366
            r12 = r7
        L_0x0366:
            long r18 = X.C160887oa.A00(r9, r12, r13)     // Catch:{ all -> 0x04cc }
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x04cc }
            r11 = r20
            A0A(r11, r9, r8, r13, r10)     // Catch:{ all -> 0x04cc }
            A0A(r11, r9, r7, r13, r10)     // Catch:{ all -> 0x04cc }
            r8 = 0
            if (r12 != r7) goto L_0x037a
            goto L_0x03ed
        L_0x037a:
            java.util.HashMap r7 = r13.A02(r12)     // Catch:{ all -> 0x04cc }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x04cc }
            int r17 = r7.size()     // Catch:{ all -> 0x04cc }
            r16 = -1
            r14 = 0
        L_0x0388:
            r7 = r17
            if (r14 >= r7) goto L_0x03cb
            java.util.List r11 = r13.A03(r12, r14)     // Catch:{ all -> 0x04cc }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x04cc }
            r7 = r21
            java.lang.Object r15 = r11.get(r7)     // Catch:{ all -> 0x04cc }
            X.7aw r15 = (X.C153257aw) r15     // Catch:{ all -> 0x04cc }
            boolean r7 = r15.A01()     // Catch:{ all -> 0x04cc }
            r11 = r9
            if (r7 == 0) goto L_0x03a4
            r11 = r20
        L_0x03a4:
            java.io.File r7 = r15.A02     // Catch:{ all -> 0x04cc }
            java.lang.String r7 = r7.getCanonicalPath()     // Catch:{ all -> 0x04cc }
            java.io.File r7 = X.AnonymousClass002.A0B(r7)     // Catch:{ all -> 0x04cc }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x04cc }
            X.7Uf r11 = r11.B2y(r7)     // Catch:{ all -> 0x04cc }
            if (r11 == 0) goto L_0x03c8
            int r7 = r11.A05     // Catch:{ all -> 0x04cc }
            r15 = r7
            int r7 = r11.A03     // Catch:{ all -> 0x04cc }
            int r7 = java.lang.Math.min(r15, r7)     // Catch:{ all -> 0x04cc }
            r15 = r16
            if (r7 <= r15) goto L_0x03c8
            r8 = r11
            r16 = r7
        L_0x03c8:
            int r14 = r14 + 1
            goto L_0x0388
        L_0x03cb:
            java.util.Objects.requireNonNull(r8)     // Catch:{ all -> 0x04cc }
            goto L_0x0417
        L_0x03cf:
            java.io.File r7 = r2.A0A     // Catch:{ all -> 0x04cc }
            if (r7 == 0) goto L_0x03e5
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x04cc }
            X.7Uf r19 = r9.B2y(r7)     // Catch:{ all -> 0x04cc }
            if (r19 != 0) goto L_0x0484
            java.lang.String r3 = "Required value was null."
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0e(r3)     // Catch:{ all -> 0x04cc }
            goto L_0x0497
        L_0x03e5:
            java.lang.String r3 = "unable to extract MediaMetadata without MediaComposition or input file"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A0c(r3)     // Catch:{ all -> 0x04cc }
            goto L_0x0497
        L_0x03ed:
            java.lang.Object r11 = r10.get(r7)     // Catch:{ all -> 0x04cc }
            if (r11 == 0) goto L_0x0417
            java.lang.Object r11 = r10.get(r7)     // Catch:{ all -> 0x04cc }
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ all -> 0x04cc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x04cc }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x04cc }
            if (r11 == 0) goto L_0x0417
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x04cc }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x04cc }
            java.lang.Object r8 = r7.get(r12)     // Catch:{ all -> 0x04cc }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x04cc }
            r7 = r21
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x04cc }
            X.7Uf r8 = (X.C151307Uf) r8     // Catch:{ all -> 0x04cc }
        L_0x0417:
            java.util.Objects.requireNonNull(r8)     // Catch:{ all -> 0x04cc }
            long r11 = r8.A08     // Catch:{ all -> 0x04cc }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r37 = r18 / r13
            int r7 = r8.A05     // Catch:{ all -> 0x04cc }
            r31 = r7
            int r7 = r8.A03     // Catch:{ all -> 0x04cc }
            r32 = r7
            int r7 = r8.A04     // Catch:{ all -> 0x04cc }
            r33 = r7
            int r7 = r8.A02     // Catch:{ all -> 0x04cc }
            r34 = r7
            int r7 = r8.A01     // Catch:{ all -> 0x04cc }
            r35 = r7
            r39 = 8
            long r39 = r39 * r11
            long r39 = r39 * r13
            long r39 = r39 * r13
            long r39 = r39 / r18
            int r7 = r8.A00     // Catch:{ all -> 0x04cc }
            r36 = r7
            X.7xv r7 = r8.A09     // Catch:{ all -> 0x04cc }
            r45 = r7
            java.lang.String r7 = r8.A0E     // Catch:{ all -> 0x04cc }
            r44 = r7
            java.lang.String r7 = r8.A0I     // Catch:{ all -> 0x04cc }
            r20 = r7
            java.lang.String r7 = r8.A0C     // Catch:{ all -> 0x04cc }
            r18 = r7
            java.lang.String r7 = r8.A0G     // Catch:{ all -> 0x04cc }
            r17 = r7
            java.lang.String r7 = r8.A0F     // Catch:{ all -> 0x04cc }
            r16 = r7
            java.lang.String r15 = r8.A0B     // Catch:{ all -> 0x04cc }
            java.lang.String r14 = r8.A0A     // Catch:{ all -> 0x04cc }
            java.lang.String r13 = r8.A0D     // Catch:{ all -> 0x04cc }
            java.lang.String r7 = r8.A0H     // Catch:{ all -> 0x04cc }
            X.7Uf r19 = new X.7Uf     // Catch:{ all -> 0x04cc }
            r22 = r20
            r23 = r18
            r24 = r17
            r25 = r16
            r26 = r15
            r27 = r14
            r28 = r13
            r29 = r7
            r30 = r10
            r41 = r11
            r43 = r21
            r20 = r45
            r21 = r44
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43)     // Catch:{ all -> 0x04cc }
            android.os.Trace.endSection()     // Catch:{ all -> 0x04cc }
        L_0x0484:
            X.C162457s7.A0D(r47)     // Catch:{ all -> 0x04cc }
            boolean r7 = r2.A0E     // Catch:{ all -> 0x04cc }
            if (r7 != 0) goto L_0x0498
            boolean r7 = X.C159277lY.A02(r2)     // Catch:{ all -> 0x04cc }
            if (r7 == 0) goto L_0x0498
            java.lang.String r3 = "Incompatible MediaExtractor for pass through"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass001.A0c(r3)     // Catch:{ all -> 0x04cc }
        L_0x0497:
            throw r3     // Catch:{ all -> 0x04cc }
        L_0x0498:
            X.7QS r10 = new X.7QS     // Catch:{ all -> 0x04cc }
            r11 = r52
            r12 = r46
            r13 = r6
            r14 = r3
            r15 = r5
            r16 = r19
            r17 = r9
            r18 = r51
            r19 = r48
            r20 = r47
            r21 = r49
            r22 = r4
            r23 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x04cc }
            X.7B6 r7 = new X.7B6     // Catch:{ all -> 0x04cc }
            r3 = r50
            r7.<init>(r3)     // Catch:{ all -> 0x04cc }
            X.85U r6 = new X.85U     // Catch:{ all -> 0x04cc }
            r6.<init>(r10)     // Catch:{ all -> 0x04cc }
            java.util.concurrent.ExecutorService r5 = r7.A00     // Catch:{ all -> 0x04cc }
            r4 = 5
            X.8Mj r3 = new X.8Mj     // Catch:{ all -> 0x04cc }
            r3.<init>(r7, r10, r6, r4)     // Catch:{ all -> 0x04cc }
            r5.execute(r3)     // Catch:{ all -> 0x04cc }
            goto L_0x04e5
        L_0x04cc:
            r5 = move-exception
            java.lang.String r4 = "TranscodeUtil"
            java.lang.String r3 = "Throwable"
            X.C162477s9.A0A(r4, r3, r5)
            r5.getMessage()
            X.7g3 r2 = r2.A09
            if (r2 == 0) goto L_0x04e0
            X.6zh r2 = new X.6zh
            r2.<init>((java.lang.Throwable) r5)
        L_0x04e0:
            X.85T r6 = new X.85T
            r6.<init>()
        L_0x04e5:
            r0.A04 = r6
            r6.BsR()     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            int r1 = r1.A00()     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            r0.A01 = r1     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            boolean r1 = r0.A0R     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            if (r1 != 0) goto L_0x04fd
            com.whatsapp.Mp4Ops r3 = r0.A0K     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            X.7bG r2 = r0.A0L     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
            r1 = r54
            r3.A05(r2, r1)     // Catch:{ 6z0 -> 0x050a, Exception -> 0x04fe }
        L_0x04fd:
            return
        L_0x04fe:
            r1 = move-exception
            java.lang.String r0 = "videotranscodequeue/videolite exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.6pi r3 = new X.6pi
            r3.<init>()
            throw r3
        L_0x050a:
            r3 = move-exception
            java.lang.String r1 = "videotranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r1, r3)
            X.2qk r2 = r0.A0J
            X.7bG r1 = r0.A0L
            java.io.File r0 = r0.A0A
            java.lang.String r9 = "transcode"
            r4 = r53
            r5 = r2
            r6 = r1
            r7 = r0
            r8 = r3
            com.whatsapp.Mp4Ops.A00(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0522:
            java.lang.String r0 = "videolite/BadVideoException sourceVideoMetadata==null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.6pi r0 = new X.6pi
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HT.A0J(boolean):void");
    }

    public void cancel() {
        this.A0R = true;
        C183828qj r0 = this.A04;
        if (r0 != null) {
            r0.cancel();
        }
    }

    public static synchronized int A02(boolean z) {
        int i;
        synchronized (AnonymousClass8HT.class) {
            i = A0T;
            if (i == 0) {
                String str = null;
                if (C107535bT.A04()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("videotranscoder/istranscodesupported/unsupported model ");
                    A0o.append(Build.MANUFACTURER);
                    A0o.append("-");
                    C18260x0.A1M(A0o, Build.MODEL);
                    i = 2;
                } else {
                    try {
                        C18260x0.A0y("videotranscoder/istranscodesupported/number of codecs: ", AnonymousClass001.A0o(), r6);
                        for (MediaCodecInfo mediaCodecInfo : AnonymousClass6C9.A1X(0)) {
                            if (mediaCodecInfo.isEncoder() && C107535bT.A0E(mediaCodecInfo.getName(), z)) {
                                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                                int length = supportedTypes.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        break;
                                    } else if (supportedTypes[i2].equals("video/avc")) {
                                        str = mediaCodecInfo.getName();
                                        StringBuilder A0o2 = AnonymousClass001.A0o();
                                        A0o2.append("videotranscoder/istranscodesupported/found ");
                                        C18260x0.A1L(A0o2, mediaCodecInfo.getName());
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            i = 1;
                        } else {
                            Log.w("videotranscoder/istranscodesupported/no encoder found");
                            i = 3;
                        }
                    } catch (Exception unused) {
                        i = 0;
                    }
                }
                A0C(str);
                A0T = i;
            }
        }
        return i;
    }

    public static C156997hY A04(C160147n7 r9, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C141556vl r1;
        String str2;
        int i7;
        C156997hY r5 = new C156997hY(i, i2, i3);
        r5.A0A = str;
        int i8 = ~(i4 - 1);
        int i9 = ((i6 + i4) - 1) & i8;
        int i10 = ((i5 + i4) - 1) & i8;
        float f = ((float) i2) / (((float) i3) + 0.0f);
        int i11 = r5.A09;
        if (i11 >= i10 && r5.A06 >= i9) {
            r1 = C141556vl.None;
        } else if ((i11 >= i10 || r5.A06 < i9) && ((i11 >= i10 && r5.A06 < i9) || f > ((float) i10) / (((float) i9) + 0.0f))) {
            r1 = C141556vl.Vertical;
        } else {
            r1 = C141556vl.Horizontal;
        }
        if (r1 != C141556vl.None) {
            if (r1 == C141556vl.Vertical) {
                r5.A06 = i9;
                int i12 = (int) (((float) i11) + (((float) (i9 - r5.A06)) * f));
                r5.A09 = i12;
                int i13 = ((i12 + (i4 / 2)) - 1) & i8;
                r5.A09 = i13;
                r5.A09 = Math.max(i13, i10);
            } else {
                r5.A09 = i10;
                int i14 = (int) (((float) r5.A06) + (((float) (i10 - i11)) / f));
                r5.A06 = i14;
                int i15 = ((i14 + (i4 / 2)) - 1) & i8;
                r5.A06 = i15;
                r5.A06 = Math.max(i15, i9);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("videotranscoder/transcode/encoder parseEncoderFormat expand direction is ");
            A0o.append(r1);
            A0o.append(", input size: ");
            A0o.append(i2);
            A0o.append("x");
            A0o.append(i3);
            A0o.append(", after expansion: ");
            A0o.append(r5.A09);
            A0o.append("x");
            C18260x0.A1G(A0o, r5.A06);
        }
        int i16 = i4 / 2;
        int i17 = ((r5.A06 + i16) - 1) & i8;
        r5.A06 = i17;
        int i18 = ((r5.A09 + i16) - 1) & i8;
        r5.A09 = i18;
        r5.A08 = i18;
        r5.A07 = i17;
        if (str.startsWith("OMX.Nvidia.")) {
            r5.A08 = ((i18 + 15) / 16) * 16;
            r5.A07 = ((i17 + 15) / 16) * 16;
        }
        A0C(str);
        if (r9 == null || (str2 = r9.A05) == null || i <= 0 || (i7 = r9.A01) <= 0 || !str2.equals(str) || i7 != i) {
            r5.A05 = A01(i);
            if (A05() != null && AnonymousClass0x9.A0z(A05()).startsWith("mt6572")) {
                r5.A05 = 2;
                Log.i("workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12");
                return r5;
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("videotranscoder/parseEncoderFormat/forcing frame conver color id=");
            int i19 = r9.A03;
            C18260x0.A1G(A0o2, i19);
            r5.A05 = i19;
        }
        return r5;
    }

    public static synchronized String A05() {
        String str;
        synchronized (AnonymousClass8HT.class) {
            str = A0U;
        }
        return str;
    }

    public static String A06(String str) {
        BufferedReader bufferedReader;
        String str2 = "";
        try {
            Process start = new ProcessBuilder(new String[]{"/system/bin/getprop", str}).redirectErrorStream(true).start();
            bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str2 = readLine;
                } else {
                    bufferedReader.close();
                    start.destroy();
                    return str2;
                }
            }
        } catch (IOException e) {
            Log.w("getsystemproperty/", e);
            return str2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A0B(AnonymousClass8HT r6, long j) {
        r6.A02++;
        r6.A03 = j - (r6.A0H * 1000);
    }

    public static synchronized void A0C(String str) {
        synchronized (AnonymousClass8HT.class) {
            if (A0U == null && "OMX.MTK.VIDEO.ENCODER.AVC".equals(str)) {
                String A062 = A06("ro.board.platform");
                A0U = A062;
                if (TextUtils.isEmpty(A062)) {
                    A0U = A06("ro.mediatek.platform");
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("videotranscoder/setHwBoardPlatform/board/");
                C18260x0.A1L(A0o, A0U);
            }
        }
    }

    public static boolean A0D(File file, boolean z) {
        boolean z2;
        FileInputStream A0g;
        try {
            A0g = AnonymousClass0x9.A0g(file);
            byte[] bArr = new byte[4];
            A0g.skip(4);
            A0g.read(bArr);
            if (!Arrays.equals(bArr, A0V)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(file, "videotranscoder/isisomedia/", A0o);
                C18260x0.A1M(A0o, " is not iso base media container");
                A0g.close();
                z2 = false;
            } else {
                A0g.close();
                z2 = true;
            }
        } catch (IOException e) {
            Log.w("videotranscoder/isisomedia/", e);
            z2 = false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (z2 || A02(z) == 1) {
            return true;
        }
        return false;
        throw th;
    }

    public static int[] A0G(String str, int i) {
        if (i <= 0) {
            if (!str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && !str.equals("OMX.MTK.VIDEO.DECODER.AVC")) {
                return A0W;
            }
            i = 2130706944;
        }
        int[] iArr = A0W;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        iArr2[0] = i;
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = iArr[i2 - 1];
            iArr2[i2] = i3;
            if (i3 == i) {
                iArr2[i2] = 0;
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:289|290|291|292|293|597) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2.A0X(3047) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03e7, code lost:
        if (r0.A06.BZ1(r11) != false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r5.A0X(6407) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0597, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x07cf, code lost:
        if (r12 < 0) goto L_0x0f64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07d1, code lost:
        r11 = r37.getTrackFormat(r12);
        r8 = r11.getString("mime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07db, code lost:
        if (r8 == null) goto L_0x0f55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x07e3, code lost:
        if ("video/unknown".equals(r8) != false) goto L_0x0f55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x07e5, code lost:
        r37.selectTrack(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x07ee, code lost:
        if (r11.containsKey("durationUs") == false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x07f0, code lost:
        r24 = r11.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x07f4, code lost:
        r7 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A17(r11, "videotranscoder/transcode/decoder format:", " duration:", r7);
        X.C18260x0.A1I(r7, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0805, code lost:
        r24 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r12 = android.media.MediaCodec.createDecoderByType(r8);
        r7 = r5.A0X(1250);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x081a, code lost:
        if ("samsung".equalsIgnoreCase(android.os.Build.MANUFACTURER) == false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x081c, code lost:
        if (r7 == false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x081e, code lost:
        r35 = r12.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x082c, code lost:
        if (X.AnonymousClass0x9.A0z(r35).startsWith("omx.exynos") != false) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x082e, code lost:
        r15 = X.C162287rd.A06(r8).iterator();
        r13 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x083c, code lost:
        if (r15.hasNext() == false) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x083e, code lost:
        r10 = X.AnonymousClass001.A0m(r15);
        r4 = X.AnonymousClass0x9.A0z(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x084a, code lost:
        if (r4.startsWith("omx.exynos") == false) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x084c, code lost:
        if (r13 != null) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x084e, code lost:
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0855, code lost:
        if (r4.startsWith("c2.exynos") != false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0857, code lost:
        if (r12 != null) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0859, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x085b, code lost:
        if (r13 == null) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x085d, code lost:
        r35 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0860, code lost:
        if (r12 == null) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0862, code lost:
        r35 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0864, code lost:
        r12 = android.media.MediaCodec.createByCodecName(r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0868, code lost:
        if (r12 == null) goto L_0x0f6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder created");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        r12.configure(r11, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder configured");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x08d6, code lost:
        r12.start();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder started");
        r54 = r12.getInputBuffers();
        r53 = r12.getOutputBuffers();
        r7 = new android.media.MediaCodec.BufferInfo();
        r50 = new android.media.MediaCodec.BufferInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x08f2, code lost:
        if (r26 <= 0) goto L_0x0913;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x08f4, code lost:
        r3 = r26 * 1000;
        r37.seekTo(r3, 0);
        r8 = X.AnonymousClass001.A0o();
        r8.append("videotranscoder/transcode/seek to:");
        r8.append(r3);
        r8.append(" actual:");
        X.C18260x0.A1I(r8, r37.getSampleTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0913, code lost:
        r35 = com.whatsapp.VideoFrameConverter.create();
        r3 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0919, code lost:
        if (r3 == null) goto L_0x0936;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x091b, code lost:
        r4 = r3.A04.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0925, code lost:
        if (r4.hasNext() == false) goto L_0x093b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0931, code lost:
        if (((X.C105425Uw) r4.next()).A0T() == false) goto L_0x0921;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0933, code lost:
        r29 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0936, code lost:
        r56 = null;
        r55 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x093b, code lost:
        r55 = X.C86664Kz.A0Y(r73, r74);
        r0.A08.A06((360 - r76) % 360, r55);
        r56 = java.nio.ByteBuffer.allocateDirect((r55.getWidth() * r55.getHeight()) * 4);
        A07(r55, r56, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0968, code lost:
        r72 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r62 = r5.A0X(2747);
        r61 = 1000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0975, code lost:
        if (r62 == false) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0977, code lost:
        r61 = 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0979, code lost:
        r0.A03 = 0;
        r0.A02 = 0;
        r60 = 0;
        r6 = 0;
        r59 = false;
        r58 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0986, code lost:
        if (r58 != false) goto L_0x0cea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x098a, code lost:
        if (r0.A0R != false) goto L_0x0cea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x098c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x098f, code lost:
        if (r6 >= 5) goto L_0x099a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0991, code lost:
        X.C18260x0.A0y("videotranscoder/transcode/loop ", X.AnonymousClass001.A0o(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x099a, code lost:
        if (r59 != false) goto L_0x0a23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x099c, code lost:
        r8 = r12.dequeueInputBuffer((long) r61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x09a3, code lost:
        if (r6 >= 5) goto L_0x09ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x09a5, code lost:
        X.C18260x0.A0y("videotranscoder/decoder/dequeue/input ", X.AnonymousClass001.A0o(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x09ae, code lost:
        if (r8 >= 0) goto L_0x09bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x09b0, code lost:
        X.C18260x0.A0y("videotranscoder/transcode/decoder/dequeue/input < 0", X.AnonymousClass001.A0o(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09b9, code lost:
        if (r62 != false) goto L_0x0a23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x09bd, code lost:
        r9 = r37.readSampleData(r54[r8], 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x09c5, code lost:
        if (r9 >= 0) goto L_0x09de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x09c7, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM");
        r12.queueInputBuffer(r8, 0, 0, 0, 4);
        r59 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x09de, code lost:
        if (r6 >= 5) goto L_0x09f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09e0, code lost:
        r10 = X.AnonymousClass001.A0o();
        r10.append("videotranscoder/transcode/extractor/sample size:");
        r10.append(r9);
        r10.append(" time:");
        X.C18260x0.A1I(r10, r37.getSampleTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09f8, code lost:
        r12.queueInputBuffer(r8, 0, r9, r37.getSampleTime(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a09, code lost:
        if (r6 >= 5) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0a0b, code lost:
        X.C18260x0.A0y("videotranscoder/decoder/queue/input ", X.AnonymousClass001.A0o(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0a14, code lost:
        r8 = r37.advance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a18, code lost:
        if (r6 >= 5) goto L_0x0a23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a1a, code lost:
        X.C18260x0.A1E("videotranscoder/transcode/extractor/advance ", X.AnonymousClass001.A0o(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a23, code lost:
        r11 = r12.dequeueOutputBuffer(r7, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a2a, code lost:
        if (r6 >= 5) goto L_0x0a35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0a2c, code lost:
        X.C18260x0.A0y("videotranscoder/transcode/decoder/dequeue/output ", X.AnonymousClass001.A0o(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0a37, code lost:
        if (r11 < 0) goto L_0x0bfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r51 = r26 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0a3f, code lost:
        if (r7.presentationTimeUs < r51) goto L_0x0bd7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0a41, code lost:
        r8 = r39.dequeueInputBuffer(com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0a4a, code lost:
        if (r6 >= 5) goto L_0x0a55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0a4c, code lost:
        X.C18260x0.A0y("videotranscoder/transcode/encoder/dequeue/input ", X.AnonymousClass001.A0o(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0a55, code lost:
        if (r8 < 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0a57, code lost:
        r15 = r31[r8];
        r15.clear();
        r3 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a5e, code lost:
        if (r3 == null) goto L_0x0a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a60, code lost:
        if (r29 == false) goto L_0x0a8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0a62, code lost:
        r4 = r3.A04.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a6c, code lost:
        if (r4.hasNext() == false) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a6e, code lost:
        r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a72, code lost:
        r55.eraseColor(0);
        r3 = r55;
        r0.A08.A06((360 - r76) % 360, r3);
        r56.rewind();
        A07(r3, r56, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a8f, code lost:
        r9 = r53[r11];
        X.AnonymousClass6C7.A0z(r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0a98, code lost:
        if (r0.A02 == 0) goto L_0x0a9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0a9a, code lost:
        if (r6 >= 5) goto L_0x0acf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a9c, code lost:
        r13 = X.AnonymousClass001.A0o();
        r13.append("videotranscoder/transcode/convert decoderBufferInfo.offset:");
        r13.append(r7.offset);
        r13.append(" decoderBufferInfo.size:");
        r13.append(r7.size);
        r13.append(" decoderBufferInfo.presentationTimeUs:");
        r13.append(r7.presentationTimeUs);
        r13.append(" decoderBufferInfo.flags:");
        r13.append(r7.flags);
        X.C18260x0.A0y(" encoderFrameSize:", r13, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0ad1, code lost:
        if (r0.A0E != null) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0ad3, code lost:
        r3 = new byte[r9.remaining()];
        r9.get(r3);
        r0.A0E = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0ade, code lost:
        com.whatsapp.VideoFrameConverter.convertFrame(r35, r9, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0ae7, code lost:
        if (r0.A02 == 0) goto L_0x0aeb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0ae9, code lost:
        if (r6 >= 5) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0aeb, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/converted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0af0, code lost:
        r39.queueInputBuffer(r8, 0, r18, r7.presentationTimeUs, r7.flags);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0b07, code lost:
        if (r0.A02 == 0) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b09, code lost:
        if (r6 >= 5) goto L_0x0b10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b0b, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder/queue/input");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0b10, code lost:
        r0.A02++;
        r3 = r7.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0b1b, code lost:
        if (r3 <= 0) goto L_0x0b21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b1d, code lost:
        r0.A03 = r3 - r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b23, code lost:
        if (r22 <= 0) goto L_0x0b39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b25, code lost:
        r8 = r22 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0b29, code lost:
        if (r3 <= r8) goto L_0x0b39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0b2b, code lost:
        r15 = X.AnonymousClass001.A0o();
        X.C18310x6.A1N("videotranscoder/transcode/end time detected ", " ", r15, r3);
        X.C18260x0.A1I(r15, r8);
        r58 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0b3b, code lost:
        if (r24 <= 0) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0b3f, code lost:
        if (r26 > 0) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0b41, code lost:
        r51 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0b45, code lost:
        if (r22 > 0) goto L_0x0b4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0b47, code lost:
        r48 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0b4a, code lost:
        r48 = r22 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0b4c, code lost:
        r8 = (int) (((r7.presentationTimeUs - r51) * 100) / (r48 - r51));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0b5a, code lost:
        if (r8 == r60) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0b5e, code lost:
        if (r0.A06 == null) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b62, code lost:
        if (r0.A0R != false) goto L_0x0b6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b64, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b6b, code lost:
        if (r0.A06.BZ1(r8) == false) goto L_0x0b6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0b6d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0b6e, code lost:
        r0.A0R = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0b70, code lost:
        if (r8 < 5) goto L_0x0b76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0b74, code lost:
        if ((r8 % 5) != 0) goto L_0x0b90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0b76, code lost:
        r9 = X.AnonymousClass001.A0o();
        X.C18270x1.A19("videotranscoder/transcode/progress ", " frames:", r9, r8);
        r9.append(r0.A02);
        r9.append(" duration:");
        X.C18260x0.A1I(r9, r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0b90, code lost:
        r60 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0b92, code lost:
        r9 = r50;
        r4 = r39.dequeueOutputBuffer(r9, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b9d, code lost:
        if (r6 >= 5) goto L_0x0ba8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b9f, code lost:
        X.C18260x0.A0y("videotranscoder/transcode/encoder/dequeue/output ", X.AnonymousClass001.A0o(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0ba8, code lost:
        if (r4 < 0) goto L_0x0bc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0baa, code lost:
        r8 = r19[r4];
        X.AnonymousClass6C7.A0z(r9, r8);
        r28.write(r8);
        r8.clear();
        r39.releaseOutputBuffer(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0bbc, code lost:
        if (r6 >= 5) goto L_0x0bf1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0bbe, code lost:
        r3 = "videotranscoder/transcode/encoder/release/output";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0bc2, code lost:
        if (r4 != -3) goto L_0x0bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0bc6, code lost:
        if (r4 != -2) goto L_0x0bf1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0bc8, code lost:
        r3 = X.AnonymousClass000.A0P(r39.getOutputFormat(), "videotranscoder/transcode/encoder output format has changed to ", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0bd7, code lost:
        r30 = r30 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0bd9, code lost:
        if (r6 >= 5) goto L_0x0bf1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0bdb, code lost:
        r3 = X.AnonymousClass000.A0Y("videotranscoder/transcode/frame skipped ", X.AnonymousClass001.A0o(), r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0be8, code lost:
        r19 = r39.getOutputBuffers();
        r3 = "videotranscoder/transcode/encoder output buffers have changed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0bee, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0bf1, code lost:
        r12.releaseOutputBuffer(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0bf4, code lost:
        if (r6 >= 5) goto L_0x0cdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0bf6, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder/release/output");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0bfe, code lost:
        if (r11 != -3) goto L_0x0c02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0c03, code lost:
        if (r11 != -2) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0c05, code lost:
        r13 = A03(r12.getOutputFormat(), r0.A05, r32.getName());
        r0.A07 = r13;
        r11 = r13.A00;
        r9 = r13.A09;
        r8 = r13.A06;
        r49 = r13.A02;
        r48 = r13.A03;
        r15 = r13.A04;
        r5 = r13.A01;
        r4 = r32.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0c32, code lost:
        if ("OMX.SEC.avc.enc".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0c3a, code lost:
        if ("OMX.SEC.avc.dec".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0c42, code lost:
        if ("OMX.Exynos.AVC.Encoder".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0c4a, code lost:
        if ("OMX.Exynos.AVC.Decoder".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0c52, code lost:
        if ("OMX.Intel.VideoEncoder.AVC".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0c5a, code lost:
        if ("OMX.Intel.VideoDecoder.AVC".equals(r4) != false) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0c5c, code lost:
        r8 = java.lang.Math.max(r13.A07, r8);
        r9 = java.lang.Math.max(r13.A08, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0c68, code lost:
        r13 = r13.A05;
        com.whatsapp.VideoFrameConverter.configure(r35, r13, r9, r8, r49, r15, r48, r5, r72, r73, r74);
        r4 = X.AnonymousClass001.A0o();
        r4.append("videotranscoder/transcode/configure frame converter from:(");
        r4.append(r11);
        r4.append("[");
        r4.append(r13);
        X.AnonymousClass6C7.A1J("] ", " ", r4, r9, r8);
        r4.append(" ");
        r4.append(r49);
        X.AnonymousClass6C8.A1C(" ", r4, r15, r48);
        r4.append(" ");
        r4.append(r5);
        X.AnonymousClass6C7.A1J(") to:(", "[", r4, r75, r72);
        X.AnonymousClass6C7.A1J("] ", " ", r4, r73, r74);
        X.C18260x0.A1L(r4, ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0cc0, code lost:
        if (r11 != -1) goto L_0x0cdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0cc2, code lost:
        if (r59 == false) goto L_0x0cdb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0cc8, code lost:
        if ((r7.flags & 4) != 0) goto L_0x0ccf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0cca, code lost:
        com.whatsapp.util.Log.w("videotranscoder/transcode/decoder says try later after extractor finished");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0ccf, code lost:
        r58 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0cd2, code lost:
        r53 = r12.getOutputBuffers();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder output buffers have changed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0cdf, code lost:
        if ((r7.flags & 4) == 0) goto L_0x0984;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0ce1, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        r58 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:?, code lost:
        A09(r12, "videotranscoder/transcode/decoder stopped", "videotranscoder/transcode/decoder released");
        r3 = r39;
        A08(r50, r3, r28, r19);
        A09(r3, "videotranscoder/transcode/encoder stopped", "videotranscoder/transcode/encoder released");
        r37.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r35);
        r5 = X.AnonymousClass001.A0o();
        r5.append("videotranscoder/transcode/done cancelled:");
        r5.append(r0.A0R);
        r5.append(" frames:");
        r5.append(r0.A02);
        r5.append(" size:");
        r5.append(r0.A0B.length());
        r5.append(" duration:");
        r5.append(r0.A03);
        X.C18260x0.A0y(" skipfirstframes:", r5, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0d43, code lost:
        if (r28 == null) goto L_0x0d48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:?, code lost:
        r38.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0d4d, code lost:
        if (r0.A0R != false) goto L_0x0d5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0d57, code lost:
        if (r0.A0B.length() == 0) goto L_0x0eea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0d5d, code lost:
        if (r0.A02 == 0) goto L_0x0eea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0d63, code lost:
        if (r0.A03 != 0) goto L_0x0d72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0d65, code lost:
        r0.A03 = java.util.concurrent.TimeUnit.SECONDS.toMicros(r0.A02) / 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0d72, code lost:
        r5 = X.AnonymousClass001.A0o();
        r5.append("videotranscoder/transcode/finished: size:");
        X.C18260x0.A1I(r5, r0.A0B.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0d8a, code lost:
        if (r0.A0A.exists() == false) goto L_0x0e6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0d8e, code lost:
        if (r0.A0R != false) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0d90, code lost:
        r6 = X.C162397rz.A06(r0.A0J, r0.A0A);
        r5 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0d9b, code lost:
        if (r5 == 2) goto L_0x0da0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0d9e, code lost:
        if (r5 != 3) goto L_0x0db1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0da0, code lost:
        r5 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0da3, code lost:
        if (r5 == 4) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0da5, code lost:
        if (r5 == 2) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0da8, code lost:
        if (r5 == 1) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0daa, code lost:
        if (r5 == 0) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0dae, code lost:
        if (r5 != 8) goto L_0x0db1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        r4 = X.AnonymousClass001.A0o();
        r4.append(r77.getAbsoluteFile());
        r4 = X.AnonymousClass6C7.A0S(".aac", r4);
        r0.A09 = r4;
        r5 = new X.C149767Nu(r0.A0A, r4);
        r5.A01 = r26;
        r5.A02 = r22;
        r5.A00 = 96000;
        r6 = new X.AnonymousClass8HS(r5);
        r6.A01 = new X.AnonymousClass92O(r0, 3);
        r6.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:?, code lost:
        r5 = new X.C138066pi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0df2, code lost:
        if (r0.A0R != false) goto L_0x0e5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:?, code lost:
        r5 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0df8, code lost:
        if (r5 <= 0) goto L_0x0e00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0dfa, code lost:
        r16 = (r0.A02 * 1000000000) / r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0e00, code lost:
        r3 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0e02, code lost:
        if (r3 == null) goto L_0x0e3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0e08, code lost:
        if (r3.exists() == false) goto L_0x0e3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0e0a, code lost:
        r9 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0e0c, code lost:
        r8 = new X.C104315Qm(r0.A0A).A02;
        r7 = r0.A0L;
        com.whatsapp.Mp4Ops.A03(r7, r77, r9, r0.A0B, r0.A0A, r8, r1, r16, r0.A03 / 1000, r26);
        com.whatsapp.Mp4Ops.A04(r7, r77, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0e3d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0e3f, code lost:
        r9 = r0.A0A;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0e44, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:?, code lost:
        com.whatsapp.util.Log.e("videotranscodequeue/libmp4muxexception", r5);
        com.whatsapp.Mp4Ops.A00(r0.A0M.A00, r0.A0J, r0.A0L, r0.A0A, r5, "mux");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:?, code lost:
        r8 = X.AnonymousClass001.A0o();
        r8.append("videotranscoder/transcode/input file disappeared, ");
        r7 = r0.A0A;
        r6 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A10(r7, "file_path=", r6);
        r6.append(", ");
        r4 = r7.exists();
        r3 = r7.canRead();
        r2 = r7.canWrite();
        r6.append("exists=");
        r6.append(r4);
        r6.append(", ");
        r6.append("canRead=");
        r6.append(r3);
        r6.append(", ");
        r6.append("canWrite=");
        r6.append(r2);
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0eb5, code lost:
        if (r4 == false) goto L_0x0ec6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0eb7, code lost:
        r6.append("length=");
        r6.append(r7.length());
        r6.append(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ec6, code lost:
        X.C18260x0.A1K(r8, r6.toString());
        r5 = new java.io.FileNotFoundException("input file missing after transcode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ed5, code lost:
        com.whatsapp.util.Log.e("videotranscodequeue/libmp4muxexception", r5);
        com.whatsapp.Mp4Ops.A00(r0.A0M.A00, r0.A0J, r0.A0L, r0.A0A, r5, "mux");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ee9, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0eea, code lost:
        com.whatsapp.Mp4Ops.A00(r0.A0M.A00, r0.A0J, r0.A0L, r0.A0A, new X.C138066pi(), "video transcode");
        r2 = new X.C138066pi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0f05, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:?, code lost:
        com.whatsapp.util.Log.e("videotranscoder/transcode", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0f0b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0f0c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:?, code lost:
        A09(r12, "videotranscoder/transcode/decoder stopped", "videotranscoder/transcode/decoder released");
        r1 = r39;
        A08(r50, r1, r28, r19);
        A09(r1, "videotranscoder/transcode/encoder stopped", "videotranscoder/transcode/encoder released");
        r37.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0f2f, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0f47, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0f48, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0T("videotranscoder/transcode/can't create decoder for ", r8), r2);
        r2 = new X.C138066pi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0f55, code lost:
        X.C18260x0.A0r("videotranscoder/transcode/mime ", r8, X.AnonymousClass001.A0o());
        r2 = new X.C138066pi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0f6f, code lost:
        X.C18260x0.A0r("videotranscoder/transcode/can't create decoder for ", r8, X.AnonymousClass001.A0o());
        r2 = new X.C138066pi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0fb2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0fb3, code lost:
        X.C627536m.A0O(r0.A0B);
        r0 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0fba, code lost:
        if (r0 != null) goto L_0x0fbc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0fbc, code lost:
        X.C627536m.A0O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0fbf, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0331, code lost:
        if (r6 >= 70) goto L_0x0333;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:189:0x0564, B:465:0x0d48] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:292:0x08d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:494:0x0de9 */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04d8 A[Catch:{ all -> 0x05cd, all -> 0x05d4, all -> 0x05d9 }, LOOP:7: B:174:0x04d6->B:175:0x04d8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0505 A[SYNTHETIC, Splitter:B:178:0x0505] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x054e A[Catch:{ 6z0 -> 0x0597, all -> 0x0fb2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05a1 A[Catch:{ all -> 0x05cd, all -> 0x05d4, all -> 0x05d9 }, LOOP:8: B:198:0x059f->B:199:0x05a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0fac A[Catch:{ 6z0 -> 0x0597, all -> 0x0fb2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H() {
        /*
            r78 = this;
            r0 = r78
            java.io.File r1 = r0.A0A
            X.C172218Kd.A04(r1)     // Catch:{ IOException -> 0x0009 }
            r6 = 1
            goto L_0x000a
        L_0x0009:
            r6 = 0
        L_0x000a:
            r3 = 4319(0x10df, float:6.052E-42)
            r14 = 0
            if (r6 != 0) goto L_0x0024
            X.1VX r2 = r0.A0N
            org.json.JSONObject r1 = r2.A0S(r3)
            boolean r1 = A0F(r1)
            if (r1 != 0) goto L_0x0024
            r1 = 3047(0xbe7, float:4.27E-42)
            boolean r1 = r2.A0X(r1)
            r4 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            X.1VX r5 = r0.A0N
            org.json.JSONObject r1 = r5.A0S(r3)
            boolean r1 = A0F(r1)
            if (r1 != 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            r1 = 6407(0x1907, float:8.978E-42)
            boolean r1 = r5.A0X(r1)
            r3 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.io.File r1 = r0.A0Q
            r77 = r1
            java.io.File r1 = r77.getAbsoluteFile()
            r2.append(r1)
            java.lang.String r1 = ".h264"
            java.io.File r1 = X.AnonymousClass6C7.A0S(r1, r2)
            r0.A0B = r1
            if (r3 == 0) goto L_0x005c
            r1 = 1
            r0.A0J(r1)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0e5b
        L_0x005c:
            r20 = 1000(0x3e8, double:4.94E-321)
            r33 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.String r47 = "videotranscodequeue/libmp4muxexception"
            r16 = 30000(0x7530, double:1.4822E-319)
            r1 = 0
            if (r6 == 0) goto L_0x0603
            java.lang.String r25 = " duration:"
            java.lang.String r29 = " frames:"
            java.lang.String r26 = "videotranscoder/transcode/encoder released"
            java.lang.String r28 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r30 = "videotranscoder/transcode/encoder draining "
            java.lang.String r27 = "videotranscoder/transcode/encoder drained"
            java.lang.String r7 = "videotranscoder/transcode/encoder "
            java.lang.String r4 = "video/avc"
            java.lang.String r3 = "x"
            java.lang.String r6 = " "
            r0.A03 = r1     // Catch:{ all -> 0x0fb2 }
            r0.A02 = r1     // Catch:{ all -> 0x0fb2 }
            java.io.File r9 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r8 = android.os.ParcelFileDescriptor.open(r9, r8)     // Catch:{ all -> 0x0fb2 }
            X.8Kd r24 = X.C172218Kd.A01(r8, r14)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r8 = "videotranscoder/transcode/gif decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x05fd }
            r8 = r24
            com.facebook.animated.gif.GifImage r8 = r8.A01     // Catch:{ all -> 0x05fd }
            r64 = r8
            int r13 = r64.getWidth()     // Catch:{ all -> 0x05fd }
            int r42 = r64.getHeight()     // Catch:{ all -> 0x05fd }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fd }
            java.lang.String r8 = "videotranscoder/transcode/gif "
            r10.append(r8)     // Catch:{ all -> 0x05fd }
            r10.append(r13)     // Catch:{ all -> 0x05fd }
            r8 = r42
            X.C18260x0.A0y(r3, r10, r8)     // Catch:{ all -> 0x05fd }
            r9 = r13
        L_0x00b2:
            r10 = 128(0x80, float:1.794E-43)
            if (r9 < r10) goto L_0x00b9
            if (r8 < r10) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            int r9 = r9 * 2
            int r8 = r8 * 2
            goto L_0x00b2
        L_0x00be:
            java.lang.StringBuilder r10 = X.C18270x1.A0W(r9, r7)     // Catch:{ all -> 0x05fd }
            X.C18260x0.A0y(r3, r10, r8)     // Catch:{ all -> 0x05fd }
            if (r9 <= r8) goto L_0x00d0
            int r10 = r0.A0G     // Catch:{ all -> 0x05fd }
            if (r9 <= r10) goto L_0x00d9
            int r8 = r42 * r10
            int r8 = r8 / r13
            r9 = r10
            goto L_0x00d9
        L_0x00d0:
            int r10 = r0.A0G     // Catch:{ all -> 0x05fd }
            if (r8 <= r10) goto L_0x00d9
            int r9 = r13 * r10
            int r9 = r9 / r42
            r8 = r10
        L_0x00d9:
            java.lang.StringBuilder r10 = X.C18270x1.A0W(r9, r7)     // Catch:{ all -> 0x05fd }
            X.C18260x0.A0y(r3, r10, r8)     // Catch:{ all -> 0x05fd }
            int r10 = r9 * r8
            float r10 = (float) r10     // Catch:{ all -> 0x05fd }
            float r11 = A00(r9, r8)     // Catch:{ all -> 0x05fd }
            float r10 = r10 * r11
            int r10 = (int) r10     // Catch:{ all -> 0x05fd }
            r0.A01 = r10     // Catch:{ all -> 0x05fd }
            r10 = 422(0x1a6, float:5.91E-43)
            boolean r5 = r5.A0X(r10)     // Catch:{ all -> 0x05fd }
            android.media.MediaCodecInfo r12 = X.C162287rd.A03(r5)     // Catch:{ all -> 0x05fd }
            if (r12 == 0) goto L_0x05e3
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fd }
            java.lang.String r5 = "videotranscoder/transcode/found "
            r10.append(r5)     // Catch:{ all -> 0x05fd }
            java.lang.String r5 = r12.getName()     // Catch:{ all -> 0x05fd }
            r10.append(r5)     // Catch:{ all -> 0x05fd }
            java.lang.String r5 = " supporting "
            X.C18260x0.A0s(r5, r4, r10)     // Catch:{ all -> 0x05fd }
            int r54 = X.C162287rd.A01(r12)     // Catch:{ all -> 0x05fd }
            if (r54 == 0) goto L_0x05f0
            java.lang.String r53 = r12.getName()     // Catch:{ all -> 0x05fd }
            java.lang.String r10 = r12.getName()     // Catch:{ all -> 0x05fd }
            java.lang.String r5 = "OMX.qcom.video.encoder.avc"
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x05fd }
            r57 = 16
            if (r5 == 0) goto L_0x0126
            r57 = 32
        L_0x0126:
            X.7n7 r5 = r0.A05     // Catch:{ all -> 0x05fd }
            r51 = 0
            r59 = r14
            r52 = r5
            r55 = r9
            r56 = r8
            r58 = r14
            X.7hY r5 = A04(r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x05fd }
            int r11 = r5.A00     // Catch:{ all -> 0x05fd }
            int r10 = r5.A09     // Catch:{ all -> 0x05fd }
            int r8 = r5.A06     // Catch:{ all -> 0x05fd }
            java.lang.StringBuilder r7 = X.C18270x1.A0W(r10, r7)     // Catch:{ all -> 0x05fd }
            X.C18260x0.A0y(r3, r7, r8)     // Catch:{ all -> 0x05fd }
            int r3 = r5.A08     // Catch:{ all -> 0x05fd }
            r50 = r3
            int r7 = r3 / 2
            int r3 = r5.A07     // Catch:{ all -> 0x05fd }
            int r50 = r50 * r3
            int r7 = r7 * r3
            int r50 = r50 + r7
            java.lang.String r3 = r12.getName()     // Catch:{ all -> 0x05fd }
            android.media.MediaCodec r7 = android.media.MediaCodec.createByCodecName(r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x05fd }
            android.media.MediaFormat r9 = android.media.MediaFormat.createVideoFormat(r4, r10, r8)     // Catch:{ all -> 0x05fd }
            java.lang.String r4 = "bitrate"
            int r3 = r0.A01     // Catch:{ all -> 0x05fd }
            r9.setInteger(r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r4 = "frame-rate"
            r3 = 15
            r9.setInteger(r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "color-format"
            r9.setInteger(r3, r11)     // Catch:{ all -> 0x05fd }
            java.lang.String r4 = "i-frame-interval"
            r3 = 10
            r9.setInteger(r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r4 = "stride"
            int r3 = r5.A08     // Catch:{ all -> 0x05fd }
            r9.setInteger(r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r4 = "slice-height"
            int r3 = r5.A07     // Catch:{ all -> 0x05fd }
            r9.setInteger(r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "videotranscoder/transcode/configure encoder with output format "
            X.C18260x0.A1R(r4, r3, r9)     // Catch:{ all -> 0x05fd }
            r4 = 0
            r3 = 1
            r7.configure(r9, r4, r4, r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x05fd }
            r7.start()     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x05fd }
            int r5 = r5.A05     // Catch:{ all -> 0x05fd }
            java.nio.ByteBuffer[] r49 = r7.getInputBuffers()     // Catch:{ all -> 0x05fd }
            java.nio.ByteBuffer[] r48 = r7.getOutputBuffers()     // Catch:{ all -> 0x05fd }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x05fd }
            java.io.FileOutputStream r46 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ all -> 0x05fd }
            java.nio.channels.FileChannel r45 = r46.getChannel()     // Catch:{ all -> 0x05d9 }
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x05cd }
            r9.<init>()     // Catch:{ all -> 0x05cd }
            long r22 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x05cd }
            X.5aV r3 = r0.A08     // Catch:{ all -> 0x05cd }
            if (r3 == 0) goto L_0x01e2
            java.util.List r3 = r3.A04     // Catch:{ all -> 0x05cd }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x05cd }
        L_0x01cd:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x05cd }
            if (r3 == 0) goto L_0x01e7
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x05cd }
            X.5Uw r3 = (X.C105425Uw) r3     // Catch:{ all -> 0x05cd }
            boolean r3 = r3.A0T()     // Catch:{ all -> 0x05cd }
            if (r3 == 0) goto L_0x01cd
            r51 = 1
            goto L_0x01e7
        L_0x01e2:
            r44 = 0
            r43 = 0
            goto L_0x020a
        L_0x01e7:
            android.graphics.Bitmap r43 = X.C86664Kz.A0Y(r10, r8)     // Catch:{ all -> 0x05cd }
            X.5aV r4 = r0.A08     // Catch:{ all -> 0x05cd }
            r3 = r43
            r4.A06(r14, r3)     // Catch:{ all -> 0x05cd }
            int r4 = r43.getWidth()     // Catch:{ all -> 0x05cd }
            int r3 = r43.getHeight()     // Catch:{ all -> 0x05cd }
            int r4 = r4 * r3
            int r3 = r4 * 4
            java.nio.ByteBuffer r44 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x05cd }
            r15 = r44
            r12 = r43
            r3 = r22
            A07(r12, r15, r3)     // Catch:{ all -> 0x05cd }
        L_0x020a:
            int r12 = r13 + -1
            int r41 = r42 + -1
            r54 = 7
            r52 = r22
            r55 = r13
            r56 = r42
            r57 = r14
            r59 = r12
            r60 = r41
            r61 = r5
            r62 = r10
            r63 = r8
            com.whatsapp.VideoFrameConverter.configure(r52, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)     // Catch:{ all -> 0x05cd }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05cd }
            java.lang.String r4 = "videotranscoder/transcode/configure frame converter from:([7] "
            r3 = r42
            X.AnonymousClass6C7.A1J(r4, r6, r15, r13, r3)     // Catch:{ all -> 0x05cd }
            r15.append(r6)     // Catch:{ all -> 0x05cd }
            r15.append(r14)     // Catch:{ all -> 0x05cd }
            X.AnonymousClass6C8.A1C(r6, r15, r14, r12)     // Catch:{ all -> 0x05cd }
            r15.append(r6)     // Catch:{ all -> 0x05cd }
            r3 = r41
            r15.append(r3)     // Catch:{ all -> 0x05cd }
            java.lang.String r3 = ") to:("
            r15.append(r3)     // Catch:{ all -> 0x05cd }
            r15.append(r11)     // Catch:{ all -> 0x05cd }
            java.lang.String r3 = "["
            r15.append(r3)     // Catch:{ all -> 0x05cd }
            r15.append(r5)     // Catch:{ all -> 0x05cd }
            java.lang.String r3 = "] "
            X.AnonymousClass6C7.A1J(r3, r6, r15, r10, r8)     // Catch:{ all -> 0x05cd }
            java.lang.String r3 = ")"
            X.C18260x0.A1L(r15, r3)     // Catch:{ all -> 0x05cd }
            int r40 = r64.getFrameCount()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.String r4 = "videotranscoder/transcode/gif frames:"
            r3 = r40
            X.C18260x0.A0y(r4, r5, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r39 = r13 * 3
            int r38 = r39 * r42
            java.nio.ByteBuffer r37 = java.nio.ByteBuffer.allocateDirect(r38)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r11 = 0
            r36 = 0
            r8 = 0
            r18 = 0
        L_0x0278:
            r3 = r40
            if (r8 >= r3) goto L_0x049c
            int[] r3 = r64.getFrameDurations()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r6 = r3[r8]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r5 = 70
            if (r8 <= 0) goto L_0x02cb
            int r15 = r11 + r6
            if (r15 > r5) goto L_0x02cb
            int r3 = r40 + -1
            if (r8 != r3) goto L_0x0495
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.String r3 = "videotranscoder/handleLastFrame/"
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r53 = r7.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r10 = r49[r53]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r10.clear()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = r22
            r6 = r37
            com.whatsapp.VideoFrameConverter.convertFrame(r3, r6, r10)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int[] r3 = r64.getFrameDurations()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = r3[r8]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r3 >= r5) goto L_0x02b4
            r3 = 70
        L_0x02b4:
            int r3 = r3 * 1000
            long r3 = (long) r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            long r5 = r18 + r3
            r58 = 4
            r52 = r7
            r54 = r14
            r55 = r50
            r56 = r5
            r52.queueInputBuffer(r53, r54, r55, r56, r58)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            A0B(r0, r5)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            goto L_0x0495
        L_0x02cb:
            r3 = r24
            android.graphics.Bitmap r52 = r3.A05(r8)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r10 = r13 * r42
            int[] r3 = new int[r10]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r35 = r3
            r56 = r14
            r57 = r14
            r58 = r13
            r53 = r3
            r54 = r14
            r55 = r13
            r59 = r42
            r52.getPixels(r53, r54, r55, r56, r57, r58, r59)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r3 = r10 * 3
            byte[] r12 = new byte[r3]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r15 = 0
        L_0x02ed:
            if (r15 >= r10) goto L_0x030f
            r4 = r35[r15]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r3 = r4 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r31 = r3
            int r3 = r4 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r32 = r15 * 3
            r12[r32] = r31     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r31 = r32 + 1
            r12[r31] = r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r3 = r32 + 2
            r12[r3] = r4     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r15 = r15 + 1
            goto L_0x02ed
        L_0x030f:
            r3 = r38
            byte[] r15 = new byte[r3]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r31 = r41
            r10 = 0
        L_0x0316:
            if (r31 < 0) goto L_0x0325
            int r4 = r31 * 3
            int r4 = r4 * r13
            r3 = r39
            java.lang.System.arraycopy(r12, r4, r15, r10, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r10 = r10 + r39
            int r31 = r31 + -1
            goto L_0x0316
        L_0x0325:
            r3 = r37
            r3.put(r15)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3.position(r14)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r8 != 0) goto L_0x0338
            r15 = 70
            if (r6 < r5) goto L_0x0334
        L_0x0333:
            r15 = r6
        L_0x0334:
            r10 = 5
            if (r8 >= r10) goto L_0x0354
            goto L_0x034b
        L_0x0338:
            if (r11 < r5) goto L_0x0340
            int r3 = r11 * 1000
            long r3 = (long) r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x033d:
            long r18 = r18 + r3
            goto L_0x0333
        L_0x0340:
            int r3 = r11 + r6
            if (r3 <= r5) goto L_0x0333
            int r3 = 70 - r11
            int r6 = r6 - r3
            r3 = 70000(0x11170, double:3.45846E-319)
            goto L_0x033d
        L_0x034b:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.String r3 = "videotranscoder/transcode/loop "
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x0354:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = r7.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r8 >= r10) goto L_0x0366
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.String r3 = "videotranscoder/transcode/encoder/dequeue/input "
            X.C18260x0.A0y(r3, r4, r5)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x0366:
            if (r5 < 0) goto L_0x040e
            r11 = r49[r5]     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r11.clear()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            X.5aV r3 = r0.A08     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r3 == 0) goto L_0x0398
            if (r51 == 0) goto L_0x0398
            java.util.List r3 = r3.A04     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x0379:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r3 == 0) goto L_0x0383
            r4.next()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            goto L_0x0379
        L_0x0383:
            r3 = r43
            r3.eraseColor(r14)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            X.5aV r4 = r0.A08     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r4.A06(r14, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r44.rewind()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r12 = r44
            r6 = r3
            r3 = r22
            A07(r6, r12, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x0398:
            r3 = r22
            r6 = r37
            com.whatsapp.VideoFrameConverter.convertFrame(r3, r6, r11)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x03a7
            if (r8 >= r10) goto L_0x03ac
        L_0x03a7:
            java.lang.String r3 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x03ac:
            r58 = r14
            r52 = r7
            r53 = r5
            r55 = r50
            r56 = r18
            r52.queueInputBuffer(r53, r54, r55, r56, r58)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x03c1
            if (r8 >= r10) goto L_0x03c6
        L_0x03c1:
            java.lang.String r3 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x03c6:
            r3 = r18
            A0B(r0, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            double r5 = (double) r8     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = r40
            double r3 = (double) r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            double r5 = r5 / r3
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r3
            int r11 = (int) r5     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = r36
            if (r11 == r3) goto L_0x040e
            X.8oc r3 = r0.A06     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r3 == 0) goto L_0x040e
            boolean r3 = r0.A0R     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r3 != 0) goto L_0x03e9
            X.8oc r3 = r0.A06     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            boolean r4 = r3.BZ1(r11)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = 0
            if (r4 == 0) goto L_0x03ea
        L_0x03e9:
            r3 = 1
        L_0x03ea:
            r0.A0R = r3     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            if (r11 < r10) goto L_0x03f2
            int r3 = r11 % 5
            if (r3 != 0) goto L_0x040c
        L_0x03f2:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            java.lang.String r4 = "videotranscoder/transcode/progress "
            r3 = r29
            X.C18270x1.A19(r4, r3, r5, r11)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r5.append(r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            r3 = r25
            r5.append(r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            long r3 = r0.A03     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
            X.C18260x0.A1I(r5, r3)     // Catch:{ Exception -> 0x04c9, all -> 0x04c3 }
        L_0x040c:
            r36 = r11
        L_0x040e:
            int r5 = r40 + -1
            r3 = 1000000(0xf4240, double:4.940656E-318)
            if (r8 != r5) goto L_0x044d
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049a }
            java.lang.String r5 = "videotranscoder/handleLastFrame/"
            X.C18260x0.A0y(r5, r6, r8)     // Catch:{ Exception -> 0x049a }
            int r53 = r7.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x049a }
            r12 = r49[r53]     // Catch:{ Exception -> 0x049a }
            r12.clear()     // Catch:{ Exception -> 0x049a }
            r5 = r22
            r11 = r37
            com.whatsapp.VideoFrameConverter.convertFrame(r5, r11, r12)     // Catch:{ Exception -> 0x049a }
            int[] r5 = r64.getFrameDurations()     // Catch:{ Exception -> 0x049a }
            r6 = r5[r8]     // Catch:{ Exception -> 0x049a }
            r5 = 70
            if (r6 >= r5) goto L_0x043a
            r6 = 70
        L_0x043a:
            int r5 = r6 * 1000
            long r5 = (long) r5     // Catch:{ Exception -> 0x049a }
            long r11 = r18 + r5
            r58 = 4
            r52 = r7
            r55 = r50
            r56 = r11
            r52.queueInputBuffer(r53, r54, r55, r56, r58)     // Catch:{ Exception -> 0x049a }
            A0B(r0, r11)     // Catch:{ Exception -> 0x049a }
        L_0x044d:
            int r11 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ Exception -> 0x049a }
            if (r8 >= r10) goto L_0x045c
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049a }
            java.lang.String r5 = "videotranscoder/transcode/encoder/dequeue/output "
            X.C18260x0.A0y(r5, r6, r11)     // Catch:{ Exception -> 0x049a }
        L_0x045c:
            if (r11 < 0) goto L_0x0471
            r6 = r48[r11]     // Catch:{ Exception -> 0x049a }
            X.AnonymousClass6C7.A0z(r9, r6)     // Catch:{ Exception -> 0x049a }
            r5 = r45
            r5.write(r6)     // Catch:{ Exception -> 0x049a }
            r6.clear()     // Catch:{ Exception -> 0x049a }
            r7.releaseOutputBuffer(r11, r14)     // Catch:{ Exception -> 0x049a }
            if (r8 >= r10) goto L_0x0495
            goto L_0x0490
        L_0x0471:
            r5 = -3
            if (r11 != r5) goto L_0x047e
            java.nio.ByteBuffer[] r48 = r7.getOutputBuffers()     // Catch:{ Exception -> 0x049a }
            java.lang.String r5 = "videotranscoder/transcode/encoder output buffers have changed"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ Exception -> 0x049a }
            goto L_0x0495
        L_0x047e:
            r5 = -2
            if (r11 != r5) goto L_0x0495
            android.media.MediaFormat r10 = r7.getOutputFormat()     // Catch:{ Exception -> 0x049a }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x049a }
            java.lang.String r5 = "videotranscoder/transcode/encoder output format has changed to "
            java.lang.String r5 = X.AnonymousClass000.A0P(r10, r5, r6)     // Catch:{ Exception -> 0x049a }
            goto L_0x0492
        L_0x0490:
            java.lang.String r5 = "videotranscoder/transcode/encoder/release/output"
        L_0x0492:
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ Exception -> 0x049a }
        L_0x0495:
            int r8 = r8 + 1
            r11 = r15
            goto L_0x0278
        L_0x049a:
            r6 = move-exception
            goto L_0x04cd
        L_0x049c:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
        L_0x04a3:
            if (r8 < 0) goto L_0x04f6
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05cd }
            r5 = r30
            X.C18260x0.A0y(r5, r6, r8)     // Catch:{ all -> 0x05cd }
            r6 = r48[r8]     // Catch:{ all -> 0x05cd }
            X.AnonymousClass6C7.A0z(r9, r6)     // Catch:{ all -> 0x05cd }
            r5 = r45
            r5.write(r6)     // Catch:{ all -> 0x05cd }
            r6.clear()     // Catch:{ all -> 0x05cd }
            r7.releaseOutputBuffer(r8, r14)     // Catch:{ all -> 0x05cd }
            int r8 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
            goto L_0x04a3
        L_0x04c3:
            r6 = move-exception
            r3 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x059b
        L_0x04c9:
            r6 = move-exception
            r3 = 1000000(0xf4240, double:4.940656E-318)
        L_0x04cd:
            java.lang.String r5 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ all -> 0x059a }
            int r8 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
        L_0x04d6:
            if (r8 < 0) goto L_0x04f6
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05cd }
            r5 = r30
            X.C18260x0.A0y(r5, r6, r8)     // Catch:{ all -> 0x05cd }
            r6 = r48[r8]     // Catch:{ all -> 0x05cd }
            X.AnonymousClass6C7.A0z(r9, r6)     // Catch:{ all -> 0x05cd }
            r5 = r45
            r5.write(r6)     // Catch:{ all -> 0x05cd }
            r6.clear()     // Catch:{ all -> 0x05cd }
            r7.releaseOutputBuffer(r8, r14)     // Catch:{ all -> 0x05cd }
            int r8 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
            goto L_0x04d6
        L_0x04f6:
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ all -> 0x05cd }
            r4 = r28
            r3 = r26
            A09(r7, r4, r3)     // Catch:{ all -> 0x05cd }
            com.whatsapp.VideoFrameConverter.release(r22)     // Catch:{ all -> 0x05cd }
            if (r45 == 0) goto L_0x0508
            r45.close()     // Catch:{ all -> 0x05d9 }
        L_0x0508:
            r46.close()     // Catch:{ all -> 0x05fd }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = "videotranscoder/transcode/done cancelled:"
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            boolean r3 = r0.A0R     // Catch:{ all -> 0x05fd }
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            r3 = r29
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            long r3 = r0.A02     // Catch:{ all -> 0x05fd }
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            java.lang.String r3 = " size:"
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x05fd }
            long r3 = r3.length()     // Catch:{ all -> 0x05fd }
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            r3 = r25
            r5.append(r3)     // Catch:{ all -> 0x05fd }
            long r3 = r0.A03     // Catch:{ all -> 0x05fd }
            X.C18260x0.A1I(r5, r3)     // Catch:{ all -> 0x05fd }
            r24.close()     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0fb2 }
            long r4 = r3.length()     // Catch:{ all -> 0x0fb2 }
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0fac
            long r3 = r0.A03     // Catch:{ all -> 0x0fb2 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0fac
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/finished: size:"
            r5.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0fb2 }
            long r3 = r3.length()     // Catch:{ all -> 0x0fb2 }
            X.C18260x0.A1I(r5, r3)     // Catch:{ all -> 0x0fb2 }
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0fb2 }
            if (r3 != 0) goto L_0x0e5b
            long r3 = r0.A03     // Catch:{ 6z0 -> 0x0597 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0570
            long r5 = r0.A02     // Catch:{ 6z0 -> 0x0597 }
            long r16 = r5 * r33
            long r16 = r16 / r3
        L_0x0570:
            X.7bG r6 = r0.A0L     // Catch:{ 6z0 -> 0x0597 }
            r22 = 0
            java.io.File r7 = r0.A0B     // Catch:{ 6z0 -> 0x0597 }
            java.io.File r5 = r0.A0A     // Catch:{ 6z0 -> 0x0597 }
            long r3 = r3 / r20
            r32 = r1
            r20 = r6
            r21 = r77
            r23 = r7
            r24 = r5
            r25 = r14
            r26 = r1
            r28 = r16
            r30 = r3
            com.whatsapp.Mp4Ops.A03(r20, r21, r22, r23, r24, r25, r26, r28, r30, r32)     // Catch:{ 6z0 -> 0x0597 }
            r2 = 1
            r1 = r77
            com.whatsapp.Mp4Ops.A04(r6, r1, r2)     // Catch:{ 6z0 -> 0x0597 }
            goto L_0x0e5b
        L_0x0597:
            r5 = move-exception
            goto L_0x0ed5
        L_0x059a:
            r6 = move-exception
        L_0x059b:
            int r5 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
        L_0x059f:
            if (r5 < 0) goto L_0x05bf
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05cd }
            r1 = r30
            X.C18260x0.A0y(r1, r2, r5)     // Catch:{ all -> 0x05cd }
            r2 = r48[r5]     // Catch:{ all -> 0x05cd }
            X.AnonymousClass6C7.A0z(r9, r2)     // Catch:{ all -> 0x05cd }
            r1 = r45
            r1.write(r2)     // Catch:{ all -> 0x05cd }
            r2.clear()     // Catch:{ all -> 0x05cd }
            r7.releaseOutputBuffer(r5, r14)     // Catch:{ all -> 0x05cd }
            int r5 = r7.dequeueOutputBuffer(r9, r3)     // Catch:{ all -> 0x05cd }
            goto L_0x059f
        L_0x05bf:
            com.whatsapp.util.Log.i((java.lang.String) r27)     // Catch:{ all -> 0x05cd }
            r2 = r28
            r1 = r26
            A09(r7, r2, r1)     // Catch:{ all -> 0x05cd }
            com.whatsapp.VideoFrameConverter.release(r22)     // Catch:{ all -> 0x05cd }
            throw r6     // Catch:{ all -> 0x05cd }
        L_0x05cd:
            r2 = move-exception
            if (r45 == 0) goto L_0x05d8
            r45.close()     // Catch:{ all -> 0x05d4 }
            goto L_0x05d8
        L_0x05d4:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x05d9 }
        L_0x05d8:
            throw r2     // Catch:{ all -> 0x05d9 }
        L_0x05d9:
            r2 = move-exception
            r46.close()     // Catch:{ all -> 0x05de }
            goto L_0x05fc
        L_0x05de:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x05fd }
            goto L_0x05fc
        L_0x05e3:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x05fd }
            java.lang.String r1 = "No codec supporting video/avc"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x05fd }
            r2.<init>(r1)     // Catch:{ all -> 0x05fd }
            goto L_0x05fc
        L_0x05f0:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x05fd }
            java.lang.String r1 = "No known color formats suported"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x05fd }
            r2.<init>(r1)     // Catch:{ all -> 0x05fd }
        L_0x05fc:
            throw r2     // Catch:{ all -> 0x05fd }
        L_0x05fd:
            r2 = move-exception
            r24.close()     // Catch:{ all -> 0x0f8d }
            goto L_0x0fb1
        L_0x0603:
            if (r4 == 0) goto L_0x060a
            r0.A0J(r14)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0e5b
        L_0x060a:
            java.lang.String r45 = "videotranscoder/transcode/extractor released"
            java.lang.String r43 = "videotranscoder/transcode/encoder released"
            java.lang.String r42 = "videotranscoder/transcode/encoder stopped"
            java.lang.String r41 = "videotranscoder/transcode/decoder released"
            java.lang.String r40 = "videotranscoder/transcode/decoder stopped"
            java.lang.String r10 = "durationUs"
            java.lang.String r9 = "videotranscoder/transcode/can't create decoder for "
            java.lang.String r46 = " duration:"
            java.io.File r4 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            X.5Qm r3 = new X.5Qm     // Catch:{ all -> 0x0fb2 }
            r3.<init>(r4)     // Catch:{ all -> 0x0fb2 }
            int r8 = r3.A03     // Catch:{ all -> 0x0fb2 }
            int r7 = r3.A01     // Catch:{ all -> 0x0fb2 }
            int r11 = r3.A01()     // Catch:{ all -> 0x0fb2 }
            int r3 = r3.A02     // Catch:{ all -> 0x0fb2 }
            r76 = r3
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/source:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0fb2 }
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r44 = " size:"
            r3 = r44
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            long r3 = r3.length()     // Catch:{ all -> 0x0fb2 }
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = " bitrate:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            r6.append(r11)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = " frame:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            r6.append(r8)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            r6.append(r7)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = " rotation:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            r3 = r76
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = " from:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            long r3 = r0.A0H     // Catch:{ all -> 0x0fb2 }
            r26 = r3
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = " to:"
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            long r3 = r0.A0I     // Catch:{ all -> 0x0fb2 }
            r22 = r3
            X.C18260x0.A1I(r6, r3)     // Catch:{ all -> 0x0fb2 }
            int r3 = r0.A0G     // Catch:{ all -> 0x0fb2 }
            android.util.Pair r4 = X.C162287rd.A04(r8, r7, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.Object r3 = r4.first     // Catch:{ all -> 0x0fb2 }
            int r51 = X.AnonymousClass0x7.A05(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.Object r3 = r4.second     // Catch:{ all -> 0x0fb2 }
            int r52 = X.AnonymousClass0x7.A05(r3)     // Catch:{ all -> 0x0fb2 }
            int r4 = r0.A0F     // Catch:{ all -> 0x0fb2 }
            int r3 = r51 * r52
            float r6 = (float) r3     // Catch:{ all -> 0x0fb2 }
            float r3 = r0.A00     // Catch:{ all -> 0x0fb2 }
            float r6 = r6 * r3
            int r3 = (int) r6     // Catch:{ all -> 0x0fb2 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0fb2 }
            r0.A01 = r3     // Catch:{ all -> 0x0fb2 }
            r3 = 422(0x1a6, float:5.91E-43)
            boolean r4 = r5.A0X(r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "video/avc"
            android.media.MediaCodecInfo r32 = X.C162287rd.A03(r4)     // Catch:{ all -> 0x0fb2 }
            if (r32 == 0) goto L_0x0f9f
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "videotranscoder/transcode/found "
            r6.append(r4)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = r32.getName()     // Catch:{ all -> 0x0fb2 }
            r6.append(r4)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = " supporting "
            X.C18260x0.A0s(r4, r3, r6)     // Catch:{ all -> 0x0fb2 }
            int r50 = X.C162287rd.A01(r32)     // Catch:{ all -> 0x0fb2 }
            if (r50 == 0) goto L_0x0f92
            java.lang.String r49 = r32.getName()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r6 = r32.getName()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "OMX.qcom.video.encoder.avc"
            boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x0fb2 }
            r53 = 16
            if (r4 == 0) goto L_0x06e7
            r53 = 32
        L_0x06e7:
            X.7n7 r4 = r0.A05     // Catch:{ all -> 0x0fb2 }
            r30 = 0
            r29 = 0
            r55 = r14
            r48 = r4
            r54 = r14
            X.7hY r6 = A04(r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x0fb2 }
            int r4 = r6.A00     // Catch:{ all -> 0x0fb2 }
            r75 = r4
            int r4 = r6.A09     // Catch:{ all -> 0x0fb2 }
            r73 = r4
            int r4 = r6.A06     // Catch:{ all -> 0x0fb2 }
            r74 = r4
            int r4 = r6.A08     // Catch:{ all -> 0x0fb2 }
            r18 = r4
            int r7 = r4 / 2
            int r4 = r6.A07     // Catch:{ all -> 0x0fb2 }
            int r18 = r18 * r4
            int r7 = r7 * r4
            int r18 = r18 + r7
            java.lang.String r4 = r32.getName()     // Catch:{ all -> 0x0fb2 }
            android.media.MediaCodec r39 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "videotranscoder/transcode/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0fb2 }
            r7 = r73
            r4 = r74
            android.media.MediaFormat r7 = android.media.MediaFormat.createVideoFormat(r3, r7, r4)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "bitrate"
            int r3 = r0.A01     // Catch:{ all -> 0x0fb2 }
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "frame-rate"
            r3 = 30
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "color-format"
            r3 = r75
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "i-frame-interval"
            r3 = 10
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "stride"
            int r3 = r6.A08     // Catch:{ all -> 0x0fb2 }
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r4 = "slice-height"
            int r3 = r6.A07     // Catch:{ all -> 0x0fb2 }
            r7.setInteger(r4, r3)     // Catch:{ all -> 0x0fb2 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/configure encoder with output format "
            X.C18260x0.A1R(r4, r3, r7)     // Catch:{ all -> 0x0fb2 }
            r8 = 0
            r4 = 1
            r3 = r39
            r3.configure(r7, r8, r8, r4)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0fb2 }
            r39.start()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/encoder started"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0fb2 }
            java.nio.ByteBuffer[] r31 = r39.getInputBuffers()     // Catch:{ all -> 0x0fb2 }
            java.nio.ByteBuffer[] r19 = r39.getOutputBuffers()     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0fb2 }
            java.io.FileOutputStream r38 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ all -> 0x0fb2 }
            java.nio.channels.FileChannel r28 = r38.getChannel()     // Catch:{ all -> 0x0f88 }
            android.media.MediaExtractor r37 = new android.media.MediaExtractor     // Catch:{ all -> 0x0f7c }
            r37.<init>()     // Catch:{ all -> 0x0f7c }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0f7c }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x0f7c }
            r3 = r37
            r3.setDataSource(r4)     // Catch:{ all -> 0x0f7c }
            int r13 = r37.getTrackCount()     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/number of tracks:"
            X.C18260x0.A0y(r3, r4, r13)     // Catch:{ all -> 0x0f7c }
            r12 = 0
        L_0x079c:
            if (r12 >= r13) goto L_0x0f64
            r3 = r37
            android.media.MediaFormat r11 = r3.getTrackFormat(r12)     // Catch:{ all -> 0x0f7c }
            java.lang.String r8 = "mime"
            java.lang.String r7 = r11.getString(r8)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/track:"
            r4.append(r3)     // Catch:{ all -> 0x0f7c }
            r4.append(r12)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = " mime:"
            r4.append(r3)     // Catch:{ all -> 0x0f7c }
            r4.append(r7)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = " format:"
            X.C18260x0.A1R(r4, r3, r11)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "video"
            boolean r3 = r7.startsWith(r3)     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x07cc
            goto L_0x07cf
        L_0x07cc:
            int r12 = r12 + 1
            goto L_0x079c
        L_0x07cf:
            if (r12 < 0) goto L_0x0f64
            r3 = r37
            android.media.MediaFormat r11 = r3.getTrackFormat(r12)     // Catch:{ all -> 0x0f7c }
            java.lang.String r8 = r11.getString(r8)     // Catch:{ all -> 0x0f7c }
            if (r8 == 0) goto L_0x0f55
            java.lang.String r3 = "video/unknown"
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x0f7c }
            if (r3 != 0) goto L_0x0f55
            r3 = r37
            r3.selectTrack(r12)     // Catch:{ all -> 0x0f7c }
            boolean r3 = r11.containsKey(r10)     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x0805
            long r24 = r11.getLong(r10)     // Catch:{ all -> 0x0f7c }
        L_0x07f4:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r4 = "videotranscoder/transcode/decoder format:"
            r3 = r46
            X.AnonymousClass000.A17(r11, r4, r3, r7)     // Catch:{ all -> 0x0f7c }
            r3 = r24
            X.C18260x0.A1I(r7, r3)     // Catch:{ all -> 0x0f7c }
            goto L_0x0808
        L_0x0805:
            r24 = -1
            goto L_0x07f4
        L_0x0808:
            android.media.MediaCodec r12 = android.media.MediaCodec.createDecoderByType(r8)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            r3 = 1250(0x4e2, float:1.752E-42)
            boolean r7 = r5.A0X(r3)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            java.lang.String r4 = "samsung"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ IllegalArgumentException -> 0x0f47 }
            boolean r3 = r4.equalsIgnoreCase(r3)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            if (r3 == 0) goto L_0x0868
            if (r7 == 0) goto L_0x0868
            java.lang.String r35 = r12.getName()     // Catch:{ IllegalArgumentException -> 0x0f47 }
            java.lang.String r3 = X.AnonymousClass0x9.A0z(r35)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            java.lang.String r7 = "omx.exynos"
            boolean r3 = r3.startsWith(r7)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            if (r3 != 0) goto L_0x0864
            java.util.List r3 = X.C162287rd.A06(r8)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0f47 }
            r13 = 0
            r12 = r13
        L_0x0838:
            boolean r3 = r15.hasNext()     // Catch:{ IllegalArgumentException -> 0x0f47 }
            if (r3 == 0) goto L_0x085b
            java.lang.String r10 = X.AnonymousClass001.A0m(r15)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            java.lang.String r4 = X.AnonymousClass0x9.A0z(r10)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            boolean r3 = r4.startsWith(r7)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            if (r3 == 0) goto L_0x084f
            if (r13 != 0) goto L_0x084f
            r13 = r10
        L_0x084f:
            java.lang.String r3 = "c2.exynos"
            boolean r3 = r4.startsWith(r3)     // Catch:{ IllegalArgumentException -> 0x0f47 }
            if (r3 != 0) goto L_0x0838
            if (r12 != 0) goto L_0x0838
            r12 = r10
            goto L_0x0838
        L_0x085b:
            if (r13 == 0) goto L_0x0860
            r35 = r13
            goto L_0x0864
        L_0x0860:
            if (r12 == 0) goto L_0x0864
            r35 = r12
        L_0x0864:
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r35)     // Catch:{ IllegalArgumentException -> 0x0f47 }
        L_0x0868:
            if (r12 == 0) goto L_0x0f6f
            java.lang.String r3 = "videotranscoder/transcode/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0f7c }
            r3 = 0
            r12.configure(r11, r3, r3, r14)     // Catch:{ IllegalStateException -> 0x0879 }
            java.lang.String r3 = "videotranscoder/transcode/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x0879 }
            goto L_0x08d6
        L_0x0879:
            r4 = move-exception
            java.lang.String r3 = "videotranscoder/transcode/decoder failed to configure, will try different one "
            com.whatsapp.util.Log.i(r3, r4)     // Catch:{ all -> 0x0f7c }
            r12.release()     // Catch:{ all -> 0x0f7c }
            java.util.List r3 = X.C162287rd.A06(r8)     // Catch:{ all -> 0x0f7c }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ all -> 0x0f7c }
        L_0x088a:
            boolean r3 = r15.hasNext()     // Catch:{ all -> 0x0f7c }
            r13 = 0
            if (r3 == 0) goto L_0x0f30
            java.lang.String r10 = X.AnonymousClass001.A0m(r15)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/decoder/try "
            X.C18260x0.A0s(r3, r10, r4)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "OMX.ittiam.video.decoder.avc"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x08b0
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/decoder/skip "
            X.C18260x0.A0s(r3, r10, r4)     // Catch:{ all -> 0x0f7c }
            goto L_0x088a
        L_0x08b0:
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r10)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r4 = "videotranscoder/transcode/decoder "
            r7.append(r4)     // Catch:{ all -> 0x0f7c }
            r7.append(r10)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = " created"
            X.C18260x0.A1L(r7, r3)     // Catch:{ all -> 0x0f7c }
            r12.configure(r11, r13, r13, r14)     // Catch:{ Exception -> 0x08d2 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0m(r4, r10)     // Catch:{ Exception -> 0x08d2 }
            java.lang.String r3 = " is ok"
            X.C18260x0.A1L(r4, r3)     // Catch:{ Exception -> 0x08d2 }
            goto L_0x08d6
        L_0x08d2:
            r12.release()     // Catch:{ all -> 0x0f7c }
            goto L_0x088a
        L_0x08d6:
            r12.start()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0f7c }
            java.nio.ByteBuffer[] r54 = r12.getInputBuffers()     // Catch:{ all -> 0x0f7c }
            java.nio.ByteBuffer[] r53 = r12.getOutputBuffers()     // Catch:{ all -> 0x0f7c }
            android.media.MediaCodec$BufferInfo r7 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0f7c }
            r7.<init>()     // Catch:{ all -> 0x0f7c }
            android.media.MediaCodec$BufferInfo r50 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0f7c }
            r50.<init>()     // Catch:{ all -> 0x0f7c }
            int r3 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0913
            long r3 = r26 * r20
            r8 = r37
            r8.seekTo(r3, r14)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r9 = "videotranscoder/transcode/seek to:"
            r8.append(r9)     // Catch:{ all -> 0x0f7c }
            r8.append(r3)     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = " actual:"
            r8.append(r3)     // Catch:{ all -> 0x0f7c }
            long r3 = r37.getSampleTime()     // Catch:{ all -> 0x0f7c }
            X.C18260x0.A1I(r8, r3)     // Catch:{ all -> 0x0f7c }
        L_0x0913:
            long r35 = com.whatsapp.VideoFrameConverter.create()     // Catch:{ all -> 0x0f7c }
            X.5aV r3 = r0.A08     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x0936
            java.util.List r3 = r3.A04     // Catch:{ all -> 0x0f7c }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0f7c }
        L_0x0921:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x093b
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0f7c }
            X.5Uw r3 = (X.C105425Uw) r3     // Catch:{ all -> 0x0f7c }
            boolean r3 = r3.A0T()     // Catch:{ all -> 0x0f7c }
            if (r3 == 0) goto L_0x0921
            r29 = 1
            goto L_0x093b
        L_0x0936:
            r56 = 0
            r55 = 0
            goto L_0x0968
        L_0x093b:
            r4 = r73
            r3 = r74
            android.graphics.Bitmap r55 = X.C86664Kz.A0Y(r4, r3)     // Catch:{ all -> 0x0f7c }
            X.5aV r8 = r0.A08     // Catch:{ all -> 0x0f7c }
            r3 = r76
            int r3 = 360 - r3
            int r4 = r3 % 360
            r3 = r55
            r8.A06(r4, r3)     // Catch:{ all -> 0x0f7c }
            int r4 = r55.getWidth()     // Catch:{ all -> 0x0f7c }
            int r3 = r55.getHeight()     // Catch:{ all -> 0x0f7c }
            int r4 = r4 * r3
            int r3 = r4 * 4
            java.nio.ByteBuffer r56 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x0f7c }
            r9 = r56
            r8 = r55
            r3 = r35
            A07(r8, r9, r3)     // Catch:{ all -> 0x0f7c }
        L_0x0968:
            int r3 = r6.A05     // Catch:{ all -> 0x0f7c }
            r72 = r3
            r3 = 2747(0xabb, float:3.85E-42)
            boolean r62 = r5.A0X(r3)     // Catch:{ Exception -> 0x0f05 }
            r61 = 1000000(0xf4240, float:1.401298E-39)
            if (r62 == 0) goto L_0x0979
            r61 = 1000(0x3e8, float:1.401E-42)
        L_0x0979:
            r0.A03 = r1     // Catch:{ Exception -> 0x0f05 }
            r0.A02 = r1     // Catch:{ Exception -> 0x0f05 }
            r60 = 0
            r6 = 0
            r59 = 0
            r58 = 0
        L_0x0984:
            java.lang.String r57 = " frames:"
            if (r58 != 0) goto L_0x0cea
            boolean r3 = r0.A0R     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0cea
            int r6 = r6 + 1
            r5 = 5
            if (r6 >= r5) goto L_0x099a
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/loop "
            X.C18260x0.A0y(r3, r4, r6)     // Catch:{ Exception -> 0x0f05 }
        L_0x099a:
            if (r59 != 0) goto L_0x0a23
            r3 = r61
            long r3 = (long) r3     // Catch:{ Exception -> 0x0f05 }
            int r8 = r12.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x09ae
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/decoder/dequeue/input "
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x0f05 }
        L_0x09ae:
            if (r8 >= 0) goto L_0x09bd
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/decoder/dequeue/input < 0"
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x0f05 }
            if (r62 != 0) goto L_0x0a23
            goto L_0x0cea
        L_0x09bd:
            r4 = r54[r8]     // Catch:{ Exception -> 0x0f05 }
            r3 = r37
            int r9 = r3.readSampleData(r4, r14)     // Catch:{ Exception -> 0x0f05 }
            if (r9 >= 0) goto L_0x09de
            java.lang.String r3 = "videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
            r69 = 4
            r66 = r14
            r63 = r12
            r64 = r8
            r65 = r14
            r67 = r1
            r63.queueInputBuffer(r64, r65, r66, r67, r69)     // Catch:{ Exception -> 0x0f05 }
            r59 = 1
            goto L_0x0a23
        L_0x09de:
            if (r6 >= r5) goto L_0x09f8
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/extractor/sample size:"
            r10.append(r3)     // Catch:{ Exception -> 0x0f05 }
            r10.append(r9)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = " time:"
            r10.append(r3)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r37.getSampleTime()     // Catch:{ Exception -> 0x0f05 }
            X.C18260x0.A1I(r10, r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x09f8:
            long r67 = r37.getSampleTime()     // Catch:{ Exception -> 0x0f05 }
            r69 = r14
            r63 = r12
            r64 = r8
            r65 = r14
            r66 = r9
            r63.queueInputBuffer(r64, r65, r66, r67, r69)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0a14
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/decoder/queue/input "
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x0f05 }
        L_0x0a14:
            boolean r8 = r37.advance()     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0a23
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/extractor/advance "
            X.C18260x0.A1E(r3, r4, r8)     // Catch:{ Exception -> 0x0f05 }
        L_0x0a23:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r11 = r12.dequeueOutputBuffer(r7, r3)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0a35
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/decoder/dequeue/output "
            X.C18260x0.A0y(r3, r4, r11)     // Catch:{ Exception -> 0x0f05 }
        L_0x0a35:
            java.lang.String r10 = " "
            if (r11 < 0) goto L_0x0bfd
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0f05 }
            long r51 = r26 * r20
            int r8 = (r3 > r51 ? 1 : (r3 == r51 ? 0 : -1))
            if (r8 < 0) goto L_0x0bd7
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r39
            int r8 = r8.dequeueInputBuffer(r3)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0a55
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/encoder/dequeue/input "
            X.C18260x0.A0y(r3, r4, r8)     // Catch:{ Exception -> 0x0f05 }
        L_0x0a55:
            if (r8 < 0) goto L_0x0b92
            r15 = r31[r8]     // Catch:{ Exception -> 0x0f05 }
            r15.clear()     // Catch:{ Exception -> 0x0f05 }
            X.5aV r3 = r0.A08     // Catch:{ Exception -> 0x0f05 }
            if (r3 == 0) goto L_0x0a8f
            if (r29 == 0) goto L_0x0a8f
            java.util.List r3 = r3.A04     // Catch:{ Exception -> 0x0f05 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x0f05 }
        L_0x0a68:
            boolean r3 = r4.hasNext()     // Catch:{ Exception -> 0x0f05 }
            if (r3 == 0) goto L_0x0a72
            r4.next()     // Catch:{ Exception -> 0x0f05 }
            goto L_0x0a68
        L_0x0a72:
            r3 = r55
            r3.eraseColor(r14)     // Catch:{ Exception -> 0x0f05 }
            X.5aV r4 = r0.A08     // Catch:{ Exception -> 0x0f05 }
            r3 = r76
            int r3 = 360 - r3
            int r9 = r3 % 360
            r3 = r55
            r4.A06(r9, r3)     // Catch:{ Exception -> 0x0f05 }
            r56.rewind()     // Catch:{ Exception -> 0x0f05 }
            r13 = r56
            r9 = r3
            r3 = r35
            A07(r9, r13, r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0a8f:
            r9 = r53[r11]     // Catch:{ Exception -> 0x0f05 }
            X.AnonymousClass6C7.A0z(r7, r9)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x0f05 }
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x0a9c
            if (r6 >= r5) goto L_0x0acf
        L_0x0a9c:
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/convert decoderBufferInfo.offset:"
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            int r3 = r7.offset     // Catch:{ Exception -> 0x0f05 }
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = " decoderBufferInfo.size:"
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            int r3 = r7.size     // Catch:{ Exception -> 0x0f05 }
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = " decoderBufferInfo.presentationTimeUs:"
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0f05 }
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = " decoderBufferInfo.flags:"
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            int r3 = r7.flags     // Catch:{ Exception -> 0x0f05 }
            r13.append(r3)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r4 = " encoderFrameSize:"
            r3 = r18
            X.C18260x0.A0y(r4, r13, r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0acf:
            byte[] r3 = r0.A0E     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0ade
            int r3 = r9.remaining()     // Catch:{ Exception -> 0x0f05 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0f05 }
            r9.get(r3)     // Catch:{ Exception -> 0x0f05 }
            r0.A0E = r3     // Catch:{ Exception -> 0x0f05 }
        L_0x0ade:
            r3 = r35
            com.whatsapp.VideoFrameConverter.convertFrame(r3, r9, r15)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x0f05 }
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x0aeb
            if (r6 >= r5) goto L_0x0af0
        L_0x0aeb:
            java.lang.String r3 = "videotranscoder/transcode/converted"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0af0:
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0f05 }
            int r9 = r7.flags     // Catch:{ Exception -> 0x0f05 }
            r63 = r39
            r64 = r8
            r65 = r14
            r66 = r18
            r67 = r3
            r69 = r9
            r63.queueInputBuffer(r64, r65, r66, r67, r69)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x0f05 }
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x0b0b
            if (r6 >= r5) goto L_0x0b10
        L_0x0b0b:
            java.lang.String r3 = "videotranscoder/transcode/encoder/queue/input"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0b10:
            long r3 = r0.A02     // Catch:{ Exception -> 0x0f05 }
            r8 = 1
            long r3 = r3 + r8
            r0.A02 = r3     // Catch:{ Exception -> 0x0f05 }
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0f05 }
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0b21
            long r8 = r3 - r51
            r0.A03 = r8     // Catch:{ Exception -> 0x0f05 }
        L_0x0b21:
            int r8 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0b39
            long r8 = r22 * r20
            int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0b39
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r13 = "videotranscoder/transcode/end time detected "
            X.C18310x6.A1N(r13, r10, r15, r3)     // Catch:{ Exception -> 0x0f05 }
            X.C18260x0.A1I(r15, r8)     // Catch:{ Exception -> 0x0f05 }
            r58 = 1
        L_0x0b39:
            int r3 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b92
            int r3 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0b43
            r51 = 0
        L_0x0b43:
            int r3 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0b4a
            r48 = r24
            goto L_0x0b4c
        L_0x0b4a:
            long r48 = r22 * r20
        L_0x0b4c:
            long r3 = r7.presentationTimeUs     // Catch:{ Exception -> 0x0f05 }
            long r3 = r3 - r51
            r8 = 100
            long r3 = r3 * r8
            long r48 = r48 - r51
            long r3 = r3 / r48
            int r8 = (int) r3     // Catch:{ Exception -> 0x0f05 }
            r3 = r60
            if (r8 == r3) goto L_0x0b92
            X.8oc r3 = r0.A06     // Catch:{ Exception -> 0x0f05 }
            if (r3 == 0) goto L_0x0b92
            boolean r3 = r0.A0R     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0b6d
            X.8oc r3 = r0.A06     // Catch:{ Exception -> 0x0f05 }
            boolean r4 = r3.BZ1(r8)     // Catch:{ Exception -> 0x0f05 }
            r3 = 0
            if (r4 == 0) goto L_0x0b6e
        L_0x0b6d:
            r3 = 1
        L_0x0b6e:
            r0.A0R = r3     // Catch:{ Exception -> 0x0f05 }
            if (r8 < r5) goto L_0x0b76
            int r3 = r8 % 5
            if (r3 != 0) goto L_0x0b90
        L_0x0b76:
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r4 = "videotranscoder/transcode/progress "
            r3 = r57
            X.C18270x1.A19(r4, r3, r9, r8)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r0.A02     // Catch:{ Exception -> 0x0f05 }
            r9.append(r3)     // Catch:{ Exception -> 0x0f05 }
            r3 = r46
            r9.append(r3)     // Catch:{ Exception -> 0x0f05 }
            long r3 = r0.A03     // Catch:{ Exception -> 0x0f05 }
            X.C18260x0.A1I(r9, r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0b90:
            r60 = r8
        L_0x0b92:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r50
            r8 = r39
            int r4 = r8.dequeueOutputBuffer(r9, r3)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0ba8
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/encoder/dequeue/output "
            X.C18260x0.A0y(r3, r8, r4)     // Catch:{ Exception -> 0x0f05 }
        L_0x0ba8:
            if (r4 < 0) goto L_0x0bc1
            r8 = r19[r4]     // Catch:{ Exception -> 0x0f05 }
            X.AnonymousClass6C7.A0z(r9, r8)     // Catch:{ Exception -> 0x0f05 }
            r3 = r28
            r3.write(r8)     // Catch:{ Exception -> 0x0f05 }
            r8.clear()     // Catch:{ Exception -> 0x0f05 }
            r3 = r39
            r3.releaseOutputBuffer(r4, r14)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0bf1
            java.lang.String r3 = "videotranscoder/transcode/encoder/release/output"
            goto L_0x0bee
        L_0x0bc1:
            r3 = -3
            if (r4 != r3) goto L_0x0bc5
            goto L_0x0be8
        L_0x0bc5:
            r3 = -2
            if (r4 != r3) goto L_0x0bf1
            android.media.MediaFormat r8 = r39.getOutputFormat()     // Catch:{ Exception -> 0x0f05 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/encoder output format has changed to "
            java.lang.String r3 = X.AnonymousClass000.A0P(r8, r3, r4)     // Catch:{ Exception -> 0x0f05 }
            goto L_0x0bee
        L_0x0bd7:
            int r30 = r30 + 1
            if (r6 >= r5) goto L_0x0bf1
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r4 = "videotranscoder/transcode/frame skipped "
            r3 = r30
            java.lang.String r3 = X.AnonymousClass000.A0Y(r4, r8, r3)     // Catch:{ Exception -> 0x0f05 }
            goto L_0x0bee
        L_0x0be8:
            java.nio.ByteBuffer[] r19 = r39.getOutputBuffers()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/encoder output buffers have changed"
        L_0x0bee:
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0bf1:
            r12.releaseOutputBuffer(r11, r14)     // Catch:{ Exception -> 0x0f05 }
            if (r6 >= r5) goto L_0x0cdb
            java.lang.String r3 = "videotranscoder/transcode/decoder/release/output"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
            goto L_0x0cdb
        L_0x0bfd:
            r3 = -3
            if (r11 != r3) goto L_0x0c02
            goto L_0x0cd2
        L_0x0c02:
            r3 = -2
            if (r11 != r3) goto L_0x0cbf
            android.media.MediaFormat r5 = r12.getOutputFormat()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r4 = r32.getName()     // Catch:{ Exception -> 0x0f05 }
            X.7n7 r3 = r0.A05     // Catch:{ Exception -> 0x0f05 }
            X.7hY r13 = A03(r5, r3, r4)     // Catch:{ Exception -> 0x0f05 }
            r0.A07 = r13     // Catch:{ Exception -> 0x0f05 }
            int r11 = r13.A00     // Catch:{ Exception -> 0x0f05 }
            int r9 = r13.A09     // Catch:{ Exception -> 0x0f05 }
            int r8 = r13.A06     // Catch:{ Exception -> 0x0f05 }
            int r3 = r13.A02     // Catch:{ Exception -> 0x0f05 }
            r49 = r3
            int r3 = r13.A03     // Catch:{ Exception -> 0x0f05 }
            r48 = r3
            int r3 = r13.A04     // Catch:{ Exception -> 0x0f05 }
            r15 = r3
            int r5 = r13.A01     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r4 = r32.getName()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "OMX.SEC.avc.enc"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            java.lang.String r3 = "OMX.SEC.avc.dec"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            java.lang.String r3 = "OMX.Exynos.AVC.Encoder"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            java.lang.String r3 = "OMX.Intel.VideoEncoder.AVC"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            java.lang.String r3 = "OMX.Intel.VideoDecoder.AVC"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0f05 }
            if (r3 != 0) goto L_0x0c68
            int r3 = r13.A07     // Catch:{ Exception -> 0x0f05 }
            int r8 = java.lang.Math.max(r3, r8)     // Catch:{ Exception -> 0x0f05 }
            int r3 = r13.A08     // Catch:{ Exception -> 0x0f05 }
            int r9 = java.lang.Math.max(r3, r9)     // Catch:{ Exception -> 0x0f05 }
        L_0x0c68:
            int r13 = r13.A05     // Catch:{ Exception -> 0x0f05 }
            r63 = r35
            r65 = r13
            r66 = r9
            r67 = r8
            r68 = r49
            r69 = r15
            r70 = r48
            r71 = r5
            com.whatsapp.VideoFrameConverter.configure(r63, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ Exception -> 0x0f05 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/configure frame converter from:("
            r4.append(r3)     // Catch:{ Exception -> 0x0f05 }
            r4.append(r11)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "["
            r4.append(r3)     // Catch:{ Exception -> 0x0f05 }
            r4.append(r13)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r11 = "] "
            X.AnonymousClass6C7.A1J(r11, r10, r4, r9, r8)     // Catch:{ Exception -> 0x0f05 }
            r4.append(r10)     // Catch:{ Exception -> 0x0f05 }
            r8 = r49
            r4.append(r8)     // Catch:{ Exception -> 0x0f05 }
            r8 = r48
            X.AnonymousClass6C8.A1C(r10, r4, r15, r8)     // Catch:{ Exception -> 0x0f05 }
            r4.append(r10)     // Catch:{ Exception -> 0x0f05 }
            r4.append(r5)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r9 = ") to:("
            r8 = r75
            r5 = r72
            X.AnonymousClass6C7.A1J(r9, r3, r4, r8, r5)     // Catch:{ Exception -> 0x0f05 }
            r5 = r73
            r3 = r74
            X.AnonymousClass6C7.A1J(r11, r10, r4, r5, r3)     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = ")"
            X.C18260x0.A1L(r4, r3)     // Catch:{ Exception -> 0x0f05 }
            goto L_0x0cdb
        L_0x0cbf:
            r3 = -1
            if (r11 != r3) goto L_0x0cdb
            if (r59 == 0) goto L_0x0cdb
            int r3 = r7.flags     // Catch:{ Exception -> 0x0f05 }
            r3 = r3 & 4
            if (r3 != 0) goto L_0x0ccf
            java.lang.String r3 = "videotranscoder/transcode/decoder says try later after extractor finished"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0ccf:
            r58 = 1
            goto L_0x0cdb
        L_0x0cd2:
            java.nio.ByteBuffer[] r53 = r12.getOutputBuffers()     // Catch:{ Exception -> 0x0f05 }
            java.lang.String r3 = "videotranscoder/transcode/decoder output buffers have changed"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
        L_0x0cdb:
            int r3 = r7.flags     // Catch:{ Exception -> 0x0f05 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0984
            java.lang.String r3 = "videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x0f05 }
            r58 = 1
            goto L_0x0984
        L_0x0cea:
            r4 = r40
            r3 = r41
            A09(r12, r4, r3)     // Catch:{ all -> 0x0f7c }
            r5 = r50
            r6 = r28
            r4 = r19
            r3 = r39
            A08(r5, r3, r6, r4)     // Catch:{ all -> 0x0f7c }
            r5 = r42
            r4 = r43
            A09(r3, r5, r4)     // Catch:{ all -> 0x0f7c }
            r37.release()     // Catch:{ all -> 0x0f7c }
            com.whatsapp.util.Log.i((java.lang.String) r45)     // Catch:{ all -> 0x0f7c }
            com.whatsapp.VideoFrameConverter.release(r35)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r3 = "videotranscoder/transcode/done cancelled:"
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0f7c }
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            r3 = r57
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            long r3 = r0.A02     // Catch:{ all -> 0x0f7c }
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            r3 = r44
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0f7c }
            long r3 = r3.length()     // Catch:{ all -> 0x0f7c }
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            r3 = r46
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            long r3 = r0.A03     // Catch:{ all -> 0x0f7c }
            r5.append(r3)     // Catch:{ all -> 0x0f7c }
            java.lang.String r4 = " skipfirstframes:"
            r3 = r30
            X.C18260x0.A0y(r4, r5, r3)     // Catch:{ all -> 0x0f7c }
            if (r28 == 0) goto L_0x0d48
            r28.close()     // Catch:{ all -> 0x0f88 }
        L_0x0d48:
            r38.close()     // Catch:{ all -> 0x0fb2 }
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0fb2 }
            if (r3 != 0) goto L_0x0d5f
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0fb2 }
            long r4 = r3.length()     // Catch:{ all -> 0x0fb2 }
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0eea
            long r3 = r0.A02     // Catch:{ all -> 0x0fb2 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0eea
        L_0x0d5f:
            long r3 = r0.A03     // Catch:{ all -> 0x0fb2 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0d72
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0fb2 }
            long r3 = r0.A02     // Catch:{ all -> 0x0fb2 }
            long r3 = r5.toMicros(r3)     // Catch:{ all -> 0x0fb2 }
            r5 = 30
            long r3 = r3 / r5
            r0.A03 = r3     // Catch:{ all -> 0x0fb2 }
        L_0x0d72:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r3 = "videotranscoder/transcode/finished: size:"
            r5.append(r3)     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0B     // Catch:{ all -> 0x0fb2 }
            long r3 = r3.length()     // Catch:{ all -> 0x0fb2 }
            X.C18260x0.A1I(r5, r3)     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0fb2 }
            if (r3 == 0) goto L_0x0e6f
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0fb2 }
            if (r3 != 0) goto L_0x0df0
            X.2qk r4 = r0.A0J     // Catch:{ all -> 0x0fb2 }
            java.io.File r3 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            X.7nN r6 = X.C162397rz.A06(r4, r3)     // Catch:{ all -> 0x0fb2 }
            int r5 = r6.A01     // Catch:{ all -> 0x0fb2 }
            r4 = 2
            if (r5 == r4) goto L_0x0da0
            r3 = 3
            if (r5 != r3) goto L_0x0db1
        L_0x0da0:
            int r5 = r6.A00     // Catch:{ all -> 0x0fb2 }
            r3 = 4
            if (r5 == r3) goto L_0x0df0
            if (r5 == r4) goto L_0x0df0
            r3 = 1
            if (r5 == r3) goto L_0x0df0
            if (r5 == 0) goto L_0x0df0
            r3 = 8
            if (r5 != r3) goto L_0x0db1
            goto L_0x0df0
        L_0x0db1:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 6ph -> 0x0de9 }
            java.io.File r3 = r77.getAbsoluteFile()     // Catch:{ 6ph -> 0x0de9 }
            r4.append(r3)     // Catch:{ 6ph -> 0x0de9 }
            java.lang.String r3 = ".aac"
            java.io.File r4 = X.AnonymousClass6C7.A0S(r3, r4)     // Catch:{ 6ph -> 0x0de9 }
            r0.A09 = r4     // Catch:{ 6ph -> 0x0de9 }
            java.io.File r3 = r0.A0A     // Catch:{ 6ph -> 0x0de9 }
            X.7Nu r5 = new X.7Nu     // Catch:{ 6ph -> 0x0de9 }
            r5.<init>(r3, r4)     // Catch:{ 6ph -> 0x0de9 }
            r3 = r26
            r5.A01 = r3     // Catch:{ 6ph -> 0x0de9 }
            r3 = r22
            r5.A02 = r3     // Catch:{ 6ph -> 0x0de9 }
            r3 = 96000(0x17700, float:1.34525E-40)
            r5.A00 = r3     // Catch:{ 6ph -> 0x0de9 }
            X.8HS r6 = new X.8HS     // Catch:{ 6ph -> 0x0de9 }
            r6.<init>(r5)     // Catch:{ 6ph -> 0x0de9 }
            r4 = 3
            X.92O r3 = new X.92O     // Catch:{ 6ph -> 0x0de9 }
            r3.<init>(r0, r4)     // Catch:{ 6ph -> 0x0de9 }
            r6.A01 = r3     // Catch:{ 6ph -> 0x0de9 }
            r6.A01()     // Catch:{ 6ph -> 0x0de9 }
            goto L_0x0df0
        L_0x0de9:
            X.6pi r5 = new X.6pi     // Catch:{ all -> 0x0fb2 }
            r5.<init>()     // Catch:{ all -> 0x0fb2 }
            goto L_0x0ee9
        L_0x0df0:
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0fb2 }
            if (r3 != 0) goto L_0x0e5b
            long r5 = r0.A03     // Catch:{ 6z0 -> 0x0e44 }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0e00
            long r3 = r0.A02     // Catch:{ 6z0 -> 0x0e44 }
            long r16 = r3 * r33
            long r16 = r16 / r5
        L_0x0e00:
            java.io.File r3 = r0.A09     // Catch:{ 6z0 -> 0x0e44 }
            if (r3 == 0) goto L_0x0e3f
            boolean r3 = r3.exists()     // Catch:{ 6z0 -> 0x0e44 }
            if (r3 == 0) goto L_0x0e3d
            java.io.File r9 = r0.A09     // Catch:{ 6z0 -> 0x0e44 }
        L_0x0e0c:
            java.io.File r4 = r0.A0A     // Catch:{ 6z0 -> 0x0e44 }
            X.5Qm r3 = new X.5Qm     // Catch:{ 6z0 -> 0x0e44 }
            r3.<init>(r4)     // Catch:{ 6z0 -> 0x0e44 }
            int r8 = r3.A02     // Catch:{ 6z0 -> 0x0e44 }
            X.7bG r7 = r0.A0L     // Catch:{ 6z0 -> 0x0e44 }
            java.io.File r6 = r0.A0B     // Catch:{ 6z0 -> 0x0e44 }
            java.io.File r5 = r0.A0A     // Catch:{ 6z0 -> 0x0e44 }
            long r3 = r0.A03     // Catch:{ 6z0 -> 0x0e44 }
            long r3 = r3 / r20
            r28 = r7
            r29 = r77
            r30 = r9
            r31 = r6
            r32 = r5
            r33 = r8
            r34 = r1
            r36 = r16
            r38 = r3
            r40 = r26
            com.whatsapp.Mp4Ops.A03(r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)     // Catch:{ 6z0 -> 0x0e44 }
            r2 = 1
            r1 = r77
            com.whatsapp.Mp4Ops.A04(r7, r1, r2)     // Catch:{ 6z0 -> 0x0e44 }
            goto L_0x0e5b
        L_0x0e3d:
            r9 = 0
            goto L_0x0e0c
        L_0x0e3f:
            java.io.File r9 = r0.A0A     // Catch:{ 6z0 -> 0x0e44 }
            r1 = r26
            goto L_0x0e0c
        L_0x0e44:
            r5 = move-exception
            r1 = r47
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x0fb2 }
            X.2oU r1 = r0.A0M     // Catch:{ all -> 0x0fb2 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0fb2 }
            X.2qk r2 = r0.A0J     // Catch:{ all -> 0x0fb2 }
            X.7bG r3 = r0.A0L     // Catch:{ all -> 0x0fb2 }
            java.io.File r4 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            java.lang.String r6 = "mux"
            com.whatsapp.Mp4Ops.A00(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0ee9
        L_0x0e5b:
            java.io.File r1 = r0.A0B
            X.C627536m.A0O(r1)
            java.io.File r1 = r0.A09
            if (r1 == 0) goto L_0x0e67
            X.C627536m.A0O(r1)
        L_0x0e67:
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0e6e
            X.C627536m.A0O(r77)
        L_0x0e6e:
            return
        L_0x0e6f:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "videotranscoder/transcode/input file disappeared, "
            r8.append(r1)     // Catch:{ all -> 0x0fb2 }
            java.io.File r7 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "file_path="
            X.AnonymousClass000.A10(r7, r1, r6)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r5 = ", "
            r6.append(r5)     // Catch:{ all -> 0x0fb2 }
            boolean r4 = r7.exists()     // Catch:{ all -> 0x0fb2 }
            boolean r3 = r7.canRead()     // Catch:{ all -> 0x0fb2 }
            boolean r2 = r7.canWrite()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "exists="
            r6.append(r1)     // Catch:{ all -> 0x0fb2 }
            r6.append(r4)     // Catch:{ all -> 0x0fb2 }
            r6.append(r5)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "canRead="
            r6.append(r1)     // Catch:{ all -> 0x0fb2 }
            r6.append(r3)     // Catch:{ all -> 0x0fb2 }
            r6.append(r5)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "canWrite="
            r6.append(r1)     // Catch:{ all -> 0x0fb2 }
            r6.append(r2)     // Catch:{ all -> 0x0fb2 }
            r6.append(r5)     // Catch:{ all -> 0x0fb2 }
            if (r4 == 0) goto L_0x0ec6
            java.lang.String r1 = "length="
            r6.append(r1)     // Catch:{ all -> 0x0fb2 }
            long r1 = r7.length()     // Catch:{ all -> 0x0fb2 }
            r6.append(r1)     // Catch:{ all -> 0x0fb2 }
            r6.append(r5)     // Catch:{ all -> 0x0fb2 }
        L_0x0ec6:
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0fb2 }
            X.C18260x0.A1K(r8, r1)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "input file missing after transcode"
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0fb2 }
            r5.<init>(r1)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0ee9
        L_0x0ed5:
            r1 = r47
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x0fb2 }
            X.2oU r1 = r0.A0M     // Catch:{ all -> 0x0fb2 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0fb2 }
            X.2qk r2 = r0.A0J     // Catch:{ all -> 0x0fb2 }
            X.7bG r3 = r0.A0L     // Catch:{ all -> 0x0fb2 }
            java.io.File r4 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            java.lang.String r6 = "mux"
            com.whatsapp.Mp4Ops.A00(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0fb2 }
        L_0x0ee9:
            throw r5     // Catch:{ all -> 0x0fb2 }
        L_0x0eea:
            X.2oU r1 = r0.A0M     // Catch:{ all -> 0x0fb2 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0fb2 }
            X.2qk r2 = r0.A0J     // Catch:{ all -> 0x0fb2 }
            X.7bG r3 = r0.A0L     // Catch:{ all -> 0x0fb2 }
            java.io.File r4 = r0.A0A     // Catch:{ all -> 0x0fb2 }
            X.6pi r5 = new X.6pi     // Catch:{ all -> 0x0fb2 }
            r5.<init>()     // Catch:{ all -> 0x0fb2 }
            java.lang.String r6 = "video transcode"
            com.whatsapp.Mp4Ops.A00(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0fb2 }
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0fb2 }
            r2.<init>()     // Catch:{ all -> 0x0fb2 }
            goto L_0x0fb1
        L_0x0f05:
            r2 = move-exception
            java.lang.String r1 = "videotranscoder/transcode"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0f0c }
            throw r2     // Catch:{ all -> 0x0f0c }
        L_0x0f0c:
            r5 = move-exception
            r2 = r40
            r1 = r41
            A09(r12, r2, r1)     // Catch:{ all -> 0x0f7c }
            r4 = r50
            r3 = r28
            r2 = r19
            r1 = r39
            A08(r4, r1, r3, r2)     // Catch:{ all -> 0x0f7c }
            r3 = r42
            r2 = r43
            A09(r1, r3, r2)     // Catch:{ all -> 0x0f7c }
            r37.release()     // Catch:{ all -> 0x0f7c }
            com.whatsapp.util.Log.i((java.lang.String) r45)     // Catch:{ all -> 0x0f7c }
            com.whatsapp.VideoFrameConverter.release(r35)     // Catch:{ all -> 0x0f7c }
            throw r5     // Catch:{ all -> 0x0f7c }
        L_0x0f30:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            X.C18260x0.A0r(r9, r8, r1)     // Catch:{ all -> 0x0f7c }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r1 = "Can't create decoder for "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r8, r2)     // Catch:{ all -> 0x0f7c }
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0f7c }
            r2.<init>(r1)     // Catch:{ all -> 0x0f7c }
            goto L_0x0f7b
        L_0x0f47:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r8)     // Catch:{ all -> 0x0f7c }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0f7c }
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0f7c }
            r2.<init>()     // Catch:{ all -> 0x0f7c }
            goto L_0x0f7b
        L_0x0f55:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            java.lang.String r1 = "videotranscoder/transcode/mime "
            X.C18260x0.A0r(r1, r8, r2)     // Catch:{ all -> 0x0f7c }
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0f7c }
            r2.<init>()     // Catch:{ all -> 0x0f7c }
            goto L_0x0f7b
        L_0x0f64:
            java.lang.String r1 = "videotranscoder/transcode/not a video file"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0f7c }
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0f7c }
            r2.<init>()     // Catch:{ all -> 0x0f7c }
            goto L_0x0f7b
        L_0x0f6f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f7c }
            X.C18260x0.A0r(r9, r8, r1)     // Catch:{ all -> 0x0f7c }
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0f7c }
            r2.<init>()     // Catch:{ all -> 0x0f7c }
        L_0x0f7b:
            throw r2     // Catch:{ all -> 0x0f7c }
        L_0x0f7c:
            r2 = move-exception
            if (r28 == 0) goto L_0x0f87
            r28.close()     // Catch:{ all -> 0x0f83 }
            goto L_0x0f87
        L_0x0f83:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0f88 }
        L_0x0f87:
            throw r2     // Catch:{ all -> 0x0f88 }
        L_0x0f88:
            r2 = move-exception
            r38.close()     // Catch:{ all -> 0x0f8d }
            goto L_0x0fb1
        L_0x0f8d:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0fb1
        L_0x0f92:
            java.lang.String r1 = "videotranscoder/transcode/no known color formats suported"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "No known color formats suported"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0fb2 }
            r2.<init>(r1)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0fb1
        L_0x0f9f:
            java.lang.String r1 = "videotranscoder/transcode/no codec supporting video/avc"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fb2 }
            java.lang.String r1 = "No codec supporting video/avc"
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0fb2 }
            r2.<init>(r1)     // Catch:{ all -> 0x0fb2 }
            goto L_0x0fb1
        L_0x0fac:
            X.6pi r2 = new X.6pi     // Catch:{ all -> 0x0fb2 }
            r2.<init>()     // Catch:{ all -> 0x0fb2 }
        L_0x0fb1:
            throw r2     // Catch:{ all -> 0x0fb2 }
        L_0x0fb2:
            r2 = move-exception
            java.io.File r1 = r0.A0B
            X.C627536m.A0O(r1)
            java.io.File r0 = r0.A09
            if (r0 == 0) goto L_0x0fbf
            X.C627536m.A0O(r0)
        L_0x0fbf:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HT.A0H():void");
    }

    public void A0I() {
        Throwable th;
        try {
            C153407bG r7 = this.A0L;
            File file = this.A0A;
            File file2 = this.A0Q;
            long j = this.A0H;
            long j2 = this.A0I;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mp4ops/trim/start from ");
            A0o.append(j);
            A0o.append(" to ");
            A0o.append(j2);
            A0o.append(" size:");
            C18260x0.A1I(A0o, file.length());
            if ((j > 0 || j2 > 0) && j != j2) {
                float f = ((float) j) / 1000.0f;
                float f2 = ((float) (j2 - j)) / 1000.0f;
                C134206ic A022 = r7.A02(file, file);
                try {
                    Mp4Ops.LibMp4OperationResult mp4mux = Mp4Ops.mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, f, f2, -1.0f, -1, file.getAbsolutePath(), f);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("mp4ops/trim/result: ");
                    C18260x0.A1V(A0o2, mp4mux.success);
                    C153407bG.A00(mp4mux, r7, A022, file2);
                    if (!mp4mux.success) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("mp4ops/trim/error_message/");
                        C18260x0.A1K(A0o3, mp4mux.errorMessage);
                        if (mp4mux.ioException) {
                            th = AnonymousClass002.A0C("No space");
                        } else {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("invalid result, error_code: ");
                            int i = mp4mux.errorCode;
                            th = new AnonymousClass6z0(i, AnonymousClass000.A0h(A0o4, i));
                        }
                    } else {
                        Log.i("mp4ops/trim/finished: size");
                        Mp4Ops.A04(r7, file2, true);
                        return;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/trim/failed: mp4mux error, exiting", e);
                    th = new AnonymousClass6z0(0, e.getMessage());
                }
            } else {
                StringBuilder A0o5 = AnonymousClass001.A0o();
                A0o5.append("timeFrom:");
                A0o5.append(j);
                th = AnonymousClass6C7.A0V(" timeTo:", A0o5, j2);
            }
            throw th;
        } catch (AnonymousClass6z0 e2) {
            Log.e("videotranscodequeue/libmp4muxexception", e2);
            Mp4Ops.A00(this.A0M.A00, this.A0J, this.A0L, this.A0A, e2, "trim");
            throw e2;
        }
    }

    public boolean BFR() {
        return AnonymousClass000.A1W(this.A0B);
    }

    public AnonymousClass8HT(C55682qk r9, Mp4Ops mp4Ops, C153407bG r11, C54292oU r12, AnonymousClass1VX r13, C162287rd r14, AnonymousClass4FS r15, File file, File file2, int i, int i2, long j, long j2) {
        this.A0M = r12;
        this.A0P = r15;
        this.A0K = mp4Ops;
        this.A0N = r13;
        this.A0J = r9;
        this.A0O = r14;
        this.A0L = r11;
        this.A0A = file;
        this.A0Q = file2;
        long j3 = j;
        this.A0H = j3;
        long j4 = j2;
        this.A0I = j4;
        this.A0G = i;
        this.A0F = i2;
        if (j2 > 0 && j == j2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("timeFrom:");
            A0o.append(j3);
            throw AnonymousClass6C7.A0V(" timeTo:", A0o, j4);
        }
    }

    public static int A01(int i) {
        switch (i) {
            case 11:
                return 7;
            case 21:
            case 39:
            case 2130706688:
            case 2141391873:
            case 2141391876:
                return 3;
            case 2130706433:
                return 6;
            case 2130706944:
                return 2;
            case 2141391872:
                return 4;
            case 2141391875:
                return 5;
            default:
                return 1;
        }
    }

    public static C156997hY A03(MediaFormat mediaFormat, C160147n7 r4, String str) {
        int i;
        String str2;
        int i2;
        C18260x0.A1R(AnonymousClass001.A0o(), "videotranscoder/transcode/getDecoderFormat output format has changed to ", mediaFormat);
        C156997hY r2 = new C156997hY();
        r2.A0A = str;
        r2.A00 = mediaFormat.getInteger("color-format");
        r2.A09 = mediaFormat.getInteger("width");
        r2.A06 = mediaFormat.getInteger("height");
        try {
            r2.A02 = mediaFormat.getInteger("crop-left");
        } catch (Exception unused) {
        }
        try {
            r2.A03 = mediaFormat.getInteger("crop-right");
        } catch (Exception unused2) {
        }
        try {
            r2.A04 = mediaFormat.getInteger("crop-top");
        } catch (Exception unused3) {
        }
        try {
            r2.A01 = mediaFormat.getInteger("crop-bottom");
        } catch (Exception unused4) {
        }
        try {
            r2.A07 = mediaFormat.getInteger("slice-height");
        } catch (Exception unused5) {
        }
        if (str.startsWith("OMX.Nvidia.")) {
            r2.A07 = ((r2.A06 + 16) - 1) & (~15);
        } else if (str.equalsIgnoreCase("OMX.SEC.avc.dec")) {
            r2.A07 = r2.A06;
            r2.A08 = r2.A09;
        }
        try {
            r2.A08 = mediaFormat.getInteger("stride");
        } catch (Exception unused6) {
        }
        A0C(str);
        if (r4 != null) {
            int i3 = r2.A00;
            String str3 = r4.A04;
            if (str3 != null && i3 > 0 && (i2 = r4.A00) > 0 && str3.equals(str) && i2 == i3) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("videotranscoder/parseDecoderFormat/forcing frame convert color id=");
                i = r4.A02;
                str2 = AnonymousClass000.A0h(A0o, i);
                Log.i(str2);
                r2.A05 = i;
                return r2;
            }
        }
        int i4 = r2.A00;
        r2.A05 = A01(i4);
        i = 3;
        if (i4 != 25) {
            if (i4 != 2141391876) {
                if (i4 == 2130706433 && (A05() == null || !AnonymousClass0x9.A0z(A05()).startsWith("mt6589"))) {
                    r2.A05 = 1;
                    return r2;
                }
            }
            r2.A05 = i;
        } else if ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str)) {
            str2 = "videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12";
            Log.i(str2);
            r2.A05 = i;
        }
        return r2;
    }

    public static final void A08(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, ByteBuffer[] byteBufferArr) {
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, SearchActionVerificationClientService.MS_TO_NS);
            if (dequeueOutputBuffer >= 0) {
                C18260x0.A0y("videotranscoder/transcode/encoder draining ", AnonymousClass001.A0o(), dequeueOutputBuffer);
                ByteBuffer byteBuffer = byteBufferArr[dequeueOutputBuffer];
                AnonymousClass6C7.A0z(bufferInfo, byteBuffer);
                writableByteChannel.write(byteBuffer);
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                Log.i("videotranscoder/transcode/encoder drained");
                return;
            }
        }
    }

    public static void A09(MediaCodec mediaCodec, String str, String str2) {
        mediaCodec.stop();
        Log.i(str);
        mediaCodec.release();
        Log.i(str2);
    }

    public static void A0A(C180608lL r6, C180608lL r7, C142366x5 r8, C153537bV r9, HashMap hashMap) {
        C151307Uf B2y;
        HashMap A022 = r9.A02(r8);
        if (A022 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            hashMap.put(r8, A0t);
            Iterator A0u = AnonymousClass001.A0u(A022);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                ArrayList A0s = AnonymousClass001.A0s();
                A0t.put(A0w.getKey(), A0s);
                Iterator A0u2 = AnonymousClass6C7.A0u(((C153007aW) A0w.getValue()).A02);
                while (A0u2.hasNext()) {
                    C153257aw r1 = (C153257aw) A0u2.next();
                    File file = r1.A02;
                    boolean A012 = r1.A01();
                    Uri fromFile = Uri.fromFile(file);
                    if (A012) {
                        B2y = r6.B2y(fromFile);
                    } else {
                        B2y = r7.B2y(fromFile);
                    }
                    A0s.add(B2y);
                }
            }
        }
    }
}
