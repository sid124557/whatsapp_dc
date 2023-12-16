package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55c  reason: invalid class name and case insensitive filesystem */
public final class C992755c extends AnonymousClass5ZM {
    public final AnonymousClass7DC A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C56612sH A03;
    public final C55422qK A04;
    public final AnonymousClass1VX A05;
    public final C66493Lq A06;
    public final C56572sD A07;
    public final AnonymousClass3ZF A08;
    public final WeakReference A09;
    public final ArrayList A0A;
    public final ArrayList A0B = AnonymousClass001.A0s();
    public final LinkedHashMap A0C;
    public final Lock A0D;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) this.A09.get();
        if (callsHistoryFragmentV2ViewModel == null) {
            Log.w("ProcessUpdatedOngoingJoinableCallTask/doInBackground view model reference null");
            return AnonymousClass5ZM.A03(new LinkedHashMap(this.A0C), this.A0A);
        }
        Lock lock = this.A0D;
        lock.lock();
        try {
            ArrayList arrayList = this.A0A;
            Iterator it = arrayList.iterator();
            C112445jk r7 = null;
            while (it.hasNext()) {
                C112445jk r6 = (C112445jk) it.next();
                Iterator A0x = AnonymousClass0x7.A0x(r6.A01.A04);
                while (true) {
                    if (A0x.hasNext()) {
                        if (C162457s7.A0P(((AnonymousClass3ZF) A0x.next()).A0E.A02, this.A08.A0E.A02)) {
                            r7 = A0G(callsHistoryFragmentV2ViewModel);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                ArrayList arrayList2 = this.A0B;
                if (r7 != null) {
                    r6 = r7;
                }
                arrayList2.add(r6);
            }
            if (r7 == null) {
                this.A0B.add(A0G(callsHistoryFragmentV2ViewModel));
            }
            arrayList.clear();
            ArrayList arrayList3 = this.A0B;
            arrayList.addAll(arrayList3);
            return AnonymousClass0x9.A0C(new LinkedHashMap(this.A0C), arrayList3);
        } finally {
            lock.unlock();
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        C162457s7.A0J(pair, 0);
        AnonymousClass7DC r0 = this.A00;
        Object obj2 = pair.first;
        C162457s7.A0C(obj2);
        Object obj3 = pair.second;
        C162457s7.A0C(obj3);
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
        callsHistoryFragmentV2ViewModel.A08 = null;
        callsHistoryFragmentV2ViewModel.A0L((ArrayList) obj3, (LinkedHashMap) obj2);
    }

    public final C112445jk A0G(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        C56612sH r4 = this.A03;
        AnonymousClass1VX r1 = this.A05;
        C64773Ex r3 = this.A01;
        AnonymousClass5ZU r0 = this.A02;
        AnonymousClass3ZF r2 = this.A08;
        C117005rE r5 = new C117005rE(r3, r0, r4, r1);
        r5.A04.add(r2);
        AnonymousClass3ZH A002 = C106255Yf.A00(r3, this.A06, this.A07, r2);
        String A032 = this.A04.A03(r2);
        return new C112445jk(r5, callsHistoryFragmentV2ViewModel.A0E(r5, A002, A032), A002, A032, (List) null, -1);
    }

    public C992755c(AnonymousClass7DC r2, C64773Ex r3, AnonymousClass5ZU r4, C56612sH r5, C55422qK r6, AnonymousClass1VX r7, C66493Lq r8, C56572sD r9, AnonymousClass3ZF r10, WeakReference weakReference, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        C18260x0.A0d(r2, lock, linkedHashMap, arrayList);
        C18260x0.A0g(r5, r7, r9, r3, r4);
        C18270x1.A13(r8, r6);
        this.A00 = r2;
        this.A0D = lock;
        this.A08 = r10;
        this.A0C = linkedHashMap;
        this.A0A = arrayList;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A04 = r6;
        this.A09 = weakReference;
    }
}
