package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
public class C68303Sq implements AnonymousClass4EZ {
    public final /* synthetic */ C66503Lr A00;
    public final /* synthetic */ AnonymousClass4B6 A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public C68303Sq(C66503Lr r1, AnonymousClass4B6 r2, Runnable runnable, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void BQs(String str) {
        Log.i("GroupXmppMethod/Leave group/delivery fail");
    }

    public void BSN(AnonymousClass36K r3, String str) {
        this.A01.BkI(C57492tj.A01(r3));
    }

    public void BdM(AnonymousClass36K r8, String str) {
        AnonymousClass36K A0l = r8.A0l("leave");
        if (A0l != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            List A0s2 = A0l.A0s("group");
            ArrayList A0s3 = AnonymousClass001.A0s();
            Iterator it = A0s2.iterator();
            while (it.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(it);
                String A0L = AnonymousClass36K.A0L(A0Y, "error");
                Jid A0g = A0Y.A0g(C27991fJ.class, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A0L == null) {
                    A0s.add(A0g);
                } else {
                    AnonymousClass0x2.A1F(A0g, Integer.valueOf(Integer.parseInt(A0L)), A0s3);
                }
            }
            if (A0s.size() > 0) {
                C66503Lr.A00(this.A00).A0c(A0s, this.A03);
            }
            if (A0s3.size() == 1) {
                this.A01.BkI(C18290x4.A03((Pair) AnonymousClass0x9.A0t(A0s3)));
                return;
            }
        }
        this.A02.run();
    }
}
