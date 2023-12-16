package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Zw  reason: invalid class name and case insensitive filesystem */
public class C106665Zw {
    public final int A00;
    public final AnonymousClass5Nj A01;

    public static C148047Gs A00(AnonymousClass36K r3) {
        boolean z;
        String str = null;
        if (r3 != null) {
            AnonymousClass36K A0l = r3.A0l("after");
            if (A0l != null) {
                str = A0l.A0n();
            }
            z = C18320x8.A1U(str);
        } else {
            z = false;
        }
        return new C148047Gs(z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.7yH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.7yH} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C166017y0 A01(X.AnonymousClass36K r10) {
        /*
            r4 = 0
            if (r10 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.lang.String r0 = "country_code_origin"
            X.36K r2 = r10.A0l(r0)
            java.lang.String r0 = "importer_name"
            X.36K r1 = r10.A0l(r0)
            java.lang.String r0 = "importer_address"
            X.36K r3 = r10.A0l(r0)
            java.lang.String r2 = X.AnonymousClass4L0.A0Q(r2)
            java.lang.String r1 = X.AnonymousClass4L0.A0Q(r1)
            if (r3 == 0) goto L_0x0050
            java.lang.String r0 = "street1"
            java.lang.String r5 = X.C86634Kw.A0z(r3, r0)
            java.lang.String r0 = "street2"
            java.lang.String r6 = X.C86634Kw.A0z(r3, r0)
            java.lang.String r0 = "postal_code"
            java.lang.String r7 = X.C86634Kw.A0z(r3, r0)
            java.lang.String r0 = "city"
            java.lang.String r8 = X.C86634Kw.A0z(r3, r0)
            java.lang.String r0 = "region"
            java.lang.String r9 = X.C86634Kw.A0z(r3, r0)
            java.lang.String r0 = "country_code"
            X.36K r0 = r3.A0l(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = r0.A0n()
        L_0x004a:
            r10 = r4
            X.7yH r4 = new X.7yH
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0050:
            X.7y0 r0 = new X.7y0
            r0.<init>(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106665Zw.A01(X.36K):X.7y0");
    }

    public C64523Dv A02(AnonymousClass36K r5) {
        String str;
        if (this.A00 != 1) {
            str = "product_catalog";
        } else {
            str = "product_list";
        }
        AnonymousClass36K A0l = r5.A0l(str);
        if (A0l == null) {
            return null;
        }
        List A0s = A0l.A0s("product");
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C109015dw A03 = A03(C18310x6.A0Y(it));
            if (A03 != null) {
                A0s2.add(A03);
            }
        }
        return new C64523Dv(A00(A0l.A0l("paging")), A0s2);
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019e, code lost:
        if (java.lang.Boolean.parseBoolean(r10.A0n()) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109015dw A03(X.AnonymousClass36K r35) {
        /*
            r34 = this;
            java.lang.String r0 = "id"
            r6 = r35
            X.36K r18 = r6.A0l(r0)
            java.lang.String r0 = "name"
            X.36K r17 = r6.A0l(r0)
            java.lang.String r0 = "description"
            X.36K r11 = r6.A0l(r0)
            java.lang.String r0 = "url"
            X.36K r16 = r6.A0l(r0)
            java.lang.String r10 = "price"
            X.36K r9 = r6.A0l(r10)
            java.lang.String r0 = "currency"
            X.36K r2 = r6.A0l(r0)
            java.lang.String r0 = "retailer_id"
            X.36K r15 = r6.A0l(r0)
            java.lang.String r0 = "media"
            X.36K r5 = r6.A0l(r0)
            java.lang.String r0 = "image_fetch_status"
            X.36K r1 = r6.A0l(r0)
            java.lang.String r0 = "status_info"
            X.36K r4 = r6.A0l(r0)
            java.lang.String r0 = "sale_price"
            X.36K r7 = r6.A0l(r0)
            java.lang.String r0 = "belongs_to"
            X.36K r14 = r6.A0l(r0)
            java.lang.String r0 = "compliance_info"
            X.36K r13 = r6.A0l(r0)
            java.lang.String r0 = "max_available"
            X.36K r12 = r6.A0l(r0)
            java.lang.String r0 = "variant_info"
            X.36K r8 = r6.A0l(r0)
            if (r1 != 0) goto L_0x0091
            java.lang.String r26 = ""
        L_0x0060:
            r3 = 0
            java.lang.String r21 = X.AnonymousClass4L0.A0Q(r18)
            java.lang.String r22 = X.AnonymousClass4L0.A0Q(r17)
            java.lang.String r23 = X.AnonymousClass4L0.A0Q(r11)
            if (r2 == 0) goto L_0x008f
            java.lang.String r0 = r2.A0n()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = r2.A0n()
            X.7ny r2 = new X.7ny
            r2.<init>(r0)
        L_0x0082:
            if (r9 == 0) goto L_0x008d
            java.lang.String r0 = r9.A0n()
        L_0x0088:
            if (r2 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            goto L_0x0096
        L_0x008d:
            r0 = r3
            goto L_0x0088
        L_0x008f:
            r2 = r3
            goto L_0x0082
        L_0x0091:
            java.lang.String r26 = r1.A0n()
            goto L_0x0060
        L_0x0096:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x009f }
            java.math.BigDecimal r27 = X.C57952uT.A00(r2, r0)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r2 = r3
            r27 = r3
            goto L_0x00a5
        L_0x00a3:
            r27 = r3
        L_0x00a5:
            r9 = 0
            if (r7 != 0) goto L_0x00f8
            r7 = r3
        L_0x00a9:
            java.lang.String r25 = X.AnonymousClass4L0.A0Q(r15)
            java.lang.String r24 = X.AnonymousClass4L0.A0Q(r16)
            java.lang.String r0 = "is_hidden"
            java.lang.String r0 = r6.A0r(r0, r3)
            boolean r33 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "availability"
            java.lang.String r1 = r6.A0r(r0, r3)
            java.lang.String r0 = "out of stock"
            boolean r0 = r0.equalsIgnoreCase(r1)
            boolean r29 = X.AnonymousClass000.A1S(r0)
            java.lang.String r0 = "compliance_category"
            java.lang.String r0 = r6.A0r(r0, r3)
            if (r21 == 0) goto L_0x0212
            if (r22 == 0) goto L_0x0212
            if (r5 == 0) goto L_0x0212
            java.lang.String r1 = "image"
            java.util.List r9 = r5.A0s(r1)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r3 = 0
        L_0x00e2:
            int r1 = r9.size()
            if (r3 >= r1) goto L_0x014b
            X.36K r1 = r5.A0k(r3)
            X.5db r1 = X.C57092t4.A00(r1)
            if (r1 == 0) goto L_0x00f5
            r6.add(r1)
        L_0x00f5:
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x00f8:
            X.36K r1 = r7.A0l(r10)
            java.lang.String r0 = "start_date"
            X.36K r11 = r7.A0l(r0)
            java.lang.String r0 = "end_date"
            X.36K r10 = r7.A0l(r0)
            if (r1 == 0) goto L_0x0117
            java.lang.String r0 = r1.A0n()
        L_0x010e:
            if (r2 == 0) goto L_0x0148
            if (r0 == 0) goto L_0x0148
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x0119
        L_0x0117:
            r0 = r3
            goto L_0x010e
        L_0x0119:
            java.math.BigDecimal r1 = X.C57952uT.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0148 }
            if (r11 == 0) goto L_0x0139
            if (r10 == 0) goto L_0x0139
            java.lang.String r7 = r11.A0n()
            java.lang.String r0 = r10.A0n()
            if (r7 == 0) goto L_0x0139
            if (r0 == 0) goto L_0x0139
            java.util.Date r7 = X.C154227cp.A00(r7)     // Catch:{ ParseException -> 0x0136 }
            java.util.Date r9 = X.C154227cp.A00(r0)     // Catch:{ ParseException -> 0x013b }
            goto L_0x013f
        L_0x0136:
            r0 = move-exception
            r7 = r3
            goto L_0x013c
        L_0x0139:
            r0 = r3
            goto L_0x0141
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x013f:
            r0 = r9
            r9 = r7
        L_0x0141:
            X.5dU r7 = new X.5dU
            r7.<init>(r2, r1, r9, r0)
            goto L_0x00a9
        L_0x0148:
            r7 = r3
            goto L_0x00a9
        L_0x014b:
            X.7y0 r3 = A01(r13)
            java.lang.String r1 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = "N/A"
            r0 = 0
            X.7y0 r3 = new X.7y0
            r3.<init>(r0, r1, r0)
        L_0x015f:
            if (r12 == 0) goto L_0x01d5
            java.lang.String r0 = r12.A0n()
            if (r0 == 0) goto L_0x01d5
            long r30 = java.lang.Long.parseLong(r0)
        L_0x016b:
            r5 = 0
            if (r4 == 0) goto L_0x01e8
            java.lang.String r0 = "status"
            X.36K r0 = r4.A0l(r0)
            java.lang.String r1 = "can_appeal"
            X.36K r10 = r4.A0l(r1)
            java.lang.String r1 = "reject_reason"
            X.36K r9 = r4.A0l(r1)
            java.lang.String r1 = "commerce_url"
            X.36K r1 = r4.A0l(r1)
            java.lang.String r4 = X.AnonymousClass4L0.A0Q(r0)
            java.lang.String r16 = X.AnonymousClass4L0.A0Q(r9)
            java.lang.String r17 = X.AnonymousClass4L0.A0Q(r1)
            if (r10 == 0) goto L_0x01a0
            java.lang.String r1 = r10.A0n()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r20 = 1
            if (r1 != 0) goto L_0x01a2
        L_0x01a0:
            r20 = 0
        L_0x01a2:
            int r19 = X.AnonymousClass255.A00(r4)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r1 = "reasons"
            X.36K r0 = r0.A0l(r1)
            r10 = 0
            if (r0 == 0) goto L_0x01df
            java.lang.String r1 = "product"
            java.util.List r0 = r0.A0s(r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r0.iterator()
        L_0x01bf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01d8
            X.36K r1 = X.C18310x6.A0Y(r9)
            java.lang.String r0 = "reason"
            java.lang.String r0 = r1.A0r(r0, r5)
            if (r0 == 0) goto L_0x01bf
            r4.add(r0)
            goto L_0x01bf
        L_0x01d5:
            r30 = 99
            goto L_0x016b
        L_0x01d8:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01df
            r10 = r4
        L_0x01df:
            r5 = r10
        L_0x01e0:
            X.38u r15 = new X.38u
            r18 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r5 = r15
        L_0x01e8:
            r0 = r34
            X.5Nj r0 = r0.A01
            X.5dV r19 = r0.A00(r2, r8)
            r32 = 1
            X.5dw r15 = new X.5dw
            r18 = r7
            r20 = r2
            r28 = r6
            r16 = r3
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            if (r14 == 0) goto L_0x0211
            java.lang.String r0 = r14.A0n()
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
            X.4h8 r0 = new X.4h8
            r0.<init>(r15, r1)
            return r0
        L_0x0211:
            return r15
        L_0x0212:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106665Zw.A03(X.36K):X.5dw");
    }

    public void A04(C620433g r4, UserJid userJid, AnonymousClass36K r6) {
        String str;
        String A0r;
        if (this.A00 != 1) {
            str = "product_catalog";
        } else {
            str = "product_list";
        }
        AnonymousClass36K A0l = r6.A0l(str);
        if (A0l != null && (A0r = A0l.A0r("cart_enabled", (String) null)) != null) {
            r4.A0C(userJid, Boolean.parseBoolean(A0r));
        }
    }

    public C106665Zw(int i) {
        this.A00 = i;
        C57092t4 r0 = new C57092t4();
        C1449173l r4 = new C1449173l();
        this.A01 = new AnonymousClass5Nj(new C1448973j(), new C1449073k(), new C147027Cn(r0), r4);
    }

    public C106665Zw() {
        this(0);
    }
}
