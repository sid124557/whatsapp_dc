package X;

import android.app.Application;
import android.app.Service;

/* renamed from: X.3YV  reason: invalid class name */
public final class AnonymousClass3YV implements AnonymousClass4C0 {
    public Object A00;
    public final Service A01;

    public Object generatedComponent() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        Service service = this.A01;
        Application application = service.getApplication();
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = application.getClass();
        AnonymousClass2A2.A00("Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", A0L, application instanceof AnonymousClass4C0);
        AnonymousClass2JF r0 = new AnonymousClass2JF(((C64333Db) AnonymousClass29x.A00(C64333Db.class, application)).AcK);
        r0.A00 = service;
        C22031Ec r1 = new C22031Ec(r0.A01);
        this.A00 = r1;
        return r1;
    }

    public AnonymousClass3YV(Service service) {
        this.A01 = service;
    }
}
