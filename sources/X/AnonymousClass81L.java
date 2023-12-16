package X;

import android.media.MediaCodecInfo;

/* renamed from: X.81L  reason: invalid class name */
public final class AnonymousClass81L implements C185548tr {
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

    public AnonymousClass81L(boolean z) {
        this.A01 = AnonymousClass6C9.A1L(z ? 1 : 0) ? 1 : 0;
    }

    public boolean BHZ(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public boolean BHa(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
