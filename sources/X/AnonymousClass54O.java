package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.54O  reason: invalid class name */
public class AnonymousClass54O extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass5XL A00;

    public AnonymousClass54O(AnonymousClass5XL r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0J;
        AnonymousClass5XL r1 = this.A00;
        if (r1.A05 == null) {
            AnonymousClass1VX r8 = r1.A0J;
            C64773Ex r5 = r1.A0C;
            C66493Lq r9 = r1.A0K;
            AnonymousClass5IP r4 = r1.A0B;
            C56572sD r10 = r1.A0P;
            C56612sH r7 = r1.A0G;
            r1.A05 = new AnonymousClass5XE(r1.A09, r4, r5, r1.A0F, r7, r8, r9, r10);
        }
        AnonymousClass93O r42 = new AnonymousClass93O(this, 0);
        C56762sW r3 = r1.A0H;
        int i = r1.A01;
        ArrayList A04 = r3.A04(r42, i, r1.A00 + i);
        AnonymousClass39J r43 = null;
        if (C18320x8.A1T(this)) {
            return null;
        }
        r1.A08.A0S(new C70183a5(this, 13, A04));
        Log.i("CallsHistoryDataSource/LoadAdditionalCallLogRecordsTask/doInBackground");
        try {
            r43 = C627436k.A03();
        } catch (UnsatisfiedLinkError e) {
            Log.e((Throwable) e);
        }
        int size = r1.A05.A08.size();
        r1.A05.A01(r43, A04);
        List list = r1.A05.A08;
        synchronized (list) {
            A0J = AnonymousClass002.A0J(list);
        }
        if (A0J.isEmpty() || A0J.size() == size) {
            return AnonymousClass001.A0s();
        }
        return A0J.subList(size, A0J.size());
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass5XL r1 = this.A00;
        r1.A02 = null;
        if (collection == null) {
            Log.i("CallsHistoryDataSource/notifyAdditionalCallGroupsLoaded task result null");
            return;
        }
        AnonymousClass7DD r12 = r1.A06;
        if (r12 != null) {
            ArrayList A0J = AnonymousClass002.A0J(collection);
            Log.i("CallsHistoryViewModel/onAdditionalCallGroupsLoaded");
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r12.A00;
            C18290x4.A1L(callsHistoryFragmentV2ViewModel.A05);
            Lock lock = callsHistoryFragmentV2ViewModel.A0r;
            AnonymousClass7DB r13 = callsHistoryFragmentV2ViewModel.A0O;
            LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0q;
            ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0o;
            C56572sD r7 = callsHistoryFragmentV2ViewModel.A0k;
            C64773Ex r4 = callsHistoryFragmentV2ViewModel.A0Y;
            C66493Lq r6 = callsHistoryFragmentV2ViewModel.A0g;
            AnonymousClass55H r0 = new AnonymousClass55H(r13, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r4, callsHistoryFragmentV2ViewModel.A0e, r6, r7, A0J, arrayList, linkedHashMap, lock);
            callsHistoryFragmentV2ViewModel.A05 = r0;
            AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, r0);
        }
    }
}
