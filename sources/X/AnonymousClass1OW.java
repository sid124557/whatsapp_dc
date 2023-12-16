package X;

import java.util.Map;

/* renamed from: X.1OW  reason: invalid class name */
public class AnonymousClass1OW extends AnonymousClass3OK {
    public C624134x BgW(C55962rC r9) {
        AnonymousClass1EA r0;
        if (AnonymousClass3OK.A00(r9) != 0) {
            return null;
        }
        AnonymousClass1OS r5 = new AnonymousClass1OS(r9.A0D, AnonymousClass3OK.A01(r9), r9.A05);
        AnonymousClass1CD r02 = C55962rC.A00(r9).peerDataOperationRequestResponseMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1CD.DEFAULT_INSTANCE;
        }
        C188248ya<C21611Cm> r1 = r02.peerDataOperationResult_;
        boolean isEmpty = r1.isEmpty();
        Integer A0X = C18320x8.A0X();
        if (!isEmpty) {
            for (C21611Cm r6 : r1) {
                int i = r6.bitField0_;
                if ((i & 1) == 0) {
                    throw AnonymousClass24W.A01(A0X, "missing sticker result");
                } else if ((i & 2) != 0) {
                    AnonymousClass1EA r03 = r6.stickerMessage_;
                    if (r03 == null) {
                        r03 = AnonymousClass1EA.DEFAULT_INSTANCE;
                    }
                    String A0t = C18290x4.A0t(r03.fileSha256_.A07());
                    AnonymousClass23E A00 = AnonymousClass23E.A00(r6.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass23E.GENERAL_ERROR;
                    }
                    boolean A1Y = AnonymousClass000.A1Y(A00, AnonymousClass23E.SUCCESS);
                    Map map = r5.A00;
                    if (A1Y) {
                        r0 = r6.stickerMessage_;
                        if (r0 == null) {
                            r0 = AnonymousClass1EA.DEFAULT_INSTANCE;
                        }
                    } else {
                        r0 = null;
                    }
                    map.put(A0t, AnonymousClass0x9.A0C(A00, r0));
                } else {
                    throw AnonymousClass24W.A01(A0X, "missing sticker response msg");
                }
            }
            return r5;
        }
        throw AnonymousClass24W.A01(A0X, "empty sticker result list");
    }
}
