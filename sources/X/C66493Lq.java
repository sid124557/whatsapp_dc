package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Lq  reason: invalid class name and case insensitive filesystem */
public class C66493Lq implements AnonymousClass485 {
    public static Handler A1H;
    public long A00 = 0;
    public C84424Ch A01;
    public Integer A02;
    public Integer A03;
    public final C55682qk A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final AnonymousClass36E A07;
    public final C46292bO A08;
    public final C44272Vj A09;
    public final C56942so A0A;
    public final C51352jg A0B;
    public final MemberSuggestedGroupsManager A0C;
    public final AnonymousClass3DJ A0D;
    public final C29441ip A0E;
    public final C64773Ex A0F;
    public final C44782Xl A0G;
    public final AnonymousClass5ZU A0H;
    public final C56332ro A0I;
    public final C64223Cq A0J;
    public final C64213Cp A0K;
    public final AnonymousClass314 A0L;
    public final C56612sH A0M;
    public final C54292oU A0N;
    public final AnonymousClass33p A0O;
    public final C621133n A0P;
    public final C48972fm A0Q;
    public final C52852m9 A0R;
    public final C56982ss A0S;
    public final C28891hw A0T;
    public final C66543Lv A0U;
    public final C55412qJ A0V;
    public final C46672c1 A0W;
    public final C54442oj A0X;
    public final AnonymousClass3DL A0Y;
    public final C54302oV A0Z;
    public final C46412ba A0a;
    public final C56892sj A0b;
    public final AnonymousClass2S7 A0c;
    public final C56152rV A0d;
    public final C72303dV A0e;
    public final C46682c2 A0f;
    public final C52372lN A0g;
    public final C55422qK A0h;
    public final AnonymousClass318 A0i;
    public final AnonymousClass1VX A0j;
    public final C67363Oz A0k;
    public final AnonymousClass2OF A0l;
    public final C41632Kz A0m;
    public final C28781hl A0n;
    public final C50932j0 A0o;
    public final C49882hF A0p;
    public final C29071iE A0q;
    public final C54932pW A0r;
    public final C29241iV A0s;
    public final C66503Lr A0t;
    public final C29331ie A0u;
    public final AnonymousClass2UY A0v;
    public final C52472lX A0w;
    public final AnonymousClass2YH A0x;
    public final C621233o A0y;
    public final AnonymousClass31C A0z;
    public final AnonymousClass33Y A10;
    public final AnonymousClass33S A11;
    public final C1907099n A12;
    public final C53022mQ A13;
    public final C56452s0 A14;
    public final C30191m3 A15;
    public final AnonymousClass35J A16;
    public final C56832sd A17;
    public final C48252eb A18;
    public final C56572sD A19;
    public final C45602aH A1A;
    public final C56072rN A1B;
    public final AnonymousClass4FS A1C;
    public final C183538qC A1D;
    public final C183538qC A1E;
    public final Map A1F = AnonymousClass0x9.A1D();
    public final Set A1G = Collections.newSetFromMap(AnonymousClass0x9.A1D());

