package com.whatsapp.webpagepreview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hk;
import X.AnonymousClass1VX;
import X.AnonymousClass35G;
import X.AnonymousClass36Y;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VE;
import X.AnonymousClass5VR;
import X.AnonymousClass5Yj;
import X.AnonymousClass67H;
import X.AnonymousClass6NL;
import X.AnonymousClass7QQ;
import X.C02680He;
import X.C06130Wj;
import X.C06560Yg;
import X.C106685Zz;
import X.C106905aM;
import X.C107075ae;
import X.C107335b8;
import X.C107555bV;
import X.C114635nM;
import X.C116855qy;
import X.C117105rO;
import X.C1232467r;
import X.C131946eR;
import X.C149027Kq;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C187948y4;
import X.C30481mW;
import X.C57132t9;
import X.C620733j;
import X.C64333Db;
import X.C66513Ls;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87044Mw;
import X.C88864av;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;
import java.util.Set;

public class WebPagePreviewView extends FrameLayout implements C187948y4, AnonymousClass4GJ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public LinearLayout A0E;
    public ProgressBar A0F;
    public ProgressBar A0G;
    public TextView A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public WaImageView A0K;
    public WaTextView A0L;
    public WaTextView A0M;
    public WaTextView A0N;
    public ThumbnailButton A0O;
    public ThumbnailButton A0P;
    public ThumbnailButton A0Q;
    public C620733j A0R;
    public C114635nM A0S;
    public AnonymousClass36Y A0T;
    public AnonymousClass1VX A0U;
    public C106685Zz A0V;
    public C116855qy A0W;
    public boolean A0X;
    public final int A0Y;
    public final int A0Z;
    public final Handler A0a;

    public void A0I(C30481mW r12, String str) {
        A03();
        String A032 = this.A0V.A03(r12.A1w());
        Set BBH = this.A0S.BBH(r12.A0o(), r12, str);
        byte[] A1z = r12.A1z();
        boolean A1W = AnonymousClass000.A1W(BBH);
        int i = r12.A01;
        A03();
        A0H(this.A0Q, A032, A1z, -1, i, false, A1W, true);
        setImageThumbContentIndicator(i);
    }

    public void setVideoLargeLogo(int i) {
        if (i == 1 || i == 7) {
            this.A0C.setVisibility(8);
            return;
        }
        C86624Kv.A0s(this.A0C);
        this.A0C.setVisibility(0);
        this.A0C.setImageResource(AnonymousClass35G.A00(i));
        this.A0C.setAlpha(1.0f);
    }

    private void setExternalShareIconOverlayOnThumbnail(FrameLayout frameLayout) {
        ImageView imageView = this.A0B;
        if (imageView == null) {
            this.A0B = C86614Ku.A0H(this);
            Drawable A002 = C02680He.A00(C86614Ku.A0C(this), getResources(), R.drawable.play_filled_32);
            this.A0B.setImageDrawable(A002);
            AnonymousClass0YG.A06(A002, -1);
            ShapeDrawable A0H2 = C86634Kw.A0H();
            A0H2.getPaint().setColor(-16777216);
            AnonymousClass001.A10(A0H2.getPaint());
            A0H2.getPaint().setStrokeWidth(2.0f);
            A0H2.setAlpha(152);
            A0H2.setBounds(0, 0, 128, 128);
            this.A0B.setBackground(A0H2);
            this.A0B.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.A0B.setPadding(32, 32, 32, 32);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(128, 128);
            layoutParams.gravity = 17;
            frameLayout.addView(this.A0B, layoutParams);
            return;
        }
        imageView.setVisibility(0);
    }

    private void setImageThumbContentIndicator(int i) {
        if (this.A0U.A0X(2652)) {
            WaImageView waImageView = this.A0K;
            int i2 = 8;
            if (i == 1) {
                i2 = 0;
            }
            waImageView.setVisibility(i2);
        }
    }

    private void setImageThumbWithBitmap(Bitmap bitmap) {
        this.A0Q.setImageBitmap(bitmap);
        this.A0Q.setVisibility(0);
    }

    public void A00() {
        this.A0a.removeCallbacksAndMessages((Object) null);
        this.A0J.A00();
        this.A0J.setVisibility(8);
        this.A0P.setVisibility(8);
    }

    public void A01() {
        this.A09.setVisibility(8);
        this.A08.setVisibility(0);
        this.A0J.setVisibility(0);
        C86614Ku.A1G(this.A0Q, this, 8);
        ImageView imageView = this.A0B;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void A02() {
        this.A01.setVisibility(0);
        this.A09.setVisibility(8);
        this.A08.setVisibility(8);
        C107555bV.A05(this.A0M, this.A0R, 0, C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public void A03() {
        this.A09.setVisibility(8);
        this.A08.setVisibility(8);
        this.A0J.setVisibility(0);
        C86614Ku.A1G(this.A0Q, this, 0);
    }

    public void A04() {
        this.A09.setVisibility(0);
        this.A08.setVisibility(8);
        this.A0J.setVisibility(0);
        C86614Ku.A1G(this.A0Q, this, 8);
    }

    public void A05() {
        if (!this.A0X) {
            this.A0X = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0U = C64333Db.A4B(A002);
            this.A0V = C86634Kw.A0m(A002);
            this.A0T = (AnonymousClass36Y) A002.A7u.get();
            this.A0R = C64333Db.A2t(A002);
            this.A0S = (C114635nM) A002.AQW.get();
        }
    }

    public final void A06() {
        this.A0a.removeCallbacksAndMessages((Object) null);
        this.A0I.A00();
        this.A0I.setBackground((Drawable) null);
    }

    public final void A07() {
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        AnonymousClass6NL r5 = new AnonymousClass6NL();
        AnonymousClass7QQ r2 = r5.A00;
        r2.A0G = false;
        r5.A02(0.75f);
        r5.A06(0);
        C86634Kw.A1N(r5, 1000);
        r2.A03 = 0.0f;
        shimmerFrameLayout.A05(r5.A01());
        ShimmerFrameLayout shimmerFrameLayout2 = this.A0J;
        Handler handler = this.A0a;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C117105rO(shimmerFrameLayout2, 45), 300);
    }

    public void A08(float f, float f2, float f3, float f4) {
        this.A0G.setAlpha(f);
        this.A04.setAlpha(f2);
        this.A0C.setAlpha(f2);
        this.A05.setAlpha(f3);
        this.A06.setAlpha(f4);
    }

    public final void A09(int i) {
        A0C(this.A0Q, 0.0f, 500);
        A0C(this.A0P, 1.0f, 500);
        if (this.A0U.A0X(2652) && i == 1) {
            A0C(this.A0K, 1.0f, 500);
        }
    }

    public void A0A(int i, int i2) {
        this.A08.getLayoutParams().width = i;
        C86624Kv.A0w(this.A08, i2);
        this.A08.requestLayout();
    }

    public final void A0C(View view, float f, int i) {
        view.animate().alpha(f).setDuration((long) i).setListener(new AnonymousClass67H(view, this, f, 2)).setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public void A0F(C66513Ls r18, List list, boolean z, boolean z2) {
        String str;
        int i;
        boolean z3;
        C66513Ls r1 = r18;
        String str2 = r1.A0J;
        String str3 = r1.A0G;
        if (TextUtils.isEmpty(r1.A0D)) {
            str = r1.A0Z;
        } else {
            str = r1.A0D;
        }
        byte[] bArr = r1.A0V;
        String str4 = r1.A0Z;
        Integer num = r1.A0B;
        C149027Kq r0 = r1.A09;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        boolean z4 = r1 instanceof AnonymousClass1Hk;
        if (z4) {
            z3 = ((AnonymousClass1Hk) r1).A01;
        } else {
            z3 = false;
        }
        A0K(num, str2, str3, str, str4, list, bArr, i, r1.A02, false, z, z3, z4, r1 instanceof C131946eR, z2);
    }

    public final void A0G(C66513Ls r15, boolean z) {
        String str;
        int i;
        String str2 = r15.A0J;
        String str3 = r15.A0G;
        if (TextUtils.isEmpty(r15.A0D)) {
            str = r15.A0Z;
        } else {
            str = r15.A0D;
        }
        String str4 = r15.A0Z;
        Integer num = r15.A0B;
        C149027Kq r0 = r15.A09;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        A0J(num, str2, str3, str, str4, (List) null, i, false, r15 instanceof C131946eR, false);
        if (z) {
            AlphaAnimation A0H2 = C86604Kt.A0H();
            C86604Kt.A1I(A0H2, 250);
            C1232467r.A00(A0H2, this, 18);
            this.A0E.startAnimation(A0H2);
            return;
        }
        this.A0E.animate().setListener((Animator.AnimatorListener) null).cancel();
        this.A0E.setAlpha(1.0f);
        this.A0E.setVisibility(0);
    }

    public final void A0J(Integer num, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        String str5;
        boolean A0C2;
        boolean A0J2 = this.A0T.A0J(str3);
        boolean A012 = AnonymousClass5VE.A01(str4);
        boolean A0I2 = this.A0T.A0I(str4);
        if (A012) {
            str2 = AnonymousClass5VR.A00(getContext(), num, str2, z3);
        }
        if (A0I2 && str4 != null) {
            List<String> pathSegments = Uri.parse(str4).getPathSegments();
            if (pathSegments.size() > 0) {
                boolean equals = ((String) C18290x4.A0k(pathSegments)).equals("video");
                Context context = getContext();
                int i2 = R.string.f11nameremoved;
                if (equals) {
                    i2 = R.string.f11nameremoved;
                }
                String string = context.getString(i2);
                if (string != null) {
                    str = string;
                }
            }
        }
        setImageProgressBarVisibility(false);
        if (i > 0) {
            this.A0M.setText(R.string.f11nameremoved);
            this.A0L.setVisibility(8);
        } else {
            setTitleAndSnippet(str, str2, z, list);
        }
        if (z2) {
            Context context2 = getContext();
            StringBuilder A0A2 = C18330xA.A0A(context2.getString(R.string.f11nameremoved));
            Drawable A013 = C107335b8.A01(context2, R.drawable.msg_status_shop);
            WaTextView waTextView = this.A0N;
            waTextView.setText(C87044Mw.A01(waTextView.getPaint(), A013, A0A2));
        } else {
            if (A012 || A0J2 || A0I2 || TextUtils.isEmpty(str3)) {
                str5 = null;
            } else {
                str5 = C57132t9.A00(this.A0V, str3);
            }
            setLinkHostname(str5);
        }
        setLinkGifSize(i);
        LinearLayout linearLayout = this.A0E;
        if (A012) {
            A0C2 = C620733j.A04(this.A0R);
        } else {
            A0C2 = C107555bV.A0C(str);
        }
        AnonymousClass0YH.A06(linearLayout, A0C2 ^ true ? 1 : 0);
    }

    public final void A0K(Integer num, String str, String str2, String str3, String str4, List list, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str5 = str4;
        int i3 = i;
        boolean z7 = z;
        A0J(num, str, str2, str3, str5, list, i3, z7, z5, z6);
        if (!z3) {
            int i4 = i2;
            if (!z2 || z || i > 0) {
                A03();
                A0H(this.A0Q, str5, bArr, i3, i4, z4, z7, true);
                setImageThumbContentIndicator(i4);
                return;
            }
            A01();
            if (i4 == 2 || (i4 == 3 && this.A0U.A0X(4272))) {
                setExternalShareIconOverlayOnThumbnail(this.A08);
                return;
            }
            return;
        }
        A04();
    }

    public void A0L(boolean z, boolean z2) {
        ThumbnailButton thumbnailButton;
        if (z2) {
            thumbnailButton = this.A0P;
        } else {
            thumbnailButton = this.A0Q;
        }
        int i = 0;
        thumbnailButton.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        if (this.A0U.A0X(2652) && !z2) {
            WaImageView waImageView = this.A0K;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0W;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0W = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getImageLargeThumb() {
        return this.A0O;
    }

    public ThumbnailButton getImageThumb() {
        return this.A0Q;
    }

    public WaTextView getSnippetView() {
        return this.A0L;
    }

    public int getTitleSnippetUrlLayoutHeight() {
        return this.A0E.getHeight();
    }

    public WaTextView getUrlView() {
        return this.A0N;
    }

    public ImageView getVideoLargeThumb() {
        return this.A0D;
    }

    public FrameLayout getVideoLargeThumbFrame() {
        return this.A09;
    }

    public void setImageCancelClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setImageContentBackgroundResource(int i) {
        this.A07.setBackgroundResource(i);
    }

    public void setImageContentClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setImageContentEnabled(boolean z) {
        this.A07.setEnabled(z);
    }

    public void setImageContentMinimumHeight(int i) {
        this.A07.setMinimumHeight(i);
    }

    public void setImageLargeLogo(int i) {
        ImageView imageView = this.A0A;
        if (i != 0) {
            imageView.setVisibility(0);
            this.A02.setVisibility(0);
            ImageView imageView2 = this.A0A;
            int i2 = R.drawable.ic_pip_facebook;
            if (i != 1) {
                i2 = R.drawable.ic_pip_instagram;
                if (i != 2) {
                    i2 = -1;
                }
            }
            imageView2.setImageResource(i2);
            return;
        }
        imageView.setVisibility(8);
        this.A02.setVisibility(8);
    }

    public void setImageLargeThumbFrameHeight(int i) {
        C86624Kv.A0w(this.A08, i);
    }

    public void setImageLargeThumbWithBackground(int i) {
        this.A0O.setBackgroundColor(i);
        this.A0O.setImageDrawable((Drawable) null);
    }

    public void setImageLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0O.setImageBitmap(bitmap);
        this.A0O.setVisibility(0);
    }

    public void setImagePlayFrameVisibility(boolean z) {
        this.A03.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setImageProgressBarVisibility(boolean z) {
        this.A0F.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setLargeThumbSizeWidthMatchParent(boolean z) {
        if (z) {
            LinearLayout.LayoutParams A0U2 = AnonymousClass001.A0U(this.A09);
            A0U2.width = -1;
            this.A09.setLayoutParams(A0U2);
            return;
        }
        this.A08.getLayoutParams().width = -1;
        this.A08.requestLayout();
    }

    public void setLinkGifSize(int i) {
        View view = this.A00;
        if (i > 0) {
            view.setVisibility(0);
            this.A0H.setVisibility(0);
            C86634Kw.A1J(this.A0H, this.A0R, (long) i);
            return;
        }
        view.setVisibility(8);
        this.A0H.setVisibility(8);
    }

    public void setLinkSnippet(CharSequence charSequence) {
        WaTextView waTextView = this.A0L;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0L.setText(charSequence);
    }

    public void setLinkTitle(CharSequence charSequence) {
        WaTextView waTextView = this.A0M;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0M.setText(charSequence);
    }

    public void setLinkTitleTypeface(int i) {
        WaTextView waTextView = this.A0M;
        getContext();
        waTextView.setTypeface(C106905aM.A01(), i);
    }

    public void setVideoLargeThumbFrameHeight(int i) {
        C86624Kv.A0w(this.A09, i);
    }

    public void setVideoLargeThumbWithBackground(int i) {
        this.A0D.setBackgroundColor(i);
        this.A0D.setImageDrawable((Drawable) null);
    }

    public void setVideoLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0D.setImageBitmap(bitmap);
        this.A0D.setVisibility(0);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A0B = null;
        this.A0Z = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0Y = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0a = AnonymousClass000.A0A();
        A0B(context);
    }

    private void setImageThumbWithCtwaDrawable(ThumbnailButton thumbnailButton) {
        Drawable A012 = C06130Wj.A01(getResources().getDrawable(R.drawable.ic_group_invite_link));
        AnonymousClass0YG.A06(A012, getResources().getColor(R.color.f5nameremoved));
        thumbnailButton.setImageDrawable(A012);
        C86624Kv.A0l(getResources(), thumbnailButton, AnonymousClass5Yj.A02(thumbnailButton.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        thumbnailButton.setVisibility(0);
    }

    private void setImageThumbWithGifDownloadDrawable(ThumbnailButton thumbnailButton) {
        thumbnailButton.setImageDrawable(thumbnailButton.getResources().getDrawable(R.drawable.inline_gif_download));
        C86604Kt.A0z(getContext(), thumbnailButton, R.color.f5nameremoved);
        C18300x5.A13(getContext(), thumbnailButton, R.string.f11nameremoved);
        thumbnailButton.setVisibility(0);
    }

    public final void A0B(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A07 = C86644Kx.A0I(this, R.id.link_preview_content);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C06560Yg.A02(this, R.id.thumb_frame);
        this.A0J = shimmerFrameLayout;
        shimmerFrameLayout.A00();
        this.A0J.A05((AnonymousClass7QQ) null);
        this.A0Q = C86664Kz.A16(this, R.id.thumb);
        this.A0P = C86664Kz.A16(this, R.id.thumb_cross_fade);
        this.A0K = AnonymousClass0x9.A0L(this, R.id.thumb_content_indicator);
        this.A03 = C06560Yg.A02(this, R.id.play_frame_small);
        this.A0F = (ProgressBar) C06560Yg.A02(this, R.id.progress);
        this.A01 = C06560Yg.A02(this, R.id.cancel);
        this.A09 = C86654Ky.A0L(this, R.id.large_thumb_frame);
        this.A0D = AnonymousClass0x9.A0E(this, R.id.large_thumb);
        this.A0C = AnonymousClass0x9.A0E(this, R.id.logo_button);
        this.A0G = (ProgressBar) C06560Yg.A02(this, R.id.large_progress);
        this.A04 = C06560Yg.A02(this, R.id.play_frame);
        this.A05 = C06560Yg.A02(this, R.id.inline_indication);
        this.A06 = C06560Yg.A02(this, R.id.inline_layer);
        this.A08 = C86654Ky.A0L(this, R.id.webPagePreviewImageLarge_frame);
        this.A0O = C86664Kz.A16(this, R.id.webPagePreviewImageLarge_thumb);
        this.A0A = AnonymousClass0x9.A0E(this, R.id.webPagePreviewImageLarge_logo_platform);
        this.A02 = C06560Yg.A02(this, R.id.webPagePreviewImageLarge_logo_platform_shadow);
        this.A0E = C86654Ky.A0N(this, R.id.titleSnippetUrlLayout);
        this.A0M = AnonymousClass0x7.A0L(this, R.id.title);
        this.A0L = AnonymousClass0x7.A0L(this, R.id.snippet);
        this.A0N = AnonymousClass0x7.A0L(this, R.id.url);
        this.A00 = C06560Yg.A02(this, R.id.gif_size_bullet);
        this.A0H = C18300x5.A0G(this, R.id.gif_size);
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C06560Yg.A02(this, R.id.full_shimmer_link_preview);
        this.A0I = shimmerFrameLayout2;
        shimmerFrameLayout2.A00();
        this.A0I.A05((AnonymousClass7QQ) null);
        Drawable A012 = C06130Wj.A01(C18310x6.A0G(context, R.drawable.balloon_incoming_frame).mutate());
        AnonymousClass0YG.A06(A012, AnonymousClass5Yj.A03(getContext(), context, R.attr.f3nameremoved, R.color.f5nameremoved));
        setForeground(A012);
        if (getId() == -1) {
            setId(R.id.link_preview_frame);
        }
    }

    public final void A0D(WaTextView waTextView, String str, List list, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > i) {
                str = AnonymousClass0x7.A0r(str, i);
            }
            waTextView.setText(C86644Kx.A0d(C86634Kw.A0B(waTextView, this), this.A0R, C107075ae.A00, str, list));
            return;
        }
        waTextView.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.A00 <= 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C66513Ls r3) {
        /*
            r2 = this;
            r2.A06()
            X.7Kq r0 = r3.A09
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A00
            r1 = 1
            if (r0 > 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 1
            r2.A0G(r3, r0)
            if (r1 == 0) goto L_0x002f
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A0P
            X.C86664Kz.A1R(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0P
            r0 = 0
            r1.setAlpha(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0P
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A0P
            r2.setImageThumbWithGifDownloadDrawable(r0)
            int r0 = r3.A02
            r2.A09(r0)
            return
        L_0x002f:
            r2.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0E(X.3Ls):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(com.whatsapp.components.button.ThumbnailButton r8, java.lang.String r9, byte[] r10, int r11, int r12, boolean r13, boolean r14, boolean r15) {
        /*
            r7 = this;
            boolean r6 = X.AnonymousClass5VE.A01(r9)
            r0 = 0
            if (r6 == 0) goto L_0x0009
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0009:
            r8.A02 = r0
            r3 = 0
            r8.setContentDescription(r3)
            r2 = 0
            if (r14 != 0) goto L_0x00d3
            if (r11 <= 0) goto L_0x0095
            r7.setImageThumbWithGifDownloadDrawable(r8)
            r0 = r15 ^ 1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0036
            com.whatsapp.components.button.ThumbnailButton r0 = r7.A0Q
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.cancel()
            com.whatsapp.components.button.ThumbnailButton r0 = r7.A0Q
            r0.setAlpha(r4)
            com.whatsapp.components.button.ThumbnailButton r1 = r7.A0Q
            r0 = 8
            r1.setVisibility(r0)
        L_0x0036:
            android.view.ViewPropertyAnimator r0 = r8.animate()
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.cancel()
            r8.setAlpha(r4)
        L_0x0044:
            r1 = 0
            r5 = 0
        L_0x0046:
            int r4 = r7.A0Z
            int r3 = r7.A0Y
            if (r6 == 0) goto L_0x007d
            if (r15 == 0) goto L_0x0056
            int r0 = r4 * 2
            int r4 = r0 / 3
            int r0 = r3 * 2
            int r3 = r0 / 3
        L_0x0056:
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131166877(0x7f07069d, float:1.7948012E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
        L_0x0063:
            r8.setScaleType(r0)
            r8.setPadding(r2, r2, r2, r2)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r4
            X.C86624Kv.A0w(r8, r3)
            r8.requestLayout()
            if (r5 == 0) goto L_0x007c
            if (r15 != 0) goto L_0x007c
            r7.A09(r12)
        L_0x007c:
            return
        L_0x007d:
            if (r1 == 0) goto L_0x008d
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131166158(0x7f0703ce, float:1.7946553E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0063
        L_0x008d:
            if (r11 <= 0) goto L_0x0092
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            goto L_0x0063
        L_0x0092:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0063
        L_0x0095:
            if (r10 == 0) goto L_0x00a7
            int r3 = r7.A0Z
            int r0 = r7.A0Y
            X.5WB r1 = new X.5WB
            r1.<init>(r3, r0)
            r0 = 0
            X.7KE r0 = X.C107245ax.A05(r0, r1, r10, r2)
            android.graphics.Bitmap r3 = r0.A02
        L_0x00a7:
            r1 = 1
            if (r3 == 0) goto L_0x00cd
            int r0 = r3.getHeight()
            if (r0 == 0) goto L_0x00cd
            int r0 = r3.getWidth()
            if (r0 == 0) goto L_0x00cd
            if (r15 == 0) goto L_0x00be
            r7.setImageThumbWithBitmap(r3)
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            r5 = 1
            goto L_0x0046
        L_0x00be:
            com.whatsapp.components.button.ThumbnailButton r0 = r7.A0P
            r0.setImageBitmap(r3)
            com.whatsapp.WaImageView r1 = r7.A0K
            r0 = 0
            r1.setAlpha(r0)
            r7.setImageThumbContentIndicator(r12)
            goto L_0x00bb
        L_0x00cd:
            if (r13 == 0) goto L_0x00d3
            r7.setImageThumbWithCtwaDrawable(r8)
            goto L_0x00bc
        L_0x00d3:
            if (r15 == 0) goto L_0x00e4
            com.whatsapp.components.button.ThumbnailButton r1 = r7.A0Q
            r0 = 0
            r1.setImageDrawable(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r7.A0Q
            r0 = 8
            X.C86614Ku.A1G(r1, r7, r0)
            goto L_0x0044
        L_0x00e4:
            r7.A00()
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0H(com.whatsapp.components.button.ThumbnailButton, java.lang.String, byte[], int, int, boolean, boolean, boolean):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0a.removeCallbacksAndMessages((Object) null);
    }

    public void setLinkHostname(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A0N.setVisibility(8);
            return;
        }
        this.A0N.setVisibility(0);
        if (str.length() > 150) {
            str = str.substring(0, 150);
        }
        this.A0N.setText(str);
    }

    public final void setTitleAndSnippet(String str, String str2, boolean z, List list) {
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !z) {
            A0D(this.A0M, str, list, 150);
            A0D(this.A0L, str2, list, 300);
            return;
        }
        this.A0M.setVisibility(8);
        this.A0L.setVisibility(8);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A0B = null;
        this.A0Z = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0Y = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0a = AnonymousClass000.A0A();
        A0B(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public WebPagePreviewView(Context context) {
        super(context);
        A05();
        this.A0B = null;
        this.A0Z = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0Y = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0a = AnonymousClass000.A0A();
        A0B(context);
    }
}
