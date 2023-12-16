package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.863  reason: invalid class name */
public final class AnonymousClass863 implements C180628lN {
    public final Context A00;

    public AnonymousClass863(Context context) {
        C162457s7.A0J(context, 1);
        this.A00 = context;
    }

    public C187588xU[] B0y(Handler handler, C186238uy r19, C180698lU r20, C180748lZ r21, C186248uz r22) {
        Context context = this.A00;
        C186968wE r10 = C186968wE.A00;
        Handler handler2 = handler;
        return (C187588xU[]) AnonymousClass8UF.A0o(new C126666Ov(context, handler2, C186638vh.A00, r10, r22), new C126676Ow(context, handler2, C160527no.A00(context), r19, r10, new C187058wN[0]), new AnonymousClass6OH(handler2.getLooper(), r21)).toArray(new C187588xU[0]);
    }
}
