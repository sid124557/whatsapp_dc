package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3bb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71123bb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass31A A03;
    public final /* synthetic */ C56542sA A04;
    public final /* synthetic */ C95814uZ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void run() {
        Set emptySet;
        AnonymousClass4GK r17;
        C624134x A012;
        Cursor A0E;
        C56542sA r7 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A07;
        C95814uZ r3 = this.A05;
        AnonymousClass31A r2 = this.A03;
        long j = this.A01;
        boolean z3 = this.A08;
        long j2 = this.A02;
        boolean z4 = this.A09;
        int i = this.A00;
        if (!z || !z2) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = C18310x6.A0Q(r7.A02).A04.A08(r3, true);
        }
        C183538qC r24 = r7.A02;
        C18310x6.A0Q(r24).A0C.A0I(r2);
        C18310x6.A0Q(r24).A04.A0O(emptySet);
        C47402dC r10 = C18310x6.A0Q(r24).A0L;
        AnonymousClass33M r9 = new AnonymousClass33M(false);
        r9.A0A("msgstore/unsentreadreceiptsforjid");
        ArrayList A0s = AnonymousClass001.A0s();
        C55882r4 r13 = r10.A09;
        if (r13.A01(r3)) {
            AnonymousClass31A A0A = r10.A03.A0A(r3, false);
            if (A0A == null) {
                C18260x0.A1S(AnonymousClass001.A0o(), "msgstore/unsentreadreceiptsforjid/no chat for ", r3);
            } else if (A0A.A0P == A0A.A0R) {
                C18260x0.A1P(AnonymousClass001.A0o(), "msgstore/unsentreadreceiptsforjid/all sent ", r3);
            } else {
                String[] A1a = AnonymousClass0x9.A1a();
                C56922sm.A02(r10.A02, r3, A1a, 0);
                C18270x1.A1R(A1a, A0A.A0Q);
                if (r13.A02(r3)) {
                    j = A0A.A0S;
                }
                AnonymousClass0x2.A1T(A1a, j);
                try {
                    AnonymousClass4GK A032 = r10.A07.get();
                    try {
                        A0E = ((AnonymousClass3H0) A032).A03.A0E(C58162uo.A0N, "UNSENT_READ_RECEIPTS_FOR_JID_SQL", A1a);
                        while (A0E.moveToNext()) {
                            C624134x A042 = r10.A0A.A04(A0E, r3);
                            if (A042 != null && A042.A0K > 1415214000000L) {
                                A0s.add(A042);
                            }
                        }
                        A0E.close();
                        A032.close();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18260x0.A19("msgstore/unsentreadreceiptsforjid ", A0o, A0s);
                        AnonymousClass33M.A05(r9, " | time spent:", A0o);
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    Log.i("msgstore/unsentreadreceiptsforjid/IllegalStateException ", e);
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    r10.A06.A04();
                } catch (SQLiteFullException e3) {
                    r10.A05.A08(0);
                    throw e3;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        if (z3) {
            C620333f r5 = C18310x6.A0Q(r24).A0M;
            HashSet A0K = AnonymousClass002.A0K();
            long A072 = r5.A07.A07(r3);
            r17 = r5.A0G.get();
            try {
                for (Byte byteValue : r5.A0Z) {
                    A0K.addAll(r5.A0C(r17, byteValue.byteValue(), A072, j2, false));
                }
                r17.close();
                r5.A04(A0K);
            } catch (Throwable th3) {
                th.addSuppressed(th3);
                throw th;
            }
        }
        if (z4) {
            C620333f r6 = C18310x6.A0Q(r24).A0M;
            HashSet A0K2 = AnonymousClass002.A0K();
            long A073 = r6.A07.A07(r3);
            r17 = r6.A0G.get();
            A0K2.addAll(r6.A0C(r17, (byte) 74, A073, j2, true));
            r17.close();
            HashSet A0K3 = AnonymousClass002.A0K();
            Iterator it = A0K2.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if ((A0T instanceof C30331mH) && (A012 = C30331mH.A01((C30331mH) A0T, r6.A0X)) != null) {
                    A0K3.add(A012);
                }
            }
            A0s.addAll(A0K3);
        }
        C18310x6.A0Q(r24).A0B.A09(r3, A0s, i);
        return;
        throw th;
    }

    public /* synthetic */ C71123bb(AnonymousClass31A r1, C56542sA r2, C95814uZ r3, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r2;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = r3;
        this.A03 = r1;
        this.A01 = j;
        this.A08 = z3;
        this.A02 = j2;
        this.A09 = z4;
        this.A00 = i;
    }
}
