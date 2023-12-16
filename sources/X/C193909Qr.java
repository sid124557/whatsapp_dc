package X;

import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Qr  reason: invalid class name and case insensitive filesystem */
public class C193909Qr {
    public final /* synthetic */ AnonymousClass9V8 A00;
    public final /* synthetic */ AnonymousClass9TM A01;

    public C193909Qr(AnonymousClass9V8 r1, AnonymousClass9TM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C195349Xk r7, AnonymousClass9KQ r8, File file) {
        Throwable th;
        List A002;
        AnonymousClass9TM r2 = this.A01;
        synchronized (r2.A06) {
            AnonymousClass9V8 r0 = r2.A00;
            AnonymousClass9V8 r5 = this.A00;
            if (r0 == r5) {
                r2.A00 = null;
                Map map = r2.A09;
                String str = r5.A04.A0A;
                if (map.remove(str) == r5) {
                    r2.A08.remove(r5);
                    r5.A00(C192369Jj.FINISHED);
                    r2.A07.add(new C201169jd(this, r7, r8, file));
                    try {
                        r2.A01();
                        A002 = r2.A00();
                    } catch (IllegalArgumentException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("old currentDownload uri=");
                        A0o.append(str);
                        A0o.append(" result=");
                        A0o.append(file);
                        th = new RuntimeException(AnonymousClass000.A0P(r8, " old download exception=", A0o), e);
                    }
                } else {
                    th = new IllegalStateException();
                }
            } else {
                th = new IllegalStateException();
            }
            throw th;
        }
        r2.A02(A002);
    }
}
