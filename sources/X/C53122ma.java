package X;

import android.view.View;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2ma  reason: invalid class name and case insensitive filesystem */
public final class C53122ma {
    public final C40162Et A00;
    public final AnonymousClass2PY A01;
    public final C50292hw A02;
    public final C620633i A03;
    public final C29431io A04;

    public final void A00(C89654ea r9) {
        C89654ea r3 = r9;
        if (r9 != null && !r9.isDestroyed() && !r9.isFinishing()) {
            View findViewById = r9.findViewById(16908298);
            ArrayList A0s = AnonymousClass001.A0s();
            new C110065fd(r3, C88694ab.A00(findViewById, R.string.f11nameremoved, 2000), this.A03, A0s, false).A01();
        }
    }

    public final void A01(C89654ea r6, C624134x r7) {
        String rawString;
        AnonymousClass2z0 r1 = r7.A1J;
        C95814uZ r0 = r1.A00;
        if (r0 != null && (rawString = r0.getRawString()) != null) {
            C50292hw r2 = this.A02;
            String str = r1.A01;
            C162457s7.A0C(str);
            r2.A01(rawString, str, (String) null, 0);
            A00(r6);
        }
    }

    public final void A02(C89654ea r12, C624134x r13, AnonymousClass4GP r14) {
        JSONObject jSONObject;
        boolean z = r13 instanceof AnonymousClass1n2;
        this.A04.A06(new C65103Gf(this, AnonymousClass0x9.A14(r12), r14));
        C40162Et r5 = this.A00;
        AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[2];
        AnonymousClass2z0 r2 = r13.A1J;
        AnonymousClass3Z6.A09("chat_jid", r2.A00, r4, 0);
        AnonymousClass3Z6.A09("message_key_id", r2.A01, r4, 1);
        Map A0F = C73813g7.A0F(r4);
        HashMap hashMap = r5.A00;
        hashMap.clear();
        hashMap.putAll(A0F);
        AnonymousClass2MT r22 = this.A01.A03;
        if (z) {
            jSONObject = new JSONObject(C57692u3.A04("is_image_feedback", "1"));
        } else {
            jSONObject = null;
        }
        r12.BpA(0, R.string.f11nameremoved);
        WeakReference A14 = AnonymousClass0x9.A14(r12);
        boolean A0D = C107405bG.A0D(r12);
        ((C04290Nq) r22.A01.get()).A00(new AnonymousClass4IN(A14, 1), (AnonymousClass39C) null, "com.bloks.www.whatsapp.bonsai.feedback.async", C56972sr.A06(r22.A00), AnonymousClass0x7.A0q(jSONObject), A14, A0D);
    }

    public C53122ma(C40162Et r1, AnonymousClass2PY r2, C50292hw r3, C620633i r4, C29431io r5) {
        C18260x0.A0c(r4, r5, r2, r1);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
