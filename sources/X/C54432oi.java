package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2oi  reason: invalid class name and case insensitive filesystem */
public class C54432oi {
    public final C623334p A00;
    public final C72303dV A01;

    public void A01(C30761my r9) {
        boolean z = false;
        C18260x0.A0l(C624134x.A09(r9, "CatalogMessageStore/insertCatalogMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r9.A1L > 0 ? 1 : (r9.A1L == 0 ? 0 : -1)))), "CatalogMessageStore/insertCatalogMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r9.A0l(), 1));
        C85284Fq A04 = this.A01.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A00(A06, r9, r9.A1L);
            if (((AnonymousClass3H0) A04).A03.A09("message_product", "INSERT_MESSAGE_CATALOG_SQL", A06) == r9.A1L) {
                z = true;
            }
            C626936e.A0F(z, "CatalogMessageStore/insertCatalogMessage/inserted row should have same row_id");
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A03(C30761my r8, String str, String str2) {
        Cursor A03;
        C624134x.A0V(r8, "CatalogMessageStore/fillCatalogDataIfAvailable/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0Y(r8, strArr, 0);
        AnonymousClass4GK A032 = this.A01.get();
        try {
            A03 = C56862sg.A03(A032, str, str2, strArr);
            if (A03.moveToLast()) {
                r8.A00 = C623334p.A02(this.A00, UserJid.class, AnonymousClass0x2.A0C(A03, "business_owner_jid"));
                r8.A02 = AnonymousClass0x2.A0Z(A03, "title");
                r8.A01 = AnonymousClass0x2.A0Z(A03, "description");
            }
            A03.close();
            A032.close();
            return;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C54432oi(C623334p r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(ContentValues contentValues, C30761my r4, long j) {
        C18270x1.A0a(contentValues, j);
        UserJid userJid = r4.A00;
        if (userJid != null) {
            contentValues.put("business_owner_jid", C623334p.A03(this.A00, userJid));
        }
        C621833x.A02(contentValues, "title", r4.A02);
        C621833x.A02(contentValues, "description", r4.A01);
    }

    public void A02(C30761my r8, long j) {
        C85284Fq A04;
        boolean z = true;
        C624134x.A0V(r8, "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r8.A0l(), 2));
        try {
            A04 = this.A01.A04();
            ContentValues A06 = AnonymousClass0x9.A06();
            A00(A06, r8, j);
            if (((AnonymousClass3H0) A04).A03.A0C("message_quoted_product", "INSERT_MESSAGE_QUOTED_CATALOG_SQL", A06, 5) != j) {
                z = false;
            }
            C626936e.A0F(z, "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id");
            A04.close();
            return;
        } catch (SQLiteConstraintException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: ", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
