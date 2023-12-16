package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;
import com.whatsapp.chatinfo.view.custom.PnhListItem;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.EncryptionInfoView;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.4Qu  reason: invalid class name */
public abstract class AnonymousClass4Qu extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A00(C64333Db r1, C89364cO r2) {
        r2.A05 = (AnonymousClass1VX) r1.A07.get();
        r2.A04 = (C620733j) r1.AbU.get();
        r2.A03 = (C620633i) r1.AYG.get();
    }

    public void A03() {
        if (this instanceof EncryptionInfoView) {
            EncryptionInfoView encryptionInfoView = (EncryptionInfoView) this;
            if (!encryptionInfoView.A02) {
                encryptionInfoView.A02 = true;
                C64333Db A002 = C88864av.A00(encryptionInfoView.generatedComponent());
                A00(A002, encryptionInfoView);
                encryptionInfoView.A00 = C64333Db.A3G(A002);
                encryptionInfoView.A01 = C72343dZ.A00(A002.A82);
            }
        } else if (this instanceof C89324cH) {
            C89324cH r2 = (C89324cH) this;
            if (r2 instanceof C95724uM) {
                C95724uM r22 = (C95724uM) r2;
                if (!r22.A02) {
                    r22.A02 = true;
                    C88864av r1 = (C88864av) ((C111685iW) r22.generatedComponent());
                    A00(r1.A0K, r22);
                    r22.A00 = (C1223363z) r1.A0I.A3e.get();
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                A00(C88864av.A00(r2.generatedComponent()), r2);
            }
        } else if (this instanceof C89314cG) {
            C89314cG r23 = (C89314cG) this;
            if (r23 instanceof AnonymousClass4uO) {
                AnonymousClass4uO r24 = (AnonymousClass4uO) r23;
                if (!r24.A02) {
                    r24.A02 = true;
                    C64333Db A003 = C88864av.A00(r24.generatedComponent());
                    A00(A003, r24);
                    r24.A00 = C64333Db.A06(A003);
                    r24.A04 = C64333Db.A8y(A003);
                    r24.A01 = C64333Db.A39(A003);
                    r24.A03 = (AnonymousClass2W8) A003.AQv.get();
                    r24.A02 = C64333Db.A3G(A003);
                    r24.A05 = C72343dZ.A00(A003.A82);
                    r24.A01 = C86664Kz.A1A(A003);
                }
            } else if (!r23.A00) {
                r23.A00 = true;
                PhoneNumberPrivacyInfoView phoneNumberPrivacyInfoView = (PhoneNumberPrivacyInfoView) r23;
                C64333Db r12 = ((C88864av) ((C111685iW) r23.generatedComponent())).A0K;
                A00(r12, phoneNumberPrivacyInfoView);
                phoneNumberPrivacyInfoView.A00 = C64333Db.A06(r12);
                phoneNumberPrivacyInfoView.A04 = C64333Db.A8y(r12);
                phoneNumberPrivacyInfoView.A01 = C64333Db.A39(r12);
                phoneNumberPrivacyInfoView.A03 = (AnonymousClass2W8) r12.AQv.get();
                phoneNumberPrivacyInfoView.A02 = C64333Db.A3G(r12);
                phoneNumberPrivacyInfoView.A05 = C72343dZ.A00(r12.A82);
            }
        } else if (this instanceof C89354cM) {
            C89354cM r3 = (C89354cM) this;
            if (!r3.A09) {
                r3.A09 = true;
                C88864av r25 = (C88864av) ((C111685iW) r3.generatedComponent());
                C64333Db r13 = r25.A0K;
                A00(r13, r3);
                r3.A08 = C64333Db.A8y(r13);
                r3.A00 = C64333Db.A08(r13);
                r3.A07 = (C50452iC) r13.A00.ABs.get();
                r3.A04 = C86614Ku.A0Y(r13);
                r3.A01 = (C1224764n) r25.A0I.A3L.get();
            }
        } else if (this instanceof C89334cI) {
            C89334cI r26 = (C89334cI) this;
            if (!r26.A03) {
                r26.A03 = true;
                C88864av r14 = (C88864av) ((C111685iW) r26.generatedComponent());
                C64333Db r0 = r14.A0K;
                A00(r0, r26);
                r26.A02 = C86634Kw.A0p(r0);
                r26.A00 = (C1224664m) r14.A0I.A36.get();
            }
        } else if (this instanceof C89304cF) {
            C89304cF r15 = (C89304cF) this;
            if (r15 instanceof C95714uJ) {
                C95714uJ r16 = (C95714uJ) r15;
                if (!r16.A01) {
                    r16.A01 = true;
                    C64333Db A004 = C88864av.A00(r16.generatedComponent());
                    A00(A004, r16);
                    r16.A00 = C86634Kw.A0p(A004);
                }
            } else if (!r15.A00) {
                r15.A00 = true;
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) r15;
                C64333Db r02 = ((C88864av) ((C111685iW) r15.generatedComponent())).A0K;
                A00(r02, customNotificationsInfoView);
                customNotificationsInfoView.A00 = C86634Kw.A0p(r02);
            }
        } else if (this instanceof C89344cL) {
            C89344cL r27 = (C89344cL) this;
            if (!r27.A03) {
                r27.A03 = true;
                C88864av r17 = (C88864av) ((C111685iW) r27.generatedComponent());
                A00(r17.A0K, r27);
                C88834as r18 = r17.A0I;
                r27.A02 = (AnonymousClass48D) r18.A3X.get();
                r27.A00 = (C1224464k) r18.A35.get();
            }
        } else if (this instanceof PnhListItem) {
            PnhListItem pnhListItem = (PnhListItem) this;
            if (!pnhListItem.A00) {
                pnhListItem.A00 = true;
                A00(C88864av.A00(pnhListItem.generatedComponent()), pnhListItem);
            }
        } else if (this instanceof C89294cE) {
            C89294cE r28 = (C89294cE) this;
            if (r28 instanceof C91474k3) {
                C91474k3 r29 = (C91474k3) r28;
                if (!r29.A05) {
                    r29.A05 = true;
                    C88864av r32 = (C88864av) ((C111685iW) r29.generatedComponent());
                    C64333Db r19 = r32.A0K;
                    A00(r19, r29);
                    r29.A00 = C64333Db.A39(r19);
                    r29.A03 = (C49882hF) r19.AGU.get();
                    r29.A02 = C64333Db.A5A(r19);
                    r29.A04 = C86644Kx.A0W(r19);
                    r29.A01 = C64333Db.A3G(r19);
                    r29.A00 = C64333Db.A04(r19);
                    r29.A04 = C64333Db.A8y(r19);
                    r29.A01 = C64333Db.A26(r19);
                    r29.A02 = (AnonymousClass48D) r32.A0I.A3X.get();
                }
            } else if (!r28.A00) {
                r28.A00 = true;
                EphemeralMessagesInfoView ephemeralMessagesInfoView = (EphemeralMessagesInfoView) r28;
                C64333Db r110 = ((C88864av) ((C111685iW) r28.generatedComponent())).A0K;
                A00(r110, ephemeralMessagesInfoView);
                ephemeralMessagesInfoView.A00 = C64333Db.A39(r110);
                ephemeralMessagesInfoView.A03 = (C49882hF) r110.AGU.get();
                ephemeralMessagesInfoView.A02 = C64333Db.A5A(r110);
                ephemeralMessagesInfoView.A04 = C86644Kx.A0W(r110);
                ephemeralMessagesInfoView.A01 = C64333Db.A3G(r110);
            }
        } else if (this instanceof C89284cD) {
            C89284cD r111 = (C89284cD) this;
            if (!r111.A00) {
                r111.A00 = true;
                A00(C88864av.A00(r111.generatedComponent()), r111);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A00(((C88864av) ((C111685iW) generatedComponent())).A0K, (C89364cO) this);
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

    public AnonymousClass4Qu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
