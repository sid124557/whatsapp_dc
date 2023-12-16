package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Am  reason: invalid class name and case insensitive filesystem */
public final class C63753Am implements C202879mj {
    public final /* synthetic */ AnonymousClass4GW A00;

    public C63753Am(AnonymousClass4GW r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Log.i("PersonalizedAvatarRepository/loadEffect Success");
        this.A00.BkD(obj);
    }

    public void BSl(AnonymousClass9KQ r3) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "PersonalizedAvatarRepository/loadEffect Failure: ", r3);
        AnonymousClass4GW r1 = this.A00;
        if (AnonymousClass46G.A04.get(r1) instanceof C834548l) {
            AnonymousClass3Z0.A02(new C22371Mu(r3), r1);
        } else {
            Log.i("PersonalizedAvatarRepository/loadEffect Skipping resumeWithException");
        }
    }
}
