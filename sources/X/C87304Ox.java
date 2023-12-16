package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4Ox  reason: invalid class name and case insensitive filesystem */
public class C87304Ox extends Filter {
    public int A00 = 0;
    public CharSequence A01 = "";
    public final /* synthetic */ CallsHistoryFragmentV2ViewModel A02;

    public final void A03(ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel;
        ArrayList arrayList3;
        UserJid A07;
        A01(arrayList2, 2);
        synchronized (this) {
            callsHistoryFragmentV2ViewModel = this.A02;
            if (callsHistoryFragmentV2ViewModel.A0E == null) {
                ArrayList A0s = AnonymousClass001.A0s();
                callsHistoryFragmentV2ViewModel.A0E = A0s;
                callsHistoryFragmentV2ViewModel.A0Y.A0h(A0s);
                if (C86654Ky.A1Z(callsHistoryFragmentV2ViewModel.A0f)) {
                    Collections.sort(callsHistoryFragmentV2ViewModel.A0E, new C117865sc(callsHistoryFragmentV2ViewModel.A0Z, callsHistoryFragmentV2ViewModel.A0b));
                }
            }
            arrayList3 = callsHistoryFragmentV2ViewModel.A0E;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (A0R.A0F != null && (A07 = AnonymousClass3ZH.A07(A0R)) != null && !hashSet.contains(A07) && AnonymousClass5ZU.A04(callsHistoryFragmentV2ViewModel.A0Z, A0R, arrayList)) {
                arrayList2.add(new AnonymousClass8FX(A07, arrayList2.size() - this.A00, arrayList));
                if (C86654Ky.A1Z(callsHistoryFragmentV2ViewModel.A0f)) {
                    hashSet.add(A07);
                }
            }
        }
        A02(arrayList2, 2);
    }

