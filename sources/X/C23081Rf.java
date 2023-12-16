package X;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Rf  reason: invalid class name and case insensitive filesystem */
public class C23081Rf extends AnonymousClass31D {
    public final C623334p A00;
    public final AnonymousClass36F A01;

    public AnonymousClass32H A0D(Cursor cursor) {
        Jid A002;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("interop_id");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("status");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("error_code");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("sender");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("receiver");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("currency");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("amount_1000");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("credential_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("methods");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("bank_transaction_id");
        int columnIndexOrThrow18 = cursor2.getColumnIndexOrThrow("metadata");
        int columnIndexOrThrow19 = cursor2.getColumnIndexOrThrow("init_timestamp");
        int columnIndexOrThrow20 = cursor2.getColumnIndexOrThrow("request_key_id");
        int columnIndexOrThrow21 = cursor2.getColumnIndexOrThrow("country");
        int columnIndexOrThrow22 = cursor2.getColumnIndexOrThrow("version");
        int columnIndexOrThrow23 = cursor2.getColumnIndexOrThrow("future_data");
        int columnIndexOrThrow24 = cursor2.getColumnIndexOrThrow("service_id");
        int columnIndexOrThrow25 = cursor2.getColumnIndexOrThrow("background_id");
        int columnIndexOrThrow26 = cursor2.getColumnIndexOrThrow("purchase_initiator");
        C85284Fq A03 = AnonymousClass31D.A03(this);
        long j = -1;
        int i = 0;
        while (cursor2.moveToNext()) {
            try {
                ContentValues A07 = AnonymousClass0x9.A07(25);
                j = cursor2.getLong(columnIndexOrThrow);
                C18270x1.A0c(A07, "_id", j);
                if (!cursor2.isNull(columnIndexOrThrow2)) {
                    AnonymousClass31D.A06(A07, cursor2, "message_row_id", columnIndexOrThrow2);
                }
                if (!cursor2.isNull(columnIndexOrThrow3) && (A002 = AnonymousClass32W.A00(cursor2.getString(columnIndexOrThrow3))) != null) {
                    long A05 = this.A00.A05(A002);
                    if (A05 != -1) {
                        C18270x1.A0c(A07, "remote_jid_row_id", A05);
                    }
                }
                AnonymousClass31D.A07(A07, cursor2, "key_id", columnIndexOrThrow4);
                AnonymousClass31D.A07(A07, cursor2, "interop_id", columnIndexOrThrow5);
                AnonymousClass31D.A07(A07, cursor2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, columnIndexOrThrow6);
                if (!cursor2.isNull(columnIndexOrThrow7)) {
                    AnonymousClass31D.A06(A07, cursor2, "timestamp", columnIndexOrThrow7);
                }
                if (!cursor2.isNull(columnIndexOrThrow8)) {
                    AnonymousClass31D.A06(A07, cursor2, "status", columnIndexOrThrow8);
                }
                AnonymousClass31D.A07(A07, cursor2, "error_code", columnIndexOrThrow9);
                String string = cursor2.getString(columnIndexOrThrow10);
                AnonymousClass32W r14 = Jid.Companion;
                Jid A032 = r14.A03(string);
                if (A032 != null) {
                    long A052 = this.A00.A05(A032);
                    if (A052 != -1) {
                        C18270x1.A0c(A07, "sender_jid_row_id", A052);
                    }
                }
                Jid A033 = r14.A03(cursor2.getString(columnIndexOrThrow11));
                if (A033 != null) {
                    long A053 = this.A00.A05(A033);
                    if (A053 != -1) {
                        C18270x1.A0c(A07, "receiver_jid_row_id", A053);
                    }
                }
                AnonymousClass31D.A06(A07, cursor2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, columnIndexOrThrow12);
                AnonymousClass31D.A07(A07, cursor2, "currency_code", columnIndexOrThrow13);
                AnonymousClass31D.A06(A07, cursor2, "amount_1000", columnIndexOrThrow14);
                AnonymousClass31D.A07(A07, cursor2, "credential_id", columnIndexOrThrow15);
                AnonymousClass31D.A07(A07, cursor2, "methods", columnIndexOrThrow16);
                AnonymousClass31D.A07(A07, cursor2, "bank_transaction_id", columnIndexOrThrow17);
                AnonymousClass31D.A07(A07, cursor2, "metadata", columnIndexOrThrow18);
                if (!cursor2.isNull(columnIndexOrThrow19)) {
                    AnonymousClass31D.A06(A07, cursor2, "init_timestamp", columnIndexOrThrow19);
                }
                AnonymousClass31D.A07(A07, cursor2, "request_key_id", columnIndexOrThrow20);
                AnonymousClass31D.A07(A07, cursor2, "country", columnIndexOrThrow21);
                AnonymousClass31D.A06(A07, cursor2, "version", columnIndexOrThrow22);
                C621833x.A04(A07, "future_data", cursor2.getBlob(columnIndexOrThrow23));
                AnonymousClass31D.A06(A07, cursor2, "service_id", columnIndexOrThrow24);
                AnonymousClass31D.A07(A07, cursor2, "background_id", columnIndexOrThrow25);
                AnonymousClass31D.A06(A07, cursor2, "purchase_initiator", columnIndexOrThrow26);
                ((AnonymousClass3H0) A03).A03.A09("pay_transaction", "INSERT_PAY_TRANSACTION_TABLE", A07);
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        return AnonymousClass31D.A04(A03, i, j);
    }

    public C23081Rf(C623334p r3, AnonymousClass36F r4, AnonymousClass2U4 r5) {
        super(r5, "payment_transaction", 1);
        this.A00 = r3;
        this.A01 = r4;
    }
}
