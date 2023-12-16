package X;

import com.whatsapp.R;

/* renamed from: X.43b  reason: invalid class name and case insensitive filesystem */
public final class C823043b extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $defaultBotLoadedCallback;
    public final /* synthetic */ C50192hm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823043b(C50192hm r2, AnonymousClass4GQ r3) {
        super(1);
        this.$defaultBotLoadedCallback = r3;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj != null) {
            this.$defaultBotLoadedCallback.invoke(obj);
        } else {
            this.this$0.A00.A0H(R.string.f11nameremoved, 0);
        }
        return C59022wD.A00;
    }
}
