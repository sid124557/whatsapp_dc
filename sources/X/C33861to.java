package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1to  reason: invalid class name and case insensitive filesystem */
public class C33861to extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C56612sH A03;
    public final C66493Lq A04;
    public final C66503Lr A05;
    public final C27991fJ A06;
    public final WeakReference A07;
    public final List A08;
    public final List A09;

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A07);
        if (A0F != null && !A0F.isFinishing()) {
            A0F.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C89654ea A0F = C18320x8.A0F(this.A07);
        if (A0F != null && !A0F.isFinishing()) {
            A0F.BjL();
        }
    }

    public C33861to(C89654ea r2, C69263Wi r3, C64773Ex r4, AnonymousClass5ZU r5, C56612sH r6, C66493Lq r7, C66503Lr r8, C27991fJ r9, List list, List list2) {
        this.A03 = r6;
        this.A00 = r3;
        this.A05 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r7;
        this.A07 = AnonymousClass0x9.A14(r2);
        this.A06 = r9;
        this.A09 = list;
        this.A08 = list2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C66503Lr r7 = this.A05;
        C27991fJ r8 = this.A06;
        List list = this.A09;
        List list2 = this.A08;
        AnonymousClass2GX r6 = new AnonymousClass2GX(this);
        AnonymousClass31C r11 = r7.A06;
        String A032 = r11.A03();
        ArrayList A0s = AnonymousClass001.A0s();
        if (!list.isEmpty()) {
            A0s.add(C66503Lr.A01("promote", list));
        }
        if (!list2.isEmpty()) {
            A0s.add(C66503Lr.A01("demote", list2));
        }
        AnonymousClass36K A0J = AnonymousClass36K.A0J("admin", (AnonymousClass39V[]) null, C18280x3.A1a(A0s, 0));
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A032, 0);
        AnonymousClass39V.A05("xmlns", "w:g2", A0H);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A0H);
        AnonymousClass36K A0C = AnonymousClass36K.A0C(r8, A0J, A0H);
        C130066bK r4 = new C130066bK();
        r11.A0D(new AnonymousClass4KX(r4, r7, r6, 1), A0C, A032, 166, 32000);
        try {
            r4.get(32000, TimeUnit.MILLISECONDS);
            long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E < 500) {
                try {
                    Thread.sleep(500 - A0E);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e) {
            Log.w("modify-admins/timeout", e);
            this.A00.A0S(C70003Zm.A00(this, 13));
        }
        return null;
    }
}
