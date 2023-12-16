package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2qY  reason: invalid class name and case insensitive filesystem */
public class C55562qY {
    public final C56612sH A00;
    public final C50632iV A01;
    public final C56922sm A02;
    public final C54762pF A03;
    public final C28761hj A04;
    public final C55272q5 A05;
    public final C72303dV A06;
    public final C56382rt A07;
    public final C55832qz A08;
    public final Map A09;
    public final AtomicBoolean A0A;

    public int A00(C95814uZ r4) {
        int i = 0;
        if (r4 != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (AnonymousClass2z0.A0E(C18300x5.A0T(it), r4)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A01(Set set) {
        int i = 0;
        if (set != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (set.contains(C18300x5.A0T(it).A1J.A00)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A02() {
        long A0H = this.A00.A0H();
        if (!this.A0A.get()) {
            A03();
        }
        Map map = this.A03.A02;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            if (((C624134x) AnonymousClass0x2.A0W(A0q)).A0K + 86400000 < A0H) {
                A0q.remove();
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/unsendmessages/cached:");
        C18260x0.A1G(A0o, map.size());
        ArrayList A0z = C18290x4.A0z(map);
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            C18310x6.A1R(A0z, A0v);
        }
        AnonymousClass4IU.A00(A0z, 33);
        return A0z;
    }

    public final void A03() {
        Cursor A0E;
        long j;
        Cursor A0E2;
        AtomicBoolean atomicBoolean = this.A0A;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                ArrayList A0s = AnonymousClass001.A0s();
                AnonymousClass33M r2 = new AnonymousClass33M(false);
                r2.A0A("unsentmsgstore/unsendmessages");
                C56382rt r8 = this.A07;
                long A0H = this.A00.A0H() - 172800000;
                AnonymousClass4GK A032 = r8.A05.get();
                try {
                    C56862sg r82 = ((AnonymousClass3H0) A032).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18280x3.A1R(A1Y, 0, A0H);
                    A0E = r82.A0E("SELECT _id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP", A1Y);
                    if (A0E.moveToNext()) {
                        j = C18270x1.A01(A0E);
                    } else {
                        j = 0;
                    }
                    A0E.close();
                    A032.close();
                    try {
                        AnonymousClass4GK A033 = this.A06.get();
                        try {
                            C56862sg r9 = ((AnonymousClass3H0) A033).A03;
                            String str = C58162uo.A0M;
                            String[] strArr = new String[1];
                            AnonymousClass0x2.A1S(strArr, 0, j);
                            A0E2 = r9.A0E(str, "UNSENT_MESSAGES_SQL", strArr);
                            int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("chat_row_id");
                            while (A0E2.moveToNext()) {
                                C95814uZ A0B = this.A02.A0B((long) A0E2.getInt(columnIndexOrThrow));
                                if (A0B == null) {
                                    Log.w("unsentmsgstore/unsent/jid is null!");
                                } else {
                                    C624134x A042 = this.A08.A04(A0E2, A0B);
                                    if (A042 == null) {
                                        Log.w("unsentmsgstore/unsent/can't read message from cursor.");
                                    } else {
                                        byte b = A042.A1I;
                                        if (!(b == 8 || b == 10 || b == 7)) {
                                            int i = A042.A0D;
                                            if (i != 7 || !AnonymousClass2z0.A0D(A042)) {
                                                if (!A042.A1B || (A0B instanceof AnonymousClass1fS)) {
                                                    StringBuilder A0o = AnonymousClass001.A0o();
                                                    A0o.append(AnonymousClass2z0.A07(A042, "unsentmsgstore/unsent/add key=", A0o));
                                                    A0o.append(" type=");
                                                    A0o.append(b);
                                                    C18260x0.A0y(" status=", A0o, i);
                                                    A0s.add(A042);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            A0E2.close();
                            A033.close();
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            C18260x0.A19("unsentmsgstore/unsent ", A0o2, A0s);
                            AnonymousClass33M.A05(r2, " | time spent:", A0o2);
                            Iterator it = A0s.iterator();
                            while (it.hasNext()) {
                                C624134x A0T = C18300x5.A0T(it);
                                this.A09.put(A0T.A1J, A0T);
                            }
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                Log.e("unsent messages cache initialization failed to change the related flag");
                            }
                        } catch (Throwable th) {
                            A033.close();
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        Log.i("unsentmsgstore/unsent/IllegalStateException ", e);
                    } catch (SQLiteDatabaseCorruptException e2) {
                        Log.e((Throwable) e2);
                        this.A05.A04();
                    } catch (SQLiteFullException e3) {
                        e = e3;
                        this.A04.A08(0);
                        throw e;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } catch (Throwable th3) {
                    e = th3;
                    try {
                        A032.close();
                    } catch (Throwable th4) {
                        e.addSuppressed(th4);
                    }
                    throw e;
                }
            }
        }
        return;
        throw th;
        throw th;
    }

    public boolean A04() {
        if (!this.A0A.get()) {
            A03();
        }
        C54762pF r1 = this.A03;
        long A0H = this.A00.A0H();
        Map map = r1.A02;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            if (((C624134x) AnonymousClass0x2.A0W(A0q)).A0K + 86400000 < A0H) {
                A0q.remove();
            }
        }
        return !map.isEmpty();
    }

    public C55562qY(C56612sH r2, C50632iV r3, C56922sm r4, C54762pF r5, C28761hj r6, C55272q5 r7, C72303dV r8, C56382rt r9, C55832qz r10) {
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A09 = r5.A02;
        this.A0A = r5.A04;
    }
}
