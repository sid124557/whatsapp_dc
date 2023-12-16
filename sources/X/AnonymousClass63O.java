package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.63O  reason: invalid class name */
public final class AnonymousClass63O extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Context $activityContext;
    public final /* synthetic */ C624134x $message;
    public final /* synthetic */ AnonymousClass39W $messageContent;
    public final /* synthetic */ C113045kn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63O(Context context, C113045kn r3, C624134x r4, AnonymousClass39W r5) {
        super(1);
        this.this$0 = r3;
        this.$activityContext = context;
        this.$message = r4;
        this.$messageContent = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C52332lJ r9 = (C52332lJ) obj;
        C113045kn r7 = this.this$0;
        Context context = this.$activityContext;
        C624134x r6 = this.$message;
        AnonymousClass39W r1 = this.$messageContent;
        C105145Tt r3 = r7.A01;
        r3.A01(10);
        AnonymousClass39E r5 = r1.A04;
        if (r5 != null) {
            AnonymousClass39A r0 = r1.A02;
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = null;
            }
            Intent A07 = C18320x8.A07();
            A07.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.ProductListActivity");
            A07.putExtra("message_content", r5);
            A07.putExtra("message_title", str);
            context.startActivity(A07);
            UserJid userJid = r5.A00;
            String str2 = r5.A01.A01;
            AnonymousClass5Y9 r2 = r7.A02;
            r2.A0P.add(new AnonymousClass8EV(r2, new C148917Kf(r7, r6, r5), str2));
            if (!r2.A09(new AnonymousClass7PB(r9, userJid, 0, (Integer) null, str2, r3.A02, false))) {
                C18260x0.A0r("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ", "Failed to send product request", AnonymousClass001.A0o());
            }
        }
        return C59022wD.A00;
    }
}
