package X;

import android.media.MediaCodec;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7la  reason: invalid class name and case insensitive filesystem */
public final class C159297la {
    public static final String A00(MediaCodec.CodecException codecException) {
        Object obj;
        C162457s7.A0J(codecException, 0);
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        if (Build.VERSION.SDK_INT >= 23) {
            obj = Integer.valueOf(codecException.getErrorCode());
        } else {
            obj = "null";
        }
        objArr[0] = obj;
        objArr[1] = codecException.getDiagnosticInfo();
        AnonymousClass001.A1S(objArr, codecException.isRecoverable());
        objArr[3] = Boolean.valueOf(codecException.isTransient());
        return C86654Ky.A0n(locale, "mediaCodecErrorCode: %s, mediaCodecErrorDiagnosticInfo: %s, isRecoverable: %s, isTransient: %s", Arrays.copyOf(objArr, 4));
    }

    public static final String A01(Class cls, Map map) {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(32);
        A0Y.append(cls.getSimpleName());
        A0Y.append('{');
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            Object value = A0w.getValue();
            A0Y.append(A0q2);
            A0Y.append('=');
            A0Y.append(value);
            AnonymousClass001.A1M(A0Y);
        }
        if (A0Y.charAt(A0Y.length() - 2) == ',') {
            A0Y.delete(A0Y.length() - 2, A0Y.length());
        }
        String A0d = AnonymousClass000.A0d(A0Y);
        C162457s7.A0D(A0d);
        return A0d;
    }

    public static final void A02(boolean z, String str) {
        if (!z) {
            if (str == null) {
                str = "";
            }
            throw AnonymousClass001.A0c(str);
        }
    }
}
