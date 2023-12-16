package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1u0  reason: invalid class name and case insensitive filesystem */
public class C33981u0 extends AnonymousClass5ZM {
    public AnonymousClass4CK A00;
    public final C56972sr A01;
    public final C29291ia A02;
    public final C64223Cq A03;
    public final UserJid A04;
    public final WeakReference A05;
    public final CountDownLatch A06 = C18290x4.A14();

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A02.A07(this.A00);
        C89654ea A0F = C18320x8.A0F(this.A05);
        if (A0F != null) {
            A0F.BjL();
            A0F.A6T(C627736r.A0l(A0F, this.A04, (Integer) null, true, true), false);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C60982zU r2;
        C59812xW r0;
        if (this.A01.A0Y()) {
            r2 = new C60982zU(AnonymousClass227.A0C);
            r0 = C59812xW.A0D;
        } else {
            r2 = new C60982zU(AnonymousClass227.A0A);
            r0 = C59812xW.A0C;
        }
        r2.A00 = r0;
        r2.A02 = true;
        UserJid userJid = this.A04;
        if (userJid != null) {
            r2.A07.add(userJid);
        }
        if (!this.A03.A01(r2.A02()).A00()) {
            return null;
        }
        try {
            this.A06.await(C625635p.A0L, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException unused) {
            Log.w("ConversationRowContact/OpenBusinessProfileNotInContactListTask was interrupted while waiting for biz identity response.");
            return null;
        }
    }

    public void A09() {
        this.A02.A07(this.A00);
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A05);
        if (A0F != null) {
            A0F.BpA(0, R.string.f11nameremoved);
        }
        this.A02.A06(this.A00);
    }

    public C33981u0(C56972sr r2, C89644eZ r3, C29291ia r4, C64223Cq r5, UserJid userJid) {
        this.A05 = AnonymousClass0x9.A14(r3);
        this.A01 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = userJid;
        this.A00 = new AnonymousClass3Dn(this, userJid);
    }
}
