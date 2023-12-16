package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.List;

/* renamed from: X.81H  reason: invalid class name */
public class AnonymousClass81H implements C187008wI {
    public C160577nt BAc() {
        C160577nt r0;
        List A03 = C162317rh.A03("audio/raw", false);
        if (A03.isEmpty() || (r0 = (C160577nt) A03.get(0)) == null) {
            return null;
        }
        return new C160577nt((MediaCodecInfo.CodecCapabilities) null, r0.A02, (String) null, true, false, true, true, false, false);
    }

    public List B6o(String str, boolean z, boolean z2) {
        List A03 = C162317rh.A03(str, z);
        Log.d("MediaCodecSelector", AnonymousClass000.A0P(A03, "default mediacodec order:", AnonymousClass001.A0o()));
        return A03;
    }
}
