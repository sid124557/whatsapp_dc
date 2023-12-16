package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.36F  reason: invalid class name */
public class AnonymousClass36F {
    public static final String[] A0A = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id", "background_id", "purchase_initiator"};
    public C85024Eq A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C56082rO A05;
    public final C617332a A06;
    public final AnonymousClass8EA A07;
    public final C55192px A08;
    public final C160757oG A09 = C160757oG.A00("PaymentTransactionStore", "database", "COMMON");

    public static Pair A01() {
        String[] strArr = new String[5];
        strArr[0] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr[1] = num;
        AnonymousClass001.A1H(Integer.toString(10), num, strArr);
        strArr[4] = Integer.toString(19);
        return AnonymousClass0x9.A0C("((type=? AND status=?) OR (type=? AND (status=? OR status=?)))", strArr);
    }

    public final Cursor A0A(Integer num) {
        String str;
        String[] strArr = new String[5];
        String num2 = Integer.toString(20);
        strArr[0] = num2;
        strArr[1] = Integer.toString(12);
        AnonymousClass001.A1H(Integer.toString(40), num2, strArr);
        strArr[4] = "%\"isPendingRequestViewed\":true%";
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] strArr2 = A0A;
            if (num != null) {
                str = num.toString();
            } else {
                str = null;
            }
            Cursor A0F = r3.A0F("pay_transaction", strArr2, "((type=? AND status=?) OR (type=? AND status=?)) AND metadata NOT LIKE ?", strArr, (String) null, (String) null, str, "getUnviewedPendingRequestsCursor/QUERY_PAY_TRANSACTION");
            A032.close();
            return A0F;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final Pair A0B() {
        String l = Long.toString(this.A03.A05(A0I()));
        Pair A0C = AnonymousClass0x9.A0C(new String[]{l, l}, "( sender_jid_row_id=? OR receiver_jid_row_id=? )");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        A0o.append((String) A0C.second);
        A0o.append(") OR (");
        A0o.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0o.append("=? AND ");
        A0o.append("status");
        A0o.append("!=? AND ");
        A0o.append("status");
        A0o.append("!=?) OR (");
        A0o.append(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0o.append("=? AND (");
        A0o.append("status");
        A0o.append("=? OR ");
        A0o.append("status");
        A0o.append("=? OR ");
        A0o.append("status");
        C18260x0.A0p("=?)) OR (", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "=? AND ", "status", A0o);
        A0o.append("!=? AND ");
        A0o.append("status");
        A0o.append("!=? AND ");
        A0o.append("status");
        String A0X = AnonymousClass000.A0X("!=?))", A0o);
        Pair A0C2 = AnonymousClass0x9.A0C(new String[0], (Object) null);
        String[] strArr = (String[]) A0C2.first;
        Object obj = A0C2.second;
        if (obj != null) {
            StringBuilder A0l = AnonymousClass000.A0l(A0X);
            A0l.append(" AND ");
            A0X = AnonymousClass000.A0X((String) obj, A0l);
        }
        boolean A1U = C18320x8.A1U((CharSequence) null);
        if (A1U) {
            A0X = AnonymousClass000.A0X(" AND credential_id=?", AnonymousClass000.A0l(A0X));
        }
        int length = strArr.length;
        String[] strArr2 = new String[((A1U ? 1 : 0) + true + length)];
        int i = 0;
        strArr2[0] = Integer.toString(1);
        C18320x8.A1Q(strArr2, 2, 1);
        C18320x8.A1Q(strArr2, 100, 2);
        strArr2[3] = Integer.toString(6);
        strArr2[4] = Integer.toString(7);
        strArr2[5] = Integer.toString(8);
        C18320x8.A1Q(strArr2, 9, 6);
        C18320x8.A1Q(strArr2, 1000, 7);
        String[] strArr3 = (String[]) A0C.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(40);
        strArr2[14] = Integer.toString(415);
        strArr2[15] = Integer.toString(15);
        strArr2[16] = Integer.toString(16);
        C18320x8.A1Q(strArr2, 10, 17);
        strArr2[18] = num;
        strArr2[19] = Integer.toString(19);
        strArr2[20] = num2;
        int i2 = 21;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        if (A1U) {
            strArr2[i2] = null;
        }
        return AnonymousClass0x9.A0C(A0X, strArr2);
    }

    public final Pair A0C(C95814uZ r11) {
        Pair A0B = A0B();
        Pair A012 = A01();
        Pair A0C = AnonymousClass0x9.A0C(new String[0], (Object) null);
        Pair A022 = A02(A012, AnonymousClass0x9.A0C(A0C.second, A0C.first), "AND");
        String[] strArr = new String[(((String[]) A0B.second).length + 1 + ((String[]) A022.second).length)];
        long A052 = this.A03.A05(r11);
        if (A052 != -1) {
            boolean A1W = AnonymousClass0x7.A1W(strArr, A052);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("(");
            A0o.append("remote_jid_row_id=?");
            A0o.append(" AND (");
            A0o.append((String) A0B.first);
            A0o.append(" OR ");
            A0o.append((String) A022.first);
            String A0X = AnonymousClass000.A0X("))", A0o);
            Object obj = A0B.second;
            System.arraycopy(obj, A1W ? 1 : 0, strArr, 1, ((String[]) obj).length);
            Object obj2 = A022.second;
            System.arraycopy(obj2, A1W, strArr, ((String[]) A0B.second).length + 1, ((String[]) obj2).length);
            return AnonymousClass0x9.A0C(A0X, strArr);
        }
        this.A09.A05(C18260x0.A03(r11, "getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=", AnonymousClass001.A0o()));
        return null;
    }

    public C624034w A0F(String str) {
        Cursor A0F;
        boolean z = true;
        String str2 = str;
        String[] A1a = C18300x5.A1a(str2, 1);
        AnonymousClass4GK A032 = this.A04.get();
        try {
            A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, "request_key_id=?", A1a, (String) null, (String) null, (String) null, "readTransactionInfoByRequestMessageId/QUERY_PAY_TRANSACTION");
            C624034w r3 = null;
            if (A0F.moveToLast()) {
                r3 = A0E(A0F);
            }
            A0F.close();
            A032.close();
            C160757oG r2 = this.A09;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("readTransactionInfoByRequestMessageId/");
            A0o.append(str2);
            A0o.append("/");
            if (r3 == null) {
                z = false;
            }
            r2.A06(C18300x5.A0m(A0o, z));
            return r3;
        } catch (AnonymousClass24P e) {
            this.A09.A0A("PaymentTransactionStore/readTransactionInfoByRequestMessageId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID", e);
            A0F.close();
            A032.close();
            return null;
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

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624034w A0G(java.lang.String r19) {
        /*
            r18 = this;
            r4 = 1
            r5 = r19
            java.lang.String[] r13 = X.C18300x5.A1a(r5, r4)
            java.lang.String r17 = "readTransactionInfoByTransId/QUERY_PAY_TRANSACTION"
            r7 = r18
            X.3dV r0 = r7.A04
            X.4GK r8 = r0.get()
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006b }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x006b }
            java.lang.String r10 = "pay_transaction"
            java.lang.String[] r11 = A0A     // Catch:{ all -> 0x006b }
            java.lang.String r12 = "id=?"
            r14 = 0
            r16 = r14
            r15 = r14
            android.database.Cursor r6 = r9.A0F(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x006b }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0039
            X.34w r3 = r7.A0E(r6)     // Catch:{ 24P -> 0x0031 }
            goto L_0x003a
        L_0x0031:
            r2 = move-exception
            X.7oG r1 = r7.A09     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByTransId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x005f }
        L_0x0039:
            r3 = 0
        L_0x003a:
            r6.close()     // Catch:{ all -> 0x006b }
            r8.close()
            X.7oG r2 = r7.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "readTransactionInfoByTransId/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r3 != 0) goto L_0x0057
            r4 = 0
        L_0x0057:
            java.lang.String r0 = X.C18300x5.A0m(r1, r4)
            r2.A06(r0)
            return r3
        L_0x005f:
            r1 = move-exception
            if (r6 == 0) goto L_0x006a
            r6.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x006b }
        L_0x006a:
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0070 }
            throw r1
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0G(java.lang.String):X.34w");
    }

    public List A0K() {
        String[] A1a = AnonymousClass0x9.A1a();
        C18270x1.A1O(A1a, 405);
        A1a[1] = String.valueOf(1);
        AnonymousClass0x2.A1S(A1a, 2, System.currentTimeMillis() - ((((((long) 60) * 24) * 60) * 60) * 1000));
        String A0X = AnonymousClass000.A0X("/QUERY_PAY_TRANSACTION", AnonymousClass000.A0l("readMostFrequentSuccessfulTransactions/QUERY_SUCCESSFUL_TRANSACTIONS"));
        String join = TextUtils.join(",", new String[]{"sender_jid_row_id", "receiver_jid_row_id"});
        String[] strArr = new String[6];
        AnonymousClass000.A16("sender_jid_row_id", "receiver_jid_row_id", strArr);
        strArr[2] = "status";
        strArr[3] = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("COUNT(");
        A0o.append("status");
        strArr[4] = AnonymousClass000.A0V(") AS ", "frequency", A0o);
        strArr[5] = AnonymousClass000.A0V("MAX(init_timestamp) AS ", "recentTransactionTs", AnonymousClass001.A0o());
        AnonymousClass4GK A032 = this.A04.get();
        try {
            Cursor A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", strArr, "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is not null", A1a, join, "frequency DESC", String.valueOf(4), A0X);
            if (A0F == null) {
                return C18320x8.A0n(A032);
            }
            try {
                ArrayList A0o2 = AnonymousClass000.A0o(A0F);
                while (A0F.moveToNext()) {
                    int A042 = AnonymousClass0x2.A04(A0F, "status");
                    C623334p r11 = this.A03;
                    UserJid A022 = AnonymousClass32Y.A02(r11, AnonymousClass0x2.A0C(A0F, "sender_jid_row_id"));
                    UserJid A052 = AnonymousClass32Y.A05(r11.A08(AnonymousClass0x2.A0C(A0F, "receiver_jid_row_id")));
                    int A043 = AnonymousClass0x2.A04(A0F, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    String A0Z = AnonymousClass0x2.A0Z(A0F, "frequency");
                    long A0C = AnonymousClass0x2.A0C(A0F, "recentTransactionTs");
                    C160757oG r112 = this.A09;
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("readTransactionInfoByTransId got from db: type: ");
                    A0o3.append(A043);
                    A0o3.append(" status: ");
                    A0o3.append(A042);
                    A0o3.append(" sender: ");
                    A0o3.append(A022);
                    r112.A04(AnonymousClass000.A0P(A052, " peer: ", A0o3));
                    A0o2.add(new AnonymousClass3ZQ(A022, A052, Integer.valueOf(A0Z).intValue(), A0C));
                }
                C160757oG r2 = this.A09;
                StringBuilder A0o4 = AnonymousClass001.A0o();
                C18260x0.A19("readMostFrequentSuccessfulTransactions returned: ", A0o4, A0o2);
                r2.A06(A0o4.toString());
                A0F.close();
                A032.close();
                return A0o2;
            } catch (AnonymousClass24P e) {
                this.A09.A0A("extractPaymentTransactionInfo/InvalidJidException - Skipped transaction with invalid JID", e);
            } catch (Throwable th) {
                A0F.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public synchronized List A0L() {
        List A0S;
        synchronized (this) {
            Pair A012 = A01();
            Pair A0C = AnonymousClass0x9.A0C(new String[0], (Object) null);
            Pair A022 = A02(A012, AnonymousClass0x9.A0C(A0C.second, A0C.first), "AND");
            A0S = A0S((String) A022.first, (String[]) A022.second, -1);
        }
        return A0S;
    }

    public synchronized List A0M(int i) {
        List A0S;
        synchronized (this) {
            Pair A0C = AnonymousClass0x9.A0C(new String[0], (Object) null);
            Pair A012 = A01();
            String[] A1Z = AnonymousClass0x9.A1Z();
            A1Z[0] = ((AnonymousClass1S3) AnonymousClass1S3.A06).A04;
            A1Z[1] = "%money%";
            Pair A022 = A02(A012, AnonymousClass0x9.A0C("(currency_code != ? OR metadata LIKE ?)", A1Z), "AND");
            String[] A1Z2 = AnonymousClass0x9.A1Z();
            A1Z2[0] = Integer.toString(8);
            A1Z2[1] = Integer.toString(608);
            Pair A023 = A02(A02(A022, AnonymousClass0x9.A0C("(type=? AND status=?)", A1Z2), "OR"), AnonymousClass0x9.A0C((String) A0C.second, (String[]) A0C.first), "AND");
            A0S = A0S((String) A023.first, (String[]) A023.second, i);
        }
        return A0S;
    }

    public synchronized List A0N(int i) {
        ArrayList A0I;
        Integer[] numArr;
        A0I = AnonymousClass002.A0I(r8 + r6 + r3);
        for (int A1K : C624034w.A0T) {
            C18270x1.A1K(A0I, A1K);
        }
        for (int A1K2 : C624034w.A0V) {
            C18270x1.A1K(A0I, A1K2);
        }
        for (int A1K3 : C624034w.A0U) {
            C18270x1.A1K(A0I, A1K3);
        }
        numArr = new Integer[9];
        AnonymousClass000.A1P(numArr, 2, 0);
        numArr[1] = 1;
        AnonymousClass000.A1P(numArr, 200, 2);
        AnonymousClass000.A1O(numArr, 100);
        C18280x3.A1P(numArr, 20);
        C18310x6.A1U(numArr, 10);
        numArr[6] = 6;
        numArr[7] = 7;
        numArr[8] = 8;
        return A0V((Integer[]) A0I.toArray(new Integer[0]), numArr, i);
    }

    public final List A0P(C95814uZ r16, int i) {
        Pair A0C;
        String str;
        Cursor A0F;
        List list;
        C95814uZ r0 = r16;
        if (r16 == null) {
            A0C = A0B();
        } else {
            A0C = A0C(r0);
        }
        if (A0C == null) {
            this.A09.A05("readTransactionsV2/null queryPair");
            return AnonymousClass001.A0s();
        }
        String str2 = (String) A0C.first;
        String[] strArr = (String[]) A0C.second;
        if (i > 0) {
            str = Integer.toString(i);
        } else {
            str = "";
        }
        AnonymousClass4GK A032 = this.A04.get();
        try {
            A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, str2, strArr, (String) null, "init_timestamp DESC", str, "readTransactionsV2/QUERY_PAY_TRANSACTION");
            if (A0F != null) {
                list = A0O(A0F, "readTransactionsV2");
                C160757oG r2 = this.A09;
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1H("readTransactionsV2 returned: ", A0o, list);
                r2.A07(A0o.toString());
                A0F.close();
            } else {
                list = AnonymousClass001.A0s();
            }
            A032.close();
            return list;
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

    public synchronized List A0R(String str, Integer[] numArr, Integer[] numArr2, int i) {
        List list;
        String str2;
        String str3;
        Cursor A0F;
        C72303dV r3 = this.A04;
        if (!C72303dV.A00(r3)) {
            list = Collections.emptyList();
        } else {
            Integer[] numArr3 = numArr;
            if (numArr3.length > 0) {
                str2 = String.format("(%s IN (\"%s\"))", new Object[]{"status", TextUtils.join("\",\"", numArr3)});
            } else {
                str2 = "";
            }
            Integer[] numArr4 = numArr2;
            if (numArr4.length > 0) {
                str3 = String.format("(%s IN (\"%s\"))", new Object[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, TextUtils.join("\",\"", numArr4)});
            } else {
                str3 = "";
            }
            String str4 = null;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = str2;
            } else if (!TextUtils.isEmpty(str2)) {
                str3 = AnonymousClass000.A0V(" AND ", str3, AnonymousClass000.A0l(str2));
            }
            if (!TextUtils.isEmpty(str)) {
                String A0V = AnonymousClass000.A0V("credential_id=", str, AnonymousClass001.A0o());
                if (TextUtils.isEmpty(str3)) {
                    str3 = A0V;
                } else {
                    str3 = AnonymousClass000.A0V(" AND ", A0V, AnonymousClass000.A0l(str3));
                }
            }
            if (TextUtils.isEmpty(str3)) {
                list = AnonymousClass001.A0s();
            } else {
                String format = String.format("(%s) AND (%s IS NOT NULL)", new Object[]{str3, PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                C160757oG r2 = this.A09;
                r2.A07(AnonymousClass000.A0V("pending txns query: ", format, AnonymousClass001.A0o()));
                if (i > 0) {
                    str4 = Integer.toString(i);
                }
                try {
                    AnonymousClass4GK A032 = r3.get();
                    try {
                        A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, format, (String[]) null, (String) null, "timestamp DESC", str4, "readTransactionsWithTypeAndStatus/QUERY_PAY_TRANSACTION");
                        list = A0O(A0F, "readTransactionsWithTypeStatusAndCredentialId");
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass000.A1H("readPendingTransactions returned: ", A0o, list);
                        r2.A07(A0o.toString());
                        if (A0F != null) {
                            A0F.close();
                        }
                        A032.close();
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    r2.A0A("readPendingTransactions/IllegalStateException ", e);
                    list = AnonymousClass001.A0s();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return list;
        throw th;
    }

    public final synchronized List A0U(boolean z) {
        List<C624034w> list;
        ArrayList A0s;
        C69833Yo Axl;
        synchronized (this) {
            long A0H = this.A02.A0H();
            if (z) {
                ArrayList A0I = AnonymousClass002.A0I(r7 + r3);
                for (int A1K : C624034w.A0T) {
                    C18270x1.A1K(A0I, A1K);
                }
                for (int A1K2 : C624034w.A0U) {
                    C18270x1.A1K(A0I, A1K2);
                }
                Integer[] numArr = new Integer[4];
                AnonymousClass000.A1P(numArr, 2, 0);
                AnonymousClass000.A1M(numArr, 200);
                AnonymousClass000.A1P(numArr, 20, 2);
                AnonymousClass000.A1O(numArr, 10);
                list = A0V((Integer[]) A0I.toArray(new Integer[0]), numArr, -1);
            } else {
                list = A0N(-1);
            }
            A0s = AnonymousClass001.A0s();
            try {
                C85284Fq A042 = this.A04.A04();
                try {
                    Axl = A042.Axl();
                    for (C624034w r5 : list) {
                        ContentValues A062 = AnonymousClass0x9.A06();
                        Pair A032 = A03(r5.A0L, r5.A0K);
                        if (A032 != null) {
                            C18270x1.A0b(A062, "status", 0);
                            C18270x1.A0b(A062, "timestamp", (int) C18290x4.A0B(A0H));
                            C160757oG r2 = this.A09;
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("failed transaction/key_id=");
                            A0o.append(r5.A0L);
                            A0o.append(", transaction_id=");
                            r2.A06(AnonymousClass000.A0X(r5.A0K, A0o));
                            A06(A062, A032, A042);
                            A0s.add(AnonymousClass2z0.A05(r5.A0C, r5.A0L, r5.A0Q));
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                this.A09.A05(AnonymousClass000.A0P(e, "PaymentTransactionStore/failPendingTransactions/failed: ", AnonymousClass001.A0o()));
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return A0s;
        throw th;
    }

    public synchronized List A0V(Integer[] numArr, Integer[] numArr2, int i) {
        return A0R((String) null, numArr, numArr2, i);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0Y(X.C624034w r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.2sH r0 = r9.A02     // Catch:{ all -> 0x006d }
            long r7 = r0.A0H()     // Catch:{ all -> 0x006d }
            X.3dV r0 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0064 }
            X.4Fq r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0064 }
            X.3Yo r6 = r4.Axl()     // Catch:{ all -> 0x005a }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x0050 }
            A03(r1, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "status"
            r0 = 16
            X.C18270x1.A0b(r5, r1, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = "timestamp"
            long r1 = X.C18290x4.A0B(r7)     // Catch:{ all -> 0x0050 }
            int r0 = (int) r1     // Catch:{ all -> 0x0050 }
            X.C18270x1.A0b(r5, r3, r0)     // Catch:{ all -> 0x0050 }
            X.7oG r2 = r9.A09     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "expirePendingRequest key id:"
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0050 }
            r2.A06(r0)     // Catch:{ all -> 0x0050 }
            A00(r5, r4, r10)     // Catch:{ all -> 0x0050 }
            r6.A00()     // Catch:{ all -> 0x0050 }
            r6.close()     // Catch:{ all -> 0x005a }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0064 }
            goto L_0x006b
        L_0x0050:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x005a }
        L_0x0059:
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0064 }
        L_0x0064:
            X.7oG r1 = r9.A09     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "expirePendingRequest failed."
            r1.A05(r0)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r9)
            return
        L_0x006d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0Y(X.34w):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1 = r5.A02;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r0 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        r0 = new X.C166227yL();
        r3.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        r0.A00.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        return r4.A0K(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0e(X.C624034w r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.1S4 r0 = r9.A0A     // Catch:{ all -> 0x00b0 }
            r6 = 0
            if (r0 == 0) goto L_0x0009
            X.39O r5 = r0.A00     // Catch:{ all -> 0x00b0 }
            goto L_0x000a
        L_0x0009:
            r5 = r6
        L_0x000a:
            r7 = 0
            if (r5 == 0) goto L_0x00ae
            X.2sr r1 = r8.A01     // Catch:{ all -> 0x00b0 }
            com.whatsapp.jid.UserJid r0 = r9.A0E     // Catch:{ all -> 0x00b0 }
            boolean r0 = r1.A0a(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00ae
            com.whatsapp.jid.UserJid r0 = r9.A0D     // Catch:{ all -> 0x00b0 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a7
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a7
            X.8EA r4 = r8.A07     // Catch:{ all -> 0x00b0 }
            X.6hl r3 = r4.A05(r2)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r3.A05     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x004d
        L_0x002f:
            java.lang.String r0 = X.AnonymousClass36P.A03(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = X.C621333r.A02(r0)     // Catch:{ all -> 0x00b0 }
            X.7pU r0 = X.C161357pU.A01(r0)     // Catch:{ all -> 0x00b0 }
            X.4Eq r1 = r8.A00     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x00b0 }
            X.8v4 r0 = r1.BCs(r0, r6)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0060
            X.6hl r3 = r0.BG1()     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x00ae
            r3.A05 = r2     // Catch:{ all -> 0x00b0 }
        L_0x004d:
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x00b0 }
            X.7yL r0 = r3.A04     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00b0 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00b0 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00b0 }
            goto L_0x0063
        L_0x0060:
            if (r3 == 0) goto L_0x00ae
            goto L_0x004d
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            r2 = r0
        L_0x0066:
            int r0 = r9.A02     // Catch:{ NumberFormatException -> 0x009e }
            switch(r0) {
                case 401: goto L_0x007d;
                case 402: goto L_0x007d;
                case 403: goto L_0x007d;
                case 404: goto L_0x0073;
                case 405: goto L_0x007d;
                case 406: goto L_0x0073;
                case 407: goto L_0x0073;
                case 408: goto L_0x0073;
                case 409: goto L_0x0073;
                case 410: goto L_0x007d;
                case 411: goto L_0x0073;
                case 412: goto L_0x0073;
                case 413: goto L_0x0073;
                case 414: goto L_0x0073;
                case 415: goto L_0x0073;
                case 416: goto L_0x0073;
                case 417: goto L_0x007d;
                case 418: goto L_0x0073;
                case 419: goto L_0x0073;
                case 420: goto L_0x007d;
                case 421: goto L_0x0073;
                default: goto L_0x006b;
            }     // Catch:{ NumberFormatException -> 0x009e }
        L_0x006b:
            X.7oG r1 = r8.A09     // Catch:{ NumberFormatException -> 0x009e }
            java.lang.String r0 = "There's no valid transaction status. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ NumberFormatException -> 0x009e }
            goto L_0x00ae
        L_0x0073:
            java.lang.String r0 = r9.A0K     // Catch:{ NumberFormatException -> 0x009e }
            java.lang.Long r0 = X.C18290x4.A0h(r0)     // Catch:{ NumberFormatException -> 0x009e }
            r2.remove(r0)     // Catch:{ NumberFormatException -> 0x009e }
            goto L_0x0086
        L_0x007d:
            java.lang.String r0 = r9.A0K     // Catch:{ NumberFormatException -> 0x009e }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x009e }
            X.AnonymousClass0x2.A1Q(r2, r0)     // Catch:{ NumberFormatException -> 0x009e }
        L_0x0086:
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00b0 }
            X.7yL r0 = r3.A04     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0093
            X.7yL r0 = new X.7yL     // Catch:{ all -> 0x00b0 }
            r0.<init>()     // Catch:{ all -> 0x00b0 }
            r3.A04 = r0     // Catch:{ all -> 0x00b0 }
        L_0x0093:
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00b0 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00b0 }
            boolean r0 = r4.A0K(r3)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r8)
            return r0
        L_0x009e:
            r2 = move-exception
            X.7oG r1 = r8.A09     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "There was a problem parsing the paymentTransactionInfo.id"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ae
        L_0x00a7:
            X.7oG r1 = r8.A09     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "insertOrUpdateIncentivePaymentContactInfo/ Receiver Jid or transaction id are null. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r8)
            return r7
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0e(X.34w):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0143, code lost:
        if (r5 <= 0) goto L_0x0145;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(X.C624034w r21, X.C624034w r22, java.lang.String r23) {
        /*
            r20 = this;
            r13 = 0
            r3 = r20
            r7 = r21
            r4 = r23
            r7.A0L = r4     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            r8 = r22
            android.content.ContentValues r0 = r3.A08(r8, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            if (r0 != 0) goto L_0x0019
            X.7oG r1 = r3.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessage() content-values are null, nothing to update"
            r1.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            return r13
        L_0x0019:
            int r0 = r0.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            if (r0 <= 0) goto L_0x0154
            X.3dV r0 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            X.4Fq r12 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            r10 = 0
            android.content.ContentValues r15 = r3.A09(r8, r7)     // Catch:{ all -> 0x014a }
            r5 = 0
            if (r15 != 0) goto L_0x0038
            X.7oG r2 = r3.A09     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 content values are null, nothing to update"
        L_0x0033:
            r2.A06(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0140
        L_0x0038:
            boolean r0 = r7.A0P     // Catch:{ all -> 0x014a }
            java.lang.String r1 = "key_id"
            if (r0 != 0) goto L_0x0104
            r15.put(r1, r4)     // Catch:{ all -> 0x014a }
        L_0x0041:
            java.lang.String r1 = "/"
            if (r22 != 0) goto L_0x0063
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x014a }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x014a }
            java.lang.String r2 = "insertOrUpdatePaymentInfoWithoutMessageV2/REPLACE_PAY_TRANSACTION"
            java.lang.String r0 = "pay_transaction"
            long r5 = r5.A0A(r0, r2, r15)     // Catch:{ all -> 0x014a }
            X.7oG r2 = r3.A09     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/"
        L_0x005b:
            X.AnonymousClass001.A1K(r0, r4, r1, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.AnonymousClass001.A0k(r8, r5)     // Catch:{ all -> 0x014a }
            goto L_0x0033
        L_0x0063:
            boolean r0 = r8.A0Q(r7)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0145
            java.lang.String r9 = r7.A0K     // Catch:{ all -> 0x014a }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x014a }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0079
            if (r2 == 0) goto L_0x0079
            goto L_0x0123
        L_0x0079:
            r5 = 2
            r0 = 1
            if (r6 != 0) goto L_0x0089
            if (r2 != 0) goto L_0x0080
            goto L_0x0090
        L_0x0080:
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x014a }
            r2[r13] = r23     // Catch:{ all -> 0x014a }
            r2[r0] = r23     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "key_id=? OR interop_id=?"
            goto L_0x009c
        L_0x0089:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x014a }
            r2[r13] = r9     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "id=?"
            goto L_0x009c
        L_0x0090:
            java.lang.String[] r2 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x014a }
            r2[r13] = r23     // Catch:{ all -> 0x014a }
            r2[r0] = r23     // Catch:{ all -> 0x014a }
            r2[r5] = r9     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "key_id=? OR interop_id=? OR id=?"
        L_0x009c:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r2)     // Catch:{ all -> 0x014a }
            java.lang.Object r6 = r0.first     // Catch:{ all -> 0x014a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x014a }
            java.lang.Object r5 = r0.second     // Catch:{ all -> 0x014a }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ all -> 0x014a }
            X.7oG r2 = r3.A09     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 already exists with old message id: "
            r9.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x014a }
            r9.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "; new key id: "
            r9.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x014a }
            r9.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " old transaction id: "
            X.C624034w.A00(r8, r0, r9)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " new transaction id: "
            X.C624034w.A00(r7, r0, r9)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " query: "
            r9.append(r0)     // Catch:{ all -> 0x014a }
            r9.append(r6)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " params: "
            r9.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = java.util.Arrays.toString(r5)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r9)     // Catch:{ all -> 0x014a }
            r2.A04(r0)     // Catch:{ all -> 0x014a }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x014a }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x014a }
            java.lang.String r16 = "pay_transaction"
            java.lang.String r18 = "insertOrUpdatePaymentInfoWithoutMessageV2/UPDATE_PAY_TRANSACTION"
            r19 = r5
            r17 = r6
            int r0 = r14.A05(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x014a }
            long r5 = (long) r0     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/found old row and updating transaction id: "
            X.C624034w.A00(r7, r0, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " message id: "
            goto L_0x005b
        L_0x0104:
            java.lang.String r0 = "interop_id"
            r15.put(r0, r4)     // Catch:{ all -> 0x014a }
            r15.remove(r1)     // Catch:{ all -> 0x014a }
            X.7oG r1 = r3.A09     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 interop_id is added to content values"
            r1.A06(r0)     // Catch:{ all -> 0x014a }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is empty"
        L_0x011b:
            r1.A06(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0041
        L_0x0120:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is not empty"
            goto L_0x011b
        L_0x0123:
            X.7oG r2 = r3.A09     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 got null query and params for interop id: "
            r1.append(r0)     // Catch:{ all -> 0x014a }
            r1.append(r4)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = " trans id: "
            r1.append(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x014a }
            r2.A06(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0145
        L_0x0140:
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            return r0
        L_0x014a:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x014f }
            goto L_0x0153
        L_0x014f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
        L_0x0153:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
        L_0x0154:
            X.7oG r2 = r3.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/found no columns to update: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            r2.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0164 }
            return r13
        L_0x0164:
            r2 = move-exception
            X.7oG r1 = r3.A09
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage"
            r1.A0A(r0, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0f(X.34w, X.34w, java.lang.String):boolean");
    }

    public static Pair A02(Pair pair, Pair pair2, String str) {
        if (TextUtils.isEmpty((CharSequence) pair.first)) {
            return pair2;
        }
        if (TextUtils.isEmpty((CharSequence) pair2.first)) {
            return pair;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(");
        A0o.append((String) pair.first);
        A0o.append(") ");
        A0o.append(str);
        A0o.append(" (");
        A0o.append((String) pair2.first);
        String A0e = AnonymousClass000.A0e(A0o);
        Object obj = pair.second;
        int length = ((String[]) obj).length;
        String[] strArr = new String[(((String[]) pair2.second).length + length)];
        System.arraycopy(obj, 0, strArr, 0, length);
        Object obj2 = pair2.second;
        System.arraycopy(obj2, 0, strArr, ((String[]) pair.second).length, ((String[]) obj2).length);
        return AnonymousClass0x9.A0C(A0e, strArr);
    }

    public static C624034w A05(AnonymousClass36F r2, String str, String str2) {
        return r2.A0H(str, str2, -1);
    }

    public static final void A06(ContentValues contentValues, Pair pair, C85284Fq r8) {
        ((AnonymousClass3H0) r8).A03.A05(contentValues, "pay_transaction", (String) pair.first, "failPendingTransactionV2/UPDATE_PAY_TRANSACTION", (String[]) pair.second);
    }

    public long A07() {
        Cursor A012;
        long j;
        AnonymousClass4GK A032 = this.A04.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, "SELECT COUNT(*) as count FROM pay_transaction", "COUNT_TRANSACTIONS_SQL");
            if (A012.moveToNext()) {
                j = AnonymousClass0x2.A0C(A012, "count");
            } else {
                this.A09.A06("PaymentTransactionStore/countAllTransactions/version=2/db no message");
                j = 0;
            }
            A012.close();
            A032.close();
            return j;
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

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0182, code lost:
        if (r1 != null) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A08(X.C624034w r9, X.C624034w r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0045
            boolean r0 = r9.A0Q(r10)
            if (r0 != 0) goto L_0x0045
            X.7oG r4 = r8.A09
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "writeTransactionToCValues skipping transaction with: "
            X.C624034w.A00(r10, r0, r3)
            java.lang.String r0 = " as status is not updated  old ts: "
            X.C624034w.A01(r9, r0, r3)
            java.lang.String r2 = " counter: "
            r3.append(r2)
            X.1S4 r0 = r9.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.A07()
        L_0x0027:
            r3.append(r0)
            java.lang.String r0 = " new ts: "
            X.C624034w.A01(r10, r0, r3)
            r3.append(r2)
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x003a
            int r1 = r0.A07()
        L_0x003a:
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0043:
            r0 = 0
            goto L_0x0027
        L_0x0045:
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r10.A0L
            r3.put(r1, r0)
        L_0x0058:
            int r1 = r10.A03
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "type"
            X.C18270x1.A0b(r3, r0, r1)
        L_0x0062:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0071
            java.lang.String r1 = "id"
            java.lang.String r0 = r10.A0K
            r3.put(r1, r0)
        L_0x0071:
            X.39Q r0 = r10.A08
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x008d
            X.39Q r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            java.lang.Long r1 = X.C18310x6.A0g(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x008d:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x00a2:
            int r1 = r10.A02
            java.lang.String r0 = "status"
            if (r1 != 0) goto L_0x00ad
            if (r9 == 0) goto L_0x00b0
            int r1 = r9.A02
        L_0x00ad:
            X.C18270x1.A0b(r3, r0, r1)
        L_0x00b0:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x00c2:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r1 = "credential_id"
            java.lang.String r0 = r10.A0H
            r3.put(r1, r0)
        L_0x00d1:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r1 = "error_code"
            java.lang.String r0 = r10.A0J
            r3.put(r1, r0)
        L_0x00e0:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ef
            java.lang.String r1 = "bank_transaction_id"
            java.lang.String r0 = r10.A0F
            r3.put(r1, r0)
        L_0x00ef:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.String r1 = "request_key_id"
            java.lang.String r0 = r10.A0M
            r3.put(r1, r0)
        L_0x00ff:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x0185
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0185
        L_0x010c:
            java.lang.String r0 = X.AnonymousClass36S.A04(r2)
            r3.put(r1, r0)
        L_0x0113:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x0180
            X.1S4 r1 = r9.A0A
            if (r1 == 0) goto L_0x0180
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x012a
            r1.A0W(r0)
            X.1S4 r1 = r9.A0A
            int r0 = r9.A02
            r1.A0R(r0)
        L_0x012a:
            java.lang.String r0 = r1.A0N()
            r3.put(r2, r0)
        L_0x0131:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0140
            java.lang.String r1 = "country"
            java.lang.String r0 = r10.A0G
            r3.put(r1, r0)
        L_0x0140:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x0155
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x0155:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.39R r2 = r10.A05()
            if (r2 == 0) goto L_0x0173
            java.lang.String r1 = "background_id"
            java.lang.String r0 = r2.A0F
            r3.put(r1, r0)
            X.2px r0 = r8.A08
            r0.A04(r2)
        L_0x0173:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x0180:
            X.1S4 r1 = r10.A0A
            if (r1 == 0) goto L_0x0131
            goto L_0x012a
        L_0x0185:
            if (r9 == 0) goto L_0x0113
            java.util.ArrayList r2 = r9.A0N
            if (r2 == 0) goto L_0x0113
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A08(X.34w, X.34w):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d8, code lost:
        if (r0 != null) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A09(X.C624034w r9, X.C624034w r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0045
            boolean r0 = r9.A0Q(r10)
            if (r0 != 0) goto L_0x0045
            X.7oG r4 = r8.A09
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "writeTransactionToCValuesV2 skipping transaction with: "
            X.C624034w.A00(r10, r0, r3)
            java.lang.String r0 = " as status is not updated  old ts: "
            X.C624034w.A01(r9, r0, r3)
            java.lang.String r2 = " counter: "
            r3.append(r2)
            X.1S4 r0 = r9.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.A07()
        L_0x0027:
            r3.append(r0)
            java.lang.String r0 = " new ts: "
            X.C624034w.A01(r10, r0, r3)
            r3.append(r2)
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x003a
            int r1 = r0.A07()
        L_0x003a:
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0043:
            r0 = 0
            goto L_0x0027
        L_0x0045:
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()
            X.4uZ r1 = r10.A0C
            java.lang.String r6 = "remote_jid_row_id"
            r4 = -1
            if (r1 != 0) goto L_0x0058
            if (r9 == 0) goto L_0x0065
            X.4uZ r1 = r9.A0C
            if (r1 == 0) goto L_0x0065
        L_0x0058:
            X.34p r0 = r8.A03
            long r0 = r0.A05(r1)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0065
            X.C18270x1.A0c(r3, r6, r0)
        L_0x0065:
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0074
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r10.A0L
            r3.put(r1, r0)
        L_0x0074:
            int r1 = r10.A03
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "type"
            X.C18270x1.A0b(r3, r0, r1)
        L_0x007e:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r1 = "id"
            java.lang.String r0 = r10.A0K
            r3.put(r1, r0)
        L_0x008d:
            com.whatsapp.jid.UserJid r1 = r10.A0E
            if (r1 == 0) goto L_0x009d
            X.34p r0 = r8.A03
            java.lang.Long r1 = X.C623334p.A03(r0, r1)
            java.lang.String r0 = "sender_jid_row_id"
            r3.put(r0, r1)
        L_0x009d:
            com.whatsapp.jid.UserJid r1 = r10.A0D
            if (r1 == 0) goto L_0x00ad
            X.34p r0 = r8.A03
            java.lang.Long r1 = X.C623334p.A03(r0, r1)
            java.lang.String r0 = "receiver_jid_row_id"
            r3.put(r0, r1)
        L_0x00ad:
            if (r9 == 0) goto L_0x00c5
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r1 = r10.A0I
            X.4Fi r0 = X.AnonymousClass1S3.A06
            X.3H6 r0 = (X.AnonymousClass3H6) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00cc
        L_0x00c5:
            java.lang.String r1 = "currency_code"
            java.lang.String r0 = r10.A0I
            r3.put(r1, r0)
        L_0x00cc:
            X.39Q r0 = r10.A08
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00e8
            X.39Q r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            java.lang.Long r1 = X.C18310x6.A0g(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x00e8:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x00fd:
            int r1 = r10.A02
            java.lang.String r0 = "status"
            if (r1 != 0) goto L_0x0108
            if (r9 == 0) goto L_0x010b
            int r1 = r9.A02
        L_0x0108:
            X.C18270x1.A0b(r3, r0, r1)
        L_0x010b:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x011d:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x012c
            java.lang.String r1 = "credential_id"
            java.lang.String r0 = r10.A0H
            r3.put(r1, r0)
        L_0x012c:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013b
            java.lang.String r1 = "error_code"
            java.lang.String r0 = r10.A0J
            r3.put(r1, r0)
        L_0x013b:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014a
            java.lang.String r1 = "bank_transaction_id"
            java.lang.String r0 = r10.A0F
            r3.put(r1, r0)
        L_0x014a:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x015a
            java.lang.String r1 = "request_key_id"
            java.lang.String r0 = r10.A0M
            r3.put(r1, r0)
        L_0x015a:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x01db
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01db
        L_0x0167:
            java.lang.String r0 = X.AnonymousClass36S.A04(r2)
            r3.put(r1, r0)
        L_0x016e:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x01d6
            X.1S4 r1 = r9.A0A
            if (r1 == 0) goto L_0x01d6
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x017e
            r1.A0W(r0)
        L_0x017e:
            X.1S4 r0 = r9.A0A
        L_0x0180:
            java.lang.String r0 = r0.A0N()
            r3.put(r2, r0)
        L_0x0187:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0196
            java.lang.String r1 = "country"
            java.lang.String r0 = r10.A0G
            r3.put(r1, r0)
        L_0x0196:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x01ab
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x01ab:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.39R r2 = r10.A05()
            if (r2 == 0) goto L_0x01c9
            java.lang.String r1 = "background_id"
            java.lang.String r0 = r2.A0F
            r3.put(r1, r0)
            X.2px r0 = r8.A08
            r0.A04(r2)
        L_0x01c9:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x01d6:
            X.1S4 r0 = r10.A0A
            if (r0 == 0) goto L_0x0187
            goto L_0x0180
        L_0x01db:
            if (r9 == 0) goto L_0x016e
            java.util.ArrayList r2 = r9.A0N
            if (r2 == 0) goto L_0x016e
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A09(X.34w, X.34w):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f5, code lost:
        if (r2 == 602) goto L_0x02f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624034w A0E(android.database.Cursor r50) {
        /*
            r49 = this;
            r6 = r49
            X.34p r9 = r6.A03
            java.lang.String r0 = "remote_jid_row_id"
            r3 = r50
            long r0 = X.AnonymousClass0x2.A0C(r3, r0)
            com.whatsapp.jid.Jid r0 = r9.A08(r0)
            X.4uZ r27 = X.C106405Yw.A03(r0)
            java.lang.String r0 = "key_id"
            java.lang.String r26 = X.AnonymousClass0x2.A0Z(r3, r0)
            java.lang.String r0 = "id"
            java.lang.String r25 = X.AnonymousClass0x2.A0Z(r3, r0)
            java.lang.String r0 = "init_timestamp"
            int r0 = X.AnonymousClass0x2.A04(r3, r0)
            long r0 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.lang.String r2 = "timestamp"
            int r2 = r3.getColumnIndexOrThrow(r2)
            int r2 = X.C18290x4.A01(r3, r2)
            long r7 = (long) r2
            long r7 = r7 * r4
            r4 = 0
            long r13 = java.lang.Math.max(r7, r4)
            java.lang.String r2 = "status"
            int r24 = X.AnonymousClass0x2.A04(r3, r2)
            java.lang.String r2 = "sender_jid_row_id"
            long r4 = X.AnonymousClass0x2.A0C(r3, r2)
            com.whatsapp.jid.UserJid r23 = X.AnonymousClass32Y.A02(r9, r4)
            java.lang.String r2 = "receiver_jid_row_id"
            long r4 = X.AnonymousClass0x2.A0C(r3, r2)
            com.whatsapp.jid.Jid r2 = r9.A08(r4)
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A05(r2)
            java.lang.String r2 = "type"
            int r7 = X.AnonymousClass0x2.A04(r3, r2)
            java.lang.String r2 = "currency_code"
            java.lang.String r19 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "amount_1000"
            long r10 = X.AnonymousClass0x2.A0C(r3, r2)
            java.lang.String r2 = "credential_id"
            java.lang.String r35 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "error_code"
            java.lang.String r36 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "bank_transaction_id"
            java.lang.String r37 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "methods"
            java.lang.String r22 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "metadata"
            java.lang.String r21 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "request_key_id"
            java.lang.String r18 = X.AnonymousClass0x2.A0Z(r3, r2)
            java.lang.String r2 = "country"
            java.lang.String r39 = X.AnonymousClass0x2.A0Z(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r39)
            if (r2 == 0) goto L_0x00a7
            java.lang.String r39 = "IN"
        L_0x00a7:
            java.lang.String r2 = "version"
            int r42 = X.AnonymousClass0x2.A04(r3, r2)
            java.lang.String r2 = "future_data"
            byte[] r12 = X.C18280x3.A1Z(r3, r2)
            java.lang.String r2 = "service_id"
            int r15 = X.AnonymousClass0x2.A04(r3, r2)
            java.lang.String r2 = "background_id"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x01f2
            X.2px r2 = r6.A08
            X.39R r9 = r2.A01(r4)
        L_0x00cd:
            java.lang.String r2 = "purchase_initiator"
            int r44 = X.AnonymousClass0x2.A04(r3, r2)
            X.2sr r4 = r6.A01
            boolean r2 = r4.A0a(r8)
            if (r2 == 0) goto L_0x01d4
            r2 = 20
            if (r7 == r2) goto L_0x00ec
            r2 = 40
            if (r7 == r2) goto L_0x00ec
            r2 = 10
            if (r7 == r2) goto L_0x00ec
            r2 = 30
            if (r7 != r2) goto L_0x01d4
        L_0x00ec:
            r5 = 1
        L_0x00ed:
            java.lang.String r2 = "interop_id"
            java.lang.String r20 = X.AnonymousClass0x2.A0Z(r3, r2)
            X.7oG r4 = r6.A09
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "readTransactionInfoByTransId got from db: id: "
            r3.append(r2)
            r2 = r25
            r3.append(r2)
            java.lang.String r2 = " timestamp: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = " service_id: "
            r3.append(r2)
            r3.append(r15)
            java.lang.String r2 = " type: "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = " status: "
            r3.append(r2)
            r2 = r24
            r3.append(r2)
            java.lang.String r2 = " description:  peer: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = ""
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r3)
            r4.A04(r2)
            r2 = 5
            if (r7 != r2) goto L_0x0186
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 == 0) goto L_0x0186
            r30 = 5
            r32 = 0
            X.34w r3 = new X.34w
            r28 = r3
            r29 = r39
            r31 = r42
            r33 = r0
            r28.<init>(r29, r30, r31, r32, r33)
            r3.A0R = r12
            r16 = 0
        L_0x0155:
            r3.A0C(r9)
            r0 = r27
            r3.A0C = r0
            r3.A0Q = r5
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            if (r0 == 0) goto L_0x016c
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x0170
            r26 = r20
        L_0x016c:
            r0 = r26
            r3.A0L = r0
        L_0x0170:
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x017a
            r0 = r18
            r3.A0M = r0
        L_0x017a:
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x02ab
            X.4Fi r19 = r3.A03()
            r5 = 0
            goto L_0x01f5
        L_0x0186:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r10)
            r2 = -3
            java.math.BigDecimal r11 = r3.scaleByPowerOfTen(r2)
            X.32a r3 = r6.A06
            r2 = r19
            X.4Fi r2 = r3.A01(r2)
            r16 = 0
            r3 = 4
            if (r7 == r3) goto L_0x01cf
            r3 = r2
            X.3H6 r3 = (X.AnonymousClass3H6) r3
            int r3 = r3.A01
            X.39Q r10 = new X.39Q
            r10.<init>(r11, r3)
            r38 = 0
            X.34w r3 = new X.34w
            r28 = r3
            r29 = r2
            r30 = r10
            r31 = r23
            r32 = r8
            r33 = r19
            r34 = r25
            r40 = r7
            r41 = r24
            r43 = r15
            r45 = r0
            r47 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47)
            r3.A0R = r12
            r0 = 0
            r3.A0F(r0)
            r3.A07 = r2
            goto L_0x0155
        L_0x01cf:
            X.34w r3 = X.AnonymousClass36S.A00(r0)
            goto L_0x0155
        L_0x01d4:
            r2 = r23
            boolean r2 = r4.A0a(r2)
            if (r2 == 0) goto L_0x01ef
            r2 = 2
            r4 = 1
            if (r7 == r2) goto L_0x00ec
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 == r2) goto L_0x00ec
            if (r7 == r4) goto L_0x00ec
            r2 = 100
            if (r7 == r2) goto L_0x00ec
            r2 = 3
            if (r7 != r2) goto L_0x01ef
            goto L_0x00ec
        L_0x01ef:
            r5 = 0
            goto L_0x00ed
        L_0x01f2:
            r9 = 0
            goto L_0x00cd
        L_0x01f5:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02a0 }
            r0 = r22
            r11.<init>(r0)     // Catch:{ JSONException -> 0x02a0 }
            int r0 = r11.length()     // Catch:{ JSONException -> 0x02a0 }
            java.util.ArrayList r9 = X.AnonymousClass002.A0I(r0)     // Catch:{ JSONException -> 0x02a0 }
            r12 = 0
            r10 = 0
        L_0x0206:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x02a0 }
            if (r10 >= r0) goto L_0x0291
            org.json.JSONObject r13 = r11.getJSONObject(r10)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "t"
            int r15 = r13.optInt(r0, r12)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "st"
            java.lang.String r14 = r13.optString(r0, r5)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "cc"
            java.lang.String r18 = r13.optString(r0, r5)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "c"
            java.lang.String r2 = r13.optString(r0, r5)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "n"
            java.lang.String r1 = r13.optString(r0, r5)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "a"
            java.lang.String r7 = r13.optString(r0, r5)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r8 = "sd"
            r0 = 1
            int r8 = r13.optInt(r8, r0)     // Catch:{ JSONException -> 0x02a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x02a0 }
            if (r0 != 0) goto L_0x0285
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x02a0 }
            if (r0 != 0) goto L_0x0285
            r0 = r19
            X.3H6 r0 = (X.AnonymousClass3H6) r0     // Catch:{ JSONException -> 0x02a0 }
            int r0 = r0.A01     // Catch:{ JSONException -> 0x02a0 }
            X.39Q r7 = X.AnonymousClass39Q.A00(r7, r0)     // Catch:{ JSONException -> 0x02a0 }
            if (r7 == 0) goto L_0x027f
            boolean r0 = r7.A02()     // Catch:{ JSONException -> 0x02a0 }
            if (r0 == 0) goto L_0x027f
            X.7pU r0 = X.C161357pU.A00(r18)     // Catch:{ JSONException -> 0x02a0 }
            X.7yw r2 = X.C166587yw.A05(r0, r14, r2, r1, r15)     // Catch:{ JSONException -> 0x02a0 }
            boolean r0 = r2 instanceof X.C133736hr     // Catch:{ JSONException -> 0x02a0 }
            if (r0 == 0) goto L_0x0274
            r1 = r2
            X.6hr r1 = (X.C133736hr) r1     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "ci"
            int r0 = r13.optInt(r0, r12)     // Catch:{ JSONException -> 0x02a0 }
            r1.A01 = r0     // Catch:{ JSONException -> 0x02a0 }
        L_0x0274:
            X.2Nx r0 = new X.2Nx     // Catch:{ JSONException -> 0x02a0 }
            r0.<init>(r7, r2, r8)     // Catch:{ JSONException -> 0x02a0 }
            r9.add(r0)     // Catch:{ JSONException -> 0x02a0 }
            int r10 = r10 + 1
            goto L_0x0206
        L_0x027f:
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string amount"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x02a0 }
            goto L_0x02a8
        L_0x0285:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r1 = "PAY: PaymentTransaction:Source:fromJsonString could not parse string: "
            r0 = r22
            X.C18260x0.A0t(r1, r0, r2)     // Catch:{ JSONException -> 0x02a0 }
            goto L_0x02a8
        L_0x0291:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString parsed "
            X.C18260x0.A19(r0, r1, r9)     // Catch:{ JSONException -> 0x02a0 }
            java.lang.String r0 = " sources"
            X.C18260x0.A1J(r1, r0)     // Catch:{ JSONException -> 0x02a0 }
            goto L_0x02a7
        L_0x02a0:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentTransaction:Source:fromJsonString threw json exception in response: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x02a8
        L_0x02a7:
            r5 = r9
        L_0x02a8:
            r3.A0E(r5)
        L_0x02ab:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x02b4
            r0 = 1
            r3.A0P = r0
        L_0x02b4:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x031b
            X.4Eq r2 = r6.A00
            if (r2 == 0) goto L_0x031b
            int r0 = r3.A01
            if (r0 == 0) goto L_0x02d9
            X.8v4 r0 = r2.BB9(r0)
        L_0x02c6:
            if (r0 == 0) goto L_0x02ce
            X.1S4 r0 = r0.BG4()
            r3.A0A = r0
        L_0x02ce:
            X.1S4 r1 = r3.A0A
            if (r1 == 0) goto L_0x031b
            r0 = r21
            r1.A05(r0)
            monitor-enter(r3)
            goto L_0x02e2
        L_0x02d9:
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.8v4 r0 = r2.BB8(r1, r0)
            goto L_0x02c6
        L_0x02e2:
            boolean r0 = r3.A0K()     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x02f7
            int r2 = r3.A02     // Catch:{ all -> 0x02ef }
            r0 = 608(0x260, float:8.52E-43)
            if (r2 == r0) goto L_0x02f7
            goto L_0x02f2
        L_0x02ef:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x02f2:
            r1 = 602(0x25a, float:8.44E-43)
            r0 = 0
            if (r2 != r1) goto L_0x02f8
        L_0x02f7:
            r0 = 1
        L_0x02f8:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x031b
            X.1S4 r0 = r3.A0A
            long r7 = r0.A0B()
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x031b
            X.2sH r0 = r6.A02
            long r1 = r0.A0H()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x031b
            int r2 = r3.A03
            r1 = 8
            r0 = 16
            if (r2 != r1) goto L_0x0319
            r0 = 607(0x25f, float:8.5E-43)
        L_0x0319:
            r3.A02 = r0
        L_0x031b:
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0333
            X.4Eq r2 = r6.A00
            if (r2 == 0) goto L_0x034f
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r3.A0I
            X.8v4 r0 = r2.BB8(r1, r0)
            if (r0 == 0) goto L_0x034f
            int r0 = r0.BCt()
        L_0x0331:
            r3.A01 = r0
        L_0x0333:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "readTransactionFromCursor: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " countryData: "
            r1.append(r0)
            X.1S4 r0 = r3.A0A
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            r4.A07(r0)
            return r3
        L_0x034f:
            r0 = 0
            goto L_0x0331
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0E(android.database.Cursor):X.34w");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ad, code lost:
        if (r10 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        if (r2 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r8 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624034w A0H(java.lang.String r15, java.lang.String r16, long r17) {
        /*
            r14 = this;
            r1 = -1
            r3 = 0
            r10 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            r2 = r16
            if (r0 <= 0) goto L_0x004a
            java.lang.String r0 = "message_row_id=?"
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)
            X.3fH r1 = new X.3fH
            r1.<init>(r14)
            java.lang.String r0 = java.lang.Long.toString(r17)
            r1.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = " OR key_id=?"
            r3.append(r0)
            r1.add(r15)
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = " OR id=?"
            r3.append(r0)
            r1.add(r2)
        L_0x0039:
            java.lang.String r8 = r3.toString()
            java.lang.String[] r9 = X.C18300x5.A1b(r1)
            if (r8 == 0) goto L_0x00af
        L_0x0043:
            X.3dV r0 = r14.A04
            X.4GK r4 = r0.get()
            goto L_0x0067
        L_0x004a:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r1 = 1
            if (r0 != 0) goto L_0x005a
            java.lang.String[] r9 = X.AnonymousClass0x7.A1a(r15, r3)
            r9[r1] = r15
            java.lang.String r8 = "key_id=? OR interop_id=?"
            goto L_0x0043
        L_0x005a:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00af
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r3] = r16
            java.lang.String r8 = "id=?"
            goto L_0x0043
        L_0x0067:
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a3 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "pay_transaction"
            java.lang.String[] r7 = A0A     // Catch:{ all -> 0x00a3 }
            java.lang.String r13 = "getMessagePaymentInfoV2/QUERY_PAY_TRANSACTION"
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A0F(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0093
            X.34w r10 = r14.A0E(r3)     // Catch:{ 24P -> 0x0084 }
            goto L_0x0093
        L_0x0084:
            r2 = move-exception
            X.7oG r1 = r14.A09     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "getMessagePaymentInfoV2/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0097 }
            r3.close()     // Catch:{ all -> 0x00a3 }
            r4.close()
            return r10
        L_0x0093:
            r3.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00b7
        L_0x0097:
            r1 = move-exception
            if (r3 == 0) goto L_0x00a2
            r3.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00a8 }
            throw r1
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00ad:
            if (r10 != 0) goto L_0x00e1
        L_0x00af:
            X.7oG r2 = r14.A09
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, txn is null"
        L_0x00b3:
            r2.A06(r0)
            return r10
        L_0x00b7:
            r4.close()
            if (r10 == 0) goto L_0x00c0
            X.1S4 r2 = r10.A0A
            if (r2 != 0) goto L_0x00d6
        L_0x00c0:
            X.4Eq r2 = r14.A00
            if (r2 == 0) goto L_0x00ad
            if (r10 == 0) goto L_0x00af
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = r10.A0I
            X.8v4 r0 = r2.BB8(r1, r0)
            if (r0 == 0) goto L_0x00e1
            X.1S4 r2 = r0.BG4()
            if (r2 == 0) goto L_0x00e1
        L_0x00d6:
            java.lang.String r1 = r2.A0K()
            if (r1 == 0) goto L_0x00e1
            X.8EA r0 = r14.A07
            r0.A0G(r2, r1)
        L_0x00e1:
            X.7oG r2 = r14.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, and interop is "
            r1.append(r0)
            boolean r0 = r10.A0P
            java.lang.String r0 = X.C18300x5.A0m(r1, r0)
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0H(java.lang.String, java.lang.String, long):X.34w");
    }

    public final UserJid A0I() {
        AnonymousClass1RR A012 = C56972sr.A01(this.A01);
        C626936e.A06(A012);
        UserJid userJid = (UserJid) A012.A0H;
        C626936e.A06(userJid);
        return userJid;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:76:0x0156=Splitter:B:76:0x0156, B:98:0x01f8=Splitter:B:98:0x01f8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0J(X.C624134x r21, boolean r22) {
        /*
            r20 = this;
            r4 = r21
            X.34w r0 = r4.A0P
            if (r0 == 0) goto L_0x020f
            r5 = 0
            r3 = r20
            X.3dV r0 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
            X.4Fq r2 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            X.1S4 r1 = r0.A0A     // Catch:{ all -> 0x01fc }
            if (r1 == 0) goto L_0x0119
            java.lang.String r6 = r1.A0K()     // Catch:{ all -> 0x01fc }
            long r13 = r1.A0A()     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x00cd
            X.8EA r7 = r3.A07     // Catch:{ all -> 0x01fc }
            X.4Eq r0 = r7.A01     // Catch:{ all -> 0x01fc }
            X.8v4 r0 = r0.BCr()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0039
            X.1S4 r10 = r0.BG4()     // Catch:{ all -> 0x01fc }
            if (r10 == 0) goto L_0x0032
            r7.A0G(r10, r6)     // Catch:{ all -> 0x01fc }
        L_0x0032:
            X.1RD r0 = r7.A00     // Catch:{ all -> 0x01fc }
            X.4Fq r12 = r0.A0C()     // Catch:{ all -> 0x01fc }
            goto L_0x003b
        L_0x0039:
            r10 = 0
            goto L_0x0032
        L_0x003b:
            X.3Yo r11 = r12.Axl()     // Catch:{ all -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00a8 }
            r7 = 1
            r9 = 0
            if (r0 != 0) goto L_0x006a
            android.content.ContentValues r15 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "tmp_id"
            r15.put(r0, r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.A0O()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "tmp_metadata"
            r15.put(r0, r1)     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "tmp_ts"
            long r0 = X.C18290x4.A0B(r13)     // Catch:{ all -> 0x00a8 }
            X.C18270x1.A0c(r15, r8, r0)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x0094
            goto L_0x006d
        L_0x006a:
            r0 = 0
            goto L_0x0090
        L_0x006d:
            java.lang.String r0 = r10.A0K()     // Catch:{ all -> 0x00a8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0094
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a8 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x00a8 }
            java.lang.String r16 = "tmp_transactions"
            java.lang.String r17 = "tmp_id=?"
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00a8 }
            r0[r9] = r6     // Catch:{ all -> 0x00a8 }
            java.lang.String r18 = "storePaymentTransactionTmpInfo/UPDATE_SCHEMA_PAY_TRANSACTIONS_TMP"
            r19 = r0
            int r0 = r14.A05(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a8 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a8 }
        L_0x0090:
            r11.A00()     // Catch:{ all -> 0x00a8 }
            goto L_0x00a4
        L_0x0094:
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a8 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "tmp_transactions"
            java.lang.String r0 = "storePaymentTransactionTmpInfo/INSERT_SCHEMA_PAY_TRANSACTIONS_TMP"
            long r0 = r6.A08(r1, r0, r15)     // Catch:{ all -> 0x00a8 }
            goto L_0x0090
        L_0x00a4:
            r11.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00bc
        L_0x00a8:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fc }
        L_0x00bb:
            throw r1     // Catch:{ all -> 0x01fc }
        L_0x00bc:
            java.lang.StringBuilder r7 = X.C18280x3.A0f(r12)     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = "PAY: PaymentStore storePaymentTransactionTmpInfo stored: "
            r7.append(r6)     // Catch:{ all -> 0x01fc }
            r7.append(r0)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = " rows"
            X.C18260x0.A1J(r7, r0)     // Catch:{ all -> 0x01fc }
        L_0x00cd:
            X.8EA r6 = r3.A07     // Catch:{ all -> 0x01fc }
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            com.whatsapp.jid.UserJid r0 = r0.A0E     // Catch:{ all -> 0x01fc }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x01fc }
            X.6hl r7 = r6.A05(r0)     // Catch:{ all -> 0x01fc }
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            X.1S4 r0 = r0.A0A     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = r0.A0M()     // Catch:{ all -> 0x01fc }
            if (r7 == 0) goto L_0x0114
            com.whatsapp.jid.UserJid r0 = r7.A05     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0114
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r7.A09()     // Catch:{ all -> 0x01fc }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x0114
            r7.A0B(r1)     // Catch:{ all -> 0x01fc }
            r6.A0K(r7)     // Catch:{ all -> 0x01fc }
            X.7oG r6 = r3.A09     // Catch:{ all -> 0x01fc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "updated the contact for "
            r1.append(r0)     // Catch:{ all -> 0x01fc }
            com.whatsapp.jid.UserJid r0 = r7.A05     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x01fc }
            r6.A06(r0)     // Catch:{ all -> 0x01fc }
        L_0x0114:
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            r3.A0e(r0)     // Catch:{ all -> 0x01fc }
        L_0x0119:
            if (r22 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r9 = r5
            goto L_0x0126
        L_0x011e:
            X.2z0 r0 = r4.A1J     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x01fc }
            X.34w r9 = A05(r3, r0, r5)     // Catch:{ all -> 0x01fc }
        L_0x0126:
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            android.content.ContentValues r0 = r3.A08(r9, r0)     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x0132
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
            return r5
        L_0x0132:
            if (r9 == 0) goto L_0x015a
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x01fc }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x015a
            X.7oG r6 = r3.A09     // Catch:{ all -> 0x01fc }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "insertMessagePaymentInfo/found no columns to update: "
            X.C624134x.A0S(r4, r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fc }
            r6.A06(r0)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x0156
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x01fc }
        L_0x0156:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
            return r0
        L_0x015a:
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            android.content.ContentValues r14 = r3.A09(r9, r0)     // Catch:{ all -> 0x01fc }
            if (r14 == 0) goto L_0x01b0
            if (r9 == 0) goto L_0x016c
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x01fc }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0183
        L_0x016c:
            X.34p r1 = r3.A03     // Catch:{ all -> 0x01fc }
            X.2z0 r6 = r4.A1J     // Catch:{ all -> 0x01fc }
            X.4uZ r0 = r6.A00     // Catch:{ all -> 0x01fc }
            java.lang.Long r1 = X.C623334p.A03(r1, r0)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "remote_jid_row_id"
            r14.put(r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = r6.A01     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "key_id"
            r14.put(r0, r1)     // Catch:{ all -> 0x01fc }
        L_0x0183:
            X.C624134x.A0F(r14, r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r7 = "/"
            if (r9 != 0) goto L_0x01b9
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01fc }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = "insertOrUpdateMessagePaymentInfoV2/REPLACE_PAY_TRANSACTION"
            java.lang.String r0 = "pay_transaction"
            long r0 = r6.A0A(r0, r1, r14)     // Catch:{ all -> 0x01fc }
            X.7oG r9 = r3.A09     // Catch:{ all -> 0x01fc }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = "insertMessagePaymentInfoV2/"
        L_0x01a0:
            X.2z0 r6 = X.C624134x.A08(r4, r6, r8)     // Catch:{ all -> 0x01fc }
            X.4uZ r6 = r6.A00     // Catch:{ all -> 0x01fc }
            r8.append(r6)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = X.AnonymousClass000.A0Z(r7, r8, r0)     // Catch:{ all -> 0x01fc }
            r9.A06(r0)     // Catch:{ all -> 0x01fc }
        L_0x01b0:
            X.34w r0 = r4.A0P     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "UNSET"
            goto L_0x01f8
        L_0x01b9:
            long r0 = r4.A1L     // Catch:{ all -> 0x01fc }
            r12 = -1
            java.lang.String r6 = "insertMessagePaymentInfoV2/found old row and updating "
            r11 = 0
            r10 = 1
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x01e8
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x01fc }
            X.C624134x.A0X(r4, r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x01fc }
            X.2sg r13 = X.AnonymousClass3H0.A04(r0, r2, r1, r10)     // Catch:{ all -> 0x01fc }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r16 = "message_row_id=? OR id=?"
            java.lang.String r17 = "insertOrUpdateMessagePaymentInfoV2/withMessageId/UPDATE_PAY_TRANSACTION"
        L_0x01da:
            r18 = r1
            int r0 = r13.A05(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01fc }
            long r0 = (long) r0     // Catch:{ all -> 0x01fc }
            X.7oG r9 = r3.A09     // Catch:{ all -> 0x01fc }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fc }
            goto L_0x01a0
        L_0x01e8:
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x01fc }
            X.2sg r13 = X.AnonymousClass3H0.A04(r0, r2, r1, r11)     // Catch:{ all -> 0x01fc }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r16 = "id=?"
            java.lang.String r17 = "insertOrUpdateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION"
            goto L_0x01da
        L_0x01f8:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
            return r0
        L_0x01fc:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0201 }
            goto L_0x0205
        L_0x0201:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
        L_0x0205:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0206 }
        L_0x0206:
            r2 = move-exception
            X.7oG r1 = r3.A09
            java.lang.String r0 = "insertMessagePaymentInfo"
            r1.A0A(r0, r2)
            return r5
        L_0x020f:
            java.lang.String r1 = "PaymentTransactionStore"
            java.lang.String r0 = "insertMessagePaymentInfo transaction info is null"
            java.lang.String r0 = X.C160757oG.A01(r1, r0)
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0J(X.34x, boolean):java.lang.String");
    }

    public List A0Q(AnonymousClass2T7 r16) {
        Cursor A0F;
        Pair A0D = A0D(r16);
        String[] strArr = (String[]) A0D.first;
        String str = (String) A0D.second;
        try {
            AnonymousClass4GK A032 = this.A04.get();
            try {
                A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, str, strArr, (String) null, "init_timestamp DESC", (String) null, "readTransactionsWithFilters/QUERY_PAY_TRANSACTION");
                if (A0F != null) {
                    List A0O = A0O(A0F, "readTransactionsWithFilters");
                    C160757oG r2 = this.A09;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A1H("readTransactionsWithFilters returned: ", A0o, A0O);
                    r2.A07(A0o.toString());
                    A0F.close();
                    A032.close();
                    return A0O;
                }
                A032.close();
                return AnonymousClass001.A0s();
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            this.A09.A0A("PaymentTransactionStore/readTransactionsWithFilters ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final synchronized List A0S(String str, String[] strArr, int i) {
        String str2;
        Cursor A0F;
        List A0O;
        synchronized (this) {
            if (i > 0) {
                str2 = Integer.toString(i);
            } else {
                str2 = "";
            }
            try {
                AnonymousClass4GK A032 = this.A04.get();
                try {
                    A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, str, strArr, (String) null, "init_timestamp DESC", str2, "readPendingRequestsV2/QUERY_PAY_TRANSACTION");
                    A0O = A0O(A0F, "queryPaymentTransactionInfosV2");
                    C160757oG r2 = this.A09;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A1H("readPendingRequests returned: ", A0o, A0O);
                    r2.A07(A0o.toString());
                    if (A0F != null) {
                        A0F.close();
                    }
                    A032.close();
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
            } catch (IllegalStateException e) {
                this.A09.A0A("queryPaymentTransactionInfosV2/IllegalStateException ", e);
                return AnonymousClass001.A0s();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return A0O;
        throw th;
    }

    public void A0X(C624034w r5) {
        C186298v4 BB8;
        C186298v4 BB82;
        C624034w A052 = A05(this, r5.A0L, r5.A0K);
        if (A052 != null) {
            AnonymousClass1S4 r0 = A052.A0A;
            if (r0 != null || ((BB82 = this.A00.BB8(A052.A0G, A052.A0I)) != null && (r0 = BB82.BG4()) != null)) {
                synchronized (A052) {
                    AnonymousClass1S4 r1 = A052.A0A;
                    if (r1 == null) {
                        A052.A0A = r0;
                        r1 = r0;
                    }
                    r1.A04 = true;
                }
                A0d(A052);
                return;
            }
            return;
        }
        AnonymousClass1S4 r02 = r5.A0A;
        if (r02 != null || ((BB8 = this.A00.BB8(r5.A0G, r5.A0I)) != null && (r02 = BB8.BG4()) != null)) {
            synchronized (r5) {
                AnonymousClass1S4 r12 = r5.A0A;
                if (r12 == null) {
                    r5.A0A = r02;
                    r12 = r02;
                }
                r12.A04 = true;
            }
            A0d(r5);
        }
    }

    public void A0Z(C624134x r4) {
        String str;
        if (r4.A1I == 0) {
            String str2 = "UNSET";
            if (str2.equals(r4.A15)) {
                C624034w A052 = A05(this, r4.A1J.A01, (String) null);
                if (A052 == null && !AnonymousClass36S.A06(r4.A0P)) {
                    A0J(r4, false);
                }
                r4.A0P = A052;
                if (!(A052 == null || (str = A052.A0K) == null)) {
                    str2 = str;
                }
                r4.A15 = str2;
            }
        }
    }

    public void A0a(C624134x r3) {
        String str;
        if (r3.A0P != null) {
            C624034w A052 = A05(this, r3.A1J.A01, (String) null);
            if (A052 != null) {
                if (!A052.A0Q(r3.A0P)) {
                    return;
                }
                if (!TextUtils.isEmpty(A052.A0L)) {
                    str = A052.A0K;
                    if (str == null && (str = r3.A0P.A0K) == null) {
                        return;
                    }
                    r3.A15 = str;
                    return;
                }
            }
            str = r3.A0P.A0K;
            if (str == null) {
                str = "UNSET";
            }
            r3.A15 = str;
            return;
        }
        throw AnonymousClass001.A0g(C160757oG.A01("PaymentTransactionStore", "updateMessageTransactionId transaction info is null"));
    }

    public boolean A0d(C624034w r4) {
        C624034w A052 = A05(this, r4.A0L, r4.A0K);
        if (A052 == null) {
            return false;
        }
        r4.A06 = this.A02.A0H();
        return A0f(r4, A052, r4.A0L);
    }

    public boolean A0g(C624034w r11, AnonymousClass2z0 r12, int i, int i2, long j) {
        C85284Fq A042;
        AnonymousClass1S4 BG4;
        C186298v4 BB8 = this.A00.BB8(r11.A0G, r11.A0I);
        if (!(BB8 == null || (BG4 = BB8.BG4()) == null)) {
            synchronized (r11) {
                if (i > 0) {
                    if (r11.A02 != i) {
                        AnonymousClass1S4 r0 = r11.A0A;
                        if (r0 == null) {
                            r11.A0A = BG4;
                            r0 = BG4;
                        }
                        r0.A0R(i);
                    }
                }
            }
            r11.A0A(BG4, j);
            r11.A09(BG4, i2);
        }
        ContentValues A062 = AnonymousClass0x9.A06();
        A062.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(r11.A03));
        C18280x3.A0m(A062, r11.A02);
        A062.put("timestamp", Integer.valueOf((int) C18290x4.A0B(r11.A06)));
        if (!TextUtils.isEmpty(r11.A0K)) {
            A062.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11.A0K);
        }
        if (!TextUtils.isEmpty(r11.A0H)) {
            A062.put("credential_id", r11.A0H);
        }
        if (!TextUtils.isEmpty(r11.A0J)) {
            A062.put("error_code", r11.A0J);
        }
        if (!TextUtils.isEmpty(r11.A0F)) {
            A062.put("bank_transaction_id", r11.A0F);
        }
        AnonymousClass1S4 r02 = r11.A0A;
        if (r02 != null) {
            A062.put("metadata", r02.A0N());
        }
        String str = r12.A01;
        try {
            A042 = this.A04.A04();
            Pair A032 = A03(str, r11.A0K);
            boolean z = false;
            if (A032 != null) {
                if (((AnonymousClass3H0) A042).A03.A05(A062, "pay_transaction", (String) A032.first, "updateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION", (String[]) A032.second) > 0) {
                    z = true;
                }
            }
            if (r11.A0A != null && z) {
                A0e(r11);
            }
            A042.close();
            return z;
        } catch (SQLiteDatabaseCorruptException e) {
            this.A09.A0A("PaymentTransactionStore/insertMessagePaymentInfo", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r7.A0L.equals("undefined") != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0h(java.util.List r20) {
        /*
            r19 = this;
            java.lang.String r6 = " counter: "
            r12 = 0
            r5 = r19
            r4 = r20
            if (r20 == 0) goto L_0x0127
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0127
            X.3dV r0 = r5.A04
            X.4Fq r11 = r0.A04()
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x011d }
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x0113 }
            r3 = 0
        L_0x001e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0113 }
            X.34w r7 = (X.C624034w) r7     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0113 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0113 }
            X.34w r8 = r5.A0G(r0)     // Catch:{ all -> 0x0113 }
            if (r8 == 0) goto L_0x007b
            boolean r0 = r8.A0Q(r7)     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x007b
            X.7oG r2 = r5.A09     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "storeTransactions skipping store transaction with: "
            X.C624034w.A00(r7, r0, r1)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " as status is not updated  old ts: "
            X.C624034w.A01(r8, r0, r1)     // Catch:{ all -> 0x0113 }
            r1.append(r6)     // Catch:{ all -> 0x0113 }
            X.1S4 r0 = r8.A0A     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x0079
            int r0 = r0.A07()     // Catch:{ all -> 0x0113 }
        L_0x005c:
            r1.append(r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " new ts: "
            X.C624034w.A01(r7, r0, r1)     // Catch:{ all -> 0x0113 }
            r1.append(r6)     // Catch:{ all -> 0x0113 }
            X.1S4 r0 = r7.A0A     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x0077
            int r0 = r0.A07()     // Catch:{ all -> 0x0113 }
        L_0x006f:
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x0113 }
            r2.A06(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x00d6
        L_0x0077:
            r0 = 0
            goto L_0x006f
        L_0x0079:
            r0 = 0
            goto L_0x005c
        L_0x007b:
            android.content.ContentValues r14 = r5.A09(r8, r7)     // Catch:{ all -> 0x0113 }
            if (r14 == 0) goto L_0x001e
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x0113 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0113 }
            r8 = 1
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = r7.A0L     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "undefined"
            boolean r2 = r1.equals(r0)     // Catch:{ all -> 0x0113 }
            r1 = 0
            r0 = 2
            if (r2 == 0) goto L_0x0099
        L_0x0097:
            r1 = 1
            r0 = 1
        L_0x0099:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0113 }
            r2[r12] = r0     // Catch:{ all -> 0x0113 }
            java.lang.String r16 = "id=?"
            if (r1 != 0) goto L_0x00b1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r16)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " OR key_id=?"
            java.lang.String r16 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x0113 }
            r2[r8] = r0     // Catch:{ all -> 0x0113 }
        L_0x00b1:
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0113 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0113 }
            java.lang.String r15 = "pay_transaction"
            java.lang.String r17 = "storeTransactionV2/UPDATE_PAY_TRANSACTION"
            r18 = r2
            int r0 = r13.A05(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0113 }
            long r0 = (long) r0     // Catch:{ all -> 0x0113 }
            r7 = 1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00d6
            java.lang.String r0 = "storeTransactionV2/INSERT_PAY_TRANSACTION"
            long r7 = r13.A08(r15, r0, r14)     // Catch:{ all -> 0x0113 }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x00da:
            X.7oG r1 = r5.A09     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "could not update or insert transaction with empty transaction id"
            r1.A06(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x001e
        L_0x00e3:
            r10.A00()     // Catch:{ all -> 0x0113 }
            r10.close()     // Catch:{ all -> 0x011d }
            r11.close()
            int r0 = r4.size()
            X.7oG r2 = r5.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r3 != r0) goto L_0x010a
            java.lang.String r0 = "storeTransactions stored: "
        L_0x00fb:
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            r2.A06(r0)
            int r0 = r4.size()
            if (r3 != r0) goto L_0x012f
            r12 = 1
            return r12
        L_0x010a:
            java.lang.String r0 = "storeTransactions got: "
            X.AnonymousClass000.A1H(r0, r1, r4)
            java.lang.String r0 = " transactions but stored: "
            goto L_0x00fb
        L_0x0113:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011d }
        L_0x011c:
            throw r1     // Catch:{ all -> 0x011d }
        L_0x011d:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0122 }
            throw r1
        L_0x0122:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0127:
            X.7oG r1 = r5.A09
            java.lang.String r0 = "storeTransactions not storing transactions"
            r1.A06(r0)
        L_0x012f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0h(java.util.List):boolean");
    }

    public AnonymousClass36F(C56972sr r4, C56612sH r5, C623334p r6, C72303dV r7, C56082rO r8, C617332a r9, AnonymousClass8EA r10, C55192px r11) {
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A07 = r10;
        this.A05 = r8;
        this.A04 = r7;
        this.A08 = r11;
        this.A06 = r9;
    }

    public static final int A00(ContentValues contentValues, C85284Fq r7, C624034w r8) {
        String[] A1Y = AnonymousClass0x9.A1Y();
        A1Y[0] = r8.A0K;
        return ((AnonymousClass3H0) r7).A03.A05(contentValues, "pay_transaction", "id=?", "expireOldPendingRequestsV2/UPDATE_PAY_TRANSACTION", A1Y);
    }

    public static final Pair A03(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = AnonymousClass0x7.A1a(str, 0);
            strArr[1] = str2;
            str3 = "key_id=? OR id=?";
        } else {
            strArr = new String[]{str};
            str3 = "key_id=?";
        }
        return AnonymousClass0x9.A0C(str3, strArr);
    }

    public static Pair A04(int[] iArr, int[] iArr2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        int length = iArr.length;
        int length2 = iArr2.length;
        String[] strArr = new String[(length + length2)];
        for (int i = 0; i < length; i++) {
            A0o.append("status=?");
            if (i != length - 1) {
                A0o.append(" OR ");
            }
            C18280x3.A1Q(strArr, iArr[i], i);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        for (int i2 = 0; i2 < length2; i2++) {
            A0o2.append("type=?");
            if (i2 != length2 - 1) {
                A0o2.append(" OR ");
            }
            C18280x3.A1Q(strArr, iArr2[i2], length + i2);
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("((");
        A0o3.append(A0o);
        A0o3.append(") AND (");
        A0o3.append(A0o2);
        return Pair.create(strArr, AnonymousClass000.A0X("))", A0o3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A0D(X.AnonymousClass2T7 r10) {
        /*
            r9 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.38i r0 = r10.A01
            if (r0 == 0) goto L_0x00d8
            java.lang.String[] r0 = r0.A01
            java.util.Collections.addAll(r3, r0)
            X.38i r0 = r10.A01
            java.lang.String r0 = r0.A00
        L_0x0015:
            r2.add(r0)
        L_0x0018:
            com.whatsapp.jid.UserJid r1 = r9.A0I()
            X.34p r0 = r9.A03
            long r0 = r0.A05(r1)
            java.lang.String r5 = java.lang.Long.toString(r0)
            boolean r0 = r10.A06
            r6 = 1
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "(type=? OR type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r6)
            r3.add(r0)
            r0 = 10
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.add(r0)
            r0 = 100
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x0046:
            r3.add(r0)
        L_0x0049:
            java.lang.String r0 = "( receiver_jid_row_id=? OR sender_jid_row_id=? OR (service_id=? AND (type=? OR type=? OR type=? OR type=?)))"
            r2.add(r0)
            r3.add(r5)
            r3.add(r5)
            r0 = 6
            X.AnonymousClass0x7.A1I(r3, r0)
            r0 = 7
            X.AnonymousClass0x7.A1I(r3, r0)
            r0 = 8
            X.AnonymousClass0x7.A1I(r3, r0)
            r0 = 9
            X.AnonymousClass0x7.A1I(r3, r0)
            boolean r0 = r10.A02
            r4 = 0
            if (r0 == 0) goto L_0x00b5
            java.lang.String r7 = "(status IN (?, ?, ?, ?))"
        L_0x006d:
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]
            r0 = 405(0x195, float:5.68E-43)
            X.C18280x3.A1Q(r5, r0, r4)
            r0 = 106(0x6a, float:1.49E-43)
            X.C18280x3.A1Q(r5, r0, r6)
            r0 = 604(0x25c, float:8.46E-43)
            X.C18280x3.A1O(r5, r0)
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            r5[r0] = r1
            android.util.Pair r1 = android.util.Pair.create(r5, r7)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            r2.add(r0)
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "("
            r1.append(r0)
            java.lang.String r0 = " AND "
            X.C18310x6.A1G(r0, r2, r1)
            java.lang.String r1 = X.AnonymousClass000.A0e(r1)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x00b5:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0098
            java.lang.String r7 = "(status NOT IN (?, ?, ?, ?))"
            goto L_0x006d
        L_0x00bc:
            X.284 r0 = r10.A00
            if (r0 == 0) goto L_0x0049
            X.C626936e.A06(r0)
            r4 = 20
            r1 = 2
            java.lang.String r0 = "(type=? OR type=?)"
            r2.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r1)
            r3.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r4)
            goto L_0x0046
        L_0x00d8:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0018
            r0 = 18
            java.lang.String[] r4 = new java.lang.String[r0]
            r0 = 19
            X.C18270x1.A1O(r4, r0)
            r8 = 12
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r7 = 1
            r4[r7] = r0
            r5 = 17
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r6 = 2
            r4[r6] = r0
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            r4[r0] = r1
            r0 = 4
            X.C18280x3.A1Q(r4, r7, r0)
            r0 = 5
            X.C18280x3.A1Q(r4, r6, r0)
            r0 = 20
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6 = 6
            r4[r6] = r0
            r7 = 10
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r1 = 7
            r4[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r6 = 8
            r4[r6] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r1 = 9
            r4[r1] = r0
            X.C18280x3.A1Q(r4, r6, r7)
            r0 = 11
            X.C18280x3.A1Q(r4, r1, r0)
            r0 = 100
            X.C18280x3.A1Q(r4, r0, r8)
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 13
            r4[r0] = r1
            r0 = 40
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 14
            r4[r0] = r1
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 15
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 16
            r4[r0] = r1
            X.C18280x3.A1Q(r4, r0, r5)
            java.lang.String r0 = "((status!=?) AND (status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND (status=? OR status=? OR status=?))))"
            android.util.Pair r1 = android.util.Pair.create(r4, r0)
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36F.A0D(X.2T7):android.util.Pair");
    }

    public final List A0O(Cursor cursor, String str) {
        ArrayList A0o = AnonymousClass000.A0o(cursor);
        while (cursor.moveToNext()) {
            try {
                A0o.add(A0E(cursor));
            } catch (AnonymousClass24P e) {
                C160757oG r2 = this.A09;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("PaymentTransactionStore/");
                A0o2.append(str);
                r2.A0A(AnonymousClass000.A0X("/InvalidJidException- Skipped pending transaction with invalid JID", A0o2), e);
            }
        }
        return A0o;
    }

    public List A0T(List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("id IN (\"");
        C18310x6.A1G("\",\"", list, A0o);
        String A0X = AnonymousClass000.A0X("\")", A0o);
        AnonymousClass4GK A032 = this.A04.get();
        try {
            Cursor A0F = ((AnonymousClass3H0) A032).A03.A0F("pay_transaction", A0A, A0X, (String[]) null, (String) null, (String) null, "100", "readTransactionsByIds/QUERY_PAY_TRANSACTION");
            if (A0F == null) {
                return C18320x8.A0n(A032);
            }
            try {
                ArrayList A0o2 = AnonymousClass000.A0o(A0F);
                while (A0F.moveToNext()) {
                    A0o2.add(A0E(A0F));
                }
                C160757oG r2 = this.A09;
                StringBuilder A0o3 = AnonymousClass001.A0o();
                C18260x0.A19("readTransactionsByIds returned: ", A0o3, A0o2);
                r2.A06(A0o3.toString());
                A0F.close();
                A032.close();
                return A0o2;
            } catch (AnonymousClass24P e) {
                this.A09.A0A("readTransactionsByIds/InvalidJidException - Skipped transaction with invalid JID", e);
            } catch (Throwable th) {
                A0F.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0W() {
        ArrayList A0s = AnonymousClass001.A0s();
        Cursor A0A2 = A0A((Integer) null);
        while (A0A2.moveToNext()) {
            try {
                C624034w A0E = A0E(A0A2);
                A0E.A06 = this.A02.A0H();
                AnonymousClass1S4 r1 = A0E.A0A;
                if (r1 != null) {
                    r1.A03 = Boolean.TRUE;
                }
                A0s.add(A0E);
            } catch (AnonymousClass24P e) {
                this.A09.A0A("setAllPendingRequestViewed/InvalidJidException - Skipped pending transaction with invalid JID", e);
            } catch (Throwable th) {
                if (A0A2 != null) {
                    try {
                        A0A2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        A0A2.close();
        A0h(A0s);
    }

    public void A0b(String str, int i, int i2, long j, long j2) {
        C624034w A0G;
        C186298v4 BB8;
        if (!TextUtils.isEmpty(str) && i > 0 && j > 0 && j2 > 0 && i2 > 0 && (A0G = A0G(str)) != null) {
            AnonymousClass1S4 r5 = A0G.A0A;
            if (!(r5 == null && ((BB8 = this.A00.BB8(A0G.A0G, A0G.A0I)) == null || (r5 = BB8.BG4()) == null))) {
                r5.A0S(A0G.A03);
            }
            ContentValues A062 = AnonymousClass0x9.A06();
            C18270x1.A0b(A062, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
            A062.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
            C18270x1.A0b(A062, "status", i2);
            A062.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
            String[] A1Y = AnonymousClass0x9.A1Y();
            A1Y[0] = str;
            C85284Fq A042 = this.A04.A04();
            try {
                ((AnonymousClass3H0) A042).A03.A05(A062, "pay_transaction", "id=?", "updateTransactionTypeStatusTimestampsByIdV2/UPDATE_PAY_TRANSACTION", A1Y);
                A042.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public boolean A0c() {
        Cursor A0A2 = A0A(AnonymousClass001.A0f());
        try {
            boolean moveToNext = A0A2.moveToNext();
            A0A2.close();
            return moveToNext;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
