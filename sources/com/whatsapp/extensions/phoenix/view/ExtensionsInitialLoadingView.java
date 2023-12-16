package com.whatsapp.extensions.phoenix.view;

import X.AnonymousClass001;
import X.AnonymousClass0I0;
import X.AnonymousClass0IY;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass3A1;
import X.AnonymousClass3ZH;
import X.AnonymousClass42F;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GQ;
import X.AnonymousClass4K2;
import X.AnonymousClass5UY;
import X.AnonymousClass66R;
import X.C003203q;
import X.C106715a2;
import X.C107695bk;
import X.C111095hX;
import X.C111685iW;
import X.C116855qy;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C175728Zm;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C53602nM;
import X.C56422rx;
import X.C56952sp;
import X.C58422vE;
import X.C620633i;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C69263Wi;
import X.C70543af;
import X.C71343bx;
import X.C78393uw;
import X.C88864av;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.viewmodel.ExtensionsFooterViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Locale;

public final class ExtensionsInitialLoadingView extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public C69263Wi A03;
    public C64773Ex A04;
    public C56422rx A05;
    public C53602nM A06;
    public C620633i A07;
    public AnonymousClass1VX A08;
    public C66433Lk A09;
    public C106715a2 A0A;
    public AnonymousClass5UY A0B;
    public AnonymousClass4FS A0C;
    public C116855qy A0D;
    public boolean A0E;
    public final AnonymousClass66R A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsInitialLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
        this.A0F = C154517dI.A01(new C78393uw(this));
        A01(context);
    }

    public static final void setUpFlowsFooterWithLogo$lambda$4$lambda$3(AnonymousClass4GQ r1, Object obj) {
        C162457s7.A0J(r1, 0);
        r1.invoke(obj);
    }

    public final void A01(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = C18280x3.A0E(this, R.id.loading);
        this.A02 = AnonymousClass0x2.A0I(this, R.id.error);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.footer_business_logo);
        this.A0B = A0M;
        A0M.A06(8);
        this.A01 = (FrameLayout) C18280x3.A0E(this, R.id.loading_error_layout);
        if (getAbProps().A0Y(C58422vE.A02, 5468)) {
            FrameLayout frameLayout = this.A01;
            if (frameLayout == null) {
                throw C18270x1.A0S("loadingOrErrorLayout");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -1;
            FrameLayout frameLayout2 = this.A01;
            if (frameLayout2 == null) {
                throw C18270x1.A0S("loadingOrErrorLayout");
            }
            frameLayout2.setLayoutParams(layoutParams);
        }
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setContextualHelpHandler(C53602nM r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setErrorMessage(String str) {
        if (str != null && str.length() != 0) {
            TextView textView = this.A02;
            if (textView == null) {
                throw C18270x1.A0S("errorTextView");
            }
            textView.setText(str);
            textView.setVisibility(0);
            View view = this.A00;
            if (view == null) {
                throw C18270x1.A0S("loadingView");
            }
            view.setVisibility(8);
        }
    }

    public final void setFaqLinkFactory(C66433Lk r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setLinkifier(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setVerifiedNameManager(C56422rx r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    private final ExtensionsFooterViewModel getExtensionsFooterViewModel() {
        return (ExtensionsFooterViewModel) this.A0F.getValue();
    }

    public void A00() {
        if (!this.A0E) {
            this.A0E = true;
            C64333Db r2 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A09 = C64333Db.A8X(r2);
            this.A05 = (C56422rx) r2.AZn.get();
            this.A08 = C64333Db.A4B(r2);
            this.A04 = C64333Db.A26(r2);
            this.A03 = C64333Db.A04(r2);
            this.A0C = C64333Db.A8y(r2);
            C107695bk r1 = r2.A00;
            this.A0A = C18280x3.A0Q(r1);
            this.A06 = C18280x3.A0L(r1);
            this.A07 = C64333Db.A2o(r2);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0D;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C53602nM getContextualHelpHandler() {
        C53602nM r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contextualHelpHandler");
    }

    public final C66433Lk getFaqLinkFactory() {
        C66433Lk r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("faqLinkFactory");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C106715a2 getLinkifier() {
        C106715a2 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final C56422rx getVerifiedNameManager() {
        C56422rx r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("verifiedNameManager");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public static final void setUpFlowsFooterWithLogo$lambda$2$lambda$1(ExtensionsInitialLoadingView extensionsInitialLoadingView, FAQTextView fAQTextView) {
        C18260x0.A0O(extensionsInitialLoadingView, fAQTextView);
        C53602nM contextualHelpHandler = extensionsInitialLoadingView.getContextualHelpHandler();
        Activity A022 = C111095hX.A02(fAQTextView.getContext());
        C162457s7.A0K(A022, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        contextualHelpHandler.A01((C003203q) A022, "extensions_learn_more");
    }

    public final void setUpFlowsFooter(UserJid userJid, String str) {
        String str2;
        FAQTextView fAQTextView = (FAQTextView) C18280x3.A0E(this, R.id.footer_faq_text);
        fAQTextView.setVisibility(0);
        ExtensionsFooterViewModel extensionsFooterViewModel = getExtensionsFooterViewModel();
        if (extensionsFooterViewModel != null) {
            str2 = extensionsFooterViewModel.A0D(C18290x4.A0F(this), userJid);
        } else {
            str2 = null;
        }
        fAQTextView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3A1(fAQTextView));
        fAQTextView.setEducationTextFromArticleID(new SpannableString(str2), str);
    }

    public final void setUpFlowsFooterWithLogo(UserJid userJid, String str) {
        ExtensionsFooterViewModel extensionsFooterViewModel;
        View A0E2 = C18280x3.A0E(this, R.id.footer_with_logo_layout);
        A0E2.setLayoutDirection(AnonymousClass001.A1T(AnonymousClass0I0.A00(Locale.getDefault())) ? 1 : 0);
        A0E2.setVisibility(0);
        ExtensionsFooterViewModel extensionsFooterViewModel2 = getExtensionsFooterViewModel();
        String str2 = null;
        if (extensionsFooterViewModel2 != null) {
            str2 = extensionsFooterViewModel2.A0D(C18290x4.A0F(this), userJid);
        }
        AnonymousClass0x2.A0I(this, R.id.business_name).setText(str2);
        FAQTextView fAQTextView = (FAQTextView) C18280x3.A0E(this, R.id.learn_more_faq_text);
        if (!getAbProps().A0Y(C58422vE.A02, 4393) || !C175728Zm.A0S(C56952sp.A08(getAbProps(), 3063), "extensions_learn_more", false)) {
            fAQTextView.setEducationTextFromArticleID(new SpannableString(""), str);
        } else {
            AnonymousClass0x2.A14(fAQTextView.getAbProps(), fAQTextView);
            fAQTextView.setText(getLinkifier().A06(fAQTextView.getContext(), new C71343bx(this, 42, fAQTextView), fAQTextView.getText().toString(), "learn-more", AnonymousClass0x2.A05(fAQTextView)));
            AnonymousClass0x2.A12(fAQTextView, getSystemServices());
        }
        AnonymousClass5UY r0 = this.A0B;
        if (r0 == null) {
            throw C18270x1.A0S("businessLogoViewStubHolder");
        }
        r0.A06(0);
        ExtensionsFooterViewModel extensionsFooterViewModel3 = getExtensionsFooterViewModel();
        if (extensionsFooterViewModel3 != null) {
            Context A0F2 = C18290x4.A0F(this);
            C162457s7.A0J(userJid, 0);
            AnonymousClass3ZH A072 = extensionsFooterViewModel3.A00.A07(userJid);
            int dimensionPixelSize = A0F2.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            float A012 = C18310x6.A01(A0F2);
            if (A072 != null) {
                extensionsFooterViewModel3.A05.BkM(new C70543af(A0F2, A072, extensionsFooterViewModel3, A012, dimensionPixelSize));
            }
        }
        C15910sA A002 = AnonymousClass0IY.A00(this);
        if (A002 != null && (extensionsFooterViewModel = getExtensionsFooterViewModel()) != null) {
            AnonymousClass4K2.A00(A002, extensionsFooterViewModel.A01, new AnonymousClass42F(this), 116);
        }
    }

    public final void setupFooter(UserJid userJid, String str) {
        boolean A1U = C18270x1.A1U(userJid, str);
        ExtensionsFooterViewModel extensionsFooterViewModel = getExtensionsFooterViewModel();
        if (extensionsFooterViewModel == null || extensionsFooterViewModel.A0E(userJid) != A1U) {
            setUpFlowsFooter(userJid, str);
        } else {
            setUpFlowsFooterWithLogo(userJid, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsInitialLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
        this.A0F = C154517dI.A01(new C78393uw(this));
        A01(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExtensionsInitialLoadingView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public ExtensionsInitialLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }
}
