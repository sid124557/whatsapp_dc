package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: X.5qy  reason: invalid class name and case insensitive filesystem */
public final class C116855qy implements AnonymousClass4C0 {
    public final View A00;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile Object A02;

    public static C116855qy A00(View view) {
        return new C116855qy(view);
    }

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    Class<AnonymousClass4C0> cls = AnonymousClass4C0.class;
                    View view = this.A00;
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context == AnonymousClass2A0.A00(context.getApplicationContext())) {
                        AnonymousClass2A2.A00("%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new Object[]{view.getClass()}, false);
                        context = null;
                    }
                    if (context instanceof AnonymousClass4C0) {
                        C88834as r0 = (C88834as) ((AnonymousClass3DZ) AnonymousClass29x.A00(AnonymousClass3DZ.class, (AnonymousClass4C0) context));
                        C64333Db r3 = r0.A4Z;
                        C102445Iw r02 = new C102445Iw(r0.A4X, r0.A4Y, r3);
                        r02.A00 = view;
                        C64333Db r32 = r02.A03;
                        this.A02 = new C88864av(r02.A01, r02.A02, r32);
                    } else {
                        throw AnonymousClass001.A0e(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{view.getClass()}));
                    }
                }
            }
        }
        return this.A02;
    }

    public C116855qy(View view) {
        this.A00 = view;
    }
}