    public final C60842zG A04(C620833k r8, UserJid userJid, int i) {
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return null;
        }
        C620833k r1 = r8;
        C60842zG A052 = r8.A05(userJid);
        int i2 = i;
        if (A052 == null) {
            return r1.A07(userJid2, this.A0i.A0D(userJid), i2, false, true);
        }
        A052.A01 = i;
        return A052;
    }

    public synchronized void A0A(int i) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        this.A0l.A01 = false;
        this.A02 = null;
        A0B(i);
    }

    public final synchronized void A0B(int i) {
        Integer valueOf;
        int intValue;
        Integer num = this.A03;
        if (num != null) {
            valueOf = Integer.valueOf(i | num.intValue());
            this.A03 = valueOf;
        } else {
            valueOf = Integer.valueOf(i);
            this.A03 = valueOf;
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            intValue = num2.intValue() | valueOf.intValue();
        } else {
            intValue = valueOf.intValue();
        }
        this.A0O.A16(intValue);
    }

    public synchronized void A0C(int i, boolean z) {
        A0a((AnonymousClass4EZ) null, i, z);
    }

    public void A0O(C28011fL r9, Long l, List list) {
        this.A0R.A01(new C70513ac(this, r9, list, l, 3), 46);
    }

    public final void A0T(C27991fJ r11, C27991fJ r12, String str, int i, long j) {
        String str2 = str;
        int i2 = i;
        if (i == 2 || i == 0 || i == 3 || i == 6) {
            C27991fJ r5 = r12;
            if (!C57192tF.A00(i) || r11 == null) {
                this.A0A.A0H.A06(r12);
                return;
            }
            C56942so r3 = this.A0A;
            if (str == null) {
                str2 = "";
            }
            Iterator it = Collections.singletonList(new C52882mC(r5, str2, i2, j)).iterator();
            while (it.hasNext()) {
                r3.A0H.A05(AnonymousClass0x7.A0O(it), r11);
            }
        }
    }

    public final synchronized void A0Z(AnonymousClass4EZ r10) {
        synchronized (this) {
            C626936e.A06(this.A03);
            if (this.A03.intValue() == 3) {
                this.A00 = C56612sH.A07(this);
            }
            int intValue = this.A03.intValue();
            C18260x0.A0y("groupmgr/sendGetGroups/ ", AnonymousClass001.A0o(), intValue);
            this.A02 = Integer.valueOf(intValue);
            AnonymousClass1VX r4 = this.A0j;
            AnonymousClass3TP r2 = new AnonymousClass3TP(this.A04, r4, this, (C49052fu) this.A1D.get(), this.A0z, intValue);
            if (r10 == null) {
                r2.A00(r2);
            } else {
                r2.A00(new AnonymousClass4KT(r10, 15, r2));
            }
            this.A03 = null;
        }
    }

    public final synchronized void A0a(AnonymousClass4EZ r6, int i, boolean z) {
        if (z) {
            if (this.A00 != 0 && C56612sH.A07(this) - this.A00 < 120000) {
                C18260x0.A0y("groupmgr/sendGetGroups/skip backoff param=", AnonymousClass001.A0o(), i);
            }
        }
        if (i == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            this.A0l.A01 = true;
        }
        Integer num = this.A02;
        if (num == null) {
            A0B(i);
            A0Z(r6);
        } else if ((num.intValue() & i) == i) {
            C18260x0.A0y("groupmgr/sendGetGroups/skip inFlight param=", AnonymousClass001.A0o(), i);
        } else {
            A0B(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a8, code lost:
        if ((r9 & 1) != 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d(java.util.Set r8, int r9) {
        /*
            r7 = this;
            r6 = r7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/onGroupSyncSucceeded/"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " "
            X.C18260x0.A1R(r1, r0, r8)
            X.2sr r0 = r7.A06
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A05(r0)
            X.1fH r5 = r0.A0H()
            X.314 r0 = r7.A0L
            java.util.List r0 = r0.A05()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            X.4uZ r1 = X.C18300x5.A0P(r2)
            boolean r0 = r1 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x002a
            X.1fJ r1 = (X.C27991fJ) r1
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x002a
            X.2sj r0 = r7.A0b
            X.33k r0 = X.C56892sj.A01(r0, r1)
            r0.A06(r4)
            if (r5 == 0) goto L_0x004e
            r0.A06(r5)
        L_0x004e:
            r3.add(r1)
            X.33o r0 = r7.A0y
            r0.A0T(r1)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r7.A0K(r1, r0)
            goto L_0x002a
        L_0x005e:
            X.2m9 r2 = r7.A0R
            r0 = 31
            X.3aL r1 = new X.3aL
            r1.<init>(r7, r3, r4, r0)
            r0 = 47
            r2.A01(r1, r0)
            r3 = 0
            r4 = 3
            if (r9 != r4) goto L_0x00a6
            X.2OF r0 = r7.A0l
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A00
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x0083
            X.33S r2 = r7.A11
            java.lang.String r1 = "groups"
            r0 = 0
            r2.A03(r1, r0)
        L_0x0083:
            X.3DL r0 = r7.A0Y
            r0.A00(r8)
            X.3DJ r0 = r7.A0D
            r0.A00(r8)
            X.2c2 r2 = r7.A0f
            X.C162457s7.A0J(r8, r3)
            java.util.Iterator r1 = r8.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.next()
            X.1fJ r0 = (X.C27991fJ) r0
            r2.A00(r0)
            goto L_0x0096
        L_0x00a6:
            r0 = r9 & 1
            if (r0 == 0) goto L_0x00b2
            goto L_0x0083
        L_0x00ab:
            X.3Wi r1 = r7.A05
            r0 = 25
            X.C69263Wi.A04(r1, r7, r8, r0)
        L_0x00b2:
            monitor-enter(r6)
            if (r9 != r4) goto L_0x00b9
            X.2OF r0 = r7.A0l     // Catch:{ all -> 0x00f4 }
            r0.A01 = r3     // Catch:{ all -> 0x00f4 }
        L_0x00b9:
            X.33p r3 = r7.A0O     // Catch:{ all -> 0x00f2 }
            java.lang.Integer r0 = r3.A0W()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00e4
            java.lang.Integer r2 = r7.A03     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00d4
            int r0 = r0.intValue()     // Catch:{ all -> 0x00f2 }
            int r1 = ~r9     // Catch:{ all -> 0x00f2 }
            r1 = r1 & r0
            int r0 = r2.intValue()     // Catch:{ all -> 0x00f2 }
            r1 = r1 | r0
            r3.A16(r1)     // Catch:{ all -> 0x00f2 }
            goto L_0x00e4
        L_0x00d4:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "need_to_get_groups"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "get_groups_params"
            X.C18270x1.A0g(r1, r0)     // Catch:{ all -> 0x00f2 }
        L_0x00e4:
            java.lang.Integer r1 = r7.A03     // Catch:{ all -> 0x00f4 }
            r0 = 0
            if (r1 != 0) goto L_0x00ed
            r7.A02 = r0     // Catch:{ all -> 0x00f4 }
        L_0x00eb:
            monitor-exit(r6)     // Catch:{ all -> 0x00f4 }
            goto L_0x00f1
        L_0x00ed:
            r7.A0Z(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00eb
        L_0x00f1:
            return
        L_0x00f2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66493Lq.A0d(java.util.Set, int):void");
    }

    public boolean A0g(GroupJid groupJid) {
        return groupJid != null && this.A0b.A0D(groupJid) && !this.A0S.A0N(groupJid);
    }

    public boolean A0h(GroupJid groupJid) {
        AnonymousClass3ZH A092;
        if (groupJid == null || !this.A0b.A0D(groupJid) || this.A0S.A0N(groupJid) || (A092 = this.A0F.A09(groupJid)) == null) {
            return false;
        }
        AnonymousClass1VX r2 = this.A18.A00;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 3695) || A092.A0e) {
            return false;
        }
        if (A092.A0q || r2.A0Y(r1, 3696)) {
            return true;
        }
        return false;
    }

    public static UserJid A00(C624134x r3) {
        AnonymousClass2z0 r2 = r3.A1J;
        C95814uZ r1 = r2.A00;
        if (C627336j.A0K(r1)) {
            if (r2.A02 && (r3 instanceof C30341mI)) {
                C30341mI r22 = (C30341mI) r3;
                int i = r22.A00;
                if (i == 10) {
                    return ((C31341o8) r22).A00;
                }
                if (i == 20 || i == 52 || i == 79 || i == 123 || i == 125 || i == 126) {
                    return (UserJid) C18290x4.A0k(((C31891p1) r22).A01);
                }
            }
            r1 = r3.A0n();
        }
        return AnonymousClass32Y.A03(r1);
    }

    public int A02(AnonymousClass3ZH r4) {
        int A062 = this.A0S.A06((GroupJid) AnonymousClass3ZH.A04(r4));
        if (!r4.A0U()) {
            return 0;
        }
        if (A062 == 3 || A062 == 1) {
            return r4.A03;
        }
        return 0;
    }

    public int A03(GroupJid groupJid) {
        AnonymousClass3ZH A092 = this.A0F.A09(groupJid);
        if (A092 == null || !A092.A13) {
            return 1;
        }
        return 4;
    }

    public C28001fK A05() {
        C56972sr r5 = this.A06;
        AnonymousClass2UZ r4 = C28001fK.A01;
        C162457s7.A0J(r5, 0);
        String A0Y2 = C18280x3.A0Y();
        C162457s7.A0D(A0Y2);
        return r4.A00(r5, C175738Zn.A0U(A0Y2, "-", "", false));
    }

    public final C27991fJ A06(C27991fJ r2) {
        C52882mC A002 = this.A0A.A0H.A00(r2);
        if (A002 == null) {
            return null;
        }
        return AnonymousClass34R.A01(A002.A02);
    }

    public List A07() {
        C27991fJ A012;
        ArrayList A0C2 = this.A0F.A05.A0C();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0C2.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
            C27991fJ A013 = AnonymousClass34R.A01(A0R2.A0H);
            if (A013 != null && this.A0b.A0D(A013)) {
                int A062 = this.A0S.A06(A013);
                if (A062 == 2) {
                    A012 = this.A0A.A01(A013);
                } else if (A062 == 0) {
                    A012 = null;
                }
                if (A0R2.A0X(this.A04, new C41822Ls(A012, A062))) {
                    A0s2.add(A0R2);
                } else {
                    this.A0t.A0E(A013, "subgroup_conflict_recovery", 3);
                }
            }
        }
        return A0s2;
    }

    public final List A08(GroupJid groupJid, List list) {
        if (groupJid == null || !this.A0r.A02(groupJid)) {
            return list;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid A0S2 = AnonymousClass0x7.A0S(it);
            if (!C627336j.A0L(A0S2)) {
                A0s2.add(A0S2);
            }
        }
        return A0s2;
    }

    public final void A0E(C620833k r7, Collection collection, int i, boolean z) {
        GroupJid A002 = AnonymousClass32V.A00(r7.A05);
        if (z) {
            int size = r7.A04().size();
            AnonymousClass1VX r2 = this.A0j;
            C58422vE r1 = C58422vE.A02;
            if (size >= r2.A0O(r1, 934) && size <= r2.A0O(r1, 1946) && A002 != null) {
                C30501mY r4 = new C30501mY(AnonymousClass35J.A01(A002, this.A16), C56612sH.A07(this));
                C64213Cp r12 = this.A0K;
                UserJid[] userJidArr = (UserJid[]) collection.toArray(new UserJid[0]);
                if (userJidArr.length == 0) {
                    C624134x.A0Q(r4, "SyncDevicesAndSendInvisibleMessageJob/empty recipients for ", AnonymousClass001.A0o());
                    return;
                }
                C49422gV r0 = r12.A02;
                AnonymousClass2z0 r22 = r4.A1J;
                if (r0.A01(r22)) {
                    r12.A00.A02(new SyncDevicesAndSendInvisibleMessageJob(r4, userJidArr));
                    return;
                } else {
                    C18260x0.A1P(AnonymousClass001.A0o(), "SyncDevicesAndSendInvisibleMessageJob/duplicate job request for ", r22);
                    return;
                }
            }
        }
        this.A0K.A01((UserJid[]) collection.toArray(new UserJid[0]), i);
    }

    public final void A0G(C52882mC r16, C52882mC r17, UserJid userJid, long j, boolean z, boolean z2) {
        C52882mC r6 = r16;
        if (r6.A00 == 1) {
            C27991fJ r4 = (C27991fJ) r6.A02;
            C55682qk r3 = this.A04;
            AnonymousClass4FS r2 = this.A1C;
            AnonymousClass31C r7 = this.A0z;
            C56942so r0 = this.A0A;
            String A032 = r7.A03();
            r7.A0D(new C68343Su(r3, this, r4, r2), C385228a.A00(r0.A00(r4), r4, A032), A032, 297, 32000);
        }
        A0H(r6, r17, userJid, (AnonymousClass39T) null, (Integer) null, j, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.1p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.1oV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.1p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.1p0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.C52882mC r26, X.C52882mC r27, com.whatsapp.jid.UserJid r28, X.AnonymousClass39T r29, java.lang.Integer r30, long r31, boolean r33, boolean r34) {
        /*
            r25 = this;
            r3 = r26
            int r10 = r3.A00
            r9 = 0
            r0 = r27
            if (r27 == 0) goto L_0x01ed
            com.whatsapp.jid.GroupJid r8 = r0.A02
            java.lang.String r9 = r0.A03
        L_0x000d:
            r0 = 1
            if (r10 != r0) goto L_0x0012
            java.lang.String r9 = r3.A03
        L_0x0012:
            java.lang.String r0 = "GroupChatManager/updateLinkGroupInfoIfNeeded()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 2
            r0 = 1
            r7 = r25
            r13 = r29
            if (r10 == r1) goto L_0x0027
            if (r10 == r0) goto L_0x0027
            r0 = 3
            if (r10 == r0) goto L_0x0027
            r0 = 6
            if (r10 != r0) goto L_0x0093
        L_0x0027:
            com.whatsapp.jid.GroupJid r6 = r3.A02
            boolean r0 = r6 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0093
            X.1fJ r5 = X.AnonymousClass34R.A01(r8)
            if (r5 == 0) goto L_0x0041
            X.2so r2 = r7.A0A
            java.lang.String r0 = "CommunityChatManageronSubgroupLinked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r2.A0N
            r0 = 25
            X.C70323aJ.A00(r1, r2, r3, r5, r0)
        L_0x0041:
            X.2rN r0 = r7.A1B
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/ab prop is off"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2jg r3 = r7.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunitySharedPrefs/setTempGroupType()/groupType = "
            X.C18260x0.A0y(r0, r1, r10)
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "create_"
            java.lang.String r0 = X.C18260x0.A03(r6, r2, r0)
            X.C18270x1.A0h(r1, r0, r10)
            X.2qJ r0 = r7.A0V
            boolean r0 = r0.A04(r6, r10)
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/successfully add group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "CommunitySharedPrefs/clearTempGroupType"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C18260x0.A03(r6, r2, r0)
            X.C18270x1.A0g(r1, r0)
        L_0x0093:
            if (r29 == 0) goto L_0x009a
            X.33S r0 = r7.A11
            r0.A01(r13)
        L_0x009a:
            return
        L_0x009b:
            r0 = 6
            r11 = r28
            if (r10 != r0) goto L_0x01e9
            X.1VX r2 = r7.A0j
            r1 = 5021(0x139d, float:7.036E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x009a
            X.2sr r0 = r7.A06
            boolean r0 = r0.A0a(r11)
        L_0x00b2:
            if (r0 == 0) goto L_0x009a
            r15 = 3010(0xbc2, float:4.218E-42)
            r16 = r33
            if (r33 == 0) goto L_0x00bc
            r15 = 3012(0xbc4, float:4.221E-42)
        L_0x00bc:
            r12 = 1
            r14 = 0
            r24 = r30
            r2 = r31
            if (r10 != r12) goto L_0x016e
            X.2sd r1 = r7.A17
            X.2z0 r0 = X.C56832sd.A01(r6, r1, r12)
            X.1oc r4 = new X.1oc
            r4.<init>(r0, r2)
            if (r6 == 0) goto L_0x00d4
            X.C30341mI.A00(r6, r4, r9)
        L_0x00d4:
            boolean r0 = r4 instanceof X.C31651od
            if (r0 != 0) goto L_0x016b
            boolean r0 = r4 instanceof X.C31641oc
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r4 instanceof X.C31661oe
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r4 instanceof X.C31631ob
            if (r0 == 0) goto L_0x016b
        L_0x00e4:
            r0 = 1
        L_0x00e5:
            r1.A0A(r11, r4, r0)
        L_0x00e8:
            java.lang.String r5 = "groupmgr/Failed to create community message"
            if (r4 != 0) goto L_0x00f4
            X.2qk r1 = r7.A04
            java.lang.String r0 = ""
            r1.A0A(r5, r14, r0)
            r12 = 0
        L_0x00f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "creator="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; timestampMs="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; oldGroupType="
            r1.append(r0)
            r0 = r24
            r1.append(r0)
            java.lang.String r0 = "; newGroupType="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; isJoinFromCommunity="
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = "; originatingStanzaKey="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "; subGroupJid="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; parentGroupJid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; parentSubject="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r9, r1)
            X.C626936e.A0D(r12, r0)
            if (r4 != 0) goto L_0x0165
            X.2sd r5 = r7.A17
            X.2z0 r1 = X.C56832sd.A00(r6, r5)
            r0 = 75
            X.1oV r4 = new X.1oV
            r4.<init>(r1, r0, r2)
            r4.A04 = r13
            r0 = r24
            r4.A02 = r0
            r4.A00 = r10
            r4.A01 = r8
            boolean r0 = X.AnonymousClass000.A1X(r24)
            r5.A0A(r11, r4, r0)
        L_0x0165:
            X.3Oz r0 = r7.A0k
            r0.BEz(r4, r15)
            return
        L_0x016b:
            r0 = 0
            goto L_0x00e5
        L_0x016e:
            if (r8 == 0) goto L_0x0184
            if (r6 == 0) goto L_0x0184
            boolean r4 = X.AnonymousClass000.A1X(r24)
            r0 = 2
            if (r10 == r0) goto L_0x0197
            r0 = 3
            if (r10 == r0) goto L_0x0187
            r0 = 6
            if (r10 == r0) goto L_0x0197
            java.lang.String r0 = "groupmgr/unlink action in link creation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0184:
            r4 = 0
            goto L_0x00e8
        L_0x0187:
            X.2sd r1 = r7.A17
            X.2z0 r0 = X.C56832sd.A01(r6, r1, r12)
            X.1ob r4 = new X.1ob
            r4.<init>(r0, r2)
            X.C30341mI.A00(r8, r4, r9)
            goto L_0x00d4
        L_0x0197:
            X.2sd r1 = r7.A17
            if (r4 == 0) goto L_0x01d4
            if (r33 == 0) goto L_0x01c5
            java.util.ArrayList r20 = X.AnonymousClass002.A0I(r14)
            r22 = 0
            X.2z0 r0 = X.C56832sd.A01(r6, r1, r12)
            X.1oB r4 = new X.1oB
            r4.<init>(r0, r2)
            if (r5 == 0) goto L_0x01b1
            X.C30341mI.A00(r5, r4, r9)
        L_0x01b1:
            r4.A00 = r10
            int r0 = r4.A00
            r17 = r1
            r18 = r11
            r19 = r4
            r21 = r0
            r17.A09(r18, r19, r20, r21, r22)
        L_0x01c0:
            r1.A0A(r11, r4, r12)
            goto L_0x00e8
        L_0x01c5:
            X.2z0 r0 = X.C56832sd.A01(r6, r1, r12)
            X.1oe r4 = new X.1oe
            r4.<init>(r0, r2)
            X.C30341mI.A00(r8, r4, r9)
            r4.A00 = r10
            goto L_0x01c0
        L_0x01d4:
            X.2z0 r0 = X.C56832sd.A01(r6, r1, r12)
            X.1oA r4 = new X.1oA
            r4.<init>(r0, r2)
            r4.A04 = r13
            if (r5 == 0) goto L_0x01e4
            X.C30341mI.A00(r5, r4, r9)
        L_0x01e4:
            r1.A0A(r11, r4, r14)
            goto L_0x00e8
        L_0x01e9:
            r0 = r34 ^ 1
            goto L_0x00b2
        L_0x01ed:
            r8 = r9
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66493Lq.A0H(X.2mC, X.2mC, com.whatsapp.jid.UserJid, X.39T, java.lang.Integer, long, boolean, boolean):void");
    }

    public final void A0K(C95814uZ r4, List list) {
        if (this.A12.A03(0) && C627336j.A0K(r4)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A0U.A0O(r4, C18310x6.A0T(it));
            }
        }
    }

    public final void A0M(GroupJid groupJid) {
        Cursor A0E2;
        if (C627436k.A0I(this.A0j)) {
            C55422qK r2 = this.A0h;
            C56922sm r6 = r2.A03;
            long A072 = r6.A07(groupJid);
            C72303dV r3 = r2.A05;
            C85284Fq A042 = r3.A04();
            try {
                ContentValues A073 = AnonymousClass0x9.A07(1);
                A073.put("is_upcoming", Boolean.FALSE);
                C56862sg r8 = ((AnonymousClass3H0) A042).A03;
                String[] strArr = new String[1];
                C18260x0.A1X(strArr, A072);
                if (r8.A05(A073, "scheduled_calls", "key_chat_row_id = ? AND is_upcoming = 1", "ScheduledCallsStore/UPDATE_IS_UPCOMING_TO_FALSE_FOR_GROUP", strArr) == 0) {
                    Log.i("ScheduledCallsStore/updateIsUpcomingToFalseForGroup no scheduled calls to update");
                }
                ArrayList A0n2 = C18320x8.A0n(A042);
                String[] A1Z = AnonymousClass0x9.A1Z();
                C56922sm.A01(r6, groupJid, A1Z);
                AnonymousClass0x2.A1S(A1Z, 1, System.currentTimeMillis());
                AnonymousClass4GK A032 = r3.get();
                try {
                    A0E2 = ((AnonymousClass3H0) A032).A03.A0E(" SELECT creation_message_row_id FROM scheduled_calls WHERE key_chat_row_id = ?  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/SELECT_ROW_IDS_OF_SCHEDULED_CALLS_AFTER_TIME_IN_CHAT", A1Z);
                    int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("creation_message_row_id");
                    while (A0E2.moveToNext()) {
                        C18260x0.A0H(A0E2, A0n2, columnIndexOrThrow);
                    }
                    A0E2.close();
                    A032.close();
                    Iterator it = A0n2.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass30F) this.A1E.get()).A00(C18270x1.A02(it));
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    A032.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public void A0N(C28011fL r13, Iterable iterable, boolean z, boolean z2) {
        boolean z3;
        UserJid A052;
        C620833k A012 = C56892sj.A01(this.A0b, r13);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = iterable.iterator();
        while (true) {
            z3 = z;
            if (!it.hasNext()) {
                break;
            }
            UserJid A0T2 = C18310x6.A0T(it);
            A0s2.add(new C60842zG(A0T2, C620833k.A01(this.A0i.A0D(A0T2)), 0, z));
        }
        if (r13 instanceof AnonymousClass1fI) {
            C56972sr r0 = this.A06;
            if (z2) {
                A052 = r0.A0I();
                A012.A00 = 3;
            } else {
                A052 = C56972sr.A05(r0);
            }
            A012.A07(A052, this.A0i.A0D(A052), 2, z3, true);
        }
        A0F(A012, A0s2);
    }

    public void A0P(C28011fL r19, List list) {
        C31891p1 A052;
        List list2 = list;
        C626936e.A09("", list2);
        C28011fL r8 = r19;
        C620833k A012 = C56892sj.A01(this.A0b, r8);
        ArrayList A0p2 = AnonymousClass000.A0p(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            UserJid A0T2 = C18310x6.A0T(it);
            A0p2.add(new C60842zG(A0T2, C620833k.A01(this.A0i.A0D(A0T2)), 0, false));
        }
        A0F(A012, A0p2);
        this.A0H.A0b(r8);
        int size = list2.size();
        C67363Oz r1 = this.A0k;
        if (size == 1) {
            C28011fL r10 = r8;
            A052 = this.A17.A07(r10, (UserJid) list2.get(0), (AnonymousClass39T) null, 4, C56612sH.A07(this), 0);
        } else {
            A052 = this.A17.A05(A012, r8, (UserJid) null, (AnonymousClass39T) null, list2, 12, C56612sH.A07(this), 0);
        }
        r1.BEz(A052, 2);
        this.A05.A0S(new C70343aL(this, r8, A012, 26));
    }

    public void A0Q(C28011fL r24, List list) {
        C31891p1 A052;
        List list2 = list;
        C626936e.A09("", list2);
        C28011fL r7 = r24;
        C620833k A012 = C56892sj.A01(this.A0b, r7);
        boolean A0R2 = A012.A0R(list2);
        A012.A0L(list2);
        this.A0y.A0S(r7, list2);
        if (r7 instanceof AnonymousClass1fS) {
            if (A0R2) {
                if (this.A0P.A0X()) {
                    C70343aL.A01(this.A1C, this, r7, A012, 27);
                } else {
                    C48972fm r2 = this.A0Q;
                    r2.A00.submit(new C70343aL(this, r7, A012, 28));
                }
            }
            this.A0H.A0b(r7);
        } else {
            A0K(r7, list2);
        }
        int size = list2.size();
        C67363Oz r1 = this.A0k;
        C56832sd r5 = this.A17;
        long A072 = C56612sH.A07(this);
        if (size == 1) {
            A052 = r5.A07(r7, (UserJid) C18290x4.A0k(list2), (AnonymousClass39T) null, 7, A072, 0);
        } else {
            A052 = r5.A05(A012, r7, (UserJid) null, (AnonymousClass39T) null, list2, 14, A072, 0);
        }
        r1.BEz(A052, 2);
    }

    public final void A0R(C27991fJ r5) {
        C620833k A012 = C56892sj.A01(this.A0b, r5);
        C56972sr r3 = this.A06;
        A012.A06(C56972sr.A05(r3));
        C27981fH A0H2 = r3.A0H();
        if (A0H2 != null) {
            A012.A06(A0H2);
        }
        C172878Nf it = A012.A04().iterator();
        while (it.hasNext()) {
            C18320x8.A0G(it).A01 = 0;
        }
        this.A0y.A0T(r5);
        A0K(r5, Collections.singletonList(C56972sr.A04(r3)));
    }

    public final void A0U(C27991fJ r5, C27991fJ r6, String str, boolean z) {
        String A0H2;
        if (!z) {
            return;
        }
        if (r6 == null) {
            this.A04.A0A("comm-failures/parentGroupJid is null", false, AnonymousClass000.A0X(" has a null parent group", C18290x4.A0v(r5)));
            return;
        }
        C64773Ex r2 = this.A0F;
        AnonymousClass3ZH A092 = r2.A09(r6);
        if (A092 != null && (A0H2 = this.A0H.A0H(A092)) != null && A0H2.equals(str)) {
            AnonymousClass3ZH A0A2 = r2.A0A(r6);
            A0A2.A0P = str;
            C34461vC.A03(r2, A0A2);
            C69263Wi.A04(this.A05, this, r6, 21);
        }
    }

    public void A0W(C27991fJ r7, UserJid userJid, AnonymousClass39T r9, Set set, long j, boolean z, boolean z2) {
        C31831ov r3;
        if (z) {
            C56942so r4 = this.A0A;
            C27991fJ A012 = r4.A01(r7);
            if (A012 == null) {
                this.A04.A0A("groupChatManager/nullParent", true, "Could not find parent group to link");
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    r4.A0H.A05(AnonymousClass0x7.A0O(it), A012);
                }
            }
        } else {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                C27991fJ A013 = AnonymousClass34R.A01(AnonymousClass0x7.A0O(it2).A02);
                if (A013 != null) {
                    this.A0A.A0H.A06(A013);
                }
            }
        }
        if (!this.A1B.A01() || set.isEmpty()) {
            this.A11.A01(r9);
            return;
        }
        if (this.A0j.A0Y(C58422vE.A01, 3864) && z && z2) {
            C56942so r32 = this.A0A;
            if (r32.A01(r7) != null && set.size() == 1) {
                C52882mC A0O2 = AnonymousClass0x7.A0O(set.iterator());
                C56832sd r0 = this.A17;
                C27991fJ A014 = r32.A01(r7);
                GroupJid groupJid = A0O2.A02;
                String str = A0O2.A03;
                C31391oD r2 = new C31391oD(C56832sd.A00(r7, r0), r9, j);
                if (A014 != null) {
                    C30341mI.A00(A014, r2, "");
                }
                C162457s7.A0J(groupJid, 0);
                C52662lq.A01(groupJid, str, r2.A00, 2);
                r2.A1J(userJid);
                this.A0k.BEz(r2, 2);
                return;
            }
        }
        C67363Oz r42 = this.A0k;
        C27991fJ A015 = this.A0A.A01(r7);
        AnonymousClass2z0 A002 = C56832sd.A00(r7, this.A17);
        if (z) {
            r3 = new C31721ok(A002, j);
        } else {
            r3 = new C31731ol(A002, j);
        }
        r3.A04 = r9;
        r3.A1J(userJid);
        if (A015 != null) {
            C52662lq.A01(A015, (String) null, r3.A00, 1);
        }
        r3.A21(set);
        r42.BEz(r3, 3011);
    }

    public void A0X(C27991fJ r10, C48742fO r11, long j) {
        C27991fJ r4 = r10;
        AnonymousClass31A A002 = C56982ss.A00(this.A0S, r10);
        if (A002 == null) {
            Log.e("groupmgr/onGrowthLockChanged/notification for nonexistent group");
            return;
        }
        C30341mI A003 = this.A0x.A00(r4, A002.A0e, r11, j);
        if (A003 != null) {
            this.A0k.BEz(A003, 8);
        }
        C55412qJ r3 = this.A0V;
        C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/updategroupchatgrowthlockifexists/", r10);
        r3.A00.A01(new C70343aL(r3, r10, r11, 6), 58);
    }

    public boolean A0e(AnonymousClass3ZH r3, C27991fJ r4) {
        C49882hF r1 = this.A0p;
        if (r1.A00(r3, r4) || r1.A04.A00(r3, r4)) {
            return true;
        }
        return false;
    }

    public boolean A0i(C27991fJ r5) {
        C56892sj r3 = this.A0b;
        if ((!r3.A0H(r5) || !this.A0S.A0R(r5)) && (!this.A1B.A01() || this.A0S.A06(r5) != 3 || !r3.A0D(r5))) {
            return true;
        }
        return false;
    }

    public boolean A0j(C27991fJ r4) {
        if (this.A06.A0Y()) {
            AnonymousClass3ZH A072 = this.A0F.A07(r4);
            if (A072 == null) {
                return false;
            }
            if (A072.A0S != null || !TextUtils.isEmpty(A072.A0V)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0k(C27991fJ r4, Map map) {
        if (!this.A0r.A02(r4)) {
            Iterator A0v2 = AnonymousClass001.A0v(map);
            while (true) {
                if (!A0v2.hasNext()) {
                    break;
                } else if (C627336j.A0L(((C54792pI) A0v2.next()).A02)) {
                    if (!this.A0j.A0Y(C58422vE.A02, 2962) || this.A0b.A0B(r4)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0l(C27991fJ r5, boolean z) {
        AnonymousClass3ZH A092 = this.A0F.A09(r5);
        if (!this.A0j.A0Y(C58422vE.A02, 982) || A092 == null || !z || this.A0b.A0D(r5) || !A092.A0k) {
            return false;
        }
        return true;
    }

    public List A09(Map map) {
        ArrayList A0I2 = AnonymousClass002.A0I(map.keySet().size());
        Iterator A0i2 = C18280x3.A0i(map);
        while (A0i2.hasNext()) {
            AnonymousClass3ZH A072 = this.A0F.A07(C18300x5.A0P(A0i2));
            if (!(A072 == null || A072.A0F == null)) {
                A0I2.add(A072);
            }
        }
        Collections.sort(A0I2, new AnonymousClass4HH(this.A06, this.A0H, this, 0));
        return A0I2;
    }

    public final void A0F(C620833k r5, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (C627336j.A0L(C18320x8.A0G(it).A03)) {
                if (r5.A00 == 0) {
                    this.A04.A0A("addParticipants/group with lid", false, "trying to add a lid participant when is not an incognito CAG");
                }
            }
        }
        r5.A0K(list);
    }

    public void A0J(C61062ze r4) {
        PhoneUserJid phoneUserJid;
        PhoneUserJid phoneUserJid2;
        HashMap A0t2 = AnonymousClass001.A0t();
        UserJid userJid = r4.A0C;
        if (C627336j.A0L(userJid) && (phoneUserJid2 = r4.A0A) != null) {
            A0t2.put(userJid, phoneUserJid2);
        }
        UserJid userJid2 = r4.A0D;
        if (C627336j.A0L(userJid2) && (phoneUserJid = r4.A0B) != null) {
            A0t2.put(userJid2, phoneUserJid);
        }
        if (!A0t2.isEmpty()) {
            this.A13.A01(A0t2);
        }
    }

    public final void A0L(DeviceJid deviceJid, C27991fJ r5, AnonymousClass39T r6, boolean z) {
        if (this.A0P.A0c(new C54422oh(AnonymousClass36G.A02(deviceJid), r5.getRawString()), false)) {
            this.A07.A0I(r5, AnonymousClass001.A0f());
        }
        if (z) {
            this.A11.A01(r6);
        }
    }

    public final void A0S(C27991fJ r8, int i) {
        C69833Yo Axl;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("groupmgr/updateGroupMemberCount/updating group size metadata for group: ");
        A0o2.append(r8);
        C18260x0.A0y(" to:", A0o2, i);
        C44782Xl r1 = this.A0G;
        Integer A002 = r1.A00(r8);
        if (A002 != null && A002.intValue() == i) {
            return;
        }
        if (i >= 1) {
            try {
                C85284Fq A0C2 = r1.A01.A0C();
                try {
                    Axl = A0C2.Axl();
                    ContentValues A062 = AnonymousClass0x9.A06();
                    C18270x1.A0c(A062, "jid_row_id", r1.A00.A05(r8));
                    AnonymousClass3H0.A01(A062, A0C2, "member_count", i).A0C("group_membership_count", "UPDATE_GROUP_MEMBER_COUNT", A062, 5);
                    Axl.A00();
                    Axl.close();
                    A0C2.close();
                    A1H.post(new C70103Zx(this, 18, r8));
                    return;
                } catch (Throwable th) {
                    A0C2.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw AnonymousClass001.A0c("Number of members can't be less than 1.");
        }
        throw th;
    }

    public void A0V(C27991fJ r11, UserJid userJid) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        A0o2.append(userJid);
        C18260x0.A1R(A0o2, " to group:", r11);
        C56892sj.A01(this.A0b, r11).A07(userJid, this.A0i.A0D(userJid), 0, false, true);
        this.A0H.A0b(r11);
        C56832sd r1 = this.A17;
        C31891p1 A072 = r1.A07(r11, userJid, (AnonymousClass39T) null, 4, C56612sH.A07(this), 0);
        this.A0U.A08(A072);
        A1H.post(new C70103Zx(this, 22, A072));
    }

    public void A0Y(UserJid userJid, AnonymousClass36K r6) {
        Jid A0g2;
        Jid A0g3;
        HashMap A0t2 = AnonymousClass001.A0t();
        if (C627336j.A0L(userJid) && (A0g3 = r6.A0g(PhoneUserJid.class, "creator_pn")) != null) {
            A0t2.put(userJid, A0g3);
        }
        Jid A0g4 = r6.A0g(UserJid.class, "s_o");
        if (C627336j.A0L(A0g4) && (A0g2 = r6.A0g(PhoneUserJid.class, "s_o_pn")) != null) {
            A0t2.put(A0g4, A0g2);
        }
        if (!A0t2.isEmpty()) {
            this.A13.A01(A0t2);
        }
    }

    public void A0b(AnonymousClass39T r4, boolean z) {
        String str;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("groupmgr/onGroupSuspensionChanged/");
        A0o2.append(r4);
        C18260x0.A1E("/", A0o2, z);
        C27991fJ A022 = AnonymousClass34R.A02(C627336j.A02(r4.A02));
        C64773Ex r2 = this.A0F;
        AnonymousClass3ZH A092 = r2.A09(A022);
        if (A092 == null) {
            str = "groupmgr/onGroupSuspensionChanged/new group";
            Log.i(str);
        } else if (A092.A0s != z) {
            Log.i("groupmgr/onGroupSuspensionChanged/changed");
            AnonymousClass3ZH A0A2 = r2.A0A(A022);
            if (A0A2.A0s != z) {
                A0A2.A0s = z;
                C34461vC.A03(r2, A0A2);
            }
        } else {
            str = "groupmgr/onGroupSuspensionChanged/did not change";
            Log.i(str);
        }
        this.A11.A01(r4);
    }

    public void A0c(List list, boolean z) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("groupmgr/onLeaveGroup/");
        C18260x0.A1L(A0o2, Arrays.deepToString(list.toArray()));
        C56972sr r3 = this.A06;
        PhoneUserJid A052 = C56972sr.A05(r3);
        C27981fH A0H2 = r3.A0H();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C27991fJ r10 = (C27991fJ) it.next();
            this.A0H.A0b(r10);
            C64773Ex r6 = this.A0F;
            AnonymousClass3ZH A0A2 = r6.A0A(r10);
            if (A0A2.A03 != 2) {
                A0A2.A03 = 2;
                C34461vC.A03(r6, A0A2);
            }
            C620833k A012 = C56892sj.A01(this.A0b, r10);
            if (A012.A0O(r3)) {
                A012.A06(A052);
                if (A0H2 != null) {
                    A012.A06(A0H2);
                }
                this.A0y.A0T(r10);
                AnonymousClass4FS r62 = this.A1C;
                r62.BkM(new C70103Zx(this, 13, r10));
                r62.BkP(new C70103Zx(this, 14, r10));
                A0K(r10, Collections.singletonList(A052));
                C31891p1 A072 = this.A17.A07(r10, A052, (AnonymousClass39T) null, 5, C56612sH.A07(this), 0);
                if (!z || !this.A0S.A0L(r10)) {
                    C18290x4.A1C(A1H, A072, 3);
                } else {
                    this.A0k.BEz(A072, 7);
                }
                z2 = true;
            }
            if (this.A0S.A07(r10) == 1) {
                this.A0A.A09(r10);
                C18260x0.A1R(AnonymousClass001.A0o(), "groupmgr/onLeaveGroup/deletedParentGroup/jid = ", r10);
            }
        }
        if (z2) {
            RegistrationIntentService.A02(this.A0N.A00);
        }
    }

    public C66493Lq(C55682qk r13, C69263Wi r14, C56972sr r15, AnonymousClass36E r16, C66663Mh r17, C46292bO r18, C44272Vj r19, C56942so r20, C51352jg r21, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass3DJ r23, C29441ip r24, C64773Ex r25, C44782Xl r26, AnonymousClass5ZU r27, C56332ro r28, C64223Cq r29, C64213Cp r30, AnonymousClass314 r31, C56612sH r32, C54292oU r33, AnonymousClass33p r34, C620733j r35, C621133n r36, C48972fm r37, C52852m9 r38, C56982ss r39, C28891hw r40, C66543Lv r41, C55412qJ r42, C46672c1 r43, C54442oj r44, AnonymousClass3DL r45, C54302oV r46, C46412ba r47, C56892sj r48, AnonymousClass2S7 r49, C56152rV r50, C72303dV r51, C46682c2 r52, C52372lN r53, C55422qK r54, AnonymousClass318 r55, AnonymousClass1VX r56, C67363Oz r57, AnonymousClass2OF r58, C41632Kz r59, C28781hl r60, C50932j0 r61, C49882hF r62, C54932pW r63, C29241iV r64, C66503Lr r65, C29331ie r66, AnonymousClass2UY r67, C52472lX r68, AnonymousClass2YH r69, C621233o r70, AnonymousClass31C r71, AnonymousClass33Y r72, AnonymousClass33S r73, C1907099n r74, C53022mQ r75, C56452s0 r76, C30191m3 r77, AnonymousClass35J r78, C56832sd r79, C48252eb r80, C56572sD r81, C45602aH r82, C56072rN r83, AnonymousClass4FS r84, C183538qC r85, C183538qC r86) {
        C29071iE r11 = new C29071iE();
        this.A0q = r11;
        this.A0M = r32;
        AnonymousClass1VX r9 = r56;
        this.A0j = r9;
        this.A05 = r14;
        this.A04 = r13;
        this.A06 = r15;
        C54292oU r5 = r33;
        this.A0N = r5;
        this.A1C = r84;
        this.A0S = r39;
        this.A11 = r73;
        this.A19 = r81;
        this.A10 = r72;
        this.A0r = r63;
        this.A0c = r49;
        this.A0z = r71;
        C64773Ex r3 = r25;
        this.A0F = r3;
        this.A0V = r42;
        this.A07 = r16;
        AnonymousClass5ZU r4 = r27;
        this.A0H = r4;
        this.A1B = r83;
        this.A0p = r62;
        this.A0d = r50;
        C66543Lv r7 = r41;
        this.A0U = r7;
        this.A1A = r82;
        this.A0g = r53;
        this.A0t = r65;
        this.A0K = r30;
        this.A0x = r69;
        this.A0P = r36;
        this.A0w = r68;
        this.A0i = r55;
        this.A0R = r38;
        this.A0I = r28;
        this.A0J = r29;
        this.A16 = r78;
        this.A0k = r57;
        this.A0f = r52;
        this.A18 = r80;
        this.A0n = r60;
        this.A0e = r51;
        this.A14 = r76;
        this.A15 = r77;
        this.A0h = r54;
        this.A0O = r34;
        this.A0A = r20;
        this.A0B = r21;
        this.A0L = r31;
        this.A0u = r66;
        this.A17 = r79;
        this.A0m = r59;
        this.A0T = r40;
        this.A0a = r47;
        this.A12 = r74;
        this.A0y = r70;
        this.A09 = r19;
        this.A1D = r85;
        C50932j0 r10 = r61;
        this.A0o = r10;
        C56892sj r8 = r48;
        this.A0b = r8;
        this.A0E = r24;
        this.A0W = r43;
        this.A0G = r26;
        this.A0s = r64;
        this.A13 = r75;
        this.A0Z = r46;
        this.A1E = r86;
        this.A0v = r67;
        this.A08 = r18;
        this.A0X = r44;
        this.A0Y = r45;
        this.A0Q = r37;
        this.A0C = memberSuggestedGroupsManager;
        this.A0D = r23;
        this.A0l = r58;
        A1H = new C18860yN(r14, r17, r3, r4, r5, r35, r7, r8, r9, r10, r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a0, code lost:
        if (r16 != false) goto L_0x02a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.C620833k r31, X.AnonymousClass334 r32, java.lang.String r33, java.util.Map r34, long r35, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r30 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
            r10 = r34
            java.util.ArrayList r11 = X.C18290x4.A0z(r10)
            r1 = r31
            X.1fL r14 = r1.A05
            com.whatsapp.jid.GroupJid r13 = X.AnonymousClass32V.A00(r14)
            X.8TE r8 = X.AnonymousClass8TE.create()
            java.util.Iterator r16 = X.C18280x3.A0i(r10)
        L_0x001e:
            boolean r2 = r16.hasNext()
            r0 = r30
            if (r2 == 0) goto L_0x00f1
            com.whatsapp.jid.UserJid r9 = X.C18310x6.A0T(r16)
            java.lang.Object r7 = r10.get(r9)
            X.2pI r7 = (X.C54792pI) r7
            X.C626936e.A06(r7)
            java.lang.String r4 = r7.A04
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            java.lang.String r2 = "admin"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00e4
            r6 = 1
        L_0x0042:
            X.2zG r5 = r1.A05(r9)
            if (r5 != 0) goto L_0x00c5
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "groupmgr/sync-add-participant: "
            X.C18260x0.A1R(r4, r2, r9)
            r3.add(r9)
        L_0x0054:
            com.whatsapp.jid.UserJid r5 = r7.A02
            boolean r2 = X.C627336j.A0L(r5)
            if (r2 == 0) goto L_0x00b8
            com.whatsapp.jid.PhoneUserJid r4 = r7.A01
            if (r4 == 0) goto L_0x00b8
        L_0x0060:
            r8.put(r4, r5)
        L_0x0063:
            X.318 r5 = r0.A0i
            java.util.Set r2 = r5.A0D(r9)
            java.util.Set r12 = X.C620833k.A01(r2)
            r4 = 0
            X.2zG r2 = new X.2zG
            r2.<init>(r9, r12, r6, r4)
            r11.add(r2)
            boolean r2 = X.C627336j.A0L(r9)
            if (r2 == 0) goto L_0x009c
            X.2sr r0 = r0.A06
            boolean r2 = r0.A0a(r9)
            if (r2 == 0) goto L_0x009c
            com.whatsapp.jid.PhoneUserJid r9 = X.C56972sr.A05(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)
            java.util.Set r0 = r5.A0D(r0)
            java.util.Set r2 = X.C620833k.A01(r0)
            X.2zG r0 = new X.2zG
            r0.<init>(r9, r2, r6, r4)
            r11.add(r0)
        L_0x009c:
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x001e
            if (r41 == 0) goto L_0x001e
            X.1fH r2 = r7.A00
            java.util.Set r0 = r5.A0D(r2)
            java.util.Set r5 = X.C620833k.A01(r0)
            X.2zG r0 = new X.2zG
            r0.<init>(r2, r5, r6, r4)
            r11.add(r0)
            goto L_0x001e
        L_0x00b8:
            boolean r2 = X.C627336j.A0M(r5)
            if (r2 == 0) goto L_0x0063
            X.1fH r2 = r7.A00
            if (r2 == 0) goto L_0x0063
            r4 = r5
            r5 = r2
            goto L_0x0060
        L_0x00c5:
            int r2 = r5.A01
            if (r2 == r6) goto L_0x0054
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "groupmgr/sync-change-admin-participant: "
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = " was "
            r4.append(r2)
            int r2 = r5.A01
            X.C18260x0.A1G(r4, r2)
            r15.add(r5)
            goto L_0x0054
        L_0x00e4:
            java.lang.String r2 = "superadmin"
            boolean r2 = r2.equals(r4)
            int r6 = X.C18310x6.A02(r2)
            goto L_0x0042
        L_0x00f1:
            r0.A0F(r1, r11)
            java.util.Collection r2 = r10.values()
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            if (r2 == 0) goto L_0x011a
            java.util.Iterator r6 = r2.iterator()
        L_0x0102:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x011a
            java.lang.Object r4 = r6.next()
            X.2pI r4 = (X.C54792pI) r4
            boolean r2 = r4.A00()
            if (r2 == 0) goto L_0x0102
            X.1fH r2 = r4.A00
            r5.add(r2)
            goto L_0x0102
        L_0x011a:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.6aS r4 = r1.A03()
            X.8Nf r9 = r4.iterator()
        L_0x0126:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x015c
            X.4uZ r7 = X.C18300x5.A0P(r9)
            boolean r4 = r10.containsKey(r7)
            if (r4 != 0) goto L_0x0126
            boolean r4 = r5.contains(r7)
            if (r4 != 0) goto L_0x0126
            X.2sr r6 = r0.A06
            boolean r4 = r6.A0a(r7)
            if (r4 == 0) goto L_0x014f
            X.1fH r4 = r6.A0H()
            boolean r4 = r10.containsKey(r4)
            if (r4 == 0) goto L_0x014f
            goto L_0x0126
        L_0x014f:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "groupmgr/sync-remove-participant:"
            X.C18260x0.A1R(r6, r4, r7)
            r2.add(r7)
            goto L_0x0126
        L_0x015c:
            X.2sr r9 = r0.A06
            com.whatsapp.jid.PhoneUserJid r6 = X.C56972sr.A04(r9)
            X.1fH r5 = r9.A0H()
            boolean r4 = r3.contains(r5)
            if (r4 == 0) goto L_0x0331
            boolean r4 = r2.contains(r6)
            if (r4 == 0) goto L_0x0331
            r3.remove(r5)
            r2.remove(r6)
        L_0x0178:
            r1.A0L(r2)
            java.util.List r6 = r0.A08(r13, r3)
            java.util.List r7 = r0.A08(r13, r2)
            X.1fJ r5 = X.AnonymousClass34R.A03(r14)
            X.2ss r4 = r0.A0S
            int r5 = r4.A07(r5)
            r4 = 3
            if (r5 != r4) goto L_0x02e0
            r16 = 0
        L_0x0192:
            r5 = 1
            r28 = r35
            if (r37 == 0) goto L_0x02b6
            java.util.ArrayList r11 = r1.A0D()
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x01d1
            X.3Oz r4 = r0.A0k
            X.2sd r8 = r0.A17
            r21 = 0
            long r24 = X.C56612sH.A07(r0)
            if (r39 == 0) goto L_0x02b3
            int r10 = r11.size()
            if (r10 != r5) goto L_0x02b3
            java.lang.Object r5 = X.AnonymousClass0x9.A0t(r11)
            X.2zG r5 = (X.C60842zG) r5
            com.whatsapp.jid.UserJid r5 = r5.A03
        L_0x01bb:
            r23 = 12
            r26 = 0
            r19 = r13
            r20 = r5
            r22 = r6
            r17 = r8
            r18 = r1
            X.1p1 r8 = r17.A05(r18, r19, r20, r21, r22, r23, r24, r26)
            r5 = 2
            r4.BEz(r8, r5)
        L_0x01d1:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x01f7
            X.3Oz r5 = r0.A0k
            X.2sd r4 = r0.A17
            r18 = 0
            long r24 = X.C56612sH.A07(r0)
            r23 = 13
            r26 = 0
            r21 = r18
            r17 = r4
            r19 = r13
            r20 = r18
            r22 = r7
            X.1p1 r8 = r17.A05(r18, r19, r20, r21, r22, r23, r24, r26)
            r4 = 2
            r5.BEz(r8, r4)
        L_0x01f7:
            java.lang.Long r4 = java.lang.Long.valueOf(r28)
            r0.A0O(r13, r4, r15)
        L_0x01fe:
            X.2sj r8 = r0.A0b
            r4 = r28
            r8.A06(r1, r4)
            boolean r4 = r6.isEmpty()
            r10 = r32
            if (r4 != 0) goto L_0x0228
            boolean r4 = r1.A0O(r9)
            if (r4 == 0) goto L_0x0228
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r9)
            boolean r4 = r6.contains(r4)
            r8 = r40
            if (r4 == 0) goto L_0x02ac
            X.6aS r5 = r1.A03()
            int r4 = r10.A00
            r0.A0E(r1, r5, r4, r8)
        L_0x0228:
            X.4FS r8 = r0.A1C
            r5 = 20
            X.3Zx r4 = new X.3Zx
            r4.<init>(r0, r5, r3)
            r8.BkM(r4)
            java.lang.String r5 = r10.A01
            java.lang.String r4 = "phash"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0293
            int r4 = r3.size()
            if (r4 > 0) goto L_0x024b
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0293
        L_0x024b:
            X.36E r4 = r0.A07
            boolean r9 = r10.A03
            int r8 = r3.size()
            int r5 = r2.size()
            boolean r3 = r10.A04
            java.util.Map r0 = r1.A09
            int r2 = r0.size()
            X.1Zn r1 = new X.1Zn
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            X.2ss r0 = r4.A09
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r0, r14)
            r1.A03 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r8)
            r1.A04 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r5)
            r1.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A01 = r0
            int r0 = X.AnonymousClass36M.A04(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            X.4FV r0 = r4.A0G
            r0.BhD(r1)
        L_0x0293:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x02a2
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02a2
            r1 = 0
            if (r16 == 0) goto L_0x02a3
        L_0x02a2:
            r1 = 1
        L_0x02a3:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x02ab
            r1 = r1 | 2
        L_0x02ab:
            return r1
        L_0x02ac:
            int r4 = r10.A00
            r0.A0E(r1, r6, r4, r8)
            goto L_0x0228
        L_0x02b3:
            r5 = 0
            goto L_0x01bb
        L_0x02b6:
            if (r38 == 0) goto L_0x01fe
            r5 = r33
            if (r33 == 0) goto L_0x01fe
            java.lang.String r4 = r1.A0C()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01fe
            X.3Oz r11 = r0.A0k
            X.2sd r8 = r0.A17
            long r4 = X.C56612sH.A07(r0)
            r12 = 86
            X.2aD r10 = r8.A03
            X.2z0 r8 = X.C56832sd.A00(r14, r8)
            X.1mI r5 = r10.A00(r8, r12, r4)
            r4 = 2
            r11.BEz(r5, r4)
            goto L_0x01fe
        L_0x02e0:
            X.6aS r4 = r1.A03()
            X.8Nf r11 = r4.iterator()
            r16 = 0
        L_0x02ea:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0192
            com.whatsapp.jid.Jid r10 = X.AnonymousClass0x7.A0S(r11)
            boolean r4 = X.C627336j.A0L(r10)
            if (r4 == 0) goto L_0x0326
            X.4GN r5 = r8.inverse()
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C162457s7.A0K(r10, r4)
            java.lang.Object r4 = r5.get(r10)
        L_0x0308:
            if (r4 == 0) goto L_0x02ea
            boolean r5 = r6.contains(r4)
            if (r5 == 0) goto L_0x0319
            r6.remove(r4)
            r7.remove(r10)
        L_0x0316:
            r16 = 1
            goto L_0x02ea
        L_0x0319:
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L_0x02ea
            r6.remove(r10)
            r7.remove(r4)
            goto L_0x0316
        L_0x0326:
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C162457s7.A0K(r10, r4)
            java.lang.Object r4 = r8.get(r10)
            goto L_0x0308
        L_0x0331:
            boolean r4 = r3.contains(r6)
            if (r4 == 0) goto L_0x0178
            boolean r4 = r2.contains(r5)
            if (r4 == 0) goto L_0x0178
            r3.remove(r6)
            r2.remove(r5)
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66493Lq.A01(X.33k, X.334, java.lang.String, java.util.Map, long, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: X.1oC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.1oB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: X.1oI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: X.1ox} */
    /* JADX WARNING: type inference failed for: r7v5, types: [X.1oF] */
    /* JADX WARNING: type inference failed for: r7v7, types: [X.1oF] */
    /* JADX WARNING: type inference failed for: r7v17, types: [X.1oJ] */
    /* JADX WARNING: type inference failed for: r7v19, types: [X.1oJ] */
    /* JADX WARNING: type inference failed for: r7v24, types: [X.1oG] */
    /* JADX WARNING: type inference failed for: r7v25, types: [X.1oG] */
    /* JADX WARNING: type inference failed for: r7v31, types: [X.1oH] */
    /* JADX WARNING: type inference failed for: r7v32, types: [X.1oH] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C620833k r21, com.whatsapp.jid.GroupJid r22, com.whatsapp.jid.GroupJid r23, X.C27991fJ r24, com.whatsapp.jid.UserJid r25, com.whatsapp.jid.UserJid r26, X.AnonymousClass39T r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, int r32, long r33, long r35, boolean r37) {
        /*
            r20 = this;
            r3 = r23
            r12 = r25
            java.lang.String r0 = "auto_add"
            r8 = r28
            boolean r9 = r0.equals(r8)
            r4 = r20
            r0 = r33
            r18 = r35
            r6 = r22
            r11 = r24
            r13 = r27
            r14 = r31
            if (r9 != 0) goto L_0x00f5
            java.lang.String r2 = "default_sub_group_admin_add"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x00f5
            java.lang.String r2 = "invite_auto_add"
            boolean r7 = r2.equals(r8)
            r10 = r21
            r5 = r26
            r2 = r30
            if (r7 == 0) goto L_0x00ad
            if (r37 == 0) goto L_0x006d
            X.2sd r9 = r4.A17
            X.1fJ r6 = X.AnonymousClass34R.A01(r11)
            X.1fJ r8 = X.AnonymousClass34R.A03(r3)
            if (r27 != 0) goto L_0x0067
            X.2z0 r3 = X.C56832sd.A00(r6, r9)
            X.1oH r7 = new X.1oH
            r7.<init>((X.AnonymousClass2z0) r3, (long) r0)
        L_0x0049:
            if (r8 == 0) goto L_0x004e
            X.C30341mI.A00(r8, r7, r2)
        L_0x004e:
            r7.A1J(r5)
            r7.A1Z(r2)
        L_0x0054:
            int r0 = r7.A00
            r12 = r5
        L_0x0057:
            r10 = r12
            r11 = r7
            r12 = r14
            r13 = r0
            r14 = r18
            r9.A09(r10, r11, r12, r13, r14)
        L_0x0060:
            X.3Oz r1 = r4.A0k
            r0 = 2
            r1.BEz(r7, r0)
            return
        L_0x0067:
            X.1oH r7 = new X.1oH
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x0049
        L_0x006d:
            if (r23 != 0) goto L_0x0075
            X.2so r2 = r4.A0A
            X.1fJ r3 = r2.A01(r11)
        L_0x0075:
            X.2sd r2 = r4.A17
            X.2ss r5 = r4.A0S
            java.lang.String r8 = r5.A0D(r6)
            java.lang.String r5 = r5.A0D(r3)
            if (r27 != 0) goto L_0x00a7
            X.2z0 r9 = X.C56832sd.A00(r11, r2)
            X.1ox r7 = new X.1ox
            r7.<init>(r9, r0)
        L_0x008c:
            if (r22 == 0) goto L_0x0094
            java.util.List r1 = r7.A00
            r0 = 2
            X.C52662lq.A01(r6, r8, r1, r0)
        L_0x0094:
            if (r3 == 0) goto L_0x009c
            java.util.List r1 = r7.A00
            r0 = 1
            X.C52662lq.A01(r3, r5, r1, r0)
        L_0x009c:
            r9 = 101(0x65, float:1.42E-43)
            r6 = r12
            r8 = r14
            r10 = r18
            r5 = r2
            r5.A09(r6, r7, r8, r9, r10)
            goto L_0x0060
        L_0x00a7:
            X.1ox r7 = new X.1ox
            r7.<init>(r10, r13, r0)
            goto L_0x008c
        L_0x00ad:
            java.lang.String r7 = "invite"
            r6 = r32
            if (r37 == 0) goto L_0x0185
            r9 = 3
            if (r6 != r9) goto L_0x0185
            boolean r7 = r7.equals(r8)
            X.2sd r9 = r4.A17
            X.1fJ r6 = X.AnonymousClass34R.A01(r11)
            X.1fJ r8 = X.AnonymousClass34R.A03(r3)
            if (r7 == 0) goto L_0x00da
            if (r27 != 0) goto L_0x00d3
            X.2z0 r3 = X.C56832sd.A00(r6, r9)
            X.1oG r7 = new X.1oG
            r7.<init>((X.AnonymousClass2z0) r3, (long) r0)
            goto L_0x0049
        L_0x00d3:
            X.1oG r7 = new X.1oG
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x0049
        L_0x00da:
            if (r27 != 0) goto L_0x00ef
            X.2z0 r3 = X.C56832sd.A00(r6, r9)
            X.1oI r7 = new X.1oI
            r7.<init>((X.AnonymousClass2z0) r3, (long) r0)
        L_0x00e5:
            if (r8 == 0) goto L_0x00ea
            X.C30341mI.A00(r8, r7, r2)
        L_0x00ea:
            r7.A1J(r5)
            goto L_0x0054
        L_0x00ef:
            X.1oI r7 = new X.1oI
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x00e5
        L_0x00f5:
            if (r23 != 0) goto L_0x00fd
            X.2so r2 = r4.A0A
            X.1fJ r3 = r2.A01(r11)
        L_0x00fd:
            r5 = 0
            if (r3 == 0) goto L_0x0183
            X.2ss r2 = r4.A0S
            java.lang.String r7 = r2.A0D(r3)
            r2 = 1
            X.2lq r8 = new X.2lq
            r8.<init>(r3, r7, r2)
        L_0x010c:
            if (r22 == 0) goto L_0x011a
            X.2ss r2 = r4.A0S
            java.lang.String r3 = r2.A0D(r6)
            r2 = 2
            X.2lq r5 = new X.2lq
            r5.<init>(r6, r3, r2)
        L_0x011a:
            if (r9 == 0) goto L_0x0159
            X.1VX r6 = r4.A0j
            r3 = 3380(0xd34, float:4.736E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r6.A0Y(r2, r3)
            if (r2 == 0) goto L_0x0159
            X.2sd r9 = r4.A17
            X.1fJ r2 = X.AnonymousClass34R.A01(r11)
            if (r27 != 0) goto L_0x0153
            X.2z0 r2 = X.C56832sd.A00(r2, r9)
            X.1oF r7 = new X.1oF
            r7.<init>((X.AnonymousClass2z0) r2, (long) r0)
        L_0x0139:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            if (r8 == 0) goto L_0x0142
            r1.add(r8)
        L_0x0142:
            if (r5 == 0) goto L_0x0147
            r1.add(r5)
        L_0x0147:
            java.util.List r0 = r7.A00
            r0.clear()
            r0.addAll(r1)
        L_0x014f:
            r7.A1J(r12)
            goto L_0x01c7
        L_0x0153:
            X.1oF r7 = new X.1oF
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x0139
        L_0x0159:
            X.2sd r9 = r4.A17
            X.1fJ r6 = X.AnonymousClass34R.A01(r11)
            r5 = 0
            if (r8 == 0) goto L_0x0181
            com.whatsapp.jid.GroupJid r2 = r8.A01
            X.1fJ r3 = X.AnonymousClass34R.A03(r2)
            java.lang.String r5 = r8.A02
        L_0x016a:
            if (r27 != 0) goto L_0x017b
            X.2z0 r2 = X.C56832sd.A00(r6, r9)
            X.1oI r7 = new X.1oI
            r7.<init>((X.AnonymousClass2z0) r2, (long) r0)
        L_0x0175:
            if (r3 == 0) goto L_0x014f
            X.C30341mI.A00(r3, r7, r5)
            goto L_0x014f
        L_0x017b:
            X.1oI r7 = new X.1oI
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x0175
        L_0x0181:
            r3 = r5
            goto L_0x016a
        L_0x0183:
            r8 = r5
            goto L_0x010c
        L_0x0185:
            X.2rN r5 = r4.A1B
            boolean r9 = r5.A02(r6)
            r5 = r29
            if (r9 == 0) goto L_0x01d1
            X.2sr r9 = r4.A06
            com.whatsapp.jid.PhoneUserJid r9 = X.C56972sr.A04(r9)
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L_0x01d1
            X.2sd r9 = r4.A17
            X.1fJ r6 = X.AnonymousClass34R.A01(r3)
            if (r27 != 0) goto L_0x01cb
            X.2z0 r3 = X.C56832sd.A00(r11, r9)
            X.1oJ r7 = new X.1oJ
            r7.<init>((X.AnonymousClass2z0) r3, (long) r0)
        L_0x01ac:
            if (r6 == 0) goto L_0x01b1
            X.C30341mI.A00(r6, r7, r5)
        L_0x01b1:
            if (r24 == 0) goto L_0x01c2
            java.util.List r3 = r7.A00
            X.C162457s7.A0D(r3)
            X.459 r1 = X.AnonymousClass459.A00
            r0 = 1
            X.C73743g0.A0Z(r3, r1, r0)
            r0 = 2
            X.C52662lq.A01(r11, r2, r3, r0)
        L_0x01c2:
            r7.A1J(r12)
            r7.A0y = r8
        L_0x01c7:
            int r0 = r7.A00
            goto L_0x0057
        L_0x01cb:
            X.1oJ r7 = new X.1oJ
            r7.<init>((X.AnonymousClass39T) r13, (long) r0)
            goto L_0x01ac
        L_0x01d1:
            java.lang.String r2 = "accept"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01e5
            r15 = 52
        L_0x01db:
            X.2sd r9 = r4.A17
            r16 = r0
            X.1p1 r7 = r9.A05(r10, r11, r12, r13, r14, r15, r16, r18)
            goto L_0x0060
        L_0x01e5:
            java.lang.String r2 = "default_sub_group_promote"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01f0
            r15 = 93
            goto L_0x01db
        L_0x01f0:
            boolean r2 = r7.equals(r8)
            if (r2 == 0) goto L_0x0224
            r2 = 2
            if (r6 == r2) goto L_0x01fc
            r2 = 6
            if (r6 != r2) goto L_0x024e
        L_0x01fc:
            if (r37 == 0) goto L_0x024e
            X.2sd r8 = r4.A17
            X.1fJ r3 = X.AnonymousClass34R.A01(r3)
            X.2z0 r2 = X.C56832sd.A00(r11, r8)
            X.1oB r7 = new X.1oB
            r7.<init>(r2, r0)
            if (r3 == 0) goto L_0x0212
            X.C30341mI.A00(r3, r7, r5)
        L_0x0212:
            r7.A00 = r6
        L_0x0214:
            int r0 = r7.A00
            r13 = r7
            r15 = r0
            r16 = r18
            r11 = r8
            r11.A09(r12, r13, r14, r15, r16)
            r0 = 1
            r8.A0A(r12, r7, r0)
            goto L_0x0060
        L_0x0224:
            java.lang.String r2 = "linked_group_join"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x022f
            r15 = 79
            goto L_0x01db
        L_0x022f:
            r2 = 2
            if (r6 == r2) goto L_0x0235
            r2 = 6
            if (r6 != r2) goto L_0x0251
        L_0x0235:
            if (r37 == 0) goto L_0x0251
            X.2sd r8 = r4.A17
            X.1fJ r3 = X.AnonymousClass34R.A01(r3)
            X.2z0 r2 = X.C56832sd.A00(r11, r8)
            X.1oC r7 = new X.1oC
            r7.<init>(r2, r0)
            if (r3 == 0) goto L_0x024b
            X.C30341mI.A00(r3, r7, r5)
        L_0x024b:
            r7.A00 = r6
            goto L_0x0214
        L_0x024e:
            r15 = 20
            goto L_0x01db
        L_0x0251:
            r15 = 12
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66493Lq.A0D(X.33k, com.whatsapp.jid.GroupJid, com.whatsapp.jid.GroupJid, X.1fJ, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.39T, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, long, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x013b, code lost:
        if (r40 != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0256, code lost:
        if (r81 != false) goto L_0x0258;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass334 r54, X.C27991fJ r55, X.C27991fJ r56, com.whatsapp.jid.UserJid r57, X.C60912zN r58, X.C48742fO r59, java.lang.Integer r60, java.lang.String r61, java.lang.String r62, java.util.Map r63, int r64, int r65, int r66, int r67, long r68, long r70, long r72, long r74, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87) {
        /*
            r53 = this;
            java.lang.String r0 = "groupmgr/onGroupInfoFromList"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = r53
            X.3Ex r0 = r2.A0F
            r48 = r0
            r3 = r55
            X.3ZH r4 = r0.A0A(r3)
            java.lang.String r0 = r4.A0V
            boolean r40 = android.text.TextUtils.isEmpty(r0)
            boolean r0 = r4.A0q
            r1 = r84
            boolean r19 = X.AnonymousClass001.A1X(r0, r1)
            boolean r0 = r4.A0i
            r8 = r86
            boolean r9 = X.AnonymousClass001.A1X(r0, r8)
            r51 = r62
            r52 = r61
            r23 = r58
            r39 = r87
            r41 = r57
            r37 = r85
            r26 = r67
            r35 = r82
            r34 = r81
            r27 = r68
            r33 = r80
            r32 = r79
            r31 = r78
            r30 = r77
            r29 = r76
            r24 = r52
            r25 = r51
            r36 = r1
            r38 = r8
            r20 = r2
            r21 = r4
            r22 = r41
            boolean r18 = r20.A0f(r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            int r0 = r4.A02
            r1 = r64
            if (r0 == r1) goto L_0x02ea
            r4.A02 = r1
            r18 = 1
            r17 = 1
        L_0x0063:
            r44 = r52
            X.2ss r12 = r2.A0S
            boolean r0 = r12.A0L(r3)
            r6 = 1
            r16 = r0 ^ 1
            r1 = 3
            r45 = r65
            r0 = r45
            boolean r13 = X.AnonymousClass000.A1U(r0, r1)
            r7 = 0
            r29 = r56
            r49 = r70
            if (r16 == 0) goto L_0x0280
            boolean r0 = r2.A0l(r3, r13)
            if (r0 == 0) goto L_0x009f
            X.3Oz r0 = r2.A0k
            X.2sd r1 = r2.A17
            long r25 = X.C56612sH.A07(r2)
            r24 = 99
            r23 = r7
            r20 = r1
            r21 = r7
            r22 = r3
            X.1p1 r1 = r20.A06(r21, r22, r23, r24, r25)
            X.3Lv r0 = r0.A01
            r0.A0V(r1)
        L_0x009f:
            X.3Oz r5 = r2.A0k
            X.2sd r15 = r2.A17
            r24 = 11
            r14 = 0
            r23 = r7
            r20 = r15
            r21 = r7
            r22 = r3
            r25 = r49
            X.1p1 r1 = r20.A06(r21, r22, r23, r24, r25)
            r0 = r52
            r1.A1Z(r0)
            r0 = r41
            r1.A1J(r0)
            r5.BEz(r1, r6)
            X.2sr r1 = r2.A06
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x00df
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A05(r1)
            X.2z0 r10 = X.C56832sd.A01(r3, r15, r6)
            r9 = 4
            r0 = r49
            X.1p1 r0 = X.C31891p1.A02(r10, r9, r0)
            r0.A1J(r11)
            r1 = 2
            r5.BEz(r0, r1)
        L_0x00df:
            if (r56 == 0) goto L_0x00f0
            java.lang.String r22 = ""
            r24 = 0
            X.2mC r7 = new X.2mC
            r20 = r7
            r23 = r6
            r21 = r29
            r20.<init>(r21, r22, r23, r24)
        L_0x00f0:
            X.2mC r21 = new X.2mC
            r22 = r3
            r23 = r52
            r24 = r45
            r25 = r49
            r21.<init>(r22, r23, r24, r25)
            r26 = 0
            r20 = r2
            r22 = r7
            r23 = r41
            r24 = r27
            r27 = r26
            r20.A0G(r21, r22, r23, r24, r26, r27)
            if (r86 == 0) goto L_0x0128
            long r25 = X.C56612sH.A07(r2)
            r24 = 150(0x96, float:2.1E-43)
            r23 = r14
            r21 = r14
            r22 = r3
            r20 = r15
            X.1p1 r1 = r20.A06(r21, r22, r23, r24, r25)
            r1.A1J(r14)
            r0 = 3019(0xbcb, float:4.23E-42)
            r5.BEz(r1, r0)
        L_0x0128:
            r5 = r63
            if (r63 == 0) goto L_0x0137
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0137
            X.2mQ r0 = r2.A13
            r0.A02(r5)
        L_0x0137:
            if (r16 != 0) goto L_0x013d
            r39 = 1
            if (r40 == 0) goto L_0x013f
        L_0x013d:
            r39 = 0
        L_0x013f:
            r6 = r72
            if (r63 != 0) goto L_0x023b
            r8 = 0
        L_0x0144:
            if (r18 == 0) goto L_0x014b
            r0 = r48
            r0.A0O(r4)
        L_0x014b:
            X.2ba r0 = r2.A0a
            r5 = 0
            X.C162457s7.A0J(r3, r5)
            java.util.Map r0 = r0.A04
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x015f
            X.2s0 r1 = r2.A14
            r0 = 2
            r1.A01(r3, r5, r0)
        L_0x015f:
            r0 = r8 & 2
            if (r0 == 0) goto L_0x0169
            r1 = 5
            android.os.Handler r0 = A1H
            X.C18290x4.A1C(r0, r3, r1)
        L_0x0169:
            if (r17 == 0) goto L_0x018a
            if (r39 == 0) goto L_0x018a
            X.2sd r1 = r2.A17
            r22 = 0
            int r0 = r4.A02
            long r25 = X.C56612sH.A07(r2)
            r21 = r3
            r23 = r22
            r24 = r0
            r20 = r1
            X.1mI r5 = r20.A03(r21, r22, r23, r24, r25)
            r1 = 3017(0xbc9, float:4.228E-42)
            android.os.Handler r0 = A1H
            X.C18290x4.A1C(r0, r5, r1)
        L_0x018a:
            if (r19 == 0) goto L_0x01c6
            if (r39 == 0) goto L_0x01c6
            r8 = 0
            long r0 = X.C56612sH.A07(r2)
            boolean r10 = r4.A0q
            X.2eb r4 = r2.A18
            X.1VX r9 = r4.A00
            r5 = 3695(0xe6f, float:5.178E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r4 = r9.A0Y(r4, r5)
            if (r4 == 0) goto L_0x01c6
            X.2sd r9 = r2.A17
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "SystemMessageFactory/newReportToAdminStatusChangeSystemMessage/gjid="
            X.C18260x0.A1R(r5, r4, r3)
            X.2z0 r5 = X.C56832sd.A00(r3, r9)
            r4 = 141(0x8d, float:1.98E-43)
            if (r10 == 0) goto L_0x01b8
            r4 = 140(0x8c, float:1.96E-43)
        L_0x01b8:
            X.1p1 r4 = X.C31891p1.A02(r5, r4, r0)
            r4.A1J(r8)
            r1 = 3027(0xbd3, float:4.242E-42)
            android.os.Handler r0 = A1H
            X.C18290x4.A1C(r0, r4, r1)
        L_0x01c6:
            r1 = 3
            r0 = r45
            if (r0 != r1) goto L_0x01fc
            if (r60 == 0) goto L_0x01d4
            int r0 = r60.intValue()
            r2.A0S(r3, r0)
        L_0x01d4:
            r28 = r2
            r30 = r3
            r31 = r52
            r32 = r45
            r33 = r49
            r28.A0T(r29, r30, r31, r32, r33)
            X.2oV r4 = r2.A0Z
            r0 = r74
            r4.A00(r3, r0)
            long r0 = X.C18290x4.A0B(r49)
            r4.A03(r3, r0)
            r4.A02(r3, r6)
            X.2sD r2 = r2.A19
            r1 = 4
            r0 = 0
            r4 = r83
            r2.A04(r3, r0, r1, r4)
            return
        L_0x01fc:
            r5 = 1
            if (r0 != r5) goto L_0x01d4
            X.31A r4 = X.C56982ss.A00(r12, r3)
            r8 = r66
            if (r4 == 0) goto L_0x0215
            X.2so r1 = r2.A0A
            r0 = 1
            if (r8 == r5) goto L_0x020d
            r0 = 0
        L_0x020d:
            r4.A0n = r0
            X.2f2 r0 = r1.A07
            r0.A00(r4)
            goto L_0x01d4
        L_0x0215:
            if (r16 == 0) goto L_0x01d4
            if (r8 == r5) goto L_0x021a
            r5 = 0
        L_0x021a:
            X.2jg r4 = r2.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunitySharedPrefs/setTempIsClosed()/groupType = "
            X.C18260x0.A1E(r0, r1, r5)
            android.content.SharedPreferences r0 = r4.A00()
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "closed_"
            java.lang.String r0 = X.C18260x0.A03(r3, r0, r1)
            X.C18270x1.A0l(r4, r0, r5)
            goto L_0x01d4
        L_0x023b:
            X.2sj r0 = r2.A0b
            X.33k r1 = X.C56892sj.A01(r0, r3)
            java.lang.String r8 = "lid"
            r0 = r51
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0277
            r0 = 3
        L_0x024c:
            r1.A00 = r0
            java.lang.String r0 = r4.A0S
            r41 = 1
            if (r8 != 0) goto L_0x0258
            r43 = 0
            if (r81 == 0) goto L_0x025a
        L_0x0258:
            r43 = 1
        L_0x025a:
            r42 = 0
            r34 = r54
            r32 = r2
            r33 = r1
            r35 = r0
            r36 = r5
            r37 = r6
            int r8 = r32.A01(r33, r34, r35, r36, r37, r39, r40, r41, r42, r43)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0144
            X.5ZU r0 = r2.A0H
            r0.A0b(r3)
            goto L_0x0144
        L_0x0277:
            if (r13 == 0) goto L_0x027e
            r0 = 2
        L_0x027a:
            if (r81 != 0) goto L_0x024c
            r0 = 0
            goto L_0x024c
        L_0x027e:
            r0 = 1
            goto L_0x027a
        L_0x0280:
            X.31A r0 = X.C56982ss.A00(r12, r3)
            if (r0 != 0) goto L_0x02e7
            r5 = r7
        L_0x0287:
            X.2YH r1 = r2.A0x
            long r24 = X.C56612sH.A07(r2)
            r43 = r59
            r20 = r1
            r21 = r3
            r22 = r5
            r23 = r43
            X.1mI r6 = r20.A00(r21, r22, r23, r24)
            if (r6 == 0) goto L_0x02a4
            X.3Oz r5 = r2.A0k
            r1 = 8
            r5.BEz(r6, r1)
        L_0x02a4:
            if (r9 == 0) goto L_0x02c6
            X.3Oz r5 = r2.A0k
            X.2sd r6 = r2.A17
            r1 = 3019(0xbcb, float:4.23E-42)
            r24 = 151(0x97, float:2.12E-43)
            if (r86 == 0) goto L_0x02b2
            r24 = 150(0x96, float:2.1E-43)
        L_0x02b2:
            r23 = r7
            r20 = r6
            r21 = r7
            r22 = r3
            r25 = r27
            X.1p1 r6 = r20.A06(r21, r22, r23, r24, r25)
            r6.A1J(r7)
            r5.BEz(r6, r1)
        L_0x02c6:
            X.2qJ r5 = r2.A0V
            boolean r1 = android.text.TextUtils.isEmpty(r52)
            if (r1 == 0) goto L_0x02dc
            java.lang.String r1 = r0.A07()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02dc
            java.lang.String r44 = r0.A07()
        L_0x02dc:
            r41 = r5
            r42 = r3
            r46 = r27
            r41.A02(r42, r43, r44, r45, r46)
            goto L_0x0128
        L_0x02e7:
            X.2fO r5 = r0.A0e
            goto L_0x0287
        L_0x02ea:
            r17 = 0
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66493Lq.A0I(X.334, X.1fJ, X.1fJ, com.whatsapp.jid.UserJid, X.2zN, X.2fO, java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, int, int, int, int, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean A0f(AnonymousClass3ZH r25, UserJid userJid, C60912zN r27, String str, String str2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C60912zN r0;
        boolean A0Y2 = this.A18.A00.A0Y(C58422vE.A02, 3695);
        AnonymousClass3ZH r11 = r25;
        String str3 = str;
        boolean z12 = z;
        boolean z13 = z2;
        boolean z14 = z3;
        boolean z15 = z4;
        boolean z16 = z5;
        boolean z17 = z6;
        boolean z18 = z7;
        boolean z19 = z8;
        boolean z20 = z9;
        boolean z21 = z10;
        boolean z22 = z11;
        UserJid userJid2 = userJid;
        C60912zN r14 = r27;
        String str4 = str2;
        int i2 = i;
        if (TextUtils.equals(r11.A0J(), str3) && TextUtils.equals(r11.A0V, Long.toString(j))) {
            String str5 = r11.A0K.A03;
            String str6 = r14.A03;
            if (TextUtils.equals(str5, str6) && ((r0 = r11.A0K) != null ? !(!TextUtils.equals(r0.A04, r14.A04)) : r14.A04 == null && r14.A00 == 0 && r14.A02 == null && str6 == null) && r11.A0j == z12 && r11.A14 == z13 && r11.A0e == z14 && r11.A12 == z15 && AnonymousClass75J.A00(r11.A0I, userJid2) && r11.A0s == z16 && r11.A0k == z17 && r11.A13 == z18 && ((!A0Y2 || r11.A0q == z19) && TextUtils.equals(r11.A0M, str4) && r11.A04 == i2 && r11.A0d == z20 && r11.A0i == z21 && r11.A0f == z22)) {
                return false;
            }
        }
        r11.A0P = str3;
        r11.A0V = Long.toString(j);
        r11.A0O(r14);
        r11.A0j = z12;
        r11.A14 = z13;
        r11.A0e = z14;
        r11.A12 = z15;
        r11.A0I = userJid2;
        r11.A0s = z16;
        r11.A0k = z17;
        r11.A0M = str4;
        r11.A13 = z18;
        r11.A04 = i2;
        if (A0Y2) {
            r11.A0q = z19;
        }
        r11.A0d = z20;
        r11.A0i = z21;
        r11.A0f = z22;
        return true;
    }
}
