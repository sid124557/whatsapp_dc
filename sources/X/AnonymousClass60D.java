package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.60D  reason: invalid class name */
public final class AnonymousClass60D extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessProductListBaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60D(BusinessProductListBaseFragment businessProductListBaseFragment) {
        super(1);
        this.this$0 = businessProductListBaseFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (C162457s7.A0P(obj, C155037eB.A00)) {
            C08270df A0T = this.this$0.A0T();
            BusinessProductListBaseFragment businessProductListBaseFragment = this.this$0;
            C103115Lp r6 = businessProductListBaseFragment.A0E;
            if (r6 != null) {
                UserJid A1L = businessProductListBaseFragment.A1L();
                C141776w7 r4 = this.this$0.A0A;
                int ordinal = r4.ordinal();
                int i = 3;
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2) {
                        i = 2;
                    } else if (ordinal == 3) {
                        i = 5;
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("entryPoint value ");
                        A0o.append(r4);
                        throw AnonymousClass000.A0F(" is not recognized", A0o);
                    }
                }
                AnonymousClass344.A00(r6.A00(A1L, (String) null, i), A0T);
                return C59022wD.A00;
            }
            throw C18270x1.A0S("orderFragments");
        }
        throw C73153f1.A00();
    }
}
