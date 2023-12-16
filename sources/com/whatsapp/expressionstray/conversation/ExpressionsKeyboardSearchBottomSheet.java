package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1TY;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass3AB;
import X.AnonymousClass4A8;
import X.AnonymousClass4A9;
import X.AnonymousClass4HQ;
import X.AnonymousClass4I3;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass5Vo;
import X.AnonymousClass66R;
import X.AnonymousClass8PJ;
import X.C06560Yg;
import X.C08270df;
import X.C105895Wv;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C18330xA;
import X.C183538qC;
import X.C19420zy;
import X.C41552Kr;
import X.C49652gs;
import X.C58422vE;
import X.C616131n;
import X.C620733j;
import X.C635339p;
import X.C635839u;
import X.C63723Aj;
import X.C78083uR;
import X.C78093uS;
import X.C78103uT;
import X.C78113uU;
import X.C78123uV;
import X.C80393yA;
import X.C80403yB;
import X.C819041n;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onDismiss$1;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onTabsUpdated$1;

public final class ExpressionsKeyboardSearchBottomSheet extends Hilt_ExpressionsKeyboardSearchBottomSheet {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public ViewFlipper A04;
    public ViewPager A05;
    public MaterialButton A06;
    public MaterialButton A07;
    public MaterialButton A08;
    public MaterialButtonToggleGroup A09;
    public WaEditText A0A;
    public C620733j A0B;
    public AnonymousClass4A8 A0C;
    public AnonymousClass4A9 A0D;
    public C19420zy A0E;
    public AnonymousClass1VX A0F;
    public C49652gs A0G;
    public C105895Wv A0H;
    public C183538qC A0I;
    public final AnonymousClass66R A0J;
    public final AnonymousClass66R A0K = C154517dI.A01(new C78083uR(this));
    public final AnonymousClass66R A0L;

