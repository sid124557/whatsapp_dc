package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;

/* renamed from: X.4R4  reason: invalid class name */
public abstract class AnonymousClass4R4 extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A00(C64333Db r2, C88864av r3, ContactDetailsCard contactDetailsCard, C620733j r5) {
        contactDetailsCard.A0R = r5;
        contactDetailsCard.A0O = (C106995aW) r2.A4q.get();
        Object obj = r2.A3B.get();
        obj.getClass();
        contactDetailsCard.A0F = new C88734ai(obj);
        contactDetailsCard.A0P = (C34461vC) r2.A6N.get();
        contactDetailsCard.A0X = (C194079Rm) r2.A00.A8f.get();
        contactDetailsCard.A0I = (C44162Ux) r3.A0I.A3A.get();
        contactDetailsCard.A0L = (AnonymousClass64J) r2.AEN.get();
        contactDetailsCard.A0b = (C54482on) r2.A00.A7A.get();
    }

    public void A03() {
        if (this instanceof NewsletterDetailsCard) {
            NewsletterDetailsCard newsletterDetailsCard = (NewsletterDetailsCard) this;
            if (!newsletterDetailsCard.A08) {
                newsletterDetailsCard.A08 = true;
                C88864av r3 = (C88864av) ((C111685iW) newsletterDetailsCard.generatedComponent());
                C64333Db r2 = r3.A0K;
                newsletterDetailsCard.A0T = C86604Kt.A0Y(r2);
                newsletterDetailsCard.A0H = C86634Kw.A0U(r2);
                newsletterDetailsCard.A0c = C107695bk.A5b(r2);
                newsletterDetailsCard.A0J = C86614Ku.A0L(r2);
                newsletterDetailsCard.A0e = C86604Kt.A0g(r2);
                newsletterDetailsCard.A0U = C86604Kt.A0Z(r2);
                newsletterDetailsCard.A0N = C86634Kw.A0X(r2);
                newsletterDetailsCard.A0G = C86634Kw.A0T(r2);
                newsletterDetailsCard.A0Y = C86644Kx.A0Z(r2);
                newsletterDetailsCard.A0Q = C86604Kt.A0R(r2);
                newsletterDetailsCard.A0d = C86614Ku.A0n(r2);
                A00(r2, r3, newsletterDetailsCard, C86604Kt.A0W(r2));
                newsletterDetailsCard.A05 = C86614Ku.A0X(r2);
                newsletterDetailsCard.A07 = (C103985Pe) r2.A00.A8A.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ContactDetailsCard contactDetailsCard = (ContactDetailsCard) this;
            C88864av r32 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r1 = r32.A0K;
            contactDetailsCard.A0T = C86604Kt.A0Y(r1);
            contactDetailsCard.A0H = C86634Kw.A0U(r1);
            contactDetailsCard.A0c = C107695bk.A5b(r1);
            contactDetailsCard.A0J = C86614Ku.A0L(r1);
            contactDetailsCard.A0e = C86604Kt.A0g(r1);
            contactDetailsCard.A0U = C86604Kt.A0Z(r1);
            contactDetailsCard.A0N = C86634Kw.A0X(r1);
            contactDetailsCard.A0G = C86634Kw.A0T(r1);
            contactDetailsCard.A0Y = C86644Kx.A0Z(r1);
            contactDetailsCard.A0Q = C86604Kt.A0R(r1);
            contactDetailsCard.A0d = C86614Ku.A0n(r1);
            A00(r1, r32, contactDetailsCard, C86604Kt.A0W(r1));
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4R4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public AnonymousClass4R4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public AnonymousClass4R4(Context context) {
        super(context);
        A03();
    }
}
