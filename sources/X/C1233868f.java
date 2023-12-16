package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.68f  reason: invalid class name and case insensitive filesystem */
public class C1233868f implements C836449f {
    public Object A00;
    public final int A01;

    public C1233868f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void AwA(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        switch (this.A01) {
            case 0:
                C009707r r3 = (C009707r) this.A00;
                if (!r3.isFinishing() && !r3.isDestroyed()) {
                    C88694ab A02 = C88694ab.A02(r3.findViewById(16908290), charSequence, 0);
                    A02.A0F(charSequence2, onClickListener);
                    A02.A0D(C18300x5.A03(r3, R.attr.f3nameremoved, R.color.f5nameremoved));
                    A02.A05();
                    return;
                }
                return;
            case 1:
                ((ConversationsFragment) this.A00).A1h(charSequence, charSequence2, onClickListener);
                return;
            default:
                SearchFragment searchFragment = (SearchFragment) this.A00;
                View view = searchFragment.A0B;
                if (searchFragment.A1D() != null && view != null) {
                    C88694ab A022 = C88694ab.A02(view.findViewById(R.id.search_fragment), charSequence, 0);
                    A022.A0F(charSequence2, onClickListener);
                    A022.A0D(AnonymousClass5Yj.A03(searchFragment.A1D(), searchFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
                    A022.A0A(new AnonymousClass6ZL(searchFragment));
                    searchFragment.A05 = A022;
                    A022.A05();
                    return;
                }
                return;
        }
    }
}
