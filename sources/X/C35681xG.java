package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1xG  reason: invalid class name and case insensitive filesystem */
public final class C35681xG extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("HPP_PAYMENT_LINK", "UPI");

    public C35681xG(UserJid userJid, C35371wl r18, C35371wl r19, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0E(A01, "xmlns", "w:pay");
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "upi-get-p2m-checkout-session");
        String str8 = str;
        if (C626836d.A0M(str8, 1, 100, false)) {
            C56052rL.A0D(A04, "payment_config_id", str8);
        }
        C56052rL.A06(userJid, A04, "receiver");
        String str9 = str2;
        if (C626836d.A0M(str9, 1, 100, false)) {
            C56052rL.A0D(A04, "order_id", str9);
        }
        Long l2 = l;
        if (l != null && C626836d.A0K(l2, true)) {
            C56052rL.A0A(A04, l2, "expiration_time_ms");
        }
        String str10 = str3;
        if (C626836d.A0M(str10, 1, 100, false)) {
            C56052rL.A0D(A04, "order_message_id", str10);
        }
        String str11 = str4;
        if (C626836d.A0M(str11, 1, 100, false)) {
            C56052rL.A0D(A04, "request_id", str11);
        }
        String str12 = str5;
        if (str5 != null && C626836d.A0M(str12, 1, 9007199254740991L, true)) {
            C56052rL.A0D(A04, "payment_gateway_type", str12);
        }
        String str13 = str6;
        if (str6 != null && C626836d.A0M(str13, 1, 9007199254740991L, true)) {
            C56052rL.A0D(A04, "order_data", str13);
        }
        A04.A0L(str7, "payment_type", A00);
        C41032Ir.A0E(A04, r18, "amount");
        C41032Ir.A07(A04, A01, r19, this);
    }
}
