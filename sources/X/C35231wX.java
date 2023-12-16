package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1wX  reason: invalid class name and case insensitive filesystem */
public final class C35231wX extends C41032Ir {
    public static final ArrayList A00 = C18260x0.A0C("audio", "video");
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"audio_record_fatal_error", "crash", "detect_identity_change", "ended_by_peer", "ended_by_self", "ended_by_user", "peer-interrupted", "reconnecting", "self-interrupted", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, "unknown", "video_decoder_fatal_error", "video_encoder_fatal_error"});

    public C35231wX(UserJid userJid, UserJid userJid2, UserJid userJid3, UserJid userJid4, UserJid userJid5, Long l, String str, String str2, String str3) {
        C56052rL A04 = C56052rL.A04("call");
        C56052rL.A06(userJid, A04, "to");
        C56052rL.A06(userJid2, A04, "from");
        String str4 = str;
        if (C626836d.A0M(str4, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
        }
        C56052rL A042 = C56052rL.A04("call_info");
        Long l2 = l;
        if (C626836d.A0J(l2, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A042, l2, "duration");
        }
        C56052rL.A06(userJid3, A042, "terminator");
        UserJid userJid6 = userJid4;
        if (userJid4 != null) {
            C56052rL.A06(userJid6, A042, "adder");
        }
        UserJid userJid7 = userJid5;
        if (userJid5 != null) {
            C56052rL.A06(userJid7, A042, "creator");
        }
        A042.A0L(str2, "reason", A01);
        A042.A0K(str3, "mediatype", A00);
        C41032Ir.A06(A042, A04, this);
    }
}
