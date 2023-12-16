package X;

/* renamed from: X.3R9  reason: invalid class name */
public class AnonymousClass3R9 implements AnonymousClass4DC {
    public final AnonymousClass4DC A00;
    public final AnonymousClass2LT A01;
    public final C60902zM A02 = new C60902zM(AnonymousClass0x9.A1C(), 3, 200);
    public final AnonymousClass4FS A03;
    public final boolean A04;

    public void A00() {
        String str;
        AnonymousClass2LT r5 = this.A01;
        boolean z = this.A04;
        AnonymousClass31C r10 = r5.A01;
        String A032 = r10.A03();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        String A0Y = r5.A00.A0Y();
        C35351wj r4 = new C35351wj(new C35351wj(A032, 1), 3);
        C56052rL A012 = C56052rL.A01();
        C56052rL A042 = C56052rL.A04("first_party_migration");
        if (A0Y != null && C626836d.A0N(A0Y, true)) {
            C56052rL.A0D(A042, "device_id", A0Y);
        }
        A042.A0L(str, "intent", C35591x7.A00);
        r10.A0D(new AnonymousClass4KT(this, 9, r5), C41032Ir.A03(A042, A012, r4), A032, 357, 32000);
    }

    public void BRy() {
        Long A012 = this.A02.A01();
        if (A012 != null) {
            this.A03.Bkn(new C70023Zo(this, 18), "fpm/IntentToMigrateHandler/onError", A012.longValue());
            return;
        }
        this.A00.BRy();
    }

    public void onSuccess() {
        this.A00.onSuccess();
    }

    public AnonymousClass3R9(AnonymousClass4DC r6, AnonymousClass2LT r7, AnonymousClass4FS r8, boolean z) {
        this.A03 = r8;
        this.A01 = r7;
        this.A04 = z;
        this.A00 = r6;
    }
}
