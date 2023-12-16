package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass1n2;
import X.AnonymousClass1nF;
import X.AnonymousClass29H;
import X.AnonymousClass2CO;
import X.AnonymousClass2z0;
import X.AnonymousClass34R;
import X.AnonymousClass4CE;
import X.AnonymousClass4L0;
import X.AnonymousClass4M8;
import X.AnonymousClass4SG;
import X.AnonymousClass4UA;
import X.AnonymousClass4UY;
import X.AnonymousClass52O;
import X.AnonymousClass54F;
import X.AnonymousClass5CQ;
import X.AnonymousClass5IY;
import X.AnonymousClass5KX;
import X.AnonymousClass5R7;
import X.AnonymousClass5S9;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Yj;
import X.AnonymousClass68H;
import X.AnonymousClass694;
import X.AnonymousClass6BY;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C1001059l;
import X.C100935Cv;
import X.C103175Lv;
import X.C105895Wv;
import X.C106685Zz;
import X.C107395bF;
import X.C107555bV;
import X.C107635bd;
import X.C107695bk;
import X.C109335eS;
import X.C112955ke;
import X.C117085rM;
import X.C118075sx;
import X.C1236069b;
import X.C1237469p;
import X.C18290x4;
import X.C187958y5;
import X.C27821ej;
import X.C27991fJ;
import X.C30471mV;
import X.C30481mW;
import X.C31961pA;
import X.C31971pB;
import X.C55592qb;
import X.C55682qk;
import X.C56612sH;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C624134x;
import X.C64333Db;
import X.C66513Ls;
import X.C86124Ix;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88834as;
import X.C89224c7;
import X.C89644eZ;
import X.C93314oJ;
import X.C95894up;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

public class EditMessageActivity extends C89644eZ {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ScrollView A03;
    public C100935Cv A04;
    public AnonymousClass2CO A05;
    public C103175Lv A06;
    public AnonymousClass4CE A07;
    public KeyboardPopupLayout A08;
    public WaImageButton A09;
    public AnonymousClass4UY A0A;
    public AnonymousClass5KX A0B;
    public AnonymousClass5R7 A0C;
    public AnonymousClass4UA A0D;
    public AnonymousClass5IY A0E;
    public C27821ej A0F;
    public AnonymousClass5S9 A0G;
    public EmojiSearchProvider A0H;
    public MentionableEntry A0I;
    public C60152y5 A0J;
    public C187958y5 A0K;
    public boolean A0L;
    public boolean A0M;
    public final Handler A0N;

    public final void A74() {
        AnonymousClass5Y0 r5 = this.A0C;
        C107635bd.A0F(this, this.A0I.getText(), this.A0I.getPaint(), this.A08, r5, this.A0J, R.color.f5nameremoved, this.A0M);
    }

    public final void A75() {
        AnonymousClass4UA r6 = this.A0D;
        if (r6.A01.A09 != null) {
            r6.A0O(r6.A07);
            return;
        }
        if (this.A0B == null) {
            AnonymousClass5KX r2 = new AnonymousClass5KX(this, this.A04, new AnonymousClass6BY(this, 0), r6, this.A04, false, false);
            this.A0B = r2;
            this.A02.addView(r2.A05);
        }
        this.A02.setVisibility(0);
        A76();
        AnonymousClass5KX r1 = this.A0B;
        C66513Ls r4 = this.A0D.A01;
        if (r4 != null) {
            r1.A05.A0F(r4, (List) null, false, r1.A00);
        }
    }

    public void A5r() {
        if (!this.A0L) {
            this.A0L = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A04 = (C100935Cv) A2W.A0g.get();
            this.A05 = (AnonymousClass2CO) A2W.A4V.get();
            this.A0F = C86604Kt.A0X(r2);
            this.A0K = C86614Ku.A0o(r2);
            this.A0H = C107695bk.A1n(r1);
            this.A0E = C107695bk.A1m(r1);
            this.A0J = C64333Db.A74(r2);
            this.A0C = (AnonymousClass5R7) r1.A2p.get();
            this.A06 = (C103175Lv) A2W.A0j.get();
        }
    }

