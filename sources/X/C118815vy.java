package X;

import android.content.SharedPreferences;

/* renamed from: X.5vy  reason: invalid class name and case insensitive filesystem */
public final class C118815vy extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass5HE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118815vy(AnonymousClass5HE r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A03 = this.this$0.A00.A03("app_health");
        C162457s7.A0D(A03);
        return A03;
    }
}
