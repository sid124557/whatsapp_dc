package X;

import android.graphics.RectF;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7jf  reason: invalid class name and case insensitive filesystem */
public class C158247jf {
    public static final RectF A0K = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public int A00;
    public int A01 = 30;
    public int A02 = 10;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public RectF A0C = A0K;
    public C142296wy A0D;
    public AnonymousClass7YY A0E;
    public String A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;

    public int A00() {
        C162477s9.A04(this.A0E, "MediaTranscodeParams", "transcode profile level: %s");
        AnonymousClass7YY r1 = this.A0E;
        if (r1 != null) {
            C142616xU r0 = C142616xU.CODEC_VIDEO_HEVC;
            C142616xU r2 = r1.A02;
            if (r0.equals(r2) || 1 != r1.A01 || !C142616xU.CODEC_VIDEO_H264.equals(r2)) {
                int i = this.A03;
                if (i == -1) {
                    int i2 = this.A00;
                    i = AnonymousClass6C9.A0B((int) (((double) i2) * 0.85d), 655000, i2);
                    this.A03 = i;
                }
                C162477s9.A04(Integer.valueOf(i), "MediaTranscodeParams", "using main/high bitrate: %s");
                return this.A03;
            }
        }
        C162477s9.A04(Integer.valueOf(this.A00), "MediaTranscodeParams", "using baseline bitrate: %s");
        return this.A00;
    }

    public String toString() {
        Integer valueOf;
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("sourceWidth", Integer.valueOf(this.A07));
        A0t.put("sourceHeight", Integer.valueOf(this.A05));
        A0t.put("sourceRotationDegreesClockwise", Integer.valueOf(this.A06));
        A0t.put("targetWidth", Integer.valueOf(this.A0A));
        A0t.put("targetHeight", Integer.valueOf(this.A08));
        A0t.put("outputAspectRatio", Float.valueOf(0.0f));
        A0t.put("shouldRetainAspectRatio", Boolean.valueOf(this.A0J));
        A0t.put("targetRotationDegreesClockwise", Integer.valueOf(this.A09));
        A0t.put("outputRotationDegreesClockwise", Integer.valueOf(this.A04));
        A0t.put("cropRectangle", this.A0C);
        C142296wy r0 = this.A0D;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.mValue);
        }
        A0t.put("videoMirroringMode", valueOf);
        A0t.put("baselineBitRate", Integer.valueOf(this.A00));
        A0t.put("mainHighBitRate", Integer.valueOf(this.A03));
        A0t.put("frameRate", Integer.valueOf(this.A01));
        A0t.put("iframeinterval", Integer.valueOf(this.A02));
        A0t.put("videoBitrateMode", Integer.valueOf(this.A0B));
        A0t.put("videoTranscodeProfileLevelParams", this.A0E);
        A0t.put("glRenderers", this.A0G);
        A0t.put("debugStats", this.A0F);
        A0t.put("forceAvcEncoding", Boolean.valueOf(this.A0H));
        return C159297la.A01(C158247jf.class, A0t);
    }
}
