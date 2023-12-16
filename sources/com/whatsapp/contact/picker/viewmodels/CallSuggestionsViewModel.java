package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass08M;
import X.AnonymousClass0IV;
import X.AnonymousClass20D;
import X.AnonymousClass2VV;
import X.AnonymousClass4VK;
import X.AnonymousClass5XK;
import X.AnonymousClass66R;
import X.AnonymousClass8OQ;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C56612sH;
import X.C616131n;
import X.C72063d7;
import X.C73853gB;
import X.C77523tX;
import X.C84814Du;
import X.C85464Gi;
import X.C97174xk;
import com.whatsapp.voipcalling.CallState;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class CallSuggestionsViewModel extends AnonymousClass4VK {
    public long A00;
    public Set A01 = C72063d7.A00;
    public C85464Gi A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass2VV A04;
    public final C97174xk A05;
    public final C56612sH A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C77523tX(this));
    public final C73853gB A08;

    public void A0D(AnonymousClass5XK r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A07 == CallState.ACTIVE) {
            AnonymousClass8OQ r2 = r5.A02;
            if (!C162457s7.A0P(r2.keySet(), this.A01)) {
                Set keySet = r2.keySet();
                C162457s7.A0D(keySet);
                this.A01 = keySet;
                C85464Gi A012 = C616131n.A01(this.A08, new CallSuggestionsViewModel$maybeReloadSuggestions$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), AnonymousClass20D.DEFAULT);
                C85464Gi r1 = this.A02;
                if (r1 != null) {
                    r1.AyX((CancellationException) null);
                }
                this.A02 = A012;
            }
        }
    }

    public void A0C() {
        this.A05.A07(this);
    }

    public CallSuggestionsViewModel(AnonymousClass2VV r2, C97174xk r3, C56612sH r4, C73853gB r5) {
        C18260x0.A0V(r4, r3, r2);
        this.A06 = r4;
        this.A05 = r3;
        this.A04 = r2;
        this.A08 = r5;
        r3.A06(this);
        A0D(r3.A08());
    }
}
