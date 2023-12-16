package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.2ox  reason: invalid class name and case insensitive filesystem */
public class C54582ox {
    public final C56922sm A00;
    public final C623334p A01;
    public final C72303dV A02;

    public void A01(C30771mz r9) {
        boolean z = false;
        C18260x0.A0l(C624134x.A09(r9, "ProductMessageStore/insertProductMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r9.A1L > 0 ? 1 : (r9.A1L == 0 ? 0 : -1)))), "ProductMessageStore/insertProductMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r9.A0l(), 1));
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A00(A06, r9, r9.A1L);
            if (((AnonymousClass3H0) A04).A03.A09("message_product", "INSERT_MESSAGE_PRODUCT_SQL", A06) == r9.A1L) {
                z = true;
            }
            C626936e.A0F(z, "ProductMessageStore/insertProductMessage/inserted row should have same row_id");
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A03(C30771mz r8, String str, String str2) {
        C624134x.A0V(r8, "ProductMessageStore/fillProductDataIfAvailable/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0Y(r8, strArr, 0);
        AnonymousClass4GK A03 = this.A02.get();
        try {
            Cursor A032 = C56862sg.A03(A03, str, str2, strArr);
            if (A032 != null) {
                try {
                    if (A032.moveToLast()) {
                        r8.A01 = C623334p.A02(this.A01, UserJid.class, AnonymousClass0x2.A0C(A032, "business_owner_jid"));
                        r8.A06 = AnonymousClass0x2.A0Z(A032, "product_id");
                        r8.A09 = AnonymousClass0x2.A0Z(A032, "title");
                        r8.A02 = AnonymousClass0x2.A0Z(A032, "body");
                        r8.A05 = AnonymousClass0x2.A0Z(A032, "footer");
                        r8.A04 = AnonymousClass0x2.A0Z(A032, "description");
                        String A0Z = AnonymousClass0x2.A0Z(A032, "currency_code");
                        r8.A03 = A0Z;
                        if (!TextUtils.isEmpty(A0Z)) {
                            r8.A0A = C57952uT.A00(new C160617ny(r8.A03), AnonymousClass0x2.A0C(A032, "amount_1000"));
                            r8.A0B = C57952uT.A00(new C160617ny(r8.A03), AnonymousClass0x2.A0C(A032, "sale_amount_1000"));
                        }
                        r8.A08 = AnonymousClass0x2.A0Z(A032, "retailer_id");
                        r8.A07 = AnonymousClass0x2.A0Z(A032, "url");
                        r8.A00 = AnonymousClass0x2.A04(A032, "product_image_count");
                    }
                } catch (IllegalArgumentException unused) {
                    r8.A03 = null;
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
                A032.close();
            }
            A03.close();
        } catch (Throwable th2) {
            try {
                A03.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C54582ox(C56922sm r1, C623334p r2, C72303dV r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void A00(ContentValues contentValues, C30771mz r5, long j) {
        C18270x1.A0a(contentValues, j);
        UserJid userJid = r5.A01;
        if (userJid != null) {
            contentValues.put("business_owner_jid", C623334p.A03(this.A01, userJid));
        }
        C621833x.A02(contentValues, "product_id", r5.A06);
        C621833x.A02(contentValues, "title", r5.A09);
        C621833x.A02(contentValues, "description", r5.A04);
        String str = r5.A03;
        if (!(str == null || r5.A0A == null)) {
            contentValues.put("currency_code", str);
            BigDecimal bigDecimal = r5.A0A;
            BigDecimal bigDecimal2 = C57952uT.A00;
            contentValues.put("amount_1000", C18310x6.A0g(bigDecimal.multiply(bigDecimal2)));
            BigDecimal bigDecimal3 = r5.A0B;
            if (bigDecimal3 != null) {
                contentValues.put("sale_amount_1000", C18310x6.A0g(bigDecimal3.multiply(bigDecimal2)));
            }
        }
        C621833x.A02(contentValues, "retailer_id", r5.A08);
        C621833x.A02(contentValues, "url", r5.A07);
        contentValues.put("product_image_count", Integer.valueOf(r5.A00));
        C621833x.A02(contentValues, "body", r5.A02);
        C621833x.A02(contentValues, "footer", r5.A05);
    }

    public void A02(C30771mz r8, long j) {
        C85284Fq A04;
        boolean z = true;
        C624134x.A0V(r8, "ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r8.A0l(), 2));
        try {
            A04 = this.A02.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            A00(A06, r8, j);
            if (((AnonymousClass3H0) A04).A03.A0C("message_quoted_product", "INSERT_MESSAGE_QUOTED_PRODUCT_SQL", A06, 5) != j) {
                z = false;
            }
            C626936e.A0F(z, "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id");
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: ", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
