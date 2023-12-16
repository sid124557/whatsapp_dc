package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wk  reason: invalid class name and case insensitive filesystem */
public class C35361wk extends C35561x4 {
    public static C35361wk A00(AnonymousClass31C r2) {
        return new C35361wk(r2.A03(), 22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = new X.AnonymousClass39V(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r3.A0G(r0);
        r0 = r3.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35361wk(int r5) {
        /*
            r4 = this;
            switch(r5) {
                case 4: goto L_0x001d;
                case 20: goto L_0x0029;
                case 21: goto L_0x0035;
                case 24: goto L_0x004a;
                default: goto L_0x0003;
            }
        L_0x0003:
            r4.<init>()
            X.2rL r3 = X.C56052rL.A02()
            java.lang.String r2 = "edit"
            java.lang.String r1 = "1"
        L_0x000e:
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
        L_0x0013:
            r3.A0G(r0)
            X.36K r0 = r3.A0F()
        L_0x001a:
            r4.A00 = r0
            return
        L_0x001d:
            r4.<init>()
            X.2rL r3 = X.C56052rL.A01()
            X.39V r0 = X.AnonymousClass39V.A00()
            goto L_0x0013
        L_0x0029:
            r4.<init>()
            X.2rL r3 = X.C56052rL.A02()
            java.lang.String r2 = "edit"
            java.lang.String r1 = "8"
            goto L_0x000e
        L_0x0035:
            r4.<init>()
            X.2rL r1 = X.C56052rL.A02()
            java.lang.String r0 = "automated"
            X.2rL r0 = X.C56052rL.A04(r0)
            X.C56052rL.A07(r0, r1)
            X.36K r0 = r1.A0F()
            goto L_0x001a
        L_0x004a:
            r4.<init>()
            X.2rL r3 = X.C56052rL.A02()
            java.lang.String r2 = "type"
            java.lang.String r1 = "pay"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35361wk.<init>(int):void");
    }

    public C35361wk(C35241wY r3) {
        C56052rL A04 = C56052rL.A04("spam_list");
        A04.A0H(r3.A00);
        C41032Ir.A0A(A04, this);
    }

    public C35361wk(C35361wk r2) {
        C41032Ir.A0C(C56052rL.A00(), r2, this);
    }

    public C35361wk(C35361wk r4, int i) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "offline:pull");
        C41032Ir.A0C(A00, r4, this);
    }

    public C35361wk(C35361wk r3, Long l, int i) {
        C56052rL A03 = C56052rL.A03();
        C41032Ir.A0E(A03, r3, "tctoken");
        C41032Ir.A0A(A03, this);
    }

    public C35361wk(C35381wm r4) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "newsletter");
        C41032Ir.A0C(A00, r4, this);
    }

    public C35361wk(C35531x1 r2) {
        C41032Ir.A0C(C56052rL.A03(), r2, this);
    }

    public C35361wk(UserJid userJid, int i) {
        C56052rL A04;
        String str;
        if (19 - i != 0) {
            A04 = C56052rL.A02();
            str = "participant";
        } else {
            A04 = C56052rL.A04("receipt");
            str = "to";
        }
        C626836d.A0D(userJid, A04, str);
        C41032Ir.A0A(A04, this);
    }

    public C35361wk(Long l, Long l2, int i) {
        boolean z;
        long j;
        long j2;
        String str;
        C56052rL A03 = C56052rL.A03();
        Long l3 = l;
        if (14 - i != 0) {
            C56052rL A04 = C56052rL.A04("width");
            z = false;
            j = 1;
            j2 = 2048;
            C18280x3.A0y(A04, l3, C626836d.A0J(l3, 1, 2048, false) ? 1 : 0);
            C56052rL.A07(A04, A03);
            str = "height";
        } else {
            C56052rL A042 = C56052rL.A04("variant_thumbnail_width");
            z = false;
            j = 1;
            j2 = 2048;
            C18280x3.A0y(A042, l3, C626836d.A0J(l3, 1, 2048, false) ? 1 : 0);
            C56052rL.A07(A042, A03);
            str = "variant_thumbnail_height";
        }
        C56052rL A043 = C56052rL.A04(str);
        Long l4 = l2;
        C18280x3.A0y(A043, l4, C626836d.A0J(l4, j, j2, z) ? 1 : 0);
        C41032Ir.A06(A043, A03, this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        X.C56052rL.A0D(r2, r1, r0);
        X.C626836d.A0G(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        r1 = X.C56052rL.A04(r0);
        r8 = false;
        r4 = 1;
        r6 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (X.C626836d.A0M(r3, r4, r6, r8) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r1.A0J(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        X.C56052rL.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        X.C56052rL.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r9.A00 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35361wk(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r3 = r10
            switch(r11) {
                case 2: goto L_0x0028;
                case 7: goto L_0x0028;
                case 8: goto L_0x0035;
                case 9: goto L_0x0049;
                case 10: goto L_0x005c;
                case 13: goto L_0x0066;
                case 16: goto L_0x0028;
                case 17: goto L_0x0035;
                case 18: goto L_0x0028;
                case 22: goto L_0x0035;
                case 25: goto L_0x0086;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A02()
            java.lang.String r0 = "hsm"
            X.2rL r1 = X.C56052rL.A04(r0)
            r0 = 0
            boolean r0 = X.C626836d.A0N(r10, r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "tid"
        L_0x001b:
            X.C56052rL.A0D(r1, r0, r10)
        L_0x001e:
            X.C56052rL.A07(r1, r2)
        L_0x0021:
            X.36K r0 = r2.A0F()
            r9.A00 = r0
            return
        L_0x0028:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            goto L_0x0042
        L_0x0035:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
        L_0x0042:
            X.C56052rL.A0D(r2, r1, r0)
            X.C626836d.A0G(r2, r10)
            goto L_0x0021
        L_0x0049:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A03()
            java.lang.String r0 = "catalog_session_id"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 40
            goto L_0x0079
        L_0x005c:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A03()
            java.lang.String r0 = "direct_connection_encrypted_info"
            goto L_0x0070
        L_0x0066:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A03()
            java.lang.String r0 = "variant_info_fields"
        L_0x0070:
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 2000(0x7d0, double:9.88E-321)
        L_0x0079:
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x0082
            r1.A0J(r10)
        L_0x0082:
            X.C56052rL.A07(r1, r2)
            goto L_0x0021
        L_0x0086:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r0 = "spam_list"
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 0
            r6 = 65536(0x10000, double:3.2379E-319)
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "subject"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35361wk.<init>(java.lang.String, int):void");
    }

    public C35361wk(List list) {
        C56052rL A02 = C56052rL.A02();
        if (C626836d.A0O(list, 1, 100)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A02, it);
            }
        }
        C41032Ir.A0A(A02, this);
    }

    public C35361wk(byte[] bArr) {
        C56052rL A03 = C56052rL.A03();
        C626836d.A0H(bArr, 1, 120);
        A03.A01 = bArr;
        C41032Ir.A0A(A03, this);
    }
}
