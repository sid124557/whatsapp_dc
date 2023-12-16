package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.7Q7  reason: invalid class name */
public final class AnonymousClass7Q7 {
    public Looper A00;
    public C177978gl A01;
    public C177988gm A02;
    public C158027jJ A03;
    public C1685685x A04;
    public C158427jx A05;
    public C178138h2 A06;
    public AnonymousClass7GA A07;
    public C178268hG A08;
    public C186668vk A09;
    public boolean A0A;
    public final Context A0B;
    public final C180628lN A0C;

    public AnonymousClass7Q7(Context context, C180628lN r8) {
        C1686686h r1 = new C1686686h();
        C126816Pk r5 = new C126816Pk(context);
        C1690987y r4 = new C1690987y(r1, new AnonymousClass88Y(context));
        C1685185s r3 = new C1685185s();
        AnonymousClass88U A002 = AnonymousClass88U.A00(context);
        C186668vk r12 = C186668vk.A00;
        C1685685x r0 = new C1685685x(r12);
        this.A0B = context;
        this.A0C = r8;
        this.A07 = r5;
        this.A06 = r4;
        this.A02 = r3;
        this.A08 = A002;
        this.A04 = r0;
        Looper myLooper = Looper.myLooper();
        this.A00 = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.A05 = C158427jx.A02;
        this.A03 = C158027jJ.A02;
        this.A01 = new C1685085r();
        this.A09 = r12;
    }
}
