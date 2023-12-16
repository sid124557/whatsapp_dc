package com.whatsapp.conversation.comments;

import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass30N;
import X.AnonymousClass32Y;
import X.AnonymousClass33p;
import X.AnonymousClass36Y;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C106195Xz;
import X.C107395bF;
import X.C109345eT;
import X.C109475eg;
import X.C116985rC;
import X.C119415ww;
import X.C153167am;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C29041iB;
import X.C45042Yl;
import X.C47052cd;
import X.C48952fk;
import X.C50222hp;
import X.C52472lX;
import X.C53202mi;
import X.C55832qz;
import X.C56422rx;
import X.C56612sH;
import X.C56662sM;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C64773Ex;
import X.C69263Wi;
import X.C73853gB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class CommentActionsBottomSheet extends Hilt_CommentActionsBottomSheet {
    public C116985rC A00;
    public C69263Wi A01;
    public ListItemWithLeftIcon A02;
    public ListItemWithLeftIcon A03;
    public ListItemWithLeftIcon A04;
    public ListItemWithLeftIcon A05;
    public C56972sr A06;
    public C621033m A07;
    public C153167am A08;
    public C64773Ex A09;
    public C56422rx A0A;
    public AnonymousClass5ZU A0B;
    public C48952fk A0C;
    public C620633i A0D;
    public C56612sH A0E;
    public AnonymousClass33p A0F;
    public C620733j A0G;
    public C56982ss A0H;
    public C56892sj A0I;
    public C56662sM A0J;
    public C29041iB A0K;
    public AnonymousClass36Y A0L;
    public AnonymousClass5Y0 A0M;
    public AnonymousClass1VX A0N;
    public AnonymousClass4FV A0O;
    public AnonymousClass30N A0P;
    public C52472lX A0Q;
    public C53202mi A0R;
    public C106195Xz A0S;
    public C47052cd A0T;
    public C60152y5 A0U;
    public C624134x A0V;
    public C50222hp A0W;
    public C45042Yl A0X;
    public C55832qz A0Y;
    public AnonymousClass4FS A0Z;
    public C73853gB A0a;
    public C73853gB A0b;
    public final AnonymousClass66R A0c = C154517dI.A01(new C119415ww(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        AnonymousClass2z0 A032;
        ListItemWithLeftIcon listItemWithLeftIcon;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || (A032 = C107395bF.A03(bundle2, "")) == null)) {
            C55832qz r0 = this.A0Y;
            if (r0 != null) {
                C624134x A052 = r0.A05(A032);
                if (A052 != null) {
                    this.A0V = A052;
                    this.A05 = (ListItemWithLeftIcon) view.findViewById(R.id.view_security_code_btn);
                    this.A04 = (ListItemWithLeftIcon) view.findViewById(R.id.report_comment_btn);
                    this.A03 = (ListItemWithLeftIcon) view.findViewById(R.id.delete_comment_btn);
                    this.A02 = (ListItemWithLeftIcon) view.findViewById(R.id.copy_comment_btn);
                    C624134x r02 = this.A0V;
                    if (r02 == null) {
                        throw C18270x1.A0S("message");
                    }
                    boolean z = r02.A1J.A02;
                    ListItemWithLeftIcon listItemWithLeftIcon2 = this.A05;
                    if (z) {
                        C18270x1.A0p(listItemWithLeftIcon2);
                    } else {
                        AnonymousClass0x2.A0x(listItemWithLeftIcon2);
                        C624134x r03 = this.A0V;
                        if (r03 == null) {
                            throw C18270x1.A0S("message");
                        }
                        UserJid A053 = AnonymousClass32Y.A05(r03.A0n());
                        if (!(A053 == null || (listItemWithLeftIcon = this.A05) == null)) {
                            C109475eg.A00(listItemWithLeftIcon, this, A053, 4);
                        }
                    }
                    C624134x r04 = this.A0V;
                    if (r04 == null) {
                        throw C18270x1.A0S("message");
                    }
                    boolean z2 = r04.A1J.A02;
                    ListItemWithLeftIcon listItemWithLeftIcon3 = this.A04;
                    if (z2) {
                        C18270x1.A0p(listItemWithLeftIcon3);
                    } else {
                        AnonymousClass0x2.A0x(listItemWithLeftIcon3);
                        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A04;
                        if (listItemWithLeftIcon4 != null) {
                            C109345eT.A00(listItemWithLeftIcon4, this, 10);
                        }
                    }
                    ListItemWithLeftIcon listItemWithLeftIcon5 = this.A03;
                    if (listItemWithLeftIcon5 != null) {
                        C109345eT.A00(listItemWithLeftIcon5, this, 11);
                    }
                    ListItemWithLeftIcon listItemWithLeftIcon6 = this.A02;
                    if (listItemWithLeftIcon6 != null) {
                        C109345eT.A00(listItemWithLeftIcon6, this, 9);
                        return;
                    }
                    return;
                }
            } else {
                throw C18270x1.A0S("fMessageDatabase");
            }
        }
        A1K();
    }

    public void A0a() {
        super.A0a();
        ListItemWithLeftIcon listItemWithLeftIcon = this.A03;
        if (listItemWithLeftIcon != null) {
            listItemWithLeftIcon.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
    }
}
