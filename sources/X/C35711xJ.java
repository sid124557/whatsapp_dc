package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xJ  reason: invalid class name and case insensitive filesystem */
public class C35711xJ extends C35201wU {
    public C35711xJ(C35341wi r11) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "fb:thrift_iq");
        C56052rL.A0C(A01, "smax_id", 108);
        C56052rL.A06(C135206kI.A00, A01, "to");
        C56052rL A04 = C56052rL.A04("app_id");
        if (C626836d.A0M("3402315746664947", 1, 30, false)) {
            A04.A0J("3402315746664947");
        }
        C35201wU.A01(A04, A01, r11, this);
    }

    public C35711xJ(C35341wi r4, C35341wi r5) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "call");
        C41032Ir.A0E(A00, r4, "avatar_consent_result");
        C41032Ir.A0D(A00, r5, this);
    }

    public C35711xJ(C35361wk r3) {
        C35201wU.A01(C56052rL.A04("notifications"), C56052rL.A01(), r3, this);
    }

    public C35711xJ(C35361wk r4, AnonymousClass4GI r5) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "urn:xmpp:whatsapp:push");
        C41032Ir.A09(A00, r4);
        C41032Ir.A0D(A00, (C41032Ir) r5, this);
    }

    public C35711xJ(C35361wk r4, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C56052rL.A0D(A01, "xmlns", "w:p");
        C626836d.A0G(A01, str);
        C41032Ir.A0C(A01, r4, this);
    }

    public C35711xJ(C35361wk r7, List list) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0E(A01, "xmlns", "w:comms");
        C56052rL A04 = C56052rL.A04("get_promotions");
        if (C626836d.A0O(list, 0, 10)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C35201wU.A01(A04, A01, r7, this);
    }

    public C35711xJ(C35371wl r4, int i) {
        C56052rL r1;
        String str;
        AnonymousClass36K A03;
        switch (i) {
            case 12:
                r1 = C56052rL.A01();
                str = "username";
                break;
            case 13:
                C56052rL A01 = C56052rL.A01();
                C41032Ir.A09(A01, r4);
                A03 = A01.A0F();
                break;
            case 18:
                r1 = C56052rL.A01();
                str = "delete";
                break;
            default:
                C56052rL A00 = C56052rL.A00();
                C56052rL.A0D(A00, "xmlns", "call");
                A03 = C41032Ir.A03(C56052rL.A04("avatar_consent_result"), A00, r4);
                break;
        }
        A03 = C41032Ir.A03(C56052rL.A04(str), r1, r4);
        this.A00 = A03;
    }

    public C35711xJ(C35371wl r4, C35371wl r5) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "tos");
        C41032Ir.A0E(A00, r4, "notice");
        C41032Ir.A0D(A00, r5, this);
    }

    public C35711xJ(C35371wl r6, C35371wl r7, Long l, int i) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "upi-deactivate-international-payments");
        C56052rL.A0C(A04, "version", 1);
        C41032Ir.A09(A04, r6);
        C41032Ir.A07(A04, A01, r7, this);
    }

    public C35711xJ(C35371wl r19, C35371wl r20, Long l, Long l2) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "upi-activate-international-payments");
        Long l3 = l;
        if (C626836d.A0J(l3, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l3, "start-ts");
        }
        Long l4 = l2;
        if (C626836d.A0J(l4, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l4, "end-ts");
        }
        C56052rL.A0C(A04, "version", 1);
        C41032Ir.A09(A04, r19);
        C41032Ir.A07(A04, A01, r20, this);
    }

    public C35711xJ(C35371wl r10, Long l, int i) {
        C56052rL r1;
        String str;
        AnonymousClass36K A03;
        switch (i) {
            case 21:
                r1 = C56052rL.A01();
                str = "init_login";
                break;
            case 22:
                r1 = C56052rL.A01();
                str = "init_reg";
                break;
            default:
                C56052rL A01 = C56052rL.A01();
                C56052rL A04 = C56052rL.A04("migration_urgency");
                if (C626836d.A0J(l, 1, 5, false)) {
                    C56052rL.A0A(A04, l, "value");
                }
                A03 = C41032Ir.A03(A04, A01, r10);
                break;
        }
        A03 = C41032Ir.A03(C56052rL.A04(str), r1, r10);
        this.A00 = A03;
    }

    public C35711xJ(C35371wl r10, String str, int i) {
        C56052rL A04;
        boolean z;
        long j;
        long j2;
        C56052rL A01 = C56052rL.A01();
        if (8 - i != 0) {
            A04 = C56052rL.A04("username");
            z = false;
            j = 3;
            j2 = 30;
        } else {
            C56052rL.A0E(A01, "xmlns", "urn:xmpp:whatsapp:push");
            A04 = C56052rL.A04("pn");
            z = false;
            j = 0;
            j2 = 300;
        }
        if (C626836d.A0M(str, j, j2, z)) {
            A04.A0J(str);
        }
        C35201wU.A01(A04, A01, r10, this);
    }

    public C35711xJ(C35371wl r17, String str, String str2, String str3, String str4) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("account");
        C56052rL.A0D(A04, "action", "upi-validate-international-qr");
        C56052rL.A0C(A04, "version", 1);
        String str5 = str;
        if (C626836d.A0M(str5, 1, 1000, false)) {
            C56052rL.A0D(A04, "device-id", str5);
        }
        String str6 = str2;
        if (C626836d.A0M(str6, 0, 35, false)) {
            C56052rL.A0D(A04, "seq-no", str6);
        }
        String str7 = str3;
        if (C626836d.A0M(str7, 1, 10000, false)) {
            C56052rL.A0D(A04, "qr-payload", str7);
        }
        String str8 = str4;
        if (C626836d.A0M(str8, 1, 1000, false)) {
            C56052rL.A0D(A04, "vpa", str8);
        }
        C35201wU.A01(A04, A01, r17, this);
    }

    public C35711xJ(C35371wl r6, List list) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "tos");
        if (C626836d.A0O(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A00, it);
            }
        }
        C41032Ir.A0C(A00, r6, this);
    }

    public C35711xJ(C35371wl r7, byte[] bArr, int i) {
        String str;
        C56052rL A01 = C56052rL.A01();
        switch (i) {
            case 17:
                str = "r1";
                break;
            case 19:
                str = "l3";
                break;
            default:
                str = "reg_payload";
                break;
        }
        C56052rL A04 = C56052rL.A04(str);
        C626836d.A0H(bArr, 1, 1024);
        A04.A01 = bArr;
        C35201wU.A01(A04, A01, r7, this);
    }

    public C35711xJ(C35381wm r3, int i) {
        AnonymousClass36K A0F;
        if (i != 0) {
            A0F = C41032Ir.A03(C56052rL.A04("live_updates"), C56052rL.A01(), r3);
        } else {
            C56052rL A01 = C56052rL.A01();
            C41032Ir.A09(A01, r3);
            A0F = A01.A0F();
        }
        this.A00 = A0F;
    }

    public C35711xJ(C95804uY r10, C35361wk r11, Long l) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("my_addons");
        if (C626836d.A0J(l, 0, 5000, false)) {
            C56052rL.A0A(A04, l, "limit");
        }
        if (r10 != null) {
            C56052rL.A06(r10, A04, "jid");
        }
        C35201wU.A01(A04, A01, r11, this);
    }

    public C35711xJ(UserJid userJid, C35361wk r12, C35361wk r13, C35361wk r14, C35261wa r15, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "fb:thrift_iq");
        C56052rL A04 = C56052rL.A04("request");
        C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product");
        if (C626836d.A0L(userJid, "request->biz_jid")) {
            C56052rL.A06(userJid, A04, "biz_jid");
        }
        A04.A0H(r15.A00);
        C56052rL A042 = C56052rL.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str2 = str;
        if (C626836d.A0M(str2, 1, 200, false)) {
            A042.A0J(str2);
        }
        C56052rL.A07(A042, A04);
        C41032Ir.A08(A04, r12);
        C18280x3.A0x(A04, r13);
        C35201wU.A01(A04, A01, r14, this);
    }
}
