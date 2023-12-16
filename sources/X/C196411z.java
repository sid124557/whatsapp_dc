package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.11z  reason: invalid class name and case insensitive filesystem */
public final class C196411z extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();

    public void BNf(C05570Ua r6, int i) {
        C162457s7.A0J(r6, 0);
        if (r6 instanceof AnonymousClass12P) {
            Object obj = ((C51722kH) this.A00.get(i)).A01;
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.group.newgroup.AddParticipantButtonView.UiState");
            C635439q.A00(((AnonymousClass12P) r6).A00, obj, 7);
        } else if (r6 instanceof AnonymousClass12Q) {
            Object obj2 = ((C51722kH) this.A00.get(i)).A01;
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.group.newgroup.GroupParticipantView.UiState");
            C52942mI r4 = (C52942mI) obj2;
            C162457s7.A0J(r4, 0);
            C19280z8 r3 = ((AnonymousClass12Q) r6).A00;
            C105365Uq r1 = r4.A00;
            AnonymousClass3ZH r2 = r4.A01;
            r1.A08(r3.A04, r2);
            r3.A05.setText(r3.getWaContactNames().A0H(r2));
            if (r4.A03) {
                C635439q.A00(r3, r4, 8);
            } else {
                r3.A03.setVisibility(8);
            }
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass12P(new C19210yz(C18290x4.A0F(viewGroup)));
        }
        if (i != 2) {
            return new AnonymousClass12J(viewGroup);
        }
        return new AnonymousClass12Q(new C19280z8(C18290x4.A0F(viewGroup)));
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C51722kH r0 = (C51722kH) C73723fy.A06(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public long A0B(int i) {
        AnonymousClass3ZH r1;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            return -1;
        }
        if (itemViewType != 2) {
            return -2;
        }
        Object obj = ((C51722kH) this.A00.get(i)).A01;
        if (!(obj instanceof AnonymousClass3ZH) || (r1 = (AnonymousClass3ZH) obj) == null) {
            return -2;
        }
        return r1.A0F();
    }
}
