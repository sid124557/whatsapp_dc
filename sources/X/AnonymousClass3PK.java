package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3PK  reason: invalid class name */
public final class AnonymousClass3PK implements AnonymousClass4D2 {
    public final C56722sS A00;
    public final C52352lL A01;
    public final C55832qz A02;

    public final void A00(AnonymousClass1A3 r4, C624134x r5) {
        DeviceJid A002;
        C624134x A0w;
        C56722sS r1 = this.A00;
        if (!r1.A04(r5) && !C624134x.A0b(r5)) {
            return;
        }
        if ((r1.A04(r5) || !(!C155477ey.A00(r5.A0o()) || (A0w = r5.A0w()) == null || (r5 = this.A02.A05(A0w.A1J)) == null)) && (A002 = this.A01.A00(r5)) != null) {
            String A07 = C627336j.A07(A002.userJid);
            if (!C107575bX.A0F(A07)) {
                AnonymousClass1ES A0O = C18280x3.A0O(r4);
                A07.getClass();
                A0O.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                A0O.botMessageInvokerJid_ = A07;
            }
        }
    }

    public AnonymousClass3PK(C56722sS r1, C52352lL r2, C55832qz r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public /* synthetic */ void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
    }
}
