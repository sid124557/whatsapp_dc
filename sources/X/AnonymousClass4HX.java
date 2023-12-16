package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4HX  reason: invalid class name */
public class AnonymousClass4HX implements AnonymousClass49M {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4HX(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void BeE(boolean z) {
        if (this.A03 != 0) {
            Context context = (Context) this.A01;
            C95814uZ r2 = (C95814uZ) this.A02;
            if (!z) {
                context.startActivity(C627736r.A0l(context, (UserJid) r2, C18320x8.A0W(), true, true));
                return;
            }
            return;
        }
        C50192hm r5 = (C50192hm) this.A00;
        AnonymousClass00M r4 = (AnonymousClass00M) this.A01;
        AnonymousClass4GQ r3 = (AnonymousClass4GQ) this.A02;
        C183538qC r1 = r5.A07;
        AnonymousClass3ZH r0 = ((AnonymousClass33R) r1.get()).A08;
        if (r0 != null) {
            r3.invoke(r0);
        } else {
            ((AnonymousClass33R) r1.get()).A04(r4, new C823043b(r5, r3), true);
        }
    }
}
