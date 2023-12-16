package com.whatsapp.conversation.selection;

import X.AnonymousClass0x9;
import X.AnonymousClass3XA;
import X.AnonymousClass4SG;
import X.AnonymousClass5DV;
import X.AnonymousClass5IY;
import X.AnonymousClass5R7;
import X.AnonymousClass5ZU;
import X.AnonymousClass61O;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C1001359q;
import X.C103175Lv;
import X.C107695bk;
import X.C116985rC;
import X.C117625sE;
import X.C119555xA;
import X.C119565xB;
import X.C124086Ax;
import X.C124266Bp;
import X.C154517dI;
import X.C18270x1;
import X.C27821ej;
import X.C60152y5;
import X.C621033m;
import X.C64333Db;
import X.C64773Ex;
import X.C70133a0;
import X.C86604Kt;
import X.C87654Ud;
import X.C88734ai;
import X.C88834as;
import X.C93314oJ;
import X.C93714pB;
import X.C94024pj;
import X.C94084pr;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;

public final class SingleSelectedMessageActivity extends C94084pr {
    public C116985rC A00;
    public AnonymousClass5DV A01;
    public C621033m A02;
    public C64773Ex A03;
    public AnonymousClass5ZU A04;
    public C94024pj A05;
    public C93714pB A06;
    public C87654Ud A07;
    public AnonymousClass5IY A08;
    public C27821ej A09;
    public EmojiSearchProvider A0A;
    public C60152y5 A0B;
    public ReactionsTrayViewModel A0C;
    public Boolean A0D;
    public boolean A0E;
    public final AnonymousClass66R A0F;
    public final AnonymousClass66R A0G;

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A05 = (AnonymousClass5R7) r3.A2p.get();
            this.A02 = (C103175Lv) A2W.A0j.get();
            this.A02 = C64333Db.A08(r2);
            this.A09 = C86604Kt.A0X(r2);
            this.A03 = C64333Db.A26(r2);
            this.A04 = C64333Db.A28(r2);
            this.A0A = C107695bk.A1n(r3);
            this.A08 = C107695bk.A1m(r3);
            this.A00 = C88734ai.A00(r2.A3A);
            this.A0B = C64333Db.A74(r2);
            this.A01 = (AnonymousClass5DV) A2W.A1R.get();
            this.A06 = A2W.ACE();
        }
    }

    public void A77() {
        if (this.A0D != null) {
            super.A77();
            return;
        }
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0C;
        if (reactionsTrayViewModel == null) {
            throw C18270x1.A0S("reactionsTrayViewModel");
        }
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        C70133a0.A01(reactionsTrayViewModel.A0F, reactionsTrayViewModel, r2, 48);
        C124266Bp.A00(r2, this, 7);
    }

    public void onBackPressed() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0C;
        if (reactionsTrayViewModel == null) {
            throw C18270x1.A0S("reactionsTrayViewModel");
        } else if (C86604Kt.A05(reactionsTrayViewModel.A0C) == 2) {
            ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0C;
            if (reactionsTrayViewModel2 == null) {
                throw C18270x1.A0S("reactionsTrayViewModel");
            }
            reactionsTrayViewModel2.A0E(0);
        } else {
            super.onBackPressed();
        }
    }

    public SingleSelectedMessageActivity(int i) {
        this.A0E = false;
        AnonymousClass68W.A00(this, 49);
    }

    public static final void A0C(SingleSelectedMessageActivity singleSelectedMessageActivity, boolean z) {
        singleSelectedMessageActivity.A0D = Boolean.valueOf(z);
        super.A77();
    }

    public void A76() {
        super.A76();
        C93314oJ r1 = this.A04;
        if (r1 != null) {
            r1.post(C117625sE.A00(this, 12));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object value = this.A0G.getValue();
        if (value == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) AnonymousClass0x9.A0H(this).A01(ReactionsTrayViewModel.class);
        this.A0C = reactionsTrayViewModel;
        if (reactionsTrayViewModel == null) {
            throw C18270x1.A0S("reactionsTrayViewModel");
        }
        AnonymousClass6C6.A02(this, reactionsTrayViewModel.A0D, new AnonymousClass61O(this), 227);
        AnonymousClass5DV r1 = this.A01;
        if (r1 != null) {
            C87654Ud r0 = (C87654Ud) C124086Ax.A00(this, r1, value, 6).A01(C87654Ud.class);
            this.A07 = r0;
            if (r0 == null) {
                throw C18270x1.A0S("singleSelectedMessageViewModel");
            }
            AnonymousClass6C6.A02(this, r0.A00, C1001359q.A00(this, 25), 228);
            ReactionsTrayViewModel reactionsTrayViewModel2 = this.A0C;
            if (reactionsTrayViewModel2 == null) {
                throw C18270x1.A0S("reactionsTrayViewModel");
            }
            AnonymousClass6C6.A02(this, reactionsTrayViewModel2.A0C, C1001359q.A00(this, 26), 229);
            ReactionsTrayViewModel reactionsTrayViewModel3 = this.A0C;
            if (reactionsTrayViewModel3 == null) {
                throw C18270x1.A0S("reactionsTrayViewModel");
            }
            AnonymousClass6C6.A02(this, reactionsTrayViewModel3.A0E, C1001359q.A00(this, 27), 230);
            return;
        }
        throw C18270x1.A0S("singleSelectedMessageViewModelFactory");
    }

    public SingleSelectedMessageActivity() {
        this(0);
        this.A0F = C154517dI.A01(new C119555xA(this));
        this.A0G = C154517dI.A01(new C119565xB(this));
    }
}
