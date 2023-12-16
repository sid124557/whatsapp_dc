package X;

import com.whatsapp.updates.viewmodels.SearchUsecase;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.635  reason: invalid class name */
public final class AnonymousClass635 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass1RL $newsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass635(AnonymousClass1RL r2, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5CA r4 = (AnonymousClass5CA) obj;
        C162457s7.A0J(r4, 0);
        UpdatesViewModel updatesViewModel = this.this$0;
        if (updatesViewModel.A0A) {
            updatesViewModel.A0n.remove(this.$newsletter.A0I());
            ((SearchUsecase) C18300x5.A0d(this.this$0.A0r)).A03(this.$newsletter);
            if (r4 instanceof C988253j) {
                AnonymousClass1RL r2 = this.$newsletter;
                C372821q r1 = ((C988253j) r4).A00;
                C162457s7.A0J(r1, 0);
                r2.A07 = r1;
            } else if (r4 instanceof C988353k) {
                UpdatesViewModel updatesViewModel2 = this.this$0;
                C95814uZ A05 = this.$newsletter.A05();
                C162457s7.A0D(A05);
                UpdatesViewModel.A00(A05, (C988353k) r4, updatesViewModel2);
            }
        }
        return C59022wD.A00;
    }
}
