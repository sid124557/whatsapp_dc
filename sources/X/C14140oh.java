package X;

import android.content.SharedPreferences;

/* renamed from: X.0oh  reason: invalid class name and case insensitive filesystem */
public final class C14140oh extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0U8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14140oh(AnonymousClass0U8 r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final SharedPreferences invoke() {
        SharedPreferences A03 = this.this$0.A01.A03("backup_prefs");
        C162457s7.A0D(A03);
        return A03;
    }
}
