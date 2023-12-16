package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4SL  reason: invalid class name */
public abstract class AnonymousClass4SL extends AnonymousClass035 implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A01(C64333Db r1, WDSButton wDSButton) {
        wDSButton.A04 = (AnonymousClass1VX) r1.A07.get();
        wDSButton.A02 = (C620733j) r1.AbU.get();
        wDSButton.A03 = (AnonymousClass1VW) r1.A03.get();
    }

    public void A03() {
        if (this instanceof AnonymousClass573) {
            AnonymousClass573 r2 = (AnonymousClass573) this;
            if (!r2.A04) {
                r2.A04 = true;
                C64333Db A002 = C88864av.A00(r2.generatedComponent());
                A01(A002, r2);
                r2.A02 = C86634Kw.A0Z(A002);
                r2.A00 = A002.AiI();
                r2.A01 = A002.AiJ();
                r2.A03 = C64333Db.A8y(A002);
            }
        } else if (this instanceof AnonymousClass572) {
            AnonymousClass572 r22 = (AnonymousClass572) this;
            if (!r22.A04) {
                r22.A04 = true;
                C64333Db A003 = C88864av.A00(r22.generatedComponent());
                A01(A003, r22);
                r22.A02 = C86634Kw.A0Z(A003);
                r22.A00 = A003.AiI();
                r22.A01 = A003.AiJ();
                r22.A03 = C64333Db.A8y(A003);
            }
        } else if (this instanceof AnonymousClass574) {
            AnonymousClass574 r23 = (AnonymousClass574) this;
            if (!r23.A05) {
                r23.A05 = true;
                C64333Db A004 = C88864av.A00(r23.generatedComponent());
                A01(A004, r23);
                r23.A03 = C86634Kw.A0Z(A004);
                r23.A01 = A004.AiI();
                r23.A02 = A004.AiJ();
                r23.A00 = C64333Db.A06(A004);
                r23.A04 = C64333Db.A8y(A004);
            }
        } else if (this instanceof C995456z) {
            C995456z r24 = (C995456z) this;
            if (!r24.A01) {
                r24.A01 = true;
                C88864av r1 = (C88864av) ((C111685iW) r24.generatedComponent());
                A01(r1.A0K, r24);
                r24.A00 = r1.A0I.ACU();
            }
        } else if (this instanceof AnonymousClass571) {
            AnonymousClass571 r25 = (AnonymousClass571) this;
            if (!r25.A04) {
                r25.A04 = true;
                C64333Db A005 = C88864av.A00(r25.generatedComponent());
                A01(A005, r25);
                r25.A02 = C86634Kw.A0Z(A005);
                r25.A00 = A005.AiI();
                r25.A01 = A005.AiJ();
                r25.A03 = C64333Db.A8y(A005);
            }
        } else if (this instanceof AnonymousClass570) {
            AnonymousClass570 r26 = (AnonymousClass570) this;
            if (!r26.A03) {
                r26.A03 = true;
                C64333Db A006 = C88864av.A00(r26.generatedComponent());
                A01(A006, r26);
                r26.A01 = C86634Kw.A0Z(A006);
                r26.A00 = A006.AiI();
                r26.A02 = C64333Db.A8y(A006);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A01(((C88864av) ((C111685iW) generatedComponent())).A0K, (WDSButton) this);
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

    public AnonymousClass4SL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public static C152447Yx A00(int i) {
        return new C152447Yx(i, i, R.color.f5nameremoved);
    }
}
