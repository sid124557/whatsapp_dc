package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.components.ScalingFrameLayout;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4kC  reason: invalid class name and case insensitive filesystem */
public abstract class C91504kC extends AnonymousClass4uE {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public View.OnClickListener A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ListView A0I;
    public TextView A0J;
    public TextView A0K;
    public Toolbar A0L;
    public TextEmojiLabel A0M;
    public AnonymousClass64J A0N;
    public AnonymousClass5YB A0O;
    public C1224864o A0P;
    public ScalingFrameLayout A0Q;
    public AnonymousClass5ZU A0R;
    public C620733j A0S;
    public AnonymousClass5Y0 A0T;
    public AnonymousClass1VX A0U;
    public CharSequence A0V;
    public CharSequence A0W;
    public String A0X;
    public boolean A0Y = false;
    public boolean A0Z;
    public boolean A0a;
    public final ViewTreeObserver.OnGlobalLayoutListener A0b = new AnonymousClass6BG((Object) this, 8);

    public int A03(int i) {
        ImageView imageView;
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
        if (!(chatInfoLayoutV2 instanceof BusinessChatInfoLayout) || (imageView = chatInfoLayoutV2.A03) == null || imageView.getDrawable() == null) {
            return chatInfoLayoutV2.A04(i);
        }
        return (int) (((float) i) * 0.5625f);
    }

    public abstract int A04(int i);

