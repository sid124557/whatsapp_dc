package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0IY;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1TY;
import X.AnonymousClass1TZ;
import X.AnonymousClass1Ta;
import X.AnonymousClass1Tb;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2B4;
import X.AnonymousClass2Q3;
import X.AnonymousClass33p;
import X.AnonymousClass39Z;
import X.AnonymousClass3MB;
import X.AnonymousClass488;
import X.AnonymousClass489;
import X.AnonymousClass4A8;
import X.AnonymousClass4A9;
import X.AnonymousClass4AB;
import X.AnonymousClass4AK;
import X.AnonymousClass4BP;
import X.AnonymousClass4CE;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass4I3;
import X.AnonymousClass4K2;
import X.AnonymousClass66R;
import X.C003203q;
import X.C009707r;
import X.C06560Yg;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C105895Wv;
import X.C111685iW;
import X.C116855qy;
import X.C116885r1;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C183538qC;
import X.C18740yB;
import X.C19420zy;
import X.C27821ej;
import X.C378924l;
import X.C41552Kr;
import X.C45952aq;
import X.C56952sp;
import X.C58422vE;
import X.C616131n;
import X.C620733j;
import X.C632338l;
import X.C635339p;
import X.C636239z;
import X.C63733Ak;
import X.C64333Db;
import X.C72023d3;
import X.C72343dZ;
import X.C78013uK;
import X.C818941m;
import X.C84534Cs;
import X.C84814Du;
import X.C85494Gl;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExpressionsBottomSheetView extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public FrameLayout A01;
    public ViewPager A02;
    public AnonymousClass4CE A03;
    public WaImageView A04;
    public AnonymousClass33p A05;
    public C620733j A06;
    public AnonymousClass4A8 A07;
    public AnonymousClass4A9 A08;
    public C41552Kr A09;
    public C19420zy A0A;
    public C84534Cs A0B;
    public AnonymousClass488 A0C;
    public AnonymousClass2Q3 A0D;
    public AnonymousClass489 A0E;
    public AnonymousClass1VX A0F;
    public C632338l A0G;
    public AnonymousClass4AK A0H;
    public AnonymousClass4BP A0I;
    public C105895Wv A0J;
    public C183538qC A0K;
    public C116855qy A0L;
    public List A0M;
    public AnonymousClass4GQ A0N;
    public boolean A0O;
    public final Handler A0P;
    public final View.OnTouchListener A0Q;
    public final View A0R;
    public final View A0S;
    public final ViewGroup A0T;
    public final MaterialButton A0U;
    public final MaterialButton A0V;
    public final MaterialButton A0W;
    public final MaterialButton A0X;
    public final MaterialButtonToggleGroup A0Y;
    public final AnonymousClass66R A0Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C162457s7.A0J(context, 1);
        if (!this.A0O) {
            this.A0O = true;
            C88864av r2 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r1 = r2.A0K;
            this.A0F = C64333Db.A4B(r1);
            this.A0J = (C105895Wv) r1.AHN.get();
            this.A06 = C64333Db.A2t(r1);
            this.A05 = C64333Db.A2s(r1);
            this.A0K = C72343dZ.A00(r2.A0I.A04);
            this.A0E = (AnonymousClass489) r2.A03.get();
        }
        this.A0Z = C154517dI.A01(new C78013uK(this));
        this.A0M = C72023d3.A00;
        this.A0P = new C18740yB(Looper.getMainLooper(), this);
        this.A0Q = new C636239z(this);
        boolean A0C2 = C56952sp.A0C(this);
        AnonymousClass1VX abProps = getAbProps();
        C58422vE r22 = C58422vE.A02;
        boolean A0Y2 = abProps.A0Y(r22, 6081);
        if (A0C2) {
            i2 = R.layout.f8nameremoved;
            if (A0Y2) {
                i2 = R.layout.f8nameremoved;
            }
        } else {
            i2 = R.layout.f8nameremoved;
            if (A0Y2) {
                i2 = R.layout.f8nameremoved;
            }
        }
        LayoutInflater.from(context).inflate(i2, this, true);
        this.A0T = (ViewGroup) C18280x3.A0E(this, R.id.expressions_view_root);
        this.A0R = C18280x3.A0E(this, R.id.browser_view);
        if (!C56952sp.A0C(this)) {
            this.A02 = (ViewPager) C06560Yg.A02(this, R.id.browser_content);
        }
        this.A0S = C18280x3.A0E(this, R.id.search_button);
        this.A01 = (FrameLayout) C06560Yg.A02(this, R.id.contextual_action_button_holder);
        this.A04 = AnonymousClass0x9.A0L(this, R.id.contextual_action_button);
        this.A00 = C06560Yg.A02(this, R.id.contextual_action_badge);
        this.A0Y = (MaterialButtonToggleGroup) C18280x3.A0E(this, R.id.browser_tabs);
        this.A0V = (MaterialButton) C18280x3.A0E(this, R.id.emojis);
        this.A0W = (MaterialButton) C18280x3.A0E(this, R.id.gifs);
        this.A0U = (MaterialButton) C18280x3.A0E(this, R.id.avatar_stickers);
        this.A0X = (MaterialButton) C18280x3.A0E(this, R.id.stickers);
        if (getAbProps().A0Y(r22, 6641)) {
            AnonymousClass489 emojiPrerenderCacheFactory = getEmojiPrerenderCacheFactory();
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C64333Db r0 = ((AnonymousClass3MB) emojiPrerenderCacheFactory).A00.A03;
            AnonymousClass1VX A4B = C64333Db.A4B(r0);
            this.A0D = new AnonymousClass2Q3(resources, (C27821ej) r0.ATV.get(), C64333Db.A3o(r0), A4B);
        }
    }

    public static final boolean A04(MotionEvent motionEvent, ExpressionsBottomSheetView expressionsBottomSheetView) {
        int action = motionEvent.getAction();
        if (action == 0) {
            expressionsBottomSheetView.getExpressionsViewModel().A0D();
            expressionsBottomSheetView.A0P.sendEmptyMessageDelayed(0, (long) ViewConfiguration.getKeyRepeatTimeout());
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            expressionsBottomSheetView.A0P.removeMessages(0);
            return true;
        }
    }

    private final void setTabsPadding(boolean z) {
        int i;
        if (z) {
            i = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        } else {
            i = 0;
        }
        this.A0Y.setPadding(i, 0, i, 0);
    }

    public final void A09() {
        this.A0H = null;
        this.A0I = null;
        this.A07 = null;
        this.A03 = null;
        this.A0B = null;
        this.A0A = null;
        this.A0C = null;
        C009707r A052 = A05();
        List list = AnonymousClass2B4.A00;
        C162457s7.A0J(A052, 0);
        if (!A052.getSupportFragmentManager().A0K) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C08310eF A0D2 = A052.getSupportFragmentManager().A0D(AnonymousClass001.A0m(it));
                if (A0D2 != null) {
                    A0s.add(A0D2);
                }
            }
            C08240dc A0J2 = AnonymousClass0x2.A0J(A052);
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                A0J2.A07((C08310eF) it2.next());
            }
            A0J2.A02();
        }
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0F = r2;
    }

    public final void setAvatarEditorLauncherLazy(C183538qC r2) {
        C162457s7.A0J(r2, 0);
        this.A0K = r2;
    }

    public final void setEmojiPrerenderCacheFactory(AnonymousClass489 r2) {
        C162457s7.A0J(r2, 0);
        this.A0E = r2;
    }

    public final void setExpressionsSearchListener(C84534Cs r2) {
        C162457s7.A0J(r2, 0);
        this.A0B = r2;
    }

    public final void setImeUtils(C105895Wv r2) {
        C162457s7.A0J(r2, 0);
        this.A0J = r2;
    }

    public final void setTabSelectionListener(AnonymousClass488 r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    public final void setWaSharedPreferences(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public static final void A02(ExpressionsBottomSheetView expressionsBottomSheetView, int i, boolean z) {
        ExpressionsKeyboardViewModel expressionsViewModel;
        C41552Kr r0;
        if (z) {
            if (i == R.id.emojis) {
                expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
                r0 = AnonymousClass1TZ.A00;
            } else if (i == R.id.gifs) {
                expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
                r0 = AnonymousClass1Ta.A00;
            } else if (i == R.id.avatar_stickers) {
                expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
                r0 = AnonymousClass1TY.A00;
            } else if (i == R.id.stickers) {
                expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
                r0 = AnonymousClass1Tb.A00;
            } else {
                return;
            }
            expressionsViewModel.A0E(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("expressions tray tag=");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014c, code lost:
        throw X.AnonymousClass000.A0F(" is not supported", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018d, code lost:
        X.C162457s7.A0J(r6, 0);
        r1 = r6.getSupportFragmentManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019a, code lost:
        if (r1.A0K != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019c, code lost:
        r0 = new X.C08240dc(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a1, code lost:
        if (r4 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a3, code lost:
        r0.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a6, code lost:
        r0.A0D(r7, r5, com.whatsapp.R.id.expressions_tray_fragment_container);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A03(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r8, X.AnonymousClass1Tc r9) {
        /*
            java.util.List r4 = r9.A03
            X.1VX r0 = r8.getAbProps()
            r3 = 5627(0x15fb, float:7.885E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r0.A0Y(r2, r3)
            if (r0 == 0) goto L_0x02f6
            java.util.List r0 = r8.A0M
        L_0x0012:
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 != 0) goto L_0x0061
            com.google.android.material.button.MaterialButton r1 = r8.A0V
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            boolean r0 = r4.contains(r0)
            r5 = 8
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r8.A0W
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            boolean r0 = r4.contains(r0)
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r8.A0U
            X.1TY r0 = X.AnonymousClass1TY.A00
            boolean r0 = r4.contains(r0)
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r8.A0X
            X.1Tb r0 = X.AnonymousClass1Tb.A00
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0052
            r5 = 0
        L_0x0052:
            r1.setVisibility(r5)
            X.1VX r0 = r8.getAbProps()
            boolean r0 = r0.A0Y(r2, r3)
            if (r0 == 0) goto L_0x02eb
            r8.A0M = r4
        L_0x0061:
            int r0 = r4.size()
            boolean r0 = X.C18310x6.A1W(r0)
            r8.setTabsPadding(r0)
            X.1VX r0 = r8.getAbProps()
            boolean r0 = r0.A0Y(r2, r3)
            X.2Kr r3 = r9.A02
            if (r0 == 0) goto L_0x0217
            boolean r2 = r9.A04
            X.488 r0 = r8.A0C
            if (r0 == 0) goto L_0x008b
            X.3MA r0 = (X.AnonymousClass3MA) r0
            X.5l7 r0 = r0.A00
            boolean r1 = r3 instanceof X.AnonymousClass1TZ
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4P
            if (r1 == 0) goto L_0x0212
            r0.requestFocus()
        L_0x008b:
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x01ab
            X.3uM r4 = new X.3uM
            r4.<init>(r8)
            android.view.View$OnTouchListener r2 = r8.A0Q
            r1 = 2131231466(0x7f0802ea, float:1.8079014E38)
            r0 = 2131886567(0x7f1201e7, float:1.9407716E38)
            r8.A0D(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131429739(0x7f0b096b, float:1.848116E38)
            r0 = 1
            r2.A02(r1, r0)
            java.lang.String r5 = "emoji_expressions_fragment"
        L_0x00ae:
            X.07r r7 = r8.A05()
            java.util.List r1 = X.AnonymousClass2B4.A00
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x00bc:
            boolean r0 = r6.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00db
            java.lang.String r2 = X.AnonymousClass001.A0m(r6)
            X.0df r1 = r7.getSupportFragmentManager()
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x00db
            X.0eF r4 = r1.A0D(r2)
            if (r4 == 0) goto L_0x00bc
            boolean r0 = r4.A19()
            if (r0 == 0) goto L_0x00bc
        L_0x00db:
            X.07r r1 = r8.A05()
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.0df r1 = r1.getSupportFragmentManager()
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x012f
            X.0eF r6 = r1.A0D(r5)
            if (r6 == 0) goto L_0x012f
            X.07r r2 = r8.A05()
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.0df r0 = r2.getSupportFragmentManager()
            boolean r0 = r0.A0K
            if (r0 != 0) goto L_0x0129
            boolean r0 = r6.A19()
            if (r0 != 0) goto L_0x0129
            X.0df r1 = r2.getSupportFragmentManager()
            int r0 = r6.A03
            X.0eF r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x0129
            X.0df r0 = r2.getSupportFragmentManager()
            r0.A0K()
            X.0dc r0 = X.AnonymousClass0x2.A0J(r2)
            if (r4 == 0) goto L_0x0123
            r0.A06(r4)
        L_0x0123:
            r0.A08(r6)
        L_0x0126:
            r0.A04()
        L_0x0129:
            android.graphics.Bitmap r0 = r9.A01
            r8.setDynamicAvatarIcon(r0, r3)
            return
        L_0x012f:
            X.07r r6 = r8.A05()
            int r0 = r5.hashCode()
            switch(r0) {
                case -1761741734: goto L_0x0180;
                case -417416307: goto L_0x0172;
                case 637593295: goto L_0x0164;
                case 1123566326: goto L_0x014d;
                default: goto L_0x013a;
            }
        L_0x013a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "expressions tray tag="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x014d:
            java.lang.String r0 = "sticker_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x013a
            X.38l r2 = r8.A0G
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.getExpressionsViewModel()
            int r1 = r0.A00
            r0 = 0
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r7 = X.AnonymousClass26Y.A00(r2, r1, r0, r0)
            goto L_0x018d
        L_0x0164:
            java.lang.String r0 = "gif_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x013a
            com.whatsapp.expressionstray.gifs.GifExpressionsFragment r7 = new com.whatsapp.expressionstray.gifs.GifExpressionsFragment
            r7.<init>()
            goto L_0x018d
        L_0x0172:
            java.lang.String r0 = "emoji_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x013a
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r7 = new com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment
            r7.<init>()
            goto L_0x018d
        L_0x0180:
            java.lang.String r0 = "avatar_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x013a
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r7 = new com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment
            r7.<init>()
        L_0x018d:
            r2 = 2131430051(0x7f0b0aa3, float:1.8481792E38)
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.0df r1 = r6.getSupportFragmentManager()
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0129
            X.0dc r0 = new X.0dc
            r0.<init>(r1)
            if (r4 == 0) goto L_0x01a6
            r0.A06(r4)
        L_0x01a6:
            r0.A0D(r7, r5, r2)
            goto L_0x0126
        L_0x01ab:
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x01c3
            r8.A07()
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131430364(0x7f0b0bdc, float:1.8482427E38)
            r0 = 1
            r2.A02(r1, r0)
            java.lang.String r5 = "gif_expressions_fragment"
            goto L_0x00ae
        L_0x01c3:
            X.1TY r0 = X.AnonymousClass1TY.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x01ed
            if (r2 == 0) goto L_0x01e9
            X.3uL r4 = new X.3uL
            r4.<init>(r8)
            r2 = 0
            r1 = 2131234003(0x7f080cd3, float:1.808416E38)
            r0 = 2131886546(0x7f1201d2, float:1.9407674E38)
            r8.A0D(r2, r4, r1, r0)
        L_0x01dc:
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131427852(0x7f0b020c, float:1.8477332E38)
            r0 = 1
            r2.A02(r1, r0)
            java.lang.String r5 = "avatar_expressions_fragment"
            goto L_0x00ae
        L_0x01e9:
            r8.A07()
            goto L_0x01dc
        L_0x01ed:
            X.1Tb r0 = X.AnonymousClass1Tb.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x0129
            X.3uN r4 = new X.3uN
            r4.<init>(r8)
            r2 = 0
            r1 = 2131233350(0x7f080a46, float:1.8082835E38)
            r0 = 2131894061(0x7f121f2d, float:1.9422916E38)
            r8.A0D(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131434003(0x7f0b1a13, float:1.8489808E38)
            r0 = 1
            r2.A02(r1, r0)
            java.lang.String r5 = "sticker_expressions_fragment"
            goto L_0x00ae
        L_0x0212:
            r0.clearFocus()
            goto L_0x008b
        L_0x0217:
            int r5 = r9.A00
            boolean r2 = r9.A04
            if (r5 < 0) goto L_0x0129
            X.0zy r0 = r8.A0A
            r6 = 0
            if (r0 == 0) goto L_0x0129
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0129
            X.488 r0 = r8.A0C
            if (r0 == 0) goto L_0x023b
            X.3MA r0 = (X.AnonymousClass3MA) r0
            X.5l7 r0 = r0.A00
            boolean r1 = r3 instanceof X.AnonymousClass1TZ
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4P
            if (r1 == 0) goto L_0x02e6
            r0.requestFocus()
        L_0x023b:
            X.0zy r0 = r8.A0A
            if (r0 == 0) goto L_0x0241
            r0.A02 = r3
        L_0x0241:
            r4 = 0
            if (r0 == 0) goto L_0x02e3
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r1 = r0.get(r5)
            X.0eF r1 = (X.C08310eF) r1
        L_0x024c:
            boolean r0 = r1 instanceof X.AnonymousClass4A9
            if (r0 == 0) goto L_0x0259
            r4 = r1
            X.4A9 r4 = (X.AnonymousClass4A9) r4
            if (r4 == 0) goto L_0x0259
            r0 = 1
            r4.BmS(r0)
        L_0x0259:
            X.4A9 r1 = r8.A08
            if (r1 == 0) goto L_0x0266
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x0266
            r1.BmS(r6)
        L_0x0266:
            r8.A08 = r4
            androidx.viewpager.widget.ViewPager r0 = r8.A02
            if (r0 == 0) goto L_0x026f
            r0.setCurrentItem(r5)
        L_0x026f:
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x0292
            X.3uO r4 = new X.3uO
            r4.<init>(r8)
            android.view.View$OnTouchListener r2 = r8.A0Q
            r1 = 2131231466(0x7f0802ea, float:1.8079014E38)
            r0 = 2131886567(0x7f1201e7, float:1.9407716E38)
            r8.A0D(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131429739(0x7f0b096b, float:1.848116E38)
        L_0x028c:
            r0 = 1
            r2.A02(r1, r0)
            goto L_0x0129
        L_0x0292:
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x02a3
            r8.A07()
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131430364(0x7f0b0bdc, float:1.8482427E38)
            goto L_0x028c
        L_0x02a3:
            X.1TY r0 = X.AnonymousClass1TY.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x02c6
            if (r2 == 0) goto L_0x02c2
            X.3uP r4 = new X.3uP
            r4.<init>(r8)
            r2 = 0
            r1 = 2131234003(0x7f080cd3, float:1.808416E38)
            r0 = 2131886546(0x7f1201d2, float:1.9407674E38)
            r8.A0D(r2, r4, r1, r0)
        L_0x02bc:
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131427852(0x7f0b020c, float:1.8477332E38)
            goto L_0x028c
        L_0x02c2:
            r8.A07()
            goto L_0x02bc
        L_0x02c6:
            X.1Tb r0 = X.AnonymousClass1Tb.A00
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x0129
            X.3uQ r4 = new X.3uQ
            r4.<init>(r8)
            r2 = 0
            r1 = 2131233350(0x7f080a46, float:1.8082835E38)
            r0 = 2131894061(0x7f121f2d, float:1.9422916E38)
            r8.A0D(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r8.A0Y
            r1 = 2131434003(0x7f0b1a13, float:1.8489808E38)
            goto L_0x028c
        L_0x02e3:
            r1 = r4
            goto L_0x024c
        L_0x02e6:
            r0.clearFocus()
            goto L_0x023b
        L_0x02eb:
            X.0zy r0 = r8.A0A
            if (r0 == 0) goto L_0x0061
            r0.A04 = r4
            r0.A05()
            goto L_0x0061
        L_0x02f6:
            X.0zy r0 = r8.A0A
            if (r0 == 0) goto L_0x02fe
            java.util.List r0 = r0.A04
            goto L_0x0012
        L_0x02fe:
            r0 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A03(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView, X.1Tc):void");
    }

    /* access modifiers changed from: private */
    public final ExpressionsKeyboardViewModel getExpressionsViewModel() {
        return (ExpressionsKeyboardViewModel) this.A0Z.getValue();
    }

    public final void A07() {
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        WaImageView waImageView = this.A04;
        if (waImageView != null) {
            waImageView.setImageResource(R.drawable.vec_ic_edit);
            waImageView.setOnClickListener(new AnonymousClass39Z(4));
        }
    }

    public final void A0C(int i) {
        Rect rect = new Rect();
        if (getGlobalVisibleRect(rect)) {
            int height = getHeight() - rect.height();
            if (i != 1) {
                int i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i == 4) {
                        ViewGroup viewGroup = this.A0T;
                        viewGroup.setPadding(viewGroup.getPaddingLeft(), 1, viewGroup.getPaddingRight(), height);
                    } else {
                        return;
                    }
                } else {
                    ViewGroup viewGroup2 = this.A0T;
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 1, viewGroup2.getPaddingRight(), 0);
                }
                getExpressionsViewModel().A07.A00 = Integer.valueOf(i2);
                return;
            }
            ViewGroup viewGroup3 = this.A0T;
            viewGroup3.setPadding(viewGroup3.getPaddingLeft(), 1, viewGroup3.getPaddingRight(), height);
        }
    }

    public final void A0D(View.OnTouchListener onTouchListener, AnonymousClass4GP r5, int i, int i2) {
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        WaImageView waImageView = this.A04;
        if (waImageView != null) {
            waImageView.setImageResource(i);
            C18300x5.A13(waImageView.getContext(), waImageView, i2);
            C635339p.A00(waImageView, r5, 1);
            if (onTouchListener != null) {
                waImageView.setLongClickable(true);
                waImageView.setOnTouchListener(onTouchListener);
            } else {
                waImageView.setLongClickable(false);
                waImageView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        C18270x1.A0p(this.A00);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0L;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C183538qC getAvatarEditorLauncherLazy() {
        C183538qC r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("avatarEditorLauncherLazy");
    }

    public final AnonymousClass489 getEmojiPrerenderCacheFactory() {
        AnonymousClass489 r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiPrerenderCacheFactory");
    }

    public final C105895Wv getImeUtils() {
        C105895Wv r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("imeUtils");
    }

    public final AnonymousClass33p getWaSharedPreferences() {
        AnonymousClass33p r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void setDynamicAvatarIcon(Bitmap bitmap, C41552Kr r6) {
        if (bitmap != null) {
            MaterialButton materialButton = this.A0U;
            materialButton.setIconTint((ColorStateList) null);
            materialButton.setIcon(new BitmapDrawable(getResources(), bitmap));
            if (!C162457s7.A0P(r6, AnonymousClass1TY.A00)) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                Drawable drawable = materialButton.A07;
                if (drawable != null) {
                    drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                return;
            }
            Drawable drawable2 = materialButton.A07;
            if (drawable2 != null) {
                drawable2.clearColorFilter();
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            MaterialButton materialButton2 = this.A0U;
            materialButton2.setIconTint(AnonymousClass0Y8.A07(context, R.drawable.expression_tab_icon_color_selector));
            materialButton2.setIconResource(R.drawable.ic_avatar_tray_normal);
        }
    }

    public final void setEmojiClickListener(AnonymousClass4CE r1) {
        this.A03 = r1;
    }

    public final void setExpressionsDismissListener(AnonymousClass4A8 r1) {
        this.A07 = r1;
    }

    public final void setGifSelectionListener(AnonymousClass4AK r1) {
        this.A0H = r1;
    }

    public final void setShapeSelectionListener(AnonymousClass4GQ r1) {
        this.A0N = r1;
    }

    public final void setStickerSelectionListener(AnonymousClass4BP r1) {
        this.A0I = r1;
    }

    public static final void A01(ExpressionsBottomSheetView expressionsBottomSheetView) {
        ExpressionsKeyboardViewModel expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
        C616131n.A02((C85494Gl) null, new ExpressionsKeyboardViewModel$onSearchClicked$1(expressionsViewModel, (C84814Du) null), AnonymousClass0IV.A00(expressionsViewModel), (AnonymousClass20D) null, 3);
    }

    public static /* synthetic */ void getCurrentBottomSheetState$annotations() {
    }

    public final C009707r A05() {
        Context A002 = C116885r1.A00(getContext());
        C162457s7.A0K(A002, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (C009707r) A002;
    }

    public final void A06() {
        Context A002 = C116885r1.A00(getContext());
        C162457s7.A0K(A002, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.A0A = new C19420zy(((C003203q) A002).getSupportFragmentManager(), getExpressionsViewModel().A00, false, false);
    }

    public final void A08() {
        AnonymousClass4AB r1;
        C08310eF A0D2;
        AnonymousClass4AB r12;
        if (C56952sp.A0C(this)) {
            Iterator it = AnonymousClass2B4.A00.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                C009707r A052 = A05();
                C18260x0.A0O(A052, A0m);
                C08270df supportFragmentManager = A052.getSupportFragmentManager();
                if (supportFragmentManager.A0K) {
                    A0D2 = null;
                } else {
                    A0D2 = supportFragmentManager.A0D(A0m);
                }
                if ((A0D2 instanceof AnonymousClass4AB) && (r12 = (AnonymousClass4AB) A0D2) != null) {
                    r12.BPL();
                }
            }
            return;
        }
        if (this.A0A == null) {
            A06();
        }
        C19420zy r4 = this.A0A;
        int i = 0;
        if (r4 != null && !r4.A05) {
            r4.A05 = true;
            int size = r4.A04.size();
            if (size >= 0) {
                while (true) {
                    C08310eF r13 = (C08310eF) r4.A01.get(i);
                    if ((r13 instanceof AnonymousClass4AB) && (r1 = (AnonymousClass4AB) r13) != null) {
                        r1.BPL();
                    }
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A0A() {
        C19420zy r1;
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C45952aq r2 = expressionsViewModel.A07;
        r2.A00 = 5;
        C41552Kr r12 = expressionsViewModel.A02;
        r2.A00(r12, r12, 2);
        r2.A01 = null;
        if (!C56952sp.A0C(this) && (r1 = this.A0A) != null) {
            r1.A05 = false;
        }
    }

    public final void A0B() {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C45952aq r2 = expressionsViewModel.A07;
        if (r2.A01 == null) {
            r2.A01 = C18280x3.A0Y();
        }
        C41552Kr r1 = expressionsViewModel.A02;
        r2.A00(r1, r1, 1);
    }

    public final void A0E(String str) {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C616131n.A02((C85494Gl) null, new ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1(expressionsViewModel, str, (C84814Du) null), AnonymousClass0IV.A00(expressionsViewModel), (AnonymousClass20D) null, 3);
    }

    public final void A0F(String str) {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C616131n.A02((C85494Gl) null, new ExpressionsKeyboardViewModel$onMoveToStickerPage$1(expressionsViewModel, str, (C84814Du) null), AnonymousClass0IV.A00(expressionsViewModel), (AnonymousClass20D) null, 3);
    }

    public final ViewGroup getRootView() {
        return this.A0T;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getAbProps().A0Y(C58422vE.A02, 6641) && C162457s7.A0P(AnonymousClass0x2.A0F(getWaSharedPreferences()).getString("expressions_keyboard_selected_tab", "EMOJI"), "EMOJI")) {
            ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
            AnonymousClass2Q3 r0 = this.A0D;
            C616131n.A02(expressionsViewModel.A0D, new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(r0, (C84814Du) null), AnonymousClass0IV.A00(expressionsViewModel), (AnonymousClass20D) null, 2);
        }
        if (!C56952sp.A0C(this)) {
            if (this.A0A == null) {
                A06();
            }
            ViewPager viewPager = this.A02;
            if (viewPager != null) {
                viewPager.setLayoutDirection(getWhatsAppLocale().A05().A06 ? 1 : 0);
                C19420zy r1 = this.A0A;
                if (r1 != null) {
                    viewPager.setOffscreenPageLimit(r1.A04.size());
                } else {
                    r1 = null;
                }
                viewPager.setAdapter(r1);
                viewPager.A0G(new C63733Ak(this));
            }
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A0Y;
        materialButtonToggleGroup.A08.add(new AnonymousClass4I3(this, 0));
        C635339p.A00(this.A0S, this, 2);
        AnonymousClass08M r3 = getExpressionsViewModel().A04;
        C15910sA A002 = AnonymousClass0IY.A00(this);
        C162457s7.A0H(A002);
        AnonymousClass4K2.A00(A002, r3, new C818941m(this), 92);
        C15910sA A003 = AnonymousClass0IY.A00(this);
        if (A003 != null) {
            C616131n.A02((C85494Gl) null, new ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1(A003, this, (C84814Du) null), AnonymousClass0IT.A00(A003), (AnonymousClass20D) null, 3);
        }
        C18300x5.A13(getContext(), this.A0V, R.string.f11nameremoved);
        C18300x5.A13(getContext(), this.A0W, R.string.f11nameremoved);
        C18300x5.A13(getContext(), this.A0U, R.string.f11nameremoved);
        C18300x5.A13(getContext(), this.A0X, R.string.f11nameremoved);
    }

    public final void setAdapterFunStickerData(C632338l r2) {
        if (C56952sp.A0C(this)) {
            this.A0G = r2;
            return;
        }
        C19420zy r0 = this.A0A;
        if (r0 != null) {
            r0.A03 = r2;
        }
    }

    public final void setExpressionsTabs(int i) {
        C19420zy r0;
        if (!C56952sp.A0C(this) && (r0 = this.A0A) != null) {
            r0.A00 = i;
        }
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C616131n.A02((C85494Gl) null, new ExpressionsKeyboardViewModel$onTabsUpdated$1(expressionsViewModel, (C84814Du) null, i), AnonymousClass0IV.A00(expressionsViewModel), (AnonymousClass20D) null, 3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpressionsBottomSheetView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
