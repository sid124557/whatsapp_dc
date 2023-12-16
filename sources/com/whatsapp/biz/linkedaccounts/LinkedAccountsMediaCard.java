package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1LX;
import X.AnonymousClass4L0;
import X.AnonymousClass4SX;
import X.AnonymousClass65M;
import X.AnonymousClass8EI;
import X.C06560Yg;
import X.C106185Xy;
import X.C108775dX;
import X.C108915dl;
import X.C108985dt;
import X.C111095hX;
import X.C114495n8;
import X.C114705nT;
import X.C149947On;
import X.C153127ai;
import X.C165997xy;
import X.C172008Jg;
import X.C18280x3;
import X.C18300x5;
import X.C53682nU;
import X.C620733j;
import X.C91794l6;
import X.C989153s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import java.text.NumberFormat;
import java.util.Set;

public class LinkedAccountsMediaCard extends MediaCard {
    public int A00;
    public C111095hX A01;
    public C114705nT A02;
    public UserJid A03;
    public C153127ai A04;
    public C989153s A05;
    public AnonymousClass65M A06;
    public boolean A07;

    public void A07(AttributeSet attributeSet) {
        if (this.A00 == null) {
            super.A07(attributeSet);
            ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
            layoutParams.height = getThumbnailPixelSize();
            this.A00.setLayoutParams(layoutParams);
            this.A00 = getThumbnailPixelSize();
            TextView A0G = C18300x5.A0G(this, R.id.media_card_info);
            TextView A0G2 = C18300x5.A0G(this, R.id.media_card_empty_info);
            A0G.setAllCaps(false);
            A0G2.setAllCaps(false);
            this.A04.A00 = this.A00;
        }
    }

    public void A0A() {
        C114495n8 r1;
        C153127ai r3 = this.A04;
        if (!r3.A02) {
            Set<AnonymousClass8EI> set = r3.A0B;
            for (AnonymousClass8EI A022 : set) {
                r3.A02(A022);
            }
            set.clear();
            AnonymousClass1LX r12 = r3.A01;
            if (r12 != null) {
                r12.A03(false);
                r3.A01 = null;
            }
            r3.A02 = true;
        }
        C114705nT r2 = this.A02;
        if (r2 != null && (r1 = r2.A00) != null && r2.equals(r1.A01)) {
            r1.A01 = null;
        }
    }

    public void setup(UserJid userJid, boolean z, C108985dt r27, int i, Integer num, C108915dl r30, boolean z2, boolean z3, C106185Xy r33) {
        C108775dX r0;
        UserJid userJid2 = userJid;
        if (!userJid2.equals(this.A03)) {
            this.A03 = userJid2;
            C111095hX r13 = this.A01;
            C620733j r2 = this.A0B;
            AnonymousClass65M r1 = this.A06;
            C108915dl r16 = r30;
            C106185Xy r15 = r33;
            C620733j r18 = r2;
            C989153s r19 = this.A05;
            AnonymousClass65M r20 = r1;
            this.A02 = new C114705nT(r13, this, r15, r16, r27, r18, r19, r20, num, i, z3);
            this.A00.removeAllViews();
            if (!z || !this.A02.A02(userJid2)) {
                C114705nT r6 = this.A02;
                LinkedAccountsMediaCard linkedAccountsMediaCard = r6.A05;
                int i2 = r6.A02;
                Context context = r6.A03;
                int i3 = R.string.f11nameremoved;
                if (i2 == 0) {
                    i3 = R.string.f11nameremoved;
                }
                linkedAccountsMediaCard.setTitle(context.getString(i3));
                C165997xy r12 = r6.A08.A05;
                if (r12 != null) {
                    if (i2 == 0) {
                        r0 = r12.A00;
                    } else if (i2 == 1) {
                        r0 = r12.A01;
                    }
                    if (r0 != null) {
                        int i4 = r0.A00;
                        String str = r0.A01;
                        if (i4 > 0) {
                            int i5 = R.plurals.f9nameremoved;
                            if (i2 == 0) {
                                i5 = R.plurals.f9nameremoved;
                            }
                            String format = NumberFormat.getIntegerInstance(C620733j.A02(r6.A09)).format((long) i4);
                            String quantityString = context.getResources().getQuantityString(i5, i4, new Object[]{str, format});
                            int i6 = 35;
                            if (AnonymousClass000.A0B(context).densityDpi <= 240) {
                                i6 = 25;
                            }
                            int length = quantityString.length();
                            if (length > i6) {
                                int i7 = length - i6;
                                int length2 = str.length();
                                if (i7 > length2) {
                                    str = "";
                                } else {
                                    String substring = str.substring(0, length2 - i7);
                                    if (substring.length() < length2) {
                                        str = AnonymousClass000.A0X("... ", AnonymousClass000.A0l(substring));
                                    }
                                }
                            }
                            str = context.getResources().getQuantityString(i5, i4, AnonymousClass4L0.A0V(str, format, 2));
                        }
                        linkedAccountsMediaCard.setMediaInfo(str);
                    }
                }
                linkedAccountsMediaCard.setSeeMoreClickListener(new C172008Jg(r6));
                C114705nT r4 = this.A02;
                if (!r4.A01) {
                    r4.A05.A08((View.OnClickListener) null, 3);
                    r4.A01 = true;
                }
                C114705nT r5 = this.A02;
                int i8 = this.A00;
                if (r5.A02(userJid2)) {
                    r5.A01(userJid2);
                    return;
                }
                C114495n8 B0B = r5.A0B.B0B(r5, new C53682nU(userJid2, i8, i8, r5.A02, false, false, false));
                r5.A00 = B0B;
                B0B.A00();
                return;
            }
            this.A02.A01(userJid2);
        }
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A07(attributeSet);
    }

    public C91794l6 A03(ViewGroup.LayoutParams layoutParams, C149947On r3, int i) {
        C91794l6 A032 = super.A03(layoutParams, r3, i);
        AnonymousClass4SX.A00(this, A032);
        return A032;
    }

    public View getOpenProfileView() {
        View A0R = AnonymousClass001.A0R(C18280x3.A0D(this), this, R.layout.f8nameremoved);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = this.A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A0R.setLayoutParams(layoutParams);
        return C06560Yg.A02(A0R, R.id.linked_account_open_profile_layout);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkedAccountsMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }
}
