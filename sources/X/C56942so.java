package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2so  reason: invalid class name and case insensitive filesystem */
public class C56942so {
    public Comparator A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C46292bO A03;
    public final C64773Ex A04;
    public final C56612sH A05;
    public final C56982ss A06;
    public final C48522f2 A07;
    public final C55412qJ A08;
    public final C46412ba A09;
    public final C56892sj A0A;
    public final C42282Nm A0B;
    public final C51562k1 A0C;
    public final C48592f9 A0D;
    public final C41412Kd A0E;
    public final AnonymousClass1VX A0F;
    public final C29331ie A0G;
    public final C56062rM A0H;
    public final AnonymousClass2L1 A0I;
    public final C52472lX A0J;
    public final AnonymousClass3LQ A0K;
    public final AnonymousClass1R1 A0L;
    public final C56072rN A0M;
    public final AnonymousClass4FS A0N;
    public final AtomicBoolean A0O = C18280x3.A0l();

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r3 = r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(X.C27991fJ r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x0037
            X.1VX r2 = r5.A0F
            r1 = 1864(0x748, float:2.612E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0037
            X.2ss r3 = r5.A06
            X.31A r2 = r3.A0A(r6, r4)
            if (r2 == 0) goto L_0x0037
            X.2sj r1 = r5.A0A
            boolean r0 = r1.A0D(r6)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r1.A0H(r6)
            if (r0 != 0) goto L_0x0037
            int r1 = r3.A06(r6)
            r0 = 1
            if (r1 != r0) goto L_0x0037
            monitor-enter(r2)
            boolean r0 = r2.A0k     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0037
            r4 = 1
            return r4
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56942so.A0G(X.1fJ):boolean");
    }

    public GroupJid A00(C27991fJ r5) {
        AnonymousClass2L1 r3 = this.A0I;
        C162457s7.A0J(r5, 0);
        Iterator it = r3.A01.A03(r5).iterator();
        while (it.hasNext()) {
            C52882mC A0O2 = AnonymousClass0x7.A0O(it);
            C56892sj r0 = r3.A00;
            GroupJid groupJid = A0O2.A02;
            if (r0.A0C(groupJid)) {
                return groupJid;
            }
        }
        return null;
    }

    public C27991fJ A01(C27991fJ r2) {
        C56062rM r0 = this.A0H;
        r0.A04();
        return (C27991fJ) r0.A03.get(r2);
    }

    public List A02() {
        Cursor A0E2;
        C48522f2 r1 = this.A07;
        AnonymousClass33M A012 = AnonymousClass33M.A01("CommunityChatStore/getCommunityChats");
        C56922sm r6 = r1.A00;
        AnonymousClass4GK A032 = r6.A06.get();
        try {
            A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT _id FROM chat WHERE group_type = ?", "GET_ROW_ID_BY_GROUP_TYPE_SQL", new String[]{Integer.toString(1)});
            ArrayList A0o = AnonymousClass000.A0o(A0E2);
            int A022 = AnonymousClass0x7.A02(A0E2);
            while (A0E2.moveToNext()) {
                C18260x0.A0H(A0E2, A0o, A022);
            }
            A0E2.close();
            A032.close();
            ArrayList A0y = C18290x4.A0y(A0o);
            Iterator it = A0o.iterator();
            while (it.hasNext()) {
                long A023 = C18270x1.A02(it);
                C95814uZ A0B2 = r6.A0B(A023);
                if (A0B2 == null) {
                    C18270x1.A1B("CommunityChatStore/failed to find chatJid by row id: ", AnonymousClass001.A0o(), A023);
                } else {
                    A0y.add(A0B2);
                }
            }
            A012.A07();
            return A0y;
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

    public final List A04(C27991fJ r4) {
        ArrayList A0J2 = AnonymousClass002.A0J(C161497pn.filter(this.A0H.A03(r4), new AnonymousClass3B5(this)));
        Comparator comparator = this.A00;
        if (comparator == null) {
            comparator = new AnonymousClass4IS((Object) this, 4);
            this.A00 = comparator;
        }
        Collections.sort(A0J2, comparator);
        return A0J2;
    }

    public Set A05(C27991fJ r5) {
        AnonymousClass2L1 r3 = this.A0I;
        C162457s7.A0J(r5, 0);
        return r3.A01.A02(new AnonymousClass4KD(r3, 6), r5);
    }

    public void A07(AnonymousClass31A r3) {
        long A002 = C56612sH.A00(this.A05);
        synchronized (r3) {
            r3.A0J = A002;
        }
        this.A07.A00(r3);
        C69263Wi.A08(this.A01, this, r3, 27);
    }

    public void A0A(C27991fJ r5) {
        C56062rM r3 = this.A0H;
        r3.A04();
        r3.A00.A03(r5, Collections.emptyList());
        C58612vX r0 = (C58612vX) r3.A02.remove(r5);
        if (r0 != null) {
            Iterator it = r0.A02.iterator();
            while (it.hasNext()) {
                r3.A03.remove(AnonymousClass0x7.A0O(it).A02);
            }
        }
    }

    public void A0B(C27991fJ r6, boolean z) {
        boolean z2;
        AnonymousClass31A A002 = C56982ss.A00(this.A06, r6);
        if (A002 != null) {
            C42282Nm r3 = this.A0B;
            synchronized (A002) {
                z2 = A002.A0k;
            }
            if (z2 != z) {
                synchronized (A002) {
                    A002.A0k = z;
                }
                r3.A00.A01(new C70093Zw(r3, 44, A002), 60);
            }
        }
    }

    public boolean A0C() {
        return this.A0F.A0Y(C58422vE.A01, 3023);
    }

    public boolean A0D(C95814uZ r5) {
        if (!(r5 instanceof C27991fJ)) {
            return false;
        }
        GroupJid groupJid = (GroupJid) r5;
        if (this.A0K.A00.A02(groupJid, "community_home")) {
            return false;
        }
        if ((!A0E(r5) || this.A0A.A0D(groupJid)) && !C57192tF.A00(this.A06.A06(groupJid))) {
            return false;
        }
        return true;
    }

    public boolean A0E(C95814uZ r3) {
        if (r3 instanceof C27991fJ) {
            return C18310x6.A1W(this.A06.A06((GroupJid) r3));
        }
        return false;
    }

    public boolean A0F(C27991fJ r3) {
        AnonymousClass3ZH A082 = this.A04.A08(r3);
        if (!this.A0M.A01()) {
            return false;
        }
        if (!this.A0A.A0D(r3) && ((A082 == null || !A082.A0d) && !C56952sp.A0D(this.A0F))) {
            return false;
        }
        C52472lX r1 = this.A0J;
        if (r3 == null || !r1.A00(r1.A00.A0A(r3))) {
            return true;
        }
        return false;
    }

    public boolean A0H(C27991fJ r3) {
        AnonymousClass3ZH A072 = this.A04.A07(r3);
        if (A072 == null) {
            C626936e.A0D(false, "unexpected parent group null in subgroup creation, was it deactivated?");
        } else if (A072.A0d || this.A0A.A0D(r3)) {
            return true;
        }
        return false;
    }

    public boolean A0I(C27991fJ r4, int i) {
        if (!this.A0F.A0Y(C58422vE.A01, 3738) || !A0K(r4, i)) {
            return false;
        }
        return true;
    }

    public boolean A0J(C27991fJ r4, int i) {
        if (this.A0F.A0Y(C58422vE.A01, 3738) || !A0K(r4, i)) {
            return false;
        }
        return true;
    }

    public C56942so(C69263Wi r2, C56972sr r3, C46292bO r4, C64773Ex r5, C56612sH r6, C56982ss r7, C48522f2 r8, C55412qJ r9, C46412ba r10, C56892sj r11, C42282Nm r12, C51562k1 r13, C48592f9 r14, C41412Kd r15, AnonymousClass1VX r16, C29331ie r17, C56062rM r18, AnonymousClass2L1 r19, C52472lX r20, AnonymousClass3LQ r21, AnonymousClass1R1 r22, C56072rN r23, AnonymousClass4FS r24) {
        this.A05 = r6;
        this.A0F = r16;
        this.A01 = r2;
        this.A02 = r3;
        this.A0N = r24;
        this.A06 = r7;
        this.A0H = r18;
        this.A08 = r9;
        this.A04 = r5;
        this.A0M = r23;
        this.A0K = r21;
        this.A0L = r22;
        this.A0J = r20;
        this.A07 = r8;
        this.A0G = r17;
        this.A09 = r10;
        this.A0B = r12;
        this.A0D = r14;
        this.A0A = r11;
        this.A0I = r19;
        this.A0C = r13;
        this.A0E = r15;
        this.A03 = r4;
    }

    public List A03(C27991fJ r7) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A0H.A03(r7).iterator();
        while (it.hasNext()) {
            C52882mC A0O2 = AnonymousClass0x7.A0O(it);
            if (this.A06.A03(A0O2.A02) > 0) {
                A0s.add(A0O2);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = AnonymousClass002.A0J(C161497pn.filter(A0s, new AnonymousClass3B5(this))).iterator();
        while (it2.hasNext()) {
            C52882mC A0O3 = AnonymousClass0x7.A0O(it2);
            if (this.A0A.A0C(A0O3.A02)) {
                A0s2.add(A0O3);
            }
        }
        return A0s2;
    }

    public void A06(int i) {
        SharedPreferences.Editor editor;
        String str;
        int i2;
        SharedPreferences.Editor putInt;
        SharedPreferences sharedPreferences;
        C18260x0.A0w("CommunityChatManager/incrementTabActionLoggingCount/action type = ", AnonymousClass001.A0o(), i);
        if (i != 0) {
            if (i != 1) {
                AtomicBoolean atomicBoolean = this.A0O;
                if (i == 2) {
                    atomicBoolean.set(false);
                    C48592f9 r1 = this.A0D;
                    editor = r1.A00().edit();
                    sharedPreferences = r1.A00();
                    str = "community_tab_group_navigation";
                } else if (atomicBoolean.getAndSet(false)) {
                    Log.d("CommunityChatManager/incrementTabActionLoggingCount/action type = noaction");
                    C48592f9 r7 = this.A0D;
                    putInt = r7.A00().edit().putInt("community_tab_no_action_view", Math.min(r7.A00().getInt("community_tab_no_action_view", 0), r7.A00().getInt("community_tab_daily_views", 0) + r7.A00().getInt("community_tab_views_via_context_menu", 0)) + 1);
                } else {
                    return;
                }
            } else {
                this.A0O.set(false);
                C48592f9 r12 = this.A0D;
                editor = r12.A00().edit();
                sharedPreferences = r12.A00();
                str = "community_tab_to_home_views";
            }
            i2 = sharedPreferences.getInt(str, 0);
            putInt = editor.putInt(str, i2 + 1);
        } else {
            this.A0O.set(true);
            C48592f9 r13 = this.A0D;
            editor = r13.A00().edit();
            SharedPreferences A002 = r13.A00();
            str = "community_tab_daily_views";
            i2 = C18280x3.A02(A002, str);
            putInt = editor.putInt(str, i2 + 1);
        }
        putInt.apply();
    }

    public void A08(GroupJid groupJid, int i) {
        String str;
        C69833Yo Axl;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityChatManagerincrementCommunityHomeActionLoggingCount/parentGroupJid = ");
        C18280x3.A0u(groupJid, A0o);
        C18260x0.A0w(" action type = ", A0o, i);
        C41412Kd r1 = this.A0E;
        long A052 = r1.A00.A05(groupJid);
        if (i == 0) {
            str = "home_view_count";
        } else if (i == 1) {
            str = "home_group_navigation_count";
        } else if (i != 2) {
            str = "home_group_join_count";
        } else {
            str = "home_group_discovery_count";
        }
        C85284Fq A0C2 = r1.A01.A0C();
        try {
            Axl = A0C2.Axl();
            C56862sg r7 = ((AnonymousClass3H0) A0C2).A03;
            if (!(!C626235v.A04(r7, "community_home_action_logging"))) {
                Log.e("CommunityHomeActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("UPDATE community_home_action_logging SET ");
                C18300x5.A1O(A0o2, str);
                A0o2.append(str);
                AnonymousClass0x2.A1P(A0o2, " + ?");
                A0o2.append("jid_row_id");
                C56702sQ A0G2 = r7.A0G(AnonymousClass000.A0X(" = ?", A0o2), "update_community_action");
                A0G2.A06(1, 1);
                A0G2.A06(2, A052);
                if (A0G2.A00() == 0) {
                    ContentValues A072 = AnonymousClass0x9.A07(2);
                    C18270x1.A0c(A072, "jid_row_id", A052);
                    C18270x1.A0b(A072, str, 1);
                    r7.A08("community_home_action_logging", "update_community_action", A072);
                }
                Axl.A00();
            }
            Axl.close();
            A0C2.close();
            return;
        } catch (Throwable th) {
            try {
                A0C2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A09(C27991fJ r10) {
        C18260x0.A1R(AnonymousClass001.A0o(), "CommunityChatManager/deleteParentGroup: ", r10);
        AnonymousClass3ZH A072 = this.A04.A07(r10);
        C46292bO r6 = this.A03;
        Set A073 = r6.A02.A07(r10, true);
        r6.A04.A0R(r10, true);
        r6.A01.A0O(A073);
        if (A072 != null) {
            C51562k1 r5 = this.A0C;
            synchronized (r5) {
                C85284Fq A042 = r5.A01.A04();
                try {
                    String[] strArr = new String[1];
                    AnonymousClass3H0.A04(String.valueOf(C623334p.A03(r5.A00, r10)), A042, strArr, 0).A07("parent_group_participants", "parent_group_jid_row_id = ?", "parent_group_participants_store/DELETE_ALL_PARTICIPANTS", strArr);
                    A042.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            this.A0L.A0Y(r10, A072.A0U());
            r6.A00(A072);
            A0A(r10);
            return;
        }
        return;
        throw th;
    }

    public boolean A0K(C27991fJ r3, int i) {
        boolean A002 = C57192tF.A00(i);
        if (!this.A0M.A01() || C56972sr.A04(this.A02) == null || r3 == null || !A002 || !this.A0A.A0C(r3)) {
            return false;
        }
        return true;
    }
}
