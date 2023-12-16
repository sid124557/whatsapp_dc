package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63L  reason: invalid class name */
public final class AnonymousClass63L extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass1RL $newsletterInfo;
    public final /* synthetic */ AnonymousClass4GP $successCallback;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63L(AnonymousClass1RL r2, UpdatesFragment updatesFragment, AnonymousClass4GP r4) {
        super(1);
        this.this$0 = updatesFragment;
        this.$newsletterInfo = r2;
        this.$successCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        UpdatesViewModel updatesViewModel = this.this$0.A0q;
        if (updatesViewModel != null) {
            AnonymousClass1RL r5 = this.$newsletterInfo;
            AnonymousClass4GP r4 = this.$successCallback;
            C162457s7.A0J(r5, 0);
            C95814uZ A05 = r5.A05();
            C162457s7.A0D(A05);
            AnonymousClass08M r8 = updatesViewModel.A0U;
            Iterable iterable = (Iterable) r8.A07();
            if (iterable != null) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C162457s7.A0P(((AnonymousClass5SK) obj2).A02.A05(), A05)) {
                        break;
                    }
                }
                AnonymousClass5SK r3 = (AnonymousClass5SK) obj2;
                if (r3 != null) {
                    r3.A01 = true;
                    C86634Kw.A1L(r8);
                    if (AnonymousClass000.A1Y(r5.A07, C372821q.GUEST)) {
                        List list = updatesViewModel.A0n;
                        C95814uZ A052 = r5.A05();
                        C162457s7.A0D(A052);
                        list.add(0, A052);
                    }
                    updatesViewModel.A0j.A00(r5, AnonymousClass59F.RECOMMENDED_NEWSLETTERS, new AnonymousClass63S(r5, r3, updatesViewModel, r4));
                }
            }
            updatesViewModel.A0H();
        }
        return C59022wD.A00;
    }
}
