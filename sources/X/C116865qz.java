package X;

import android.app.Activity;
import android.app.Application;
import com.whatsapp.calling.di.ActivityModule;
import com.whatsapp.gallery.di.GalleryModule;
import com.whatsapp.gallery.di.GalleryPickerFragmentModule;
import com.whatsapp.stickers.di.StickersDependencyBridgeModule;

/* renamed from: X.5qz  reason: invalid class name and case insensitive filesystem */
public class C116865qz implements AnonymousClass4C0 {
    public final Activity A00;
    public final AnonymousClass4C0 A01;
    public final Object A02 = AnonymousClass002.A0D();
    public volatile Object A03;

    public Object generatedComponent() {
        String A0R;
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    Activity activity = this.A00;
                    if (!(activity.getApplication() instanceof AnonymousClass4C0)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
                        if (AnonymousClass001.A1a(activity.getApplication(), Application.class)) {
                            A0R = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
                        } else {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("Found: ");
                            A0R = AnonymousClass000.A0R(activity.getApplication().getClass(), A0o2);
                        }
                        throw AnonymousClass000.A0I(A0R, A0o);
                    }
                    C88844at r0 = (C88844at) ((C116835qw) AnonymousClass29x.A00(C116835qw.class, this.A01));
                    AnonymousClass5IG r02 = new AnonymousClass5IG(r0.A04, r0.A05);
                    r02.A00 = activity;
                    this.A03 = new C88834as(activity, r02.A01, r02.A02, new ActivityModule(), new GalleryModule(), new GalleryPickerFragmentModule(), new StickersDependencyBridgeModule());
                }
            }
        }
        return this.A03;
    }

    public C116865qz(Activity activity) {
        this.A00 = activity;
        this.A01 = new C116875r0((C004805c) activity);
    }
}
