package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2o7  reason: invalid class name and case insensitive filesystem */
public class C54062o7 {
    public final C56972sr A00;
    public final AnonymousClass36E A01;
    public final C64773Ex A02;
    public final C56422rx A03;
    public final C56612sH A04;
    public final C621133n A05;
    public final C48972fm A06;
    public final C56892sj A07;
    public final C72303dV A08;
    public final C620533h A09;
    public final C620233e A0A;
    public final AnonymousClass318 A0B;
    public final AnonymousClass4FS A0C;

    public final Set A01(ArrayList arrayList, List list, List list2, int i) {
        HashSet hashSet;
        AnonymousClass3ZH A072;
        if (i == 2 || i == 0) {
            HashSet A0K = AnonymousClass002.A0K();
            if (i != 0) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it);
                    if (AnonymousClass32Y.A03(A0P) != null) {
                        A0K.add(A0P);
                    } else if (!(AnonymousClass32V.A01(A0P) == null || (A072 = this.A02.A07(A0P)) == null)) {
                        A0K.addAll(A00(A072));
                    }
                }
            }
            ArrayList A0s = AnonymousClass001.A0s();
            this.A02.A0b(A0s);
            hashSet = new HashSet(A0s.size(), 1.0f);
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it2);
                UserJid A073 = AnonymousClass3ZH.A07(A0R);
                if (A073 != null && !A0K.contains(A073) && !this.A03.A03(A073)) {
                    hashSet.add(A073);
                    arrayList.add(A0R);
                }
            }
        } else if (i == 1) {
            hashSet = AnonymousClass002.A0K();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C95814uZ A0P2 = C18300x5.A0P(it3);
                UserJid A032 = AnonymousClass32Y.A03(A0P2);
                C64773Ex r4 = this.A02;
                AnonymousClass3ZH A074 = r4.A07(A0P2);
                if (A032 != null) {
                    if (A074 != null) {
                        if (A074.A0F != null && !this.A03.A03(A032)) {
                            hashSet.add(A032);
                            arrayList.add(A074);
                        }
                    }
                } else if (A074 == null) {
                }
                if (A074.A0U()) {
                    Iterator it4 = A00(A074).iterator();
                    while (it4.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it4);
                        AnonymousClass3ZH A075 = r4.A07(A0T);
                        if (!(A075 == null || A075.A0F == null || this.A03.A03(A0T))) {
                            hashSet.add(A0T);
                            arrayList.add(A075);
                        }
                    }
                }
            }
        } else {
            throw AnonymousClass001.A0e("unknown status distribution mode");
        }
        return hashSet;
    }

    public void A02(C624134x r21, boolean z) {
        Object obj;
        C69833Yo Axl;
        int i;
        List list;
        List list2;
        int size;
        C108845de r0;
        C624134x r7 = r21;
        if (r21 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass2z0 A082 = C624134x.A08(r7, "status-participant-user-manager/updateParticipantsTableForNewStatus/", A0o);
            C18260x0.A0o(A082, A0o);
            obj = A082.A00;
        } else {
            Log.i("status-participant-user-manager/updateParticipantsTableForNewStatus");
            obj = C135166kE.A00;
        }
        C626936e.A0B(obj instanceof C135166kE);
        C85284Fq A042 = this.A08.A04();
        try {
            Axl = A042.Axl();
            if (!z || r21 == null || (r0 = r7.A0O) == null) {
                C620233e r02 = this.A0A;
                i = r02.A02();
                list = r02.A07();
                list2 = r02.A08();
            } else {
                C626936e.A06(r0);
                i = r0.A00;
                list = r0.A01;
                list2 = r0.A02;
            }
            C620533h r8 = this.A09;
            C135166kE r11 = C135166kE.A00;
            Set A0A2 = r8.A0A(r11);
            ArrayList A0s = AnonymousClass001.A0s();
            Set A012 = A01(A0s, list, list2, i);
            C56612sH r13 = this.A04;
            long A0H = r13.A0H() + 86400000;
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                if (A0R.A0B < A0H) {
                    A0R.A0B = r13.A0H() + 604800000;
                    A0s2.add(A0R);
                }
            }
            this.A02.A0e(A0s2);
            HashSet A15 = AnonymousClass0x9.A15(A0A2);
            A15.removeAll(A012);
            HashSet A152 = AnonymousClass0x9.A15(A012);
            A152.removeAll(A0A2);
            C56972sr r15 = this.A00;
            PhoneUserJid A052 = C56972sr.A05(r15);
            A15.remove(A052);
            A152.add(A052);
            C18260x0.A1P(AnonymousClass001.A0o(), "status-participant-user-manager/updateParticipantsTableForNewStatus/removedJids/", A15);
            C626936e.A06(obj);
            C28011fL r9 = (C28011fL) obj;
            HashSet A0r = C18310x6.A0r(A152);
            if (!A152.isEmpty()) {
                Iterator it2 = A152.iterator();
                while (it2.hasNext()) {
                    UserJid A0T = C18310x6.A0T(it2);
                    Set A0D = this.A0B.A0D(A0T);
                    C626936e.A0C(C18310x6.A1X(A0D));
                    HashSet hashSet = new HashSet(A0D.size());
                    Iterator it3 = A0D.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(new C52162kz(AnonymousClass0x7.A0R(it3), false, false));
                    }
                    C60842zG r03 = new C60842zG(A0T, hashSet, C18310x6.A02(r15.A0a(A0T) ? 1 : 0), false);
                    r8.A0E(r03, r9);
                    A0r.add(r03);
                }
            }
            if (!A15.isEmpty()) {
                r8.A0J(r9, AnonymousClass002.A0J(A15));
            }
            C18260x0.A1P(AnonymousClass001.A0o(), "status-participant-user-manager/updateStatusParticipants/added/", A0r);
            C18260x0.A1P(AnonymousClass001.A0o(), "status-participant-user-manager/updateStatusParticipants/removed/", A15);
            C620833k A072 = r8.A07(r11);
            A072.A0K(A0r);
            A072.A0L(UserJid.userJidsFromChatJids(A15));
            if (!A15.isEmpty()) {
                if (this.A05.A0X()) {
                    C70343aL.A01(this.A0C, this, r11, A072, 11);
                } else {
                    this.A06.A00.submit(new C70343aL(this, r11, A072, 12));
                }
            }
            if (r21 != null) {
                r7.A14 = C620833k.A00(UserJid.userJidsFromChatJids(r8.A0A(r9)));
                if (A012.contains(A052)) {
                    size = A012.size() - 1;
                } else {
                    size = A012.size();
                }
                r7.A0B = size;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A19("msgstore/addmsg/status/ added:", A0o2, A152);
            C18260x0.A19(" removed:", A0o2, A15);
            A0o2.append(" current:");
            C18260x0.A1F(A0o2, A012.size());
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

    public C54062o7(C56972sr r1, AnonymousClass36E r2, C64773Ex r3, C56422rx r4, C56612sH r5, C621133n r6, C48972fm r7, C56892sj r8, C72303dV r9, C620533h r10, C620233e r11, AnonymousClass318 r12, AnonymousClass4FS r13) {
        this.A04 = r5;
        this.A00 = r1;
        this.A0C = r13;
        this.A0A = r11;
        this.A06 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A0B = r12;
        this.A03 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
    }

    public final Set A00(AnonymousClass3ZH r5) {
        C28011fL r1;
        HashSet A0K = AnonymousClass002.A0K();
        C95814uZ r12 = r5.A0H;
        if ((r12 instanceof C28011fL) && (r1 = (C28011fL) r12) != null) {
            C172878Nf A012 = C620533h.A01(this.A07.A09, r1);
            while (A012.hasNext()) {
                C60842zG A0G = C18320x8.A0G(A012);
                C56972sr r0 = this.A00;
                UserJid userJid = A0G.A03;
                if (!r0.A0a(userJid)) {
                    A0K.add(userJid);
                }
            }
        }
        return A0K;
    }
}
