package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;

/* renamed from: X.5Tu  reason: invalid class name and case insensitive filesystem */
public class C105155Tu {
    public Runnable A00;
    public Runnable A01;
    public boolean A02;
    public final Handler A03 = AnonymousClass000.A0A();
    public final C53582nK A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final ContactDetailsCard A07;
    public final C64773Ex A08;
    public final AnonymousClass5ZU A09;
    public final C620633i A0A;
    public final C56612sH A0B;
    public final C620733j A0C;
    public final AnonymousClass1VX A0D;
    public final C40532Gt A0E;
    public final C43642Sx A0F;
    public final C153087ae A0G;
    public final C195219Wq A0H;
    public final AnonymousClass4FS A0I;
    public final boolean A0J;

    public void A00(AnonymousClass3ZH r8) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A03.removeCallbacksAndMessages(runnable);
        }
        Runnable runnable2 = this.A00;
        if (runnable2 != null) {
            this.A03.removeCallbacksAndMessages(runnable2);
        }
        String A002 = this.A04.A00(r8);
        if (!r8.A0Q() || TextUtils.isEmpty(A002)) {
            this.A07.setContactChatStatusVisibility(8);
            if (r8.A0Q() && this.A0D.A0X(5839)) {
                A01(r8);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A002.substring(0, 1).toUpperCase(C620733j.A02(this.A0C)));
        String A0X = AnonymousClass000.A0X(A002.substring(1), A0o);
        ContactDetailsCard contactDetailsCard = this.A07;
        contactDetailsCard.setContactChatStatusVisibility(0);
        contactDetailsCard.setContactChatStatus(A0X);
        if (A0X != null && this.A0D.A0X(5839)) {
            Context context = contactDetailsCard.getContext();
            if (!this.A02 || context == null || !A0X.equals(context.getString(R.string.f11nameremoved))) {
                C71653cS r2 = new C71653cS(this, 12, r8);
                this.A01 = r2;
                Handler handler = this.A03;
                handler.postDelayed(r2, 3000);
                if (context != null && A0X.equals(contactDetailsCard.getContext().getString(R.string.f11nameremoved))) {
                    C71323bv r22 = new C71323bv(21, A0X, this);
                    this.A00 = r22;
                    handler.postDelayed(r22, 6000);
                }
            }
        }
    }

    public final void A01(AnonymousClass3ZH r4) {
        C56612sH r1 = this.A0B;
        ContactDetailsCard contactDetailsCard = this.A07;
        String A012 = AnonymousClass31U.A01(contactDetailsCard.getContext(), r1, r4);
        if (!C107575bX.A0F(A012)) {
            contactDetailsCard.setContactTextStatus(A012);
        }
        this.A02 = true;
    }

    public void A02(String str) {
        if (str == null || str.isEmpty()) {
            this.A07.setUsername("");
        } else if (str.charAt(0) == '@') {
            this.A07.setUsername(str);
        }
    }

    public C105155Tu(C53582nK r2, C69263Wi r3, C56972sr r4, ContactDetailsCard contactDetailsCard, C64773Ex r6, AnonymousClass5ZU r7, C620633i r8, C56612sH r9, C620733j r10, AnonymousClass1VX r11, C95104sd r12, C40532Gt r13, C43642Sx r14, C153087ae r15, C195219Wq r16, AnonymousClass4FS r17, boolean z) {
        this.A0B = r9;
        this.A05 = r3;
        this.A0J = z;
        this.A0D = r11;
        this.A06 = r4;
        this.A0H = r16;
        this.A08 = r6;
        this.A04 = r2;
        this.A0A = r8;
        this.A09 = r7;
        this.A0C = r10;
        this.A07 = contactDetailsCard;
        contactDetailsCard.A0V = r12;
        this.A0G = r15;
        this.A0E = r13;
        this.A0I = r17;
        this.A0F = r14;
    }
}
