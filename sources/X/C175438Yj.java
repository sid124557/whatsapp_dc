package X;

import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8Yj  reason: invalid class name and case insensitive filesystem */
public final class C175438Yj extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ CatalogCategoryGroupsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175438Yj(CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel, UserJid userJid) {
        super(1);
        this.this$0 = catalogCategoryGroupsViewModel;
        this.$bizJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r0;
        AnonymousClass7DP r8 = (AnonymousClass7DP) obj;
        C162457s7.A0J(r8, 0);
        if (r8 instanceof AnonymousClass6gG) {
            List<C43072Qq> list = ((AnonymousClass6gG) r8).A01;
            UserJid userJid = this.$bizJid;
            ArrayList A0c = C73783g4.A0c(list);
            for (C43072Qq r1 : list) {
                if (r1.A04) {
                    r0 = new C132926gL(r1, userJid);
                } else {
                    r0 = new AnonymousClass6gM(r1, userJid);
                }
                A0c.add(r0);
            }
            LinkedHashMap A0r = C18320x8.A0r();
            for (C43072Qq r12 : list) {
                if (!r12.A04) {
                    String str = r12.A01;
                    C162457s7.A0C(str);
                    ArrayList A0s = AnonymousClass001.A0s();
                    int i = 0;
                    do {
                        A0s.add(new AnonymousClass6gI());
                        i++;
                    } while (i < 3);
                    A0r.put(str, A0s);
                }
            }
            AnonymousClass6CA.A0J(this.this$0.A09).A0G(new C133036ga(A0c, A0r));
        }
        return C59022wD.A00;
    }
}
