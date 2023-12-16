package X;

import android.content.Context;

/* renamed from: X.8Wv  reason: invalid class name and case insensitive filesystem */
public final class C175038Wv extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass4QF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175038Wv(Context context, AnonymousClass4QF r3) {
        super(0);
        this.$context = context;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.$context;
        AnonymousClass4FS waWorkers = this.this$0.getWaWorkers();
        return new AnonymousClass5KS(context, this.this$0.getGlobalUI(), this.this$0.getHeroSettingProvider(), waWorkers);
    }
}
