package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.55A  reason: invalid class name */
public final class AnonymousClass55A extends AnonymousClass5ZM {
    public final AnonymousClass5XL A00;
    public final AnonymousClass7D8 A01;
    public final C56762sW A02;
    public final ArrayList A03;
    public final LinkedHashMap A04;
    public final Set A05;
    public final Lock A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            AnonymousClass7D8 r0 = this.A01;
            Object obj2 = pair.first;
            C162457s7.A0C(obj2);
            Object obj3 = pair.second;
            C162457s7.A0C(obj3);
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            callsHistoryFragmentV2ViewModel.A0L((ArrayList) obj3, (LinkedHashMap) obj2);
        }
    }

    public AnonymousClass55A(AnonymousClass5XL r1, AnonymousClass7D8 r2, C56762sW r3, ArrayList arrayList, LinkedHashMap linkedHashMap, Set set, Lock lock) {
        C18260x0.A0e(lock, set, r3, r1);
        C18260x0.A0U(linkedHashMap, arrayList);
        this.A01 = r2;
        this.A06 = lock;
        this.A05 = set;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = linkedHashMap;
        this.A03 = arrayList;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C117005rE B58;
        ArrayList A0s = AnonymousClass001.A0s();
        Lock lock = this.A06;
        lock.lock();
        try {
            Set set = this.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                LinkedHashMap linkedHashMap = this.A04;
                if (linkedHashMap.containsKey(A0m)) {
                    C185658u2 r1 = (C185658u2) linkedHashMap.get(A0m);
                    if (((r1 instanceof C112435jj) || (r1 instanceof C112425ji)) && (B58 = r1.B58()) != null) {
                        A0s.addAll(Collections.unmodifiableList(B58.A04));
                        linkedHashMap.remove(A0m);
                        it.remove();
                    }
                }
            }
            if (!A0s.isEmpty()) {
                this.A02.A0B(A0s);
                return AnonymousClass5ZM.A03(new LinkedHashMap(this.A04), this.A03);
            }
            if (!set.isEmpty()) {
                Log.w("CallsHistoryFragmentV2ViewModel/deleteHistoricalCallItems failed to match group IDs");
                this.A00.A01();
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }
}
