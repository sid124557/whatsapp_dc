package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55H  reason: invalid class name */
public class AnonymousClass55H extends AnonymousClass5ZM {
    public final AnonymousClass7DB A00;
    public final AnonymousClass5IP A01;
    public final C64773Ex A02;
    public final C55422qK A03;
    public final C66493Lq A04;
    public final C56572sD A05;
    public final WeakReference A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final LinkedHashMap A09;
    public final Lock A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        r0 = r6.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r18) {
        /*
            r17 = this;
            r3 = r17
            java.lang.ref.WeakReference r0 = r3.A06
            java.lang.Object r2 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r2
            if (r2 != 0) goto L_0x001f
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.LinkedHashMap r0 = r3.A09
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.ArrayList r0 = r3.A08
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)
            return r0
        L_0x001f:
            java.util.concurrent.locks.Lock r4 = r3.A0A
            r4.lock()
            java.util.ArrayList r0 = r3.A07     // Catch:{ all -> 0x0126 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0126 }
        L_0x002a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0126 }
            X.5rE r10 = (X.C117005rE) r10     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r7 = r10.A04     // Catch:{ all -> 0x0126 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x0126 }
            int r0 = r0.size()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r0 = r3.A09     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0126 }
            r1.<init>(r0)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r0 = r3.A08     // Catch:{ all -> 0x0126 }
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x0126 }
            goto L_0x0122
        L_0x0056:
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x0126 }
            r5 = 0
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r0 = r3.A09     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0126 }
            r1.<init>(r0)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r0 = r3.A08     // Catch:{ all -> 0x0126 }
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x0126 }
            goto L_0x0122
        L_0x0075:
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x0126 }
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x0126 }
            X.3ZF r6 = (X.AnonymousClass3ZF) r6     // Catch:{ all -> 0x0126 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0126 }
            r1 = 0
            if (r0 != 0) goto L_0x008f
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r7, r5)     // Catch:{ all -> 0x0126 }
            X.2mt r0 = r0.A07     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x008f
            r1 = 1
        L_0x008f:
            if (r1 == 0) goto L_0x00b3
            X.3Ex r5 = r3.A02     // Catch:{ all -> 0x0126 }
            X.2sD r1 = r3.A05     // Catch:{ all -> 0x0126 }
            X.3Lq r0 = r3.A04     // Catch:{ all -> 0x0126 }
            X.3ZH r12 = X.C106255Yf.A00(r5, r0, r1, r6)     // Catch:{ all -> 0x0126 }
            X.2qK r0 = r3.A03     // Catch:{ all -> 0x0126 }
            java.lang.String r13 = r0.A03(r6)     // Catch:{ all -> 0x0126 }
            X.5R4 r11 = r2.A0E(r10, r12, r13)     // Catch:{ all -> 0x0126 }
            r14 = 0
            r15 = -1
            X.5jk r9 = new X.5jk     // Catch:{ all -> 0x0126 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r0 = r3.A08     // Catch:{ all -> 0x0126 }
            r0.add(r9)     // Catch:{ all -> 0x0126 }
            goto L_0x002a
        L_0x00b3:
            X.2ef r0 = r6.A0J     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00ee
            com.whatsapp.jid.GroupJid r0 = r6.A05     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00ee
            X.2ef r0 = r6.A0J     // Catch:{ all -> 0x0126 }
            X.2qK r5 = r3.A03     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0126 }
            com.whatsapp.jid.GroupJid r0 = r6.A05     // Catch:{ all -> 0x0126 }
            X.2i6 r7 = r5.A02(r0, r1)     // Catch:{ all -> 0x0126 }
            if (r7 == 0) goto L_0x00ee
            int r0 = r6.A00     // Catch:{ all -> 0x0126 }
            r5 = 2
            if (r0 == r5) goto L_0x00cf
            r5 = 3
        L_0x00cf:
            long r0 = r10.A01()     // Catch:{ all -> 0x0126 }
            X.5Qs r11 = r2.A0G(r7, r5, r0)     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r6 = r3.A09     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = r10.A03()     // Catch:{ all -> 0x0126 }
            long r13 = r7.A03     // Catch:{ all -> 0x0126 }
            long r0 = r7.A02     // Catch:{ all -> 0x0126 }
            X.4uZ r12 = r7.A04     // Catch:{ all -> 0x0126 }
            X.5ji r9 = new X.5ji     // Catch:{ all -> 0x0126 }
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0126 }
            r6.put(r5, r9)     // Catch:{ all -> 0x0126 }
            goto L_0x002a
        L_0x00ee:
            int r1 = r6.A0H     // Catch:{ all -> 0x0126 }
            r0 = 2
            boolean r7 = X.AnonymousClass000.A1U(r1, r0)
            com.whatsapp.jid.GroupJid r6 = r6.A05     // Catch:{ all -> 0x0126 }
            X.3Ex r5 = r3.A02     // Catch:{ all -> 0x0126 }
            X.2sD r1 = r3.A05     // Catch:{ all -> 0x0126 }
            X.3Lq r0 = r3.A04     // Catch:{ all -> 0x0126 }
            X.3ZH r1 = X.AnonymousClass36T.A01(r5, r0, r6, r1, r7)     // Catch:{ all -> 0x0126 }
            X.5RB r0 = r2.A0D(r10, r1)     // Catch:{ all -> 0x0126 }
            X.5jj r5 = new X.5jj     // Catch:{ all -> 0x0126 }
            r5.<init>(r10, r0, r1)     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r1 = r3.A09     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r10.A03()     // Catch:{ all -> 0x0126 }
            r1.put(r0, r5)     // Catch:{ all -> 0x0126 }
            goto L_0x002a
        L_0x0115:
            java.util.LinkedHashMap r0 = r3.A09     // Catch:{ all -> 0x0126 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0126 }
            r1.<init>(r0)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r0 = r3.A08     // Catch:{ all -> 0x0126 }
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x0126 }
        L_0x0122:
            r4.unlock()
            return r0
        L_0x0126:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55H.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass7DB r1 = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pair.first);
        ArrayList A0J = AnonymousClass002.A0J((Collection) pair.second);
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
        callsHistoryFragmentV2ViewModel.A05 = null;
        callsHistoryFragmentV2ViewModel.A0L(A0J, linkedHashMap);
    }

    public AnonymousClass55H(AnonymousClass7DB r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass5IP r4, C64773Ex r5, C55422qK r6, C66493Lq r7, C56572sD r8, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Lock lock) {
        this.A0A = lock;
        this.A07 = arrayList;
        this.A00 = r2;
        this.A09 = linkedHashMap;
        this.A08 = arrayList2;
        this.A05 = r8;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A06 = AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel);
    }
}
