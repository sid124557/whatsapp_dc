package com.whatsapp.calling.callrating;

import X.AnonymousClass001;
import X.AnonymousClass66R;
import X.AnonymousClass7DJ;
import X.AnonymousClass8PJ;
import X.C106155Xv;
import X.C119025wJ;
import X.C13750ng;
import X.C154517dI;
import X.C174648Vi;
import X.C174658Vj;
import X.C175068Wy;
import X.C175338Xz;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C626936e;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C89704el;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.HashSet;
import java.util.Iterator;

public class CallRatingActivityV2 extends C89704el {
    public final AnonymousClass66R A00 = C154517dI.A01(new C174648Vi(this));
    public final AnonymousClass66R A01 = new C13750ng(new C119025wJ(this), new C174658Vj(this), new C175068Wy(this), new AnonymousClass8PJ(CallRatingViewModel.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A0D = C86614Ku.A0D(this);
        if (A0D == null || !C86664Kz.A14(this.A01).A0E(A0D)) {
            finish();
        }
        ((DialogFragment) this.A00.getValue()).A1O(getSupportFragmentManager(), CallRatingBottomSheet.class.getSimpleName());
        C86604Kt.A1N(this, C86664Kz.A14(this.A01).A08, new C175338Xz(this), 148);
    }

    public void onStop() {
        String str;
        String str2;
        super.onStop();
        if (!isChangingConfigurations()) {
            CallRatingViewModel A14 = C86664Kz.A14(this.A01);
            WamCall wamCall = A14.A04;
            if (wamCall != null) {
                HashSet hashSet = A14.A0E;
                boolean z = true;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int A05 = C18280x3.A05(it);
                        AnonymousClass7DJ r2 = A14.A0B;
                        boolean z2 = false;
                        if (A05 <= 51) {
                            z2 = true;
                        }
                        C626936e.A0E(z2, "MAX_PERMISSIBLE_INDEX to set is 51");
                        r2.A00 |= 1 << A05;
                    }
                    WamCall wamCall2 = A14.A04;
                    if (wamCall2 != null) {
                        wamCall2.userProblems = Long.valueOf(A14.A0B.A00);
                    }
                }
                String str3 = A14.A06;
                if (str3 == null || !(!C175738Zn.A0V(str3))) {
                    z = false;
                }
                String str4 = null;
                if (z) {
                    str = A14.A06;
                } else {
                    str = null;
                }
                wamCall.userDescription = str;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CallRatingViewModel/userRating: ");
                A0o.append(wamCall.userRating);
                A0o.append(", userDescription: ");
                A0o.append(wamCall.userDescription);
                A0o.append(", userProblem binary: ");
                Long l = wamCall.userProblems;
                if (l != null) {
                    str4 = Long.toBinaryString(l.longValue());
                }
                A0o.append(str4);
                A0o.append(", timeSeriesDir: ");
                C18260x0.A1L(A0o, A14.A05);
                A14.A01.A02(wamCall, A14.A07);
                C106155Xv r1 = A14.A00;
                WamCall wamCall3 = A14.A04;
                if (wamCall3 != null) {
                    str2 = wamCall3.callRandomId;
                } else {
                    str2 = null;
                }
                C18270x1.A0j(C106155Xv.A00(r1), "call_rating_last_call", str2);
                String str5 = A14.A05;
                if (str5 != null) {
                    A14.A02.A06(wamCall, str5);
                }
            }
            finish();
        }
    }
}
