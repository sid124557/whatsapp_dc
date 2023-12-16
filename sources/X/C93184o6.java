package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.4o6  reason: invalid class name and case insensitive filesystem */
public class C93184o6 extends C92404md {
    public AnonymousClass5UX A00;
    public C621233o A01;
    public final View A02;
    public final View A03 = findViewById(R.id.control_frame);
    public final View A04 = findViewById(R.id.live_location_label_holder);
    public final View A05;
    public final View A06 = findViewById(R.id.progress_bar);
    public final View A07;
    public final View A08;
    public final View A09 = findViewById(R.id.thumb_button);
    public final FrameLayout A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E = AnonymousClass0x9.A0F(this, R.id.thumb);
    public final TextView A0F = AnonymousClass002.A09(this, R.id.control_btn);
    public final TextView A0G = AnonymousClass002.A09(this, R.id.live_location_label);
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final ThumbnailButton A0J;
    public final C105365Uq A0K;
    public final WaMapView A0L;

    public void A1H() {
        A1t(false);
        A22();
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public final void A22() {
        long A052;
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int A053;
        Resources resources;
        int i;
        int dimensionPixelSize3;
        AnonymousClass3ZH A012;
        C30801n8 r11 = (C30801n8) this.A0S;
        View view2 = this.A09;
        View.OnLongClickListener onLongClickListener = this.A2T;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0I;
        C18320x8.A16(textEmojiLabel, r11, this, 45);
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A03;
        int A0A2 = C86664Kz.A0A(view3);
        View view4 = this.A08;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view4);
            A0T.topMargin = 0;
            A0T.bottomMargin = 0;
        }
        this.A0A.setVisibility(0);
        long A0H2 = this.A1E.A0H();
        C621233o r1 = this.A01;
        C626936e.A06(r1);
        boolean z = r11.A1J.A02;
        if (z) {
            A052 = r1.A06(r11);
        } else {
            A052 = r1.A05(r11);
        }
        boolean A022 = C106475Zd.A02(this.A1E, r11, A052);
        boolean A0Y = this.A0Z.A0Y();
        View view5 = this.A05;
        if (view5 != null) {
            view5.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        }
        if (!A022 || A0Y) {
            this.A0B.setVisibility(A0A2);
            imageView = this.A0C;
            imageView.setVisibility(A0A2);
            imageView2 = this.A0D;
            imageView2.setVisibility(A0A2);
        } else {
            this.A0B.setVisibility(0);
            imageView = this.A0C;
            imageView.setVisibility(0);
            imageView2 = this.A0D;
            imageView2.setVisibility(0);
        }
        imageView.clearAnimation();
        imageView2.clearAnimation();
        if (A022 && A052 > A0H2 && !A0Y) {
            AlphaAnimation A0H3 = C86604Kt.A0H();
            C86614Ku.A1K(A0H3, 1000);
            A0H3.setRepeatCount(-1);
            A0H3.setRepeatMode(2);
            C86624Kv.A19(A0H3, this, 4);
            AlphaAnimation A0H4 = C86604Kt.A0H();
            A0H4.setDuration(1000);
            A0H4.setStartOffset(300);
            A0H4.setInterpolator(new DecelerateInterpolator());
            A0H4.setRepeatCount(-1);
            A0H4.setRepeatMode(2);
            imageView.startAnimation(A0H3);
            imageView2.startAnimation(A0H4);
        }
        this.A04.setVisibility(0);
        Context context = getContext();
        C56972sr r12 = this.A0Z;
        C28071fd r0 = this.A0Q;
        C626936e.A06(r0);
        View.OnClickListener A002 = C106475Zd.A00(context, r12, r0, r11, A022);
        if (!A022 || A0Y) {
            view = this.A07;
            view.setVisibility(A0A2);
            textEmojiLabel.setVisibility(A0A2);
        } else {
            view = this.A07;
            view.setVisibility(0);
            textEmojiLabel.setVisibility(0);
        }
        view2.setOnClickListener(A002);
        Context context2 = getContext();
        C56612sH r13 = this.A1E;
        String A013 = C106475Zd.A01(context2, this.A0Z, r13, this.A0M, this.A01, r11, A022);
        TextView textView = this.A0G;
        textView.setText(A013);
        textView.setTextColor(getSecondaryTextColor());
        View view6 = this.A02;
        if (view6 != null) {
            view6.setVisibility(A0A2);
        }
        WaMapView waMapView = this.A0L;
        WaMapView waMapView2 = waMapView;
        C28071fd r3 = this.A0Q;
        C626936e.A06(r3);
        waMapView.A02(r3, r11, A022);
        if (waMapView2.getVisibility() == 0) {
            ThumbnailButton thumbnailButton = this.A0J;
            C56972sr r02 = this.A0Z;
            AnonymousClass5UX r14 = this.A00;
            C626936e.A06(r14);
            C105365Uq r32 = this.A0K;
            C66473Lo r15 = this.A1H;
            if (z) {
                A012 = C86634Kw.A0V(r02);
            } else {
                UserJid A0o = r11.A0o();
                if (A0o != null) {
                    A012 = r15.A01(A0o);
                } else {
                    r14.A06(thumbnailButton, R.drawable.avatar_contact);
                }
            }
            r32.A08(thumbnailButton, A012);
        }
        if (!TextUtils.isEmpty(r11.A03)) {
            setMessageText(r11.A03, this.A0H, r11);
            view.setVisibility(AnonymousClass001.A08(A022 ? 1 : 0));
            Resources resources2 = getResources();
            i = R.dimen.f6nameremoved;
            dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            A053 = C86614Ku.A05(this, R.dimen.f6nameremoved);
            resources = getResources();
        } else {
            setMessageText("", this.A0H, r11);
            view.setVisibility(A0A2);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            A053 = C86614Ku.A05(this, R.dimen.f6nameremoved);
            resources = getResources();
            i = R.dimen.f6nameremoved;
        }
        textEmojiLabel.setPadding(dimensionPixelSize, dimensionPixelSize2, A053, resources.getDimensionPixelSize(i));
        if (view4 != null) {
            boolean isEmpty = TextUtils.isEmpty(r11.A03);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (isEmpty) {
                layoutParams.addRule(11);
                layoutParams.addRule(A0A2, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.A08;
                C86604Kt.A19(viewGroup);
                dimensionPixelSize3 = C86654Ky.A02(getResources(), R.dimen.f6nameremoved, viewGroup.getMeasuredWidth());
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(3, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            boolean A042 = C620733j.A04(this.A0M);
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(textView);
            if (A042) {
                A0T2.rightMargin = dimensionPixelSize3;
            } else {
                A0T2.leftMargin = dimensionPixelSize3;
            }
        }
        TextView textView2 = this.A0F;
        if (textView2 != null) {
            textView2.setVisibility(A0A2);
        }
        int i2 = r11.A02;
        if (i2 == 1) {
            View view7 = this.A06;
            if (z) {
                C86644Kx.A11(view7, view3, 0);
                view2.setOnClickListener((View.OnClickListener) null);
            } else {
                view7.setVisibility(0);
            }
        } else if (!z || i2 == 2 || !A022) {
            View view8 = this.A06;
            if (view8 != null) {
                view8.setVisibility(A0A2);
            }
        } else {
            View view9 = this.A06;
            if (view9 != null) {
                view9.setVisibility(A0A2);
            }
            if (textView2 != null && !this.A0Z.A0Y()) {
                textView2.setVisibility(0);
                textView2.setText(R.string.f11nameremoved);
                AnonymousClass54F.A00(textView2, this, 35);
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
            view.setVisibility(A0A2);
            textEmojiLabel.setVisibility(A0A2);
            if (!this.A0Z.A0Y()) {
                AnonymousClass54F.A00(view2, this, 35);
            }
        }
        if (waMapView2.getVisibility() == A0A2) {
            this.A22.A0A(this.A0E, r11, new C100465Ba(this, 6));
        }
    }

    public C30801n8 getFMessage() {
        return (C30801n8) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30801n8);
        this.A0S = r2;
    }

    public C93184o6(Context context, C105365Uq r5, AnonymousClass677 r6, C30801n8 r7) {
        super(context, r6, r7);
        this.A0K = r5;
        FrameLayout A0s = C86664Kz.A0s(this, R.id.map_frame);
        this.A0A = A0s;
        this.A0J = (ThumbnailButton) findViewById(R.id.contact_thumbnail);
        this.A02 = findViewById(R.id.contact_thumbnail_overlay);
        this.A05 = findViewById(R.id.message_info_holder);
        this.A08 = findViewById(R.id.text_and_date);
        this.A07 = findViewById(R.id.btn_divider);
        this.A0I = C86644Kx.A0M(this, R.id.stop_share_btn);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.live_location_caption);
        this.A0H = A0M;
        this.A0B = AnonymousClass0x9.A0F(this, R.id.live_location_icon_1);
        this.A0C = AnonymousClass0x9.A0F(this, R.id.live_location_icon_2);
        this.A0D = AnonymousClass0x9.A0F(this, R.id.live_location_icon_3);
        this.A0L = (WaMapView) findViewById(R.id.map_holder);
        C86964Mo.A00(this.A0O, A0M);
        if (A0s != null) {
            A0s.setForeground(getLiveLocationFrameForegroundDrawable());
        }
        A22();
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        FrameLayout frameLayout = this.A0A;
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
    }

    public Drawable getLiveLocationFrameForegroundDrawable() {
        if (isPressed()) {
            Context context = getContext();
            boolean z = this.A0S.A1J.A02;
            Context context2 = getContext();
            int i = R.attr.f3nameremoved;
            int i2 = R.color.f5nameremoved;
            if (z) {
                i = R.attr.f3nameremoved;
                i2 = R.color.f5nameremoved;
            }
            return C107335b8.A04(context, R.drawable.balloon_live_location_incoming_frame, AnonymousClass5Yj.A02(context2, i, i2));
        }
        boolean z2 = this.A0S.A1J.A02;
        int i3 = R.drawable.balloon_live_location_incoming_frame;
        if (z2) {
            i3 = R.drawable.balloon_live_location_outgoing_frame;
        }
        Context context3 = getContext();
        boolean z3 = this.A0S.A1J.A02;
        Context context4 = getContext();
        int i4 = R.attr.f3nameremoved;
        int i5 = R.color.f5nameremoved;
        if (z3) {
            i4 = R.attr.f3nameremoved;
            i5 = R.color.f5nameremoved;
        }
        return C107335b8.A04(context3, i3, AnonymousClass5Yj.A02(context4, i4, i5));
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        return C87094Nz.A05(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
