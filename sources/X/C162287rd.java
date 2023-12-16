package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7rd  reason: invalid class name and case insensitive filesystem */
public class C162287rd {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C620633i A02;
    public final AnonymousClass1VX A03;
    public final C60132y3 A04;
    public final C60152y5 A05;
    public final C162397rz A06;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r14.isEmpty() != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r7 == 270) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C158247jf A0B(X.C151307Uf r25, X.C141046uw r26) {
        /*
            r24 = this;
            r6 = 1
            r9 = 0
            r5 = r26
            int r2 = r5.ordinal()
            r0 = 0
            r1 = 2
            if (r2 == r0) goto L_0x035e
            if (r2 == r6) goto L_0x0357
            r0 = 3
            int[] r3 = new int[r1]
            if (r2 == r0) goto L_0x0352
            r3 = {720, 1280} // fill-array
        L_0x0016:
            X.7ff r1 = X.C155877ff.A01
            r4 = 1
            r2 = r3[r6]
            r0 = 0
            r0 = r3[r0]
            int r8 = java.lang.Math.max(r2, r0)
            r1.A00 = r8
            r0 = r25
            int r7 = r0.A04
            int r3 = r7 % 180
            if (r3 != 0) goto L_0x002d
            r4 = 0
        L_0x002d:
            X.7jf r2 = new X.7jf
            r2.<init>()
            int r10 = r0.A05
            r2.A07 = r10
            int r6 = r0.A03
            r2.A05 = r6
            r2.A06 = r7
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (int) r0
            r2.A01 = r0
            r0 = 10
            r2.A02 = r0
            r2.A0G = r9
            if (r3 == 0) goto L_0x0348
            if (r4 == 0) goto L_0x0348
            r2.A0A = r6
            r4 = r6
            r2.A08 = r10
            r3 = r10
            r0 = 0
            r2.A09 = r0
        L_0x0054:
            int r9 = X.AnonymousClass6C9.A0B(r10, r6, r8)
            float r4 = (float) r4
            float r0 = (float) r3
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x033e
            r2.A0A = r9
            float r0 = (float) r9
            float r0 = r0 / r4
            int r3 = (int) r0
            r2.A08 = r3
        L_0x0068:
            r8 = r9
            int r0 = r9 % 16
            if (r0 == 0) goto L_0x0071
            int r0 = 16 - r0
            int r8 = r9 + r0
        L_0x0071:
            float r4 = (float) r3
            float r3 = (float) r8
            float r0 = (float) r9
            float r3 = r3 / r0
            float r4 = r4 * r3
            int r3 = (int) r4
            r2.A08 = r3
            r2.A0A = r8
            int r0 = r3 % 16
            if (r0 == 0) goto L_0x0082
            int r0 = 16 - r0
            int r3 = r3 + r0
        L_0x0082:
            r2.A08 = r3
            X.6uw r0 = X.C141046uw.Quality360p
            if (r5 == r0) goto L_0x008c
            X.6uw r0 = X.C141046uw.Quality480p
            if (r5 != r0) goto L_0x0432
        L_0x008c:
            r0 = r24
            X.1VX r3 = r0.A03
            r0 = 6390(0x18f6, float:8.954E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 != 0) goto L_0x00a0
            r0 = 6407(0x1907, float:8.978E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0432
        L_0x00a0:
            int r12 = r2.A04
            android.graphics.RectF r3 = r2.A0C
            X.6wy r0 = r2.A0D
            r23 = r0
            X.7YY r0 = r2.A0E
            r22 = r0
            int r0 = r2.A0B
            r21 = r0
            boolean r0 = r2.A0H
            r20 = r0
            int r15 = r2.A02
            java.util.List r14 = r2.A0G
            if (r14 == 0) goto L_0x00c2
            boolean r0 = r14.isEmpty()
            r17 = 1
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r17 = 0
        L_0x00c4:
            r0 = 90
            if (r7 == r0) goto L_0x00ce
            r2 = 270(0x10e, float:3.78E-43)
            r0 = r10
            r4 = r6
            if (r7 != r2) goto L_0x00d0
        L_0x00ce:
            r0 = r6
            r4 = r10
        L_0x00d0:
            float r5 = (float) r0
            float r0 = r3.width()
            float r2 = r5 * r0
            float r4 = (float) r4
            float r0 = r3.height()
            float r13 = r4 * r0
            int r9 = (int) r2
            int r8 = (int) r13
            if (r9 <= r8) goto L_0x0333
            int r0 = r1.A00
            if (r9 <= r0) goto L_0x0333
            int r8 = r8 * r0
            int r8 = r8 / r9
            r9 = r0
        L_0x00e9:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x032f
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x032f
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            int r19 = r0.getWidthAlignment()
        L_0x00fd:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x032b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x032b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            int r18 = r0.getHeightAlignment()
        L_0x0111:
            float r11 = (float) r9
            float r16 = r11 / r2
            float r2 = (float) r8
            float r13 = r2 / r13
            float r1 = r3.left
            float r0 = r3.top
            float r16 = r16 * r5
            float r11 = r11 / r16
            float r11 = r11 + r1
            float r13 = r13 * r4
            float r2 = r2 / r13
            float r2 = r2 + r0
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r1, r0, r11, r2)
            r11 = 0
            if (r17 == 0) goto L_0x0133
            int r0 = r12 % 180
            if (r0 == 0) goto L_0x0132
            r0 = r8
            r8 = r9
            r9 = r0
        L_0x0132:
            int r11 = -r12
        L_0x0133:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x0319
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x0319
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r17 = r0.getSupportedWidths()
        L_0x0147:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x0307
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x0307
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r16 = r0.getSupportedHeights()
        L_0x015b:
            X.7jf r5 = new X.7jf
            r5.<init>()
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getCorrectedResolution: Input targetWidth="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " targetHeight = "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)
            r4.append(r0)
            if (r8 == 0) goto L_0x017d
            if (r9 != 0) goto L_0x0186
        L_0x017d:
            java.lang.String r0 = "getCorrectedResolution-1"
            r4.append(r0)
            r8 = 1280(0x500, float:1.794E-42)
            r9 = 720(0x2d0, float:1.009E-42)
        L_0x0186:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x018f
            A07(r8, r9)
        L_0x018f:
            r1 = r9
            r2 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x019e
            int r1 = r19 - r0
            int r1 = r1 + r9
            float r3 = (float) r8
            float r2 = (float) r1
            float r0 = (float) r9
            float r2 = r2 / r0
            float r3 = r3 * r2
            int r2 = (int) r3
        L_0x019e:
            int r0 = r2 % r18
            if (r0 == 0) goto L_0x01a5
            int r0 = r18 - r0
            int r2 = r2 + r0
        L_0x01a5:
            android.util.Pair r2 = X.C86604Kt.A0C(r1, r2)
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x01ca
            int r1 = X.C18280x3.A03(r2)
            int r0 = X.C18290x4.A03(r2)
            boolean r0 = A07(r1, r0)
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "getCorrectedResolution-3"
            r4.append(r0)
            int r9 = X.C18280x3.A03(r2)
            int r8 = X.C18290x4.A03(r2)
        L_0x01ca:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x01db
            int r1 = X.C18290x4.A03(r2)
            int r0 = X.C18280x3.A03(r2)
            A07(r1, r0)
        L_0x01db:
            r2 = r9
            r1 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x01e9
            int r2 = r9 - r0
            float r3 = (float) r8
            float r1 = (float) r2
            float r0 = (float) r9
            float r1 = r1 / r0
            float r3 = r3 * r1
            int r1 = (int) r3
        L_0x01e9:
            int r0 = r1 % r18
            if (r0 == 0) goto L_0x01ee
            int r1 = r1 - r0
        L_0x01ee:
            android.util.Pair r2 = X.C86604Kt.A0C(r2, r1)
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0213
            int r1 = X.C18280x3.A03(r2)
            int r0 = X.C18290x4.A03(r2)
            boolean r0 = A07(r1, r0)
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = "getCorrectedResolution-5"
            r4.append(r0)
            int r9 = X.C18280x3.A03(r2)
            int r8 = X.C18290x4.A03(r2)
        L_0x0213:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0224
            int r1 = X.C18290x4.A03(r2)
            int r0 = X.C18280x3.A03(r2)
            A07(r1, r0)
        L_0x0224:
            r16.getUpper()
            r17.getUpper()
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0265
            int r0 = X.AnonymousClass6C7.A05(r16)
            if (r8 <= r0) goto L_0x0265
            java.lang.String r0 = "getCorrectedResolution-9"
            r4.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            int r8 = X.AnonymousClass6C7.A05(r16)
            int r0 = X.AnonymousClass6C7.A05(r16)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            int r1 = r1 / r19
            int r1 = r1 * r19
            android.util.Range r0 = A05(r8)
            int r0 = X.AnonymousClass6C8.A0C(r0)
            int r1 = java.lang.Math.max(r1, r0)
            android.util.Range r0 = A05(r8)
            int r0 = X.AnonymousClass6C7.A05(r0)
            int r9 = java.lang.Math.min(r1, r0)
        L_0x0265:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0288
            int r0 = X.AnonymousClass6C7.A05(r17)
            if (r9 <= r0) goto L_0x0288
            java.lang.String r0 = "getCorrectedResolution-10"
            r4.append(r0)
            double r0 = (double) r8
            double r2 = (double) r9
            double r0 = r0 / r2
            int r9 = X.AnonymousClass6C7.A05(r17)
            int r2 = X.AnonymousClass6C7.A05(r17)
            double r2 = (double) r2
            double r0 = r0 * r2
            int r8 = (int) r0
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x0288:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x02ab
            int r0 = X.AnonymousClass6C8.A0C(r16)
            if (r8 >= r0) goto L_0x02ab
            java.lang.String r0 = "getCorrectedResolution-11"
            r4.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            int r8 = X.AnonymousClass6C8.A0C(r16)
            int r0 = X.AnonymousClass6C8.A0C(r16)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r9 = (int) r2
            int r9 = r9 / r19
            int r9 = r9 * r19
        L_0x02ab:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x02ce
            int r0 = X.AnonymousClass6C8.A0C(r17)
            if (r9 >= r0) goto L_0x02ce
            java.lang.String r0 = "getCorrectedResolution-12"
            r4.append(r0)
            double r2 = (double) r8
            double r0 = (double) r9
            double r2 = r2 / r0
            int r9 = X.AnonymousClass6C8.A0C(r17)
            int r0 = X.AnonymousClass6C8.A0C(r17)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r8 = (int) r2
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x02ce:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0365
            java.lang.String r0 = "getCorrectedResolution-13"
            r4.append(r0)
            int r9 = X.AnonymousClass6C7.A05(r17)
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x02f6
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x02f6
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r0 = r0.getSupportedHeightsFor(r9)
        L_0x02f1:
            int r8 = X.AnonymousClass6C7.A05(r0)
            goto L_0x0365
        L_0x02f6:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r0 = android.util.Range.create(r1, r0)
            goto L_0x02f1
        L_0x0307:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r16 = android.util.Range.create(r1, r0)
            goto L_0x015b
        L_0x0319:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r17 = android.util.Range.create(r1, r0)
            goto L_0x0147
        L_0x032b:
            r18 = 16
            goto L_0x0111
        L_0x032f:
            r19 = 16
            goto L_0x00fd
        L_0x0333:
            if (r8 <= r9) goto L_0x00e9
            int r0 = r1.A00
            if (r8 <= r0) goto L_0x00e9
            int r9 = r9 * r0
            int r9 = r9 / r8
            r8 = r0
            goto L_0x00e9
        L_0x033e:
            r2.A08 = r9
            r3 = r9
            float r0 = (float) r9
            float r0 = r0 * r4
            int r9 = (int) r0
            r2.A0A = r9
            goto L_0x0068
        L_0x0348:
            r2.A0A = r10
            r4 = r10
            r2.A08 = r6
            r3 = r6
            r2.A09 = r7
            goto L_0x0054
        L_0x0352:
            r3 = {1080, 1920} // fill-array
            goto L_0x0016
        L_0x0357:
            int[] r3 = new int[r1]
            r3 = {480, 848} // fill-array
            goto L_0x0016
        L_0x035e:
            int[] r3 = new int[r1]
            r3 = {360, 640} // fill-array
            goto L_0x0016
        L_0x0365:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x03dc }
            java.lang.String r0 = "getSupportedFrameRatesFor ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()     // Catch:{ IllegalArgumentException -> 0x03dc }
            if (r1 == 0) goto L_0x03cd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x03dc }
            if (r0 == 0) goto L_0x03cd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.util.Range r0 = r0.getSupportedFrameRatesFor(r9, r8)     // Catch:{ IllegalArgumentException -> 0x03dc }
        L_0x0382:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            X.AnonymousClass000.A1B(r2, r4)     // Catch:{ IllegalArgumentException -> 0x03dc }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x03dc }
            java.lang.String r0 = "getBitrateRange ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()     // Catch:{ IllegalArgumentException -> 0x03dc }
            if (r1 == 0) goto L_0x03bd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x03dc }
            if (r0 == 0) goto L_0x03bd
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.util.Range r0 = r0.getBitrateRange()     // Catch:{ IllegalArgumentException -> 0x03dc }
        L_0x03a5:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            X.AnonymousClass000.A1B(r2, r4)     // Catch:{ IllegalArgumentException -> 0x03dc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x03dc }
            java.lang.String r0 = "mediaTranscodeParams.targetRotationDegreesClockwise = "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            int r0 = r5.A09     // Catch:{ IllegalArgumentException -> 0x03dc }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            X.AnonymousClass000.A1B(r1, r4)     // Catch:{ IllegalArgumentException -> 0x03dc }
            goto L_0x03ea
        L_0x03bd:
            java.lang.Integer r1 = X.C18290x4.A0Z()     // Catch:{ IllegalArgumentException -> 0x03dc }
            r0 = 500000(0x7a120, float:7.00649E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            goto L_0x03a5
        L_0x03cd:
            java.lang.Double r1 = X.AnonymousClass6C8.A0Z()     // Catch:{ IllegalArgumentException -> 0x03dc }
            r16 = 4629137466983448576(0x403e000000000000, double:30.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r16)     // Catch:{ IllegalArgumentException -> 0x03dc }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03dc }
            goto L_0x0382
        L_0x03dc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception = "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            r4.append(r0)
        L_0x03ea:
            r5.A0A = r9
            r5.A08 = r8
            java.lang.String r2 = r4.toString()
            r5.A0F = r2
            int r0 = r5.A09
            int r11 = r11 + r0
            X.7jf r1 = new X.7jf
            r1.<init>()
            r1.A05 = r6
            r1.A07 = r10
            r1.A06 = r7
            r1.A04 = r12
            r0 = 0
            r1.A0J = r0
            r1.A09 = r11
            r1.A08 = r8
            r1.A0A = r9
            r1.A0C = r13
            r0 = r23
            r1.A0D = r0
            r0 = 655360(0xa0000, float:9.18355E-40)
            r1.A00 = r0
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = java.lang.Math.round(r0)
            r1.A01 = r0
            r1.A02 = r15
            r0 = r22
            r1.A0E = r0
            r1.A0G = r14
            r0 = r21
            r1.A0B = r0
            r1.A0F = r2
            r0 = r20
            r1.A0H = r0
            return r1
        L_0x0432:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162287rd.A0B(X.7Uf, X.6uw):X.7jf");
    }

    public boolean A0H(C633138t r4, File file) {
        if (file != null) {
            try {
                if (AnonymousClass36O.A08(r4)) {
                    if (C162397rz.A06(this.A00, file).A01 != 0) {
                        return true;
                    }
                } else if ((C633138t.A05 == r4 || C633138t.A0J == r4 || C633138t.A0O == r4 || C633138t.A0S == r4) && C162397rz.A06(this.A00, file).A01 == 2) {
                    return true;
                }
            } catch (IOException e) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e);
                return false;
            }
        }
        return false;
    }

    public boolean A0I(C633138t r9, File file) {
        int i;
        try {
            if (!AnonymousClass36O.A08(r9)) {
                return false;
            }
            AnonymousClass1VX r2 = this.A03;
            if (r9 == C633138t.A0V) {
                i = 4155;
            } else {
                i = 3656;
                if (AnonymousClass36O.A07(r9)) {
                    i = 3185;
                }
            }
            if (file.length() > ((long) r2.A0N(i)) * 1048576) {
                return true;
            }
            if (AnonymousClass8HT.A02(r2.A0X(422)) == 1) {
                try {
                    C104315Qm r6 = new C104315Qm(file);
                    int A0N = r2.A0N(3183);
                    if (A0N > 1280 && !r2.A0X(3047)) {
                        A0N = 1280;
                    }
                    if (file.length() > 262144 && r6.A01() / 1000 > A09(A0N)) {
                        return true;
                    }
                } catch (C138066pi e) {
                    Log.e("videopreview/bad video", e);
                    return true;
                }
            }
            return !this.A06.A0G(file);
        } catch (IOException e2) {
            Log.e("transcodeutils/needtranscodemedia exception", e2);
            return true;
        }
    }

    public boolean A0J(C633138t r6, File file, long j, boolean z) {
        int i;
        if (!z) {
            AnonymousClass1VX r2 = this.A03;
            if (r6 == C633138t.A0V) {
                i = 4155;
            } else {
                i = 3656;
                if (AnonymousClass36O.A07(r6)) {
                    i = 3185;
                }
            }
            if (j <= ((long) r2.A0N(i)) * 1048576) {
                return !this.A06.A0G(file);
            }
        }
        return true;
    }

    public static float A00(int i, int i2, int i3, int i4, long j) {
        if (i2 == 0 || i3 == 0) {
            return 3.0f;
        }
        float f = (((float) ((i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) * 8000.0f) / ((float) (((i2 * i3) * 3) + 96000));
        float max = Math.max(0.0f, f - ((float) j)) / f;
        return (((float) (i4 - 3)) * max * max) + 3.0f;
    }

    public static int A01(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("videotranscoder/transcode/color formats: ");
        C18260x0.A1G(A0o, capabilitiesForType.colorFormats.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length || i2 != 0) {
                return i2;
            }
            int i3 = iArr[i];
            if (!(i3 == 39 || i3 == 2130706688)) {
                switch (i3) {
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        C18260x0.A0y("videotranscoder/transcode/skipping unsupported color format ", AnonymousClass001.A0o(), i3);
                        continue;
                }
            }
            if (!"OMX.SEC.avc.enc".equals(mediaCodecInfo.getName()) || i3 != 19) {
                i2 = i3;
                i++;
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("videotranscoder/transcode/skipping ");
                A0o2.append(i3);
                C18260x0.A1L(A0o2, " for OMX.SEC.avc.enc");
                i++;
            }
        }
        return i2;
    }

    public static MediaCodecInfo.CodecCapabilities A02() {
        for (MediaCodecInfo mediaCodecInfo : AnonymousClass6C9.A1X(1)) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static MediaCodecInfo A03(boolean z) {
        String name;
        MediaCodecInfo[] A1X = AnonymousClass6C9.A1X(0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("videotranscoder/transcode/number of codecs: ");
        C18260x0.A1G(A0o, r5);
        MediaCodecInfo mediaCodecInfo = null;
        for (MediaCodecInfo mediaCodecInfo2 : A1X) {
            if (mediaCodecInfo2.isEncoder()) {
                if (C107535bT.A0E(mediaCodecInfo2.getName(), false)) {
                    for (String equals : mediaCodecInfo2.getSupportedTypes()) {
                        if (equals.equals("video/avc")) {
                            return mediaCodecInfo2;
                        }
                    }
                    continue;
                } else if (z && (name = mediaCodecInfo2.getName()) != null && name.equals("OMX.google.h264.encoder")) {
                    String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (supportedTypes[i].equals("video/avc")) {
                            mediaCodecInfo = mediaCodecInfo2;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return mediaCodecInfo;
    }

    public static Pair A04(int i, int i2, int i3) {
        Integer valueOf;
        Integer valueOf2;
        if (i > i2) {
            if (i > i3) {
                valueOf = Integer.valueOf(i3);
                i2 = (i2 * i3) / i;
            }
            valueOf = Integer.valueOf(i);
        } else {
            if (i2 > i3) {
                valueOf = Integer.valueOf((i * i3) / i2);
                valueOf2 = Integer.valueOf(i3);
                return AnonymousClass0x9.A0C(valueOf, valueOf2);
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf2 = Integer.valueOf(i2);
        return AnonymousClass0x9.A0C(valueOf, valueOf2);
    }

    public static boolean A08(C152347Yn r13, C104315Qm r14, byte b) {
        int i = r14.A03;
        int i2 = r14.A01;
        long j = r14.A04;
        if (!r14.A07) {
            if (b != 13) {
                int i3 = r13.A02;
                if (i > i3 || i2 > i3) {
                    if (i < i2) {
                        i = (i * i3) / i2;
                        i2 = i3;
                    } else {
                        i2 = (i2 * i3) / i;
                        i = i3;
                    }
                }
                float min = Math.min((float) r13.A01, ((float) (i * i2)) * A00(r13.A00, i, i2, 9, j));
                long A0B = C18290x4.A0B(j);
                if (((long) (((min * ((float) A0B)) / 8.0f) + ((float) ((A0B * 96000) / 8)))) < r14.A05.length()) {
                    return true;
                }
                return false;
            } else if (r14.A06 || r14.A05.length() <= 262144 || ((double) (((float) r14.A01()) / ((float) (i * i2)))) <= ((double) AnonymousClass8HT.A00(i, i2)) * 1.1d) {
                return false;
            }
        }
        return true;
    }

    public final int A09(int i) {
        JSONObject jSONObject;
        Float A012 = this.A04.A01(0);
        AnonymousClass1VX r2 = this.A03;
        r2.A0S(5550);
        JSONObject A0S = r2.A0S(5550);
        if (i <= 640) {
            jSONObject = A0S.getJSONObject("360");
        } else if (i <= 854) {
            try {
                jSONObject = A0S.getJSONObject("480");
            } catch (JSONException unused) {
            }
        } else if (i <= 1280) {
            jSONObject = A0S.getJSONObject("720");
        } else {
            jSONObject = A0S.getJSONObject("1080");
        }
        int i2 = jSONObject.getInt("min_bitrate");
        int i3 = jSONObject.getInt("max_bitrate");
        int i4 = jSONObject.getInt("null_bitrate");
        int i5 = jSONObject.getInt("min_bandwidth");
        int i6 = jSONObject.getInt("max_bandwidth");
        if (A012 != null) {
            float floatValue = A012.floatValue();
            float f = (float) i5;
            if (floatValue <= f) {
                i4 = i2;
            } else if (floatValue >= ((float) i6)) {
                i4 = i3;
            } else {
                i4 = (int) ((((floatValue - f) / ((float) (i6 - i5))) * ((float) (i3 - i2))) + ((float) i2));
            }
        }
        if (i4 > 0 && r2.A0X(5549)) {
            return i4;
        }
        int i7 = 3755;
        if (i > 640) {
            i7 = 3756;
            if (i > 854) {
                i7 = 3758;
                if (i <= 1280) {
                    i7 = 3757;
                }
            }
        }
        return r2.A0N(i7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (A08(r12, r13, r0) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r20 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0A(X.C152347Yn r12, X.C104315Qm r13, java.io.File r14, long r15, long r17, boolean r19, boolean r20, boolean r21) {
        /*
            r11 = this;
            long r0 = r15 - r17
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = java.lang.Math.max(r2, r0)
            X.1VX r1 = r11.A03
            r0 = 422(0x1a6, float:5.91E-43)
            boolean r8 = r1.A0X(r0)
            if (r21 != 0) goto L_0x0032
            r4 = 0
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            long r0 = r13.A04
            int r4 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0032
            long r6 = r14.length()
            int r0 = r12.A00
            long r0 = (long) r0
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r4
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0032
            long r2 = r14.length()
            return r2
        L_0x0032:
            int r1 = X.AnonymousClass8HT.A02(r8)
            r0 = 1
            if (r1 != r0) goto L_0x0046
            if (r21 != 0) goto L_0x004f
            r0 = 3
            if (r19 == 0) goto L_0x0040
            r0 = 13
        L_0x0040:
            boolean r0 = A08(r12, r13, r0)
            if (r0 != 0) goto L_0x004f
        L_0x0046:
            long r2 = r14.length()
            long r2 = r2 * r9
            long r0 = r13.A04
            long r2 = r2 / r0
            return r2
        L_0x004f:
            int r5 = r13.A03
            int r4 = r13.A01
            int r1 = r12.A02
            int r0 = java.lang.Math.max(r5, r4)
            int r0 = java.lang.Math.min(r1, r0)
            android.util.Pair r0 = A04(r5, r4, r0)
            int r6 = X.C18280x3.A03(r0)
            int r7 = X.C18290x4.A03(r0)
            if (r19 == 0) goto L_0x0079
            int r6 = r6 * r7
            int r0 = r6 * 2
            float r1 = (float) r0
        L_0x006f:
            r0 = 0
        L_0x0070:
            float r1 = r1 + r0
            long r9 = r9 / r2
            float r0 = (float) r9
            float r1 = r1 * r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            long r2 = (long) r1
            return r2
        L_0x0079:
            int r0 = r12.A01
            float r4 = (float) r0
            int r0 = r6 * r7
            float r1 = (float) r0
            int r5 = r12.A00
            r8 = 9
            float r0 = A00(r5, r6, r7, r8, r9)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r4, r1)
            r0 = 1203470336(0x47bb8000, float:96000.0)
            if (r20 == 0) goto L_0x0070
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162287rd.A0A(X.7Yn, X.5Qm, java.io.File, long, long, boolean, boolean, boolean):long");
    }

    public C152347Yn A0C() {
        AnonymousClass1VX r1 = this.A03;
        int A0N = r1.A0N(594);
        if (A0N > 1280 && !r1.A0X(3047)) {
            A0N = 1280;
        }
        return new C152347Yn(r1.A0N(596), A0N, (int) C18290x4.A0A(A09(A0N)));
    }

    public C152347Yn A0D(boolean z, boolean z2, boolean z3) {
        AnonymousClass1VX r1 = this.A03;
        int A0N = r1.A0N(3183);
        int A0N2 = r1.A0N(3185);
        if (A0N < 848) {
            if (AnonymousClass34G.A02(this.A02, this.A05) >= r1.A0N(5946)) {
                A0N2 = 64;
                A0N = 848;
            }
        }
        if (z2) {
            A0N2 = r1.A0N(3656);
            A0N = r1.A0N(3654);
        }
        if (z3) {
            A0N2 = r1.A0N(4155);
            A0N = r1.A0N(4686);
        }
        if (z) {
            A0N2 = r1.A0N(3659);
            A0N = r1.A0N(4685);
        }
        if (A0N > 1280 && !r1.A0X(3047)) {
            A0N = 1280;
        }
        return new C152347Yn(A0N2, A0N, (int) C18290x4.A0A(A09(A0N)));
    }

    public AnonymousClass3Z6 A0E(Context context, Uri uri, C104315Qm r37, int i) {
        C151307Uf A002;
        C141046uw r0;
        C104315Qm r9 = r37;
        if (r37 == null || !this.A03.A0X(6781)) {
            A002 = C159277lY.A00(context, uri, this.A03.A0X(6654));
            if (A002 == null) {
                Log.e("videolite/BadVideoException sourceVideoMetadata==null");
                Integer A0Z = C18290x4.A0Z();
                return new AnonymousClass3Z6(A0Z, A0Z);
            }
        } else {
            long j = r9.A04;
            int i2 = r9.A03;
            int i3 = r9.A01;
            int i4 = i2;
            int i5 = i3;
            A002 = new C151307Uf((C165967xv) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "VIDEO", (HashMap) null, i4, i5, r9.A02, 0, 0, 0, j, (long) r9.A01(), r9.A05.length(), !r9.A07);
        }
        int i6 = i;
        if (i6 >= 1920) {
            r0 = C141046uw.Quality1080p;
        } else if (i6 >= 1280) {
            r0 = C141046uw.Quality720p;
        } else if (i6 >= 848) {
            r0 = C141046uw.Quality480p;
        } else {
            r0 = C141046uw.Quality360p;
        }
        C158247jf A0B = A0B(A002, r0);
        return AnonymousClass3Z6.A01(Integer.valueOf(A0B.A08), A0B.A0A);
    }

    public boolean A0F(long j, long j2) {
        int i;
        AnonymousClass1VX r1 = this.A03;
        int A0N = r1.A0N(3183);
        if (A0N > 1280 && !r1.A0X(3047)) {
            A0N = 1280;
        }
        if (j > 262144) {
            if (j2 == 0) {
                i = 0;
            } else {
                i = (int) ((j * 8) / (j2 * 1000));
            }
            if (i <= A09(A0N)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        if (X.C107655bf.A0R(r9.A01, r1).exists() == false) goto L_0x0067;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004f A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0089 A[Catch:{ IOException -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(X.C30471mV r10) {
        /*
            r9 = this;
            X.33C r2 = r10.A01     // Catch:{ IOException -> 0x008f }
            boolean r0 = r10.A22()     // Catch:{ IOException -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x008e
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            X.C626936e.A06(r2)     // Catch:{ IOException -> 0x008f }
            boolean r0 = r2.A0Q     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x008e
            X.38t r4 = X.AnonymousClass36O.A02(r10)     // Catch:{ IOException -> 0x008f }
            X.38t r0 = X.C633138t.A04     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0023
            X.38t r0 = X.C633138t.A0Q     // Catch:{ IOException -> 0x008f }
            if (r4 != r0) goto L_0x002b
        L_0x0023:
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x008f }
            if (r0 == 0) goto L_0x008d
            X.C172218Kd.A04(r0)     // Catch:{ IOException -> 0x002b }
            goto L_0x008d
        L_0x002b:
            X.38t r0 = X.C633138t.A0C     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0j     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0H     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A07     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0Z     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0e     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A08     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0R     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            X.38t r0 = X.C633138t.A0F     // Catch:{ IOException -> 0x008f }
            if (r4 == r0) goto L_0x0089
            boolean r0 = X.AnonymousClass36O.A08(r4)     // Catch:{ IOException -> 0x008f }
            r3 = r9
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = r2.A0H     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x0067
            X.3Dh r0 = r9.A01     // Catch:{ IOException -> 0x008f }
            java.io.File r0 = X.C107655bf.A0R(r0, r1)     // Catch:{ IOException -> 0x008f }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x008f }
            r8 = 1
            if (r0 != 0) goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            java.io.File r5 = r2.A0F     // Catch:{ IOException -> 0x008f }
            long r6 = r10.A00     // Catch:{ IOException -> 0x008f }
            boolean r1 = r3.A0J(r4, r5, r6, r8)     // Catch:{ IOException -> 0x008f }
            return r1
        L_0x0071:
            boolean r0 = X.AnonymousClass36O.A03(r4)     // Catch:{ IOException -> 0x008f }
            if (r0 == 0) goto L_0x0082
            X.7rz r1 = r9.A06     // Catch:{ IOException -> 0x008f }
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x008f }
            boolean r0 = r1.A0F(r0)     // Catch:{ IOException -> 0x008f }
            r1 = r0 ^ 1
            return r1
        L_0x0082:
            boolean r0 = X.AnonymousClass36O.A06(r4)     // Catch:{ IOException -> 0x008f }
            if (r0 == 0) goto L_0x008e
            goto L_0x008d
        L_0x0089:
            java.io.File r0 = r2.A0F     // Catch:{ IOException -> 0x008f }
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r1 = 1
        L_0x008e:
            return r1
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162287rd.A0K(X.1mV):boolean");
    }

    public C162287rd(C55682qk r1, C64393Dh r2, C620633i r3, AnonymousClass1VX r4, C60132y3 r5, C60152y5 r6, C162397rz r7) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
    }

    public static Range A05(int i) {
        MediaCodecInfo.CodecCapabilities A022 = A02();
        if (A022 == null || A022.getVideoCapabilities() == null) {
            return Range.create(32, 720);
        }
        return A022.getVideoCapabilities().getSupportedWidthsFor(i);
    }

    public static List A06(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (MediaCodecInfo mediaCodecInfo : AnonymousClass6C9.A1X(0)) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (supportedTypes[i].equals(str)) {
                        A0s.add(mediaCodecInfo.getName());
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return A0s;
    }

    public static boolean A07(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A022 = A02();
        if (A022 == null || A022.getVideoCapabilities() == null) {
            return true;
        }
        return A022.getVideoCapabilities().isSizeSupported(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(X.C633138t r5, java.io.File r6) {
        /*
            r4 = this;
            boolean r0 = X.AnonymousClass36O.A08(r5)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            X.1VX r1 = r4.A03
            r0 = 422(0x1a6, float:5.91E-43)
            boolean r0 = r1.A0X(r0)
            int r0 = X.AnonymousClass8HT.A02(r0)
            if (r0 != r2) goto L_0x0017
        L_0x0016:
            r3 = 1
        L_0x0017:
            return r3
        L_0x0018:
            X.38t r0 = X.C633138t.A05
            if (r5 == r0) goto L_0x004b
            X.38t r0 = X.C633138t.A0i
            if (r5 == r0) goto L_0x004b
            X.38t r0 = X.C633138t.A0C
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A0j
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A0Z
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A07
            if (r5 == r0) goto L_0x0016
            boolean r0 = X.AnonymousClass36O.A06(r5)
            if (r0 != 0) goto L_0x0016
            X.38t r0 = X.C633138t.A0H
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A0M
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A08
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A0R
            if (r5 == r0) goto L_0x0016
            X.38t r0 = X.C633138t.A0F
            if (r5 != r0) goto L_0x0017
            goto L_0x0016
        L_0x004b:
            boolean r0 = X.AnonymousClass8HS.A00(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162287rd.A0G(X.38t, java.io.File):boolean");
    }
}
