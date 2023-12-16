package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.81K  reason: invalid class name */
public final class AnonymousClass81K implements C185548tr {
    public boolean BHa(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
            return false;
        }
        return true;
    }

    public boolean Bkx() {
        return false;
    }

    public int B5c() {
        return MediaCodecList.getCodecCount();
    }

    public MediaCodecInfo B5d(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public boolean BHZ(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return false;
    }
}
