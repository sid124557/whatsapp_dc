package X;

import android.content.ContentValues;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2sj  reason: invalid class name and case insensitive filesystem */
public class C56892sj {
    public final C55682qk A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final C56982ss A04;
    public final C54302oV A05;
    public final C46412ba A06;
    public final C72303dV A07;
    public final C51562k1 A08;
    public final C620533h A09;
    public final C61152zn A0A;
    public final C56662sM A0B;
    public final AnonymousClass318 A0C;
    public final AnonymousClass1VX A0D;
    public final C54932pW A0E;
    public final C29241iV A0F;
    public final C56062rM A0G;
    public final AnonymousClass4BY A0H;
    public final AnonymousClass4FS A0I;

    public static int A00(C56892sj r0, C28011fL r1) {
        return r0.A09.A07(r1).A09.size();
    }

    public static C620833k A01(C56892sj r0, C28011fL r1) {
        return r0.A09.A07(r1);
    }

    public int A02(C27991fJ r5) {
        int A062 = this.A04.A06(r5);
        AnonymousClass1VX r2 = this.A0D;
        int i = 1304;
        if (A062 == 3) {
            i = 2774;
        }
        return r2.A0O(C58422vE.A02, i);
    }

    public AnonymousClass08M A03(C95814uZ r6, GroupJid groupJid) {
        String str;
        AnonymousClass33D r0;
        C95814uZ BLb = this.A0H.BLb(r6);
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        if (groupJid == null) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat groupJid null";
        } else if (!(BLb instanceof C27981fH)) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat chatJid not LID";
        } else if (this.A0D.A0Y(C58422vE.A02, 3876)) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat force create LID chat";
        } else if (!A0B(groupJid)) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat chatJid not a LID group";
        } else {
            this.A01.A0G(0, R.string.f11nameremoved);
            this.A0I.BkP(new C70343aL(this, BLb, A012, 7));
            return A012;
        }
        Log.i(str);
        if (BLb == null) {
            r0 = AnonymousClass33D.A01;
        } else {
            r0 = new AnonymousClass33D(BLb);
        }
        A012.A0H(r0);
        return A012;
    }

    public Set A04(C95814uZ r3) {
        if (!(r3 instanceof C28011fL)) {
            return AnonymousClass002.A0K();
        }
        C620833k A012 = A01(this, (C28011fL) r3);
        if (A012.A00 != 0) {
            return A012.A0E();
        }
        return A012.A0F();
    }

    public void A05(C620833k r5) {
        C69833Yo Axl;
        C85284Fq A042 = this.A07.A04();
        try {
            Axl = A042.Axl();
            this.A09.A0F(r5);
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

    public void A06(C620833k r26, long j) {
        C69833Yo Axl;
        C129526aS r0;
        C85284Fq A042 = this.A07.A04();
        try {
            C69833Yo Axl2 = A042.Axl();
            try {
                C620533h r11 = this.A09;
                C620833k r6 = r26;
                boolean A1S = AnonymousClass000.A1S(r6.A00);
                C623334p r02 = r11.A09;
                C28011fL r8 = r6.A05;
                long A052 = r02.A05(r8);
                C85284Fq A022 = C620533h.A02(r11);
                try {
                    Axl = A022.Axl();
                    C56862sg r7 = ((AnonymousClass3H0) A022).A03;
                    r7.A07("group_participant_user", "group_jid_row_id=?", "saveGroupParticipants/DELETE_GROUP_PARTICIPANT_USER", C18260x0.A1b(A052));
                    if (A1S) {
                        r0 = C129526aS.copyOf(r6.A08.values());
                    } else {
                        r0 = r6.A04();
                    }
                    C172878Nf it = r0.iterator();
                    while (it.hasNext()) {
                        C60842zG A0G2 = C18320x8.A0G(it);
                        UserJid userJid = A0G2.A03;
                        long A053 = r11.A05(userJid);
                        ContentValues A062 = C18300x5.A06();
                        C18270x1.A0c(A062, "group_jid_row_id", A052);
                        C18270x1.A0c(A062, "user_jid_row_id", A053);
                        C18270x1.A0b(A062, "rank", A0G2.A01);
                        C18270x1.A0b(A062, "pending", AnonymousClass000.A1S(A0G2.A02 ? 1 : 0) ? 1 : 0);
                        r7.A08("group_participant_user", "saveGroupParticipants/INSERT_GROUP_PARTICIPANT_USER", A062);
                        r11.A0B.A00(C129526aS.copyOf(A0G2.A04.values()), r8, userJid, A053);
                    }
                    Axl.A00();
                    Axl.close();
                    A022.close();
                    if (r8 instanceof C27991fJ) {
                        this.A05.A01((C27991fJ) r8, j);
                    }
                    Axl2.A00();
                    Axl2.close();
                    A042.close();
                    return;
                } catch (Throwable th) {
                    A022.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                Axl2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A042.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public void A07(C28011fL r8, Long l, List list) {
        C69833Yo Axl;
        C85284Fq A042 = this.A07.A04();
        try {
            C69833Yo Axl2 = A042.Axl();
            try {
                C620533h r4 = this.A09;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("participant-user-store/updateGroupParticipants/");
                A0o.append(r8);
                C18260x0.A1R(A0o, " ", list);
                C85284Fq A022 = C620533h.A02(r4);
                try {
                    Axl = A022.Axl();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r4.A0E(C18320x8.A0G(it), r8);
                    }
                    Axl.A00();
                    Axl.close();
                    A022.close();
                    if (l != null && (r8 instanceof C27991fJ)) {
                        this.A05.A01((C27991fJ) r8, l.longValue());
                    }
                    Axl2.A00();
                    Axl2.close();
                    A042.close();
                    return;
                } catch (Throwable th) {
                    A022.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                Axl2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A042.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public void A08(C28011fL r6, Collection collection) {
        C69833Yo Axl;
        C85284Fq A042 = this.A07.A04();
        try {
            Axl = A042.Axl();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.A09.A0O(r6, C18310x6.A0T(it));
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

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0293, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0141, code lost:
        r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C30341mI r20) {
        /*
            r19 = this;
            r8 = r20
            X.2z0 r1 = r8.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x02eb
            X.4uZ r1 = r1.A00
            boolean r0 = r1 instanceof X.C28011fL
            if (r0 == 0) goto L_0x02eb
            X.1fL r5 = X.C57382tY.A00(r1)
            r4 = r19
            X.3dV r0 = r4.A07
            X.4Fq r12 = r0.A04()
            X.3Yo r11 = r12.Axl()     // Catch:{ all -> 0x02e1 }
            boolean r1 = r8 instanceof X.C31891p1     // Catch:{ all -> 0x02d7 }
            if (r1 == 0) goto L_0x002c
            r0 = r8
            X.1p1 r0 = (X.C31891p1) r0     // Catch:{ all -> 0x02d7 }
            java.util.List r7 = r0.A01     // Catch:{ all -> 0x02d7 }
        L_0x0027:
            boolean r3 = r5 instanceof X.C27991fJ     // Catch:{ all -> 0x02d7 }
            if (r3 == 0) goto L_0x004d
            goto L_0x002e
        L_0x002c:
            r7 = 0
            goto L_0x0027
        L_0x002e:
            if (r1 != 0) goto L_0x003a
            boolean r0 = r8 instanceof X.C31341o8     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x004d
            r0 = r8
            X.1o8 r0 = (X.C31341o8) r0     // Catch:{ all -> 0x02d7 }
            long r0 = r0.A02     // Catch:{ all -> 0x02d7 }
            goto L_0x003f
        L_0x003a:
            r0 = r8
            X.1p1 r0 = (X.C31891p1) r0     // Catch:{ all -> 0x02d7 }
            long r0 = r0.A03     // Catch:{ all -> 0x02d7 }
        L_0x003f:
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x004d
            X.2oV r6 = r4.A05     // Catch:{ all -> 0x02d7 }
            r2 = r5
            X.1fJ r2 = (X.C27991fJ) r2     // Catch:{ all -> 0x02d7 }
            r6.A01(r2, r0)     // Catch:{ all -> 0x02d7 }
        L_0x004d:
            int r2 = r8.A00     // Catch:{ all -> 0x02d7 }
            r0 = 2
            if (r2 == r0) goto L_0x0264
            r0 = 3
            if (r2 == r0) goto L_0x0264
            r0 = 4
            if (r2 == r0) goto L_0x0237
            r0 = 5
            if (r2 == r0) goto L_0x0201
            r0 = 7
            if (r2 == r0) goto L_0x0201
            r0 = 20
            if (r2 == r0) goto L_0x0199
            r0 = 52
            if (r2 == r0) goto L_0x0199
            r0 = 79
            if (r2 == r0) goto L_0x0199
            r0 = 90
            if (r2 == r0) goto L_0x0199
            r0 = 106(0x6a, float:1.49E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 144(0x90, float:2.02E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 149(0x95, float:2.09E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 9
            if (r2 == r0) goto L_0x026a
            r0 = 10
            if (r2 == r0) goto L_0x0159
            r0 = 93
            if (r2 == r0) goto L_0x0199
            r0 = 94
            if (r2 == r0) goto L_0x0199
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 124(0x7c, float:1.74E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x0199
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x0199
            switch(r2) {
                case 12: goto L_0x0199;
                case 13: goto L_0x009f;
                case 14: goto L_0x009f;
                case 15: goto L_0x0264;
                case 16: goto L_0x0264;
                case 17: goto L_0x00e7;
                default: goto L_0x009d;
            }     // Catch:{ all -> 0x02d7 }
        L_0x009d:
            goto L_0x0296
        L_0x009f:
            X.33h r1 = r4.A09     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r7)     // Catch:{ all -> 0x02d7 }
            r1.A0J(r5, r0)     // Catch:{ all -> 0x02d7 }
            r4.A09(r5, r7)     // Catch:{ all -> 0x02d7 }
            X.2zn r9 = r4.A0A     // Catch:{ all -> 0x02d7 }
            X.1VX r6 = r9.A02     // Catch:{ all -> 0x02d7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02d7 }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            r0 = 13
            boolean r18 = X.AnonymousClass000.A1U(r2, r0)
            long r0 = r8.A0K     // Catch:{ all -> 0x02d7 }
            X.3dV r6 = r9.A01     // Catch:{ all -> 0x02d7 }
            X.4Fq r10 = r6.A04()     // Catch:{ all -> 0x02d7 }
            X.3Yo r8 = r10.Axl()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0149 }
        L_0x00d5:
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x0149 }
            if (r6 == 0) goto L_0x0141
            com.whatsapp.jid.UserJid r15 = X.C18310x6.A0T(r7)     // Catch:{ all -> 0x0149 }
            r13 = r9
            r14 = r5
            r16 = r0
            r13.A04(r14, r15, r16, r18)     // Catch:{ all -> 0x0149 }
            goto L_0x00d5
        L_0x00e7:
            X.33h r6 = r4.A09     // Catch:{ all -> 0x02d7 }
            X.34p r0 = r6.A09     // Catch:{ all -> 0x02d7 }
            java.lang.String r7 = X.C623334p.A04(r0, r5)     // Catch:{ all -> 0x02d7 }
            android.content.ContentValues r14 = X.C18290x4.A0E()     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "group_jid_row_id"
            r14.put(r0, r7)     // Catch:{ all -> 0x02d7 }
            r9 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "rank"
            r14.put(r0, r1)     // Catch:{ all -> 0x02d7 }
            java.lang.String r0 = "pending"
            r14.put(r0, r1)     // Catch:{ all -> 0x02d7 }
            X.4Fq r10 = X.C620533h.A02(r6)     // Catch:{ all -> 0x02d7 }
            X.3Yo r8 = r10.Axl()     // Catch:{ all -> 0x0153 }
            X.2sr r1 = r6.A01     // Catch:{ all -> 0x0149 }
            X.1fH r0 = r1.A0H()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0120
            X.1fH r0 = r1.A0H()     // Catch:{ all -> 0x0149 }
            r6.A0O(r5, r0)     // Catch:{ all -> 0x0149 }
        L_0x0120:
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)     // Catch:{ all -> 0x0149 }
            r6.A0O(r5, r0)     // Catch:{ all -> 0x0149 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0149 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0149 }
            java.lang.String r15 = "group_participant_user"
            java.lang.String r16 = "group_jid_row_id = ?"
            java.lang.String[] r18 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0149 }
            r18[r9] = r7     // Catch:{ all -> 0x0149 }
            java.lang.String r17 = "onGroupEnded/UPDATE_GROUP_PARTICIPANT_USER"
            r13.A05(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0149 }
            X.2pG r0 = r6.A0B     // Catch:{ all -> 0x0149 }
            r0.A02(r5)     // Catch:{ all -> 0x0149 }
        L_0x0141:
            r8.A00()     // Catch:{ all -> 0x0149 }
            r8.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0293
        L_0x0149:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x014e }
            goto L_0x0152
        L_0x014e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0153 }
        L_0x0152:
            throw r1     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01fc }
            goto L_0x0200
        L_0x0159:
            X.1o8 r8 = (X.C31341o8) r8     // Catch:{ all -> 0x02d7 }
            X.33h r9 = r4.A09     // Catch:{ all -> 0x02d7 }
            com.whatsapp.jid.UserJid r1 = r8.A00     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x02d7 }
            com.whatsapp.jid.UserJid r7 = r8.A01     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            X.33k r0 = r9.A07(r5)     // Catch:{ all -> 0x02d7 }
            X.2zG r1 = r0.A05(r1)     // Catch:{ all -> 0x02d7 }
            X.4Fq r6 = X.C620533h.A02(r9)     // Catch:{ all -> 0x02d7 }
            X.3Yo r0 = r6.Axl()     // Catch:{ all -> 0x0194 }
            r9.A0O(r5, r7)     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x017f
            r9.A0E(r1, r5)     // Catch:{ all -> 0x018a }
        L_0x017f:
            r0.A00()     // Catch:{ all -> 0x018a }
            r0.close()     // Catch:{ all -> 0x0194 }
            r6.close()     // Catch:{ all -> 0x02d7 }
            goto L_0x0296
        L_0x018a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0194 }
        L_0x0193:
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01fc }
            goto L_0x0200
        L_0x0199:
            X.33h r0 = r4.A09     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            r0.A0I(r5, r7)     // Catch:{ all -> 0x02d7 }
            X.2zn r9 = r4.A0A     // Catch:{ all -> 0x02d7 }
            X.1VX r6 = r9.A02     // Catch:{ all -> 0x02d7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02d7 }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            X.3dV r0 = r9.A01     // Catch:{ all -> 0x02d7 }
            X.4Fq r8 = r0.A04()     // Catch:{ all -> 0x02d7 }
            X.3Yo r6 = r8.Axl()     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x01ed }
        L_0x01c0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x01ce
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)     // Catch:{ all -> 0x01ed }
            r9.A03(r5, r0)     // Catch:{ all -> 0x01ed }
            goto L_0x01c0
        L_0x01ce:
            r6.A00()     // Catch:{ all -> 0x01ed }
            r6.close()     // Catch:{ all -> 0x01f7 }
            r8.close()     // Catch:{ all -> 0x02d7 }
            X.2sr r6 = r4.A02     // Catch:{ all -> 0x02d7 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x02d7 }
            r1 = 1
            X.4KD r0 = new X.4KD     // Catch:{ all -> 0x02d7 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x02d7 }
            boolean r0 = X.AnonymousClass367.A02(r0, r7)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            r9.A02(r5)     // Catch:{ all -> 0x02d7 }
            goto L_0x0296
        L_0x01ed:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01f2 }
            goto L_0x01f6
        L_0x01f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01f7 }
        L_0x01f6:
            throw r1     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01fc }
            goto L_0x0200
        L_0x01fc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02d7 }
        L_0x0200:
            throw r1     // Catch:{ all -> 0x02d7 }
        L_0x0201:
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A07(r8)     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r15)     // Catch:{ all -> 0x02d7 }
            X.33h r1 = r4.A09     // Catch:{ all -> 0x02d7 }
            java.util.List r0 = java.util.Collections.singletonList(r15)     // Catch:{ all -> 0x02d7 }
            r1.A0J(r5, r0)     // Catch:{ all -> 0x02d7 }
            java.util.List r0 = java.util.Collections.singletonList(r15)     // Catch:{ all -> 0x02d7 }
            r4.A09(r5, r0)     // Catch:{ all -> 0x02d7 }
            X.2zn r7 = r4.A0A     // Catch:{ all -> 0x02d7 }
            X.1VX r6 = r7.A02     // Catch:{ all -> 0x02d7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02d7 }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            r0 = 5
            r18 = 1
            if (r2 == r0) goto L_0x022d
            r18 = 0
        L_0x022d:
            long r0 = r8.A0K     // Catch:{ all -> 0x02d7 }
            r13 = r7
            r14 = r5
            r16 = r0
            r13.A04(r14, r15, r16, r18)     // Catch:{ all -> 0x02d7 }
            goto L_0x0296
        L_0x0237:
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A07(r8)     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r8)     // Catch:{ all -> 0x02d7 }
            X.33h r1 = r4.A09     // Catch:{ all -> 0x02d7 }
            java.util.List r0 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x02d7 }
            r1.A0I(r5, r0)     // Catch:{ all -> 0x02d7 }
            X.2zn r7 = r4.A0A     // Catch:{ all -> 0x02d7 }
            X.1VX r6 = r7.A02     // Catch:{ all -> 0x02d7 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02d7 }
            boolean r0 = r6.A0Y(r0, r1)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            r7.A03(r5, r8)     // Catch:{ all -> 0x02d7 }
            X.2sr r0 = r4.A02     // Catch:{ all -> 0x02d7 }
            boolean r0 = r0.A0a(r8)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x0296
            r7.A02(r5)     // Catch:{ all -> 0x02d7 }
            goto L_0x0296
        L_0x0264:
            X.33h r0 = r4.A09     // Catch:{ all -> 0x02d7 }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            goto L_0x0288
        L_0x026a:
            boolean r0 = r4.A0B(r5)     // Catch:{ all -> 0x02d7 }
            if (r0 == 0) goto L_0x028c
            X.2sr r0 = r4.A02     // Catch:{ all -> 0x02d7 }
            X.1fH r1 = r0.A0I()     // Catch:{ all -> 0x02d7 }
        L_0x0276:
            X.C626936e.A06(r7)     // Catch:{ all -> 0x02d7 }
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x02d7 }
            if (r0 != 0) goto L_0x0286
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r7)     // Catch:{ all -> 0x02d7 }
            r7.add(r1)     // Catch:{ all -> 0x02d7 }
        L_0x0286:
            X.33h r0 = r4.A09     // Catch:{ all -> 0x02d7 }
        L_0x0288:
            r0.A0I(r5, r7)     // Catch:{ all -> 0x02d7 }
            goto L_0x0296
        L_0x028c:
            X.2sr r0 = r4.A02     // Catch:{ all -> 0x02d7 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r0)     // Catch:{ all -> 0x02d7 }
            goto L_0x0276
        L_0x0293:
            r10.close()     // Catch:{ all -> 0x02d7 }
        L_0x0296:
            r11.A00()     // Catch:{ all -> 0x02d7 }
            r11.close()     // Catch:{ all -> 0x02e1 }
            r12.close()
            if (r3 == 0) goto L_0x02eb
            r0 = 4
            if (r2 == r0) goto L_0x02ca
            r0 = 12
            if (r2 == r0) goto L_0x02ca
            r0 = 52
            if (r2 == r0) goto L_0x02ca
            r0 = 20
            if (r2 == r0) goto L_0x02ca
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x02ca
            r0 = 7
            if (r2 == r0) goto L_0x02ca
            r0 = 14
            if (r2 == r0) goto L_0x02ca
            r0 = 5
            if (r2 == r0) goto L_0x02ca
            r0 = 13
            if (r2 == r0) goto L_0x02ca
            r0 = 93
            if (r2 == r0) goto L_0x02ca
            r0 = 94
            if (r2 != r0) goto L_0x02eb
        L_0x02ca:
            X.3Wi r2 = r4.A01
            r1 = 38
            X.3Zw r0 = new X.3Zw
            r0.<init>(r4, r1, r5)
            r2.A0S(r0)
            return
        L_0x02d7:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x02dc }
            goto L_0x02e0
        L_0x02dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e1 }
        L_0x02e0:
            throw r1     // Catch:{ all -> 0x02e1 }
        L_0x02e1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x02e6 }
            throw r1
        L_0x02e6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56892sj.A0A(X.1mI):void");
    }

    public boolean A0B(C95814uZ r4) {
        if (!(r4 instanceof C28011fL) || 3 != A01(this, (C28011fL) r4).A00) {
            return false;
        }
        return true;
    }

    public boolean A0F(C28011fL r4) {
        C172878Nf A012 = C620533h.A01(this.A09, r4);
        while (A012.hasNext()) {
            AnonymousClass3ZH A072 = this.A03.A07(C18320x8.A0G(A012).A03);
            if (A072 != null && A072.A0R()) {
                return true;
            }
        }
        return false;
    }

    public C56892sj(C55682qk r2, C69263Wi r3, C56972sr r4, C64773Ex r5, C56982ss r6, C54302oV r7, C46412ba r8, C72303dV r9, C51562k1 r10, C620533h r11, C61152zn r12, C56662sM r13, AnonymousClass318 r14, AnonymousClass1VX r15, C54932pW r16, C29241iV r17, C56062rM r18, AnonymousClass4BY r19, AnonymousClass4FS r20) {
        this.A0D = r15;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A0I = r20;
        this.A04 = r6;
        this.A0E = r16;
        this.A0G = r18;
        this.A03 = r5;
        this.A0B = r13;
        this.A0H = r19;
        this.A0C = r14;
        this.A07 = r9;
        this.A09 = r11;
        this.A06 = r8;
        this.A0A = r12;
        this.A0F = r17;
        this.A08 = r10;
        this.A05 = r7;
    }

    public final void A09(C28011fL r5, List list) {
        C52882mC A002;
        C27991fJ A012 = AnonymousClass34R.A01(r5);
        if (A012 != null) {
            C56062rM r1 = this.A0G;
            r1.A04();
            C27991fJ r2 = (C27991fJ) r1.A03.get(A012);
            if (r2 != null && (A002 = r1.A00(r2)) != null && A012.equals(A002.A02)) {
                C18260x0.A1P(AnonymousClass001.A0o(), "GroupParticipantsManager/removing participant from community: ", r2);
                this.A08.A02(r2, list);
            }
        }
    }

    public boolean A0C(GroupJid groupJid) {
        return A01(this, groupJid).A0O(this.A02);
    }

    public boolean A0D(GroupJid groupJid) {
        return A01(this, groupJid).A0P(this.A02);
    }

    public boolean A0E(GroupJid groupJid, UserJid userJid) {
        C620833k A012 = A01(this, groupJid);
        if (A012.A0Q(userJid)) {
            return true;
        }
        if (!(userJid instanceof PhoneUserJid) || A012.A00 == 0) {
            return false;
        }
        return A012.A0Q(this.A0B.A01((PhoneUserJid) userJid));
    }

    public boolean A0G(C27991fJ r4) {
        AnonymousClass3ZH A072;
        Iterator it = A01(this, r4).A0D().iterator();
        while (it.hasNext()) {
            C60842zG A0G2 = C18320x8.A0G(it);
            C56972sr r0 = this.A02;
            UserJid userJid = A0G2.A03;
            if (!r0.A0a(userJid) && (A072 = this.A03.A07(userJid)) != null && A072.A0F != null) {
                return true;
            }
        }
        return false;
    }

    public boolean A0H(C27991fJ r5) {
        C60842zG r0;
        C620833k A012 = A01(this, r5);
        PhoneUserJid A042 = C56972sr.A04(this.A02);
        if (A042 == null || (r0 = (C60842zG) A012.A09.get(A042)) == null || r0.A01 != 2) {
            return false;
        }
        return true;
    }

    public boolean A0I(C27991fJ r3, UserJid userJid) {
        C60842zG A052 = A01(this, r3).A05(userJid);
        if (A052 == null || A052.A01 == 0) {
            return false;
        }
        return true;
    }
}
