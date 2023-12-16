package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0XL;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4R4;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C106545Zk;
import X.C106715a2;
import X.C106995aW;
import X.C109315eQ;
import X.C111095hX;
import X.C116985rC;
import X.C1230066r;
import X.C15930sC;
import X.C161357pU;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C187958y5;
import X.C1901794j;
import X.C194079Rm;
import X.C194369Sp;
import X.C195219Wq;
import X.C27981fH;
import X.C34461vC;
import X.C44162Ux;
import X.C53242mm;
import X.C53712nX;
import X.C54482on;
import X.C55682qk;
import X.C56972sr;
import X.C58422vE;
import X.C620733j;
import X.C71553cI;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C89644eZ;
import X.C95104sd;
import X.C95814uZ;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.whatsapp.jid.Jid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

public class ContactDetailsCard extends AnonymousClass4R4 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public TextSwitcher A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public C116985rC A0F;
    public C111095hX A0G;
    public C55682qk A0H;
    public C44162Ux A0I;
    public C56972sr A0J;
    public TextEmojiLabel A0K;
    public AnonymousClass64J A0L;
    public C89644eZ A0M;
    public C1230066r A0N;
    public C106995aW A0O;
    public C34461vC A0P;
    public AnonymousClass5ZU A0Q;
    public C620733j A0R;
    public AnonymousClass3ZH A0S;
    public AnonymousClass1VX A0T;
    public AnonymousClass4FV A0U;
    public C95104sd A0V;
    public C194369Sp A0W;
    public C194079Rm A0X;
    public C195219Wq A0Y;
    public C53712nX A0Z;
    public RequestPhoneNumberViewModel A0a;
    public C54482on A0b;
    public C106715a2 A0c;
    public C187958y5 A0d;
    public AnonymousClass4FS A0e;
    public boolean A0f = true;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i = true;
    public boolean A0j = true;
    public boolean A0k = true;
    public final C15930sC A0l = AnonymousClass6C6.A00(this, 88);

    public static /* synthetic */ void A01(ContactDetailsCard contactDetailsCard) {
        AnonymousClass3ZH r1 = contactDetailsCard.A0S;
        if (r1 != null) {
            contactDetailsCard.A0Y.A0k(contactDetailsCard, r1);
        }
    }

    public static /* synthetic */ void A02(ContactDetailsCard contactDetailsCard, C53242mm r8) {
        boolean z = !r8.A03;
        boolean z2 = r8.A04;
        Uri uri = r8.A00;
        int i = 0;
        if (z) {
            contactDetailsCard.A09.setVisibility(8);
            contactDetailsCard.A06.setVisibility(0);
            contactDetailsCard.A06.setEnabled(!z2);
            int i2 = R.string.f11nameremoved;
            if (z2) {
                i2 = R.string.f11nameremoved;
            }
            boolean z3 = contactDetailsCard.A0f;
            View view = contactDetailsCard.A06;
            if (z3) {
                ((WDSActionTile) view).setText(i2);
            } else {
                ((ContactDetailsActionIcon) view).setTitle(i2);
            }
            contactDetailsCard.A01.setVisibility(8);
            contactDetailsCard.A05.setVisibility(0);
            contactDetailsCard.setPhoneHiddenBubbleText(uri);
            return;
        }
        contactDetailsCard.A05.setVisibility(8);
        contactDetailsCard.A06.setVisibility(8);
        View view2 = contactDetailsCard.A01;
        if (!contactDetailsCard.A05()) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    private void setContactStatusHelper(String str) {
        TextSwitcher textSwitcher = this.A0A;
        if (textSwitcher != null) {
            if (textSwitcher.getVisibility() == 8) {
                this.A0A.setVisibility(0);
            }
            this.A0A.setText(str);
        }
    }

    public void A04(boolean z) {
        C95814uZ r0;
        RequestPhoneNumberViewModel requestPhoneNumberViewModel;
        C53242mm r1;
        AnonymousClass3ZH r02 = this.A0S;
        if (r02 != null) {
            r0 = r02.A0H;
        } else {
            r0 = null;
        }
        if (!(r0 instanceof C27981fH) || (requestPhoneNumberViewModel = this.A0a) == null || (r1 = (C53242mm) requestPhoneNumberViewModel.A01.A07()) == null || (r1.A03 && r1.A02)) {
            AnonymousClass3ZH r3 = this.A0S;
            if (r3 != null) {
                C95104sd r12 = this.A0V;
                if (r12 != null) {
                    r12.A0C = Boolean.valueOf(z);
                    r12.A0D = C18320x8.A0V(z);
                }
                this.A0N.Bpk(getContext(), r3, 6, z);
                return;
            }
            return;
        }
        int i = 3;
        if (z) {
            i = 4;
        }
        Integer valueOf = Integer.valueOf(i);
        C53712nX r03 = this.A0Z;
        if (r03 != null) {
            r03.A01(valueOf);
        }
    }

    public final boolean A05() {
        AnonymousClass3ZH r1;
        Jid A0M2;
        AnonymousClass3ZH A0B2;
        if (this.A0g || (r1 = this.A0S) == null || r1.A0G != null || (!this.A0h ? !(!r1.A0Q()) : (A0M2 = AnonymousClass4L0.A0M(r1)) == null || (A0B2 = this.A0P.A0B(A0M2)) == null || A0B2.A0Q()) || !C86664Kz.A1W(this.A0J)) {
            return false;
        }
        return true;
    }

    public void setAddContactButtonListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C86644Kx.A1Z(r3.A0T) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContact(X.AnonymousClass3ZH r4) {
        /*
            r3 = this;
            r3.A0S = r4
            X.2sr r0 = r3.A0J
            boolean r0 = X.C56972sr.A08(r0, r4)
            if (r0 == 0) goto L_0x0013
            X.1VX r0 = r3.A0T
            boolean r1 = X.C86644Kx.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0h = r0
            X.64J r2 = r3.A0L
            android.content.Context r1 = r3.getContext()
            com.whatsapp.TextEmojiLabel r0 = r3.A0K
            X.5YB r2 = r2.Azt(r1, r0)
            boolean r0 = r3.A0h
            if (r0 == 0) goto L_0x0048
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A09(r4, r1, r1, r0)
        L_0x002c:
            X.4uZ r2 = r4.A0H
            com.whatsapp.pnh.RequestPhoneNumberViewModel r1 = r3.A0a
            if (r1 == 0) goto L_0x0047
            X.4eZ r0 = r3.A0M
            if (r0 == 0) goto L_0x0047
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0047
            X.1fH r2 = (X.C27981fH) r2
            X.0Wx r2 = r1.A0D(r2)
            X.4eZ r1 = r3.A0M
            X.0sC r0 = r3.A0l
            r2.A0B(r1, r0)
        L_0x0047:
            return
        L_0x0048:
            r2.A08(r4)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.ContactDetailsCard.setContact(X.3ZH):void");
    }

    public void setContactChatStatus(String str) {
        if (this.A0T.A0X(5839)) {
            setContactStatusHelper(str);
        } else {
            this.A0B.setText(str);
        }
    }

    public void setContactChatStatusVisibility(int i) {
        if (!this.A0T.A0X(5839)) {
            this.A0B.setVisibility(i);
        }
    }

    public void setSubTitle(String str) {
        this.A0C.setText(str);
        this.A0C.setVisibility(C86614Ku.A01(str.isEmpty() ? 1 : 0));
    }

    public void setSubtitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0C.setOnLongClickListener(onLongClickListener);
    }

    public void setTitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0K.setOnLongClickListener(onLongClickListener);
    }

    public void setUsername(String str) {
        this.A0D.setText(str);
        this.A0D.setVisibility(C86614Ku.A01(str.isEmpty() ? 1 : 0));
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void setPhoneHiddenBubbleText(Uri uri) {
        Resources resources = getResources();
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass0x7.A1E(uri, A0L2, 0);
        C86664Kz.A1T(this.A0E, this.A0c.A03(this.A0E.getContext(), resources.getString(R.string.f11nameremoved, A0L2)));
        C18270x1.A0q(this.A0E, this.A0T);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A0f = C106545Zk.A04(this.A0T, (C58422vE) null, 5834);
        this.A0K = AnonymousClass0x7.A0K(this, R.id.contact_title);
        if (this.A0k) {
            this.A04 = C06560Yg.A02(this, R.id.action_pay);
        }
        if (this.A0i) {
            this.A01 = C06560Yg.A02(this, R.id.action_add_person);
            this.A03 = C06560Yg.A02(this, R.id.action_call_plus);
            this.A02 = C06560Yg.A02(this, R.id.action_call);
            this.A08 = C06560Yg.A02(this, R.id.action_message);
            this.A07 = C06560Yg.A02(this, R.id.action_search_chat);
            this.A09 = C06560Yg.A02(this, R.id.action_videocall);
            this.A06 = C06560Yg.A02(this, R.id.action_request_phone_number);
        }
        this.A0C = C18300x5.A0G(this, R.id.contact_subtitle);
        this.A0D = C18300x5.A0G(this, R.id.contact_username);
        this.A0B = C18300x5.A0G(this, R.id.contact_chat_status);
        if (this.A0j) {
            this.A05 = C06560Yg.A02(this, R.id.phone_number_hidden_container);
            this.A0E = C18300x5.A0G(this, R.id.phone_number_hidden_text);
        }
        if (getContext() instanceof C89644eZ) {
            C89644eZ r0 = (C89644eZ) C111095hX.A03(getContext(), C89644eZ.class);
            this.A0M = r0;
            AnonymousClass0XL A0H2 = AnonymousClass0x9.A0H(r0);
            if (this.A0k) {
                this.A0W = this.A0X.A00(getContext(), this.A0M, (C1901794j) A0H2.A01(C1901794j.class), (Runnable) null, new C71553cI((Object) this, 17), false);
            }
            if (this.A0j) {
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = (RequestPhoneNumberViewModel) A0H2.A01(RequestPhoneNumberViewModel.class);
                this.A0a = requestPhoneNumberViewModel;
                this.A0Z = this.A0I.A00(this.A0M, requestPhoneNumberViewModel);
            }
        }
        if (this.A0T.A0X(5839)) {
            C86604Kt.A1A(this.A0B);
            TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.status_text_switcher);
            this.A0A = textSwitcher;
            if (textSwitcher != null) {
                textSwitcher.setInAnimation(getContext(), R.anim.f0nameremoved);
                this.A0A.setOutAnimation(getContext(), R.anim.f0nameremoved);
            }
        }
        if (!(this instanceof NewsletterDetailsCard)) {
            C109315eQ.A01(this.A08, this, 47);
            C109315eQ.A01(this.A07, this, 48);
            C109315eQ.A01(this.A03, this, 49);
            AnonymousClass0x2.A0z(this.A04, this, 0);
            AnonymousClass0x2.A0z(this.A02, this, 1);
            AnonymousClass0x2.A0z(this.A09, this, 2);
            AnonymousClass0x2.A0z(this.A06, this, 3);
        }
    }

    public void setContactInfoLoggingEvent(C95104sd r1) {
        this.A0V = r1;
    }

    public void setContactTextStatus(String str) {
        setContactStatusHelper(str);
    }

    public void setCurrencyIcon(C161357pU r5) {
        int A002 = C195219Wq.A00(r5);
        if (A002 != 0) {
            View view = this.A04;
            if (view instanceof WDSActionTile) {
                WDSActionTile wDSActionTile = (WDSActionTile) view;
                wDSActionTile.setIcon(A002);
                wDSActionTile.setText((int) R.string.f11nameremoved);
            } else if (view instanceof ContactDetailsActionIcon) {
                ContactDetailsActionIcon contactDetailsActionIcon = (ContactDetailsActionIcon) view;
                contactDetailsActionIcon.A02.setImageResource(A002);
                contactDetailsActionIcon.setTitle(R.string.f11nameremoved);
            } else {
                Log.e("ContactDetailsCard/setCurrencyIcon unable to set paymentButton Icon and Title");
            }
        } else {
            this.A04.setVisibility(8);
            C55682qk r3 = this.A0H;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Currency icon for country ");
            A0o.append(r5.A03);
            r3.A0A("ContactDetailsCard/PayButton", true, AnonymousClass000.A0X(" missing", A0o));
        }
    }

    public void setInteropContactInfo(boolean z) {
        this.A0g = z;
    }

    public void setPaymentEligibility(int i) {
        this.A00 = i;
    }

    public void setProfileEntryPoint(Integer num) {
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactDetailsCard(Context context) {
        super(context);
    }
}
