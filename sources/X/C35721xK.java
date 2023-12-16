package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xK  reason: invalid class name and case insensitive filesystem */
public class C35721xK extends C35201wU {
    public C35721xK(C35351wj r3, int i) {
        String str;
        C56052rL A01 = C56052rL.A01();
        switch (i) {
            case 0:
                str = "email";
                break;
            case 5:
                str = "add_to_waitlist";
                break;
            default:
                str = "user_state";
                break;
        }
        C35201wU.A01(C56052rL.A04(str), A01, r3, this);
    }

    public C35721xK(C35351wj r10, C35351wj r11, C35351wj r12, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "update-alias");
        String str2 = str;
        if (str != null && C626836d.A0M(str2, 1, 255, true)) {
            C56052rL.A0D(A04, "device_id", str);
        }
        C56052rL A042 = C56052rL.A04("alias");
        C41032Ir.A09(A042, r10);
        C41032Ir.A08(A042, r11);
        C56052rL.A07(A042, A04);
        C41032Ir.A07(A04, A01, r12, this);
    }

    public C35721xK(C35351wj r16, C35351wj r17, Long l, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "avatars");
        C56052rL.A0C(A01, "smax_id", 101);
        C56052rL.A06(C135206kI.A00, A01, "to");
        C41032Ir.A0E(A01, r16, "encryption_metadata");
        C56052rL A04 = C56052rL.A04("timestamp");
        Long l2 = l;
        C18280x3.A0y(A04, l2, C626836d.A0J(l2, 1, 9007199254740991L, false) ? 1 : 0);
        C56052rL.A07(A04, A01);
        C56052rL A042 = C56052rL.A04("fbid");
        String str2 = str;
        if (C626836d.A0M(str2, 1, 20, false)) {
            A042.A0J(str2);
        }
        C41032Ir.A07(A042, A01, r17, this);
    }

    public C35721xK(C35351wj r11, String str, int i) {
        C56052rL A04;
        C56052rL A042;
        boolean z;
        long j;
        long j2;
        C56052rL A01 = C56052rL.A01();
        if (2 - i != 0) {
            A04 = C56052rL.A04("verify_email");
            A042 = C56052rL.A04("code");
            z = false;
            j = 6;
            j2 = 6;
        } else {
            A04 = C56052rL.A04("email");
            A042 = C56052rL.A04("email_address");
            z = false;
            j = 0;
            j2 = 320;
        }
        if (C626836d.A0M(str, j, j2, z)) {
            A042.A0J(str);
        }
        C56052rL.A07(A042, A04);
        C35201wU.A01(A04, A01, r11, this);
    }

    public C35721xK(C35351wj r18, String str, String str2) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("verify_email");
        C56052rL A042 = C56052rL.A04("lg");
        String str3 = str;
        if (C626836d.A0M(str3, 2, 3, false)) {
            A042.A0J(str3);
        }
        C56052rL.A07(A042, A04);
        C56052rL A043 = C56052rL.A04("lc");
        String str4 = str2;
        if (C626836d.A0M(str4, 2, 3, false)) {
            A043.A0J(str4);
        }
        C56052rL.A07(A043, A04);
        C35201wU.A01(A04, A01, r18, this);
    }

    public C35721xK(C35381wm r5) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0C(A01, "smax_id", 133);
        C56052rL.A0D(A01, "xmlns", "fb:thrift_iq");
        C41032Ir.A0C(A01, r5, this);
    }

    public C35721xK(C35381wm r3, C35251wZ r4, C35251wZ r5, C35251wZ r6) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("sub_group_suggestions_action");
        C41032Ir.A0B(A04, r4);
        C41032Ir.A0B(A04, r5);
        C41032Ir.A0B(A04, r6);
        C35201wU.A01(A04, A01, r3, this);
    }

    public C35721xK(C35381wm r2, C35251wZ r3, C35251wZ r4, C35251wZ r5, C35251wZ r6, C35251wZ r7, C35251wZ r8) {
        C56052rL A01 = C56052rL.A01();
        C41032Ir.A0B(A01, r3);
        C41032Ir.A0B(A01, r4);
        C41032Ir.A0B(A01, r5);
        C41032Ir.A0B(A01, r6);
        C41032Ir.A0B(A01, r7);
        C41032Ir.A0B(A01, r8);
        C41032Ir.A0C(A01, r2, this);
    }

    public C35721xK(C35381wm r4, C35381wm r5, int i) {
        AnonymousClass36K A0F;
        switch (i) {
            case 10:
            case 11:
                C56052rL A00 = C56052rL.A00();
                C56052rL.A0D(A00, "xmlns", "phoenix");
                C41032Ir.A0E(A00, r4, "fds");
                C41032Ir.A08(A00, r5);
                A0F = A00.A0F();
                break;
            default:
                C56052rL A01 = C56052rL.A01();
                C41032Ir.A0E(A01, r5, "leave");
                C41032Ir.A08(A01, r4);
                A0F = A01.A0F();
                break;
        }
        this.A00 = A0F;
    }

    public C35721xK(C35381wm r10, C35411wp r11, Long l, Long l2) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("message_updates");
        if (C626836d.A0J(l, 1, 300, false)) {
            C56052rL.A0A(A04, l, "count");
        }
        if (l2 != null && C626836d.A0K(l2, true)) {
            C56052rL.A0A(A04, l2, "since");
        }
        C41032Ir.A09(A04, r11);
        C41032Ir.A07(A04, A01, r10, this);
    }

    public C35721xK(C35381wm r2, C35481ww r3) {
        C56052rL A01 = C56052rL.A01();
        C41032Ir.A09(A01, r2);
        C41032Ir.A0D(A01, r3, this);
    }

    public C35721xK(C35381wm r3, C35491wx r4) {
        C56052rL A01 = C56052rL.A01();
        C41032Ir.A0E(A01, r4, "sub_group_suggestion");
        C41032Ir.A0D(A01, r3, this);
    }

    public C35721xK(C35381wm r11, String str) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "w:growth");
        C56052rL A04 = C56052rL.A04("invite");
        C56052rL A042 = C56052rL.A04("get_sender");
        String str2 = str;
        if (str != null && C626836d.A0M(str2, 0, 1024, true)) {
            C56052rL.A0D(A042, "code", str);
        }
        C56052rL.A07(A042, A04);
        C35201wU.A01(A04, A00, r11, this);
    }

    public C35721xK(C35381wm r10, String str, String str2) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "w:mex");
        C56052rL A04 = C56052rL.A04("query");
        String str3 = str;
        if (str != null && C626836d.A0M(str3, 1, 20, true)) {
            C56052rL.A0D(A04, "query_id", str);
        }
        if (C626836d.A0M(str2, 1, 8448000, false)) {
            A04.A0J(str2);
        }
        C35201wU.A01(A04, A00, r10, this);
    }

    public C35721xK(C35381wm r6, List list) {
        C56052rL A01 = C56052rL.A01();
        if (C626836d.A0O(list, 1, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A01, it);
            }
        }
        C35201wU.A01(C56052rL.A04("multi_serialized_lookup"), A01, r6, this);
    }

    public C35721xK(C35381wm r7, List list, int i, boolean z) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("remove");
        C56052rL.A0D(A04, "linked_groups", "true");
        if (C626836d.A0O(list, 1, 1024)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C35201wU.A01(A04, A01, r7, this);
    }

    public C35721xK(C35481ww r3) {
        C35201wU.A01(C56052rL.A04("query"), C56052rL.A01(), r3, this);
    }

    public C35721xK(C35481ww r3, int i) {
        String str;
        C56052rL A01 = C56052rL.A01();
        switch (i) {
            case 17:
                str = "linked_groups_participants";
                break;
            case 18:
                str = "pre_reg_add_requests";
                break;
            default:
                str = "reports";
                break;
        }
        C35201wU.A01(C56052rL.A04(str), A01, r3, this);
    }

    public C35721xK(C35481ww r3, C35391wn r4) {
        C56052rL A01 = C56052rL.A01();
        C41032Ir.A0E(A01, r4, "sub_group_suggestions");
        C41032Ir.A0D(A01, r3, this);
    }

    public C35721xK(C35481ww r7, List list) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("query");
        if (C626836d.A0O(list, 1, 10000)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C35201wU.A01(A04, A01, r7, this);
    }

    public C35721xK(UserJid userJid, C35351wj r6, C35351wj r7, C35351wj r8, C35351wj r9, C35351wj r10, C35351wj r11) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "fb:thrift_iq");
        C56052rL.A0C(A01, "smax_id", 11);
        C56052rL A04 = C56052rL.A04("cart");
        C56052rL.A0D(A04, "op", "refresh");
        if (C626836d.A0L(userJid, "cart->biz_jid")) {
            C56052rL.A06(userJid, A04, "biz_jid");
        }
        C41032Ir.A0E(A04, r6, "image_dimensions");
        C41032Ir.A08(A04, r7);
        C18280x3.A0x(A04, r8);
        C18280x3.A0x(A04, r9);
        C18280x3.A0x(A04, r10);
        C41032Ir.A07(A04, A01, r11, this);
    }

    public C35721xK(UserJid userJid, C35351wj r11, C35351wj r12, C35351wj r13, C35351wj r14, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "br-get-merchant-config");
        C56052rL.A06(userJid, A04, "receiver");
        String str2 = str;
        if (str != null && C626836d.A0M(str2, 1, 1000, true)) {
            C56052rL.A0D(A04, "payment_config_id", str);
        }
        C41032Ir.A08(A04, r11);
        C18280x3.A0x(A04, r12);
        C18280x3.A0x(A04, r13);
        C35201wU.A01(A04, A01, r14, this);
    }

    public C35721xK(UserJid userJid, C35381wm r6, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("reports");
        C56052rL A042 = C56052rL.A04("report");
        if (C626836d.A0N(str, false)) {
            C56052rL.A0D(A042, "message_id", str);
        }
        C56052rL.A06(userJid, A042, "author_jid");
        C56052rL.A07(A042, A04);
        C35201wU.A01(A04, A01, r6, this);
    }
}
