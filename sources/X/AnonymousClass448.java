package X;

import android.graphics.Bitmap;

/* renamed from: X.448  reason: invalid class name */
public final class AnonymousClass448 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $onError;
    public final /* synthetic */ AnonymousClass4GQ $onSuccess;
    public final /* synthetic */ AnonymousClass2SU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass448(AnonymousClass2SU r2, AnonymousClass4GQ r3, AnonymousClass4GQ r4) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
        this.$onSuccess = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C69263Wi r3;
        Runnable r2;
        Bitmap A00;
        AnonymousClass38W r6 = (AnonymousClass38W) obj;
        C162457s7.A0J(r6, 0);
        String str = r6.A00;
        AnonymousClass2SU r0 = this.this$0;
        if (str == null) {
            r3 = r0.A00;
            r2 = new C71273bq((Object) this.$onError, 0);
        } else {
            C49662gt r22 = (C49662gt) r0.A04.get();
            C162457s7.A0H(r22);
            C51942kd r02 = (C51942kd) C73723fy.A04(r22.A01(C18290x4.A12(new C632138j(str, (String) null)), false, false));
            if (r02 == null || (A00 = C57452tf.A00(r02.A00)) == null) {
                r3 = this.this$0.A00;
                r2 = new C71273bq((Object) this.$onError, 1);
            } else {
                C18270x1.A0j(C18270x1.A04(this.this$0.A02.A01), "pref_avatar_preview_cache_url", str);
                r3 = this.this$0.A00;
                r2 = C70133a0.A00(this.$onSuccess, A00, 10);
            }
        }
        r3.A0S(r2);
        return C59022wD.A00;
    }
}
