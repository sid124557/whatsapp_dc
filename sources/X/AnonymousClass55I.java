package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55I  reason: invalid class name */
public class AnonymousClass55I extends AnonymousClass5ZM {
    public final AnonymousClass7D9 A00;
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

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r0 = r7.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r21) {
        /*
            r20 = this;
            r5 = r20
            java.lang.ref.WeakReference r0 = r5.A06
            java.lang.Object r4 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r4 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r4
            if (r4 != 0) goto L_0x001f
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.LinkedHashMap r0 = r5.A09
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.ArrayList r0 = r5.A07
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)
            return r0
        L_0x001f:
            java.util.concurrent.locks.Lock r8 = r5.A0A
            r8.lock()
            java.util.LinkedHashMap r3 = r5.A09     // Catch:{ all -> 0x0119 }
            r3.clear()     // Catch:{ all -> 0x0119 }
            java.util.ArrayList r2 = r5.A07     // Catch:{ all -> 0x0119 }
            r2.clear()     // Catch:{ all -> 0x0119 }
            java.util.ArrayList r0 = r5.A08     // Catch:{ all -> 0x0119 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0119 }
        L_0x0034:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0119 }
            X.5rE r0 = (X.C117005rE) r0     // Catch:{ all -> 0x0119 }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground original call group is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
        L_0x0047:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0119 }
            r0.<init>(r3)     // Catch:{ all -> 0x0119 }
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r0, r2)     // Catch:{ all -> 0x0119 }
            goto L_0x0115
        L_0x0052:
            java.lang.Object r13 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x010e }
            X.5rE r13 = (X.C117005rE) r13     // Catch:{ CloneNotSupportedException -> 0x010e }
            java.util.ArrayList r6 = r13.A04     // Catch:{ all -> 0x0119 }
            int r0 = r6.size()     // Catch:{ all -> 0x0119 }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
            goto L_0x0047
        L_0x0066:
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)     // Catch:{ all -> 0x0119 }
            java.lang.Object r7 = X.C18290x4.A0k(r0)     // Catch:{ all -> 0x0119 }
            X.3ZF r7 = (X.AnonymousClass3ZF) r7     // Catch:{ all -> 0x0119 }
            if (r7 != 0) goto L_0x0078
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
            goto L_0x0047
        L_0x0078:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0119 }
            r1 = 0
            if (r0 != 0) goto L_0x0088
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r6, r1)     // Catch:{ all -> 0x0119 }
            X.2mt r0 = r0.A07     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            if (r1 == 0) goto L_0x00ad
            X.3Ex r6 = r5.A02     // Catch:{ all -> 0x0119 }
            X.2sD r1 = r5.A05     // Catch:{ all -> 0x0119 }
            X.3Lq r0 = r5.A04     // Catch:{ all -> 0x0119 }
            X.3ZH r15 = X.C106255Yf.A00(r6, r0, r1, r7)     // Catch:{ all -> 0x0119 }
            X.2qK r0 = r5.A03     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.A03(r7)     // Catch:{ all -> 0x0119 }
            X.5R4 r14 = r4.A0E(r13, r15, r0)     // Catch:{ all -> 0x0119 }
            r17 = 0
            r18 = -1
            X.5jk r12 = new X.5jk     // Catch:{ all -> 0x0119 }
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0119 }
            r2.add(r12)     // Catch:{ all -> 0x0119 }
            goto L_0x0034
        L_0x00ad:
            X.2ef r0 = r7.A0J     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00e9
            com.whatsapp.jid.GroupJid r0 = r7.A05     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00e9
            X.2ef r0 = r7.A0J     // Catch:{ all -> 0x0119 }
            X.2qK r6 = r5.A03     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0119 }
            com.whatsapp.jid.GroupJid r0 = r7.A05     // Catch:{ all -> 0x0119 }
            X.2i6 r10 = r6.A02(r0, r1)     // Catch:{ all -> 0x0119 }
            if (r10 == 0) goto L_0x00e9
            int r0 = r7.A00     // Catch:{ all -> 0x0119 }
            r6 = 2
            if (r0 == r6) goto L_0x00c9
            r6 = 3
        L_0x00c9:
            long r0 = r13.A01()     // Catch:{ all -> 0x0119 }
            X.5Qs r14 = r4.A0G(r10, r6, r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = r13.A03()     // Catch:{ all -> 0x0119 }
            long r6 = r10.A03     // Catch:{ all -> 0x0119 }
            long r0 = r10.A02     // Catch:{ all -> 0x0119 }
            X.4uZ r15 = r10.A04     // Catch:{ all -> 0x0119 }
            X.5ji r12 = new X.5ji     // Catch:{ all -> 0x0119 }
            r16 = r6
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0119 }
            r3.put(r9, r12)     // Catch:{ all -> 0x0119 }
            goto L_0x0034
        L_0x00e9:
            int r1 = r7.A0H     // Catch:{ all -> 0x0119 }
            r0 = 2
            boolean r9 = X.AnonymousClass000.A1U(r1, r0)
            com.whatsapp.jid.GroupJid r7 = r7.A05     // Catch:{ all -> 0x0119 }
            X.3Ex r6 = r5.A02     // Catch:{ all -> 0x0119 }
            X.2sD r1 = r5.A05     // Catch:{ all -> 0x0119 }
            X.3Lq r0 = r5.A04     // Catch:{ all -> 0x0119 }
            X.3ZH r6 = X.AnonymousClass36T.A01(r6, r0, r7, r1, r9)     // Catch:{ all -> 0x0119 }
            X.5RB r0 = r4.A0D(r13, r6)     // Catch:{ all -> 0x0119 }
            X.5jj r1 = new X.5jj     // Catch:{ all -> 0x0119 }
            r1.<init>(r13, r0, r6)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r13.A03()     // Catch:{ all -> 0x0119 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0119 }
            goto L_0x0034
        L_0x010e:
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground failed to clone call group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0119 }
            goto L_0x0047
        L_0x0115:
            r8.unlock()
            return r0
        L_0x0119:
            r0 = move-exception
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55I.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass7D9 r1 = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pair.first);
        ArrayList A0J = AnonymousClass002.A0J((Collection) pair.second);
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
        callsHistoryFragmentV2ViewModel.A09 = null;
        callsHistoryFragmentV2ViewModel.A0L(A0J, linkedHashMap);
    }

    public AnonymousClass55I(AnonymousClass7D9 r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass5IP r4, C64773Ex r5, C55422qK r6, C66493Lq r7, C56572sD r8, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A0A = lock;
        this.A08 = AnonymousClass002.A0J(arrayList);
        this.A09 = linkedHashMap;
        this.A07 = arrayList2;
        this.A05 = r8;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r4;
        this.A06 = AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel);
    }
}
