package org.pjsip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass6CA;
import X.AnonymousClass7YA;
import X.AnonymousClass91S;
import X.C129496aP;
import X.C129526aS;
import X.C18290x4;
import X.C86664Kz;
import android.os.Build;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = new AnonymousClass91S(56);
    public static final Pair PAIR_1280_720 = C18290x4.A0K(1280, 720);
    public static final C129526aS ZOOMING_OPPO_MODELS;
    public static final C129526aS ZOOMING_VIVO_MODELS;
    public final int deviceType;
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    static {
        C129496aP r1 = new C129496aP();
        r1.add((Object) "CPH2023");
        r1.add((Object) "CPH2025");
        r1.add((Object) "CPH2363");
        ZOOMING_OPPO_MODELS = r1.build();
        C129496aP r12 = new C129496aP();
        r12.add((Object) "V2027");
        r12.add((Object) "V2029");
        r12.add((Object) "V2130");
        ZOOMING_VIVO_MODELS = r12.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.7YA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.7YA} */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0184, code lost:
        if (r12 >= 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0186, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.pjsip.PjCameraInfo createFromRawInfo(X.C160297nO r14, X.AnonymousClass1VX r15, X.C106155Xv r16) {
        /*
            int[] r1 = r14.A06
            int r0 = r1.length
            int[] r9 = java.util.Arrays.copyOf(r1, r0)
            int[] r5 = getEncoderSupportedColorFormats(r16)
            r8 = 0
            r4 = 0
            r3 = 0
        L_0x000e:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x0045
            if (r3 != 0) goto L_0x0045
            r2 = r5[r4]
            r1 = 0
        L_0x0016:
            int r0 = r9.length
            if (r1 >= r0) goto L_0x003f
            r0 = r9[r1]
            if (r0 != r2) goto L_0x0042
            r0 = r9[r8]
            r9[r1] = r0
            r9[r8] = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/video/PJCameraInfo preferred formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            X.AnonymousClass001.A1M(r1)
            r1.append(r2)
            java.lang.String r0 = " is available ."
            X.C18260x0.A1L(r1, r0)
            r3 = 1
        L_0x003f:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0045:
            boolean r7 = r14.A05
            java.util.List r0 = r14.A03
            if (r0 == 0) goto L_0x018a
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x018a
            boolean r0 = X.AnonymousClass77V.A00
            r11 = 640(0x280, float:8.97E-43)
            r5 = 480(0x1e0, float:6.73E-43)
            if (r0 == 0) goto L_0x0061
            r11 = 320(0x140, float:4.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
        L_0x0061:
            X.7YA r10 = preferredCaptureSize(r15)
            if (r10 == 0) goto L_0x0071
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x0071
            int r11 = r10.A01
            int r5 = r10.A00
        L_0x0071:
            android.content.SharedPreferences r1 = r16.A03()
            java.lang.String r0 = "disable_device_specific_camera_size"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x00fe
            r13 = 0
        L_0x007e:
            android.content.SharedPreferences r0 = r16.A03()
            if (r7 == 0) goto L_0x00db
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0098
            android.content.SharedPreferences r1 = r16.A03()
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00aa
        L_0x0098:
            android.content.SharedPreferences r0 = r16.A03()
            int r11 = r0.getInt(r2, r11)
            android.content.SharedPreferences r1 = r16.A03()
            java.lang.String r0 = "video_call_front_camera_height"
        L_0x00a6:
            int r5 = r1.getInt(r0, r5)
        L_0x00aa:
            X.7YA r4 = r14.A02
            if (r4 == 0) goto L_0x00bc
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 * r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            if (r1 > r0) goto L_0x00bc
            java.lang.Object r4 = r6.get(r8)
        L_0x00bc:
            java.util.Comparator r0 = CAMERA_SIZE_COMPARATOR
            java.util.Collections.sort(r6, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x00c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r2.next()
            X.7YA r0 = (X.AnonymousClass7YA) r0
            int r1 = r0.A01
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 != r0) goto L_0x00c5
            r2.remove()
            goto L_0x00c5
        L_0x00db:
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00ef
            android.content.SharedPreferences r1 = r16.A03()
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00aa
        L_0x00ef:
            android.content.SharedPreferences r0 = r16.A03()
            int r11 = r0.getInt(r2, r11)
            android.content.SharedPreferences r1 = r16.A03()
            java.lang.String r0 = "video_call_back_camera_height"
            goto L_0x00a6
        L_0x00fe:
            android.util.Pair r13 = deviceSpecificSize(r7)
            if (r13 == 0) goto L_0x007e
            int r11 = X.C18280x3.A03(r13)
            int r5 = X.C18290x4.A03(r13)
            goto L_0x007e
        L_0x010e:
            r3 = -1
            r12 = -1
            r2 = 0
        L_0x0111:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0142
            java.lang.Object r1 = r6.get(r2)
            X.7YA r1 = (X.AnonymousClass7YA) r1
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x0124
            r12 = r2
        L_0x0124:
            int r0 = r1.A01
            if (r0 != r11) goto L_0x013f
            if (r3 < 0) goto L_0x013e
            int r0 = r1.A00
            int r1 = X.AnonymousClass001.A0A(r0, r5)
            java.lang.Object r0 = r6.get(r3)
            X.7YA r0 = (X.AnonymousClass7YA) r0
            int r0 = r0.A00
            int r0 = X.AnonymousClass001.A0A(r0, r5)
            if (r1 >= r0) goto L_0x013f
        L_0x013e:
            r3 = r2
        L_0x013f:
            int r2 = r2 + 1
            goto L_0x0111
        L_0x0142:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            if (r3 < 0) goto L_0x0184
            java.lang.Object r4 = r6.get(r3)
        L_0x014c:
            r5.add(r4)
        L_0x014f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0197
            if (r13 != 0) goto L_0x0197
            if (r10 != 0) goto L_0x0197
            r4 = 0
        L_0x015a:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x0197
            java.lang.Object r3 = r6.get(r4)
            X.7YA r3 = (X.AnonymousClass7YA) r3
            int r2 = r3.A01
            java.lang.Object r0 = r5.get(r8)
            X.7YA r0 = (X.AnonymousClass7YA) r0
            int r0 = r0.A00
            int r2 = r2 * r0
            int r1 = r3.A00
            java.lang.Object r0 = r5.get(r8)
            X.7YA r0 = (X.AnonymousClass7YA) r0
            int r0 = r0.A01
            int r1 = r1 * r0
            if (r2 != r1) goto L_0x0181
            r5.add(r3)
        L_0x0181:
            int r4 = r4 + 1
            goto L_0x015a
        L_0x0184:
            if (r12 >= 0) goto L_0x014c
            r5.addAll(r6)
            goto L_0x014f
        L_0x018a:
            java.lang.String r0 = "voip/video/PJCameraInfo previewSizes is null, use 640x480 by default."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int[] r2 = X.C86664Kz.A1Z()
            r2 = {640, 480} // fill-array
            goto L_0x019b
        L_0x0197:
            int[] r2 = SizeListToIntArray(r5)
        L_0x019b:
            int r1 = r14.A01
            org.pjsip.PjCameraInfo r0 = new org.pjsip.PjCameraInfo
            r0.<init>(r7, r1, r2, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.createFromRawInfo(X.7nO, X.1VX, X.5Xv):org.pjsip.PjCameraInfo");
    }

    public static Pair deviceSpecificSize(boolean z) {
        String str = Build.MANUFACTURER;
        if (!"samsung".equalsIgnoreCase(str)) {
            if (!z) {
                return null;
            }
            if (!isHighEndPixelModel() && !isMotorolaRazrModel() && ((!"OPPO".equals(str) || !ZOOMING_OPPO_MODELS.contains(Build.MODEL)) && (!"vivo".equals(str) || !ZOOMING_VIVO_MODELS.contains(Build.MODEL)))) {
                return null;
            }
        }
        return PAIR_1280_720;
    }

    public static Integer getNumeralFrom(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str.replaceAll("[^0-9]", "")));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean isHighEndPixelModel() {
        Integer numeralFrom;
        String str = Build.MODEL;
        if (!str.contains("Pixel") || (numeralFrom = getNumeralFrom(str)) == null || numeralFrom.intValue() < 6) {
            return false;
        }
        return true;
    }

    public static boolean isMotorolaRazrModel() {
        return Build.MODEL.contains("motorola razr");
    }

    public static /* synthetic */ int lambda$static$0(AnonymousClass7YA r2, AnonymousClass7YA r3) {
        int i = r2.A01;
        int i2 = r3.A01;
        if (i > i2) {
            return -1;
        }
        if (i == i2) {
            return Integer.compare(r3.A00, r2.A00);
        }
        return 1;
    }

    public static AnonymousClass7YA preferredCaptureSize(AnonymousClass1VX r4) {
        String A0Q = r4.A0Q(3266);
        if (A0Q != null && !A0Q.isEmpty()) {
            String[] split = A0Q.split(",[ ]*");
            if (split.length == 2) {
                try {
                    return new AnonymousClass7YA(AnonymousClass6CA.A0F(split, 0), AnonymousClass6CA.A0F(split, 1));
                } catch (NumberFormatException e) {
                    Log.e("voip/video/PJCameraInfo/preferredCaptureSize invalid capture size", e);
                }
            }
        }
        return null;
    }

    public PjCameraInfo(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        this.facing = i;
        this.orient = i2;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
        this.deviceType = i3;
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[(list.size() * 2)];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass7YA r2 = (AnonymousClass7YA) it.next();
            int i2 = i + 1;
            iArr[i] = r2.A01;
            i = i2 + 1;
            iArr[i2] = r2.A00;
        }
        return iArr;
    }

    public static PjCameraInfo createHammerheadCameraInfo() {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 1280;
        A1Z[1] = 720;
        return new PjCameraInfo(0, 90, 2, A1Z, new int[]{1});
    }

    public static PjCameraInfo createScreenSharingInfo(int i) {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 640;
        A1Z[1] = 480;
        return new PjCameraInfo(0, i, 1, A1Z, new int[]{1});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r1.startsWith("hwG") != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getEncoderSupportedColorFormats(X.C106155Xv r3) {
        /*
            android.content.SharedPreferences r2 = r3.A03()
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            r0 = -1
            int r3 = r2.getInt(r1, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "MSM8960"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "universal7580"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "xcover3lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "ks01lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0043
        L_0x0039:
            r2 = 1
        L_0x003a:
            r1 = 3
            if (r2 == 0) goto L_0x0061
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        L_0x0043:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "7x27"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "hwY"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "hwG"
            boolean r0 = r1.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L_0x003a
            goto L_0x0039
        L_0x0061:
            r0 = 1
            if (r3 != r0) goto L_0x006a
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x006a:
            r0 = 2
            if (r3 != r0) goto L_0x0073
            int[] r0 = new int[r1]
            r0 = {842094169, 35, 17} // fill-array
            return r0
        L_0x0073:
            if (r3 == r1) goto L_0x007e
            r0 = 4
            if (r3 == r0) goto L_0x007e
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x007e:
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.5Xv):int[]");
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("facing ");
        if (this.facing == 0) {
            str = "back";
        } else {
            str = "front";
        }
        A0o.append(str);
        A0o.append(", orientation: ");
        A0o.append(this.orient);
        A0o.append(", returned preview formats: ");
        A0o.append(Arrays.toString(this.supportedFormat));
        A0o.append(", returned preview size: ");
        return AnonymousClass000.A0X(Arrays.toString(this.supportedSize), A0o);
    }

    public PjCameraInfo(int i, int i2, int[] iArr, int[] iArr2) {
        this(i, i2, 0, iArr, iArr2);
    }
}
