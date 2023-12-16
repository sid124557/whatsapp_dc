package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Wt  reason: invalid class name and case insensitive filesystem */
public class C195239Wt {
    public static final Range A00;
    public static final boolean A01;
    public static final int[] A02 = new int[0];

    static {
        boolean z = false;
        Float valueOf = Float.valueOf(0.0f);
        A00 = Range.create(valueOf, valueOf);
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        A01 = z;
    }

    public static List A02(float f) {
        if (f <= 0.0f) {
            return null;
        }
        double d = (double) f;
        int log = (int) ((Math.log(1.0E-11d + d) * 20.0d) / Math.log(2.0d));
        double d2 = 1.0d;
        double pow = Math.pow(d, 1.0d / ((double) log));
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(Float.valueOf(100.0f));
        for (int i = 0; i < log - 1; i++) {
            d2 *= pow;
            A0s.add(Float.valueOf((float) (100.0d * d2)));
        }
        A0s.add(Float.valueOf(f * 100.0f));
        return A0s;
    }

    public static Range A01(CameraCharacteristics cameraCharacteristics) {
        Float valueOf;
        Float valueOf2;
        float f;
        List A0f;
        if (!A01) {
            Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            List A022 = A02(f);
            if (A022 == null) {
                A0f = Collections.emptyList();
            } else {
                A0f = C1899593h.A0f(A022);
            }
            valueOf = (Float) C18290x4.A0k(A0f);
            valueOf2 = (Float) A0f.get(A0f.size() - 1);
        } else {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                Number number2 = (Number) range.getLower();
                Number number3 = (Number) range.getUpper();
                if (!(number2 == null || number3 == null)) {
                    valueOf = Float.valueOf(number2.floatValue() * 100.0f);
                    valueOf2 = Float.valueOf(number3.floatValue() * 100.0f);
                }
            }
            return A00;
        }
        return new Range(valueOf, valueOf2);
    }

    public static List A03(CameraCharacteristics cameraCharacteristics) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null) {
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (long valueOf : jArr) {
            A0s.add(Long.valueOf(valueOf));
        }
        return C1899593h.A0f(A0s);
    }

    public static List A05(StreamConfigurationMap streamConfigurationMap, int i) {
        Size[] sizeArr;
        int length;
        if (streamConfigurationMap == null) {
            sizeArr = null;
        } else if (Build.VERSION.SDK_INT >= 23) {
            Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
            sizeArr = streamConfigurationMap.getOutputSizes(i);
            if (!(highResolutionOutputSizes == null || (length = highResolutionOutputSizes.length) == 0)) {
                sizeArr.getClass();
                int length2 = sizeArr.length;
                Size[] sizeArr2 = new Size[(length + length2)];
                System.arraycopy(highResolutionOutputSizes, 0, sizeArr2, 0, length);
                System.arraycopy(sizeArr, 0, sizeArr2, length, length2);
                sizeArr = sizeArr2;
            }
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(i);
        }
        return AnonymousClass9UA.A00(sizeArr);
    }

    public static boolean A07(CameraCharacteristics cameraCharacteristics) {
        DynamicRangeProfiles dynamicRangeProfiles;
        if (Build.VERSION.SDK_INT < 34 || !A06(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, cameraCharacteristics, 18) || (dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) == null) {
            return false;
        }
        boolean contains = dynamicRangeProfiles.getSupportedProfiles().contains(2L);
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return contains;
        }
        if (!contains || C159907mf.getInt("ro.build.version.oneui", 0) < 60100) {
            return false;
        }
        return true;
    }

    public static boolean A08(CameraCharacteristics cameraCharacteristics) {
        Number number;
        if (!A01 || cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) == null || !A0A(cameraCharacteristics, 0) || (number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null || number.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean A09(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 33) {
            return A06(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, cameraCharacteristics, 2);
        }
        return false;
    }

    public static boolean A0A(CameraCharacteristics cameraCharacteristics, int i) {
        Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        obj.getClass();
        int A0K = AnonymousClass001.A0K(obj);
        if (A0K == 2 || A0K < i) {
            return false;
        }
        return true;
    }

    public static boolean A0B(CameraCharacteristics cameraCharacteristics, List list) {
        if (Build.VERSION.SDK_INT < 34 || !A06(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, cameraCharacteristics, 18) || list == null || !AnonymousClass0x7.A1U(list, 4101)) {
            return false;
        }
        return true;
    }

    public static int A00(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 18;
            case 18:
                return 17;
            default:
                return -1;
        }
    }

    public static List A04(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List emptyList = Collections.emptyList();
        if (cameraExtensionCharacteristics == null || Build.VERSION.SDK_INT < 33) {
            return emptyList;
        }
        return cameraExtensionCharacteristics.getSupportedExtensions();
    }

    public static boolean A06(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i) {
        for (int i2 : C1899693i.A13(key, cameraCharacteristics)) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
