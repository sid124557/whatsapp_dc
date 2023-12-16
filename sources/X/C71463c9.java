package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3c9  reason: invalid class name and case insensitive filesystem */
public class C71463c9 implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05 = 0;

    public C71463c9(C109665ez r2, C52722lw r3, String str, int i, int i2) {
        this.A02 = r3;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
    }

    public final void run() {
        C1228966g r0;
        Reference reference;
        C1228966g r1;
        if (this.A05 != 0) {
            AnonymousClass32N r12 = (AnonymousClass32N) this.A02;
            Context context = (Context) this.A03;
            String str = this.A04;
            int i = this.A00;
            if (r12.A00.A00 == null) {
                AnonymousClass356.A03("WfacManager/startWfacFlow/showLoginFailureNotificationIfNeeded");
                r12.A04.A0A();
                return;
            }
            AnonymousClass356.A03("WfacManager/startWfacFlow/launching-wfac-ban");
            Intent A002 = AnonymousClass32N.A00(context, str, (String) null, 14, i, 3);
            A002.setFlags(268468224);
            context.startActivity(A002);
            return;
        }
        String str2 = this.A04;
        int i2 = this.A00;
        int i3 = this.A01;
        Object obj = this.A03;
        ConcurrentHashMap concurrentHashMap = ((C52722lw) this.A02).A02.A00;
        Reference reference2 = (Reference) concurrentHashMap.get(str2);
        if (reference2 != null && (r0 = (C1228966g) reference2.get()) != null) {
            AnonymousClass0GC B6S = r0.B6S();
            AnonymousClass0GC r6 = AnonymousClass0GC.STARTED;
            if (AnonymousClass001.A1U(B6S.compareTo(r6)) && (reference = (Reference) concurrentHashMap.get(str2)) != null && (r1 = (C1228966g) reference.get()) != null && AnonymousClass001.A1U(r1.B6S().compareTo(r6))) {
                C110065fd BD8 = r1.BD8(i2, 3500, false);
                C162457s7.A0D(BD8);
                if (!(obj == null || i3 == 0)) {
                    BD8.A04(new AnonymousClass547(BD8, obj, (Object) null, 25), i3);
                    BD8.A02(AnonymousClass5Yj.A02(BD8.A03.A0J.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                }
                BD8.A01();
            }
        }
    }

    public C71463c9(Context context, AnonymousClass32N r3, String str, int i) {
        this.A02 = r3;
        this.A03 = context;
        this.A04 = str;
        this.A00 = i;
        this.A01 = 3;
    }
}
