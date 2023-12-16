package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2k0  reason: invalid class name and case insensitive filesystem */
public class C51552k0 {
    public final C623334p A00;
    public final C72303dV A01;

    public static void A00(ContentValues contentValues, C30821nD r3) {
        C621833x.A02(contentValues, "order_id", r3.A07);
        C621833x.A02(contentValues, "order_title", r3.A08);
        contentValues.put("item_count", Integer.valueOf(r3.A00));
        contentValues.put("message_version", Integer.valueOf(r3.A01));
    }

    public void A01(C30821nD r7) {
        C85284Fq A04;
        try {
            A04 = this.A01.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, r7.A1L);
            A00(A06, r7);
            C18280x3.A0m(A06, r7.A02);
            A06.put("surface", Integer.valueOf(r7.A03));
            C621833x.A02(A06, "message", r7.A06);
            UserJid userJid = r7.A04;
            if (userJid != null) {
                A06.put("seller_jid", C623334p.A03(this.A00, userJid));
            }
            C621833x.A02(A06, "token", r7.A09);
            if (r7.A0y() != null) {
                C621833x.A04(A06, "thumbnail", r7.A0y().A09());
            }
            String str = r7.A05;
            if (!(str == null || r7.A0A == null)) {
                A06.put("currency_code", str);
                A06.put("total_amount_1000", C18310x6.A0g(r7.A0A.multiply(C57952uT.A00)));
            }
            C626936e.A0F(AnonymousClass000.A1T((((AnonymousClass3H0) A04).A03.A0C("message_order", "INSERT_MESSAGE_ORDER_SQL", A06, 5) > r7.A1L ? 1 : (((AnonymousClass3H0) A04).A03.A0C("message_order", "INSERT_MESSAGE_ORDER_SQL", A06, 5) == r7.A1L ? 0 : -1))), "OrderMessageStore/insertOrUpdateOrderMessage/inserted row should have same row_id");
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "OrderMessageStore/insertOrUpdateOrderMessage/fail to insert. Error message is: ", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|(2:8|9)|14|(2:18|(1:20))|21|22|23|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C30821nD r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            long r0 = r8.A1L
            r5 = 0
            r3 = 1
            r4 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1W(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="
            X.C624134x.A0V(r8, r0, r1, r2)
            java.lang.String[] r1 = new java.lang.String[r3]
            X.C624134x.A0Y(r8, r1, r4)
            X.3dV r0 = r7.A01
            X.4GK r2 = r0.get()
            android.database.Cursor r4 = X.C56862sg.A03(r2, r9, r10, r1)     // Catch:{ all -> 0x00d4 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c1
            X.34p r6 = r7.A00     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "order_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A07 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "order_title"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A08 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "item_count"
            int r0 = X.AnonymousClass0x2.A04(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A00 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "message"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A06 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "status"
            int r0 = X.AnonymousClass0x2.A04(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A02 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "surface"
            int r0 = X.AnonymousClass0x2.A04(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A03 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "seller_jid"
            long r0 = X.AnonymousClass0x2.A0C(r4, r0)     // Catch:{ all -> 0x00c8 }
            com.whatsapp.jid.UserJid r0 = X.C623334p.A02(r6, r5, r0)     // Catch:{ all -> 0x00c8 }
            r8.A04 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "token"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A09 = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "currency_code"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            r8.A05 = r0     // Catch:{ all -> 0x00c8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = r8.A05     // Catch:{ IllegalArgumentException -> 0x009b }
            X.7ny r5 = new X.7ny     // Catch:{ IllegalArgumentException -> 0x009b }
            r5.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x009b }
            java.lang.String r0 = "total_amount_1000"
            long r0 = X.AnonymousClass0x2.A0C(r4, r0)     // Catch:{ IllegalArgumentException -> 0x009b }
            java.math.BigDecimal r0 = X.C57952uT.A00(r5, r0)     // Catch:{ IllegalArgumentException -> 0x009b }
            r8.A0A = r0     // Catch:{ IllegalArgumentException -> 0x009b }
            goto L_0x009e
        L_0x009b:
            r0 = 0
            r8.A05 = r0     // Catch:{ all -> 0x00c8 }
        L_0x009e:
            java.lang.String r0 = "thumbnail"
            byte[] r1 = X.C18280x3.A1Z(r4, r0)     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00b5
            int r0 = r1.length     // Catch:{ all -> 0x00c8 }
            if (r0 <= 0) goto L_0x00b5
            r8.A02 = r3     // Catch:{ all -> 0x00c8 }
            X.30w r0 = r8.A0y()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00b5
            r0.A04(r1, r11)     // Catch:{ all -> 0x00c8 }
        L_0x00b5:
            java.lang.String r0 = "message_version"
            int r0 = X.AnonymousClass0x2.A04(r4, r0)     // Catch:{ IllegalArgumentException -> 0x00bf }
            r8.A01 = r0     // Catch:{ IllegalArgumentException -> 0x00bf }
            goto L_0x00c1
        L_0x00bf:
            r8.A01 = r3     // Catch:{ all -> 0x00c8 }
        L_0x00c1:
            r4.close()     // Catch:{ all -> 0x00d4 }
            r2.close()
            return
        L_0x00c8:
            r1 = move-exception
            if (r4 == 0) goto L_0x00d3
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00d9 }
            throw r1
        L_0x00d9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51552k0.A03(X.1nD, java.lang.String, java.lang.String, boolean):void");
    }

    public C51552k0(C623334p r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A02(C30821nD r7, long j) {
        C85284Fq A04;
        boolean z = true;
        C624134x.A0V(r7, "OrderMessageStore/insertOrUpdateQuotedOrderMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r7.A0l(), 2));
        try {
            A04 = this.A01.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, j);
            A00(A06, r7);
            C18280x3.A0m(A06, r7.A02);
            A06.put("surface", Integer.valueOf(r7.A03));
            C621833x.A02(A06, "message", r7.A06);
            UserJid userJid = r7.A04;
            if (userJid != null) {
                A06.put("seller_jid", C623334p.A03(this.A00, userJid));
            }
            C621833x.A02(A06, "token", r7.A09);
            if (r7.A0y() != null) {
                C621833x.A04(A06, "thumbnail", r7.A0y().A09());
            }
            String str = r7.A05;
            if (!(str == null || r7.A0A == null)) {
                A06.put("currency_code", str);
                A06.put("total_amount_1000", C18310x6.A0g(r7.A0A.multiply(C57952uT.A00)));
            }
            if (((AnonymousClass3H0) A04).A03.A09("message_quoted_order", "INSERT_MESSAGE_QUOTED_ORDER_SQL", A06) != j) {
                z = false;
            }
            C626936e.A0F(z, "OrderMessageStore/insertOrUpdateQuotedOrderMessage/inserted row should have same row_id");
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "OrderMessageStore/insertOrUpdateQuotedOrderMessage/fail to insert. Error message is: ", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