    public void A0w(Bundle bundle, View view) {
        Bundle bundle2;
        String string;
        WaEditText waEditText;
        ImageView imageView;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A02 = (ViewGroup) C06560Yg.A02(view, R.id.expressions_view_root);
        this.A04 = (ViewFlipper) C06560Yg.A02(view, R.id.flipper);
        this.A00 = C06560Yg.A02(view, R.id.browser_view);
        this.A05 = (ViewPager) C06560Yg.A02(view, R.id.browser_content);
        this.A03 = AnonymousClass0x9.A0E(view, R.id.back);
        this.A01 = C06560Yg.A02(view, R.id.clear_search_btn);
        this.A0A = (WaEditText) C06560Yg.A02(view, R.id.search_bar);
        this.A09 = (MaterialButtonToggleGroup) C06560Yg.A02(view, R.id.browser_tabs);
        this.A06 = (MaterialButton) C06560Yg.A02(view, R.id.avatar_stickers);
        this.A07 = (MaterialButton) C06560Yg.A02(view, R.id.gifs);
        this.A08 = (MaterialButton) C06560Yg.A02(view, R.id.stickers);
        C08270df A0T = A0T();
        AnonymousClass66R r3 = this.A0L;
        int A092 = AnonymousClass0x2.A09(r3);
        C162457s7.A0H(A0T);
        this.A0E = new C19420zy(A0T, A092, true, true);
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            C620733j r0 = this.A0B;
            if (r0 != null) {
                viewPager.setLayoutDirection(r0.A05().A06 ? 1 : 0);
                C19420zy r1 = this.A0E;
                if (r1 != null) {
                    viewPager.setOffscreenPageLimit(r1.A04.size());
                } else {
                    r1 = null;
                }
                viewPager.setAdapter(r1);
                viewPager.A0G(new C63723Aj(this));
            } else {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        Context A1D = A1D();
        if (!(A1D == null || (imageView = this.A03) == null)) {
            C620733j r12 = this.A0B;
            if (r12 != null) {
                C18270x1.A0d(A1D, imageView, r12, R.drawable.ic_back);
            } else {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        AnonymousClass66R r7 = this.A0J;
        AnonymousClass4K2.A00(A0V(), ((ExpressionsSearchViewModel) r7.getValue()).A07, new C819041n(this), 93);
        C616131n.A02((C85494Gl) null, new ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        WaEditText waEditText2 = this.A0A;
        if (waEditText2 != null) {
            waEditText2.addTextChangedListener(new AnonymousClass4HQ(this, 2));
            waEditText2.setOnFocusChangeListener(new C635839u(waEditText2, this));
            waEditText2.setOnEditorActionListener(new AnonymousClass3AB(waEditText2, this));
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A09;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A08.add(new AnonymousClass4I3(this, 1));
        }
        View view2 = this.A01;
        if (view2 != null) {
            C635339p.A00(view2, this, 3);
        }
        ImageView imageView2 = this.A03;
        if (imageView2 != null) {
            C635339p.A00(imageView2, this, 4);
        }
        MaterialButton materialButton = this.A07;
        String str = null;
        if (materialButton != null) {
            Context A1D2 = A1D();
            String str2 = null;
            if (A1D2 != null) {
                str2 = A1D2.getString(R.string.f11nameremoved);
            }
            materialButton.setContentDescription(str2);
        }
        MaterialButton materialButton2 = this.A06;
        if (materialButton2 != null) {
            Context A1D3 = A1D();
            String str3 = null;
            if (A1D3 != null) {
                str3 = A1D3.getString(R.string.f11nameremoved);
            }
            materialButton2.setContentDescription(str3);
        }
        MaterialButton materialButton3 = this.A08;
        if (materialButton3 != null) {
            Context A1D4 = A1D();
            if (A1D4 != null) {
                str = A1D4.getString(R.string.f11nameremoved);
            }
            materialButton3.setContentDescription(str);
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = (ExpressionsSearchViewModel) r7.getValue();
        C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onTabsUpdated$1(expressionsSearchViewModel, (C84814Du) null, AnonymousClass0x2.A09(r3)), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 3);
        AnonymousClass1VX r2 = this.A0F;
        if (r2 == null) {
            throw C18270x1.A0R();
        } else if (r2.A0Y(C58422vE.A02, 3403) && AnonymousClass0x2.A09(r3) == 8 && (bundle2 = this.A06) != null && (string = bundle2.getString("contextual_suggestion_query")) != null && (waEditText = this.A0A) != null) {
            waEditText.setText(string);
        }
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A06 = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        WaEditText waEditText = this.A0A;
        if (waEditText != null) {
            waEditText.A05();
            waEditText.clearFocus();
        }
        AnonymousClass4A8 r0 = this.A0C;
        if (r0 != null) {
            r0.BSd();
        }
        ExpressionsSearchViewModel A0L2 = C18320x8.A0L(this);
        C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onDismiss$1(A0L2, (C84814Du) null), AnonymousClass0IV.A00(A0L2), (AnonymousClass20D) null, 3);
        super.onDismiss(dialogInterface);
    }

    public int A1S() {
        return AnonymousClass0x2.A09(this.A0K);
    }

    public final void A1Y(Bitmap bitmap, C41552Kr r6) {
        MaterialButton materialButton;
        if (bitmap != null) {
            MaterialButton materialButton2 = this.A06;
            if (materialButton2 != null) {
                materialButton2.setIconTint((ColorStateList) null);
            }
            MaterialButton materialButton3 = this.A06;
            if (materialButton3 != null) {
                materialButton3.setIcon(new BitmapDrawable(materialButton3.getResources(), bitmap));
                if (!C162457s7.A0P(r6, AnonymousClass1TY.A00)) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(0.0f);
                    materialButton3.A07.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                materialButton3.A07.clearColorFilter();
                return;
            }
            return;
        }
        Context A1D = A1D();
        if (A1D != null && (materialButton = this.A06) != null) {
            materialButton.setIconTint(AnonymousClass0Y8.A07(A1D, R.drawable.expression_tab_icon_color_selector));
            materialButton.setIconResource(R.drawable.ic_avatar_tray_normal);
        }
    }

    public ExpressionsKeyboardSearchBottomSheet() {
        C78103uT r1 = new C78103uT(this);
        AnonymousClass58H r5 = AnonymousClass58H.NONE;
        AnonymousClass66R A002 = C154517dI.A00(r5, new C78113uU(r1));
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(ExpressionsSearchViewModel.class);
        this.A0J = C18330xA.A02(new C78123uV(A002), new C80403yB(this, A002), new C80393yA(A002), A1E);
        this.A0L = C154517dI.A00(r5, new C78093uS(this));
    }

    public void A0a() {
        super.A0a();
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
    }
}
