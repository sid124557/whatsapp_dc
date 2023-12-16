package X;

import java.util.HashMap;

/* renamed from: X.1OT  reason: invalid class name */
public class AnonymousClass1OT extends AnonymousClass3OK {
    public C624134x BgW(C55962rC r10) {
        if (AnonymousClass3OK.A00(r10) != 2) {
            return null;
        }
        String A01 = AnonymousClass3OK.A01(r10);
        AnonymousClass1CD r3 = C55962rC.A00(r10).peerDataOperationRequestResponseMessage_;
        if (r3 == null) {
            r3 = AnonymousClass1CD.DEFAULT_INSTANCE;
        }
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass1OR r7 = new AnonymousClass1OR(r10.A0D, A01, r10.A05);
        C188248ya<C21611Cm> r1 = r3.peerDataOperationResult_;
        boolean isEmpty = r1.isEmpty();
        Integer A0X = C18320x8.A0X();
        if (!isEmpty) {
            for (C21611Cm r2 : r1) {
                int i = r2.bitField0_;
                if ((i & 1) == 0) {
                    throw AnonymousClass24W.A01(A0X, "missing url result");
                } else if ((i & 4) != 0) {
                    C21841Dj r0 = r2.linkPreviewResponse_;
                    C21841Dj r4 = r0;
                    if (r0 == null) {
                        r0 = C21841Dj.DEFAULT_INSTANCE;
                    }
                    String str = r0.url_;
                    AnonymousClass23E A00 = AnonymousClass23E.A00(r2.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass23E.GENERAL_ERROR;
                    }
                    C21841Dj r02 = null;
                    if (A00 == AnonymousClass23E.SUCCESS) {
                        r02 = r4;
                        if (r4 == null) {
                            r02 = C21841Dj.DEFAULT_INSTANCE;
                        }
                    }
                    A0t.put(str, AnonymousClass0x9.A0C(A00, r02));
                } else {
                    throw AnonymousClass24W.A01(A0X, "missing url response msg");
                }
            }
            r7.A00 = A0t;
            return r7;
        }
        throw AnonymousClass24W.A01(A0X, "empty url result list");
    }
}
