package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2qe  reason: invalid class name and case insensitive filesystem */
public class C55622qe {
    public final C56612sH A00;
    public final C620733j A01;
    public final C56922sm A02;
    public final C56982ss A03;
    public final C49472ga A04;
    public final C55792qv A05;
    public final C66533Lu A06;
    public final C50012hU A07;
    public final C56562sC A08;
    public final C54762pF A09;
    public final C29431io A0A;
    public final C55272q5 A0B;
    public final C72303dV A0C;
    public final AnonymousClass3LP A0D;
    public final AnonymousClass4FV A0E;

    public long A00(C95814uZ r6) {
        Cursor A0E2;
        long j;
        AnonymousClass4GK A032 = this.A0C.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C56922sm.A01(this.A02, r6, A1Y);
            A0E2 = r3.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND starred = 1 AND (message_type != '7')", "GET_STARRED_MESSAGE_COUNT_FOR_JID_SQL", A1Y);
            if (A0E2.moveToNext()) {
                j = AnonymousClass0x2.A0C(A0E2, "count");
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/countStarredMessages/db no message for ", r6);
                j = 0;
            }
            A0E2.close();
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

    public void A01(Collection collection) {
        AnonymousClass3LP r4 = this.A0D;
        AnonymousClass4FV r3 = this.A0E;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass31G.A02(r4, r3, C18300x5.A0T(it), 1);
        }
        A02(collection, true);
    }

    public boolean A04(Collection collection) {
        boolean z;
        long j;
        Set A042 = this.A05.A04();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            C624134x A0T = C18300x5.A0T(it);
            C95814uZ r1 = A0T.A1J.A00;
            if (A042.contains(r1)) {
                long j2 = A0T.A1M;
                C56982ss r0 = this.A03;
                C626936e.A06(r1);
                AnonymousClass31A A002 = C56982ss.A00(r0, r1);
                if (A002 == null) {
                    j = Long.MIN_VALUE;
                } else {
                    j = A002.A0F;
                }
                if (j2 < j) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return false;
        }
        A02(collection, false);
        return true;
    }

    public C55622qe(C56612sH r1, C620733j r2, C56922sm r3, C56982ss r4, C49472ga r5, C55792qv r6, C66533Lu r7, C50012hU r8, C56562sC r9, C54762pF r10, C29431io r11, C55272q5 r12, C72303dV r13, AnonymousClass3LP r14, AnonymousClass4FV r15) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0E = r15;
        this.A0D = r14;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A08 = r9;
        this.A0A = r11;
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A0C = r13;
        this.A0B = r12;
    }

    public final void A02(Collection collection, boolean z) {
        boolean z2;
        C85284Fq A042;
        C626936e.A00();
        Collection collection2 = collection;
        Iterator it = collection2.iterator();
        while (true) {
            z2 = z;
            if (!it.hasNext()) {
                break;
            }
            C18300x5.A0T(it).A1F = z2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            C85284Fq A043 = this.A0C.A04();
            try {
                C69833Yo Axl = A043.Axl();
                try {
                    C56562sC r9 = this.A08;
                    HashSet A0K = AnonymousClass002.A0K();
                    C72303dV r5 = r9.A05;
                    C85284Fq A044 = r5.A04();
                    try {
                        C69833Yo Axl2 = A044.Axl();
                        try {
                            Iterator it2 = collection2.iterator();
                            while (it2.hasNext()) {
                                C624134x A0T = C18300x5.A0T(it2);
                                A042 = r5.A04();
                                ContentValues A062 = AnonymousClass0x9.A06();
                                C621833x.A03(A062, "starred", z2);
                                C56862sg r3 = ((AnonymousClass3H0) A042).A03;
                                AnonymousClass2z0 r10 = A0T.A1J;
                                if (r3.A05(A062, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STARRED_MAIN_SQL", r9.A09(r10)) == 0) {
                                    C18260x0.A1Q(AnonymousClass001.A0o(), "MainMessageStore/updateMessageStarredStatusV2/update failed; message.key=", r10);
                                    A042.close();
                                } else {
                                    A042.close();
                                    A0K.add(r10.A00);
                                }
                            }
                            Axl2.A00();
                            Axl2.close();
                            A044.close();
                            Axl.A00();
                            long A032 = this.A06.A03();
                            Iterator it3 = collection2.iterator();
                            while (it3.hasNext()) {
                                this.A09.A00(new AnonymousClass3GY(this, C18300x5.A0T(it3), A032, z2));
                            }
                            this.A07.A02.post(new C117665sI(this, collection2, 26, z2));
                            C49472ga.A00(this.A04, "StarredMessageStore/updateMessageStarredStateInternal", uptimeMillis);
                            Axl.close();
                            A043.close();
                            return;
                        } catch (Throwable th) {
                            Axl2.close();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        A044.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Axl.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                A043.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A0B.A04();
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
    }

    public boolean A03(C95814uZ r18, Long l) {
        C85284Fq A042;
        long uptimeMillis = SystemClock.uptimeMillis();
        Set A043 = this.A05.A04();
        C95814uZ r5 = r18;
        if (r18 == null) {
            if (!A043.isEmpty()) {
                return false;
            }
        } else if (A043.contains(r5)) {
            return false;
        }
        try {
            C85284Fq A044 = this.A0C.A04();
            try {
                C69833Yo Axl = A044.Axl();
                try {
                    C56562sC r7 = this.A08;
                    A042 = r7.A05.A04();
                    ContentValues A072 = AnonymousClass0x9.A07(1);
                    C18270x1.A0b(A072, "starred", 0);
                    String str = "starred = ? AND message_type != ?";
                    ArrayList A0s = AnonymousClass001.A0s();
                    A0s.add("1");
                    AnonymousClass0x7.A1I(A0s, 7);
                    if (r18 != null) {
                        str = AnonymousClass000.A0X(" AND chat_row_id = ? ", AnonymousClass000.A0l(str));
                        C18280x3.A1K(A0s, r7.A03.A07(r5));
                    }
                    Long l2 = l;
                    if (l != null) {
                        str = AnonymousClass000.A0X(" AND sort_id <= ?", AnonymousClass000.A0l(str));
                        C18320x8.A1I(l2, A0s);
                    }
                    int A052 = ((AnonymousClass3H0) A042).A03.A05(A072, "message", str, "unStarAllMessageV2/UPDATE_MESSAGE", (String[]) A0s.toArray(C58152un.A0N));
                    if (A052 != 0) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("MainMessageStore/unStarAllMessage/rowChanged=");
                        A0o.append(A052);
                        C18260x0.A1R(A0o, " jid=", r5);
                    }
                    A042.close();
                    Axl.A00();
                    this.A09.A00(new AnonymousClass3GX(r5, l2));
                    C49472ga.A00(this.A04, "StarredMessageStore/unstarAll", uptimeMillis);
                    Axl.close();
                    A044.close();
                    this.A07.A02.post(new C71343bx(this, 0, r5));
                    return true;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A044.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A0B.A04();
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }
}
