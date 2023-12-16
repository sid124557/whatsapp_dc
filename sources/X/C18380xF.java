package X;

import android.app.IntentService;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.0xF  reason: invalid class name and case insensitive filesystem */
public abstract class C18380xF extends IntentService implements AnonymousClass4GJ {
    public final Object A00 = AnonymousClass002.A0D();
    public volatile AnonymousClass3YV A01;

    public void A04() {
        if (this instanceof DirectReplyService) {
            DirectReplyService directReplyService = (DirectReplyService) this;
            if (!directReplyService.A0A) {
                directReplyService.A0A = true;
                C64333Db r2 = ((C22031Ec) ((C64323Da) directReplyService.generatedComponent())).A06;
                directReplyService.A00 = C64333Db.A04(r2);
                directReplyService.A01 = C64333Db.A08(r2);
                directReplyService.A02 = C64333Db.A26(r2);
                directReplyService.A05 = C64333Db.A2o(r2);
                directReplyService.A06 = C64333Db.A3K(r2);
                directReplyService.A04 = (C113905mB) r2.A4w.get();
                directReplyService.A07 = (C619933b) r2.ALS.get();
                directReplyService.A08 = (AnonymousClass3XI) r2.A00.A7g.get();
                directReplyService.A03 = (C54122oD) r2.A6t.get();
                directReplyService.A09 = C64333Db.A74(r2);
                return;
            }
            return;
        }
        AndroidWear androidWear = (AndroidWear) this;
        if (!androidWear.A0A) {
            androidWear.A0A = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) androidWear.generatedComponent())).A06;
            androidWear.A00 = C64333Db.A04(r1);
            androidWear.A01 = C64333Db.A08(r1);
            androidWear.A02 = C64333Db.A26(r1);
            androidWear.A05 = C64333Db.A2o(r1);
            androidWear.A06 = C64333Db.A3L(r1);
            androidWear.A04 = (C113905mB) r1.A4w.get();
            androidWear.A07 = C64333Db.A66(r1);
            androidWear.A08 = (C619933b) r1.ALS.get();
            androidWear.A03 = (C54122oD) r1.A6t.get();
            androidWear.A09 = C64333Db.A74(r1);
        }
    }

    public final Object generatedComponent() {
        if (this.A01 == null) {
            synchronized (this.A00) {
                if (this.A01 == null) {
                    this.A01 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A01.generatedComponent();
    }

    public C18380xF(String str) {
        super(str);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }
}
