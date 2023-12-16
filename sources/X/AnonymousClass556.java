package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.556  reason: invalid class name */
public class AnonymousClass556 extends AnonymousClass5ZM {
    public final AnonymousClass7DF A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final Collection A03;
    public final LinkedHashMap A04;
    public final Lock A05;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[ADDED_TO_REGION, Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dd A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r5 = r19
            java.lang.ref.WeakReference r0 = r5.A01
            java.lang.Object r7 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r7 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r7
            if (r7 != 0) goto L_0x001f
            java.lang.String r0 = "ProcessUpdatedContactsTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.LinkedHashMap r0 = r5.A04
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.ArrayList r0 = r5.A02
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)
            return r0
        L_0x001f:
            java.util.concurrent.locks.Lock r4 = r5.A05
            r4.lock()
            java.util.Collection r0 = r5.A03     // Catch:{ all -> 0x0102 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0102 }
        L_0x002a:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00f1
            X.3ZH r6 = X.C18310x6.A0R(r11)     // Catch:{ all -> 0x0102 }
            r8 = 0
            r3 = 0
        L_0x0036:
            java.util.ArrayList r2 = r5.A02     // Catch:{ all -> 0x0102 }
            int r0 = r2.size()     // Catch:{ all -> 0x0102 }
            if (r3 >= r0) goto L_0x00a1
            java.lang.Object r9 = r2.get(r3)     // Catch:{ all -> 0x0102 }
            X.5jk r9 = (X.C112445jk) r9     // Catch:{ all -> 0x0102 }
            X.3ZH r15 = r9.A03     // Catch:{ all -> 0x0102 }
            X.5R4 r1 = r9.A02     // Catch:{ all -> 0x0102 }
            boolean r0 = r1.A0D     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x0054
            X.3ZH r0 = r9.A03     // Catch:{ all -> 0x0102 }
            boolean r0 = X.AnonymousClass75J.A00(r0, r6)     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x0063
        L_0x0054:
            boolean r0 = r1.A0D     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x0061
            java.util.List r0 = r1.A0A     // Catch:{ all -> 0x0102 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r0 = 0
            goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            if (r0 == 0) goto L_0x009e
            if (r15 == 0) goto L_0x006f
            boolean r0 = r15.equals(r6)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x006f
            r15 = r6
        L_0x006f:
            X.5rE r13 = r9.A01     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r0 = r13.A04     // Catch:{ all -> 0x0102 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0102 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0102 }
            X.3ZF r0 = (X.AnonymousClass3ZF) r0     // Catch:{ all -> 0x0102 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r9.A04     // Catch:{ all -> 0x0102 }
            X.5R4 r9 = r9.A02     // Catch:{ all -> 0x0102 }
            java.util.List r0 = r0.A08()     // Catch:{ all -> 0x0102 }
            int r0 = r0.size()     // Catch:{ all -> 0x0102 }
            X.5R4 r14 = r7.A0F(r9, r15, r1, r0)     // Catch:{ all -> 0x0102 }
            r17 = 0
            r18 = -1
            X.5jk r12 = new X.5jk     // Catch:{ all -> 0x0102 }
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0102 }
            r2.set(r3, r12)     // Catch:{ all -> 0x0102 }
        L_0x009e:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x00a1:
            java.util.LinkedHashMap r9 = r5.A04     // Catch:{ all -> 0x0102 }
            java.util.Iterator r10 = X.C18290x4.A11(r9)     // Catch:{ all -> 0x0102 }
        L_0x00a7:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r8 = X.AnonymousClass001.A0m(r10)     // Catch:{ all -> 0x0102 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x0102 }
            X.8u2 r2 = (X.C185658u2) r2     // Catch:{ all -> 0x0102 }
            boolean r0 = r2 instanceof X.C112435jj     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00a7
            X.5jj r2 = (X.C112435jj) r2     // Catch:{ all -> 0x0102 }
            X.5RB r1 = r2.A02     // Catch:{ all -> 0x0102 }
            boolean r0 = r1.A0H     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r1.A0E     // Catch:{ all -> 0x0102 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x00da
        L_0x00cb:
            boolean r0 = r1.A0H     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x00d8
            X.3ZH r0 = r1.A0A     // Catch:{ all -> 0x0102 }
            boolean r0 = X.AnonymousClass75J.A00(r0, r6)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r0 = 0
            goto L_0x00db
        L_0x00da:
            r0 = 1
        L_0x00db:
            if (r0 == 0) goto L_0x00a7
            X.5rE r3 = r2.A01     // Catch:{ all -> 0x0102 }
            X.3ZH r2 = r2.A03     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x00e4
            r2 = r6
        L_0x00e4:
            X.5RB r1 = r7.A0D(r3, r2)     // Catch:{ all -> 0x0102 }
            X.5jj r0 = new X.5jj     // Catch:{ all -> 0x0102 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x0102 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0102 }
            goto L_0x00a7
        L_0x00f1:
            java.util.LinkedHashMap r0 = r5.A04     // Catch:{ all -> 0x0102 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0102 }
            r1.<init>(r0)     // Catch:{ all -> 0x0102 }
            java.util.ArrayList r0 = r5.A02     // Catch:{ all -> 0x0102 }
            android.util.Pair r0 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x0102 }
            r4.unlock()
            return r0
        L_0x0102:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass556.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass7DF r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A0A = null;
        callsHistoryFragmentV2ViewModel.A0L(arrayList, (LinkedHashMap) pair.first);
    }

    public AnonymousClass556(AnonymousClass7DF r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, ArrayList arrayList, Collection collection, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A05 = lock;
        this.A03 = collection;
        this.A04 = linkedHashMap;
        this.A02 = arrayList;
        this.A01 = AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel);
    }
}
