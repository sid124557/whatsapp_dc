package com.whatsapp.status;

import X.AnonymousClass001;
import X.AnonymousClass2z0;
import X.AnonymousClass5V0;
import X.AnonymousClass5Y0;
import X.C003203q;
import X.C08310eF;
import X.C107395bF;
import X.C162457s7;
import X.C18270x1;
import X.C183538qC;
import X.C19340zH;
import X.C387128v;
import X.C55832qz;
import X.C621033m;
import X.C624134x;
import X.C68683Uc;
import X.C69263Wi;
import X.C73833g9;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public final class StatusDeleteDialogFragment extends Hilt_StatusDeleteDialogFragment {
    public C69263Wi A00;
    public C621033m A01;
    public AnonymousClass5Y0 A02;
    public StatusPlaybackContactFragment A03;
    public C55832qz A04;
    public C183538qC A05;

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A03;
        if (statusPlaybackContactFragment != null) {
            statusPlaybackContactFragment.BR7(this, false);
        }
    }

    public Dialog A1J(Bundle bundle) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A03;
        if (statusPlaybackContactFragment != null) {
            statusPlaybackContactFragment.BR7(this, true);
        }
        AnonymousClass2z0 A032 = C107395bF.A03(A0H(), "");
        C55832qz r0 = this.A04;
        if (r0 != null) {
            C624134x A052 = r0.A05(A032);
            C183538qC r02 = this.A05;
            if (r02 != null) {
                r02.get();
                C003203q A0Q = A0Q();
                if (A0Q != null) {
                    C69263Wi r6 = this.A00;
                    if (r6 != null) {
                        AnonymousClass5Y0 r8 = this.A02;
                        if (r8 != null) {
                            C621033m r7 = this.A01;
                            if (r7 != null) {
                                Dialog A002 = C387128v.A00(A0Q, r6, r7, r8, new C68683Uc(A052), C73833g9.A05(A052));
                                if (A002 != null) {
                                    return A002;
                                }
                                C003203q A0Q2 = A0Q();
                                if (A0Q2 != null) {
                                    C19340zH A003 = AnonymousClass5V0.A00(A0Q2);
                                    A003.A0T(R.string.f11nameremoved);
                                    return A003.create();
                                }
                                throw AnonymousClass001.A0c("Required value was null.");
                            }
                            throw C18270x1.A0S("userActions");
                        }
                        throw C18270x1.A0S("emojiLoader");
                    }
                    throw C18270x1.A0S("globalUI");
                }
                throw AnonymousClass001.A0c("Required value was null.");
            }
            throw C18270x1.A0S("crosspostingBridgeFactoryLazy");
        }
        throw C18270x1.A0S("fMessageDatabase");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C08310eF A0N = A0N();
            C162457s7.A0K(A0N, "null cannot be cast to non-null type com.whatsapp.status.StatusDeleteDialogFragment.Host");
            this.A03 = (StatusPlaybackContactFragment) A0N;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
