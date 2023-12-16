package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.11y  reason: invalid class name and case insensitive filesystem */
public final class C196311y extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();

    public void BNf(C05570Ua r6, int i) {
        String string;
        C162457s7.A0J(r6, 0);
        if (r6 instanceof AnonymousClass12M) {
            Object obj = ((C51382jj) this.A00.get(i)).A01;
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.SuggestionView.UiState");
            C53402n2 r1 = (C53402n2) obj;
            C162457s7.A0J(r1, 0);
            ((AnonymousClass12M) r6).A00.A05(r1);
        } else if (r6 instanceof C197812n) {
            Object obj2 = ((C51382jj) this.A00.get(i)).A01;
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementAdapter.SuggestionsListData");
            C51392jk r12 = (C51392jk) obj2;
            int i2 = r12.A01;
            Integer valueOf = Integer.valueOf(r12.A00);
            C19170ys r2 = ((C197812n) r6).A00;
            if (valueOf != null) {
                string = AnonymousClass0x2.A0X(r2.getContext(), valueOf, 1, i2);
            } else {
                string = r2.getContext().getString(i2);
            }
            r2.A01.setText(string);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass12M(new C19390zT(C18290x4.A0F(viewGroup)));
        }
        if (i != 2) {
            return new AnonymousClass12F(viewGroup);
        }
        return C197812n.A00(viewGroup);
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C51382jj r0 = (C51382jj) C73723fy.A06(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public long A0B(int i) {
        C53402n2 r1;
        if (getItemViewType(i) != 1) {
            return -1;
        }
        Object obj = ((C51382jj) this.A00.get(i)).A01;
        if (!(obj instanceof C53402n2) || (r1 = (C53402n2) obj) == null) {
            return -1;
        }
        return (long) r1.A02.hashCode();
    }
}
