package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Mj  reason: invalid class name and case insensitive filesystem */
public final class C66683Mj implements AnonymousClass4AF {
    public final AnonymousClass2O6 A00;
    public final C183538qC A01;
    public final CountDownLatch A02 = new CountDownLatch(1);

    public C66683Mj(AnonymousClass2O6 r3, C183538qC r4) {
        C18270x1.A10(r4, 1, r3);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void A01(Object obj, int i, int i2) {
        JniBridge jniBridge;
        long j;
        int i3;
        long j2;
        long A09;
        Object obj2 = obj;
        if (i == 11) {
            jniBridge = (JniBridge) this.A01.get();
            j = (long) i;
            A09 = 62;
        } else if (obj == null) {
            JniBridge.jvidispatchIIIO(4, (long) i2, (long) i, AnonymousClass0x9.A0r((JniBridge) this.A01.get()));
            return;
        } else if (obj instanceof String) {
            JniBridge.jvidispatchIIIOO(1, (long) i2, (long) i, obj2, AnonymousClass0x9.A0r((JniBridge) this.A01.get()));
            return;
        } else if (obj instanceof Integer) {
            jniBridge = (JniBridge) this.A01.get();
            j = (long) i;
            A09 = (long) AnonymousClass001.A0K(obj);
        } else if (obj instanceof Long) {
            jniBridge = (JniBridge) this.A01.get();
            j = (long) i;
            A09 = C18310x6.A0B(obj);
        } else if (obj instanceof Double) {
            JniBridge.jvidispatchIIIDO((long) i2, (long) i, ((Number) obj2).doubleValue(), AnonymousClass0x9.A0r((JniBridge) this.A01.get()));
            return;
        } else if (obj instanceof Boolean) {
            jniBridge = (JniBridge) this.A01.get();
            j = (long) i;
            i3 = 1;
            j2 = (long) i2;
            A09 = C18290x4.A09(AnonymousClass001.A1Z(obj) ? 1 : 0);
            JniBridge.jvidispatchIIIIO(i3, j2, j, A09, AnonymousClass0x9.A0r(jniBridge));
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "Unsupported attribute type: ", obj);
            C626936e.A0A(C18310x6.A0d(A0o));
            return;
        }
        i3 = 0;
        j2 = (long) i2;
        JniBridge.jvidispatchIIIIO(i3, j2, j, A09, AnonymousClass0x9.A0r(jniBridge));
    }

    public void Blk(Object obj, int i, int i2) {
        AnonymousClass2O6 r5 = this.A00;
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (AnonymousClass000.A1T((r5.A00.A05 > Thread.currentThread().getId() ? 1 : (r5.A00.A05 == Thread.currentThread().getId() ? 0 : -1)))) {
            A01(obj, i, i2);
        } else {
            r5.A01.execute(new C71583cL((Object) this, i3, obj2, i4, 3));
        }
    }

    public final void A00() {
        this.A00.A01.A01();
        try {
            this.A02.await();
        } catch (InterruptedException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wamruntime: unexpected thread interrupt (");
            Log.a(C18260x0.A04(e, A0o));
            C18300x5.A11();
        }
    }
}
