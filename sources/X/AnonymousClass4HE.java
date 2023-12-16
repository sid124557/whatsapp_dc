package X;

import java.util.Collection;

/* renamed from: X.4HE  reason: invalid class name */
public class AnonymousClass4HE extends C33741tc {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HE(AnonymousClass4HF r2, C26701cd r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r5 = (AnonymousClass0PJ) obj;
        if (r5 == null) {
            ((C49872hE) this.A00).A00((String) null, (Collection) null, true);
        } else {
            ((C49872hE) this.A00).A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HE(AnonymousClass4HF r2, C26711ce r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A01 = r3;
        this.A00 = r2;
    }
}