    /* JADX INFO: finally extract failed */
    public final void A04(ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        int i = 1;
        if (C86654Ky.A1Z(callsHistoryFragmentV2ViewModel.A0f)) {
            i = 4;
        }
        ArrayList arrayList3 = arrayList2;
        A01(arrayList2, i);
        Lock lock = callsHistoryFragmentV2ViewModel.A0r;
        lock.lock();
        try {
            Iterator A10 = C18290x4.A10(callsHistoryFragmentV2ViewModel.A0q);
            while (A10.hasNext()) {
                C185658u2 r7 = (C185658u2) A10.next();
                if (r7.B8k() == 2) {
                    C112435jj r72 = (C112435jj) r7;
                    A00(r72.A01, r72, arrayList, arrayList3, hashSet);
                }
            }
            lock.unlock();
            A02(arrayList2, i);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        this.A01 = charSequence;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        C150987Sz r4 = callsHistoryFragmentV2ViewModel.A0U;
        int length = charSequence.length();
        if (r4.A00 != null && r4.A01 && length >= 1) {
            AnonymousClass4s0 A002 = r4.A00();
            A002.A01 = 0;
            A002.A03 = 1;
            r4.A02.BhD(A002);
            r4.A01 = false;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList A0s = AnonymousClass001.A0s();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A03 = C107155an.A03(callsHistoryFragmentV2ViewModel.A0b, charSequence.toString());
        this.A00 = 0;
        if (C86654Ky.A1Z(callsHistoryFragmentV2ViewModel.A0f)) {
            A03(A03, A0s, A0K);
            A01(A0s, 3);
            synchronized (this) {
                arrayList = callsHistoryFragmentV2ViewModel.A0D;
                if (arrayList == null) {
                    arrayList = callsHistoryFragmentV2ViewModel.A0Y.A0G();
                    callsHistoryFragmentV2ViewModel.A0D = arrayList;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                GroupJid A1C = C86664Kz.A1C(A0R);
                if (A1C != null && AnonymousClass5ZU.A04(callsHistoryFragmentV2ViewModel.A0Z, A0R, A03)) {
                    A0s.add(new AnonymousClass8FY(A1C, A03, A0s.size() - this.A00));
                }
            }
            A02(A0s, 3);
            A04(A03, A0s, A0K);
        } else {
            A01(A0s, 0);
            Lock lock = callsHistoryFragmentV2ViewModel.A0r;
            lock.lock();
            try {
                Iterator it2 = callsHistoryFragmentV2ViewModel.A0o.iterator();
                while (it2.hasNext()) {
                    C112445jk r9 = (C112445jk) it2.next();
                    A00(r9.A01, r9, A03, A0s, A0K);
                }
                lock.unlock();
                A02(A0s, 0);
                A04(A03, A0s, A0K);
                A03(A03, A0s, A0K);
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
        filterResults.values = AnonymousClass002.A0J(A0s);
        filterResults.count = A0s.size();
        return filterResults;
    }

    public C87304Ox(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        this.A02 = callsHistoryFragmentV2ViewModel;
    }

    public final void A00(C117005rE r17, C185658u2 r18, ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) {
        AnonymousClass3ZH A022;
        C185658u2 r9 = r18;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
        C64773Ex r8 = callsHistoryFragmentV2ViewModel.A0Y;
        C56572sD r5 = callsHistoryFragmentV2ViewModel.A0k;
        C66493Lq r3 = callsHistoryFragmentV2ViewModel.A0g;
        C117005rE r2 = r17;
        ArrayList arrayList3 = arrayList;
        if (r2.A04()) {
            ArrayList arrayList4 = r2.A04;
            A022 = AnonymousClass36T.A01(r8, r3, AnonymousClass4L0.A0P(arrayList4, 0).A05, r5, AnonymousClass000.A1U(AnonymousClass4L0.A0P(arrayList4, 0).A0H, 2));
            if (A022 == null || !AnonymousClass5ZU.A04(r2.A01, A022, arrayList3)) {
                ArrayList A0s = AnonymousClass001.A0s();
                if (!arrayList4.isEmpty()) {
                    Iterator A012 = AnonymousClass3ZF.A01(AnonymousClass4L0.A0P(arrayList4, 0));
                    while (A012.hasNext()) {
                        C86614Ku.A1P(r2.A00, ((AnonymousClass3ZE) A012.next()).A02, A0s);
                    }
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    A022 = C18310x6.A0R(it);
                    if (AnonymousClass5ZU.A04(r2.A01, A022, arrayList3)) {
                        if (A022 == null) {
                            return;
                        }
                    }
                }
                return;
            }
        } else {
            A022 = r2.A02();
            if (A022 == null || !AnonymousClass5ZU.A04(r2.A01, A022, arrayList3)) {
                return;
            }
        }
        ArrayList arrayList5 = arrayList2;
        int size = arrayList5.size() - this.A00;
        if (r9 instanceof C112435jj) {
            C112435jj r92 = (C112435jj) r9;
            r9 = new C112435jj(r92.A01, r92.A02, r92.A03, arrayList3, size);
        } else if (r9 instanceof C112445jk) {
            C112445jk r93 = (C112445jk) r9;
            r9 = new C112445jk(r93.A01, r93.A02, r93.A03, r93.A04, arrayList3, size);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CallsHistoryFragmentV2ViewModel/getUpdatedCallItem callItem is of unknown type: ");
            A0o.append(r9.B8k());
            C18270x1.A0z(A0o);
        }
        arrayList5.add(r9);
        ArrayList arrayList6 = r2.A04;
        if (arrayList6.isEmpty() || AnonymousClass4L0.A0P(arrayList6, 0).A05 == null) {
            Jid A03 = AnonymousClass3ZH.A03(A022);
            if (A03 == null) {
                Log.w("CallsHistoryViewModel/performFiltering contact user jid is null");
            } else {
                hashSet.add(A03);
            }
        }
    }

    public final void A01(ArrayList arrayList, int i) {
        arrayList.add(C18290x4.A0j(this.A02.A0p, i));
        this.A00++;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults == null || (obj = filterResults.values) == null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A02;
            AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, new AnonymousClass68M((Object) callsHistoryFragmentV2ViewModel, 5));
            return;
        }
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel2 = this.A02;
        ArrayList arrayList = (ArrayList) obj;
        callsHistoryFragmentV2ViewModel2.A0C = arrayList;
        callsHistoryFragmentV2ViewModel2.A0l.A0H(arrayList);
        callsHistoryFragmentV2ViewModel2.A0H();
    }

    public final void A02(ArrayList arrayList, int i) {
        int A0M = C86664Kz.A0M(arrayList);
        if (AnonymousClass75J.A00(C18290x4.A0j(this.A02.A0p, i), arrayList.get(A0M))) {
            arrayList.remove(A0M);
            this.A00--;
        }
    }
}
