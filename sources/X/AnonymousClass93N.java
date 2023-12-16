package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.93N  reason: invalid class name */
public class AnonymousClass93N implements C85014Ep {
    public Object A00;
    public final int A01;

    public AnonymousClass93N(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZP(String str) {
        if (this.A01 != 0) {
            C106735a4 r4 = (C106735a4) this.A00;
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            boolean A013 = C61072zf.A01();
            int i2 = R.string.f11nameremoved;
            if (A013) {
                i2 = R.string.f11nameremoved;
            }
            r4.A0T.Box(AnonymousClass4L0.A0U(), i, i2);
            return;
        }
        throw AnonymousClass001.A0e("must not be called");
    }

    public void BZQ() {
        if (this.A01 != 0) {
            ((C106735a4) this.A00).A0T.Box(AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
            return;
        }
        throw AnonymousClass001.A0e("must not be called");
    }

    public void Beo(String str) {
        if (this.A01 != 0) {
            C106735a4 r4 = (C106735a4) this.A00;
            boolean A012 = C61072zf.A01();
            int i = R.string.f11nameremoved;
            if (A012) {
                i = R.string.f11nameremoved;
            }
            boolean A013 = C61072zf.A01();
            int i2 = R.string.f11nameremoved;
            if (A013) {
                i2 = R.string.f11nameremoved;
            }
            r4.A0T.Box(AnonymousClass4L0.A0U(), i, i2);
            return;
        }
        C33931tv r2 = (C33931tv) this.A00;
        r2.A00 = -2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("searchSupportTask/externalStorage/avail external storage not calculated, state=");
        C18260x0.A1L(A0o, r2.A04);
    }

    public void Bep() {
        if (this.A01 != 0) {
            ((C106735a4) this.A00).A0T.Box(AnonymousClass4L0.A0U(), R.string.f11nameremoved, R.string.f11nameremoved);
            return;
        }
        ((C33931tv) this.A00).A00 = -2;
        Log.i("searchSupportTask/externalStorage/avail external storage not calculated, permission denied");
    }
}
