package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.1xD  reason: invalid class name and case insensitive filesystem */
public final class C35651xD extends C35201wU {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"dismiss", "exposure", "impression", "notification_received", "primary_click", "secondary_click"});

    public C35651xD(C35381wm r18, Long l, String str, String str2, String str3) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0E(A01, "xmlns", "w:comms");
        C56052rL A04 = C56052rL.A04("event");
        String str4 = str;
        if (C626836d.A0M(str4, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, "promotion_id", str4);
        }
        Long l2 = l;
        if (C626836d.A0J(l2, -9007199254740991L, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l2, "timestamp_sec");
        }
        String str5 = str2;
        if (C626836d.A0M(str5, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, "logdata", str5);
        }
        A04.A0L(str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C35201wU.A01(A04, A01, r18, this);
    }
}
