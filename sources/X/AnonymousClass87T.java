package X;

import android.media.MediaCodecInfo;

/* renamed from: X.87T  reason: invalid class name */
public final class AnonymousClass87T implements C185618ty {
    public MediaCodecInfo[] A00;
    public final int A01;

    public int B5c() {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = AnonymousClass6C9.A1X(this.A01);
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    public MediaCodecInfo B5d(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = AnonymousClass6C9.A1X(this.A01);
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public boolean Bkx() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r3 != false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass87T(boolean r2, boolean r3) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L_0x0008
            r0 = 0
            if (r3 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87T.<init>(boolean, boolean):void");
    }

    public boolean BHZ(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public boolean BHa(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
