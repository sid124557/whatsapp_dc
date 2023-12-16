package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55B  reason: invalid class name */
public class AnonymousClass55B extends AnonymousClass5ZM {
    public final AnonymousClass7DE A00;
    public final C64773Ex A01;
    public final C95814uZ A02;
    public final WeakReference A03;
    public final ArrayList A04;
    public final LinkedHashMap A05;
    public final Lock A06;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0073 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            java.lang.ref.WeakReference r0 = r15.A03
            java.lang.Object r7 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r7 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r7
            r2 = 0
            if (r7 != 0) goto L_0x0011
            java.lang.String r0 = "ProcessOnProfilePhotoChangedTask/doInBackground view model reference null"
        L_0x000d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x0011:
            X.3Ex r1 = r15.A01
            X.4uZ r0 = r15.A02
            X.3ZH r6 = r1.A07(r0)
            if (r6 != 0) goto L_0x001e
            java.lang.String r0 = "ProcessOnProfilePhotoChangedTask/doInBackground failed to convert"
            goto L_0x000d
        L_0x001e:
            java.util.concurrent.locks.Lock r5 = r15.A06
            r5.lock()
            r2 = 0
        L_0x0024:
            java.util.ArrayList r4 = r15.A04     // Catch:{ all -> 0x00d0 }
            int r0 = r4.size()     // Catch:{ all -> 0x00d0 }
            if (r2 >= r0) goto L_0x0076
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x00d0 }
            X.5jk r1 = (X.C112445jk) r1     // Catch:{ all -> 0x00d0 }
            X.3ZH r11 = r1.A03     // Catch:{ all -> 0x00d0 }
            X.5R4 r3 = r1.A02     // Catch:{ all -> 0x00d0 }
            boolean r0 = r3.A0D     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0042
            X.3ZH r0 = r1.A03     // Catch:{ all -> 0x00d0 }
            boolean r0 = X.AnonymousClass75J.A00(r0, r6)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0051
        L_0x0042:
            boolean r0 = r3.A0D     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x004f
            java.util.List r0 = r3.A0A     // Catch:{ all -> 0x00d0 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            if (r0 == 0) goto L_0x0073
            X.5rE r9 = r1.A01     // Catch:{ all -> 0x00d0 }
            java.lang.String r12 = r1.A04     // Catch:{ all -> 0x00d0 }
            X.5R4 r0 = r1.A02     // Catch:{ all -> 0x00d0 }
            X.5Wp r1 = new X.5Wp     // Catch:{ all -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A01(r11)     // Catch:{ all -> 0x00d0 }
            r1.A09 = r0     // Catch:{ all -> 0x00d0 }
            X.5R4 r10 = r1.A00()     // Catch:{ all -> 0x00d0 }
            r13 = 0
            r14 = -1
            X.5jk r8 = new X.5jk     // Catch:{ all -> 0x00d0 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00d0 }
            r4.set(r2, r8)     // Catch:{ all -> 0x00d0 }
        L_0x0073:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0076:
            java.util.LinkedHashMap r8 = r15.A05     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r10 = X.C18290x4.A11(r8)     // Catch:{ all -> 0x00d0 }
        L_0x007c:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r9 = X.AnonymousClass001.A0m(r10)     // Catch:{ all -> 0x00d0 }
            java.lang.Object r1 = r8.get(r9)     // Catch:{ all -> 0x00d0 }
            X.8u2 r1 = (X.C185658u2) r1     // Catch:{ all -> 0x00d0 }
            boolean r0 = r1 instanceof X.C112435jj     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x007c
            X.5jj r1 = (X.C112435jj) r1     // Catch:{ all -> 0x00d0 }
            X.5RB r2 = r1.A02     // Catch:{ all -> 0x00d0 }
            boolean r0 = r2.A0H     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00a0
            java.util.List r0 = r2.A0E     // Catch:{ all -> 0x00d0 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x00af
        L_0x00a0:
            boolean r0 = r2.A0H     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x00ad
            X.3ZH r0 = r2.A0A     // Catch:{ all -> 0x00d0 }
            boolean r0 = X.AnonymousClass75J.A00(r0, r6)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r0 = 0
            goto L_0x00b0
        L_0x00af:
            r0 = 1
        L_0x00b0:
            if (r0 == 0) goto L_0x007c
            X.3ZH r3 = r1.A03     // Catch:{ all -> 0x00d0 }
            X.5rE r2 = r1.A01     // Catch:{ all -> 0x00d0 }
            X.5RB r1 = r7.A0D(r2, r3)     // Catch:{ all -> 0x00d0 }
            X.5jj r0 = new X.5jj     // Catch:{ all -> 0x00d0 }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x00d0 }
            r8.put(r9, r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x007c
        L_0x00c3:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00d0 }
            r0.<init>(r8)     // Catch:{ all -> 0x00d0 }
            android.util.Pair r2 = X.AnonymousClass5ZM.A03(r0, r4)     // Catch:{ all -> 0x00d0 }
            r5.unlock()
            return r2
        L_0x00d0:
            r0 = move-exception
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55B.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Pair pair = (Pair) obj;
        AnonymousClass7DE r2 = this.A00;
        if (pair == null) {
            z = true;
            linkedHashMap = C18320x8.A0r();
            arrayList = AnonymousClass001.A0s();
        } else {
            z = false;
            linkedHashMap = (LinkedHashMap) pair.first;
            arrayList = (ArrayList) pair.second;
        }
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A00;
        callsHistoryFragmentV2ViewModel.A07 = null;
        if (z) {
            Log.i("CallsHistoryFragmentV2ViewModel/ProcessOnProfilePhotoChangedTask refreshCalls");
            callsHistoryFragmentV2ViewModel.A0L.A01();
            return;
        }
        callsHistoryFragmentV2ViewModel.A0L(arrayList, linkedHashMap);
    }

    public AnonymousClass55B(AnonymousClass7DE r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, C64773Ex r4, C95814uZ r5, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A02 = r5;
        this.A06 = lock;
        this.A00 = r2;
        this.A05 = linkedHashMap;
        this.A04 = arrayList;
        this.A01 = r4;
        this.A03 = AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel);
    }
}
