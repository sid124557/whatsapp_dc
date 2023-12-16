package X;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: X.91x  reason: invalid class name and case insensitive filesystem */
public class C1895991x implements OnFailureListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C1895991x(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    public final void onFailure(Exception exc) {
        int i = this.A03;
        C158857kf r6 = (C158857kf) this.A00;
        String str = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C184428ro r4 = (C184428ro) obj;
            C18260x0.A0R(str, exc);
            C18260x0.A1S(AnonymousClass001.A0o(), "GPIA prepare() failed to complete: ", exc);
            C47922e3 r3 = r6.A05;
            AnonymousClass22M r2 = AnonymousClass22M.A06;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("on_failure_exception");
            r3.A00(r2, exc, AnonymousClass000.A0X(C158857kf.A00(exc), A0o));
            r6.A07.A01(str, "_FAILURE");
            if (r4 != null) {
                r4.onFailure(exc);
                return;
            }
            return;
        }
        C18260x0.A0R(str, exc);
        C18260x0.A1P(AnonymousClass001.A0o(), "GPIA trigger() failed to complete: ", exc);
        C47922e3 r32 = r6.A05;
        AnonymousClass22M r22 = AnonymousClass22M.A07;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("on_failure_exception");
        r32.A00(r22, exc, AnonymousClass000.A0X(C158857kf.A00(exc), A0o2));
        r6.A07.A01(str, "_FAILURE");
        ((C184438rp) obj).onFailure(exc);
    }
}
