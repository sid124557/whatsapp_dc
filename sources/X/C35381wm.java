package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wm  reason: invalid class name and case insensitive filesystem */
public class C35381wm extends C35561x4 {
    public static C35381wm A00(C27991fJ r2, String str) {
        return new C35381wm(r2, new C35381wm(str, 8));
    }

    public C35381wm(C27991fJ r3, int i) {
        C56052rL A03;
        String str;
        if (14 - i != 0) {
            A03 = C56052rL.A04("sub_group_suggestion");
            str = "jid";
        } else {
            A03 = C56052rL.A03();
            str = "linked_groups_membership_hint";
        }
        C626836d.A0D(r3, A03, str);
        C41032Ir.A0A(A03, this);
    }

    public C35381wm(C27991fJ r4, C35381wm r5) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "w:g2");
        C626836d.A0D(r4, A01, "to");
        C41032Ir.A0C(A01, r5, this);
    }

    public C35381wm(C35261wa r7, byte[] bArr) {
        C56052rL A04 = C56052rL.A04("single_serialized_lookup");
        A04.A0H(r7.A00);
        C56052rL A042 = C56052rL.A04("label");
        C626836d.A0H(bArr, 0, 32);
        A042.A01 = bArr;
        C41032Ir.A06(A042, A04, this);
    }

    public C35381wm(C35381wm r5, int i) {
        AnonymousClass39V r2;
        C56052rL A01 = C56052rL.A01();
        if (10 - i != 0) {
            C56052rL.A0D(A01, "xmlns", "key_transparency");
            r2 = AnonymousClass39V.A00();
        } else {
            C56052rL.A06(C28041fO.A00, A01, "to");
            r2 = new AnonymousClass39V("xmlns", "w:g2");
        }
        A01.A0G(r2);
        C41032Ir.A0C(A01, r5, this);
    }

    public C35381wm(C35381wm r3, C35251wZ r4, String str) {
        C56052rL A04 = C56052rL.A04("fds");
        if (C626836d.A0N(str, false)) {
            C56052rL.A0D(A04, "config", str);
        }
        A04.A0H(r4.A00);
        C41032Ir.A0C(A04, r3, this);
    }

    public C35381wm(C35381wm r3, C35361wk r4, C35361wk r5) {
        C56052rL A01 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("messages");
        C41032Ir.A09(A04, r4);
        C41032Ir.A08(A04, r3);
        C41032Ir.A07(A04, A01, r5, this);
    }

    public C35381wm(C35381wm r5, List list) {
        C56052rL A03 = C56052rL.A03();
        C56052rL A04 = C56052rL.A04("pictures");
        if (C41032Ir.A0G(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C18280x3.A0x(A04, r5);
        C41032Ir.A06(A04, A03, this);
    }

    public C35381wm(C35401wo r9, Long l) {
        C56052rL A04 = C56052rL.A04("messages");
        if (C626836d.A0J(l, 1, 300, false)) {
            C56052rL.A0A(A04, l, "count");
        }
        C18280x3.A0x(A04, r9);
        C41032Ir.A0A(A04, this);
    }

    public C35381wm(C95804uY r4, C35381wm r5) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0D(A01, "xmlns", "newsletter");
        C626836d.A0D(r4, A01, "to");
        C41032Ir.A0C(A01, r5, this);
    }

    public C35381wm(UserJid userJid, C35381wm r4, int i) {
        AnonymousClass36K A0F;
        if (6 - i != 0) {
            C56052rL A04 = C56052rL.A04("sub_group_suggestion");
            C626836d.A0D(userJid, A04, "creator");
            C41032Ir.A09(A04, r4);
            A0F = A04.A0F();
        } else {
            C56052rL A00 = C56052rL.A00();
            C56052rL.A06(userJid, A00, "from");
            C41032Ir.A09(A00, r4);
            A0F = A00.A0F();
        }
        this.A00 = A0F;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        X.C56052rL.A0D(r2, r1, r0);
        X.C626836d.A0G(r2, r10);
        r0 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r1.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r9.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35381wm(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r3 = r10
            switch(r11) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0032;
                case 2: goto L_0x0004;
                case 3: goto L_0x004a;
                case 4: goto L_0x0004;
                case 5: goto L_0x0025;
                case 6: goto L_0x0004;
                case 7: goto L_0x0025;
                case 8: goto L_0x0032;
                case 9: goto L_0x0004;
                case 10: goto L_0x0004;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0004;
                case 14: goto L_0x0004;
                case 15: goto L_0x0004;
                case 16: goto L_0x0004;
                case 17: goto L_0x0025;
                case 18: goto L_0x0032;
                case 19: goto L_0x0025;
                case 20: goto L_0x0004;
                case 21: goto L_0x0004;
                case 22: goto L_0x0032;
                case 23: goto L_0x0025;
                case 24: goto L_0x0025;
                case 25: goto L_0x0032;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9.<init>()
            java.lang.String r0 = "picture"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 0
            r6 = 50
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "id"
        L_0x001b:
            X.C56052rL.A0D(r1, r0, r10)
        L_0x001e:
            X.36K r0 = r1.A0F()
        L_0x0022:
            r9.A00 = r0
            return
        L_0x0025:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            goto L_0x003f
        L_0x0032:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
        L_0x003f:
            X.C56052rL.A0D(r2, r1, r0)
            X.C626836d.A0G(r2, r10)
            X.36K r0 = r2.A0F()
            goto L_0x0022
        L_0x004a:
            r9.<init>()
            java.lang.String r0 = "context"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 0
            r6 = 10000(0x2710, double:4.9407E-320)
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "parameters"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35381wm.<init>(java.lang.String, int):void");
    }

    public C35381wm(String str, String str2) {
        C56052rL A04 = C56052rL.A04("fds");
        if (str != null && C626836d.A0N(str, true)) {
            C56052rL.A0D(A04, "state", str);
        }
        String str3 = str2;
        if (str2 != null && C626836d.A0M(str3, 0, 10000, true)) {
            C56052rL.A0D(A04, "parameters", str2);
        }
        C41032Ir.A0A(A04, this);
    }

    public C35381wm(List list, List list2) {
        C56052rL A04 = C56052rL.A04("leave");
        if (C626836d.A0O(list, 0, 1024)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("getNode");
            }
        }
        if (C626836d.A0O(list2, 1, 1024)) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C41032Ir.A0F(A04, it2);
            }
        }
        C41032Ir.A0A(A04, this);
    }
}
