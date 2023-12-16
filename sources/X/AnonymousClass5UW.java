package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5UW  reason: invalid class name */
public final class AnonymousClass5UW {
    public final AnonymousClass256 A00;
    public final C49812h8 A01;

    public AnonymousClass5UW(AnonymousClass256 r2, C49812h8 r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C152217Ya A03(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            boolean r5 = X.AnonymousClass0x2.A1Y(r8, r9)
            X.2h8 r0 = r7.A01
            X.1RB r0 = r0.A00()
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0040 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_total_variant_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0040 }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x0040 }
            r1[r5] = r9     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEM"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r2 == 0) goto L_0x003c
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            X.7Ya r1 = r7.A02(r2)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            r2.close()     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x003c:
            r4.close()
            return r1
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A03(com.whatsapp.jid.Jid, java.lang.String):X.7Ya");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.Future A04(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            r6 = 0
            X.C162457s7.A0J(r8, r6)
            X.3dJ r3 = new X.3dJ
            r3.<init>()
            X.2h8 r0 = r7.A01     // Catch:{ Exception -> 0x0055 }
            X.1RB r0 = r0.A00()     // Catch:{ Exception -> 0x0055 }
            X.4GK r4 = r0.get()     // Catch:{ Exception -> 0x0055 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004e }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_scaled_image_url, product_quantity, product_sale_price_1000, product_sale_start_date, product_sale_end_date, product_max_available, product_variant_props, product_total_variant_quantity FROM cart_item WHERE business_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004e }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEMS"
            android.database.Cursor r2 = r5.A0E(r2, r0, r1)     // Catch:{ all -> 0x004e }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0030
        L_0x002c:
            r3.BQt(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x003e
        L_0x0030:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x002c
            X.7Ya r0 = r7.A02(r2)     // Catch:{ all -> 0x0047 }
            r1.add(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0030
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x0043:
            r4.close()     // Catch:{ Exception -> 0x0055 }
            return r3
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ Exception -> 0x0055 }
            throw r0     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r3.BQr(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A04(com.whatsapp.jid.Jid):java.util.concurrent.Future");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            r5 = 0
            X.C162457s7.A0J(r7, r5)
            X.2h8 r0 = r6.A01
            X.1RB r0 = r0.A00()
            X.4Fq r4 = r0.A0C()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0024 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0024 }
            X.C18280x3.A0w(r7, r1, r5)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "cart_item.DELETE_CART"
            r3.A0I(r2, r0, r1)     // Catch:{ all -> 0x0024 }
            r4.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A06(com.whatsapp.jid.Jid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.Jid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            boolean r5 = X.AnonymousClass0x2.A1Y(r8, r9)
            X.2h8 r0 = r7.A01
            X.1RB r0 = r0.A00()
            X.4Fq r4 = r0.A0C()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0027 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "DELETE FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0027 }
            X.C18280x3.A0w(r8, r1, r6)     // Catch:{ all -> 0x0027 }
            r1[r5] = r9     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "cart_item.DELETE_CART_ITEM"
            r3.A0I(r2, r0, r1)     // Catch:{ all -> 0x0027 }
            r4.close()
            return
        L_0x0027:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A07(com.whatsapp.jid.Jid, java.lang.String):void");
    }

    public final int A00(C152217Ya r9, C85284Fq r10, Jid jid) {
        C56862sg r2 = ((AnonymousClass3H0) r10).A03;
        ContentValues A012 = A01(r9, jid);
        String[] strArr = new String[2];
        C18280x3.A0w(jid, strArr, 0);
        String str = r9.A02.A0F;
        C162457s7.A0C(str);
        strArr[1] = str;
        return r2.A05(A012, "cart_item", "business_id=?  AND product_id=?", "cart_item.UPDATE_CART_ITEM", strArr);
    }

    public final ContentValues A01(C152217Ya r10, Jid jid) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        String str2;
        List<C165977xw> list;
        BigDecimal multiply;
        C109015dw r2 = r10.A02;
        BigDecimal bigDecimal = r2.A06;
        String str3 = null;
        if (bigDecimal == null || (multiply = bigDecimal.multiply(new BigDecimal(1000.0d))) == null) {
            l = null;
        } else {
            l = C18310x6.A0g(multiply);
        }
        C108745dU r6 = r2.A02;
        if (r6 != null) {
            l2 = C18310x6.A0g(r6.A01.multiply(new BigDecimal(1000.0d)));
            Date date = r6.A03;
            if (date != null) {
                l3 = Long.valueOf(date.getTime());
            } else {
                l3 = null;
            }
            Date date2 = r6.A02;
            if (date2 != null) {
                l4 = Long.valueOf(date2.getTime());
            } else {
                l4 = null;
            }
        } else {
            l2 = null;
            l3 = null;
            l4 = null;
        }
        C160617ny r0 = r2.A04;
        if (r0 != null) {
            str3 = r0.A00;
        }
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("business_id", jid.getRawString());
        A06.put("product_id", r2.A0F);
        A06.put("product_title", r2.A05);
        A06.put("product_price_1000", l);
        A06.put("product_currency_code", str3);
        List list2 = r2.A07;
        C162457s7.A0C(list2);
        C108815db r02 = (C108815db) C73723fy.A06(list2, 0);
        if (r02 != null) {
            str = r02.A04;
        } else {
            str = "";
        }
        A06.put("product_image_id", str);
        C108815db r03 = (C108815db) C73723fy.A06(list2, 0);
        if (r03 == null || (str2 = r03.A01) == null) {
            str2 = "";
        }
        A06.put("product_scaled_image_url", str2);
        A06.put("product_quantity", Long.valueOf(r10.A00));
        A06.put("product_sale_price_1000", l2);
        A06.put("product_sale_start_date", l3);
        A06.put("product_sale_end_date", l4);
        A06.put("product_max_available", Long.valueOf(r2.A09));
        String str4 = null;
        C108755dV r04 = r2.A0B;
        if (!(r04 == null || (list = r04.A02) == null)) {
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (C165977xw r3 : list) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A00);
                A1G.put("value", r3.A01);
                A1F.put(A1G);
            }
            str4 = A1F.toString();
        }
        A06.put("product_variant_props", str4);
        A06.put("product_total_variant_quantity", Long.valueOf(r10.A01));
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r0.length() == 0) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C152217Ya A02(android.database.Cursor r36) {
        /*
            r35 = this;
            java.lang.String r1 = "product_id"
            r0 = r36
            java.lang.String r14 = X.AnonymousClass0x2.A0Z(r0, r1)
            java.lang.String r1 = "product_title"
            java.lang.String r15 = X.AnonymousClass0x2.A0Z(r0, r1)
            java.lang.String r1 = "product_price_1000"
            int r2 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r2)
            r11 = 0
            if (r1 == 0) goto L_0x0108
            r7 = r11
        L_0x001c:
            java.lang.String r1 = "product_currency_code"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r0, r1)
            java.lang.String r1 = "product_quantity"
            long r31 = X.AnonymousClass0x2.A0C(r0, r1)
            java.lang.String r1 = "product_total_variant_quantity"
            long r33 = X.AnonymousClass0x2.A0C(r0, r1)
            java.lang.String r1 = "product_image_id"
            java.lang.String r26 = X.AnonymousClass0x2.A0Z(r0, r1)
            java.lang.String r1 = "product_scaled_image_url"
            java.lang.String r28 = X.AnonymousClass0x2.A0Z(r0, r1)
            java.lang.String r1 = "product_sale_price_1000"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x0102
            r5 = r11
        L_0x0047:
            java.lang.String r1 = "product_sale_start_date"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00fc
            r4 = r11
        L_0x0054:
            java.lang.String r1 = "product_sale_end_date"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00f6
            r6 = r11
        L_0x0061:
            java.lang.String r1 = "product_max_available"
            int r3 = r0.getColumnIndexOrThrow(r1)
            boolean r1 = r0.isNull(r3)
            if (r1 == 0) goto L_0x00f0
            r23 = 99
        L_0x006f:
            if (r2 == 0) goto L_0x00ee
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00ee
            X.7ny r13 = new X.7ny
            r13.<init>(r2)
        L_0x007c:
            if (r7 == 0) goto L_0x00eb
            if (r13 == 0) goto L_0x00eb
            long r1 = r7.longValue()
            java.math.BigDecimal r20 = X.C57952uT.A00(r13, r1)
        L_0x0088:
            if (r5 == 0) goto L_0x00af
            if (r13 == 0) goto L_0x00af
            long r1 = r5.longValue()
            java.math.BigDecimal r5 = X.C57952uT.A00(r13, r1)
            if (r4 == 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00e4
            long r1 = r4.longValue()
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            long r2 = r6.longValue()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            X.5dU r11 = new X.5dU
            r11.<init>(r13, r5, r4, r1)
        L_0x00af:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            if (r26 == 0) goto L_0x00cb
            int r1 = r26.length()
            if (r1 == 0) goto L_0x00cb
            java.lang.String r27 = ""
            r29 = 0
            X.5db r1 = new X.5db
            r25 = r1
            r30 = r29
            r25.<init>(r26, r27, r28, r29, r30)
            r7.add(r1)
        L_0x00cb:
            java.lang.String r1 = "product_variant_props"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x00db
            int r2 = r0.length()
            r1 = 0
            if (r2 != 0) goto L_0x00dc
        L_0x00db:
            r1 = 1
        L_0x00dc:
            r9 = 0
            if (r1 != 0) goto L_0x0140
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            goto L_0x010e
        L_0x00e4:
            X.5dU r1 = new X.5dU
            r1.<init>(r13, r5, r11, r11)
            r11 = r1
            goto L_0x00af
        L_0x00eb:
            r20 = r11
            goto L_0x0088
        L_0x00ee:
            r13 = r11
            goto L_0x007c
        L_0x00f0:
            long r23 = r0.getLong(r3)
            goto L_0x006f
        L_0x00f6:
            java.lang.Long r6 = X.C18280x3.A0T(r0, r3)
            goto L_0x0061
        L_0x00fc:
            java.lang.Long r4 = X.C18280x3.A0T(r0, r3)
            goto L_0x0054
        L_0x0102:
            java.lang.Long r5 = X.C18280x3.A0T(r0, r3)
            goto L_0x0047
        L_0x0108:
            java.lang.Long r7 = X.C18280x3.A0T(r0, r2)
            goto L_0x001c
        L_0x010e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013a }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013a }
            int r6 = r1.length()     // Catch:{ JSONException -> 0x013a }
        L_0x0117:
            if (r3 >= r6) goto L_0x0142
            org.json.JSONObject r0 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r4 = "name"
            java.lang.String r5 = r0.getString(r4)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r4 = "value"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x013a }
            X.C162457s7.A0H(r5)     // Catch:{ JSONException -> 0x013a }
            X.C162457s7.A0H(r4)     // Catch:{ JSONException -> 0x013a }
            X.7xw r0 = new X.7xw     // Catch:{ JSONException -> 0x013a }
            r0.<init>(r5, r4)     // Catch:{ JSONException -> 0x013a }
            r2.add(r0)     // Catch:{ JSONException -> 0x013a }
            int r3 = r3 + 1
            goto L_0x0117
        L_0x013a:
            r1 = move-exception
            java.lang.String r0 = "ProductVariantPropertyListSerializer/deserializeFromJson/fail"
            com.whatsapp.util.Log.d(r0, r1)
        L_0x0140:
            r12 = 0
            goto L_0x014d
        L_0x0142:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0140
            X.5dV r12 = new X.5dV
            r12.<init>(r9, r9, r9, r2)
        L_0x014d:
            r22 = 0
            r25 = 1
            X.5dw r8 = new X.5dw
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r10 = r9
            r21 = r7
            r26 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            X.7Ya r29 = new X.7Ya
            r30 = r8
            r29.<init>(r30, r31, r33)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A02(android.database.Cursor):X.7Ya");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C152217Ya r9, com.whatsapp.jid.Jid r10) {
        /*
            r8 = this;
            X.C18260x0.A0O(r10, r9)
            X.2h8 r0 = r8.A01
            X.1RB r0 = r0.A00()
            X.4Fq r5 = r0.A0C()
            X.3Yo r6 = r5.Axl()     // Catch:{ all -> 0x0071 }
            X.5dw r0 = r9.A02     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r0.A0F     // Catch:{ all -> 0x006a }
            X.C162457s7.A0C(r1)     // Catch:{ all -> 0x006a }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x006a }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x006a }
            r3 = 0
            X.C18280x3.A19(r0, r1, r2)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "cart_item.SELECT_CART_ITEM_QUANTITY"
            java.lang.String r0 = "SELECT product_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0049
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "product_quantity"
            int r3 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r2.close()     // Catch:{ all -> 0x006a }
            goto L_0x0049
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x0049:
            long r3 = (long) r3     // Catch:{ all -> 0x006a }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            android.content.ContentValues r2 = r8.A01(r9, r10)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "cart_item.INSERT_CART_ITEM"
            java.lang.String r0 = "cart_item"
            r7.A08(r0, r1, r2)     // Catch:{ all -> 0x006a }
            goto L_0x0060
        L_0x005d:
            r8.A00(r9, r5, r10)     // Catch:{ all -> 0x006a }
        L_0x0060:
            r6.A00()     // Catch:{ all -> 0x006a }
            r6.close()     // Catch:{ all -> 0x0071 }
            r5.close()
            return
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UW.A05(X.7Ya, com.whatsapp.jid.Jid):void");
    }
}
