package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.3F8  reason: invalid class name */
public final class AnonymousClass3F8 implements C182268o8 {
    public final C621033m A00;
    public final AnonymousClass30C A01;
    public final C54292oU A02;
    public final C66543Lv A03;
    public final AnonymousClass2Ze A04;
    public final AnonymousClass4FS A05;

    public AnonymousClass3F8(C621033m r2, AnonymousClass30C r3, C54292oU r4, C66543Lv r5, AnonymousClass2Ze r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r4, r2, r7, r5, r3);
        C162457s7.A0J(r6, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
    }

    public void Bgi(Context context, C624134x r14, AnonymousClass39W r15, int i) {
        AnonymousClass39P r4;
        List list;
        UserJid A0o;
        boolean A1U = C18270x1.A1U(context, r14);
        if ((context instanceof Activity) && (r4 = r15.A03) != null) {
            int i2 = i;
            if (r4.A03.size() > i2) {
                AnonymousClass395 r0 = (AnonymousClass395) r4.A03.get(i2);
                C162457s7.A0H(r0);
                try {
                    this.A01.A02(C111095hX.A02(context), r14, r0.A01, i2);
                } catch (JSONException e) {
                    Log.e("NativeFlowAction/handleRequest : ConversationRow exception processing NFM message", e);
                }
            } else if (r4.A01 == 2 && (list = r4.A04) != null && list.size() > 0 && (A0o = r14.A0o()) != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    if (next instanceof C97584yn) {
                        A0s.add(next);
                    }
                }
                r4.A00 = new AnonymousClass391(A1U);
                LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(A0s));
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C97584yn r02 = (C97584yn) it.next();
                    A0C.put(r02.A01, r02.A00.A00);
                }
                C621033m r7 = this.A00;
                long j = r14.A1L;
                String string = C54292oU.A00(this.A02).getString(R.string.f11nameremoved);
                String A0d = C18280x3.A0d(A0C);
                C31901p2 r5 = new C31901p2(r7.A1X.A04(A0o, A1U), r7.A0V.A0H());
                C624134x A002 = C55122pp.A00(r7.A1o, j);
                if (A002 != null) {
                    r7.A1a.A00(r5, A002);
                }
                r5.A00 = new AnonymousClass39N(AnonymousClass22W.EXTENSIONS_1, new AnonymousClass397("form_message", A0d), string);
                r7.A0l.A0V(r5);
                AnonymousClass2Ze r3 = this.A04;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("{\"cta\":\"");
                A0o2.append("form_message");
                r3.A00((Jid) null, (Integer) null, AnonymousClass000.A0X("\"}", A0o2), (String) null, 0, 4, A1U ? 1 : 0, A1U);
                C71333bw.A00(this.A05, r14, this, 36);
            }
        }
    }
}
