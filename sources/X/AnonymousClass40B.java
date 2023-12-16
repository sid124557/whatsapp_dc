package X;

/* renamed from: X.40B  reason: invalid class name */
public final class AnonymousClass40B extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass8JP $epdJurisdictionAwareLogger;
    public final /* synthetic */ C84084Ay $profilohelperFactory;
    public final /* synthetic */ C54292oU $waContext;
    public final /* synthetic */ AnonymousClass4FS $waWorkers;
    public final /* synthetic */ AnonymousClass4FV $wamRunTime;
    public final /* synthetic */ C56672sN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40B(C54292oU r2, C56672sN r3, AnonymousClass4FV r4, C84084Ay r5, AnonymousClass8JP r6, AnonymousClass4FS r7) {
        super(0);
        this.this$0 = r3;
        this.$waContext = r2;
        this.$waWorkers = r7;
        this.$wamRunTime = r4;
        this.$profilohelperFactory = r5;
        this.$epdJurisdictionAwareLogger = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C56672sN r1 = this.this$0;
        C56612sH r3 = r1.A01;
        C54292oU r4 = this.$waContext;
        AnonymousClass4FS r9 = this.$waWorkers;
        AnonymousClass4FV r5 = this.$wamRunTime;
        C186568vZ r8 = r1.A05;
        C84084Ay r6 = this.$profilohelperFactory;
        AnonymousClass8JP r7 = this.$epdJurisdictionAwareLogger;
        if (!(r1 instanceof C23631Ua)) {
            if (r1 instanceof C23641Ub) {
                str = "PslPrefetchPerfTracker";
            } else if (r1 instanceof C23651Ud) {
                str = "PhoenixExtensionMetadataPerfTracker";
            }
            AnonymousClass316 r2 = new AnonymousClass316(r3, r4, r5, r6, r7, r8, r9, str, r1.A00);
            r2.A0A.A05 = true;
            return r2;
        }
        str = "PhoenixExtensionInitLogger";
        AnonymousClass316 r22 = new AnonymousClass316(r3, r4, r5, r6, r7, r8, r9, str, r1.A00);
        r22.A0A.A05 = true;
        return r22;
    }
}
