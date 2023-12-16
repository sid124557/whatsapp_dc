package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.864  reason: invalid class name */
public class AnonymousClass864 implements C180628lN {
    public boolean A00;
    public final Context A01;

    public AnonymousClass864(Context context, boolean z) {
        this.A01 = context;
        this.A00 = z;
    }

    public C187588xU[] B0y(Handler handler, C186238uy r11, C180698lU r12, C180748lZ r13, C186248uz r14) {
        ArrayList A0s = AnonymousClass001.A0s();
        Context context = this.A01;
        Handler handler2 = handler;
        A0s.add(new C126666Ov(context, handler2, C186638vh.A00, new AnonymousClass87R(this), r14));
        C186238uy r6 = r11;
        A0s.add(new C126676Ow(context, handler2, C160527no.A00(context), r6, C186968wE.A00, new C187058wN[0]));
        return (C187588xU[]) A0s.toArray(new C187588xU[0]);
    }
}
