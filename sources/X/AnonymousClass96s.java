package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.96s  reason: invalid class name */
public final class AnonymousClass96s extends C195049Vr implements Cloneable {
    public Rect A00;
    public Rect A01;
    public AnonymousClass9T4 A02;
    public AnonymousClass9T4 A03;
    public AnonymousClass9T4 A04;
    public AnonymousClass9T4 A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Double A0C;
    public Double A0D;
    public Double A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Long A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public final AnonymousClass96p A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = new int[2];

    public String A09() {
        String str;
        StringBuilder sb = new StringBuilder(1000);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(C195049Vr.A05(this.A0X));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0a);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0b);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        AnonymousClass9T4 r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            AnonymousClass9T4.A00(r0, sb);
        } else {
            sb.append(str2);
        }
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(C195049Vr.A05(this.A0Y));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mPictureSize");
        sb.append('=');
        AnonymousClass9T4 r02 = this.A03;
        if (r02 != null) {
            AnonymousClass9T4.A00(r02, sb);
        } else {
            sb.append(str2);
        }
        sb.append(",mYuvPictureSize");
        sb.append('=');
        sb.append(str2);
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0d;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        AnonymousClass9T4 r03 = this.A04;
        if (r03 != null) {
            AnonymousClass9T4.A00(r03, sb);
        } else {
            sb.append(str2);
        }
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mIsPreviewStabilizationEnabled");
        sb.append('=');
        sb.append(false);
        sb.append(",mVideoSize");
        sb.append('=');
        AnonymousClass9T4 r04 = this.A05;
        if (r04 != null) {
            AnonymousClass9T4.A00(r04, sb);
        } else {
            sb.append(str2);
        }
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        if (rect != null) {
            str = rect.flattenToString();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        sb.append(str2);
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0W);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mVideoRotation");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSourceConfig");
        sb.append('=');
        return AnonymousClass000.A0X(this.A0c, sb);
    }

    public void A0A(AnonymousClass9Mx r7, Object obj) {
        int i = r7.A00;
        if (i == 3) {
            this.A0A = (Boolean) obj;
        } else if (i == 27) {
            this.A0V = (Long) obj;
        } else if (i == 42) {
            this.A0W = (String) obj;
        } else if (i == 45) {
            this.A06 = (Boolean) obj;
        } else if (i == 52) {
        } else {
            if (i == 57) {
                this.A09 = (Boolean) obj;
            } else if (i != 59) {
                switch (i) {
                    case 8:
                        this.A0B = (Boolean) obj;
                        return;
                    case 9:
                        this.A0J = (Integer) obj;
                        return;
                    case 10:
                        this.A0I = (Integer) obj;
                        return;
                    case 11:
                        this.A0F = (Integer) obj;
                        return;
                    case 12:
                        this.A0G = (Integer) obj;
                        return;
                    case 13:
                        this.A0H = (Integer) obj;
                        return;
                    case 14:
                        this.A0L = (Integer) obj;
                        return;
                    case 15:
                        this.A0M = (Integer) obj;
                        return;
                    default:
                        switch (i) {
                            case 17:
                                this.A0O = (Integer) obj;
                                return;
                            case 18:
                                this.A0P = (Integer) obj;
                                return;
                            case 19:
                                this.A0Q = (Integer) obj;
                                return;
                            default:
                                switch (i) {
                                    case 21:
                                        this.A0N = (Integer) obj;
                                        return;
                                    case 22:
                                        this.A0K = (Integer) obj;
                                        return;
                                    case 23:
                                        this.A0R = (Integer) obj;
                                        return;
                                    case 24:
                                        this.A0T = (Integer) obj;
                                        return;
                                    case 25:
                                        this.A0U = (Integer) obj;
                                        return;
                                    default:
                                        Rect rect = null;
                                        switch (i) {
                                            case 30:
                                                this.A0C = (Double) obj;
                                                return;
                                            case 31:
                                                this.A0E = (Double) obj;
                                                return;
                                            case 32:
                                                this.A0D = (Double) obj;
                                                return;
                                            case 33:
                                                AnonymousClass9T4 r8 = (AnonymousClass9T4) obj;
                                                this.A04 = r8;
                                                if (r8 != null) {
                                                    rect = new Rect(0, 0, r8.A02, r8.A01);
                                                }
                                                this.A01 = rect;
                                                return;
                                            case 34:
                                                AnonymousClass9T4 r82 = (AnonymousClass9T4) obj;
                                                this.A03 = r82;
                                                if (r82 != null) {
                                                    rect = new Rect(0, 0, r82.A02, r82.A01);
                                                }
                                                this.A00 = rect;
                                                return;
                                            case 35:
                                                this.A05 = (AnonymousClass9T4) obj;
                                                return;
                                            case 36:
                                                this.A02 = (AnonymousClass9T4) obj;
                                                return;
                                            case 37:
                                                this.A0X = AnonymousClass9UT.A00((List) obj);
                                                return;
                                            case 38:
                                                this.A0Y = AnonymousClass9UT.A00((List) obj);
                                                return;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                if (iArr != null && iArr.length == 2) {
                                                    int[] iArr2 = this.A0d;
                                                    iArr2[0] = iArr[0];
                                                    iArr2[1] = iArr[1];
                                                    return;
                                                }
                                                return;
                                            default:
                                                throw C1899593h.A0Y("Cannot directly set: ", AnonymousClass001.A0o(), i);
                                        }
                                }
                        }
                }
            } else {
                this.A0S = (Integer) obj;
            }
        }
    }

    public AnonymousClass96s(Camera.Parameters parameters, AnonymousClass96p r7) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        AnonymousClass9T4 r0;
        Camera.Size size2;
        Boolean bool = Boolean.FALSE;
        this.A07 = bool;
        this.A08 = bool;
        Integer A0Z2 = C18290x4.A0Z();
        this.A0H = A0Z2;
        this.A0Q = A0Z2;
        this.A0B = bool;
        Double A0Z3 = AnonymousClass6C8.A0Z();
        this.A0C = A0Z3;
        this.A0E = A0Z3;
        this.A0D = A0Z3;
        this.A0V = AnonymousClass0x2.A0T();
        this.A0N = A0Z2;
        this.A0K = A0Z2;
        this.A09 = bool;
        this.A0S = A0Z2;
        this.A06 = Boolean.TRUE;
        this.A0c = parameters.flatten();
        this.A0Z = r7;
        this.A0J = Integer.valueOf(AnonymousClass9WX.A03(parameters.getFocusMode()));
        this.A0F = Integer.valueOf(AnonymousClass9WX.A00(parameters.getAntibanding()));
        this.A0G = Integer.valueOf(AnonymousClass9WX.A01(parameters.getColorEffect()));
        if (C194899Ux.A04(C194899Ux.A01, r7)) {
            this.A07 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (C194899Ux.A04(C194899Ux.A04, r7)) {
            this.A08 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0I = Integer.valueOf(AnonymousClass9WX.A02(parameters.getFlashMode()));
        if (C194899Ux.A04(C194899Ux.A0C, r7)) {
            this.A0H = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (C194899Ux.A04(C194899Ux.A0O, r7)) {
            emptyList = AnonymousClass9UT.A00(C195139We.A02(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0X = emptyList;
        this.A0a = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0b = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0L = Integer.valueOf(parameters.getJpegQuality());
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid jpeg thumbnail quality parameter string=");
            Log.e("ParametersHelper", AnonymousClass000.A0X(parameters.get("jpeg-thumbnail-quality"), A0o), e);
            i = 85;
        }
        this.A0M = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new AnonymousClass9T4(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (C194899Ux.A04(C194899Ux.A0P, r7)) {
            emptyList2 = AnonymousClass9UT.A00(C195139We.A02(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0Y = emptyList2;
        this.A0O = Integer.valueOf(parameters.getPictureFormat());
        AnonymousClass9T4 r3 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        AnonymousClass9Mx r4 = C195049Vr.A0h;
        if (size != null) {
            r0 = new AnonymousClass9T4(size.width, size.height);
        } else {
            r0 = null;
        }
        A0A(r4, r0);
        this.A0P = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (!r7.A0Y.isEmpty()) {
            this.A0Q = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0R = Integer.valueOf(AnonymousClass9WX.A04(parameters.getSceneMode()));
        this.A0A = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0T = Integer.valueOf(AnonymousClass9WX.A05(parameters.getWhiteBalance()));
        this.A0U = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A0A(C195049Vr.A0n, size2 != null ? new AnonymousClass9T4(size2.width, size2.height) : r3);
    }

    public Object clone() {
        return super.clone();
    }
}
