package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0YY;
import X.AnonymousClass3ZH;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass5QL;
import X.AnonymousClass5UX;
import X.AnonymousClass5YI;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass677;
import X.AnonymousClass69M;
import X.AnonymousClass91U;
import X.C005205m;
import X.C1001059l;
import X.C105365Uq;
import X.C106905aM;
import X.C107065ad;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C114015mM;
import X.C18310x6;
import X.C623834u;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C89644eZ;
import X.C95814uZ;
import X.C989753y;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class WallpaperCurrentPreviewActivity extends C89644eZ {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public Button A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public SeekBar A0D;
    public TextView A0E;
    public AnonymousClass0R8 A0F;
    public TextEmojiLabel A0G;
    public AnonymousClass5UX A0H;
    public C64773Ex A0I;
    public AnonymousClass5ZU A0J;
    public C105365Uq A0K;
    public C114015mM A0L;
    public C623834u A0M;
    public AnonymousClass5QL A0N;
    public WallpaperImagePreview A0O;
    public WallpaperMockChatView A0P;
    public boolean A0Q;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r0 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(android.app.Activity r2, android.content.Intent r3, X.AnonymousClass5QL r4) {
        /*
            java.lang.String r0 = "chat_jid"
            java.lang.String r0 = r3.getStringExtra(r0)
            X.4uZ r0 = X.C18310x6.A0S(r0)
            if (r0 == 0) goto L_0x001c
            if (r4 == 0) goto L_0x0015
            boolean r0 = r4.A03
            r1 = 2131895485(0x7f1224bd, float:1.9425804E38)
            if (r0 == 0) goto L_0x0018
        L_0x0015:
            r1 = 2131895483(0x7f1224bb, float:1.94258E38)
        L_0x0018:
            r2.setTitle(r1)
            return
        L_0x001c:
            boolean r0 = X.C107405bG.A0D(r2)
            r1 = 2131895496(0x7f1224c8, float:1.9425827E38)
            if (r0 == 0) goto L_0x0018
            r1 = 2131895486(0x7f1224be, float:1.9425806E38)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A0C(android.app.Activity, android.content.Intent, X.5QL):void");
    }

    public void A5r() {
        if (!this.A0Q) {
            this.A0Q = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0L = C64333Db.A29(A2Y);
            this.A0H = C86614Ku.A0R(A2Y);
            this.A0I = C64333Db.A26(A2Y);
            this.A0J = C64333Db.A28(A2Y);
            this.A0M = (C623834u) r1.AC9.get();
        }
    }

    public boolean A64() {
        return true;
    }

    public final void A75(C95814uZ r3) {
        Integer num;
        this.A0N = this.A0M.A08(this, r3);
        A0C(this, getIntent(), this.A0N);
        Drawable A042 = this.A0M.A04(this.A0N);
        if (A042 != null) {
            this.A0O.setImageDrawable(A042);
        }
        if (this.A0D.getVisibility() == 0) {
            AnonymousClass5QL r0 = this.A0N;
            int i = 0;
            if (!(r0 == null || (num = r0.A01) == null)) {
                i = num.intValue();
            }
            this.A0D.setProgress(i);
        }
    }

    public WallpaperCurrentPreviewActivity(int i) {
        this.A0Q = false;
        C86604Kt.A1K(this, 98);
    }

    public final void A74() {
        Point A012 = C623834u.A01(this);
        AnonymousClass001.A19(this.A07, A012.y, 0, View.MeasureSpec.makeMeasureSpec(A012.x, 1073741824));
        AnonymousClass001.A19(this.A04, A012.y, 0, View.MeasureSpec.makeMeasureSpec(A012.x, 1073741824));
        boolean A0D2 = C107405bG.A0D(this);
        TextView textView = this.A0E;
        int i = R.string.f11nameremoved;
        if (A0D2) {
            i = R.string.f11nameremoved;
        }
        textView.setText(i);
        int A032 = AnonymousClass5YI.A03(this);
        float min = Math.min(0.56f, ((float) (AnonymousClass4L0.A05(this.A07, AnonymousClass4L0.A05(this.A04, A012.y)) - getResources().getDimensionPixelSize(R.dimen.f6nameremoved))) / ((float) (A012.y + A032)));
        Point A013 = C623834u.A01(this);
        int min2 = (int) Math.min(getResources().getDimension(R.dimen.f6nameremoved), ((float) A013.x) * min);
        int i2 = (int) (((float) A013.y) * min);
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        int i3 = (int) (((float) this.A00) * min);
        View A002 = C005205m.A00(this, R.id.wallpaper_preview_toolbar_container);
        ViewGroup.LayoutParams layoutParams2 = A002.getLayoutParams();
        layoutParams2.height = i3;
        layoutParams2.width = min2;
        A002.setLayoutParams(layoutParams2);
        View A003 = C005205m.A00(this, R.id.current_wallpaper_preview_view_container);
        ViewGroup.LayoutParams layoutParams3 = A003.getLayoutParams();
        layoutParams3.height = i2;
        layoutParams3.width = min2;
        A003.setLayoutParams(layoutParams3);
        int i4 = i2 + layoutParams.height;
        View A004 = C005205m.A00(this, R.id.wallpaper_preview_outline_container);
        ViewGroup.LayoutParams layoutParams4 = A004.getLayoutParams();
        layoutParams4.height = i4;
        layoutParams4.width = min2;
        A004.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.A01.getLayoutParams();
        layoutParams5.width = min2;
        this.A01.setLayoutParams(layoutParams5);
        C989753y r1 = new C989753y(this, 1);
        this.A01.setOnClickListener(r1);
        this.A02.setOnClickListener(r1);
        this.A06.setFocusable(false);
        this.A06.setDescendantFocusability(393216);
        C95814uZ A0S = C18310x6.A0S(getIntent().getStringExtra("chat_jid"));
        TextView textView2 = this.A0E;
        if (A0S != null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
        }
        A75(A0S);
        ViewGroup.LayoutParams layoutParams6 = this.A06.getLayoutParams();
        layoutParams6.height = Math.max(layoutParams6.height, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        ViewGroup viewGroup = this.A06;
        ViewGroup.LayoutParams layoutParams7 = viewGroup.getLayoutParams();
        layoutParams7.height = (int) (((float) layoutParams7.height) * min);
        viewGroup.setLayoutParams(layoutParams7);
        if (this.A0P.getChildCount() == 0) {
            this.A0P.setMessages(getString(R.string.f11nameremoved), getString(R.string.f11nameremoved), (AnonymousClass677) null);
        }
        WallpaperMockChatView wallpaperMockChatView = this.A0P;
        wallpaperMockChatView.A00.setVisibility(4);
        wallpaperMockChatView.A03.setVisibility(4);
        wallpaperMockChatView.A03.setMinLines(1);
        wallpaperMockChatView.A03.setMaxLines(1);
        wallpaperMockChatView.A02.setMinEms(5);
        C86634Kw.A1I(wallpaperMockChatView.A02);
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(wallpaperMockChatView.A02);
        A0T.bottomMargin = wallpaperMockChatView.A03.getPaddingBottom() + wallpaperMockChatView.A04.getPaddingTop();
        wallpaperMockChatView.A02.setLayoutParams(A0T);
        wallpaperMockChatView.A01.setVisibility(4);
        wallpaperMockChatView.A04.setVisibility(4);
        wallpaperMockChatView.A04.setMinLines(1);
        wallpaperMockChatView.A04.setMaxLines(1);
        this.A0G.setTextSize(0, (float) ((int) (C86664Kz.A01(getResources(), R.dimen.f6nameremoved) * min)));
        if (A0S == null) {
            this.A0G.setText(R.string.f11nameremoved);
            this.A0H.A06(this.A09, R.drawable.avatar_contact);
        } else {
            AnonymousClass3ZH A0A2 = this.A0I.A0A(A0S);
            C105365Uq A072 = this.A0L.A07("wallpaper-current-preview-contact-photo", -1.0f, (int) (C86664Kz.A01(this.A09.getResources(), R.dimen.f6nameremoved) * min));
            this.A0K = A072;
            A072.A08(this.A09, A0A2);
            this.A0G.setText(this.A0J.A0H(A0A2));
        }
        boolean A0D3 = C107405bG.A0D(this);
        View view = this.A03;
        if (!A0D3) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        this.A0D.setThumb(new LayerDrawable(new Drawable[]{C18310x6.A0G(this, R.drawable.wallpaper_dimmer_seekbar_button_background), C107335b8.A04(this, R.drawable.ic_dim, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved))}));
        this.A0D.setOnSeekBarChangeListener(new AnonymousClass69M(this, 0));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 199 && i2 == -1) {
            A75(C18310x6.A0S(getIntent().getStringExtra("chat_jid")));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C107065ad.A04(C86664Kz.A0k(this, R.id.container), new AnonymousClass91U(this, 7));
        C107065ad.A03(this);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, (Toolbar) C005205m.A00(this, R.id.wallpaper_preview_toolbar));
        this.A0F = A2S;
        A2S.A0N(true);
        A0C(this, getIntent(), this.A0N);
        View A002 = C005205m.A00(this, R.id.change_current_wallpaper);
        this.A01 = A002;
        C989753y.A00(A002, this, 0);
        C106905aM.A04(C005205m.A01(this, R.id.wallpaper_dimmer_title));
        this.A00 = AnonymousClass5YI.A03(this);
        this.A03 = C005205m.A00(this, R.id.wallpaper_dimmer_container);
        this.A0D = (SeekBar) C005205m.A00(this, R.id.wallpaper_dimmer_seekbar);
        this.A04 = C005205m.A00(this, R.id.wallpaper_dimmer_container);
        this.A07 = (Button) C005205m.A00(this, R.id.change_current_wallpaper);
        this.A0A = C86664Kz.A0u(this, R.id.emoji_picker_btn);
        this.A0B = C86664Kz.A0u(this, R.id.input_attach_button);
        this.A08 = C86664Kz.A0u(this, R.id.camera_btn);
        this.A0C = C86664Kz.A0u(this, R.id.voice_note_btn);
        this.A0E = C005205m.A01(this, R.id.wallpaper_current_preview_theme_description);
        this.A06 = C86664Kz.A0k(this, R.id.text_entry_layout);
        this.A0O = (WallpaperImagePreview) C005205m.A00(this, R.id.current_wallpaper_preview_view);
        this.A09 = C86664Kz.A0u(this, R.id.conversation_contact_photo);
        this.A06 = C86664Kz.A0k(this, R.id.input_layout_content);
        this.A02 = C005205m.A00(this, R.id.current_wallpaper_preview_view_container);
        this.A01 = C005205m.A00(this, R.id.change_current_wallpaper);
        this.A05 = C005205m.A00(this, R.id.wallpaper_preview_toolbar_container);
        this.A0P = (WallpaperMockChatView) C005205m.A00(this, R.id.wallpaper_preview_default_chat_view);
        this.A0G = (TextEmojiLabel) C005205m.A00(this, R.id.conversation_contact_name);
        A74();
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.conversation_contact_name), 2);
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.emoji_picker_btn), 2);
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.entry), 2);
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.input_attach_button), 2);
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.camera_btn), 2);
        AnonymousClass0YY.A06(C005205m.A00(this, R.id.voice_note_btn), 2);
        AnonymousClass0YY.A06(((WallpaperMockChatView) C005205m.A00(this, R.id.wallpaper_preview_default_chat_view)).A07, 2);
        if (C1001059l.A04) {
            this.A06.setPadding(0, 0, 0, 0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A0A.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.A0B.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.A08.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = this.A0B.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            }
            this.A0C.setImageResource(R.drawable.input_mic_white_filled_wds);
        }
        AnonymousClass4SG.A3d(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C105365Uq r0 = this.A0K;
        if (r0 != null) {
            r0.A00();
        }
    }

    public int A5t() {
        return 78318969;
    }

    public WallpaperCurrentPreviewActivity() {
        this(0);
    }
}
