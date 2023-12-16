package X;

import com.whatsapp.util.Log;

/* renamed from: X.8Yu  reason: invalid class name and case insensitive filesystem */
public final class C175548Yu extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C184438rp $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C158857kf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175548Yu(C184438rp r2, C158857kf r3, String str) {
        super(1);
        this.this$0 = r3;
        this.$perfTimerName = str;
        this.$listener = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.d("GPIA trigger() successfully completed");
        this.this$0.A07.A01(this.$perfTimerName, "_SUCCESS");
        this.$listener.BdD(((C129066Zb) ((C1446872n) obj)).A00);
        return C59022wD.A00;
    }
}
