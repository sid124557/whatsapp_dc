package X;

import com.whatsapp.util.Log;

/* renamed from: X.8Yt  reason: invalid class name and case insensitive filesystem */
public final class C175538Yt extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C184428ro $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C158857kf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175538Yt(C184428ro r2, C158857kf r3, String str) {
        super(1);
        this.this$0 = r3;
        this.$perfTimerName = str;
        this.$listener = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00 = (C178938iL) obj;
        Log.d("GPIA prepare() successfully completed");
        this.this$0.A07.A01(this.$perfTimerName, "_SUCCESS");
        C184428ro r0 = this.$listener;
        if (r0 != null) {
            r0.onSuccess();
        }
        return C59022wD.A00;
    }
}
