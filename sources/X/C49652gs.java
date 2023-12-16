package X;

import com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2;
import com.whatsapp.util.Log;

/* renamed from: X.2gs  reason: invalid class name and case insensitive filesystem */
public final class C49652gs {
    public final AnonymousClass4C1 A00;
    public final AnonymousClass4C1 A01;
    public final AnonymousClass4C1 A02;
    public final C73853gB A03;

    public C49652gs(AnonymousClass4C1 r2, AnonymousClass4C1 r3, AnonymousClass4C1 r4, C73853gB r5) {
        C18260x0.A0a(r2, r3, r4, 2);
        this.A03 = r5;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public final Object A00(C84814Du r5, boolean z) {
        C51932kc r3 = (C51932kc) this.A02.get();
        if (((C54612p0) ((C43222Rg) this.A01.get()).A04.get()).A00() != null) {
            return C616131n.A00(r5, this.A03, new AvatarConfigRepository$hasAvatarAwait$2(this, r3, (C84814Du) null, z));
        }
        Log.e("AvatarConfigRepository/hasAvatarAwait avatar user does not exist");
        return C18320x8.A0U();
    }

    public final boolean A01() {
        Boolean A002 = ((C51932kc) this.A02.get()).A00();
        if (A002 != null) {
            return A002.booleanValue();
        }
        Log.i("AvatarRepository/unknown avatar config state, returning false.");
        return false;
    }
}
