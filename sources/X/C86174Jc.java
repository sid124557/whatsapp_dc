package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4Jc  reason: invalid class name and case insensitive filesystem */
public class C86174Jc implements AnonymousClass4F5 {
    public Object A00;
    public final int A01;

    public C86174Jc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BOl(C95814uZ r4, UserJid userJid, AnonymousClass2z0 r6, int i) {
        C72173dI r2;
        Runnable r1;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            r2 = ((C55022pf) obj).A09;
            r1 = new C70333aK(this, r4, r6, 36);
        } else {
            r2 = ((AnonymousClass11B) obj).A0N;
            r1 = new C71653cS(this, 48, r4);
        }
        r2.execute(r1);
    }

    public /* synthetic */ void BOm(C95814uZ r2, AnonymousClass2z0 r3) {
        if (this.A01 != 0) {
            Log.d("ConversationSketchLogger: onChatMessageRevoked");
        }
    }

    public /* synthetic */ void BOn(C95814uZ r4, AnonymousClass2z0 r5) {
        if (this.A01 != 0) {
            ((C55022pf) this.A00).A09.execute(new C70333aK(this, r4, r5, 37));
        }
    }

    public /* synthetic */ void BOo(AnonymousClass2z0 r4, List list) {
        if (this.A01 != 0) {
            ((C55022pf) this.A00).A09.execute(new C172578Lw(18));
        }
    }

    public /* synthetic */ void BW4(C95814uZ r2) {
        if (this.A01 != 0) {
            Log.d("ConversationSketchLogger: onMatMessageReceived");
        }
    }
}
