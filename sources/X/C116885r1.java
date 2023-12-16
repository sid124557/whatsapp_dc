package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* renamed from: X.5r1  reason: invalid class name and case insensitive filesystem */
public class C116885r1 implements AnonymousClass4C0 {
    public final C08310eF A00;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile Object A02;

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper A02(LayoutInflater layoutInflater, C08310eF r2) {
        return new C86674La(layoutInflater, r2);
    }

    public Object generatedComponent() {
        C003203q r1;
        C003203q r12;
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    C08310eF r5 = this.A00;
                    AnonymousClass07u r0 = r5.A0G;
                    if (r0 == null) {
                        r1 = null;
                    } else {
                        r1 = r0.A04;
                    }
                    if (r1 != null) {
                        Object[] A0L = AnonymousClass002.A0L();
                        A0L[0] = r1.getClass();
                        AnonymousClass2A2.A00("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", A0L, r1 instanceof AnonymousClass4C0);
                        AnonymousClass07u r02 = r5.A0G;
                        if (r02 == null) {
                            r12 = null;
                        } else {
                            r12 = r02.A04;
                        }
                        C88834as r03 = (C88834as) ((AnonymousClass3DZ) AnonymousClass29x.A00(AnonymousClass3DZ.class, r12));
                        C64333Db r3 = r03.A4Z;
                        C102435Iv r04 = new C102435Iv(r03.A4X, r03.A4Y, r3);
                        r04.A00 = r5;
                        C64333Db r32 = r04.A03;
                        this.A02 = new C88854au(r04.A01, r04.A02, r32);
                    } else {
                        throw AnonymousClass001.A0g("Hilt Fragments must be attached before creating the component.");
                    }
                }
            }
        }
        return this.A02;
    }

    public C116885r1(C08310eF r2) {
        this.A00 = r2;
    }

    public static ContextWrapper A01(Context context, C08310eF r1) {
        return C18320x8.A0T(context, r1);
    }
}
