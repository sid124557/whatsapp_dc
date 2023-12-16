package com.whatsapp.gifsearch;

import X.AnonymousClass002;
import X.AnonymousClass0O5;
import X.AnonymousClass0x2;
import X.AnonymousClass123;
import X.AnonymousClass1WK;
import X.AnonymousClass33p;
import X.AnonymousClass4AK;
import X.AnonymousClass4FV;
import X.AnonymousClass4QH;
import X.AnonymousClass5S9;
import X.AnonymousClass68H;
import X.AnonymousClass68Y;
import X.C04580Ov;
import X.C06560Yg;
import X.C105895Wv;
import X.C106095Xp;
import X.C109665ez;
import X.C1231367g;
import X.C1231767k;
import X.C162457s7;
import X.C166677z5;
import X.C179348j0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C26711ce;
import X.C49872hE;
import X.C55922r8;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C635339p;
import X.C69993Zl;
import X.C86604Kt;
import X.C86634Kw;
import X.C86654Ky;
import X.C94294qu;
import X.C95414tc;
import X.C989553w;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class GifSearchContainer extends AnonymousClass4QH {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public RecyclerView A06;
    public WaEditText A07;
    public C620633i A08;
    public AnonymousClass33p A09;
    public C620733j A0A;
    public AnonymousClass5S9 A0B;
    public AnonymousClass4FV A0C;
    public C106095Xp A0D;
    public AnonymousClass123 A0E;
    public C179348j0 A0F;
    public C55922r8 A0G;
    public AnonymousClass4AK A0H;
    public C60152y5 A0I;
    public C105895Wv A0J;
    public CharSequence A0K;
    public String A0L;
    public boolean A0M;
    public final C04580Ov A0N = new C1231367g(this);
    public final AnonymousClass0O5 A0O = new C1231767k(this, 11);
    public final C166677z5 A0P = new AnonymousClass68H(this, 8);
    public final C109665ez A0Q = new C989553w(this, 23);
    public final C109665ez A0R = new C989553w(this, 24);
    public final C109665ez A0S = new C989553w(this, 25);
    public final Runnable A0T = new C69993Zl(this, 37);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public static final void setupSearchContainer$lambda$4$lambda$2(GifSearchContainer gifSearchContainer, View view) {
        C162457s7.A0J(gifSearchContainer, 0);
        RecyclerView recyclerView = gifSearchContainer.A06;
        if (recyclerView != null) {
            recyclerView.A0T();
        }
    }

    public final void setGifCache(C106095Xp r2) {
        C162457s7.A0J(r2, 0);
        this.A0D = r2;
    }

    public final void setImeUtils(C105895Wv r2) {
        C162457s7.A0J(r2, 0);
        this.A0J = r2;
    }

    public final void setSharedPreferencesFactory(C60152y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A0I = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setWaSharedPreferences(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setWamRuntime(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0A = r2;
    }

    public final void A01(Activity activity, C94294qu r6, C55922r8 r7, AnonymousClass4AK r8) {
        int i;
        this.A0G = r7;
        this.A0H = r8;
        this.A0B = r6;
        setupViews(activity);
        setVisibility(0);
        int A052 = C18290x4.A05(this.A02);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(A052);
        }
        View view2 = this.A04;
        if (view2 != null) {
            view2.setVisibility(A052);
        }
        View view3 = this.A02;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        C55922r8 r3 = this.A0G;
        if (r3 != null) {
            AnonymousClass123 r1 = this.A0E;
            if (r1 != null) {
                r1.A0K(r3.A01());
            }
            AnonymousClass4FV wamRuntime = getWamRuntime();
            AnonymousClass1WK r12 = new AnonymousClass1WK();
            if (r3 instanceof C26711ce) {
                i = 1;
            } else {
                i = 0;
            }
            r12.A00 = Integer.valueOf(i);
            wamRuntime.BhD(r12);
        }
        this.A0L = "";
        WaEditText waEditText = this.A07;
        if (waEditText != null) {
            waEditText.setText("");
            waEditText.requestFocus();
            waEditText.A07(false);
        }
    }

    public final void A02(CharSequence charSequence) {
        String str;
        if (this.A0G != null) {
            int A052 = C18290x4.A05(this.A03);
            View view = this.A04;
            if (view != null) {
                view.setVisibility(A052);
            }
            View view2 = this.A02;
            boolean z = false;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            C49872hE r2 = null;
            C55922r8 r1 = this.A0G;
            if (z) {
                if (r1 != null) {
                    r2 = r1.A01();
                }
            } else if (r1 != null) {
                C162457s7.A0J(charSequence, 0);
                r2 = r1.A02(charSequence);
            }
            AnonymousClass123 r0 = this.A0E;
            if (r0 != null) {
                r0.A0K(r2);
            }
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            this.A0L = str;
        }
    }

    public final C106095Xp getGifCache() {
        C106095Xp r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("gifCache");
    }

    public final C105895Wv getImeUtils() {
        C105895Wv r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("imeUtils");
    }

    public final C60152y5 getSharedPreferencesFactory() {
        C60152y5 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final AnonymousClass33p getWaSharedPreferences() {
        AnonymousClass33p r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final AnonymousClass4FV getWamRuntime() {
        AnonymousClass4FV r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("wamRuntime");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    private final void setupRecyclerView(ViewGroup viewGroup) {
        RecyclerView A0P2 = C86654Ky.A0P(viewGroup, R.id.search_result);
        this.A06 = A0P2;
        if (A0P2 != null) {
            A0P2.A0q(this.A0O);
            A0P2.A0o(this.A0N);
            C106095Xp gifCache = getGifCache();
            C95414tc r2 = new C95414tc(getSystemServices(), getWamRuntime(), gifCache, this, this.A0H, getSharedPreferencesFactory());
            this.A0E = r2;
            A0P2.setAdapter(r2);
        }
    }

    private final void setupSearchContainer(ViewGroup viewGroup) {
        String str;
        this.A03 = C06560Yg.A02(viewGroup, R.id.no_results);
        this.A04 = C06560Yg.A02(viewGroup, R.id.retry_panel);
        this.A05 = C06560Yg.A02(viewGroup, R.id.search_container);
        WaEditText waEditText = (WaEditText) C06560Yg.A02(viewGroup, R.id.search_bar);
        this.A07 = waEditText;
        if (waEditText != null) {
            waEditText.addTextChangedListener(this.A0P);
            C635339p.A00(waEditText, this, 39);
            Resources resources = waEditText.getResources();
            Object[] A0L2 = AnonymousClass002.A0L();
            C55922r8 r0 = this.A0G;
            if (r0 == null) {
                str = null;
            } else if (r0 instanceof C26711ce) {
                str = "Tenor";
            } else {
                str = "Giphy";
            }
            waEditText.setHint(C18320x8.A0b(resources, str, A0L2, 0, R.string.f11nameremoved));
            waEditText.setOnEditorActionListener(new AnonymousClass68Y(this, 3));
        }
        View A022 = C06560Yg.A02(viewGroup, R.id.clear_search_btn);
        this.A01 = A022;
        if (A022 != null) {
            A022.setOnClickListener(this.A0R);
        }
        this.A02 = C06560Yg.A02(viewGroup, R.id.progress_container);
        ImageView A0J2 = C86604Kt.A0J(viewGroup, R.id.back);
        A0J2.setOnClickListener(this.A0Q);
        C18270x1.A0d(getContext(), A0J2, getWhatsAppLocale(), R.drawable.ic_back);
        C06560Yg.A02(viewGroup, R.id.retry_button).setOnClickListener(this.A0S);
    }

    private final void setupViews(Activity activity) {
        if (getChildCount() <= 0) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.f8nameremoved, this, false);
            C162457s7.A0K(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            setupRecyclerView(viewGroup);
            setupSearchContainer(viewGroup);
            View view = this.A05;
            if (view != null) {
                viewGroup.removeView(view);
                if (this.A00 == 48) {
                    viewGroup.addView(this.A05, 0);
                } else {
                    viewGroup.addView(this.A05, viewGroup.getChildCount());
                }
            }
            addView(viewGroup);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredHeight() != i4 - i2) {
            if (!this.A0M) {
                post(new C69993Zl(this, 38));
            }
            this.A0M = !this.A0M;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        SharedPreferences A0F2;
        String str;
        if (!isInEditMode()) {
            int size = View.MeasureSpec.getSize(i2);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                getImeUtils();
                if (!C105895Wv.A00(this)) {
                    AnonymousClass33p waSharedPreferences = getWaSharedPreferences();
                    int i3 = C86634Kw.A0E(this).orientation;
                    if (i3 == 1) {
                        A0F2 = AnonymousClass0x2.A0F(waSharedPreferences);
                        str = "keyboard_height_portrait";
                    } else if (i3 == 2) {
                        A0F2 = AnonymousClass0x2.A0F(waSharedPreferences);
                        str = "keyboard_height_landscape";
                    }
                    int A022 = C18280x3.A02(A0F2, str);
                    if (A022 > 0) {
                        if (size > A022) {
                            size = A022;
                        }
                        i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setOnActionListener(C179348j0 r1) {
        this.A0F = r1;
    }

    public final void setSearchContainerGravity(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }
}