    public void finish() {
        this.A00.setVisibility(8);
        this.A0I.A05();
        super.finish();
        overridePendingTransition(0, R.anim.f0nameremoved);
    }

    public void onCreate(Bundle bundle) {
        String A1w;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C86624Kv.A0l(getResources(), AnonymousClass001.A0Q(this), R.color.f5nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        A28.setTitle((int) R.string.f11nameremoved);
        A28.setTitleTextColor(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
        boolean z = C1001059l.A03;
        int i = R.color.f5nameremoved;
        if (!z) {
            i = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        int A042 = AnonymousClass0Y8.A04(this, i);
        A28.setBackgroundColor(A042);
        C86604Kt.A11(this, A28, this.A00, R.drawable.ic_back);
        A28.setNavigationContentDescription((int) R.string.f11nameremoved);
        A28.setNavigationOnClickListener(new C109335eS(this, 46));
        AnonymousClass5CQ.A00(getWindow(), A042, true);
        overridePendingTransition(R.anim.f0nameremoved, 0);
        this.A0D = (AnonymousClass4UA) AnonymousClass4L0.A0F(new C86124Ix(this.A0N, this.A05, (Object) null, 2), this).A01(AnonymousClass4UA.class);
        C100935Cv r1 = this.A04;
        AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
        AnonymousClass4UA r11 = this.A0D;
        C118075sx r12 = r1.A00;
        C64333Db r0 = r12.A03;
        C56612sH A2p = C64333Db.A2p(r0);
        AnonymousClass1VX A4B = C64333Db.A4B(r0);
        C106685Zz A0m = C86634Kw.A0m(r0);
        AnonymousClass4UY r7 = new AnonymousClass4UY(C64333Db.A07(r0), C64333Db.A08(r0), r12.A01.ABV(), r11, A2p, A4B, A0m, A022, C64333Db.A8F(r0));
        this.A0A = r7;
        AnonymousClass6C6.A01(this, r7.A03, 171);
        C86604Kt.A1M(this, this.A0A.A04, 181);
        this.A08 = (KeyboardPopupLayout) findViewById(R.id.conversation_layout);
        MentionableEntry mentionableEntry = (MentionableEntry) findViewById(R.id.entry);
        this.A0I = mentionableEntry;
        mentionableEntry.setImeOptions(mentionableEntry.getImeOptions() | 33554432);
        this.A0M = AnonymousClass29H.A00(this.A0D);
        View findViewById = findViewById(R.id.footer_container);
        this.A00 = findViewById;
        findViewById.setAlpha(0.0f);
        this.A08.addOnLayoutChangeListener(new C1237469p(AnonymousClass001.A0M(this), 2, this));
        View findViewById2 = findViewById(R.id.input_layout);
        this.A01 = findViewById2;
        C86624Kv.A0u(findViewById2, R.id.input_attach_button);
        C107555bV.A03(this.A01, C86664Kz.A0r(this.A01).leftMargin, getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        C93314oJ A032 = this.A06.A00(getSupportFragmentManager(), C95894up.A00(this.A04)).A03(this, new C112955ke(this), this.A0A.A0D);
        A032.setEnabled(false);
        ScrollView scrollView = (ScrollView) findViewById(R.id.message_bubble_container);
        this.A03 = scrollView;
        scrollView.addView(A032);
        this.A03.postDelayed(C117085rM.A00(this, 12), 500);
        AnonymousClass1VX r4 = this.A0D;
        C105895Wv r3 = this.A0B;
        C55682qk r8 = this.A03;
        AnonymousClass5Y0 r2 = this.A0C;
        C27821ej r15 = this.A0F;
        C620633i r112 = this.A08;
        C620733j r13 = this.A00;
        AnonymousClass5IY r14 = this.A0E;
        EmojiSearchProvider emojiSearchProvider = this.A0H;
        AnonymousClass5Y0 r16 = r2;
        C89224c7 r5 = new C89224c7(this, (ImageButton) findViewById(R.id.emoji_picker_btn), r8, this.A08, this.A0I, r112, this.A09, r13, r14, r15, r16, emojiSearchProvider, r4, this.A0J, r3);
        r5.A0C(this.A07);
        AnonymousClass5Y0 r32 = this.A0C;
        C27821ej r22 = this.A0F;
        AnonymousClass5S9 r72 = new AnonymousClass5S9(this, this.A00, r5, r22, r32, (EmojiSearchContainer) C06560Yg.A02(this.A08, R.id.emoji_search_container), this.A0J);
        this.A0G = r72;
        AnonymousClass5S9.A00(r72, this, 1);
        getWindow().setSoftInputMode(5);
        C27991fJ A012 = AnonymousClass34R.A01(this.A0A.A0D.A1J.A00);
        if (this.A0I.A0K(A012)) {
            ViewGroup A0m2 = C86664Kz.A0m(this, R.id.mention_attach);
            MentionableEntry mentionableEntry2 = this.A0I;
            mentionableEntry2.A0C = new C1236069b(this, 0);
            mentionableEntry2.A0H(A0m2, A012, false, false, true);
            MentionableEntry mentionableEntry3 = this.A0I;
            mentionableEntry3.A05 = this.A01;
            mentionableEntry3.A04 = this.A08;
        }
        C624134x r33 = this.A0A.A0D;
        boolean A0C2 = AnonymousClass2z0.A0C(r33);
        int i2 = R.string.f11nameremoved;
        if (A0C2) {
            i2 = R.string.f11nameremoved;
        }
        this.A0I.setHint(getString(i2));
        if (r33 instanceof C30481mW) {
            A1w = r33.A13();
        } else if ((r33 instanceof AnonymousClass1n2) || (r33 instanceof C31971pB) || (r33 instanceof C31961pA)) {
            A1w = ((C30471mV) r33).A1w();
        } else if (r33 instanceof AnonymousClass1nF) {
            A1w = ((AnonymousClass1nF) r33).A01;
        } else {
            A1w = null;
        }
        this.A0I.setMentionableText(A1w, r33.A18);
        MentionableEntry mentionableEntry4 = this.A0I;
        mentionableEntry4.setSelection(mentionableEntry4.getSelectionEnd());
        A74();
        this.A0I.A07(false);
        this.A02 = C86664Kz.A0m(this, R.id.web_page_preview_container);
        AnonymousClass6C6.A01(this, this.A0D.A0D, 172);
        C66513Ls r17 = this.A0A.A07;
        if (r17 != null) {
            AnonymousClass4UA r02 = this.A0D;
            String str = r17.A0Z;
            r02.A0N(str);
            AnonymousClass4UA r23 = this.A0D;
            r23.A0F(r17);
            C55592qb r18 = this.A0A.A0D.A0l;
            if (r18 != null && str.equals(r23.A07)) {
                r23.A00 = 4;
                if (r23.A08) {
                    r23.A05 = r18;
                }
            }
            if (r23.A0Q()) {
                A75();
            }
        }
        WaImageButton waImageButton = (WaImageButton) findViewById(R.id.send);
        this.A09 = waImageButton;
        C18290x4.A1A(this, waImageButton, R.drawable.ic_fab_check);
        if (C1001059l.A04) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A09.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.A09.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        AnonymousClass54F.A00(this.A09, this, 14);
        AnonymousClass68H.A00(this.A0I, this, 3);
        if (this.A0M) {
            MentionableEntry mentionableEntry5 = this.A0I;
            mentionableEntry5.addTextChangedListener(new AnonymousClass52O(mentionableEntry5, this.A00));
        }
    }

    public EditMessageActivity(int i) {
        this.A0L = false;
        C86604Kt.A1K(this, 37);
    }

    public final void A76() {
        int i = R.drawable.ib_new_round;
        if (this.A0I.A0L) {
            i = R.drawable.ib_new_expanded_bottom;
        } else if (this.A02.getVisibility() == 0) {
            i = R.drawable.ib_new_expanded;
        }
        AnonymousClass4M8.A00(AnonymousClass0x7.A0J(this, this.A00, i), this.A01);
    }

    public EditMessageActivity() {
        this(0);
        this.A0N = AnonymousClass000.A0A();
        this.A0M = false;
        this.A07 = new AnonymousClass694(this, 1);
    }
}
