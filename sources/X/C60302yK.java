package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2yK  reason: invalid class name and case insensitive filesystem */
public class C60302yK {
    public final C106995aW A00;
    public final C64773Ex A01;
    public final C34461vC A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final C56922sm A05;
    public final C56982ss A06;
    public final C613830m A07;
    public final C46702c4 A08;
    public final C104675Rx A09;
    public final CopyOnWriteArrayList A0A = new CopyOnWriteArrayList();

    public static final boolean A00(AnonymousClass3ZS r5) {
        AnonymousClass39K r52 = r5.A00;
        if (r52.A0I == 0 && r52.A06 == 0) {
            return true;
        }
        return false;
    }

    public C60302yK(C106995aW r2, C64773Ex r3, C34461vC r4, C56612sH r5, AnonymousClass33p r6, C56922sm r7, C56982ss r8, C613830m r9, C46702c4 r10, C34441vA r11) {
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A07 = r9;
        this.A02 = r4;
        this.A08 = r10;
        this.A09 = new C104675Rx(r5, r11);
    }

    public final List A01(Set set) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (this.A01.A07(A0P) != null) {
                A0s.add(new AnonymousClass3ZS(this.A07.A03(A0P), A0P));
            }
        }
        return A0s;
    }

    public final void A02(AnonymousClass0QU r18, AtomicBoolean atomicBoolean) {
        boolean z;
        Throwable th;
        C85284Fq r8;
        Throwable th2;
        C85284Fq r82;
        int i;
        Cursor A092;
        C95814uZ r83;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        C56982ss r5 = this.A06;
        HashSet A15 = AnonymousClass0x9.A15(r5.A0F());
        C34461vC r2 = this.A02;
        Cursor A093 = r2.A09();
        try {
            if (A093.getCount() != 0) {
                HashSet A152 = AnonymousClass0x9.A15(A15);
                while (A093.moveToNext()) {
                    C95814uZ A0K2 = AnonymousClass0x2.A0K(A093, 0);
                    if (A0K2 != null) {
                        A152.remove(A0K2);
                    }
                }
                ArrayList A0J = AnonymousClass002.A0J(A152);
                C18260x0.A1A("storage-usage-manager/add-not-included-chats/", AnonymousClass001.A0o(), A0J);
                if (!A0J.isEmpty()) {
                    r2.A0T(A0J);
                }
                A093.close();
                z = true;
                A093 = r2.A09();
            } else {
                A093.close();
                z = false;
                C46702c4 r7 = this.A08;
                long A072 = r7.A00.A07(C135166kE.A00);
                C72303dV r72 = r7.A05;
                r72.A05();
                C56862sg BBw = r72.A04.BBw();
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18280x3.A1R(A1Y, 0, A072);
                A093 = BBw.A0E("SELECT message.chat_row_id AS chat_row_id, sum(file_size) AS media_sum FROM message_media message_media JOIN message_view message ON message_media.message_row_id = message._id WHERE message.message_type IN ('0','1','2','3','4','5','9','13','14') AND message.chat_row_id != ? GROUP BY message.chat_row_id ORDER BY media_sum DESC", "GET_CONTACTS_SORTED_LIST_BY_MEDIA_SIZE_SQL", A1Y);
            }
            C18260x0.A1D("storage-usage-manager/start-loading-contacts/", AnonymousClass001.A0o(), z);
            A093.getCount();
            if (A093.moveToFirst()) {
                boolean z2 = false;
                do {
                    if (r18 != null) {
                        r18.A02();
                    }
                    if (atomicBoolean.get()) {
                        Log.d("storage-usage-manager/start-loading-contacts/force-stop-loading");
                        A093.close();
                        return;
                    }
                    if (A0s.size() > 16 && !z2) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("storage-usage-manager/start-loading-contacts/16 loaded/");
                        C18260x0.A1H(A0o, elapsedRealtime2 - elapsedRealtime);
                        z2 = true;
                    }
                    int columnIndex = A093.getColumnIndex("chat_row_id");
                    if (columnIndex > -1) {
                        r83 = this.A05.A0B(A093.getLong(columnIndex));
                    } else {
                        r83 = AnonymousClass0x2.A0K(A093, AnonymousClass0x9.A01(A093));
                    }
                    if (r83 != null) {
                        if (this.A00.A01 || !r5.A0P(r83)) {
                            Iterator it = A0s.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((AnonymousClass3ZS) it.next()).A01().equals(r83)) {
                                        break;
                                    }
                                } else {
                                    Iterator it2 = A0K.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (AnonymousClass0x7.A0S(it2).equals(r83)) {
                                                break;
                                            }
                                        } else {
                                            A0K.add(r83);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ((A0s.size() < 16 && A0K.size() >= 2) || (A0s.size() >= 16 && A0K.size() >= 5)) {
                        List A012 = A01(A0K);
                        A0K.clear();
                        if (!A012.isEmpty()) {
                            A0s.addAll(A012);
                            A0s.size();
                            C40472Fy r9 = new C40472Fy(A012);
                            Iterator it3 = this.A0A.iterator();
                            while (it3.hasNext()) {
                                ((AnonymousClass4EC) it3.next()).BOk(r9);
                            }
                            for (int i2 = 0; i2 < A012.size(); i2++) {
                                r2.A0J((AnonymousClass3ZS) A012.get(i2));
                            }
                        }
                    }
                } while (A093.moveToNext());
                if (A0K.size() > 0) {
                    A0s.addAll(A01(A0K));
                }
                Collections.sort(A0s);
            }
            A093.close();
            try {
                AnonymousClass1RI r92 = r2.A00;
                C85284Fq A0C = r92.A0C();
                try {
                    C69833Yo Axl = A0C.Axl();
                    try {
                        Cursor A094 = r2.A09();
                        try {
                            HashSet A153 = AnonymousClass0x9.A15(A15);
                            while (A094.moveToNext()) {
                                C95814uZ A0K3 = AnonymousClass0x2.A0K(A094, 0);
                                if (A0K3 != null) {
                                    A153.remove(A0K3);
                                }
                            }
                            ArrayList A0J2 = AnonymousClass002.A0J(A153);
                            r2.A0T(A0J2);
                            A094.close();
                            if (A0J2.size() == 0) {
                                AnonymousClass4GK A0B = r92.get();
                                try {
                                    r8 = A0B;
                                    Cursor A095 = AnonymousClass361.A09(A0B, "SELECT COUNT(*) as count FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES");
                                    try {
                                        if (A095.moveToNext()) {
                                            i = AnonymousClass0x2.A03(A095);
                                            r8 = A0B;
                                            A095.close();
                                            A0B.close();
                                        } else {
                                            A095.close();
                                            A0B.close();
                                            i = 0;
                                        }
                                        if (i != A15.size()) {
                                            HashSet A0K4 = AnonymousClass002.A0K();
                                            HashSet A154 = AnonymousClass0x9.A15(A15);
                                            C85284Fq A0C2 = r92.A0C();
                                            r8 = A0C2;
                                            C69833Yo Axl2 = A0C2.Axl();
                                            try {
                                                A092 = AnonymousClass361.A09(A0C2, "SELECT jid FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES");
                                                int A013 = AnonymousClass0x9.A01(A092);
                                                while (A092.moveToNext()) {
                                                    C95814uZ A0K5 = AnonymousClass0x2.A0K(A092, A013);
                                                    if (A0K5 == null) {
                                                        Log.w("contact-manager-database/remove-copies-and-not-wa-contacts/jid is null or invalid!");
                                                    } else if (A154.contains(A0K5)) {
                                                        A154.remove(A0K5);
                                                    } else {
                                                        A0K4.add(A0K5);
                                                    }
                                                }
                                                A092.close();
                                                Iterator it4 = A0K4.iterator();
                                                while (it4.hasNext()) {
                                                    AnonymousClass361.A08(A0C2, "wa_contact_storage_usage", "jid = ? ", C18270x1.A1a(C18300x5.A0P(it4)));
                                                }
                                                Axl2.A00();
                                                r8 = A0C2;
                                                Axl2.close();
                                                r8 = A0C2;
                                                A0C2.close();
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                r82 = A0C2;
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        r8 = r82;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r8.close();
                                    throw th;
                                }
                            }
                            ContentValues A062 = AnonymousClass0x9.A06();
                            Iterator it5 = A0s.iterator();
                            while (it5.hasNext()) {
                                AnonymousClass3ZS r0 = (AnonymousClass3ZS) it5.next();
                                C95814uZ A014 = r0.A01();
                                AnonymousClass39K r02 = r0.A00;
                                long j = r02.A0I;
                                int i3 = r02.A06;
                                A062.clear();
                                C18270x1.A0c(A062, "conversation_size", j);
                                C18270x1.A0b(A062, "conversation_message_count", i3);
                                String[] A1Y2 = AnonymousClass0x9.A1Y();
                                C18280x3.A0w(A014, A1Y2, 0);
                                AnonymousClass361.A07(A062, A0C, "wa_contact_storage_usage", "jid = ?", A1Y2);
                            }
                            Axl.A00();
                            Axl.close();
                            A0C.close();
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    } finally {
                        Axl.close();
                    }
                } catch (Throwable th7) {
                    A0C.close();
                    throw th7;
                }
            } catch (IllegalArgumentException e) {
                C626936e.A08("contact-mgr-db/unable to update batch on storage usage table", e);
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it6 = A0s.iterator();
            while (it6.hasNext()) {
                AnonymousClass3ZS r1 = (AnonymousClass3ZS) it6.next();
                if (r1 != null && !A00(r1)) {
                    if (this.A00.A01 || !r5.A0P(r1.A01())) {
                        A0s2.add(r1);
                    }
                }
            }
            if (atomicBoolean.get()) {
                Log.d("storage-usage-manager/start-loading-contacts/force-stop-loading");
                return;
            }
            this.A09.A01("STORAGE_USAGE_CHAT_LIST_CACHE_TIME");
            C40462Fx r22 = new C40462Fx(A0s2);
            Iterator it7 = this.A0A.iterator();
            while (it7.hasNext()) {
                ((AnonymousClass4EC) it7.next()).BOj(r22);
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("storage-usage-manager/start-loading-contacts/all-loaded/");
            C18260x0.A1H(A0o2, elapsedRealtime3 - elapsedRealtime);
            return;
            throw th;
        } catch (Throwable th9) {
            th.addSuppressed(th9);
            throw th;
        }
    }
}
