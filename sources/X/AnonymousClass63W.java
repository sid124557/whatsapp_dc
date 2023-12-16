package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.63W  reason: invalid class name */
public final class AnonymousClass63W extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ boolean $isOpenFromPrimarySurface = true;
    public final /* synthetic */ C95804uY $jid;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ C105325Um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63W(C95804uY r2, C105325Um r3, WeakReference weakReference, int i) {
        super(1);
        this.$weakActivity = weakReference;
        this.$jid = r2;
        this.$entryPoint = i;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0U = C86664Kz.A0U(this.$weakActivity);
        if (A0U != null) {
            C95804uY r2 = this.$jid;
            int i = this.$entryPoint;
            boolean z = this.$isOpenFromPrimarySurface;
            C105325Um r4 = this.this$0;
            new C627736r();
            Intent putExtra = C627336j.A01(A0U, r2, i).putExtra("start_t", SystemClock.uptimeMillis());
            C162457s7.A0D(putExtra);
            if (z) {
                putExtra.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
            }
            AnonymousClass5VI.A00(putExtra, C18310x6.A0n(A0U));
            r4.A00.A0A(A0U, putExtra);
        }
        return C59022wD.A00;
    }
}
