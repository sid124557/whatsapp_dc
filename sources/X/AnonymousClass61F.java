package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.61F  reason: invalid class name */
public final class AnonymousClass61F extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92764nD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61F(C92764nD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        C92764nD r3 = this.this$0;
        AnonymousClass5UY r2 = r3.A08;
        C162457s7.A0H(bool);
        boolean booleanValue = bool.booleanValue();
        C162457s7.A0J(r2, 0);
        if (!booleanValue) {
            r2.A06(8);
        } else {
            View A00 = AnonymousClass5UY.A00(r2, 0);
            C162457s7.A0D(A00);
            C109345eT.A00(C18280x3.A0E(A00, R.id.conversationRow_contextCard_addMembersButton), r3, 27);
        }
        return C59022wD.A00;
    }
}
