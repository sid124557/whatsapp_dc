package X;

import android.media.MediaCodec;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8GK  reason: invalid class name */
public class AnonymousClass8GK implements C836849j {
    public final AnonymousClass1VX A00;

    public void BYP(C134256ih r15) {
        int i;
        boolean A0X = this.A00.A0X(422);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = AnonymousClass0x9.A0C("video/av01", "av1");
        pairArr[1] = AnonymousClass0x9.A0C("video/avc", "avc");
        pairArr[2] = AnonymousClass0x9.A0C("video/hevc", "hevc");
        r15.A1a = A00(AnonymousClass0x9.A1A(AnonymousClass0x9.A0C("video/x-vnd.on2.vp9", "vp9"), pairArr, 3), true);
        Pair[] pairArr2 = new Pair[4];
        pairArr2[0] = AnonymousClass0x9.A0C("video/av01", "av1");
        pairArr2[1] = AnonymousClass0x9.A0C("video/avc", "avc");
        pairArr2[2] = AnonymousClass0x9.A0C("video/hevc", "hevc");
        r15.A1Z = A00(AnonymousClass0x9.A1A(AnonymousClass0x9.A0C("video/x-vnd.on2.vp9", "vp9"), pairArr2, 3), false);
        int A02 = AnonymousClass8HT.A02(A0X);
        if (A02 == 1) {
            i = 0;
        } else if (A02 == 2) {
            i = 2;
        } else if (A02 != 3) {
            i = null;
        } else {
            i = 3;
        }
        r15.A0a = i;
    }

    public AnonymousClass8GK(AnonymousClass1VX r1) {
        this.A00 = r1;
    }

    public static final String A00(List list, boolean z) {
        boolean z2;
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            if (z) {
                try {
                    MediaCodec.createEncoderByType(str).release();
                } catch (Exception unused) {
                    z2 = false;
                }
            } else {
                MediaCodec.createDecoderByType(str).release();
            }
            z2 = true;
            if (z2) {
                if (A0o.length() != 0) {
                    AnonymousClass001.A1M(A0o);
                }
                A0o.append((String) pair.second);
            }
        }
        return A0o.toString();
    }
}
