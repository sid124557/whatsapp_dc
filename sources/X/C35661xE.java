package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1xE  reason: invalid class name and case insensitive filesystem */
public final class C35661xE extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("false", "true");

    public C35661xE(UserJid userJid, C35361wk r19, C35361wk r20, C35361wk r21, C35361wk r22, C35361wk r23, C35361wk r24, C35261wa r25, Long l, Long l2, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "w:biz:catalog");
        C56052rL.A0C(A01, "smax_id", 35);
        C626836d.A0G(A01, str);
        C56052rL A04 = C56052rL.A04("collections");
        UserJid userJid2 = userJid;
        if (C626836d.A0L(userJid2, "collections->biz_jid")) {
            C56052rL.A06(userJid2, A04, "biz_jid");
        }
        C41032Ir.A0B(A04, r25);
        C56052rL A042 = C56052rL.A04("collection_limit");
        Long l3 = l;
        C18280x3.A0y(A042, l3, C626836d.A0J(l3, 0, 20, false) ? 1 : 0);
        C56052rL.A07(A042, A04);
        C56052rL A043 = C56052rL.A04("item_limit");
        Long l4 = l2;
        C18280x3.A0y(A043, l4, C626836d.A0J(l4, 0, 50, false) ? 1 : 0);
        C56052rL.A07(A043, A04);
        C18280x3.A0x(A04, r19);
        C41032Ir.A09(A04, r20);
        C18280x3.A0x(A04, r21);
        C18280x3.A0x(A04, r22);
        C18280x3.A0x(A04, r23);
        C41032Ir.A07(A04, A01, r24, this);
    }
}
