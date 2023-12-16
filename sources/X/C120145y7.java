package X;

import android.content.SharedPreferences;

/* renamed from: X.5y7  reason: invalid class name and case insensitive filesystem */
public final class C120145y7 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C102105Hm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120145y7(C102105Hm r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A03 = ((C60152y5) this.this$0.A00.get()).A03("pref_quick_action_bar_display_state");
        C162457s7.A0D(A03);
        return A03;
    }
}
