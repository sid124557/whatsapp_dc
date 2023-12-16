package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.0Ri  reason: invalid class name and case insensitive filesystem */
public final class C04960Ri {
    public static AnonymousClass0Tq A00(View view, AnonymousClass0Tq r3) {
        ContentInfo A01 = r3.A01();
        ContentInfo performReceiveContent = view.performReceiveContent(A01);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == A01) {
            return r3;
        }
        return AnonymousClass0Tq.A00(performReceiveContent);
    }

    public static String[] A01(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
