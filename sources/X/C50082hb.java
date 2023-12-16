package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2hb  reason: invalid class name and case insensitive filesystem */
public class C50082hb {
    public final C621033m A00;
    public final AnonymousClass33E A01;
    public final C44382Vv A02;
    public final C56612sH A03;
    public final C66543Lv A04;
    public final C55622qe A05;
    public final C55832qz A06;

    public void A01(AnonymousClass35N r26, C95814uZ r27, boolean z, boolean z2) {
        Throwable th;
        boolean z3;
        C30341mI r3;
        int i;
        AnonymousClass35N r13 = r26;
        long j = r13.A00;
        long max = Math.max(j, r13.A01);
        C66543Lv r6 = this.A04;
        C95814uZ r8 = r27;
        long A052 = r6.A05(r8, max);
        String[] strArr = new String[4];
        C56922sm.A01(r6.A0W, r8, strArr);
        AnonymousClass0x2.A1S(strArr, 1, A052);
        AnonymousClass0x2.A1T(strArr, C56612sH.A06(r6));
        C18280x3.A1Q(strArr, 1000, 3);
        AnonymousClass4GK A032 = r6.A18.get();
        try {
            Cursor A002 = C56862sg.A00(A032, ((AnonymousClass3H0) A032).A03, "   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id <= ? AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? ", "SELECT_INCOMING_AND_SENT_MESSAGE_KEYS_OLDER_THAN_SORT_ID_IN_CHAT_SQL", strArr);
            try {
                ArrayList A0s = AnonymousClass001.A0s();
                if (A002 != null) {
                    while (A002.moveToNext()) {
                        A0s.add(new C42752Pj(A002, r8));
                    }
                    A002.close();
                }
                Iterator it = A0s.iterator();
                long j2 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    C42752Pj r1 = (C42752Pj) it.next();
                    long j3 = r1.A00;
                    if (j3 < j2 && r1.A01 >= j) {
                        j2 = j3;
                    }
                }
                Iterator it2 = A0s.iterator();
                long j4 = -1;
                while (it2.hasNext()) {
                    C42752Pj r0 = (C42752Pj) it2.next();
                    long j5 = r0.A00;
                    if (j5 < j2 && j5 > j4 && r0.A01 < j) {
                        j4 = j5;
                    }
                }
                A002 = r6.A07(r8, j4, A052, max);
                ArrayList A0s2 = AnonymousClass001.A0s();
                if (A002 != null) {
                    while (A002.moveToNext()) {
                        A0s2.add(new C42752Pj(A002, r8));
                    }
                    A002.close();
                }
                ArrayList A0s3 = AnonymousClass001.A0s();
                ArrayList A0s4 = AnonymousClass001.A0s();
                Iterator it3 = A0s.iterator();
                while (true) {
                    z3 = z2;
                    if (!it3.hasNext()) {
                        break;
                    }
                    C42752Pj r2 = (C42752Pj) it3.next();
                    if (r2.A00 > j4 && ((!r2.A03 || z2) && r2.A01 < j)) {
                        A0s4.add(this.A06.A05(r2.A02));
                    }
                }
                A0s3.addAll(A0s4);
                ArrayList A0s5 = AnonymousClass001.A0s();
                Iterator it4 = A0s2.iterator();
                while (it4.hasNext()) {
                    C42752Pj r5 = (C42752Pj) it4.next();
                    long j6 = r5.A01;
                    if (!(j6 > max || (r3 = (C30341mI) this.A06.A05(r5.A02)) == null || (i = r3.A00) == 67)) {
                        if (!C18300x5.A1X((Set) AnonymousClass34J.A00.get(), i) || j6 < this.A03.A0H() - AnonymousClass0x7.A0B()) {
                            A0s5.add(r3);
                        }
                    }
                }
                A0s3.addAll(A0s5);
                A0s3.addAll(A00(r8, r13.A02, z3));
                A0s3.addAll(A00(r8, r13.A03, z3));
                boolean z4 = z;
                if (j4 != -1) {
                    Long valueOf = Long.valueOf(j4);
                    if (z2) {
                        this.A05.A03(r8, valueOf);
                    }
                    r6.A0T(r8, true);
                    r6.A0Q(r8, valueOf, true, z4);
                }
                if (!A0s3.isEmpty()) {
                    r6.A0k(A0s3, z4 ? 1 : 0);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }

    public C50082hb(C621033m r1, AnonymousClass33E r2, C44382Vv r3, C56612sH r4, C66543Lv r5, C55622qe r6, C55832qz r7) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
    }

    public final List A00(C95814uZ r6, Set set, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C54782pH r0 = (C54782pH) it.next();
            C624134x A012 = C55832qz.A01(r6, this.A06, r0.A03, r0.A04);
            if (A012 != null && (!A012.A1F || z)) {
                A0s.add(A012);
            }
        }
        return A0s;
    }
}
