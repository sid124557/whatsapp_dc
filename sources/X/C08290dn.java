package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.0dn  reason: invalid class name and case insensitive filesystem */
public class C08290dn implements C16640tj, C15940sD, C17310vJ {
    public AnonymousClass08A A00 = null;
    public C17190ui A01;
    public AnonymousClass0PU A02 = null;
    public final C08310eF A03;
    public final AnonymousClass0N2 A04;

    public void A00() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass08A(this);
            AnonymousClass0PU r0 = new AnonymousClass0PU(this);
            this.A02 = r0;
            r0.A00();
        }
    }

    public AnonymousClass0N3 B6t() {
        C08310eF r4 = this.A03;
        Context applicationContext = r4.A0G().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                applicationContext = null;
                break;
            }
        }
        C010208a r3 = new C010208a();
        if (applicationContext != null) {
            r3.A00.put(AnonymousClass08X.A02, applicationContext);
        }
        C15120qo r0 = C06120Wi.A01;
        Map map = r3.A00;
        map.put(r0, r4);
        map.put(C06120Wi.A02, this);
        Bundle bundle = r4.A06;
        if (bundle != null) {
            map.put(C06120Wi.A00, bundle);
        }
        return r3;
    }

    public C17190ui B6u() {
        Application application;
        C08310eF r3 = this.A03;
        C17190ui B6u = r3.B6u();
        if (!B6u.equals(r3.A0N)) {
            this.A01 = B6u;
            return B6u;
        }
        C17190ui r2 = this.A01;
        if (r2 != null) {
            return r2;
        }
        Context applicationContext = r3.A0G().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        AnonymousClass08Z r22 = new AnonymousClass08Z(application, r3.A06, r3);
        this.A01 = r22;
        return r22;
    }

    public C08290dn(C08310eF r2, AnonymousClass0N2 r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public AnonymousClass0UG BCR() {
        A00();
        return this.A02.A01;
    }

    public AnonymousClass0N2 BEL() {
        A00();
        return this.A04;
    }

    public AnonymousClass0O9 getLifecycle() {
        A00();
        return this.A00;
    }
}
