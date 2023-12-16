package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.63S  reason: invalid class name */
public final class AnonymousClass63S extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass1RL $newsletter;
    public final /* synthetic */ AnonymousClass4GP $successCallback;
    public final /* synthetic */ AnonymousClass5SK $targetedNewsletter;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63S(AnonymousClass1RL r2, AnonymousClass5SK r3, UpdatesViewModel updatesViewModel, AnonymousClass4GP r5) {
        super(1);
        this.$targetedNewsletter = r3;
        this.this$0 = updatesViewModel;
        this.$newsletter = r2;
        this.$successCallback = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5CA r4 = (AnonymousClass5CA) obj;
        C162457s7.A0J(r4, 0);
        AnonymousClass5SK r1 = this.$targetedNewsletter;
        r1.A01 = false;
        if (r4 instanceof C988253j) {
            AnonymousClass1RL r2 = r1.A02;
            C372821q r12 = ((C988253j) r4).A00;
            C162457s7.A0J(r12, 0);
            r2.A07 = r12;
            if (r12 == C372821q.GUEST) {
                this.this$0.A0n.remove(this.$newsletter.A05());
            } else {
                AnonymousClass4GP r0 = this.$successCallback;
                if (r0 != null) {
                    r0.invoke();
                }
            }
            this.this$0.A0G();
        } else if (r4 instanceof C988353k) {
            UpdatesViewModel updatesViewModel = this.this$0;
            C95814uZ A05 = this.$newsletter.A05();
            C162457s7.A0D(A05);
            UpdatesViewModel.A00(A05, (C988353k) r4, updatesViewModel);
        }
        AnonymousClass08M r13 = this.this$0.A0U;
        C162457s7.A0J(r13, 0);
        C86634Kw.A1L(r13);
        return C59022wD.A00;
    }
}
