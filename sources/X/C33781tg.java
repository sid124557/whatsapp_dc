package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tg  reason: invalid class name and case insensitive filesystem */
public class C33781tg extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C84894Ed A01;
    public final C369320h A02;
    public final WeakReference A03;

    public C33781tg(C89654ea r2, C69263Wi r3, C84894Ed r4, C369320h r5) {
        super(r2, true);
        this.A03 = AnonymousClass0x9.A14(r2);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null && !A0F.BHW()) {
            A0F.BpA(0, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null && !A0F.BHW()) {
            A0F.BjL();
            this.A01.BiY(this.A02);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C84894Ed r0 = this.A01;
        C369320h r4 = this.A02;
        ReportActivity reportActivity = (ReportActivity) r0;
        C102115Hn r6 = reportActivity.A06;
        C102125Ho r5 = new C102125Ho(r4, reportActivity);
        AnonymousClass31C r10 = r6.A01;
        String A032 = r10.A03();
        C18260x0.A0s("GdprXmppMethods/sendRequestGdprReport; iq=", A032, AnonymousClass001.A0o());
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "request", A0s);
        if (r4 == C369320h.NEWSLETTER) {
            AnonymousClass39V.A03("report_type", "newsletters", A0s);
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("gdpr", C18300x5.A1Z(A0s, 0));
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0E(A1W, 0);
        AnonymousClass39V.A05("xmlns", "urn:xmpp:whatsapp:account", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        AnonymousClass36K A0E = AnonymousClass36K.A0E(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        C130066bK r42 = new C130066bK();
        r10.A0D(new AnonymousClass4KX(r42, r6, r5, 16), A0E, A032, 167, 32000);
        try {
            r42.get(32000, TimeUnit.MILLISECONDS);
            long A0E2 = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E2 < 500) {
                try {
                    Thread.sleep(500 - A0E2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e) {
            Log.w("send-request-gdpr-report/timeout", e);
            this.A00.A0S(new C71283br((Object) this, 9));
        }
        return null;
    }
}
