package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public class C30651mn extends C54252oQ {
    public final /* synthetic */ C40782Hs A00;
    public final /* synthetic */ C40792Ht A01;
    public final /* synthetic */ AnonymousClass4B6 A02;
    public final /* synthetic */ AnonymousClass30X A03;
    public final /* synthetic */ String A04;

    public C30651mn(C40782Hs r1, C40792Ht r2, AnonymousClass4B6 r3, AnonymousClass30X r4, String str) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = str;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A02(AnonymousClass36K r5) {
        C40782Hs r0 = this.A00;
        String str = this.A04;
        SetAboutInfo setAboutInfo = r0.A00;
        setAboutInfo.A07 = true;
        Handler handler = setAboutInfo.A08;
        handler.removeMessages(0);
        handler.sendMessage(Message.obtain(handler, 1, str));
    }
}
