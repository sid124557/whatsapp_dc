package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7lZ  reason: invalid class name and case insensitive filesystem */
public class C159287lZ {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7JU A00(X.AnonymousClass7B8 r4) {
        /*
            java.lang.String r0 = "audio/"
            java.util.List r4 = A02(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r2 = r3.next()
            X.7JU r2 = (X.AnonymousClass7JU) r2
            java.lang.String r1 = r2.A02
            X.6xU r0 = X.C142616xU.CODEC_AUDIO_AAC
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0034
            X.6xU r0 = X.C142616xU.CODEC_AUDIO_MP3
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0012
        L_0x0034:
            int r1 = r4.size()
            r0 = 1
            if (r1 <= r0) goto L_0x003e
            A01(r4)
        L_0x003e:
            return r2
        L_0x003f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported audio codec. Contained "
            r1.append(r0)
            java.lang.String r0 = A01(r4)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.6O0 r0 = new X.6O0
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159287lZ.A00(X.7B8):X.7JU");
    }

    public static String A01(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(((AnonymousClass7JU) it.next()).A02);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("", A0o, list);
        A0o.append(" tracks: ");
        Iterator it2 = A0s.iterator();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (it2.hasNext()) {
            while (true) {
                A0o2.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A0o2.append(", ");
            }
        } else {
            A0o2.append("null, input is empty");
        }
        AnonymousClass000.A1B(A0o2, A0o);
        return A0o.toString();
    }

    public static List A02(AnonymousClass7B8 r7, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        MediaExtractor mediaExtractor = r7.A00;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string != null && string.startsWith(str)) {
                A0s.add(new AnonymousClass7JU(trackFormat, string, i));
            }
        }
        return A0s;
    }
}
