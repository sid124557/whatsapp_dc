package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

/* renamed from: X.61B  reason: invalid class name */
public final class AnonymousClass61B extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92694n6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61B(C92694n6 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C92694n6 r6 = this.this$0;
        UserJid A07 = AnonymousClass3ZH.A07(r6.A09);
        if (A07 != null) {
            C89644eZ r3 = r6.A08;
            Intent A072 = C18320x8.A07();
            A072.setClassName(r3.getPackageName(), "com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity");
            A072.putExtra("jid", A07);
            AnonymousClass0RN.A00(r3, A072, (Bundle) null);
            r6.A0C.A00(r6.A00, A07, 4);
        }
        return C59022wD.A00;
    }
}
