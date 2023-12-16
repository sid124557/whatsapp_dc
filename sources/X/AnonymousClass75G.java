package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.75G  reason: invalid class name */
public final class AnonymousClass75G {
    public static final AnonymousClass6OD A00(Context context, C177988gm r8, C180628lN r9, AnonymousClass7GA r10, AnonymousClass1VX r11) {
        AnonymousClass7Q7 r2;
        C162457s7.A0J(r11, 0);
        C18260x0.A0R(context, r10);
        if (r11.A0X(6761)) {
            r2 = new AnonymousClass7Q7(context, r9);
            boolean z = !r2.A0A;
            C161487pm.A04(z);
            r2.A07 = r10;
            C161487pm.A04(z);
            r2.A02 = r8;
            AnonymousClass7ME r0 = new AnonymousClass7ME(context);
            r0.A02 = false;
            AnonymousClass88U r3 = new AnonymousClass88U(r0.A03, r0.A00, r0.A01, false);
            boolean z2 = !r2.A0A;
            C161487pm.A04(z2);
            r2.A08 = r3;
            C161487pm.A04(z2);
            r2.A0A = true;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            C186668vk r5 = C186668vk.A00;
            C1685685x r4 = new C1685685x(r5);
            AnonymousClass88U A00 = AnonymousClass88U.A00(context);
            C1690987y r1 = new C1690987y(new C1686686h(), new AnonymousClass88Y(context));
            r2 = new AnonymousClass7Q7(context, r9);
            boolean z3 = !r2.A0A;
            C161487pm.A04(z3);
            r2.A07 = r10;
            C161487pm.A04(z3);
            r2.A06 = r1;
            C161487pm.A04(z3);
            r2.A02 = r8;
            C161487pm.A04(z3);
            r2.A08 = A00;
            C161487pm.A04(z3);
            r2.A04 = r4;
            C161487pm.A04(z3);
            C161487pm.A04(z3);
            r2.A09 = r5;
            C161487pm.A04(z3);
            r2.A00 = myLooper;
        }
        return new AnonymousClass6OD(r2);
    }
}
