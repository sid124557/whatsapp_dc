package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1is  reason: invalid class name and case insensitive filesystem */
public final class C29471is extends C197739dn {
    public final /* synthetic */ AnonymousClass4DJ A00;
    public final /* synthetic */ C49892hG A01;
    public final /* synthetic */ C35721xK A02;

    public void A03(AnonymousClass34V r2) {
        C162457s7.A0J(r2, 0);
        this.A00.BS6(r2);
    }

    public void A04(AnonymousClass34V r2) {
        C162457s7.A0J(r2, 0);
        this.A00.BS6(r2);
    }

    public void A05(AnonymousClass36K r24) {
        AnonymousClass213 r8;
        boolean z;
        String str;
        AnonymousClass36K r4 = r24;
        C162457s7.A0J(r4, 0);
        try {
            ArrayList arrayList = null;
            AnonymousClass36K A022 = C41032Ir.A02(r4, this.A02);
            Class<String> cls = String.class;
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            Class<String> cls2 = cls;
            Long l = A0R;
            Long l2 = A0S;
            AnonymousClass36K r16 = r4;
            C626836d.A06(r16, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
            C35041wE r9 = (C35041wE) C626836d.A04(r4, C86304Jp.A00(18), new String[]{"account"});
            C626836d.A04(r4, new C86294Jo(A022, 4), new String[0]);
            C626836d.A0C(r4, new String[]{"account"}, 19).get(0);
            C49892hG r10 = this.A01;
            String valueOf = String.valueOf(r9.A03);
            if (C162457s7.A0P(valueOf, "INACTIVE")) {
                r8 = AnonymousClass213.INACTIVE;
            } else if (C162457s7.A0P(valueOf, "ACTIVE")) {
                r8 = AnonymousClass213.ACTIVE;
            } else {
                r8 = AnonymousClass213.NONE;
            }
            C138626qj r0 = r9.A01;
            if (r0 != null) {
                List<C138626qj> list = (List) r0.A00;
                arrayList = AnonymousClass001.A0s();
                if (!list.isEmpty()) {
                    for (C138626qj r02 : list) {
                        C34991w9 r03 = (C34991w9) r02.A00;
                        C162457s7.A0D(r03);
                        String str2 = r03.A00;
                        C162457s7.A0D(str2);
                        List<C138626qj> list2 = r03.A01;
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (!list2.isEmpty()) {
                            for (C138626qj r04 : list2) {
                                C138716qs r1 = (C138716qs) r04.A00;
                                C162457s7.A0D(r1);
                                long A03 = C18320x8.A03((Number) r1.A00);
                                C34861vw r05 = (C34861vw) r1.A01;
                                C162457s7.A0D(r05);
                                AnonymousClass39L A002 = r10.A00(r05);
                                C34861vw r06 = (C34861vw) r1.A02;
                                C162457s7.A0D(r06);
                                A0s.add(new C632538n(A002, r10.A00(r06), (int) A03));
                            }
                        }
                        arrayList.add(new C632638o("CREDIT_CARD", str2, A0s));
                    }
                }
            }
            C34951w5 r07 = r9.A02;
            if (r07 == null || (str = r07.A00) == null) {
                z = false;
            } else {
                z = str.equals("1");
            }
            this.A00.Bd7(new C632738p(new C631338b(z), r8, arrayList));
        } catch (AnonymousClass24Y e) {
            Log.e(C160757oG.A01("PaymentConfigActions", e.getMessage()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29471is(Context context, C40602Ha r2, AnonymousClass4DJ r3, C49892hG r4, C84104Ba r5, C35721xK r6) {
        super(context, r2, r5);
        this.A00 = r3;
        this.A02 = r6;
        this.A01 = r4;
    }
}
