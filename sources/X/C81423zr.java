package X;

/* renamed from: X.3zr  reason: invalid class name and case insensitive filesystem */
public final class C81423zr extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C620833k $groupParticipants;
    public final /* synthetic */ AnonymousClass1fI $listJid;
    public final /* synthetic */ AnonymousClass33A this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81423zr(C620833k r2, AnonymousClass33A r3, AnonymousClass1fI r4) {
        super(0);
        this.this$0 = r3;
        this.$listJid = r4;
        this.$groupParticipants = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass33A r1 = this.this$0;
        AnonymousClass1fI r0 = this.$listJid;
        C64773Ex r12 = r1.A02;
        AnonymousClass3ZH A09 = r12.A09(r0);
        if (A09 != null) {
            A09.A0M = "lid";
            r12.A0O(A09);
        }
        this.$groupParticipants.A00 = 3;
        return C59022wD.A00;
    }
}
