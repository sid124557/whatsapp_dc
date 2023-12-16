package X;

import java.util.List;

/* renamed from: X.96p  reason: invalid class name */
public final class AnonymousClass96p extends C194899Ux {
    public final AnonymousClass9PY A00;
    public final AnonymousClass9T4 A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Float A0F;
    public final Float A0G;
    public final Float A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final List A0a;
    public final List A0b;
    public final List A0c;
    public final List A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036f, code lost:
        if (X.AnonymousClass0x7.A1U(r5, 17) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        if (r1 == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02f7 A[LOOP:8: B:134:0x02f5->B:135:0x02f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x044d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass96p(android.hardware.Camera.Parameters r21) {
        /*
            r20 = this;
            r7 = r20
            r7.<init>()
            r11 = r21
            int r19 = r11.getMaxNumDetectedFaces()
            int r18 = r11.getMaxNumFocusAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r7.A0J = r0
            int r17 = r11.getMaxNumMeteringAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r7.A0K = r0
            boolean r8 = r11.isZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r7.A0E = r0
            r4 = 0
            if (r8 == 0) goto L_0x0065
            int r0 = r11.getMaxZoom()
        L_0x0030:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7.A0L = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.A0N = r0
            boolean r0 = r11.isSmoothZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0D = r0
            if (r8 == 0) goto L_0x0067
            java.util.List r5 = r11.getZoomRatios()
            int r3 = r5.size()
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r3)
            r1 = 0
        L_0x0055:
            if (r1 >= r3) goto L_0x0068
            float r0 = X.C1899593h.A01(r5, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0065:
            r0 = 0
            goto L_0x0030
        L_0x0067:
            r2 = 0
        L_0x0068:
            java.util.List r1 = X.AnonymousClass9UT.A00(r2)
            r7.A0d = r1
            r3 = 0
            if (r8 == 0) goto L_0x0125
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0125
            float r0 = X.C1899593h.A01(r1, r4)
        L_0x007b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.A0H = r0
            if (r8 == 0) goto L_0x0122
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0122
            int r0 = r6.intValue()
            float r0 = X.C1899593h.A01(r1, r0)
        L_0x0091:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r7.A0G = r0
            int r2 = r11.getMinExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.A0M = r0
            int r1 = r11.getMaxExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A0I = r0
            r6 = 1
            if (r2 == 0) goto L_0x00b1
            r0 = 1
            if (r1 != 0) goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A05 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c2
            float r3 = r11.getExposureCompensationStep()
        L_0x00c2:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r7.A0F = r0
            boolean r0 = r11.isAutoExposureLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A02 = r0
            boolean r0 = r11.isAutoWhiteBalanceLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A04 = r0
            boolean r0 = r11.isVideoSnapshotSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0B = r0
            boolean r0 = r11.isVideoStabilizationSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0C = r0
            java.util.List r0 = r11.getSupportedPreviewFrameRates()
            java.util.List r0 = X.AnonymousClass9UT.A00(r0)
            r7.A0Y = r0
            java.util.List r8 = r11.getSupportedFocusModes()
            if (r8 == 0) goto L_0x0128
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0128
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r8.size()
            r2 = 0
        L_0x010f:
            if (r2 >= r3) goto L_0x012b
            java.lang.String r0 = X.AnonymousClass001.A0n(r8, r2)
            int r1 = X.AnonymousClass9WX.A03(r0)
            r0 = -1
            if (r1 == r0) goto L_0x011f
            X.C18270x1.A1K(r5, r1)
        L_0x011f:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x0122:
            r0 = 0
            goto L_0x0091
        L_0x0125:
            r0 = 0
            goto L_0x007b
        L_0x0128:
            java.util.List r8 = X.AnonymousClass9UT.A00
            goto L_0x012f
        L_0x012b:
            java.util.List r8 = X.AnonymousClass9UT.A00(r5)
        L_0x012f:
            r7.A0S = r8
            java.util.List r9 = r11.getSupportedAntibanding()
            if (r9 == 0) goto L_0x0159
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0159
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r9.size()
            r2 = 0
        L_0x0146:
            if (r2 >= r3) goto L_0x015c
            java.lang.String r0 = X.AnonymousClass001.A0n(r9, r2)
            int r1 = X.AnonymousClass9WX.A00(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0156
            X.C18270x1.A1K(r5, r1)
        L_0x0156:
            int r2 = r2 + 1
            goto L_0x0146
        L_0x0159:
            java.util.List r0 = X.AnonymousClass9UT.A00
            goto L_0x0160
        L_0x015c:
            java.util.List r0 = X.AnonymousClass9UT.A00(r5)
        L_0x0160:
            r7.A0P = r0
            java.util.List r9 = r11.getSupportedColorEffects()
            if (r9 == 0) goto L_0x018a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x018a
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r9.size()
            r2 = 0
        L_0x0177:
            if (r2 >= r3) goto L_0x018d
            java.lang.String r0 = X.AnonymousClass001.A0n(r9, r2)
            int r1 = X.AnonymousClass9WX.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0187
            X.C18270x1.A1K(r5, r1)
        L_0x0187:
            int r2 = r2 + 1
            goto L_0x0177
        L_0x018a:
            java.util.List r0 = X.AnonymousClass9UT.A00
            goto L_0x0191
        L_0x018d:
            java.util.List r0 = X.AnonymousClass9UT.A00(r5)
        L_0x0191:
            r7.A0Q = r0
            java.util.List r9 = r11.getSupportedFlashModes()
            if (r9 == 0) goto L_0x01bb
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01bb
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r9.size()
            r2 = 0
        L_0x01a8:
            if (r2 >= r3) goto L_0x01be
            java.lang.String r0 = X.AnonymousClass001.A0n(r9, r2)
            int r1 = X.AnonymousClass9WX.A02(r0)
            r0 = -1
            if (r1 == r0) goto L_0x01b8
            X.C18270x1.A1K(r5, r1)
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01bb:
            java.util.List r9 = X.AnonymousClass9UT.A00
            goto L_0x01c2
        L_0x01be:
            java.util.List r9 = X.AnonymousClass9UT.A00(r5)
        L_0x01c2:
            r7.A0R = r9
            java.util.List r0 = r11.getSupportedPictureFormats()
            java.util.List r0 = X.AnonymousClass9UT.A00(r0)
            r7.A0U = r0
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r13 = r11.get(r0)
            r16 = 0
            if (r13 == 0) goto L_0x0248
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0248
            r1 = 0
            char r0 = r13.charAt(r4)
            r12 = 40
            if (r0 != r12) goto L_0x0248
            int r0 = r13.length()
            int r0 = r0 + -1
            char r0 = r13.charAt(r0)
            r10 = 41
            if (r0 != r10) goto L_0x0248
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x01f9:
            int r3 = r13.indexOf(r10, r1)
            int r0 = r3 + 1
            java.lang.String r14 = r13.substring(r1, r0)
            java.lang.String r2 = "Invalid range list string="
            if (r14 == 0) goto L_0x023e
            char r0 = r14.charAt(r4)
            if (r0 != r12) goto L_0x023e
            int r0 = r14.length()
            int r0 = r0 - r6
            char r0 = r14.charAt(r0)
            if (r0 != r10) goto L_0x023e
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 44
            int r15 = r14.indexOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r0 = X.C1899593h.A04(r14, r6, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            r1[r4] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r15 = r15 + 1
            int r0 = r14.indexOf(r10, r15)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r0 = X.C1899593h.A04(r14, r15, r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            r1[r6] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            goto L_0x0258
        L_0x0234:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r14)
            android.util.Log.e(r1, r0)
            goto L_0x025b
        L_0x023e:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r14)
            android.util.Log.e(r1, r0)
            goto L_0x025b
        L_0x0248:
            java.lang.String r2 = "ParametersHelper"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid range list string="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r13, r1)
            android.util.Log.e(r2, r0)
            goto L_0x026a
        L_0x0258:
            r5.add(r1)
        L_0x025b:
            int r1 = r13.indexOf(r12, r3)
            r0 = -1
            if (r1 != r0) goto L_0x01f9
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x026a
            r16 = r5
        L_0x026a:
            java.util.List r0 = X.AnonymousClass9UT.A00(r16)
            r7.A0X = r0
            java.util.List r10 = r11.getSupportedSceneModes()
            if (r10 == 0) goto L_0x0298
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0298
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r10.size()
            r2 = 0
        L_0x0285:
            if (r2 >= r3) goto L_0x029b
            java.lang.String r0 = X.AnonymousClass001.A0n(r10, r2)
            int r1 = X.AnonymousClass9WX.A04(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0295
            X.C18270x1.A1K(r5, r1)
        L_0x0295:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x0298:
            java.util.List r5 = X.AnonymousClass9UT.A00
            goto L_0x029f
        L_0x029b:
            java.util.List r5 = X.AnonymousClass9UT.A00(r5)
        L_0x029f:
            r7.A0a = r5
            java.util.List r0 = r11.getSupportedPreviewFormats()
            java.util.List r0 = X.AnonymousClass9UT.A00(r0)
            r7.A0W = r0
            java.util.List r12 = r11.getSupportedWhiteBalance()
            if (r12 == 0) goto L_0x02d3
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x02d3
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            int r3 = r12.size()
            r2 = 0
        L_0x02c0:
            if (r2 >= r3) goto L_0x02d6
            java.lang.String r0 = X.AnonymousClass001.A0n(r12, r2)
            int r1 = X.AnonymousClass9WX.A05(r0)
            r0 = -1
            if (r1 == r0) goto L_0x02d0
            X.C18270x1.A1K(r10, r1)
        L_0x02d0:
            int r2 = r2 + 1
            goto L_0x02c0
        L_0x02d3:
            java.util.List r0 = X.AnonymousClass9UT.A00
            goto L_0x02da
        L_0x02d6:
            java.util.List r0 = X.AnonymousClass9UT.A00(r10)
        L_0x02da:
            r7.A0c = r0
            java.util.List r3 = r11.getSupportedJpegThumbnailSizes()
            if (r3 != 0) goto L_0x02fd
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x02e6:
            r7.A0T = r0
            java.util.List r3 = r11.getSupportedPictureSizes()
            int r2 = r3.size()
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
            r0 = 0
        L_0x02f5:
            if (r0 >= r2) goto L_0x0313
            X.AnonymousClass9T4.A01(r1, r3, r0)
            int r0 = r0 + 1
            goto L_0x02f5
        L_0x02fd:
            int r2 = r3.size()
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
            r0 = 0
        L_0x0306:
            if (r0 >= r2) goto L_0x030e
            X.AnonymousClass9T4.A01(r1, r3, r0)
            int r0 = r0 + 1
            goto L_0x0306
        L_0x030e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x02e6
        L_0x0313:
            java.util.HashMap r0 = X.AnonymousClass9UY.A00
            java.util.List r0 = X.AnonymousClass9UY.A01(r0, r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r7.A0V = r3
            java.util.List r10 = r11.getSupportedPreviewSizes()
            if (r10 != 0) goto L_0x03fc
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0329:
            r7.A0Z = r0
            java.util.List r10 = r11.getSupportedVideoSizes()
            if (r10 != 0) goto L_0x03df
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0335:
            r7.A0b = r0
            r0 = 3
            boolean r0 = X.AnonymousClass0x7.A1U(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0A = r0
            boolean r0 = X.AnonymousClass0x7.A1U(r8, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A03 = r0
            boolean r0 = X.AnonymousClass001.A1W(r17)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A09 = r0
            boolean r0 = X.AnonymousClass001.A1W(r18)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A08 = r0
            java.util.HashSet r0 = X.AnonymousClass9UY.A04
            boolean r0 = X.C194989Vk.A02(r0)
            if (r0 != 0) goto L_0x0371
            r0 = 17
            boolean r1 = X.AnonymousClass0x7.A1U(r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0372
        L_0x0371:
            r0 = 0
        L_0x0372:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A07 = r0
            if (r19 <= 0) goto L_0x037b
            r4 = 1
        L_0x037b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r7.A06 = r0
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r1 = r11.get(r0)
            if (r1 == 0) goto L_0x0413
            java.lang.String r0 = "null"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0413
            java.lang.String r0 = "x"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0413
            java.util.ArrayList r8 = X.C195139We.A01(r1)
            int r5 = r8.size()
            r4 = 0
        L_0x03a2:
            if (r4 >= r5) goto L_0x0413
            java.lang.Object r9 = r8.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x03dc
            r0 = 120(0x78, float:1.68E-43)
            int r1 = r9.indexOf(r0)
            r0 = -1
            java.lang.String r2 = "Invalid size parameter string="
            if (r1 == r0) goto L_0x03c9
            r0 = 0
            java.lang.String r0 = r9.substring(r0, r1)     // Catch:{ NumberFormatException -> 0x03d3 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d3 }
            int r0 = r1 + 1
            java.lang.String r0 = r9.substring(r0)     // Catch:{ NumberFormatException -> 0x03d3 }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d3 }
            goto L_0x0413
        L_0x03c9:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r9)
            android.util.Log.e(r1, r0)
            goto L_0x03dc
        L_0x03d3:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = X.AnonymousClass000.A0T(r2, r9)
            android.util.Log.e(r1, r0)
        L_0x03dc:
            int r4 = r4 + 1
            goto L_0x03a2
        L_0x03df:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
            r0 = 0
        L_0x03e8:
            if (r0 >= r2) goto L_0x03f0
            X.AnonymousClass9T4.A01(r1, r10, r0)
            int r0 = r0 + 1
            goto L_0x03e8
        L_0x03f0:
            java.util.HashMap r0 = X.AnonymousClass9UY.A01
            java.util.List r0 = X.AnonymousClass9UY.A01(r0, r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0335
        L_0x03fc:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r2)
            r0 = 0
        L_0x0405:
            if (r0 >= r2) goto L_0x040d
            X.AnonymousClass9T4.A01(r1, r10, r0)
            int r0 = r0 + 1
            goto L_0x0405
        L_0x040d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0329
        L_0x0413:
            java.lang.String r0 = "iso-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = "iso"
            if (r0 == 0) goto L_0x046e
            java.lang.String r0 = "iso-mode-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x046e
            java.lang.String r0 = "iso-speed-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x045d
            java.lang.String r0 = "iso-speed"
        L_0x043b:
            X.9PY r0 = X.C195139We.A00(r11, r0, r1)
        L_0x043f:
            r7.A00 = r0
            r5 = 0
            X.9T4 r4 = new X.9T4
            r4.<init>(r5, r5)
        L_0x0447:
            int r0 = r3.size()
            if (r5 >= r0) goto L_0x0473
            java.lang.Object r2 = r3.get(r5)
            X.9T4 r2 = (X.AnonymousClass9T4) r2
            int r1 = r2.A00
            int r0 = r4.A00
            if (r1 <= r0) goto L_0x045a
            r4 = r2
        L_0x045a:
            int r5 = r5 + 1
            goto L_0x0447
        L_0x045d:
            java.lang.String r0 = "nv-picture-iso-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x046c
            java.lang.String r0 = "nv-picture-iso"
            goto L_0x043b
        L_0x046c:
            r0 = 0
            goto L_0x043f
        L_0x046e:
            X.9PY r0 = X.C195139We.A00(r11, r1, r2)
            goto L_0x043f
        L_0x0473:
            r7.A01 = r4
            float r10 = r11.getFocalLength()
            float r0 = r11.getHorizontalViewAngle()
            double r8 = (double) r0
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 * r4
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 / r2
            float r0 = r11.getVerticalViewAngle()
            double r0 = (double) r0
            double r0 = r0 * r4
            double r0 = r0 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 * r2
            double r4 = (double) r10
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r10
            double r0 = java.lang.Math.tan(r0)
            double r0 = r0 * r4
            double r0 = java.lang.Math.abs(r0)
            float r3 = (float) r0
            double r8 = r8 / r10
            double r0 = java.lang.Math.tan(r8)
            double r4 = r4 * r0
            double r0 = java.lang.Math.abs(r4)
            float r2 = (float) r0
            r0 = 2
            java.lang.Float[] r1 = new java.lang.Float[r0]
            r0 = 0
            X.AnonymousClass001.A1P(r1, r3, r0)
            X.AnonymousClass001.A1P(r1, r2, r6)
            java.util.List r0 = java.util.Arrays.asList(r1)
            r7.A0O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96p.<init>(android.hardware.Camera$Parameters):void");
    }
}
