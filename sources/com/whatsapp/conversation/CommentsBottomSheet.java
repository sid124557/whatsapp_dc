package com.whatsapp.conversation;

import X.AnonymousClass0IT;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass100;
import X.AnonymousClass129;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2CS;
import X.AnonymousClass33p;
import X.AnonymousClass349;
import X.AnonymousClass3ZH;
import X.AnonymousClass487;
import X.AnonymousClass4FS;
import X.AnonymousClass4GR;
import X.AnonymousClass4J6;
import X.AnonymousClass4VQ;
import X.AnonymousClass4W9;
import X.AnonymousClass58H;
import X.AnonymousClass5OL;
import X.AnonymousClass5Y0;
import X.AnonymousClass66R;
import X.AnonymousClass66v;
import X.C003203q;
import X.C011709l;
import X.C08310eF;
import X.C106715a2;
import X.C106895aL;
import X.C114015mM;
import X.C131666dx;
import X.C154517dI;
import X.C158547k9;
import X.C15940sD;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C194510y;
import X.C32951rx;
import X.C39622Cr;
import X.C45022Yj;
import X.C53602nM;
import X.C56612sH;
import X.C56662sM;
import X.C56972sr;
import X.C57432td;
import X.C57742u8;
import X.C60152y5;
import X.C616131n;
import X.C620633i;
import X.C620733j;
import X.C624134x;
import X.C64773Ex;
import X.C66473Lo;
import X.C66493Lq;
import X.C66543Lv;
import X.C69263Wi;
import X.C70203a7;
import X.C73853gB;
import X.C77543tZ;
import X.C77553ta;
import X.C77563tb;
import X.C77573tc;
import X.C77583td;
import X.C77593te;
import X.C77603tf;
import X.C77613tg;
import X.C77623th;
import X.C77633ti;
import X.C80293y0;
import X.C80303y1;
import X.C84814Du;
import X.C85494Gl;
import X.C95814uZ;
import X.C994455t;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.mentions.MentionableEntry;

