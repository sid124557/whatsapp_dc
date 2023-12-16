package X;

import android.text.TextUtils;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;

/* renamed from: X.686  reason: invalid class name */
public class AnonymousClass686 extends C47732dj {
    public Object A00;
    public final int A01;

    public AnonymousClass686(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(C620833k r3, C27991fJ r4) {
        switch (this.A01) {
            case 0:
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) this.A00;
                synchronized (callsHistoryFragmentV2ViewModel) {
                    callsHistoryFragmentV2ViewModel.A0D = null;
                }
                C87304Ox r1 = callsHistoryFragmentV2ViewModel.A0T;
                if (!TextUtils.isEmpty(r1.A01)) {
                    r1.filter(r1.A01);
                    return;
                }
                return;
            case 2:
                C162457s7.A0J(r4, 0);
                C86644Kx.A1S(((AnonymousClass5WJ) this.A00).A0D, C18290x4.A13(r4), (AnonymousClass5WJ) this.A00, 33);
                return;
            default:
                super.A00(r3, r4);
                return;
        }
    }

    public void A01(C27991fJ r3) {
        if (1 - this.A01 != 0) {
            super.A01(r3);
            return;
        }
        AnonymousClass4VF r1 = (AnonymousClass4VF) this.A00;
        if (r3.equals(r1.A01)) {
            r1.A0D();
        }
    }
}
