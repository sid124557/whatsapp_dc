package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55J  reason: invalid class name */
public class AnonymousClass55J extends AnonymousClass5ZM {
    public final AnonymousClass7DA A00;
    public final AnonymousClass5IP A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C56612sH A04;
    public final C55422qK A05;
    public final AnonymousClass1VX A06;
    public final C66493Lq A07;
    public final C56572sD A08;
    public final AnonymousClass3ZF A09;
    public final WeakReference A0A;
    public final ArrayList A0B;
    public final LinkedHashMap A0C;
    public final Lock A0D;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Pair pair;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) this.A0A.get();
        if (callsHistoryFragmentV2ViewModel == null) {
            Log.w("ProcessOnCallEndedCallLogTask/doInBackground view model reference null");
            return AnonymousClass5ZM.A03(new LinkedHashMap(this.A0C), this.A0B);
        }
        Lock lock = this.A0D;
        lock.lock();
        try {
            LinkedHashMap linkedHashMap = this.A0C;
            if (linkedHashMap.size() > 0) {
                String A0m = AnonymousClass001.A0m(C18290x4.A11(linkedHashMap));
                C185658u2 r6 = (C185658u2) linkedHashMap.get(A0m);
                if (r6 instanceof C112435jj) {
                    C112435jj r62 = (C112435jj) r6;
                    C117005rE r3 = r62.A01;
                    AnonymousClass3ZF r2 = this.A09;
                    boolean z = true;
                    if (r3.A06(r2, false)) {
                        r3.A04.add(r2);
                    } else {
                        z = false;
                    }
                    if (z) {
                        AnonymousClass3ZH r1 = r62.A03;
                        C112435jj r22 = new C112435jj(r3, callsHistoryFragmentV2ViewModel.A0D(r3, r1), r1);
                        linkedHashMap.remove(A0m);
                        LinkedHashMap A0r = C18320x8.A0r();
                        A0r.put(r22.A01.A03(), r22);
                        A0r.putAll(linkedHashMap);
                        linkedHashMap.clear();
                        linkedHashMap.putAll(A0r);
                        pair = AnonymousClass5ZM.A03(new LinkedHashMap(linkedHashMap), this.A0B);
                        return pair;
                    }
                }
            }
            C56612sH r32 = this.A04;
            AnonymousClass1VX r12 = this.A06;
            C64773Ex r7 = this.A02;
            AnonymousClass5ZU r0 = this.A03;
            AnonymousClass3ZF r23 = this.A09;
            C117005rE r63 = new C117005rE(r7, r0, r32, r12);
            r63.A04.add(r23);
            boolean A1U = AnonymousClass000.A1U(r23.A0H, 2);
            AnonymousClass3ZH A012 = AnonymousClass36T.A01(r7, this.A07, r23.A05, this.A08, A1U);
            C112435jj r24 = new C112435jj(r63, callsHistoryFragmentV2ViewModel.A0D(r63, A012), A012);
            LinkedHashMap A0r2 = C18320x8.A0r();
            A0r2.put(r24.A01.A03(), r24);
            A0r2.putAll(linkedHashMap);
            linkedHashMap.clear();
            linkedHashMap.putAll(A0r2);
            pair = AnonymousClass5ZM.A03(new LinkedHashMap(linkedHashMap), this.A0B);
            return pair;
        } finally {
            lock.unlock();
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass7DA r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A06 = null;
        callsHistoryFragmentV2ViewModel.A0L(arrayList, (LinkedHashMap) pair.first);
    }

    public AnonymousClass55J(AnonymousClass7DA r2, CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass5IP r4, C64773Ex r5, AnonymousClass5ZU r6, C56612sH r7, C55422qK r8, AnonymousClass1VX r9, C66493Lq r10, C56572sD r11, AnonymousClass3ZF r12, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A0D = lock;
        this.A09 = r12;
        this.A0C = linkedHashMap;
        this.A0B = arrayList;
        this.A04 = r7;
        this.A06 = r9;
        this.A08 = r11;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r10;
        this.A05 = r8;
        this.A01 = r4;
        this.A0A = AnonymousClass0x9.A14(callsHistoryFragmentV2ViewModel);
    }
}
