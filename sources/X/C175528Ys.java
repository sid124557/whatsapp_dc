package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Ys  reason: invalid class name and case insensitive filesystem */
public final class C175528Ys extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ C141516vh $displayContext;
    public final /* synthetic */ CatalogAllCategoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175528Ys(C141516vh r2, CatalogAllCategoryViewModel catalogAllCategoryViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogAllCategoryViewModel;
        this.$bizJid = userJid;
        this.$displayContext = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        AnonymousClass7DP r8 = (AnonymousClass7DP) obj;
        C162457s7.A0J(r8, 0);
        if (r8 instanceof AnonymousClass6gG) {
            List<C43072Qq> list = ((AnonymousClass6gG) r8).A01;
            C06270Wx.A04(AnonymousClass6CA.A0J(this.this$0.A09), 1);
            UserJid userJid = this.$bizJid;
            C141516vh r5 = this.$displayContext;
            ArrayList A0c = C73783g4.A0c(list);
            for (C43072Qq r2 : list) {
                int ordinal = r5.ordinal();
                if (ordinal == 1) {
                    r0 = new AnonymousClass6gN(r2, userJid);
                } else if (ordinal == 0) {
                    r0 = new C132936gO(r2, userJid);
                } else {
                    throw C73153f1.A00();
                }
                A0c.add(r0);
            }
            if (this.$displayContext.ordinal() == 1) {
                A0c = AnonymousClass002.A0J(A0c);
                A0c.add(0, new AnonymousClass6gK());
            }
            AnonymousClass6CA.A0J(this.this$0.A08).A0G(A0c);
        } else {
            C06270Wx.A04(AnonymousClass6CA.A0J(this.this$0.A09), 2);
        }
        return C59022wD.A00;
    }
}
