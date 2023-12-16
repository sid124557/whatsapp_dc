package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

/* renamed from: X.7QO  reason: invalid class name */
public final class AnonymousClass7QO {
    public final Context A00;
    public final AnonymousClass7OI A01;
    public final AnonymousClass7OI A02;
    public final C180348kt A03;
    public final C180348kt A04;
    public final C180348kt A05;
    public final C177728gM A06;
    public final AnonymousClass71L A07;
    public final AnonymousClass76P A08;
    public final C177798gT A09;
    public final AnonymousClass76Q A0A;
    public final AnonymousClass7AT A0B;
    public final C177808gU A0C;
    public final AnonymousClass7JB A0D;
    public final AnonymousClass71N A0E;
    public final AnonymousClass7FW A0F;
    public final C155997fr A0G;
    public final Set A0H;
    public final Set A0I;
    public final Set A0J;

    /* JADX INFO: finally extract failed */
    public AnonymousClass7QO(C149237Lo r5) {
        AnonymousClass76P r0;
        AnonymousClass76Q r02;
        AnonymousClass82K r03;
        C154687da.A00();
        this.A0D = new AnonymousClass7JB(r5.A03);
        Context context = r5.A02;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            this.A03 = new AnonymousClass82H((ActivityManager) systemService);
            this.A09 = new C1679283i();
            synchronized (AnonymousClass76P.class) {
                r0 = AnonymousClass76P.A00;
                if (r0 == null) {
                    r0 = new AnonymousClass76P();
                    AnonymousClass76P.A00 = r0;
                }
            }
            this.A08 = r0;
            this.A00 = context;
            this.A0B = new AnonymousClass7AT(new AnonymousClass71M());
            synchronized (AnonymousClass76Q.class) {
                r02 = AnonymousClass76Q.A00;
                if (r02 == null) {
                    r02 = new AnonymousClass76Q();
                    AnonymousClass76Q.A00 = r02;
                }
            }
            this.A0A = r02;
            this.A04 = AnonymousClass78I.A00;
            this.A05 = AnonymousClass78I.A01;
            try {
                C154687da.A00();
                AnonymousClass7OI r04 = new AnonymousClass7OI(new AnonymousClass7J3(context));
                C154687da.A00();
                this.A01 = r04;
                synchronized (AnonymousClass82K.class) {
                    r03 = AnonymousClass82K.A00;
                    if (r03 == null) {
                        r03 = new AnonymousClass82K();
                        AnonymousClass82K.A00 = r03;
                    }
                }
                this.A06 = r03;
                C154687da.A00();
                this.A0G = new C155997fr(30000);
                new AnonymousClass71P();
                AnonymousClass7FW r1 = new AnonymousClass7FW(new AnonymousClass7PM());
                this.A0F = r1;
                new AnonymousClass71O();
                C72063d7 r05 = C72063d7.A00;
                this.A0J = r05;
                this.A0I = r05;
                this.A0H = r05;
                this.A02 = this.A01;
                this.A0C = new C1679683m(r1.A01.A02.A00);
                this.A0E = r5.A00;
                this.A07 = new AnonymousClass71L();
                C154687da.A00();
            } catch (Throwable th) {
                C154687da.A00();
                throw th;
            }
        } else {
            throw AnonymousClass001.A0e("Required value was null.");
        }
    }
}
