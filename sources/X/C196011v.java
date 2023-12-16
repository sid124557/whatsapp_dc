package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.events.EventResponseUserView$bind$1;
import java.util.List;

/* renamed from: X.11v  reason: invalid class name and case insensitive filesystem */
public final class C196011v extends AnonymousClass0R6 {
    public List A00 = AnonymousClass001.A0s();
    public final C105365Uq A01;

    public void BNf(C05570Ua r8, int i) {
        C162457s7.A0J(r8, 0);
        if (r8 instanceof AnonymousClass12O) {
            Object obj = this.A00.get(i);
            C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.UserItem");
            AnonymousClass1T5 r6 = (AnonymousClass1T5) obj;
            C105365Uq r5 = this.A01;
            C18270x1.A14(r6, r5);
            View view = r8.A0H;
            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.events.EventResponseUserView");
            C19310zD r4 = (C19310zD) view;
            r4.getContactAvatars().A06(r4.A0G, R.drawable.avatar_contact);
            C616131n.A02((C85494Gl) null, new EventResponseUserView$bind$1(r5, r4, r6, (C84814Du) null), AnonymousClass349.A02(r4.getIoDispatcher()), (AnonymousClass20D) null, 3);
        } else if (r8 instanceof AnonymousClass12N) {
            Object obj2 = this.A00.get(i);
            C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.HeaderItem");
            String str = ((AnonymousClass1T4) obj2).A00;
            View view2 = r8.A0H;
            C162457s7.A0K(view2, "null cannot be cast to non-null type com.whatsapp.events.EventResponseHeaderView");
            ((C19220z0) view2).A00.setText(str);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass12O(C18290x4.A0F(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass12N(C18290x4.A0F(viewGroup));
        }
        return new AnonymousClass12H(viewGroup);
    }

    public int A0G() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C370620u r0;
        AnonymousClass2GH r02 = (AnonymousClass2GH) C73723fy.A06(this.A00, i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C370620u.NONE;
        }
        return r0.ordinal();
    }

    public C196011v(C105365Uq r2) {
        this.A01 = r2;
    }
}
