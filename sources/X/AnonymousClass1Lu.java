package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1Lu  reason: invalid class name */
public class AnonymousClass1Lu extends AnonymousClass3CG {
    public final C43422Sb A00;

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r21, C146787Bp r22, C151147Tp r23) {
        Intent intent;
        Bundle extras;
        C131266dJ r6 = (C131266dJ) r23;
        String str = r22.A00;
        C157967jD r3 = r21;
        if (str.equals("wa.action.commerce.SendNFMReplyMessage")) {
            List list = r3.A00;
            String A0n = AnonymousClass001.A0n(list, 0);
            String A0s = C18290x4.A0s(list);
            Map map = (Map) list.get(2);
            C43422Sb r2 = this.A00;
            Activity A01 = AnonymousClass8DJ.A01(r6);
            if (!(A01 == null || (intent = A01.getIntent()) == null || (extras = intent.getExtras()) == null)) {
                String string = extras.getString("chat_id");
                C95814uZ r9 = (C95814uZ) AnonymousClass32W.A00(string);
                String string2 = extras.getString("message_id");
                long j = extras.getLong("message_row_id", 0);
                String string3 = extras.getString("action_name");
                String string4 = extras.getString("flow_message_version");
                if (!(r9 == null || A0s == null || map == null || string2 == null || string3 == null)) {
                    JSONObject jSONObject = new JSONObject(map);
                    C621033m r8 = r2.A00;
                    if (A0n == null) {
                        A0n = "";
                    }
                    r8.A0J(r9, A0n, A0s, jSONObject.toString(), string4, j);
                    r2.A04.BkM(new C70503ab(r2, string2, string, string3, 3));
                    return null;
                }
            }
        } else if (str.equals("wa.action.commerce.ActionWithCallback")) {
            List list2 = r3.A00;
            String A0n2 = AnonymousClass001.A0n(list2, 0);
            Map map2 = (Map) AnonymousClass0x9.A0u(list2);
            AnonymousClass8DF A002 = AnonymousClass3CG.A00(list2, 2);
            C41182Jg r32 = new C41182Jg();
            r32.A01 = A002;
            r32.A00 = r6;
            C43422Sb r24 = this.A00;
            Activity A012 = AnonymousClass8DJ.A01(r6);
            C84184Bj r0 = (C84184Bj) r24.A05.get(A0n2);
            if (r0 != null) {
                r0.Bgk(A012, r32, map2);
            } else {
                r24.A01.A00(r32, A0n2).A00("unsupported_action");
                return null;
            }
        }
        return null;
    }

    public AnonymousClass1Lu(C43422Sb r3) {
        super("wa.action.commerce.SendNFMReplyMessage", "wa.action.commerce.ActionWithCallback");
        this.A00 = r3;
    }
}
