package X;

import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.android.di.BaseEntryPoint;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public abstract class C18400xH extends Service {
    public C1222963v A00;
    public C620733j A01;

    public static C64333Db A00(C32451qQ r2) {
        C64333Db r1 = ((C22031Ec) ((C64323Da) r2.generatedComponent())).A06;
        r2.A01 = (C54622p1) r1.AFV.get();
        return r1;
    }

    public static void A01(Resources resources, C05610Ue r2, C32451qQ r3, int i, int i2) {
        r2.A0B(resources.getString(i));
        r3.A02(r2.A01(), (Integer) null, i2, 31);
    }

    public void attachBaseContext(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wabaseservice/hilt/");
        AnonymousClass000.A1A(this, A0o);
        AnonymousClass0x2.A18(A0o);
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) C389229y.A02(context, BaseEntryPoint.class);
        this.A01 = baseEntryPoint.BsW();
        C111365hy AIb = ((C64333Db) baseEntryPoint).AcK.A00.AIb();
        this.A00 = AIb;
        super.attachBaseContext(new C18550xs(context, AIb, this.A01));
    }
}
