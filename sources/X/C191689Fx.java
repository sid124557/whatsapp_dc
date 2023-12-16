package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9Fx  reason: invalid class name and case insensitive filesystem */
public class C191689Fx extends C1902294r {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C69263Wi A04;
    public final C194329Sl A05;
    public final C194149Rt A06;
    public final AnonymousClass9VV A07;
    public final AnonymousClass4FS A08;
    public final String A09;
    public final String A0A;

    public C191689Fx(C69263Wi r8, C56612sH r9, C194329Sl r10, C194149Rt r11, AnonymousClass9VU r12, AnonymousClass9VV r13, AnonymousClass9W3 r14, AnonymousClass9VB r15, AnonymousClass9TR r16, AnonymousClass4FS r17, String str, String str2) {
        super(r9, r12, r14, r15, r16);
        this.A04 = r8;
        this.A08 = r17;
        this.A07 = r13;
        this.A0A = str;
        this.A05 = r10;
        this.A06 = r11;
        this.A09 = str2;
    }

    public final void A0H(C67993Rl r12, C194059Rk r13, AnonymousClass36K r14, String str) {
        C194059Rk r9 = r13;
        try {
            byte[] A12 = C1899693i.A12(r12, this.A0A.getBytes(C58152un.A0B));
            C194329Sl r8 = this.A05;
            String str2 = this.A09;
            ArrayList A0s = AnonymousClass001.A0s();
            if (r14 != null) {
                A0s.add(r14);
            }
            if (A12 != null) {
                A0s.add(new AnonymousClass36K("password", A12, new AnonymousClass39V[0]));
            }
            AnonymousClass9U5 r3 = r8.A05;
            AnonymousClass39V[] r4 = new AnonymousClass39V[4];
            AnonymousClass39V.A0B("action", "generate-payments-dyi-report", r4, 0);
            AnonymousClass39V.A05("version", "1", r4);
            AnonymousClass39V.A06("nonce", str, r4);
            AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, r4);
            r3.A0E(new C203899oU(r8.A00, r8.A03, r8.A01, r8, r9, 15), new AnonymousClass36K("account", r4, C18280x3.A1a(A0s, 0)), "get");
        } catch (Exception unused) {
            Log.e("DyiViewModel/request-report/sendDyiReportRequestWithPassword");
            r13.A00(C1899693i.A0M());
        }
    }

    public void A0J(String str) {
        A0I(new C194059Rk((C89644eZ) null, (PinBottomSheetDialogFragment) null, this, (String) null, -1), (AnonymousClass36K) null, str);
    }

    public void A0C() {
        Log.i("DyiViewModel/on-cleared");
        AnonymousClass9VV r3 = this.A07;
        String str = this.A09;
        if (r3.A01(str) == 3) {
            synchronized (r3) {
                C28251fy r1 = r3.A00;
                if (r1 != null) {
                    r1.A04(false);
                }
                r3.A0A.A0G(2, str);
            }
        }
    }

    public final void A0G(int i) {
        if (!this.A04.A0Y()) {
            Log.i("DyiViewModel/check-internet :: no internet connection aborting the action");
            C1899593h.A0p(this.A03, Integer.valueOf(i), new AnonymousClass34V(7));
        }
    }

    public void A0I(C194059Rk r11, AnonymousClass36K r12, String str) {
        String str2;
        Log.i("DyiViewModel/request-report");
        A0G(0);
        AnonymousClass9VV r5 = this.A07;
        long A0H = this.A04.A0H();
        String str3 = this.A09;
        synchronized (r5) {
            Log.i("dyiReportManager/on-report-requested");
            SharedPreferences.Editor A002 = C620933l.A00(r5.A0A);
            if ("personal".equals(str3)) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            C18270x1.A0i(A002, str2, A0H);
        }
        C06270Wx.A04(this.A02, 1);
        C67993Rl A012 = this.A05.A01("FB", "DYI-REPORT");
        C194059Rk r7 = r11;
        AnonymousClass36K r52 = r12;
        String str4 = str;
        if (A012 != null) {
            A0H(A012, r11, r12, str);
        } else {
            this.A06.A00(new C204869q3(r52, this, r7, str4, 2), "FB");
        }
    }
}