public final class CommentsBottomSheet extends Hilt_CommentsBottomSheet {
    public AnonymousClass2CS A00;
    public C39622Cr A01;
    public C69263Wi A02;
    public C56972sr A03;
    public C64773Ex A04;
    public C114015mM A05;
    public C53602nM A06;
    public AnonymousClass4W9 A07;
    public AnonymousClass4VQ A08;
    public C620633i A09;
    public C56612sH A0A;
    public AnonymousClass33p A0B;
    public C620733j A0C;
    public C66473Lo A0D;
    public C66543Lv A0E;
    public C56662sM A0F;
    public AnonymousClass487 A0G;
    public AnonymousClass5Y0 A0H;
    public AnonymousClass1VX A0I;
    public C66493Lq A0J;
    public C60152y5 A0K;
    public C45022Yj A0L;
    public C106715a2 A0M;
    public AnonymousClass4FS A0N;
    public AnonymousClass66v A0O;
    public C73853gB A0P;
    public C73853gB A0Q;
    public final C011709l A0R = new C011709l();
    public final AnonymousClass66R A0S = C154517dI.A01(new C77543tZ(this));
    public final AnonymousClass66R A0T;
    public final AnonymousClass66R A0U;
    public final AnonymousClass66R A0V;
    public final AnonymousClass66R A0W;
    public final AnonymousClass66R A0X;
    public final AnonymousClass66R A0Y;
    public final AnonymousClass66R A0Z;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C114015mM r2 = this.A05;
        if (r2 != null) {
            this.A07 = new AnonymousClass4W9(r2.A04(A0G(), this, "comments-contact-picture"), (AnonymousClass5OL) this.A0S.getValue());
            A1D();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1X(1);
            linearLayoutManager.A1h(true);
            linearLayoutManager.A1i(true);
            AnonymousClass66R r4 = this.A0Y;
            ((RecyclerView) r4.getValue()).setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView = (RecyclerView) r4.getValue();
            AnonymousClass4W9 r0 = this.A07;
            if (r0 == null) {
                throw C18270x1.A0S("adapter");
            }
            recyclerView.setAdapter(r0);
            ((RecyclerView) r4.getValue()).A0q(new AnonymousClass129(linearLayoutManager, this));
            AnonymousClass66R r42 = this.A0U;
            C57742u8.A00(AnonymousClass349.A02(A1Y()), new AnonymousClass4J6((AnonymousClass4GR) new CommentsBottomSheet$setupRecyclerView$2(linearLayoutManager, (C84814Du) null), ((C194510y) r42.getValue()).A0T, 10));
            C57742u8.A02(this, new CommentsBottomSheet$setupRecyclerView$3(this, (C84814Du) null), ((C194510y) r42.getValue()).A0R);
            C18280x3.A0E(view, R.id.emoji_picker_btn).setVisibility(8);
            MentionableEntry mentionableEntry = (MentionableEntry) C18280x3.A0E(view, R.id.entry);
            mentionableEntry.setOnTouchListener(new C57432td(1));
            C106895aL.A01(mentionableEntry, new C158547k9(C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), 0, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), 0));
            mentionableEntry.setHint(R.string.f11nameremoved);
            ImageView imageView = (ImageView) C18280x3.A0E(view, R.id.send);
            C620733j r22 = this.A0C;
            if (r22 != null) {
                imageView.setImageDrawable(new C131666dx(C18310x6.A0G(imageView.getContext(), R.drawable.input_send), r22));
                mentionableEntry.addTextChangedListener(new C32951rx(this, mentionableEntry));
                C18290x4.A1I(imageView, this, mentionableEntry, 42);
                mentionableEntry.setupEnterIsSend(new C70203a7(this, 47, mentionableEntry));
                C616131n.A02((C85494Gl) null, new CommentsBottomSheet$onViewCreated$1(view, this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                C57742u8.A02(this, new CommentsBottomSheet$onViewCreated$2(this, (C84814Du) null), ((C194510y) r42.getValue()).A0S);
                C57742u8.A02(this, new CommentsBottomSheet$onViewCreated$3(this, (C84814Du) null), ((C194510y) r42.getValue()).A0U);
                return;
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        AnonymousClass4VQ r1 = this.A08;
        if (r1 == null) {
            throw C18270x1.A0S("messagesViewModel");
        }
        r1.A0R((C624134x) null);
    }

    public void A0a() {
        AnonymousClass5OL r2 = (AnonymousClass5OL) this.A0S.getValue();
        C994455t r1 = r2.A00;
        if (r1 != null) {
            r1.A02 = true;
            r1.interrupt();
            r2.A00 = null;
        }
        super.A0a();
    }

    public final C73853gB A1Y() {
        C73853gB r0 = this.A0Q;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public CommentsBottomSheet() {
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A0T = C154517dI.A00(r2, new C80293y0(this));
        this.A0X = C154517dI.A01(new C77583td(this));
        C77553ta r4 = new C77553ta(this);
        AnonymousClass66R A002 = C154517dI.A00(r2, new C77623th(new C77613tg(this)));
        this.A0U = C18330xA.A02(new C77633ti(A002), r4, new C80303y1(A002), AnonymousClass0x9.A1E(C194510y.class));
        this.A0W = C154517dI.A01(new C77573tc(this));
        this.A0Z = C154517dI.A01(new C77603tf(this));
        this.A0Y = C154517dI.A01(new C77593te(this));
        this.A0V = C154517dI.A01(new C77563tb(this));
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) C18290x4.A0O(this).A01(MessageSelectionViewModel.class);
        C66473Lo r2 = this.A0D;
        if (r2 != null) {
            AnonymousClass66R r1 = this.A0T;
            AnonymousClass3ZH A012 = r2.A01((C95814uZ) r1.getValue());
            C003203q A0R2 = A0R();
            AnonymousClass2CS r6 = this.A00;
            if (r6 != null) {
                C003203q A0R3 = A0R();
                AnonymousClass66v r10 = this.A0O;
                if (r10 != null) {
                    this.A08 = (AnonymousClass4VQ) new AnonymousClass0XL((C17190ui) new AnonymousClass100(A0R().getIntent(), A0R3, r6, messageSelectionViewModel, A012, (C95814uZ) r1.getValue(), r10), (C15940sD) A0R2).A01(AnonymousClass4VQ.class);
                    return;
                }
                throw C18270x1.A0S("inlineVideoPlaybackHandler");
            }
            throw C18270x1.A0S("messagesViewModelFactory");
        }
        throw C18270x1.A0S("conversationContactManager");
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
