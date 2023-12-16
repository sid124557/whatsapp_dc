package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Sp  reason: invalid class name and case insensitive filesystem */
public class C68293Sp implements AnonymousClass4EZ {
    public final /* synthetic */ C66503Lr A00;
    public final /* synthetic */ AnonymousClass4B6 A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public C68293Sp(C66503Lr r1, AnonymousClass4B6 r2, Runnable runnable, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = runnable;
        this.A01 = r2;
    }

    public void BQs(String str) {
    }

    public void BSN(AnonymousClass36K r3, String str) {
        Log.i("GroupXmppMethods/sendSetGroupAdminSetting error");
        this.A01.BkI(C57492tj.A01(r3));
    }

    public void BdM(AnonymousClass36K r2, String str) {
        if (r2.A0l(this.A03) != null) {
            this.A02.run();
        }
    }
}
