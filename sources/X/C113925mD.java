package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5mD  reason: invalid class name and case insensitive filesystem */
public final class C113925mD implements AnonymousClass4FW, C1227865s {
    public final C29151iM A00;
    public final C104745Se A01;
    public final LinkedHashMap A02 = C18320x8.A0r();

    public void BWS(C624134x r4, int i) {
        C162457s7.A0J(r4, 0);
        if (this.A01.A00() && AnonymousClass36X.A07(r4)) {
            C106245Ye.A01(C624134x.A0C(r4, "XFamilyRecentStatusManager/onMessageAdded crosspostable message ", AnonymousClass001.A0o()));
            LinkedHashMap linkedHashMap = this.A02;
            Collection values = linkedHashMap.values();
            C162457s7.A0D(values);
            if (AnonymousClass36X.A08(values)) {
                C106245Ye.A01("XFamilyRecentStatusManager/onMessageAdded all previous messaged delivered. cache cleared");
                linkedHashMap.clear();
            }
            linkedHashMap.put(Long.valueOf(r4.A1L), r4);
        }
    }

    public void BWU(C624134x r7, int i) {
        AnonymousClass5S1 r4;
        AnonymousClass5S1 r3;
        C162457s7.A0J(r7, 0);
        if (this.A01.A00() && i == 24 && r7.A0J > 0 && AnonymousClass36X.A07(r7)) {
            C106245Ye.A01(C624134x.A0C(r7, "XFamilyRecentStatusManager/onMessageChanged crosspostable message ", AnonymousClass001.A0o()));
            long j = r7.A1L;
            LinkedHashMap linkedHashMap = this.A02;
            Long valueOf = Long.valueOf(j);
            if (linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(valueOf, r7);
            }
            Collection values = linkedHashMap.values();
            C162457s7.A0D(values);
            if (AnonymousClass36X.A08(values)) {
                C29151iM r2 = this.A00;
                new ArrayList(linkedHashMap.values());
                Iterator A03 = C61102zi.A03(r2);
                while (A03.hasNext()) {
                    C105125Tr r22 = ((AnonymousClass5H9) A03.next()).A00;
                    ArrayList A0J = AnonymousClass002.A0J(r22.A06.A02.values());
                    if (A0J.isEmpty()) {
                        r4 = new AnonymousClass5S1(false, false);
                    } else {
                        r4 = new AnonymousClass5S1(r22.A04.A01(2, A0J), true);
                    }
                    if (A0J.isEmpty()) {
                        r3 = new AnonymousClass5S1(false, false);
                    } else {
                        r3 = new AnonymousClass5S1(r22.A04.A01(5, A0J), true);
                    }
                    AnonymousClass5S1 r1 = r22.A01;
                    if (r1 == null) {
                        throw C18270x1.A0S("currentShareViewState");
                    }
                    if (!r1.equals(r4)) {
                        r22.A01 = r4;
                        AnonymousClass66P r0 = r22.A00;
                        if (r0 != null) {
                            r0.BbT(r4);
                        }
                    }
                    AnonymousClass5S1 r02 = r22.A02;
                    if (r02 == null) {
                        throw C18270x1.A0S("currentUpsellViewState");
                    } else if (!r02.equals(r3)) {
                        r22.A02 = r3;
                        AnonymousClass66P r03 = r22.A00;
                        if (r03 != null) {
                            r03.Bf2(r3);
                        }
                    }
                }
            }
        }
    }

    public void BWg(Collection collection, Map map) {
        C162457s7.A0J(collection, 0);
        if (this.A01.A00()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (AnonymousClass36X.A07(A0T)) {
                    C106245Ye.A01(C624134x.A0C(A0T, "XFamilyRecentStatusManager/onMessagesDeleted message ", AnonymousClass001.A0o()));
                    if (this.A02.containsKey(Long.valueOf(A0T.A1L))) {
                        A01();
                    }
                }
            }
        }
    }

    public final void A01() {
        C106245Ye.A01("XFamilyRecentStatusManager/clearStatusBatch");
        this.A02.clear();
        Iterator A03 = C61102zi.A03(this.A00);
        while (A03.hasNext()) {
            C105125Tr r1 = ((AnonymousClass5H9) A03.next()).A00;
            r1.A00();
            r1.A02(false);
        }
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public void BcN(List list) {
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (linkedHashMap.keySet().contains(Long.valueOf(C18270x1.A02(it)))) {
                    A01();
                    return;
                }
            }
        }
    }

    public C113925mD(C29151iM r2, C104745Se r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static ArrayList A00(C183538qC r1) {
        return new ArrayList(((C113925mD) r1.get()).A02.values());
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }
}
