package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.33e  reason: invalid class name and case insensitive filesystem */
public class C620233e {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C623334p A02;
    public final C72303dV A03;
    public final C56082rO A04;
    public final AnonymousClass2W5 A05;
    public final AnonymousClass1VX A06;
    public final Object A07 = AnonymousClass002.A0D();
    public final Object A08 = AnonymousClass002.A0D();
    public volatile ConcurrentHashMap A09;

    public C623534r A05(UserJid userJid) {
        if (userJid == null) {
            this.A00.A0A("StatusStore/getStatusInfo for null UserJid", true, (String) null);
        }
        A0A();
        if (userJid == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A09;
        C626936e.A06(concurrentHashMap);
        return (C623534r) concurrentHashMap.get(userJid);
    }

    public int A02() {
        String A012 = this.A04.A01("status_distribution");
        if (A012 == null) {
            return 0;
        }
        return Integer.parseInt(A012);
    }

    public int A03(UserJid userJid) {
        C85284Fq A042 = this.A03.A04();
        try {
            int A072 = ((AnonymousClass3H0) A042).A03.A07("status", "jid_row_id=?", A00("deleteStatus/DELETE"), A0I(userJid));
            A0A();
            ConcurrentHashMap concurrentHashMap = this.A09;
            C626936e.A06(concurrentHashMap);
            concurrentHashMap.remove(userJid);
            A042.close();
            return A072;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public List A07() {
        String A012 = this.A04.A01("status_white_list");
        if (TextUtils.isEmpty(A012)) {
            return AnonymousClass001.A0s();
        }
        return C627336j.A0B(C95814uZ.class, C18310x6.A0t(A012));
    }

    public List A08() {
        String A012 = this.A04.A01("status_black_list");
        if (TextUtils.isEmpty(A012)) {
            return AnonymousClass001.A0s();
        }
        return C627336j.A0B(C95814uZ.class, C18310x6.A0t(A012));
    }

    public final void A0A() {
        if (this.A09 == null) {
            C85284Fq A042 = this.A03.A04();
            try {
                synchronized (this.A08) {
                    if (this.A09 == null) {
                        Cursor A0E = ((AnonymousClass3H0) A042).A03.A0E("SELECT jid_row_id, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status", "SELECT_STATUS_LIST_V2", (String[]) null);
                        try {
                            ConcurrentHashMap A1D = AnonymousClass0x9.A1D();
                            while (A0E.moveToNext()) {
                                UserJid A022 = C623334p.A02(this.A02, UserJid.class, AnonymousClass0x2.A0C(A0E, "jid_row_id"));
                                if (A022 != null) {
                                    C623534r r9 = new C623534r(this.A01, A022, AnonymousClass0x2.A04(A0E, "unseen_count"), AnonymousClass0x2.A04(A0E, "total_count"), AnonymousClass0x2.A0C(A0E, "message_table_id"), AnonymousClass0x2.A0C(A0E, "last_read_message_table_id"), AnonymousClass0x2.A0C(A0E, "last_read_receipt_sent_message_table_id"), AnonymousClass0x2.A0C(A0E, "first_unread_message_table_id"), AnonymousClass0x2.A0C(A0E, "autodownload_limit_message_table_id"), AnonymousClass0x2.A0C(A0E, "timestamp"));
                                    A1D.put(r9.A0A, r9);
                                    C18260x0.A1P(AnonymousClass001.A0o(), "statusmsgstore/status-init: ", r9);
                                }
                            }
                            A0E.close();
                            this.A09 = A1D;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
                A042.close();
                return;
            } catch (Throwable th2) {
                try {
                    A042.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A0B(ContentValues contentValues, UserJid userJid, C624134x r18, boolean z) {
        C69833Yo Axl;
        C85284Fq A042 = this.A03.A04();
        try {
            Axl = A042.Axl();
            C56862sg r9 = ((AnonymousClass3H0) A042).A03;
            UserJid userJid2 = userJid;
            ContentValues contentValues2 = contentValues;
            if (r9.A05(contentValues2, "status", "jid_row_id=?", A00("updateStatusesListForNewMessage/UPDATE"), A0I(userJid2)) == 0) {
                C18270x1.A0c(contentValues2, "jid_row_id", this.A02.A05(userJid2));
                long A082 = r9.A08("status", A00("updateStatusesListForNewMessage/INSERT"), contentValues2);
                if (z && this.A09 != null && this.A09.size() == 1) {
                    this.A04.A04("earliest_status_time", r18.A0K);
                }
                if (A082 == -1) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("statusmsgstore/addmsg/statuslist/insert/failed gid=");
                    A0o.append(userJid2);
                    C18260x0.A1K(A0o, ";");
                }
            }
            Axl.A00();
            Axl.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0C(C623534r r10, UserJid userJid) {
        C85284Fq A042 = this.A03.A04();
        try {
            ContentValues A072 = AnonymousClass0x9.A07(8);
            A01(A072, r10);
            if (((AnonymousClass3H0) A042).A03.A05(A072, "status", "jid_row_id=?", A00("updateStatus/UPDATE"), A0I(userJid)) == 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StatusStore/updateStatus/failed jid=");
                A0o.append(userJid);
                C18260x0.A1K(A0o, ";");
            }
            A0A();
            ConcurrentHashMap concurrentHashMap = this.A09;
            C626936e.A06(concurrentHashMap);
            concurrentHashMap.put(userJid, r10);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0D(UserJid userJid, int i, int i2) {
        C85284Fq A042 = this.A03.A04();
        try {
            ContentValues A092 = C18280x3.A09();
            C18270x1.A0b(A092, "unseen_count", i);
            if (AnonymousClass3H0.A01(A092, A042, "total_count", i2).A05(A092, "status", "jid_row_id=?", A00("updateStatusCount/UPDATE"), A0I(userJid)) == 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StatusStore/updateStatusCount/update count failed jid=");
                A0o.append(userJid);
                C18260x0.A1K(A0o, "; ");
            }
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0E(Collection collection, int i) {
        ArrayList A0u;
        String str;
        if (collection == null) {
            A0u = null;
        } else {
            A0u = C18300x5.A0u(collection);
            C627336j.A0H(collection, A0u);
        }
        C56082rO r3 = this.A04;
        r3.A03("status_distribution", i);
        if (A0u != null) {
            if (i == 2) {
                str = "status_black_list";
            } else if (i == 1) {
                str = "status_white_list";
            } else {
                return;
            }
            r3.A05(str, TextUtils.join(",", A0u));
        }
    }

    public boolean A0F() {
        return AnonymousClass000.A1W(this.A04.A01("status_distribution"));
    }

    public boolean A0H(C624134x r5) {
        C623534r A052;
        boolean z = r5.A1J.A02;
        if (!this.A06.A0Y(C58422vE.A02, 2039)) {
            if (z) {
                return false;
            }
            A052 = A05(r5.A0o());
        } else {
            if (z) {
                A052 = A04();
            }
            A052 = A05(r5.A0o());
        }
        if (A052 != null) {
            return A052.A0C(r5);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("statusmsgstore/isstatusunseen/no status for ");
        C18270x1.A17(r5.A0o(), A0o);
        return false;
    }

    public C620233e(C55682qk r2, C56612sH r3, C623334p r4, C72303dV r5, C56082rO r6, AnonymousClass2W5 r7, AnonymousClass1VX r8) {
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
    }

    public static final String A00(String str) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("_");
        return AnonymousClass000.A0X("status".toUpperCase(Locale.ROOT), A0l);
    }

    public static final void A01(ContentValues contentValues, C623534r r3) {
        long j;
        long j2;
        long j3;
        long j4;
        contentValues.put("message_table_id", Long.valueOf(r3.A04()));
        synchronized (r3) {
            j = r3.A06;
        }
        contentValues.put("last_read_message_table_id", Long.valueOf(j));
        synchronized (r3) {
            j2 = r3.A07;
        }
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j2));
        synchronized (r3) {
            j3 = r3.A03;
        }
        contentValues.put("first_unread_message_table_id", Long.valueOf(j3));
        synchronized (r3) {
            j4 = r3.A02;
        }
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(j4));
        C18290x4.A19(contentValues, r3.A05());
        contentValues.put("unseen_count", Integer.valueOf(r3.A03()));
        contentValues.put("total_count", Integer.valueOf(r3.A02()));
    }

    public C623534r A04() {
        A0A();
        ConcurrentHashMap concurrentHashMap = this.A09;
        C626936e.A06(concurrentHashMap);
        return (C623534r) concurrentHashMap.get(AnonymousClass1fY.A00);
    }

    public List A06() {
        A0A();
        ConcurrentHashMap concurrentHashMap = this.A09;
        C626936e.A06(concurrentHashMap);
        ArrayList A0z = C18290x4.A0z(concurrentHashMap);
        Iterator A0v = AnonymousClass001.A0v(concurrentHashMap);
        while (A0v.hasNext()) {
            C623534r r1 = (C623534r) A0v.next();
            if (!r1.A0B()) {
                A0z.add(r1.A06());
            }
        }
        return A0z;
    }

    public Map A09() {
        A0A();
        ConcurrentHashMap concurrentHashMap = this.A09;
        C626936e.A06(concurrentHashMap);
        if (concurrentHashMap.isEmpty()) {
            Log.e("StatusStore is empty");
        }
        ConcurrentHashMap concurrentHashMap2 = this.A09;
        C626936e.A06(concurrentHashMap2);
        return Collections.unmodifiableMap(concurrentHashMap2);
    }

    public boolean A0G(C624134x r11) {
        long j;
        long j2;
        C626936e.A0D(AnonymousClass2z0.A0B(r11), "isStatusExpired should be called for statuses only");
        if (r11.A0n() instanceof C135216kJ) {
            AnonymousClass33F A002 = this.A05.A00(r11);
            if (!A002.A00()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StatusStore/isStatusExpired/is new status psa/campaign id: ");
                A0o.append(A002.A04);
                A0o.append(", campaign first seen time: ");
                A0o.append(A002.A01);
                A0o.append(", campaign expiration time:");
                C18260x0.A1I(A0o, A002.A00);
                if (!A002.A01(this.A01.A0H()) || A002.A04 == null) {
                    return false;
                }
                return true;
            }
            C56082rO r1 = this.A04;
            long A003 = r1.A00("status_psa_viewed_time", 0);
            j2 = r1.A00("status_psa_exipration_time", 0);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("StatusStore/isStatusExpired/is legacy status psa/psa seen ts: ");
            A0o2.append(A003);
            C18260x0.A12(", psa expire ts: ", A0o2, j2);
            if (r11.A0K >= A003 || j2 == 0) {
                return false;
            }
            j = this.A01.A0H();
        } else {
            j2 = r11.A0K;
            j = C56612sH.A01(this.A01);
        }
        if (j2 < j) {
            return true;
        }
        return false;
    }

    public final String[] A0I(UserJid userJid) {
        long j;
        String[] A1Y = AnonymousClass0x9.A1Y();
        if (userJid != null) {
            j = this.A02.A05(userJid);
        } else {
            j = -1;
        }
        C18260x0.A1X(A1Y, j);
        return A1Y;
    }
}
