package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0Qe  reason: invalid class name and case insensitive filesystem */
public final class C04670Qe {
    public AnonymousClass0Y5 A00;
    public final Context A01;
    public final AnonymousClass6N6 A02;
    public final String A03;

    public View A00() {
        return this.A02;
    }

    public View A01(Context context) {
        AnonymousClass0Y5 r0 = this.A00;
        if (r0 == null) {
            C162457s7.A0M("bloksSurfaceController");
            throw AnonymousClass000.A0L();
        }
        Object obj = r0.A05(context).first;
        if (obj != null) {
            return (View) obj;
        }
        throw AnonymousClass001.A0e("Required value was null.");
    }

    public void A02() {
        AnonymousClass0Y5 r0 = this.A00;
        if (r0 == null) {
            C162457s7.A0M("bloksSurfaceController");
            throw AnonymousClass000.A0L();
        } else {
            r0.A09();
        }
    }

    public void A03() {
        AnonymousClass0Y5 r0 = this.A00;
        if (r0 == null) {
            C162457s7.A0M("bloksSurfaceController");
            throw AnonymousClass000.A0L();
        } else {
            r0.A0A();
        }
    }

    public void A04() {
        AnonymousClass0Y5 r0 = this.A00;
        if (r0 == null) {
            C162457s7.A0M("bloksSurfaceController");
            throw AnonymousClass000.A0L();
        }
        AnonymousClass0W9 r02 = r0.A00;
        if (r02 != null) {
            r02.A00();
            throw AnonymousClass000.A0L();
        }
        throw AnonymousClass001.A0e("RequestData does not exist in BloksSurfaceController.");
    }

    public void A05() {
        AnonymousClass0Y5 r0 = this.A00;
        if (r0 == null) {
            C162457s7.A0M("bloksSurfaceController");
            throw AnonymousClass000.A0L();
        } else {
            r0.A0B();
        }
    }

    public C04670Qe(AnonymousClass6N6 r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        Context context = r2.getContext();
        C162457s7.A0D(context);
        this.A01 = context;
    }
}