    public void A0D(View view, View view2, Adapter adapter) {
        this.A0I.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BI(view, view2, adapter, this, 0));
    }

    public abstract int getToolbarColorResId();

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = i6 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int A032 = AnonymousClass4L0.A03(this, i5);
        if (i6 > i5 || this.A0Y) {
            View view3 = this.A0C;
            view3.layout(paddingLeft, paddingTop, A032, view3.getMeasuredHeight() + paddingTop);
            this.A0I.layout(paddingLeft, paddingTop, A032, paddingBottom);
            if (this.A0G != null) {
                int i7 = 1;
                if (C102805Ki.A00(this.A0S)) {
                    i7 = i5 - 1;
                }
                if (!C102805Ki.A00(this.A0S)) {
                    i5 = 0;
                }
                this.A0G.layout(i5, 0, i7, getHeight());
                return;
            }
            return;
        }
        if (C102805Ki.A00(this.A0S)) {
            ListView listView = this.A0I;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0C;
            view2 = this.A0I;
        } else {
            View view4 = this.A0C;
            view4.layout(paddingLeft, paddingTop, view4.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0I;
            view2 = this.A0C;
        }
        view.layout(C86664Kz.A0G(view2, paddingLeft), paddingTop, A032, paddingBottom);
    }

    public abstract void setOnPhotoClickListener(View.OnClickListener onClickListener);

    public abstract void setRadius(float f);

    public abstract void setStatusData(AnonymousClass5OF r1);

    private void setSubtitleSingleLine(boolean z) {
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setSingleLine(z);
        }
    }

    public void A02(boolean z) {
        this.A0Y = z;
        A08();
        if (this.A0G == null) {
            this.A0G = getVerticalDivider();
            getOverlay().add(this.A0G);
        }
        View view = this.A0G;
        if (view != null) {
            view.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
    }

    public void A05() {
        Log.d("chat-info-layout//portrait");
        this.A06 = 0;
        if (this.A0E.getVisibility() != 0) {
            this.A0E.setVisibility(0);
        }
    }

    public void A07() {
        CharSequence charSequence = this.A0W;
        if (charSequence != null) {
            this.A0E.setContentDescription(AnonymousClass5VS.A01(this.A0S, this.A0X == null ? new String[]{charSequence.toString()} : new String[]{charSequence.toString(), this.A0X}));
        }
    }

    public void A08() {
        int i;
        View A0G2 = C86644Kx.A0G(this.A0I);
        if (A0G2 != null) {
            if (this.A0I.getFirstVisiblePosition() == 0) {
                i = A0G2.getTop();
            } else {
                i = -getHeight();
            }
            setScrollPos(i);
        }
        C1224864o r0 = this.A0P;
        if (r0 != null) {
            r0.Bas();
        }
    }

    public void A0B(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        if ((getHeight() > getWidth() && this.A00 > 0.0f) || this.A0Y) {
            float f = this.A00;
            int i3 = (int) (((float) this.A04) * f * f);
            int i4 = (int) (((float) this.A03) * f * f);
            C107555bV.A05(this.A0H, this.A0S, i3, i4);
        }
    }

    public final void A0C(Context context) {
        this.A0Z = C106545Zk.A01(this.A0U);
        TypedValue A0B2 = AnonymousClass4L0.A0B();
        if (context.getTheme().resolveAttribute(R.attr.f3nameremoved, A0B2, true)) {
            this.A07 = TypedValue.complexToDimensionPixelSize(A0B2.data, C86614Ku.A0E(this));
        }
        boolean z = C1001059l.A07;
        Resources resources = getResources();
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        this.A02 = C86664Kz.A01(resources, i);
    }

    public final void A0E(CharSequence charSequence) {
        if (this.A0M != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            TextEmojiLabel textEmojiLabel = this.A0M;
            if (isEmpty) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.setVisibility(0);
                this.A0M.A0K((List) null, charSequence);
            }
            this.A0M.setOnClickListener(this.A0A);
            C107295b4.A03(this.A0M, R.string.f11nameremoved);
        }
    }

    public View getBusinessDetailsCard() {
        return this.A0B;
    }

    public int getColor() {
        return this.A05;
    }

    public TextView getContactNameView() {
        return this.A0J;
    }

    public View getDataDisclosureCard() {
        ViewStub A0n = C86664Kz.A0n(this.A0D, R.id.data_disclosure_card_stub);
        if (A0n == null) {
            return null;
        }
        return C86634Kw.A0M(A0n, R.layout.f8nameremoved);
    }

    public void setColor(int i) {
        int i2 = (i & 16777215) | (this.A05 & -16777216);
        this.A05 = i2;
        this.A0F.setBackgroundColor(i2);
    }

    public void setPushName(String str) {
        this.A0V = str;
        A0E(str);
    }

    public void setSubtitleText(String str) {
        TextView textView = this.A0K;
        if (textView != null && str != null) {
            this.A0X = str;
            textView.setText(str);
            this.A0K.setVisibility(C86614Ku.A01(TextUtils.isEmpty(str) ? 1 : 0));
            A07();
        }
    }

    public void setTitleTextMessageYourself(AnonymousClass3ZH r4) {
        this.A0O.A09(r4, (C107075ae) null, (List) null, 0.9f);
        AnonymousClass5YB r0 = this.A0O;
        r0.A02.setOnClickListener(this.A0A);
        A07();
    }

    public void setTitleVerified(boolean z) {
        this.A0O.A06(C18310x6.A02(z ? 1 : 0));
    }

    public void setToolbarIconColorIfNeeded(int i) {
        if (!C1001059l.A03 && !C107405bG.A0D(getContext())) {
            Drawable navigationIcon = this.A0L.getNavigationIcon();
            Drawable overflowIcon = this.A0L.getOverflowIcon();
            if (navigationIcon != null && overflowIcon != null) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                overflowIcon.setColorFilter(i, mode);
                navigationIcon.setColorFilter(i, mode);
                this.A0L.setNavigationIcon(navigationIcon);
                this.A0L.setOverflowIcon(overflowIcon);
            }
        }
    }

    public C91504kC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0C(context);
    }

    private View getVerticalDivider() {
        View view = new View(getContext());
        C86624Kv.A0l(getResources(), view, AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return view;
    }

    public void A06() {
        AnonymousClass5IC r3;
        Activity A002 = C621633u.A00(getContext());
        this.A00 = A002;
        if (A002 != null) {
            getSplitWindowManager().A0B(A002, this.A01);
        }
        this.A0F = findViewById(R.id.photo_overlay);
        this.A0H = findViewById(R.id.subject_layout);
        TextView A0G2 = C18300x5.A0G(this, R.id.conversation_contact_name);
        this.A0J = A0G2;
        if (C1001059l.A07) {
            AnonymousClass0Y9.A06(A0G2, R.style.f12nameremoved);
        }
        this.A0O = AnonymousClass5YB.A00(this, this.A0N, R.id.conversation_contact_name);
        C107295b4.A03(this.A0J, R.string.f11nameremoved);
        this.A0Q = (ScalingFrameLayout) findViewById(R.id.conversation_contact_name_scaler);
        Toolbar toolbar = (Toolbar) C06560Yg.A02(this, R.id.toolbar);
        this.A0L = toolbar;
        if ((toolbar instanceof AnonymousClass578) && C1001059l.A03) {
            if (C107405bG.A0D(getContext())) {
                r3 = AnonymousClass57A.A00;
            } else {
                r3 = AnonymousClass579.A00;
            }
            ((AnonymousClass578) this.A0L).setIconSet(r3);
            TextView textView = this.A0J;
            Context context = getContext();
            C162457s7.A0J(context, 0);
            AnonymousClass0x2.A0q(context, textView, r3.A00);
        }
        AnonymousClass5VW.A00(this.A0L, AnonymousClass58G.GONE);
        TextView A092 = AnonymousClass002.A09(this, R.id.conversation_contact_status);
        this.A0K = A092;
        if (A092 != null) {
            A092.setClickable(false);
        }
        this.A0M = C86644Kx.A0M(this, R.id.push_name);
        this.A0C = findViewById(R.id.header);
        this.A0I = (ListView) C86664Kz.A0i(this);
        this.A0E = C06560Yg.A02(this, R.id.header_placeholder);
        this.A01 = this.A0O.A02.getTextSize();
        A09();
        AnonymousClass6BG.A00(this.A0I.getViewTreeObserver(), this, 7);
    }

    public void A09() {
        Display A0f = C86664Kz.A0f(C111095hX.A04(this));
        Point A072 = AnonymousClass4L0.A07();
        A0f.getSize(A072);
        this.A0E.setLayoutParams(new LinearLayout.LayoutParams(-1, A03(A072.x)));
    }

    public void A0A(int i) {
        this.A0I = (ListView) C06560Yg.A02(this, 16908298);
        View inflate = C18280x3.A0D(this).inflate(i, this.A0I, false);
        this.A0D = inflate;
        this.A0I.addHeaderView(inflate, (Object) null, false);
        AnonymousClass0YY.A06(this.A0D, 2);
    }

    public int getToolbarColor() {
        return AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
    }

    public void onMeasure(int i, int i2) {
        ListView listView;
        int makeMeasureSpec;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() >= measuredWidth || this.A0Y) {
            View view = this.A0E;
            if (!(view == null || view.getVisibility() == 0)) {
                this.A0F.setOnClickListener((View.OnClickListener) null);
                this.A0F.setClickable(false);
                this.A0E.setVisibility(0);
                this.A0I.getViewTreeObserver().addOnGlobalLayoutListener(this.A0b);
            }
            AnonymousClass001.A19(this.A0C, Math.max(this.A07, this.A06), 1073741824, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824));
            listView = this.A0I;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            if (this.A0E.getVisibility() != 8) {
                this.A0F.setOnClickListener(this.A0A);
                C107295b4.A03(this.A0F, R.string.f11nameremoved);
                this.A0F.setClickable(true);
                AnonymousClass5YB r0 = this.A0O;
                r0.A02.setOnClickListener(this.A0A);
                this.A0E.setVisibility(8);
                this.A0I.post(new C71553cI(this, 15));
            }
            int i3 = (int) (((float) measuredWidth) * 0.618f);
            C86644Kx.A10(this.A0C, measuredWidth - i3, 1073741824, i2);
            listView = this.A0I;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        listView.measure(makeMeasureSpec, i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.A0A = onClickListener;
    }

    public void setOnScrollListener(C1224864o r1) {
        this.A0P = r1;
    }

    public void setScrollPos(int i) {
        AnonymousClass58G r0;
        if (getWidth() < getHeight() || this.A0Y) {
            if (this.A0a) {
                A05();
            }
            this.A0a = false;
            this.A09 = Math.max(this.A09, ((long) (((((float) (i - this.A08)) / C86664Kz.A02(this)) * 100.0f) - 100.0f)) * -1);
            int max = Math.max(this.A07, A03(getWidth()) + i);
            int A042 = A04(getWidth());
            this.A00 = Math.max(0.0f, ((float) (A042 - max)) / ((float) (A042 - this.A07)));
            TextUtils.TruncateAt ellipsize = this.A0O.A02.getEllipsize();
            int i2 = this.A07 * 2;
            TextEmojiLabel textEmojiLabel = this.A0O.A02;
            if (max < i2) {
                textEmojiLabel.setSingleLine(true);
                AnonymousClass5YB r02 = this.A0O;
                r02.A02.setEllipsize(TextUtils.TruncateAt.END);
                setSubtitleSingleLine(true);
                AnonymousClass001.A0T(this.A0O.A02).setMargins(0, 0, 0, 0);
            } else {
                textEmojiLabel.setSingleLine(false);
                this.A0O.A02.setEllipsize((TextUtils.TruncateAt) null);
                setSubtitleSingleLine(false);
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A0O.A02);
                int i3 = this.A07;
                A0T2.setMargins(0, Math.min(i3, max - (i3 * 2)), 0, 0);
            }
            A0E(this.A0V);
            if (ellipsize != this.A0O.A02.getEllipsize()) {
                AnonymousClass5YB r03 = this.A0O;
                r03.A02.setText(this.A0W);
                A07();
            }
            if (this.A06 != max) {
                this.A06 = max;
                int i4 = this.A05 >> 24;
                if (max == this.A07) {
                    if (i4 != -1) {
                        this.A0O.A02.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        TextView textView = this.A0K;
                        if (textView != null) {
                            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        }
                    }
                } else if (i4 == -1) {
                    this.A0O.A02.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    TextView textView2 = this.A0K;
                    if (textView2 != null) {
                        textView2.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    }
                }
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
                float f = chatInfoLayoutV2.A00;
                float f2 = 1.0f - f;
                int i5 = (int) (f * 255.0f);
                int i6 = (int) (((float) chatInfoLayoutV2.A04) * f * f);
                int i7 = (int) (((float) chatInfoLayoutV2.A03) * f * f);
                float f3 = chatInfoLayoutV2.A01;
                float f4 = (f3 - ((f3 - chatInfoLayoutV2.A02) * f)) / f3;
                boolean z = false;
                int i8 = (f > 0.8f ? 1 : (f == 0.8f ? 0 : -1));
                TextView textView3 = chatInfoLayoutV2.A0J;
                if (i8 > 0) {
                    textView3.setAlpha((float) i5);
                    chatInfoLayoutV2.A0J.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
                ScalingFrameLayout scalingFrameLayout = chatInfoLayoutV2.A0Q;
                scalingFrameLayout.A00 = f4;
                AnonymousClass001.A0T(scalingFrameLayout).setMargins(0, 0, 0, 0);
                chatInfoLayoutV2.A05 = (i5 << 24) | (chatInfoLayoutV2.A05 & 16777215);
                chatInfoLayoutV2.A0F();
                chatInfoLayoutV2.A0F.setBackgroundColor(chatInfoLayoutV2.A05);
                if (!C107405bG.A0D(chatInfoLayoutV2.getContext()) && !C1001059l.A03) {
                    int i9 = (int) (chatInfoLayoutV2.A00 * 255.0f);
                    if (i9 < 111) {
                        i9 = 111;
                    }
                    int i10 = i9 & 255;
                    chatInfoLayoutV2.setToolbarIconColorIfNeeded((i10 << 0) | (i10 << 16) | -16777216 | (i10 << 8));
                }
                C107555bV.A05(chatInfoLayoutV2.A0H, chatInfoLayoutV2.A0S, i6, i7);
                chatInfoLayoutV2.A0G();
                if (chatInfoLayoutV2.A00 <= 0.95f) {
                    z = true;
                }
                chatInfoLayoutV2.A08 = z;
                ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(chatInfoLayoutV2.A03);
                A0T3.setMargins(A0T3.leftMargin, A0T3.topMargin, A0T3.rightMargin, (int) (C86664Kz.A01(chatInfoLayoutV2.getResources(), R.dimen.f6nameremoved) * f2));
                chatInfoLayoutV2.A03.setLayoutParams(A0T3);
                chatInfoLayoutV2.A0F.setLayoutParams(A0T3);
                chatInfoLayoutV2.A05.setAnimationValue(chatInfoLayoutV2.A00);
                chatInfoLayoutV2.A0H();
                Toolbar toolbar = chatInfoLayoutV2.A0L;
                if (chatInfoLayoutV2.A00 > 0.8f) {
                    r0 = AnonymousClass58G.VISIBLE;
                } else {
                    r0 = AnonymousClass58G.GONE;
                }
                AnonymousClass5VW.A00(toolbar, r0);
                chatInfoLayoutV2.requestLayout();
            }
        } else if (!this.A0a) {
            this.A0a = true;
            ChatInfoLayoutV2 chatInfoLayoutV22 = (ChatInfoLayoutV2) this;
            chatInfoLayoutV22.A0E.setVisibility(8);
            chatInfoLayoutV22.A0F.setBackgroundColor(0);
            chatInfoLayoutV22.A0Q.setVisibility(8);
            chatInfoLayoutV22.A0G();
            ViewGroup.MarginLayoutParams A0T4 = AnonymousClass001.A0T(chatInfoLayoutV22.A03);
            A0T4.setMargins(0, 0, 0, 0);
            chatInfoLayoutV22.A03.setLayoutParams(A0T4);
            chatInfoLayoutV22.A0F.setLayoutParams(A0T4);
            chatInfoLayoutV22.setToolbarIconColorIfNeeded(chatInfoLayoutV22.getToolbarColor());
        }
    }

    public void setTitleText(String str) {
        CharSequence A042 = C107345b9.A04(getContext(), this.A0O.A02.getPaint(), this.A0T, str, 0.9f);
        this.A0W = A042;
        this.A0O.A02.setText(A042);
        AnonymousClass5YB r0 = this.A0O;
        r0.A02.setOnClickListener(this.A0A);
        A07();
    }

    public C91504kC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A0C(context);
    }

    public C91504kC(Context context) {
        super(context, (AttributeSet) null, 0);
        A0C(context);
    }
}
