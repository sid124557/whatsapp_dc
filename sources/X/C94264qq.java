package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.4qq  reason: invalid class name and case insensitive filesystem */
public final class C94264qq extends C89224c7 implements C182388oK {
    public int A00;
    public View A01;
    public View A02;
    public C115975pX A03;
    public C137296oS A04;
    public boolean A05 = false;
    public boolean A06;
    public final AnonymousClass0O5 A07 = new C1231767k(this, 10);
    public final C56972sr A08;
    public final C66663Mh A09;
    public final C104445Qz A0A;
    public final AnonymousClass5KZ A0B;
    public final C114375mw A0C;
    public final AnonymousClass5RA A0D;
    public final AnonymousClass1VX A0E;
    public final C49652gs A0F;
    public final C29351ig A0G;
    public final C85174Ff A0H = new AnonymousClass6AT(this, 1);
    public final C55862r2 A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        if (r13 != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        if (r13 != 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(int r13) {
        /*
            r12 = this;
            r10 = 1
            if (r13 == 0) goto L_0x0011
            if (r13 == r10) goto L_0x0011
            r0 = 2
            if (r13 != r0) goto L_0x0185
            X.5RA r0 = r12.A0D
            if (r0 == 0) goto L_0x0010
            X.6oS r0 = r0.A05
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r13 = 0
        L_0x0011:
            r9 = 8
            r7 = 8
            if (r13 != r10) goto L_0x0018
            r7 = 0
        L_0x0018:
            r4 = 2
            r5 = 0
            if (r13 == r4) goto L_0x0021
            r5 = 8
            r8 = 0
            if (r13 == 0) goto L_0x0023
        L_0x0021:
            r8 = 8
        L_0x0023:
            r3 = 3
            r2 = 8
            if (r13 != r3) goto L_0x0029
            r2 = 0
        L_0x0029:
            android.view.View r6 = r12.A01
            r1 = 0
            if (r13 == 0) goto L_0x0030
            if (r13 == r10) goto L_0x0038
        L_0x0030:
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r12.A0P
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0038
            r1 = 8
        L_0x0038:
            r6.setVisibility(r1)
            boolean r0 = r12.A0L()
            if (r0 == 0) goto L_0x0176
            android.view.View r1 = r12.A02
            if (r13 == 0) goto L_0x0172
            r0 = 0
        L_0x0046:
            r1.setVisibility(r0)
        L_0x0049:
            X.7Ha r0 = r12.A09
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0052
            r0 = 1
            if (r13 == 0) goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r12.A0D(r0)
            com.whatsapp.WaEditText r0 = r12.A0K
            if (r0 == 0) goto L_0x005f
            if (r13 != 0) goto L_0x016d
            r0.requestFocus()
        L_0x005f:
            android.view.View r0 = r12.getContentView()
            android.content.Context r6 = r0.getContext()
            r1 = 2130969791(0x7f0404bf, float:1.7548274E38)
            r0 = 2131101267(0x7f060653, float:1.7814939E38)
            int r6 = X.AnonymousClass5Yj.A02(r6, r1, r0)
            boolean r0 = X.AnonymousClass000.A1T(r13)
            X.5KZ r9 = r12.A0B
            r11 = 2131232191(0x7f0805bf, float:1.8080484E38)
            r10 = 2131101268(0x7f060654, float:1.781494E38)
            if (r0 == 0) goto L_0x0083
            r11 = 2131232193(0x7f0805c1, float:1.8080488E38)
            r10 = r6
        L_0x0083:
            X.5IW r1 = r9.A01
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0166
            android.widget.ImageView r1 = r1.A02
            android.content.Context r0 = r1.getContext()
            X.C86644Kx.A0l(r0, r1, r10)
        L_0x0092:
            X.5IW r0 = r9.A01
            android.view.View r0 = r0.A01
            r0.setVisibility(r8)
            X.5IW r0 = r9.A01
            android.view.View r0 = r0.A00
            r0.setVisibility(r8)
            X.5mw r8 = r12.A0C
            if (r8 == 0) goto L_0x00d2
            r0 = 1
            r10 = 2131232264(0x7f080608, float:1.8080632E38)
            r9 = 2131101268(0x7f060654, float:1.781494E38)
            if (r13 != r0) goto L_0x00b1
            r10 = 2131232270(0x7f08060e, float:1.8080645E38)
            r9 = r6
        L_0x00b1:
            X.5Ou r1 = r8.A01
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x015f
            android.widget.ImageView r1 = r1.A09
            android.content.Context r0 = r1.getContext()
            X.C86644Kx.A0l(r0, r1, r9)
        L_0x00c0:
            X.5Ou r0 = r8.A01
            android.view.View r0 = r0.A02
            if (r0 == 0) goto L_0x00c9
            r0.setVisibility(r7)
        L_0x00c9:
            X.5Ou r0 = r8.A01
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x00d2
            r0.setVisibility(r7)
        L_0x00d2:
            X.5RA r8 = r12.A0D
            if (r8 == 0) goto L_0x0112
            boolean r7 = X.AnonymousClass000.A1U(r13, r4)
            X.6oS r1 = r8.A05
            if (r1 == 0) goto L_0x00f7
            androidx.viewpager.widget.ViewPager r0 = r1.A0A
            r0.setVisibility(r5)
            X.8J5 r4 = r1.A0d
            if (r4 == 0) goto L_0x00f7
            android.view.View r0 = r4.A08
            r0.setVisibility(r5)
            if (r5 != 0) goto L_0x00f7
            int r1 = r4.A01
            if (r1 < 0) goto L_0x00f7
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A09
            r0.A0Z(r1)
        L_0x00f7:
            r5 = 2131232766(0x7f0807fe, float:1.808165E38)
            r4 = 2131101268(0x7f060654, float:1.781494E38)
            if (r7 == 0) goto L_0x0103
            r5 = 2131232768(0x7f080800, float:1.8081655E38)
            r4 = r6
        L_0x0103:
            X.5Jq r1 = r8.A02
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0159
            android.widget.ImageView r1 = r1.A04
            android.content.Context r0 = r1.getContext()
            X.C86644Kx.A0l(r0, r1, r4)
        L_0x0112:
            X.5Qz r5 = r12.A0A
            if (r5 == 0) goto L_0x0145
            r4 = 2131231891(0x7f080493, float:1.8079876E38)
            if (r13 == r3) goto L_0x0121
            r4 = 2131231889(0x7f080491, float:1.8079872E38)
            r6 = 2131101268(0x7f060654, float:1.781494E38)
        L_0x0121:
            X.5JJ r1 = r5.A01
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x0153
            android.widget.ImageView r1 = r1.A03
            android.content.Context r0 = r1.getContext()
            X.C86644Kx.A0l(r0, r1, r6)
        L_0x0130:
            X.6oT r1 = r5.A04
            if (r1 == 0) goto L_0x0140
            androidx.viewpager.widget.ViewPager r0 = r1.A0A
            r0.setVisibility(r2)
            X.8J4 r0 = r1.A0K
            android.view.View r0 = r0.A02
            r0.setVisibility(r2)
        L_0x0140:
            if (r13 != r3) goto L_0x0145
            r5.A00()
        L_0x0145:
            r12.A00 = r13
            X.33p r0 = r12.A07
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "emoji_popup_window_tab_state"
            X.C18270x1.A0h(r1, r0, r13)
            return
        L_0x0153:
            android.widget.ImageView r0 = r1.A03
            r0.setImageResource(r4)
            goto L_0x0130
        L_0x0159:
            android.widget.ImageView r0 = r1.A04
            r0.setImageResource(r5)
            goto L_0x0112
        L_0x015f:
            android.widget.ImageView r0 = r1.A09
            r0.setImageResource(r10)
            goto L_0x00c0
        L_0x0166:
            android.widget.ImageView r0 = r1.A02
            r0.setImageResource(r11)
            goto L_0x0092
        L_0x016d:
            r0.clearFocus()
            goto L_0x005f
        L_0x0172:
            r0 = 8
            goto L_0x0046
        L_0x0176:
            android.view.View r0 = r12.A02
            r0.setVisibility(r9)
            android.view.ViewGroup r1 = r12.A05
            r0 = 2131433990(0x7f0b1a06, float:1.8489781E38)
            X.C86604Kt.A1F(r1, r0, r5)
            goto L_0x0049
        L_0x0185:
            r0 = 3
            if (r13 != r0) goto L_0x0010
            int r0 = r12.A0E()
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94264qq.A0H(int):void");
    }

    public void A0A() {
        super.A0A();
        AnonymousClass5IW r3 = new AnonymousClass5IW(this.A05);
        AnonymousClass5KZ r0 = this.A0B;
        r0.A00 = this;
        r0.A01 = r3;
        r3.A02.setOnClickListener(r0.A06);
        this.A01 = this.A05.findViewById(R.id.search_button);
        this.A02 = getContentView().findViewById(R.id.store_button_view);
        this.A01.setVisibility(AnonymousClass001.A08(this.A0P.A02 ? 1 : 0));
        C18310x6.A18(this.A01, this, 22);
        C114375mw r4 = this.A0C;
        if (r4 != null) {
            AnonymousClass0O5 r32 = this.A07;
            C103885Ou r6 = new C103885Ou(this.A03, this.A05);
            C115975pX r02 = this.A03;
            r4.A01 = r6;
            r4.A04 = r02;
            r4.A00 = this;
            r6.A09.setOnClickListener(r4.A08);
            C95404tb r5 = new C95404tb(r4);
            r4.A03 = r5;
            ViewGroup viewGroup = r6.A08;
            r6.A02 = C06560Yg.A02(viewGroup, R.id.gif_trending);
            r6.A00 = C06560Yg.A02(viewGroup, R.id.gif_trending_additions);
            RecyclerView A0P = C86654Ky.A0P(viewGroup, R.id.gif_trending_grid);
            r6.A05 = A0P;
            A0P.A0q(r32);
            r6.A05.A0o(new C1231467h(r6, r6.A07.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 2));
            r6.A01 = C06560Yg.A02(viewGroup, R.id.progress_container);
            r6.A03 = C06560Yg.A02(viewGroup, R.id.no_results);
            r6.A04 = C06560Yg.A02(viewGroup, R.id.retry_panel);
            WDSButton A0f = C86654Ky.A0f(viewGroup, R.id.retry_button);
            r6.A06 = A0f;
            AnonymousClass54E.A00(A0f, r5, r6, 3);
            r6.A05.setAdapter(r5);
            r4.A01.A09.setVisibility(0);
        }
        C104445Qz r62 = this.A0A;
        if (r62 != null) {
            AnonymousClass5JJ r10 = new AnonymousClass5JJ(this.A05);
            AnonymousClass5LY r33 = r62.A05;
            AnonymousClass1VX r18 = this.A0E;
            Activity activity = this.A03;
            C69263Wi r28 = r33.A01;
            C56972sr r16 = r33.A02;
            AnonymousClass4FS r14 = r33.A0I;
            ViewGroup viewGroup2 = r10.A02;
            C55862r2 r12 = this.A0I;
            C162157rM r11 = r33.A0F;
            C620733j r9 = r33.A06;
            C56932sn r8 = r62.A07;
            C105555Vl r7 = r33.A0C;
            StickerPackDownloader stickerPackDownloader = r33.A0G;
            AnonymousClass0O5 r2 = this.A07;
            AnonymousClass33O r03 = r62.A06;
            AnonymousClass4FS r27 = r14;
            AnonymousClass0O5 r142 = r2;
            C69263Wi r15 = r28;
            Activity activity2 = activity;
            C137306oT r112 = new C137306oT(activity2, viewGroup2, r142, r15, r16, r9, r18, r33.A0B, r12, r7, (C27841el) r33.A0J.get(), r03, r8, r11, stickerPackDownloader, r27);
            r62.A01 = r10;
            r62.A02 = this;
            r62.A04 = r112;
            r10.A03.setOnClickListener(r62.A0C);
            if (r62.A03 != null) {
                r112.A03 = r62.A08;
            }
            r62.A01(A0E());
        }
        AnonymousClass5RA r42 = this.A0D;
        if (r42 != null) {
            ViewGroup viewGroup3 = this.A05;
            Activity activity3 = this.A03;
            C102625Jq r34 = new C102625Jq(activity3, viewGroup3);
            AnonymousClass5LY r63 = r42.A06;
            AnonymousClass1VX r342 = r63.A07;
            C55682qk r332 = r63.A00;
            C56972sr r322 = r63.A02;
            AnonymousClass4FS r272 = r63.A0I;
            AnonymousClass4FV r17 = r63.A08;
            C183538qC r282 = r42.A0J;
            C620733j r31 = r63.A06;
            C29361ih r21 = r42.A0B;
            C56932sn r52 = r42.A0C;
            AnonymousClass33p r30 = r63.A05;
            StickerPackDownloader stickerPackDownloader2 = r63.A0G;
            C45112Ys r152 = r42.A09;
            ViewGroup viewGroup4 = r34.A03;
            C115975pX r13 = this.A03;
            AnonymousClass33O r122 = r42.A0A;
            AnonymousClass0O5 r113 = this.A07;
            C162157rM r102 = r42.A0H;
            AnonymousClass10k r92 = r42.A0F;
            Activity activity4 = activity3;
            ViewGroup viewGroup5 = viewGroup4;
            C55682qk r123 = r332;
            C56972sr r132 = r322;
            AnonymousClass33p r143 = r30;
            C620733j r153 = r31;
            AnonymousClass1VX r162 = r342;
            C137296oS r82 = new C137296oS(activity4, viewGroup5, r113, r123, r132, r143, r153, r162, r17, r13, r152, r122, r21, r52, r42.A0E, r92, r102, stickerPackDownloader2, r272, r282, this.A06);
            this.A04 = r82;
            C115975pX r22 = this.A03;
            boolean z = this.A09.A00;
            r42.A03 = r22;
            r42.A02 = r34;
            r42.A05 = r82;
            r34.A04.setOnClickListener(r42.A0I);
            if (r42.A04 != null) {
                r82.A07 = r42.A0D;
                if (!AnonymousClass0x2.A0F(r30).getBoolean("sticker_picker_initial_download", false)) {
                    Log.d("EmojiAndGifPopupWindow/sticker pref is already set to false");
                    C32631rM r23 = new C32631rM(r42, z);
                    Log.d("StickerRepository/getInstalledStickerPacksAsync/begin");
                    r52.A0Z.BkL(new C33721ta(r23, r52), new Object[0]);
                } else {
                    r42.A00(z);
                }
            }
            if (r42.A01()) {
                ((C94264qq) r42.A01).A0H(2);
            }
        }
        A0H(C18280x3.A02(AnonymousClass0x2.A0F(this.A07), "emoji_popup_window_tab_state"));
        if (A0L()) {
            this.A0G.A06(this.A0H);
            this.A0I.A01(2);
        }
    }

    public final void A0G() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            Activity activity = this.A03;
            C107335b8.A0C(activity, imageButton, this.A00, R.color.f5nameremoved);
            C18300x5.A13(activity, imageButton, R.string.f11nameremoved);
            imageButton.setOnClickListener(this.A0F);
        }
    }

    public final void A0I(int i) {
        ImageButton imageButton = this.A0I;
        if (imageButton == null) {
            return;
        }
        if (i != 0) {
            int i2 = this.A01;
            if (i != 1) {
                if (i2 != 2) {
                    Activity activity = this.A03;
                    C107335b8.A0C(activity, imageButton, R.drawable.sticker_rec, AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved));
                    C18300x5.A13(activity, imageButton, R.string.f11nameremoved);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{0.7f, 1.0f});
                    ofFloat.setDuration(100);
                    ofFloat.start();
                    C635339p.A00(imageButton, this, 38);
                    this.A01 = 2;
                }
            } else if (i2 != 1) {
                A0B();
            }
        } else {
            int i3 = this.A01;
            if (i3 != 0) {
                if (i3 == 2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{1.0f, 0.7f});
                    ofFloat2.setDuration(75);
                    ofFloat2.addListener(new AnonymousClass68Z(this, 3));
                    ofFloat2.start();
                } else {
                    A0G();
                }
                this.A01 = 0;
            }
        }
    }

    public void A0J(AnonymousClass4BP r2) {
        AnonymousClass5RA r0 = this.A0D;
        if (r0 != null) {
            r0.A04 = r2;
        }
        C104445Qz r02 = this.A0A;
        if (r02 != null) {
            r02.A03 = r2;
        }
    }

    public void A0K(String str) {
        AnonymousClass5RA r1 = this.A0D;
        if (r1 != null) {
            if (r1.A05 == null || !isShowing()) {
                A09();
            }
            A0H(2);
            C137296oS r0 = r1.A05;
            if (r0 != null) {
                r0.A08(str);
            }
        }
    }

    public final boolean A0L() {
        if (this.A08.A0Y() || !this.A0E.A0X(1396)) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        C137296oS r2;
        AnonymousClass5RA r0 = this.A0D;
        if (!(r0 == null || (r2 = r0.A05) == null)) {
            r2.A0A.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A0P);
            r2.A0L = false;
        }
        C114375mw r1 = this.A0C;
        if (r1 != null) {
            AnonymousClass4FS r3 = r1.A05.A0I;
            C55922r8 r22 = r1.A07;
            Objects.requireNonNull(r22);
            r3.BkM(new C69983Zk(r22, 19));
        }
        AnonymousClass33p r02 = this.A07;
        C18270x1.A0h(C18270x1.A03(r02), "emoji_popup_window_tab_state", this.A00);
        super.dismiss();
    }

    public void A09() {
        C137296oS r2;
        String id;
        C137306oT r22;
        C137296oS r6;
        super.A09();
        C114375mw r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass5RA r4 = this.A0D;
        if (!(r4 == null || (r6 = r4.A05) == null)) {
            r6.A0A.getViewTreeObserver().addOnGlobalLayoutListener(r6.A0P);
            C162157rM r02 = r6.A0e;
            r02.A03 = r6;
            r02.A02();
            r6.A0U.BhD(new C23971Vp());
            C46792cD r1 = r6.A0V.A01;
            synchronized (r1.A04) {
                C18270x1.A0h(r1.A00().edit(), "sticker_picker_opened_count", C18280x3.A02(r1.A00(), "sticker_picker_opened_count") + 1);
            }
            r6.A0L = true;
        }
        C104445Qz r03 = this.A0A;
        if (!(r03 == null || (r22 = r03.A04) == null)) {
            r22.A0A.getViewTreeObserver().addOnGlobalLayoutListener(r22.A0B);
            C162157rM r04 = r22.A0J;
            r04.A03 = r22;
            r04.A02();
            r22.A06 = true;
        }
        if (r4 != null && r4.A01() && (r2 = r4.A05) != null) {
            if (this.A00 == 2) {
                AnonymousClass8J3 r05 = r2.A0F;
                if (r05 == null) {
                    id = null;
                } else {
                    id = r05.getId();
                }
                if ("contextual_suggestion".equals(id)) {
                    return;
                }
            }
            A0K("contextual_suggestion");
        }
    }

    public final int A0E() {
        if (A0L()) {
            boolean A012 = this.A0F.A01();
            if (Boolean.valueOf(A012) == null || !A012) {
                return 8;
            }
            return 0;
        }
        return 8;
    }

    public void A0F() {
        if (isShowing()) {
            dismiss();
        }
        AnonymousClass5RA r3 = this.A0D;
        if (r3 != null) {
            C137296oS r1 = r3.A05;
            if (r1 != null) {
                C162157rM r2 = r1.A0e;
                r2.A03 = null;
                r2.A01 = null;
                r2.A00 = null;
                r1.A06 = null;
                r2.A0B.A07(r2.A0A);
            }
            ObjectAnimator objectAnimator = r3.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                r3.A00 = null;
            }
            r3.A04 = null;
            r3.A01 = null;
        }
        C104445Qz r32 = this.A0A;
        if (r32 != null) {
            C137306oT r0 = r32.A04;
            if (r0 != null) {
                C162157rM r22 = r0.A0J;
                r22.A03 = null;
                r22.A01 = null;
                r22.A00 = null;
                r22.A0B.A07(r22.A09);
                r22.A0B.A07(r22.A08);
            }
            ObjectAnimator objectAnimator2 = r32.A00;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                r32.A00 = null;
            }
            r32.A03 = null;
            r32.A02 = null;
        }
        C114375mw r12 = this.A0C;
        if (r12 != null) {
            r12.A02 = null;
            r12.A00 = null;
        }
        if (A0L()) {
            this.A0G.A07(this.A0H);
            C55862r2 r13 = this.A0I;
            r13.A03 = null;
            r13.A00 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94264qq(android.app.Activity r22, android.widget.ImageButton r23, X.C55682qk r24, com.whatsapp.KeyboardPopupLayout r25, X.C56972sr r26, X.C66663Mh r27, com.whatsapp.WaEditText r28, X.C620633i r29, X.AnonymousClass33p r30, X.C620733j r31, X.C104445Qz r32, X.AnonymousClass5KZ r33, X.C114375mw r34, X.AnonymousClass5RA r35, X.AnonymousClass5IY r36, X.AnonymousClass1VX r37, X.C60152y5 r38, X.C49652gs r39, X.C29351ig r40, X.C55862r2 r41, X.C105895Wv r42, boolean r43) {
        /*
            r21 = this;
            r4 = r33
            r6 = r22
            r2 = r32
            X.5Y0 r1 = r4.A04
            X.1ej r15 = r4.A03
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r4.A05
            r5 = r21
            r13 = r31
            r12 = r30
            r11 = r29
            r10 = r28
            r9 = r25
            r20 = r42
            r19 = r38
            r3 = r37
            r8 = r24
            r14 = r36
            r7 = r23
            r16 = r1
            r17 = r0
            r18 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 0
            r5.A05 = r0
            r1 = 1
            X.6AT r0 = new X.6AT
            r0.<init>(r5, r1)
            r5.A0H = r0
            r1 = 10
            X.67k r0 = new X.67k
            r0.<init>(r5, r1)
            r5.A07 = r0
            r5.A0E = r3
            r0 = r26
            r5.A08 = r0
            r0 = r27
            r5.A09 = r0
            r0 = r41
            r5.A0I = r0
            r0 = r40
            r5.A0G = r0
            r0 = r39
            r5.A0F = r0
            r3 = r35
            r5.A0D = r3
            r0 = r34
            r5.A0C = r0
            r5.A0B = r4
            boolean r0 = r5.A0L()
            if (r0 != 0) goto L_0x0068
            r2 = 0
        L_0x0068:
            r5.A0A = r2
            r0 = r43
            r5.A06 = r0
            if (r35 == 0) goto L_0x009d
            r3.A01 = r5
            X.8qC r0 = r3.A0J
            java.lang.Object r2 = r0.get()
            X.1el r2 = (X.C27841el) r2
            r0 = 22
            X.5sF r1 = new X.5sF
            r1.<init>(r2, r0)
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x009e
            r1.run()
        L_0x0088:
            X.2gE r0 = r3.A0E
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x009d
            X.10k r0 = r3.A0F
            if (r0 == 0) goto L_0x009d
            X.08M r1 = r0.A03
            X.0sA r6 = (X.C15910sA) r6
            r0 = 233(0xe9, float:3.27E-43)
            X.AnonymousClass6C6.A02(r6, r1, r3, r0)
        L_0x009d:
            return
        L_0x009e:
            X.3dI r0 = r2.A0C
            r0.execute(r1)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94264qq.<init>(android.app.Activity, android.widget.ImageButton, X.2qk, com.whatsapp.KeyboardPopupLayout, X.2sr, X.3Mh, com.whatsapp.WaEditText, X.33i, X.33p, X.33j, X.5Qz, X.5KZ, X.5mw, X.5RA, X.5IY, X.1VX, X.2y5, X.2gs, X.1ig, X.2r2, X.5Wv, boolean):void");
    }
}
