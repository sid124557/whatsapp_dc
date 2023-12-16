package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.61G  reason: invalid class name */
public final class AnonymousClass61G extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61G(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3Z6 r8 = (AnonymousClass3Z6) obj;
        Cursor cursor = (Cursor) r8.first;
        Iterable<C138966rI> iterable = (Iterable) r8.second;
        C87944Ws r6 = this.this$0.A06;
        if (r6 == null) {
            throw C18270x1.A0S("adapter");
        }
        C162457s7.A0J(iterable, 1);
        r6.A00 = cursor;
        int A0I = AnonymousClass8UG.A0I(C73783g4.A0b(iterable, 10));
        if (A0I < 16) {
            A0I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0I);
        for (C138966rI r0 : iterable) {
            String str = r0.A01;
            C162457s7.A0D(str);
            Iterable<C138956rH> iterable2 = (Iterable) r0.A00;
            ArrayList A0d = C73783g4.A0d(iterable2);
            for (C138956rH r02 : iterable2) {
                A0d.add(r02.A00);
            }
            linkedHashMap.put(str, AnonymousClass002.A0J(A0d));
        }
        r6.A01 = linkedHashMap;
        r6.A05();
        ReportToAdminMessagesActivity.A0C(this.this$0);
        ((AnonymousClass5UY) this.this$0.A0B.getValue()).A06(8);
        return C59022wD.A00;
    }
}
