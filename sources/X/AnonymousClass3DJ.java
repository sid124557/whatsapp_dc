package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DJ  reason: invalid class name */
public final class AnonymousClass3DJ implements AnonymousClass66U {
    public final C49712gy A00;
    public final C56942so A01;
    public final C64773Ex A02;
    public final AnonymousClass33p A03;
    public final C56982ss A04;
    public final C56892sj A05;
    public final AnonymousClass1VX A06;

    public final void A00(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if (this.A06.A0Y(C58422vE.A02, 6601)) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : iterable) {
                C95814uZ r2 = (C95814uZ) next;
                if ((r2 instanceof GroupJid) && this.A04.A06((GroupJid) r2) == 1) {
                    AnonymousClass3ZH A09 = this.A02.A09(r2);
                    if (A09 == null || !A09.A0d) {
                        A0s.add(next);
                    }
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                this.A00.A02(new AnonymousClass47K(AnonymousClass0x7.A0S(it).getRawString()));
            }
        }
    }

    public void BMe() {
        AnonymousClass33p r5 = this.A03;
        int i = AnonymousClass0x2.A0F(r5).getInt("member_suggested_groups_sync_version", 0);
        int A0O = this.A06.A0O(C58422vE.A02, 6600);
        if (i >= A0O) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MemberSuggestedGroupsSyncManager/at required version: ");
            A0o.append(i);
            C18260x0.A0y(" vs ", A0o, A0O);
            return;
        }
        Log.i("MemberSuggestedGroupsSyncManager/starting jobs to resync member suggested groups for all eligible communities.");
        C18260x0.A0L(r5, "member_suggested_groups_sync_version", A0O);
        List A022 = this.A01.A02();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A022) {
            C95814uZ r1 = (C95814uZ) next;
            if ((r1 instanceof GroupJid) && this.A05.A0D((GroupJid) r1)) {
                A0s.add(next);
            }
        }
        A00(A0s);
    }

    public AnonymousClass3DJ(C49712gy r1, C56942so r2, C64773Ex r3, AnonymousClass33p r4, C56982ss r5, C56892sj r6, AnonymousClass1VX r7) {
        C18260x0.A0f(r7, r5, r3, r4, r2);
        C18260x0.A0U(r6, r1);
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
    }

    public String BDW() {
        return "MemberSuggestedGroupsSyncManager";
    }

    public /* synthetic */ void BMd() {
    }
}
