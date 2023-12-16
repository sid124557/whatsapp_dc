package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;

/* renamed from: X.5wM  reason: invalid class name and case insensitive filesystem */
public final class C119055wM extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CategorizedUserProblemsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119055wM(CategorizedUserProblemsFragment categorizedUserProblemsFragment) {
        super(0);
        this.this$0 = categorizedUserProblemsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Integer valueOf;
        Bundle bundle = this.this$0.A06;
        if (bundle != null && (valueOf = Integer.valueOf(bundle.getInt("index"))) != null) {
            return valueOf;
        }
        throw C18300x5.A0X();
    }
}
