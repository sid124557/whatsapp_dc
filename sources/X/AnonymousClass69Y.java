package X;

import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.69Y  reason: invalid class name */
public class AnonymousClass69Y implements C181638n5 {
    public Object A00;
    public final int A01;

    public AnonymousClass69Y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZN(int i, boolean z) {
        Integer A0f;
        if (this.A01 != 0) {
            C97584yn r0 = (C97584yn) this.A00;
            if (z) {
                C165807xf r1 = r0.A00;
                C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.layout.RatingType.Stars");
                ((C137526op) r1).A00 = i;
                return;
            }
            return;
        }
        CallRatingFragment callRatingFragment = (CallRatingFragment) this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallRatingFragment/setOnRatingBarChangeListener rating: ");
        A0o.append(i);
        C18260x0.A1E(", fromUser: ", A0o, z);
        if (z) {
            CallRatingViewModel A14 = C86664Kz.A14(callRatingFragment.A01);
            if (A14.A04 != null) {
                AnonymousClass107 r2 = A14.A0C;
                if (i > 0) {
                    int[] iArr = AnonymousClass5CY.A00;
                    if (i <= iArr.length) {
                        C86654Ky.A1H(A14.A0A);
                        A0f = Integer.valueOf(iArr[i - 1]);
                        r2.A0H(A0f);
                    }
                }
                A0f = AnonymousClass0x7.A0f();
                r2.A0H(A0f);
            }
        }
    }
}
