package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wj  reason: invalid class name and case insensitive filesystem */
public class C35351wj extends C35561x4 {
    public C35351wj(int i) {
        String str;
        C56052rL A04 = C56052rL.A04("account");
        if (15 - i != 0) {
            str = "merchant_status";
        } else {
            str = "merchant_account_settings";
        }
        C41032Ir.A06(C56052rL.A04(str), A04, this);
    }

    public C35351wj(C35351wj r2) {
        C41032Ir.A0C(C56052rL.A00(), r2, this);
    }

    public C35351wj(C35351wj r4, int i) {
        C56052rL r2;
        String str;
        String str2;
        AnonymousClass36K A0F;
        switch (i) {
            case 2:
            case 3:
                r2 = C56052rL.A00();
                str = "xmlns";
                str2 = "urn:xmpp:whatsapp:account";
                break;
            case 7:
            case 10:
            case 11:
                r2 = C56052rL.A00();
                str = "xmlns";
                str2 = "bot";
                break;
            default:
                C56052rL A04 = C56052rL.A04("alias");
                C41032Ir.A09(A04, r4);
                A0F = A04.A0F();
                break;
        }
        C56052rL.A0D(r2, str, str2);
        C41032Ir.A09(r2, r4);
        A0F = r2.A0F();
        this.A00 = A0F;
    }

    public C35351wj(C35351wj r10, Long l) {
        C56052rL A04 = C56052rL.A04("account");
        C56052rL A042 = C56052rL.A04("installment");
        if (C626836d.A0J(l, 1, 50, false)) {
            C56052rL.A0A(A042, l, "max_count");
        }
        C41032Ir.A0E(A042, r10, "amount");
        C41032Ir.A06(A042, A04, this);
    }

    public C35351wj(C139656sP r2) {
        C41032Ir.A0C(C56052rL.A04("alias"), r2, this);
    }

    public C35351wj(Long l, Long l2, int i) {
        C56052rL A04;
        boolean z;
        long j;
        long j2;
        String str;
        Long l3 = l;
        if (22 - i != 0) {
            A04 = C56052rL.A03();
            C56052rL A042 = C56052rL.A04("variant_thumbnail_width");
            z = false;
            j = 1;
            j2 = 2048;
            C18280x3.A0y(A042, l3, C626836d.A0J(l3, 1, 2048, false) ? 1 : 0);
            C56052rL.A07(A042, A04);
            str = "variant_thumbnail_height";
        } else {
            A04 = C56052rL.A04("image_dimensions");
            C56052rL A043 = C56052rL.A04("width");
            z = false;
            j = 0;
            j2 = 10000;
            C18280x3.A0y(A043, l3, C626836d.A0J(l3, 0, 10000, false) ? 1 : 0);
            C56052rL.A07(A043, A04);
            str = "height";
        }
        C56052rL A044 = C56052rL.A04(str);
        Long l4 = l2;
        C18280x3.A0y(A044, l4, C626836d.A0J(l4, j, j2, z) ? 1 : 0);
        C41032Ir.A06(A044, A04, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        X.C56052rL.A0E(r2, r1, r0);
        r1 = "xmlns";
        r0 = "w:pay";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        X.C56052rL.A0D(r2, r1, r0);
        X.C626836d.A0G(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = X.C56052rL.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (X.C626836d.A0M(r3, 1, 2000, false) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r1.A0J(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        X.C56052rL.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r9.A00 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35351wj(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r3 = r10
            switch(r11) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0037;
                case 4: goto L_0x0037;
                case 5: goto L_0x002a;
                case 8: goto L_0x002a;
                case 9: goto L_0x0037;
                case 12: goto L_0x0037;
                case 13: goto L_0x0045;
                case 18: goto L_0x0052;
                case 19: goto L_0x002a;
                case 20: goto L_0x006f;
                case 28: goto L_0x0052;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A03()
            java.lang.String r0 = "variant_info_fields"
        L_0x000e:
            X.2rL r1 = X.C56052rL.A04(r0)
            r8 = 0
            r4 = 1
            r6 = 2000(0x7d0, double:9.88E-321)
            boolean r0 = X.C626836d.A0M(r3, r4, r6, r8)
            if (r0 == 0) goto L_0x0020
            r1.A0J(r10)
        L_0x0020:
            X.C56052rL.A07(r1, r2)
        L_0x0023:
            X.36K r0 = r2.A0F()
            r9.A00 = r0
            return
        L_0x002a:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            goto L_0x0068
        L_0x0037:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            goto L_0x0068
        L_0x0045:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            goto L_0x005f
        L_0x0052:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A01()
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
        L_0x005f:
            X.C56052rL.A0E(r2, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:pay"
        L_0x0068:
            X.C56052rL.A0D(r2, r1, r0)
            X.C626836d.A0G(r2, r10)
            goto L_0x0023
        L_0x006f:
            r9.<init>()
            X.2rL r2 = X.C56052rL.A03()
            java.lang.String r0 = "direct_connection_encrypted_info"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35351wj.<init>(java.lang.String, int):void");
    }

    public C35351wj(String str, String str2, String str3, int i) {
        C56052rL A03;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (17 - i != 0) {
            A03 = C56052rL.A04("alias");
            if (C626836d.A0M(str4, 1, 1000, false)) {
                C56052rL.A0D(A03, "vpa", str4);
            }
            if (str2 != null && C626836d.A0M(str5, 1, 1000, true)) {
                C56052rL.A0D(A03, "vpa_id", str5);
            }
            if (C626836d.A0M(str6, 1, 1000, true)) {
                C56052rL.A0D(A03, "vpa_name", str6);
            }
        } else {
            A03 = C56052rL.A03();
            C56052rL A04 = C56052rL.A04("money");
            if (C626836d.A0M(str4, 1, 100, false)) {
                C56052rL.A0D(A04, "value", str4);
            }
            if (C626836d.A0M(str5, 1, 100, false)) {
                C56052rL.A0D(A04, "offset", str5);
            }
            if (C626836d.A0M(str6, 1, 100, false)) {
                C56052rL.A0D(A04, "currency", str6);
            }
            C56052rL.A07(A04, A03);
        }
        C41032Ir.A0A(A03, this);
    }

    public C35351wj(List list) {
        C56052rL A04 = C56052rL.A04("cart");
        if (C626836d.A0O(list, 1, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41032Ir.A0F(A04, it);
            }
        }
        C41032Ir.A0A(A04, this);
    }

    public C35351wj(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C56052rL A03 = C56052rL.A03();
        C56052rL.A0D(A03, "version", "1");
        C56052rL.A0D(A03, "algorithm", "rsa2048");
        C56052rL A04 = C56052rL.A04("encrypted_key");
        C626836d.A0H(bArr, 1, 2048);
        C56052rL.A09(A04, A03, bArr);
        C56052rL A042 = C56052rL.A04("nonce");
        C626836d.A0H(bArr2, 1, 128);
        C56052rL.A09(A042, A03, bArr2);
        C56052rL A043 = C56052rL.A04("encrypted_data");
        C626836d.A0H(bArr3, 1, 8192);
        C56052rL.A09(A043, A03, bArr3);
        C56052rL A044 = C56052rL.A04("auth_tag");
        C626836d.A0H(bArr4, 1, 128);
        A044.A01 = bArr4;
        C41032Ir.A06(A044, A03, this);
    }
}
