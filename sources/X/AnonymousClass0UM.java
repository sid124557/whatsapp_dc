package X;

import android.content.Context;
import java.util.LinkedHashSet;

/* renamed from: X.0UM  reason: invalid class name */
public abstract class AnonymousClass0UM {
    public Object A00;
    public final Context A01;
    public final C16180sb A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final LinkedHashSet A04 = new LinkedHashSet();

    public abstract Object A03();

    public abstract void A04();

    public abstract void A05();

    public final void A01(C15360rD r4) {
        synchronized (this.A03) {
            LinkedHashSet linkedHashSet = this.A04;
            if (linkedHashSet.remove(r4) && linkedHashSet.isEmpty()) {
                A05();
            }
        }
    }

    public final void A02(Object obj) {
        synchronized (this.A03) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((C09160fk) this.A02).A02.execute(new C12060ku(this, C73723fy.A0F(this.A04)));
            }
        }
    }

    public AnonymousClass0UM(Context context, C16180sb r3) {
        this.A02 = r3;
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        this.A01 = applicationContext;
    }
}
