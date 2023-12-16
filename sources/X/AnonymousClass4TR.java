package X;

import com.whatsapp.profile.ViewProfilePhoto;

/* renamed from: X.4TR  reason: invalid class name */
public abstract class AnonymousClass4TR extends C003203q implements AnonymousClass4GJ {
    public final Object A00 = AnonymousClass002.A0D();
    public volatile C116865qz A01;

    public void A5e() {
        ViewProfilePhoto.SavePhoto savePhoto = (ViewProfilePhoto.SavePhoto) this;
        if (!savePhoto.A00) {
            savePhoto.A00 = true;
            C64333Db r1 = ((C88834as) ((AnonymousClass3DZ) savePhoto.generatedComponent())).A4Z;
            savePhoto.A01 = C64333Db.A04(r1);
            savePhoto.A00 = (C64393Dh) r1.AS1.get();
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new C116865qz(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public AnonymousClass4TR() {
        C86604Kt.A1K(this, 76);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }
}
