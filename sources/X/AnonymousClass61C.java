package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.61C  reason: invalid class name */
public final class AnonymousClass61C extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C92694n6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61C(C92694n6 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5S7 r11 = (AnonymousClass5S7) obj;
        C92694n6 r5 = this.this$0;
        ArrayList arrayList = r11.A02;
        int i = r11.A00;
        View view = r11.A01;
        UserJid A07 = AnonymousClass3ZH.A07(r5.A09);
        if (A07 != null) {
            Context context = r5.getContext();
            Intent A072 = C18320x8.A07();
            A072.setClassName(context.getPackageName(), "com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView");
            A072.putExtra("extra_business_jid", A07);
            A072.putExtra("extra_target_post_index", i);
            A072.putExtra("extra_account_type", 1);
            A072.putExtra("extra_is_v2_5_enabled", true);
            A072.putParcelableArrayListExtra("extra_post_list", arrayList);
            A072.putExtra("extra_entry_point", 1);
            Context context2 = r5.getContext();
            AnonymousClass5MG r2 = new AnonymousClass5MG(r5.getContext());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("thumb-transition-");
            C107275b2.A09(context2, A072, view, r2, AnonymousClass000.A0X(((C108855df) arrayList.get(i)).A01.A04, A0o));
            r5.A0C.A00(r5.A00, A07, 3);
        }
        return C59022wD.A00;
    }
}
