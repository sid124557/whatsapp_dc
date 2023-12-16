package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5mC  reason: invalid class name and case insensitive filesystem */
public final class C113915mC implements AnonymousClass4FW, C1227665q {
    public final WfalManager A00;
    public final C29131iK A01;
    public final LinkedHashMap A02 = C18320x8.A0r();

    public void BWS(C624134x r4, int i) {
        C162457s7.A0J(r4, 0);
        if (this.A00.A02() && C626736a.A07(r4)) {
            AnonymousClass356.A03(C624134x.A0C(r4, "CrosspostRecentStatusManager/onMessageAdded crosspostable message ", AnonymousClass001.A0o()));
            LinkedHashMap linkedHashMap = this.A02;
            Collection values = linkedHashMap.values();
            C162457s7.A0D(values);
            if (C626736a.A08(values)) {
                AnonymousClass356.A03("CrosspostRecentStatusManager/onMessageAdded all previous messaged delivered. cache cleared");
                linkedHashMap.clear();
            }
            linkedHashMap.put(Long.valueOf(r4.A1L), r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ca, code lost:
        if (r6 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWU(X.C624134x r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            com.whatsapp.bridge.wfal.WfalManager r0 = r10.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01e5
            r0 = 24
            if (r12 != r0) goto L_0x01e5
            long r3 = r11.A0J
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e5
            boolean r0 = X.C626736a.A07(r11)
            if (r0 == 0) goto L_0x01e5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CrosspostRecentStatusManager/onMessageChanged crosspostable message "
            java.lang.String r0 = X.C624134x.A0C(r11, r0, r1)
            X.AnonymousClass356.A03(r0)
            long r0 = r11.A1L
            java.util.LinkedHashMap r2 = r10.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x003c
            r2.put(r1, r11)
        L_0x003c:
            java.util.Collection r0 = r2.values()
            X.C162457s7.A0D(r0)
            boolean r0 = X.C626736a.A08(r0)
            if (r0 == 0) goto L_0x01e5
            X.1iK r1 = r10.A01
            java.util.Collection r0 = r2.values()
            java.util.ArrayList r9 = X.AnonymousClass002.A0J(r0)
            java.util.Iterator r8 = X.C61102zi.A03(r1)
        L_0x0057:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r8.next()
            X.5H3 r0 = (X.AnonymousClass5H3) r0
            X.5L2 r2 = r0.A00
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01bf
            r0 = 0
            X.5Rz r3 = new X.5Rz
            r3.<init>(r0, r0)
        L_0x0071:
            X.5Rz r0 = r2.A01
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "currentShareViewState"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x007c:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0084
            r2.A01 = r3
        L_0x0084:
            X.2aN r3 = r2.A04
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00b9
            java.util.Iterator r1 = r9.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            X.34x r0 = X.C18300x5.A0T(r1)
            boolean r0 = X.C626736a.A07(r0)
            if (r0 != 0) goto L_0x0096
        L_0x00a6:
            r1 = 0
            X.59Q r0 = X.AnonymousClass59Q.HIDE
            X.5Sd r5 = new X.5Sd
            r5.<init>(r0, r0, r1, r1)
        L_0x00ae:
            X.5Sd r1 = r2.A02
            java.lang.String r0 = "currentShareViewStateV2"
            if (r1 != 0) goto L_0x01a8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b9:
            X.2oU r0 = r3.A01
            android.content.Context r0 = r0.A00
            X.C162457s7.A0D(r0)
            boolean r7 = X.C57672u1.A00(r0)
            boolean r6 = X.C57672u1.A01(r0)
            if (r7 != 0) goto L_0x00cd
            if (r6 != 0) goto L_0x0118
            goto L_0x00a6
        L_0x00cd:
            if (r6 == 0) goto L_0x0118
            boolean r0 = X.C626736a.A09(r9)
            if (r0 != 0) goto L_0x00de
            X.59Q r1 = X.AnonymousClass59Q.SHOW_APP_EXIST
            r0 = 1
            X.5Sd r5 = new X.5Sd
            r5.<init>(r1, r1, r0, r0)
            goto L_0x00ae
        L_0x00de:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0118
            java.util.Iterator r1 = r9.iterator()
        L_0x00e8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0118
            X.34x r0 = X.C18300x5.A0T(r1)
            X.5de r0 = r0.A0O
            r3 = 1
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r0.A03
            if (r0 != r3) goto L_0x00e8
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0118
            java.util.Iterator r1 = r9.iterator()
        L_0x0105:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0118
            X.34x r0 = X.C18300x5.A0T(r1)
            X.5de r0 = r0.A0O
            if (r0 == 0) goto L_0x0105
            boolean r0 = r0.A04
            if (r0 != r3) goto L_0x0105
            goto L_0x00a6
        L_0x0118:
            r1 = 1
            X.59Q r0 = X.AnonymousClass59Q.HIDE
            X.5Sd r5 = new X.5Sd
            r5.<init>(r0, r0, r1, r1)
            if (r7 == 0) goto L_0x012f
            X.59Q r4 = X.AnonymousClass59Q.SHOW_APP_EXIST
            boolean r3 = r5.A02
            boolean r1 = r5.A03
            X.59Q r0 = r5.A01
            X.5Sd r5 = new X.5Sd
            r5.<init>(r4, r0, r3, r1)
        L_0x012f:
            if (r6 == 0) goto L_0x013e
            X.59Q r4 = X.AnonymousClass59Q.SHOW_APP_EXIST
            boolean r3 = r5.A02
            boolean r1 = r5.A03
            X.59Q r0 = r5.A00
            X.5Sd r5 = new X.5Sd
            r5.<init>(r0, r4, r3, r1)
        L_0x013e:
            if (r7 == 0) goto L_0x016a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x016a
            java.util.Iterator r3 = r9.iterator()
        L_0x014a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x016a
            X.34x r0 = X.C18300x5.A0T(r3)
            X.5de r0 = r0.A0O
            r1 = 1
            if (r0 == 0) goto L_0x014a
            boolean r0 = r0.A03
            if (r0 != r1) goto L_0x014a
            X.59Q r4 = X.AnonymousClass59Q.SHOW_APP_EXIST_XPOST_DISABLED
            boolean r3 = r5.A02
            boolean r1 = r5.A03
            X.59Q r0 = r5.A01
            X.5Sd r5 = new X.5Sd
            r5.<init>(r4, r0, r3, r1)
        L_0x016a:
            if (r6 == 0) goto L_0x0196
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0196
            java.util.Iterator r3 = r9.iterator()
        L_0x0176:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0196
            X.34x r0 = X.C18300x5.A0T(r3)
            X.5de r0 = r0.A0O
            r1 = 1
            if (r0 == 0) goto L_0x0176
            boolean r0 = r0.A04
            if (r0 != r1) goto L_0x0176
            X.59Q r4 = X.AnonymousClass59Q.SHOW_APP_EXIST_XPOST_DISABLED
            boolean r3 = r5.A02
            boolean r1 = r5.A03
            X.59Q r0 = r5.A00
            X.5Sd r5 = new X.5Sd
            r5.<init>(r0, r4, r3, r1)
        L_0x0196:
            X.59Q r3 = r5.A00
            X.59Q r0 = X.AnonymousClass59Q.SHOW_APP_EXIST_XPOST_DISABLED
            if (r3 != r0) goto L_0x00ae
            X.59Q r1 = r5.A01
            if (r1 != r0) goto L_0x00ae
            r0 = 0
            X.5Sd r5 = new X.5Sd
            r5.<init>(r3, r1, r0, r0)
            goto L_0x00ae
        L_0x01a8:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0057
            r2.A02 = r5
            X.5Gm r0 = r2.A00
            if (r0 == 0) goto L_0x0057
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r2 = r0.A00
            boolean r1 = r5.A02
            boolean r0 = r5.A03
            r2.A0E(r1, r0)
            goto L_0x0057
        L_0x01bf:
            X.2aN r1 = r2.A04
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01da
            X.2oU r0 = r1.A01
            android.content.Context r1 = r0.A00
            X.C162457s7.A0D(r1)
            boolean r0 = X.C57672u1.A00(r1)
            if (r0 != 0) goto L_0x01e3
            boolean r0 = X.C57672u1.A01(r1)
            if (r0 != 0) goto L_0x01e3
        L_0x01da:
            r1 = 0
        L_0x01db:
            r0 = 1
            X.5Rz r3 = new X.5Rz
            r3.<init>(r1, r0)
            goto L_0x0071
        L_0x01e3:
            r1 = 1
            goto L_0x01db
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113915mC.BWU(X.34x, int):void");
    }

    public void BWg(Collection collection, Map map) {
        C162457s7.A0J(collection, 0);
        if (this.A00.A02()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (C626736a.A07(A0T)) {
                    AnonymousClass356.A03(C624134x.A0C(A0T, "CrosspostRecentStatusManager/onMessagesDeleted message ", AnonymousClass001.A0o()));
                    if (this.A02.containsKey(Long.valueOf(A0T.A1L))) {
                        A00();
                    }
                }
            }
        }
    }

    public final void A00() {
        AnonymousClass356.A03("CrosspostRecentStatusManager/clearStatusBatch");
        this.A02.clear();
        Iterator A03 = C61102zi.A03(this.A01);
        while (A03.hasNext()) {
            AnonymousClass5L2 r3 = ((AnonymousClass5H3) A03.next()).A00;
            C104695Rz r2 = r3.A01;
            if (r2 == null) {
                throw C18270x1.A0S("currentShareViewState");
            } else if (r2.A00) {
                r2.A00 = false;
                r2.A01 = false;
                AnonymousClass5Gm r0 = r3.A00;
                if (r0 != null) {
                    r0.A00.A0E(false, false);
                }
            }
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
                    A00();
                    return;
                }
            }
        }
    }

    public C113915mC(WfalManager wfalManager, C29131iK r3) {
        C18260x0.A0Q(r3, wfalManager);
        this.A01 = r3;
        this.A00 = wfalManager;
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
