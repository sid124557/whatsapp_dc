package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;

/* renamed from: X.4IE  reason: invalid class name */
public class AnonymousClass4IE implements C84904Ee {
    public Object A00;
    public final int A01;

    public void Avq(long j, int i) {
        long j2 = j;
        int i2 = i;
        switch (this.A01) {
            case 0:
                AnonymousClass5XL r1 = (AnonymousClass5XL) this.A00;
                if (r1.A06 != null) {
                    r1.A0Q.BkM(new C70263aD(this, i, 3, j));
                    return;
                }
                return;
            case 1:
                UpcomingActivityViewModel.A00((UpcomingActivityViewModel) this.A00, (C95814uZ) null, (String) null, i2, j2);
                return;
            default:
                return;
        }
    }

    public void Avr(C95814uZ r9, String str, int i) {
        C95814uZ r3 = r9;
        String str2 = str;
        switch (this.A01) {
            case 0:
                AnonymousClass5XL r1 = (AnonymousClass5XL) this.A00;
                if (r1.A06 != null) {
                    r1.A0Q.BkM(new C70473aY(this, r3, str2, 1, 0));
                    return;
                }
                return;
            case 1:
                UpcomingActivityViewModel.A00((UpcomingActivityViewModel) this.A00, r3, str2, 1, -1);
                return;
            default:
                return;
        }
    }

    public AnonymousClass4IE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bao(C50392i6 r7) {
        switch (this.A01) {
            case 0:
                AnonymousClass7DD r0 = ((AnonymousClass5XL) this.A00).A06;
                if (r0 != null) {
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                    C112425ji r02 = callsHistoryFragmentV2ViewModel.A04;
                    if (r02 == null) {
                        CallsHistoryFragmentV2ViewModel.A03(callsHistoryFragmentV2ViewModel, r7);
                        callsHistoryFragmentV2ViewModel.A00 = 1;
                        CallsHistoryFragmentV2ViewModel.A02(callsHistoryFragmentV2ViewModel);
                        return;
                    } else if (r02.A00 > r7.A03) {
                        callsHistoryFragmentV2ViewModel.A0L.A02();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                return;
            default:
                C22681Pd r5 = (C22681Pd) this.A00;
                if (r5.A0S.A1L == r7.A02) {
                    r5.setupJoinCallViewContent(r7.A03);
                    return;
                }
                return;
        }
    }
}
