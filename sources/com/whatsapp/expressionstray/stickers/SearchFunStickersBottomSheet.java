package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass00H;
import X.AnonymousClass0IV;
import X.AnonymousClass0UY;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1UF;
import X.AnonymousClass1UG;
import X.AnonymousClass1UI;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass273;
import X.AnonymousClass274;
import X.AnonymousClass2AB;
import X.AnonymousClass2AP;
import X.AnonymousClass33O;
import X.AnonymousClass340;
import X.AnonymousClass3AA;
import X.AnonymousClass4H4;
import X.AnonymousClass4HQ;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass5UY;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C06440Xs;
import X.C06560Yg;
import X.C08310eF;
import X.C107295b4;
import X.C118055sv;
import X.C133906i8;
import X.C139816sf;
import X.C154517dI;
import X.C15590rc;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C194711h;
import X.C29361ih;
import X.C383026z;
import X.C39672Cw;
import X.C52462lW;
import X.C54872pQ;
import X.C56612sH;
import X.C56932sn;
import X.C57432td;
import X.C58422vE;
import X.C616131n;
import X.C620633i;
import X.C632338l;
import X.C635339p;
import X.C64333Db;
import X.C76583s1;
import X.C78203ud;
import X.C78213ue;
import X.C78223uf;
import X.C80473yI;
import X.C80483yJ;
import X.C80493yK;
import X.C817640z;
import X.C819441r;
import X.C819541s;
import X.C819641t;
import X.C819741u;
import X.C819841v;
import X.C819941w;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$logRetryClicked$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onDismiss$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class SearchFunStickersBottomSheet extends Hilt_SearchFunStickersBottomSheet implements C15590rc {
    public ViewGroup A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public CoordinatorLayout A04;
    public RecyclerView A05;
    public LottieAnimationView A06;
    public C39672Cw A07;
    public WaEditText A08;
    public WaImageButton A09;
    public WaImageView A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public C620633i A0H;
    public C56612sH A0I;
    public C194711h A0J;
    public AnonymousClass1VX A0K;
    public C54872pQ A0L;
    public C632338l A0M;
    public C29361ih A0N;
    public AnonymousClass5UY A0O;
    public AnonymousClass5UY A0P;
    public Integer A0Q;
    public String A0R;
    public final int A0S;
    public final AnonymousClass4H4 A0T;
    public final AnonymousClass4HQ A0U;
    public final Map A0V = C18320x8.A0r();
    public final AnonymousClass66R A0W;

    public static final ValueAnimator A00(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new AnonymousClass2AP(view, 0));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = X.C175738Zn.A0U(X.AnonymousClass2AB.A00(r5), "\"", "", false).length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.lang.String r5) {
        /*
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0022
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = X.AnonymousClass2AB.A00(r5)
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r0 = X.C175738Zn.A0U(r2, r1, r0, r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0020
            r0 = 3
            if (r1 < r0) goto L_0x0020
            return r4
        L_0x0020:
            r4 = 0
            return r4
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A02(java.lang.String):boolean");
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        float f;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        this.A0M = (C632338l) C154517dI.A00(AnonymousClass58H.NONE, new C80473yI(this)).getValue();
        this.A0Q = (Integer) AnonymousClass340.A03(this, "stickerOrigin", 10).getValue();
        AnonymousClass66R r5 = this.A0W;
        SearchFunStickersViewModel searchFunStickersViewModel = (SearchFunStickersViewModel) r5.getValue();
        C632338l r0 = this.A0M;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        searchFunStickersViewModel.A02 = str;
        FrameLayout frameLayout = (FrameLayout) C06560Yg.A02(view2, R.id.overflow_menu);
        frameLayout.setEnabled(false);
        frameLayout.setVisibility(8);
        C107295b4.A02(frameLayout);
        this.A02 = frameLayout;
        this.A04 = (CoordinatorLayout) C06560Yg.A02(view2, R.id.fun_stickers_coordinator);
        this.A0B = AnonymousClass0x9.A0L(view2, R.id.more_button);
        WaEditText waEditText = (WaEditText) C06560Yg.A02(view2, R.id.search_entry);
        waEditText.setImeOptions(2);
        waEditText.setRawInputType(1);
        waEditText.requestFocus();
        waEditText.A06();
        this.A08 = waEditText;
        this.A06 = (LottieAnimationView) C06560Yg.A02(view2, R.id.fun_sticker_loading_indicator);
        WaTextView A0L2 = AnonymousClass0x7.A0L(view2, R.id.sample_search_text_view);
        C107295b4.A02(A0L2);
        this.A0F = A0L2;
        this.A0A = AnonymousClass0x9.A0L(view2, R.id.close_image_button);
        this.A01 = (FrameLayout) C06560Yg.A02(view2, R.id.close_image_frame);
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view2, R.id.fun_stickers_recycler_view);
        C162457s7.A0H(recyclerView);
        recyclerView.setVisibility(8);
        this.A05 = recyclerView;
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        WaTextView A0L3 = AnonymousClass0x7.A0L(view2, R.id.error_text);
        C162457s7.A0H(A0L3);
        A0L3.setVisibility(8);
        this.A0D = A0L3;
        WaTextView A0L4 = AnonymousClass0x7.A0L(view2, R.id.title);
        C107295b4.A06(A0L4, true);
        this.A0G = A0L4;
        this.A0P = AnonymousClass0x2.A0M(view2, R.id.sub_title);
        this.A00 = (ViewGroup) C06560Yg.A02(view2, R.id.search_input_layout);
        this.A0O = AnonymousClass0x2.A0M(view2, R.id.report_description);
        WaTextView A0L5 = AnonymousClass0x7.A0L(view2, R.id.retry_button);
        C162457s7.A0H(A0L5);
        A0L5.setVisibility(8);
        this.A0E = A0L5;
        WaImageButton waImageButton = (WaImageButton) C06560Yg.A02(view2, R.id.clear_text_button);
        C107295b4.A02(waImageButton);
        C162457s7.A0H(waImageButton);
        waImageButton.setVisibility(8);
        C635339p.A00(waImageButton, this, 20);
        this.A09 = waImageButton;
        this.A03 = (FrameLayout) C06560Yg.A02(view2, R.id.sticker_prompt_container);
        this.A0C = AnonymousClass0x7.A0L(view2, R.id.cross_fade_head_text);
        int i = 0;
        for (Object next : ((SearchFunStickersViewModel) r5.getValue()).A0S) {
            int i2 = i + 1;
            if (i < 0) {
                throw C18280x3.A0X();
            }
            C52462lW r7 = (C52462lW) next;
            View inflate = LayoutInflater.from(A0G()).inflate(R.layout.f8nameremoved, this.A03, false);
            C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.WaNetworkResourceImageView");
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) inflate;
            waNetworkResourceImageView.setImageResource(r7.A00);
            C54872pQ r2 = this.A0L;
            if (r2 != null) {
                if (r2.A00() && r2.A04.A0Y(C58422vE.A02, 3005)) {
                    Log.d("SearchFunStickersBottomSheet/updateRollingPrompt/fetching resource from network");
                    waNetworkResourceImageView.A07(r7.A02, false);
                }
                if (i == 0) {
                    A1d(this.A0F, r7.A01);
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                waNetworkResourceImageView.setAlpha(f);
                FrameLayout frameLayout2 = this.A03;
                if (frameLayout2 != null) {
                    frameLayout2.addView(waNetworkResourceImageView);
                }
                this.A0V.put(Integer.valueOf(i), waNetworkResourceImageView);
                i = i2;
            } else {
                throw C18270x1.A0S("manager");
            }
        }
        WaEditText waEditText2 = this.A08;
        if (waEditText2 != null) {
            waEditText2.addTextChangedListener(this.A0U);
            waEditText2.setOnEditorActionListener(new AnonymousClass3AA(this));
            waEditText2.setOnTouchListener(new C57432td(2));
        }
        FrameLayout frameLayout3 = this.A03;
        if (frameLayout3 != null) {
            C635339p.A00(frameLayout3, this, 14);
        }
        WaTextView waTextView = this.A0E;
        if (waTextView != null) {
            C635339p.A00(waTextView, this, 15);
        }
        WaTextView waTextView2 = this.A0F;
        if (waTextView2 != null) {
            C635339p.A00(waTextView2, this, 16);
        }
        FrameLayout frameLayout4 = this.A01;
        if (frameLayout4 != null) {
            C635339p.A00(frameLayout4, this, 17);
        }
        FrameLayout frameLayout5 = this.A02;
        if (frameLayout5 != null) {
            C635339p.A00(frameLayout5, this, 18);
        }
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A06, new C819441r(this), 96);
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A0R, new C819541s(this), 97);
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A0A, new C819641t(this), 98);
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A09, new C819741u(this), 99);
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A07, new C819841v(this), 100);
        AnonymousClass4K2.A00(A0V(), ((SearchFunStickersViewModel) r5.getValue()).A08, new C819941w(this), 101);
        ((SearchFunStickersViewModel) r5.getValue()).A0I(true);
        ((SearchFunStickersViewModel) r5.getValue()).A01 = this.A0Q;
        C39672Cw r3 = this.A07;
        if (r3 != null) {
            C632338l r8 = this.A0M;
            C383026z r12 = new C383026z(this, 23);
            C76583s1 r15 = new C76583s1(this);
            AnonymousClass274 r13 = new AnonymousClass274(this, 2);
            AnonymousClass274 r14 = new AnonymousClass274(this, 3);
            C118055sv r02 = r3.A00;
            C64333Db r32 = r02.A04;
            AnonymousClass1VX A4B = C64333Db.A4B(r32);
            C194711h r4 = new C194711h(C64333Db.A04(r32), A4B, (C54872pQ) r02.A01.A3c.get(), r8, (AnonymousClass33O) r32.AX1.get(), (C56932sn) r32.AXB.get(), C64333Db.A8y(r32), r12, r13, r14, r15);
            this.A0J = r4;
            r4.A02 = true;
            RecyclerView recyclerView2 = this.A05;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(r4);
                A0G();
                int i3 = C08310eF.A09(this).getConfiguration().orientation;
                int i4 = 2;
                if (i3 == 2) {
                    i4 = 4;
                }
                recyclerView2.setLayoutManager(new GridLayoutManager(i4));
                return;
            }
            return;
        }
        throw C18270x1.A0S("searchFunStickersAdapterFactory");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A04 = new C139816sf(C817640z.A00);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C06440Xs layoutManager;
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null && recyclerView.A0N != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i = 2;
            if (C08310eF.A09(this).getConfiguration().orientation == 2) {
                i = 4;
            }
            gridLayoutManager.A1o(i);
            RecyclerView recyclerView2 = this.A05;
            if (recyclerView2 != null) {
                recyclerView2.requestLayout();
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        WaEditText waEditText = this.A08;
        if (waEditText != null) {
            waEditText.A05();
            waEditText.clearFocus();
        }
        SearchFunStickersViewModel A0O2 = C18300x5.A0O(this);
        C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$onDismiss$1(A0O2, (C84814Du) null), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
        super.onDismiss(dialogInterface);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Integer num = null;
        if (menuItem != null) {
            num = Integer.valueOf(menuItem.getItemId());
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == R.id.fun_stickers_try_again) {
                SearchFunStickersViewModel A0O2 = C18300x5.A0O(this);
                C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$logRetryClicked$1(A0O2, (C84814Du) null), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
                A1e(false);
            } else if (intValue == R.id.fun_stickers_report) {
                C18300x5.A0O(this).A0A.A0H(C133906i8.A00);
                return true;
            }
        }
        return true;
    }

    public static final /* synthetic */ void A01(SearchFunStickersBottomSheet searchFunStickersBottomSheet, List list) {
        WaTextView waTextView = searchFunStickersBottomSheet.A0C;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        int A052 = C18290x4.A05(searchFunStickersBottomSheet.A0F);
        FrameLayout frameLayout = searchFunStickersBottomSheet.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(A052);
        }
        searchFunStickersBottomSheet.A1b();
        searchFunStickersBottomSheet.A1Z();
        AnonymousClass0x2.A0x(searchFunStickersBottomSheet.A05);
        C194711h r1 = searchFunStickersBottomSheet.A0J;
        if (r1 != null) {
            Log.d("SearchFunStickersAdapter/refreshContent");
            if (C18310x6.A1X(list)) {
                r1.A0L(list);
            }
        }
    }

    public final void A1Y() {
        View childAt;
        C620633i r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("systemServices");
        } else if (C107295b4.A08(r0.A0P())) {
            Object A072 = C18300x5.A0O(this).A06.A07();
            if (A072 instanceof AnonymousClass1UG) {
                childAt = this.A0D;
                if (childAt == null) {
                    return;
                }
            } else if ((A072 instanceof AnonymousClass1UI) || (A072 instanceof AnonymousClass1UF)) {
                RecyclerView recyclerView = this.A05;
                if (recyclerView != null && recyclerView.getChildCount() > 0) {
                    childAt = recyclerView.getChildAt(0);
                } else {
                    return;
                }
            } else {
                Log.d("SearchFunStickersBottomSheet/doneActionAccessibilityAnnouncement/not handled a11y scenario");
                return;
            }
            childAt.requestFocus();
            AnonymousClass0YY.A0E(childAt, 64, (Bundle) null);
        }
    }

    public final void A1Z() {
        AnonymousClass00H r0;
        LottieAnimationView lottieAnimationView = this.A06;
        if (lottieAnimationView != null && (r0 = lottieAnimationView.A0F.A0K) != null && r0.A07) {
            lottieAnimationView.setRepeatCount(0);
        }
    }

    public final void A1a() {
        WaImageView waImageView = this.A0B;
        if (waImageView != null) {
            waImageView.setEnabled(false);
        }
        WaImageView waImageView2 = this.A0B;
        if (waImageView2 != null) {
            waImageView2.setAlpha(0.5f);
        }
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(false);
        }
    }

    public final void A1b() {
        WaImageView waImageView = this.A0B;
        if (waImageView != null) {
            waImageView.setEnabled(true);
        }
        WaImageView waImageView2 = this.A0B;
        if (waImageView2 != null) {
            waImageView2.setAlpha(1.0f);
        }
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(true);
        }
        AnonymousClass0x2.A0x(this.A02);
    }

    public final void A1c() {
        AnonymousClass5UY r0;
        TextView textView;
        AnonymousClass5UY r1 = this.A0P;
        if (r1 != null) {
            r1.A06(0);
        }
        C632338l r6 = this.A0M;
        if (r6 != null && (r0 = this.A0P) != null && (textView = (TextView) r0.A04()) != null) {
            textView.setText(C18300x5.A0e(A0G(), r6.A02, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
        }
    }

    public final void A1e(boolean z) {
        Editable text;
        String obj;
        String A002;
        WaEditText waEditText = this.A08;
        if (waEditText != null && (text = waEditText.getText()) != null && (obj = text.toString()) != null && (A002 = AnonymousClass2AB.A00(obj)) != null) {
            SearchFunStickersViewModel A0O2 = C18300x5.A0O(this);
            Log.d("SearchFunStickersViewModel/startSearch");
            C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$stopRollingPrompt$1(A0O2, (C84814Du) null), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
            C85474Gj r2 = A0O2.A03;
            if (r2 != null) {
                C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$stopLoadingStickers$1$1(A0O2, (C84814Du) null, r2, true), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
            }
            A0O2.A03 = null;
            A0O2.A03 = C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$startSearch$1(A0O2, A002, (C84814Du) null, z), AnonymousClass0IV.A00(A0O2), (AnonymousClass20D) null, 3);
        }
    }

    public SearchFunStickersBottomSheet() {
        AnonymousClass66R A002 = C154517dI.A00(AnonymousClass58H.NONE, new C78213ue(new C78203ud(this)));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(SearchFunStickersViewModel.class);
        this.A0W = C18330xA.A02(new C78223uf(A002), new C80493yK(this, A002), new C80483yJ(A002), A1E);
        this.A0T = new AnonymousClass4H4(this, 1);
        this.A0U = new AnonymousClass4HQ(this, 3);
        this.A0S = R.layout.f8nameremoved;
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        A1J.setOnShowListener(new AnonymousClass273(this, 2));
        return A1J;
    }

    public int A1S() {
        return this.A0S;
    }

    public final void A1d(WaTextView waTextView, int i) {
        String string = C08310eF.A09(this).getString(i);
        C162457s7.A0D(string);
        String string2 = C08310eF.A09(this).getString(R.string.f11nameremoved, AnonymousClass000.A1b(string));
        C162457s7.A0D(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("\"");
        spannableStringBuilder.append(string);
        spannableStringBuilder.append("\"");
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        if (waTextView != null) {
            waTextView.setText(spannedString);
            waTextView.setContentDescription(string2);
        }
    }
}
