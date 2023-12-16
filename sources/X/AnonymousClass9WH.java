package X;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9WH  reason: invalid class name */
public class AnonymousClass9WH {
    public static final AtomicInteger A05 = new AtomicInteger(Integer.MIN_VALUE);
    public final int A00;
    public final Camera.Parameters A01;
    public final Camera A02;
    public final AnonymousClass96p A03;
    public final AnonymousClass96s A04;

    public static String A00(int i) {
        if (i == 0) {
            return "auto";
        }
        switch (i) {
            case 2:
                return "action";
            case 3:
                return "portrait";
            case 4:
                return "landscape";
            case 5:
                return "night";
            case 6:
                return "night-portrait";
            case 7:
                return "theatre";
            case 8:
                return "beach";
            case 9:
                return "snow";
            case 10:
                return "sunset";
            case 11:
                return "steadyphoto";
            case 12:
                return "fireworks";
            case 13:
                return "sports";
            case 14:
                return "party";
            case 15:
                return "candlelight";
            case 16:
                return "barcode";
            case 17:
                return "hdr";
            default:
                return null;
        }
    }

    public boolean A02(AnonymousClass9Mx r11, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        int i2 = r11.A00;
        int i3 = 0;
        if (i2 != 2) {
            if (i2 == 3) {
                obj.getClass();
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (C194899Ux.A04(C194899Ux.A0T, this.A03) && !C194989Vk.A02(AnonymousClass9UY.A07)) {
                    this.A01.setVideoStabilization(booleanValue);
                    this.A04.A0A(C195049Vr.A0X, bool);
                    return true;
                }
            } else if (i2 == 27) {
                obj.getClass();
                Number number = (Number) obj;
                this.A01.setGpsTimestamp(number.longValue());
                this.A04.A0A(C195049Vr.A0H, number);
                return true;
            } else if (i2 == 42) {
                String str6 = (String) obj;
                this.A01.setGpsProcessingMethod(str6);
                this.A04.A0A(C195049Vr.A0G, str6);
                return true;
            } else if (i2 == 45) {
                obj.getClass();
                this.A04.A0A(C195049Vr.A0L, obj);
                return true;
            } else if (i2 == 52) {
                Object obj2 = null;
                if (C194899Ux.A04(C194899Ux.A0B, this.A03)) {
                    AnonymousClass96s r1 = this.A04;
                    AnonymousClass9Mx r0 = C195049Vr.A0i;
                    obj2.getClass();
                    r1.A0A(r0, obj2);
                    throw AnonymousClass001.A0g("getCaptureRequestKeys");
                }
            } else if (i2 == 57) {
                obj.getClass();
                if (this.A00 == 1) {
                    if (C194899Ux.A04(C194899Ux.A0E, this.A03)) {
                        this.A04.A0A(C195049Vr.A0S, obj);
                        return true;
                    }
                }
            } else if (i2 != 59) {
                switch (i2) {
                    case 8:
                        obj.getClass();
                        Boolean bool2 = (Boolean) obj;
                        boolean booleanValue2 = bool2.booleanValue();
                        if (!C194989Vk.A02(AnonymousClass9UY.A06)) {
                            this.A01.setRecordingHint(booleanValue2);
                            this.A04.A0A(C195049Vr.A0o, bool2);
                            return true;
                        }
                        break;
                    case 9:
                        obj.getClass();
                        Number number2 = (Number) obj;
                        switch (number2.intValue()) {
                            case 0:
                                str4 = "fixed";
                                break;
                            case 1:
                                str4 = "auto";
                                break;
                            case 2:
                                str4 = "macro";
                                break;
                            case 3:
                                str4 = "continuous-video";
                                break;
                            case 4:
                                str4 = "continuous-picture";
                                break;
                            case 5:
                                str4 = "edof";
                                break;
                            case 6:
                                str4 = "infinity";
                                break;
                            default:
                                return false;
                        }
                        if (A01(C194899Ux.A0k, this.A03, number2)) {
                            this.A01.setFocusMode(str4);
                            this.A04.A0A(C195049Vr.A0C, number2);
                            return true;
                        }
                        break;
                    case 10:
                        obj.getClass();
                        Number number3 = (Number) obj;
                        int intValue = number3.intValue();
                        if (intValue == 0) {
                            str3 = "off";
                        } else if (intValue == 1) {
                            str3 = "on";
                        } else if (intValue == 2) {
                            str3 = "auto";
                        } else if (intValue == 3) {
                            str3 = "torch";
                        } else if (intValue == 4) {
                            str3 = "red-eye";
                        }
                        if (A01(C194899Ux.A0j, this.A03, number3)) {
                            this.A01.setFlashMode(str3);
                            this.A04.A0A(C195049Vr.A0A, number3);
                            return true;
                        }
                        break;
                    case 11:
                        obj.getClass();
                        Number number4 = (Number) obj;
                        int intValue2 = number4.intValue();
                        if (intValue2 == 0) {
                            str2 = "off";
                        } else if (intValue2 == 1) {
                            str2 = "50hz";
                        } else if (intValue2 == 2) {
                            str2 = "60hz";
                        } else if (intValue2 == 3) {
                            str2 = "auto";
                        }
                        if (A01(C194899Ux.A0e, this.A03, number4)) {
                            this.A01.setAntibanding(str2);
                            this.A04.A0A(C195049Vr.A00, number4);
                            return true;
                        }
                        break;
                    case 12:
                        obj.getClass();
                        Number number5 = (Number) obj;
                        switch (number5.intValue()) {
                            case 0:
                                str = "none";
                                break;
                            case 1:
                                str = "mono";
                                break;
                            case 2:
                                str = "negative";
                                break;
                            case 3:
                                str = "solarize";
                                break;
                            case 4:
                                str = "sepia";
                                break;
                            case 5:
                                str = "posterize";
                                break;
                            case 6:
                                str = "whiteboard";
                                break;
                            case 7:
                                str = "blackboard";
                                break;
                            case 8:
                                str = "aqua";
                                break;
                            default:
                                return false;
                        }
                        if (A01(C194899Ux.A0g, this.A03, number5)) {
                            this.A01.setColorEffect(str);
                            this.A04.A0A(C195049Vr.A06, number5);
                            return true;
                        }
                        break;
                    case 13:
                        obj.getClass();
                        Number number6 = (Number) obj;
                        int intValue3 = number6.intValue();
                        if (C194899Ux.A04(C194899Ux.A0C, this.A03)) {
                            this.A01.setExposureCompensation(intValue3);
                            this.A04.A0A(C195049Vr.A08, number6);
                            return true;
                        }
                        break;
                    case 14:
                        obj.getClass();
                        Number number7 = (Number) obj;
                        int intValue4 = number7.intValue();
                        if (intValue4 > 0 && intValue4 <= 100) {
                            this.A01.setJpegQuality(intValue4);
                            this.A04.A0A(C195049Vr.A0Y, number7);
                            return true;
                        }
                    case 15:
                        obj.getClass();
                        Number number8 = (Number) obj;
                        int intValue5 = number8.intValue();
                        if (intValue5 > 0 && intValue5 <= 100) {
                            this.A01.setJpegThumbnailQuality(intValue5);
                            this.A04.A0A(C195049Vr.A0Z, number8);
                            return true;
                        }
                    default:
                        switch (i2) {
                            case 17:
                                obj.getClass();
                                Number number9 = (Number) obj;
                                int intValue6 = number9.intValue();
                                if (A01(C194899Ux.A0m, this.A03, number9)) {
                                    this.A01.setPictureFormat(intValue6);
                                    this.A04.A0A(C195049Vr.A0f, number9);
                                    return true;
                                }
                                break;
                            case 18:
                                obj.getClass();
                                Number number10 = (Number) obj;
                                int intValue7 = number10.intValue();
                                if (A01(C194899Ux.A0o, this.A03, number10)) {
                                    this.A01.setPreviewFormat(intValue7);
                                    this.A04.A0A(C195049Vr.A0j, number10);
                                    return true;
                                }
                                break;
                            case 19:
                                obj.getClass();
                                Number number11 = (Number) obj;
                                int intValue8 = number11.intValue();
                                if (A01(C194899Ux.A0q, this.A03, number11)) {
                                    this.A01.setPreviewFrameRate(intValue8);
                                    this.A04.A0A(C195049Vr.A0l, number11);
                                    return true;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        obj.getClass();
                                        Number number12 = (Number) obj;
                                        int intValue9 = number12.intValue();
                                        Camera.Parameters parameters = this.A01;
                                        parameters.setRotation(intValue9);
                                        AnonymousClass96s r12 = this.A04;
                                        r12.A0A(C195049Vr.A0d, number12);
                                        if (C195049Vr.A07(C195049Vr.A0S, r12)) {
                                            if (C194899Ux.A04(C194899Ux.A0E, this.A03)) {
                                                if (intValue9 == 90 || intValue9 == 270) {
                                                    parameters.set("snapshot-picture-flip", "flip-v");
                                                    return true;
                                                }
                                                parameters.set("snapshot-picture-flip", "flip-h");
                                                return true;
                                            }
                                        }
                                        break;
                                    case 22:
                                        obj.getClass();
                                        Number number13 = (Number) obj;
                                        int intValue10 = number13.intValue();
                                        AnonymousClass9PY r02 = this.A03.A00;
                                        if (r02 != null) {
                                            this.A01.set(r02.A03, (String) r02.A01.get(intValue10));
                                            this.A04.A0A(C195049Vr.A0J, number13);
                                            return true;
                                        }
                                        break;
                                    case 23:
                                        obj.getClass();
                                        Number number14 = (Number) obj;
                                        String A002 = A00(number14.intValue());
                                        if (A002 != null) {
                                            if (A01(C194899Ux.A0u, this.A03, number14)) {
                                                this.A01.setSceneMode(A002);
                                                this.A04.A0A(C195049Vr.A0p, number14);
                                                return true;
                                            }
                                        }
                                        break;
                                    case 24:
                                        obj.getClass();
                                        Number number15 = (Number) obj;
                                        switch (number15.intValue()) {
                                            case 1:
                                                str5 = "auto";
                                                break;
                                            case 2:
                                                str5 = "incandescent";
                                                break;
                                            case 3:
                                                str5 = "fluorescent";
                                                break;
                                            case 4:
                                                str5 = "warm-fluorescent";
                                                break;
                                            case 5:
                                                str5 = "daylight";
                                                break;
                                            case 6:
                                                str5 = "cloudy-daylight";
                                                break;
                                            case 7:
                                                str5 = "twilight";
                                                break;
                                            case 8:
                                                str5 = "shade";
                                                break;
                                        }
                                        if (A01(C194899Ux.A0y, this.A03, number15)) {
                                            this.A01.setWhiteBalance(str5);
                                            this.A04.A0A(C195049Vr.A0v, number15);
                                            return true;
                                        }
                                        break;
                                    case 25:
                                        obj.getClass();
                                        Number number16 = (Number) obj;
                                        int intValue11 = number16.intValue();
                                        if (C194899Ux.A04(C194899Ux.A0W, this.A03)) {
                                            this.A01.setZoom(intValue11);
                                            this.A04.A0A(C195049Vr.A0x, number16);
                                            return true;
                                        }
                                        break;
                                    default:
                                        List list = null;
                                        switch (i2) {
                                            case 30:
                                                obj.getClass();
                                                Number number17 = (Number) obj;
                                                this.A01.setGpsAltitude(number17.doubleValue());
                                                this.A04.A0A(C195049Vr.A0D, number17);
                                                return true;
                                            case 31:
                                                obj.getClass();
                                                Number number18 = (Number) obj;
                                                this.A01.setGpsLongitude(number18.doubleValue());
                                                this.A04.A0A(C195049Vr.A0F, number18);
                                                return true;
                                            case 32:
                                                obj.getClass();
                                                Number number19 = (Number) obj;
                                                this.A01.setGpsLatitude(number19.doubleValue());
                                                this.A04.A0A(C195049Vr.A0E, number19);
                                                return true;
                                            case 33:
                                                AnonymousClass9T4 r122 = (AnonymousClass9T4) obj;
                                                if (A01(C194899Ux.A0r, this.A03, r122)) {
                                                    Camera.Parameters parameters2 = this.A01;
                                                    r122.getClass();
                                                    parameters2.setPreviewSize(r122.A02, r122.A01);
                                                    this.A04.A0A(C195049Vr.A0n, r122);
                                                    break;
                                                }
                                                break;
                                            case 34:
                                                AnonymousClass9T4 r123 = (AnonymousClass9T4) obj;
                                                if (A01(C194899Ux.A0n, this.A03, r123)) {
                                                    Camera.Parameters parameters3 = this.A01;
                                                    r123.getClass();
                                                    parameters3.setPictureSize(r123.A02, r123.A01);
                                                    this.A04.A0A(C195049Vr.A0h, r123);
                                                    return true;
                                                }
                                                break;
                                            case 35:
                                                if (C194899Ux.A04(C194899Ux.A0B, this.A03)) {
                                                    Camera.Parameters parameters4 = this.A01;
                                                    obj.getClass();
                                                    parameters4.set("video-size", obj.toString());
                                                }
                                                this.A04.A0A(C195049Vr.A0u, obj);
                                                return true;
                                            case 36:
                                                obj.getClass();
                                                AnonymousClass9T4 r124 = (AnonymousClass9T4) obj;
                                                this.A01.setJpegThumbnailSize(r124.A02, r124.A01);
                                                this.A04.A0A(C195049Vr.A0a, r124);
                                                return true;
                                            case 37:
                                                List list2 = (List) obj;
                                                AnonymousClass96p r2 = this.A03;
                                                if (C194899Ux.A04(C194899Ux.A0O, r2)) {
                                                    list2.getClass();
                                                    if (list2.size() <= C194899Ux.A01(C194899Ux.A0Y, r2)) {
                                                        Camera.Parameters parameters5 = this.A01;
                                                        if (!list2.isEmpty()) {
                                                            list = list2;
                                                        }
                                                        parameters5.setFocusAreas(list);
                                                        this.A04.A0A(C195049Vr.A0B, list2);
                                                        return true;
                                                    }
                                                }
                                                break;
                                            case 38:
                                                List list3 = (List) obj;
                                                AnonymousClass96p r22 = this.A03;
                                                if (C194899Ux.A04(C194899Ux.A0P, r22)) {
                                                    list3.getClass();
                                                    if (list3.size() <= C194899Ux.A01(C194899Ux.A0Z, r22)) {
                                                        Camera.Parameters parameters6 = this.A01;
                                                        if (!list3.isEmpty()) {
                                                            list = list3;
                                                        }
                                                        parameters6.setMeteringAreas(list);
                                                        this.A04.A0A(C195049Vr.A0c, list3);
                                                        return true;
                                                    }
                                                }
                                                break;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                List<int[]> A032 = C194899Ux.A03(C194899Ux.A0p, this.A03);
                                                if (!(A032 == null || iArr == null)) {
                                                    for (int[] iArr2 : A032) {
                                                        int i4 = iArr2[0];
                                                        int i5 = iArr[0];
                                                        if (i4 == i5 && iArr2[1] == (i = iArr[1])) {
                                                            this.A01.setPreviewFpsRange(i5, i);
                                                            this.A04.A0A(C195049Vr.A0k, iArr);
                                                            return true;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                throw C1899593h.A0Y("Invalid Settings key: ", AnonymousClass001.A0o(), i2);
                                        }
                                }
                        }
                }
            } else {
                AnonymousClass96s r4 = this.A04;
                if (C195049Vr.A07(C195049Vr.A0S, r4)) {
                    if (C194899Ux.A04(C194899Ux.A0E, this.A03)) {
                        obj.getClass();
                        Number number20 = (Number) obj;
                        int intValue12 = number20.intValue();
                        r4.A0A(C195049Vr.A0t, number20);
                        if (intValue12 == 90 || intValue12 == 270) {
                            this.A01.set("video-flip", "flip-v");
                            return true;
                        }
                        this.A01.set("video-flip", "flip-h");
                        return true;
                    }
                }
            }
            return false;
        }
        obj.getClass();
        boolean A1Z = AnonymousClass001.A1Z(obj);
        if (C194899Ux.A04(C194899Ux.A0F, this.A03)) {
            if (A1Z) {
                i3 = 17;
            }
            this.A01.setSceneMode(A00(i3));
            this.A04.A0A(C195049Vr.A0p, Integer.valueOf(i3));
            if (A1Z) {
                A02(C195049Vr.A0o, Boolean.FALSE);
                return true;
            }
        }
        return false;
        return true;
    }

    public AnonymousClass9WH(Camera.Parameters parameters, Camera camera, AnonymousClass96p r3, AnonymousClass96s r4, int i) {
        this.A02 = camera;
        this.A01 = parameters;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
    }

    public static boolean A01(C193049Mw r0, C194899Ux r1, Object obj) {
        List list = (List) r1.A05(r0);
        if (list == null || obj == null || !list.contains(obj)) {
            return false;
        }
        return true;
    }
}
