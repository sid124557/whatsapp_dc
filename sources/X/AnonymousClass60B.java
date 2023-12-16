package X;

import com.whatsapp.R;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.60B  reason: invalid class name */
public final class AnonymousClass60B extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60B(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(1);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C87604Ty r1 = (C87604Ty) this.this$0.A0M.getValue();
        C620733j r0 = this.this$0.A0C;
        if (r0 != null) {
            String A0D = r1.A0D(r0, list);
            C162457s7.A0D(A0D);
            this.this$0.A0M.getValue();
            Set A01 = C87604Ty.A01(this.this$0.A1K().A08, list);
            List list2 = this.this$0.A1K().A08;
            list2.clear();
            list2.addAll(list);
            C90254gy A1K = this.this$0.A1K();
            if (!(A1K instanceof C90844iP)) {
                List list3 = A1K.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list3) {
                    if (next instanceof C132426fH) {
                        A0s.add(next);
                    }
                }
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (A01.contains(((C132426fH) next2).A01.A0F)) {
                        A0s2.add(next2);
                    }
                }
                Iterator it2 = A0s2.iterator();
                while (it2.hasNext()) {
                    C132426fH r5 = (C132426fH) it2.next();
                    long A0K = A1K.A0K(r5.A01);
                    if (A0K != r5.A00) {
                        r5.A00 = A0K;
                        A1K.A06(list3.indexOf(r5));
                    }
                }
            }
            BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
            boolean B5J = businessProductListBaseFragment.A1K().B5J();
            WDSButton wDSButton = businessProductListBaseFragment.A0G;
            if (wDSButton != null) {
                wDSButton.setText(C08310eF.A09(businessProductListBaseFragment).getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0D)));
            }
            businessProductListBaseFragment.A1N(B5J);
            this.this$0.A1M();
            return C59022wD.A00;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }
}
