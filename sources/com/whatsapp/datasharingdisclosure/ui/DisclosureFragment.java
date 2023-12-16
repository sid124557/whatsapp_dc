package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass214;
import X.AnonymousClass35Y;
import X.AnonymousClass4GP;
import X.AnonymousClass5Vo;
import X.AnonymousClass5X8;
import X.C08310eF;
import X.C106895aL;
import X.C158547k9;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C620733j;
import X.C77843u3;
import X.C84514Cq;
import X.C85874Hy;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class DisclosureFragment extends Hilt_DisclosureFragment {
    public LinearLayout A00;
    public NestedScrollView A01;
    public AnonymousClass5X8 A02;
    public C620733j A03;
    public C84514Cq A04;
    public AnonymousClass214 A05;
    public AnonymousClass4GP A06;
    public final ViewTreeObserver.OnScrollChangedListener A07 = new C85874Hy(this, 2);
    public final Integer A08 = Integer.valueOf(R.color.f5nameremoved);

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        ImageView A0F = AnonymousClass0x9.A0F(inflate, R.id.icon);
        A0F.setImageResource(R.drawable.vec_ic_consumer_disclosure);
        TextView A09 = AnonymousClass002.A09(inflate, R.id.title);
        boolean z = this instanceof ConsumerMarketingDisclosureFragment;
        if (z) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
        }
        A09.setText(i);
        TextView A092 = AnonymousClass002.A09(inflate, R.id.description);
        if (z) {
            i2 = R.string.f11nameremoved;
        } else {
            i2 = R.string.f11nameremoved;
        }
        A092.setText(i2);
        WaTextView waTextView = (WaTextView) inflate.findViewById(R.id.data_row1);
        WaTextView waTextView2 = (WaTextView) inflate.findViewById(R.id.data_row2);
        WaTextView waTextView3 = (WaTextView) inflate.findViewById(R.id.data_row3);
        C162457s7.A0H(waTextView);
        A1Z(waTextView, R.drawable.vec_ic_visibility_off_disclosure);
        C162457s7.A0H(waTextView2);
        A1Z(waTextView2, R.drawable.vec_ic_sync);
        C162457s7.A0H(waTextView3);
        A1Z(waTextView3, R.drawable.vec_ic_security);
        if (z) {
            i3 = R.string.f11nameremoved;
        } else {
            i3 = R.string.f11nameremoved;
        }
        waTextView.setText(i3);
        if (z) {
            i4 = R.string.f11nameremoved;
        } else {
            i4 = R.string.f11nameremoved;
        }
        waTextView2.setText(i4);
        if (z) {
            i5 = R.string.f11nameremoved;
        } else {
            i5 = R.string.f11nameremoved;
        }
        waTextView3.setText(i5);
        Integer num = this.A08;
        if (num != null) {
            int A042 = AnonymousClass0Y8.A04(A0G(), num.intValue());
            A0F.setColorFilter(A042);
            Drawable drawable = waTextView.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setTint(A042);
            }
            Drawable drawable2 = waTextView2.getCompoundDrawables()[0];
            if (drawable2 != null) {
                drawable2.setTint(A042);
            }
            Drawable drawable3 = waTextView3.getCompoundDrawables()[0];
            if (drawable3 != null) {
                drawable3.setTint(A042);
            }
        }
        this.A01 = (NestedScrollView) inflate.findViewById(R.id.scroll_view);
        this.A00 = (LinearLayout) inflate.findViewById(R.id.buttons_layout);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        int i2;
        ViewTreeObserver viewTreeObserver;
        View findViewById;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        FAQTextView fAQTextView = (FAQTextView) view.findViewById(R.id.description);
        boolean z = this instanceof ConsumerMarketingDisclosureFragment;
        if (z) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
        }
        SpannableString spannableString = new SpannableString(C08310eF.A09(this).getString(i));
        AnonymousClass5X8 r1 = this.A02;
        if (r1 != null) {
            fAQTextView.setEducationText(spannableString, r1.A00("https://faq.whatsapp.com/785493319976156").toString(), (String) null, new AnonymousClass35Y(this, 4));
            WDSButton wDSButton = (WDSButton) view.findViewById(R.id.action);
            WDSButton wDSButton2 = (WDSButton) view.findViewById(R.id.cancel);
            AnonymousClass214 r12 = AnonymousClass214.BLOCKING_DISCLOSURE;
            AnonymousClass214 A1Y = A1Y();
            C162457s7.A0H(wDSButton2);
            if (r12 == A1Y) {
                C162457s7.A0H(wDSButton);
                if (z) {
                    ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = (ConsumerMarketingDisclosureFragment) this;
                    C18260x0.A0O(wDSButton2, wDSButton);
                    wDSButton2.setVisibility(0);
                    C18290x4.A1G(wDSButton2, consumerMarketingDisclosureFragment, 42);
                    wDSButton.setVisibility(0);
                    C18290x4.A1G(wDSButton, consumerMarketingDisclosureFragment, 43);
                    wDSButton.setText(R.string.f11nameremoved);
                } else {
                    C18270x1.A14(wDSButton2, wDSButton);
                    int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                    View view2 = this.A0B;
                    if (!(view2 == null || (findViewById = view2.findViewById(R.id.icon)) == null)) {
                        C106895aL.A01(findViewById, new C158547k9(0, dimensionPixelSize, 0, 0));
                    }
                    wDSButton2.setVisibility(0);
                    C18290x4.A1G(wDSButton, this, 44);
                    wDSButton.setText(R.string.f11nameremoved);
                    C18290x4.A1G(wDSButton2, this, 45);
                }
            } else {
                C162457s7.A0H(wDSButton);
                if (z) {
                    ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment2 = (ConsumerMarketingDisclosureFragment) this;
                    C18260x0.A0O(wDSButton2, wDSButton);
                    wDSButton2.setVisibility(0);
                    C18290x4.A1G(wDSButton2, consumerMarketingDisclosureFragment2, 42);
                    wDSButton.setVisibility(0);
                    C18290x4.A1G(wDSButton, consumerMarketingDisclosureFragment2, 43);
                    i2 = R.string.f11nameremoved;
                } else if (this instanceof ConsumerDisclosureFragment) {
                    ConsumerDisclosureFragment consumerDisclosureFragment = (ConsumerDisclosureFragment) this;
                    C18260x0.A0O(wDSButton2, wDSButton);
                    ((ConsumerDisclosureViewModel) consumerDisclosureFragment.A04.getValue()).A0D(consumerDisclosureFragment.A02, consumerDisclosureFragment.A03);
                    wDSButton2.setVisibility(8);
                    C18290x4.A1G(wDSButton, consumerDisclosureFragment, 40);
                    AnonymousClass214 A1Y2 = consumerDisclosureFragment.A1Y();
                    AnonymousClass214 r0 = AnonymousClass214.INFO;
                    i2 = R.string.f11nameremoved;
                    if (A1Y2 == r0) {
                        i2 = R.string.f11nameremoved;
                    }
                } else {
                    C18260x0.A0O(wDSButton2, wDSButton);
                    wDSButton2.setVisibility(8);
                    C18290x4.A1G(wDSButton, this, 46);
                    i2 = R.string.f11nameremoved;
                }
                wDSButton.setText(i2);
            }
            NestedScrollView nestedScrollView = this.A01;
            if (!(nestedScrollView == null || (viewTreeObserver = nestedScrollView.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnScrollChangedListener(this.A07);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                C106895aL.A03(new C77843u3(this), view3);
                return;
            }
            return;
        }
        throw C18270x1.A0S("waLinkFactory");
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A06 = C18300x5.A1W(AnonymousClass214.BLOCKING_DISCLOSURE, A1Y());
    }

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.A0B;
        if (view != null) {
            C106895aL.A03(new C77843u3(this), view);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass4GP r0 = this.A06;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void A0c() {
        ViewTreeObserver viewTreeObserver;
        NestedScrollView nestedScrollView = this.A01;
        if (!(nestedScrollView == null || (viewTreeObserver = nestedScrollView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnScrollChangedListener(this.A07);
        }
        this.A01 = null;
        this.A00 = null;
        super.A0c();
    }

    public final AnonymousClass214 A1Y() {
        AnonymousClass214 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public final void Blt(C84514Cq r1) {
        this.A04 = r1;
    }

    public void A0p(Bundle bundle) {
        AnonymousClass214[] values = AnonymousClass214.values();
        Bundle bundle2 = this.A06;
        int i = 0;
        if (bundle2 != null) {
            i = bundle2.getInt("blocking_key", 0);
        }
        AnonymousClass214 r1 = values[i];
        C162457s7.A0J(r1, 0);
        this.A05 = r1;
        super.A0p(bundle);
    }

    public final void A1Z(WaTextView waTextView, int i) {
        Drawable A002 = AnonymousClass0RP.A00(A0G(), i);
        C620733j r0 = this.A03;
        if (r0 != null) {
            boolean A042 = C620733j.A04(r0);
            Drawable drawable = null;
            if (A042) {
                drawable = A002;
                A002 = null;
            }
            waTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, A002, (Drawable) null);
            return;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }
}
