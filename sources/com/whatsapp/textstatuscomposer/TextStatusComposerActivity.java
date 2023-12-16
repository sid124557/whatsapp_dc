package com.whatsapp.textstatuscomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0A7;
import X.AnonymousClass0AA;
import X.AnonymousClass0AN;
import X.AnonymousClass0XC;
import X.AnonymousClass0YI;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass21S;
import X.AnonymousClass2CO;
import X.AnonymousClass2WI;
import X.AnonymousClass2X0;
import X.AnonymousClass30E;
import X.AnonymousClass30M;
import X.AnonymousClass30V;
import X.AnonymousClass33C;
import X.AnonymousClass33p;
import X.AnonymousClass3YM;
import X.AnonymousClass3YN;
import X.AnonymousClass4CE;
import X.AnonymousClass4CM;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4TE;
import X.AnonymousClass4UA;
import X.AnonymousClass52Q;
import X.AnonymousClass54E;
import X.AnonymousClass58Q;
import X.AnonymousClass5C3;
import X.AnonymousClass5E0;
import X.AnonymousClass5E1;
import X.AnonymousClass5M5;
import X.AnonymousClass5PB;
import X.AnonymousClass5PH;
import X.AnonymousClass5RE;
import X.AnonymousClass5S9;
import X.AnonymousClass5TZ;
import X.AnonymousClass5WL;
import X.AnonymousClass5WS;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YA;
import X.AnonymousClass5Z9;
import X.AnonymousClass691;
import X.AnonymousClass692;
import X.AnonymousClass694;
import X.AnonymousClass6BG;
import X.AnonymousClass6BP;
import X.AnonymousClass6C6;
import X.AnonymousClass7SV;
import X.AnonymousClass7VK;
import X.AnonymousClass90I;
import X.AnonymousClass91Z;
import X.AnonymousClass93Z;
import X.C005205m;
import X.C05820Vc;
import X.C101225Dy;
import X.C101235Dz;
import X.C102215Hx;
import X.C104745Se;
import X.C104995Td;
import X.C105895Wv;
import X.C106095Xp;
import X.C106685Zz;
import X.C107415bH;
import X.C107555bV;
import X.C107635bd;
import X.C107655bf;
import X.C107695bk;
import X.C108845de;
import X.C109115e6;
import X.C109675f0;
import X.C113995mK;
import X.C114115mW;
import X.C116145po;
import X.C116155pp;
import X.C116175pr;
import X.C117635sF;
import X.C118075sx;
import X.C1226365d;
import X.C1226565f;
import X.C1235368u;
import X.C135166kE;
import X.C150617Rm;
import X.C151257Ua;
import X.C162457s7;
import X.C166097y8;
import X.C166177yG;
import X.C166877zP;
import X.C171288Gm;
import X.C179718jb;
import X.C179738jd;
import X.C182608oh;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C183538qC;
import X.C1899093c;
import X.C27821ej;
import X.C30721mu;
import X.C42982Qh;
import X.C44132Uu;
import X.C50022hV;
import X.C55592qb;
import X.C55612qd;
import X.C55922r8;
import X.C56042rK;
import X.C56072rN;
import X.C56612sH;
import X.C58422vE;
import X.C60072xx;
import X.C60152y5;
import X.C60492ye;
import X.C620033c;
import X.C620233e;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C66513Ls;
import X.C69263Wi;
import X.C72343dZ;
import X.C86124Ix;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import X.C94264qq;
import X.C94294qu;
import X.C94334qy;
import X.C95044sW;
import X.C95814uZ;
import X.C989753y;
import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.TextData;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class TextStatusComposerActivity extends C89644eZ implements AnonymousClass4CM, C1226565f, C182608oh, C1226365d, C179718jb, C179738jd {
    public static final int[] A1A = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A1B = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public DisplayMetrics A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public ImageButton A0A;
    public ScrollView A0B;
    public TextView A0C;
    public CoordinatorLayout A0D;
    public AnonymousClass08M A0E;
    public AnonymousClass2CO A0F;
    public C44132Uu A0G;
    public C101225Dy A0H;
    public C101235Dz A0I;
    public AnonymousClass5E0 A0J;
    public KeyboardPopupLayout A0K;
    public C621033m A0L;
    public C66513Ls A0M;
    public WfalManager A0N;
    public AnonymousClass4UA A0O;
    public AnonymousClass5RE A0P;
    public C620233e A0Q;
    public C27821ej A0R;
    public EmojiSearchKeyboardContainer A0S;
    public EmojiSearchProvider A0T;
    public AnonymousClass2WI A0U;
    public C94334qy A0V;
    public AnonymousClass4FV A0W;
    public AnonymousClass5PB A0X;
    public C94264qq A0Y;
    public C94294qu A0Z;
    public C106095Xp A0a;
    public C55922r8 A0b;
    public AnonymousClass4TE A0c;
    public C106685Zz A0d;
    public C620033c A0e;
    public C60152y5 A0f;
    public AnonymousClass5TZ A0g;
    public AnonymousClass2X0 A0h;
    public C113995mK A0i;
    public StatusEditText A0j;
    public C116145po A0k;
    public AnonymousClass5WL A0l;
    public VoiceRecordingView A0m;
    public C116155pp A0n;
    public AnonymousClass30V A0o;
    public C56072rN A0p;
    public AnonymousClass30E A0q;
    public WebPagePreviewView A0r;
    public C56042rK A0s;
    public AnonymousClass5YA A0t;
    public C104745Se A0u;
    public C183538qC A0v;
    public String A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public final Handler A13;
    public final View.OnClickListener A14;
    public final AnonymousClass08M A15;
    public final AnonymousClass4CE A16;
    public final C150617Rm A17;
    public final Runnable A18;
    public final int[] A19;

    public final void A7F(int i) {
        if (i == 2) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A0C.setPadding(0, dimensionPixelSize, dimensionPixelSize, 0);
            return;
        }
        this.A0C.setPadding(0, 0, 0, 0);
    }

    public final void A7H(C166177yG r15) {
        String str;
        if (this.A0j.getText() != null) {
            str = C86604Kt.A0o(this.A0j);
        } else {
            str = "";
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(C135166kE.A00);
        C166097y8 r1 = r15.A01;
        int i = r1.A01;
        if (i <= 0) {
            i = r15.A02.A01;
        }
        int i2 = r1.A00;
        if (i2 <= 0) {
            i2 = r15.A02.A00;
        }
        startActivityForResult(C627736r.A16(this, r15.A02.A02, r1.A02, r15.A03.A02, A0s2, r15.A00, 22, false, true).putExtra("media_width", i).putExtra("media_height", i2).putExtra("caption", str), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r14.A0D.A0Y(X.C58422vE.A01, 2531) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcV(X.C108845de r15) {
        /*
            r14 = this;
            r4 = r14
            X.08M r0 = r14.A15
            r0.A0H(r15)
            boolean r0 = r14.A0y
            r10 = 0
            if (r0 != 0) goto L_0x0018
            X.1VX r2 = r14.A0D
            X.2vE r1 = X.C58422vE.A01
            r0 = 2531(0x9e3, float:3.547E-42)
            boolean r0 = r2.A0Y(r1, r0)
            r7 = 0
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r7 = -1
        L_0x0019:
            int r6 = r15.A00
            if (r6 != 0) goto L_0x0064
            r5 = 0
        L_0x001e:
            X.4FS r1 = r14.A04
            X.2Uu r3 = r14.A0G
            r8 = 0
            r12 = r10
            r13 = r10
            r11 = r10
            X.1tW r0 = r3.A00(r4, r5, r6, r7, r8, r10, r11, r12, r13)
            X.AnonymousClass0x7.A1B(r0, r1)
            boolean r3 = r14.A0y
            X.5po r0 = r14.A0k
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.6kE r0 = X.C135166kE.A00
            java.lang.String r0 = r0.getRawString()
            r2.add(r0)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "jids"
            r1.putExtra(r0, r2)
            X.5po r0 = r14.A0k
            r0.A01(r1)
            if (r3 != 0) goto L_0x005d
            r14.A79()
            boolean r0 = r14.A7L()
            if (r0 == 0) goto L_0x0060
            r14.A78()
        L_0x005d:
            r14.A0y = r10
            return
        L_0x0060:
            r14.A7A()
            goto L_0x005d
        L_0x0064:
            r0 = 1
            if (r6 != r0) goto L_0x006e
            java.util.List r0 = r15.A01
        L_0x0069:
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)
            goto L_0x001e
        L_0x006e:
            java.util.List r0 = r15.A02
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.textstatuscomposer.TextStatusComposerActivity.BcV(X.5de):void");
    }

    public static /* synthetic */ void A0C(C66513Ls r6, TextStatusComposerActivity textStatusComposerActivity) {
        if (r6 != null) {
            int A052 = C86604Kt.A05(textStatusComposerActivity.A0E);
            textStatusComposerActivity.A0O.A0F(r6);
            String str = r6.A0Z;
            if (str.equals(textStatusComposerActivity.A0w) || !r6.A0F() || !TextUtils.equals(textStatusComposerActivity.A0O.A07, str)) {
                textStatusComposerActivity.A0M = null;
                textStatusComposerActivity.A75();
                return;
            }
            textStatusComposerActivity.A0M = r6;
            Log.i("textstatus/showlinkpreview");
            if (textStatusComposerActivity.A0r == null) {
                WebPagePreviewView webPagePreviewView = new WebPagePreviewView(textStatusComposerActivity);
                textStatusComposerActivity.A0r = webPagePreviewView;
                webPagePreviewView.setForeground((Drawable) null);
                textStatusComposerActivity.A0r.setImageContentBackgroundResource(0);
                textStatusComposerActivity.A09.addView(textStatusComposerActivity.A0r);
                C107555bV.A05(textStatusComposerActivity.A0r.findViewById(R.id.title), textStatusComposerActivity.A00, 0, textStatusComposerActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                textStatusComposerActivity.A0r.setImageProgressBarVisibility(false);
                View findViewById = textStatusComposerActivity.A0r.findViewById(R.id.cancel);
                findViewById.setVisibility(0);
                C989753y.A00(findViewById, textStatusComposerActivity, 37);
                View findViewById2 = textStatusComposerActivity.A0r.findViewById(R.id.thumb);
                AnonymousClass54E r2 = new AnonymousClass54E(findViewById2, 34, textStatusComposerActivity);
                findViewById2.setOnClickListener(r2);
                textStatusComposerActivity.A0r.findViewById(R.id.webPagePreviewImageLarge_thumb).setOnClickListener(r2);
            }
            textStatusComposerActivity.A0r.A0F(r6, (List) null, false, textStatusComposerActivity.A0p.A01());
            if (textStatusComposerActivity.A0j.getText() != null) {
                textStatusComposerActivity.A0r.A0N.addOnLayoutChangeListener(new C166877zP(textStatusComposerActivity, A052));
            }
            if (textStatusComposerActivity.A09.getVisibility() != 0) {
                textStatusComposerActivity.A09.setVisibility(0);
                textStatusComposerActivity.A09.setAlpha(0.0f);
                AnonymousClass6BG.A00(textStatusComposerActivity.A09.getViewTreeObserver(), textStatusComposerActivity, 36);
            }
        }
    }

    public void A5r() {
        if (!this.A0x) {
            this.A0x = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            this.A0U = (AnonymousClass2WI) A2X.A05.get();
            this.A0a = C86644Kx.A0V(r1);
            this.A0d = C86634Kw.A0m(r1);
            this.A0W = C64333Db.A4H(r1);
            this.A0Q = C86634Kw.A0h(r1);
            this.A0L = C64333Db.A08(r1);
            this.A0R = C86604Kt.A0X(r1);
            this.A0u = C86634Kw.A0s(r1);
            this.A0p = C64333Db.A8w(r1);
            this.A0e = (C620033c) r1.AJr.get();
            this.A0s = (C56042rK) r1.AEv.get();
            this.A0q = (AnonymousClass30E) r2.A35.get();
            this.A0b = (C55922r8) r2.A9d.get();
            this.A0N = C86654Ky.A0U(r1);
            this.A0T = C107695bk.A1n(r2);
            this.A0i = C86634Kw.A0q(r1);
            this.A0P = (AnonymousClass5RE) r2.A3H.get();
            this.A0h = r1.Aqw();
            this.A0g = C107695bk.A5D(r2);
            this.A0f = C64333Db.A74(r1);
            this.A0X = A2X.ACT();
            this.A0G = (C44132Uu) A2X.A1U.get();
            AnonymousClass5Y0 r8 = (AnonymousClass5Y0) r1.A8o.get();
            C27821ej A0X2 = C86604Kt.A0X(r1);
            C620733j A0W2 = C86604Kt.A0W(r1);
            EmojiSearchProvider A2k = AnonymousClass4SG.A2k(r1);
            AnonymousClass33p A0W3 = C86614Ku.A0W(r1);
            C60152y5 A0g2 = C86614Ku.A0g(r1);
            this.A0V = new C94334qy(A0W3, A0W2, A0X2, r8, A2k, (AnonymousClass2WI) A2X.A05.get(), C86604Kt.A0Y(r1), A0g2, (C105895Wv) r1.AHN.get());
            this.A0F = (AnonymousClass2CO) A2X.A4V.get();
            this.A0v = C72343dZ.A00(r1.A7Q);
            this.A0H = (C101225Dy) A2X.A1v.get();
            this.A0I = (C101235Dz) A2X.A1w.get();
            this.A0J = (AnonymousClass5E0) A2X.A1z.get();
            this.A0t = (AnonymousClass5YA) r2.ACM.get();
            this.A0o = C86604Kt.A0f(r1);
        }
    }

    public void A66() {
        this.A0o.A03((C95814uZ) null, 34);
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public final void A74() {
        if (C105895Wv.A00(this.A0j)) {
            this.A0B.A02(this.A0j);
        }
    }

    public final void A75() {
        if (this.A09.getVisibility() == 0) {
            AnonymousClass4SG.A3w(this, C86664Kz.A02(this.A09), 0.0f, 8);
        }
    }

    public final void A76() {
        if (this.A0m != null && this.A0n != null) {
            AnonymousClass0XC.A01((ViewGroup) this.A00);
            View view = this.A00;
            Objects.requireNonNull(view);
            VoiceRecordingView voiceRecordingView = this.A0m;
            StatusEditText statusEditText = this.A0j;
            AnonymousClass0A7 r2 = new AnonymousClass0A7();
            r2.A03 = true;
            AnonymousClass0AN r0 = new AnonymousClass0AN(3);
            r0.A09(statusEditText);
            r0.A09(voiceRecordingView);
            r0.A02 = 0;
            r2.A0c(r0);
            AnonymousClass0AA r02 = new AnonymousClass0AA();
            r02.A09(voiceRecordingView);
            r02.A02 = 0;
            r2.A0c(r02);
            r2.A0a(new DecelerateInterpolator());
            r2.A0Z(300);
            AnonymousClass0XC.A02((ViewGroup) view, r2);
            AnonymousClass0XC.A01(this.A08);
            ViewGroup viewGroup = this.A08;
            ImageButton imageButton = this.A0A;
            TextView textView = this.A0C;
            AnonymousClass0AN r22 = new AnonymousClass0AN(1);
            r22.A09(imageButton);
            r22.A09(textView);
            r22.A02 = 0;
            r22.A07(300);
            r22.A08(new DecelerateInterpolator());
            AnonymousClass0XC.A02(viewGroup, r22);
            this.A0j.setVisibility(0);
            this.A0m.setScaleX(0.0f);
            this.A0m.setScaleY(0.0f);
            this.A0m.setVisibility(4);
            this.A0A.setVisibility(0);
            this.A0C.setVisibility(0);
        }
    }

    public final void A77() {
        int i = this.A00;
        int[] iArr = C107415bH.A01;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        this.A00 = iArr[(i2 + 1) % length];
        A7B();
        A7D();
    }

    public final void A78() {
        List singletonList;
        String str;
        C55592qb r2;
        AnonymousClass3YN r22;
        C116145po r1 = this.A0k;
        if (r1 != null) {
            singletonList = Collections.unmodifiableList(r1.A08);
        } else {
            singletonList = Collections.singletonList(C135166kE.A00);
        }
        if (this.A0j.getText() != null) {
            str = C86604Kt.A0o(this.A0j);
        } else {
            str = "";
        }
        if (!C107635bd.A0P(this.A08, this.A0f, str)) {
            this.A05.A0H(R.string.f11nameremoved, 1);
        } else if (!A7M(singletonList)) {
            C116145po r4 = this.A0k;
            if (r4 != null) {
                AnonymousClass7VK r3 = r4.A05;
                if (r3.A00 == AnonymousClass58Q.SEND_TEXT) {
                    r3.A00();
                    ((CreationModeBottomBar) r4.A0L).A05.setEnabled(false);
                }
            }
            boolean A092 = C107415bH.A09(this.A0M, C107415bH.A02(this.A0d, str));
            C621033m r8 = this.A0L;
            AnonymousClass4UA r11 = this.A0O;
            int i = this.A00;
            int i2 = this.A02;
            C66513Ls r10 = this.A0M;
            AnonymousClass08M r32 = this.A15;
            C108845de r7 = (C108845de) r32.A07();
            Objects.requireNonNull(r7);
            TextData textData = new TextData();
            textData.backgroundColor = i;
            textData.textColor = -1;
            textData.fontStyle = i2;
            if (r11 != null) {
                r2 = r11.A05;
            } else {
                r2 = null;
            }
            Log.d("UserActions/createStatusTextMessage");
            C42982Qh r9 = new C42982Qh(r10);
            r9.A00 = r2;
            r9.A02 = A092;
            r9.A01 = true;
            if (r9.A03 == null) {
                new AnonymousClass3YM
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0095: CONSTRUCTOR  (r2v46 ? I:X.3YM) =  call: X.3YM.<init>():void type: CONSTRUCTOR in method: com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A78():void, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v46 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 41 more
                    */
                /*
                    this = this;
                    r0 = r25
                    X.5po r1 = r0.A0k
                    if (r1 == 0) goto L_0x018a
                    java.util.List r1 = r1.A08
                    java.util.List r5 = java.util.Collections.unmodifiableList(r1)
                L_0x000c:
                    com.whatsapp.status.playback.widget.StatusEditText r1 = r0.A0j
                    android.text.Editable r1 = r1.getText()
                    if (r1 == 0) goto L_0x0186
                    com.whatsapp.status.playback.widget.StatusEditText r1 = r0.A0j
                    java.lang.String r6 = X.C86604Kt.A0o(r1)
                L_0x001a:
                    X.33i r2 = r0.A08
                    X.2y5 r1 = r0.A0f
                    boolean r1 = X.C107635bd.A0P(r2, r1, r6)
                    if (r1 != 0) goto L_0x002e
                    X.3Wi r2 = r0.A05
                    r1 = 2131887446(0x7f120556, float:1.94095E38)
                    r0 = 1
                    r2.A0H(r1, r0)
                L_0x002d:
                    return
                L_0x002e:
                    boolean r1 = r0.A7M(r5)
                    if (r1 != 0) goto L_0x002d
                    X.5po r4 = r0.A0k
                    if (r4 == 0) goto L_0x004d
                    X.7VK r3 = r4.A05
                    X.58Q r2 = r3.A00
                    X.58Q r1 = X.AnonymousClass58Q.SEND_TEXT
                    if (r2 != r1) goto L_0x004d
                    r3.A00()
                    X.8uV r1 = r4.A0L
                    com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r1 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r1
                    android.widget.ImageButton r2 = r1.A05
                    r1 = 0
                    r2.setEnabled(r1)
                L_0x004d:
                    X.5Zz r1 = r0.A0d
                    int r2 = X.C107415bH.A02(r1, r6)
                    X.3Ls r1 = r0.A0M
                    boolean r12 = X.C107415bH.A09(r1, r2)
                    X.33m r8 = r0.A0L
                    X.4UA r11 = r0.A0O
                    int r9 = r0.A00
                    int r2 = r0.A02
                    X.3Ls r10 = r0.A0M
                    X.08M r3 = r0.A15
                    java.lang.Object r7 = r3.A07()
                    X.5de r7 = (X.C108845de) r7
                    java.util.Objects.requireNonNull(r7)
                    r1 = -1
                    com.whatsapp.TextData r4 = new com.whatsapp.TextData
                    r4.<init>()
                    r4.backgroundColor = r9
                    r4.textColor = r1
                    r4.fontStyle = r2
                    if (r11 == 0) goto L_0x0183
                    X.2qb r2 = r11.A05
                L_0x007e:
                    java.lang.String r1 = "UserActions/createStatusTextMessage"
                    com.whatsapp.util.Log.d((java.lang.String) r1)
                    X.2Qh r9 = new X.2Qh
                    r9.<init>(r10)
                    r9.A00 = r2
                    r9.A02 = r12
                    r1 = 1
                    r9.A01 = r1
                    X.3Ls r1 = r9.A03
                    if (r1 != 0) goto L_0x017c
                    X.3YM r2 = new X.3YM
                    r2.<init>()
                L_0x0098:
                    X.2Yj r14 = r8.A1c
                    X.6kE r15 = X.C135166kE.A00
                    java.lang.String r18 = X.C107415bH.A07(r6)
                    X.2sH r1 = r8.A0V
                    long r20 = r1.A0H()
                    r13 = 0
                    r19 = r13
                    r16 = r13
                    r17 = r2
                    X.1mW r1 = r14.A00(r15, r16, r17, r18, r19, r20)
                    r8.A0O(r1)
                    r1.A1x(r4)
                    r2 = 5
                    r1.A09 = r2
                    r1.A0O = r7
                    if (r7 == 0) goto L_0x00c2
                    int r2 = r7.A00
                    r1.A0E = r2
                L_0x00c2:
                    X.33m r10 = r0.A0L
                    X.4UA r4 = r0.A0O
                    X.3Ls r11 = r0.A0M
                    java.lang.Object r12 = r3.A07()
                    X.5de r12 = (X.C108845de) r12
                    java.util.Objects.requireNonNull(r12)
                    boolean r3 = r0.A0y
                    java.util.List r2 = java.util.Collections.singletonList(r15)
                    boolean r2 = r5.equals(r2)
                    r21 = r2 ^ 1
                    X.4uZ r2 = X.C627336j.A03(r5)
                    boolean r2 = X.AnonymousClass000.A1W(r2)
                    if (r2 == 0) goto L_0x0145
                    X.2X0 r8 = r10.A1j
                    boolean r2 = r8.A00()
                    if (r2 == 0) goto L_0x00f4
                    r2 = 262144(0x40000, float:3.67342E-40)
                    r1.A1B(r2)
                L_0x00f4:
                    if (r4 == 0) goto L_0x015f
                    X.4Ey r7 = r4.A0c
                    boolean r2 = r7.Bo7()
                    if (r2 == 0) goto L_0x015f
                    boolean r2 = r8.A00()
                    if (r2 == 0) goto L_0x0109
                    r2 = 262144(0x40000, float:3.67342E-40)
                    r1.A1B(r2)
                L_0x0109:
                    X.3Lv r8 = r10.A0l
                    r2 = 1
                    r8.A0a(r1, r2)
                    X.36Y r9 = r10.A13
                    X.2hp r8 = r10.A1e
                    X.2Yl r2 = r10.A1f
                    int r17 = X.AnonymousClass29K.A01(r9, r1, r8, r2)
                    X.5mK r2 = r10.A1k
                    r18 = 0
                    java.lang.String r16 = "request"
                    r14 = r2
                    r15 = r1
                    r20 = r3
                    r14.A08(r15, r16, r17, r18, r20, r21)
                    r7.BWZ(r1)
                    long r2 = r7.BDi()
                    int r8 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
                    if (r8 <= 0) goto L_0x0145
                    X.3Wi r9 = r10.A02
                    r19 = 15
                    X.3cM r8 = new X.3cM
                    r14 = r8
                    r15 = r10
                    r16 = r4
                    r17 = r1
                    r18 = r7
                    r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (int) r19)
                    r9.A0T(r8, r2)
                L_0x0145:
                    java.util.ArrayList r7 = X.AnonymousClass001.A0s()
                    java.util.Iterator r4 = r5.iterator()
                L_0x014d:
                    boolean r2 = r4.hasNext()
                    if (r2 == 0) goto L_0x0192
                    java.lang.Object r3 = r4.next()
                    boolean r2 = r3 instanceof X.C135166kE
                    if (r2 != 0) goto L_0x014d
                    r7.add(r3)
                    goto L_0x014d
                L_0x015f:
                    X.3Lv r2 = r10.A0l
                    r2.A0V(r1)
                    X.36Y r7 = r10.A13
                    X.2hp r4 = r10.A1e
                    X.2Yl r2 = r10.A1f
                    int r17 = X.AnonymousClass29K.A01(r7, r1, r4, r2)
                    X.5mK r2 = r10.A1k
                    r18 = 0
                    java.lang.String r16 = "request"
                    r14 = r2
                    r15 = r1
                    r20 = r3
                    r14.A08(r15, r16, r17, r18, r20, r21)
                    goto L_0x0145
                L_0x017c:
                    X.3YN r2 = new X.3YN
                    r2.<init>(r9)
                    goto L_0x0098
                L_0x0183:
                    r2 = 0
                    goto L_0x007e
                L_0x0186:
                    java.lang.String r6 = ""
                    goto L_0x001a
                L_0x018a:
                    X.6kE r1 = X.C135166kE.A00
                    java.util.List r5 = java.util.Collections.singletonList(r1)
                    goto L_0x000c
                L_0x0192:
                    int r2 = r7.size()
                    if (r2 <= 0) goto L_0x01af
                    r22 = 0
                    r15 = r13
                    r16 = r13
                    r17 = r13
                    r18 = r13
                    r21 = r13
                    r24 = r22
                    r14 = r13
                    r23 = r22
                    r19 = r6
                    r20 = r7
                    r10.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                L_0x01af:
                    X.5de r2 = r1.A0O
                    if (r2 == 0) goto L_0x01df
                    boolean r2 = r2.A03
                    if (r2 == 0) goto L_0x01df
                    boolean r2 = X.AnonymousClass36X.A07(r1)
                    if (r2 == 0) goto L_0x01df
                    X.5Se r2 = r0.A0u
                    boolean r2 = r2.A00()
                    if (r2 == 0) goto L_0x01df
                    X.5Se r2 = r0.A0u
                    X.1VX r3 = r2.A01
                    r2 = 4437(0x1155, float:6.218E-42)
                    boolean r2 = r3.A0X(r2)
                    if (r2 == 0) goto L_0x01df
                    X.5YA r6 = r0.A0t
                    X.4FS r4 = r6.A03
                    r3 = 41
                    X.3aN r2 = new X.3aN
                    r2.<init>(r6, r0, r1, r3)
                    r4.BkM(r2)
                L_0x01df:
                    boolean r2 = X.C626736a.A07(r1)
                    if (r2 == 0) goto L_0x0225
                    com.whatsapp.bridge.wfal.WfalManager r2 = r0.A0N
                    boolean r2 = r2.A02()
                    if (r2 == 0) goto L_0x0225
                    X.5de r6 = r1.A0O
                    X.8U9 r4 = new X.8U9
                    r4.<init>()
                    r3 = 1
                    if (r6 == 0) goto L_0x0209
                    boolean r2 = r6.A03
                    if (r2 != r3) goto L_0x0200
                    X.223 r2 = X.AnonymousClass223.FACEBOOK
                    r4.add(r2)
                L_0x0200:
                    boolean r2 = r6.A04
                    if (r2 != r3) goto L_0x0209
                    X.223 r2 = X.AnonymousClass223.INSTAGRAM
                    r4.add(r2)
                L_0x0209:
                    java.util.List r10 = X.C159507lx.A0h(r4)
                    boolean r2 = r10.isEmpty()
                    if (r2 != 0) goto L_0x0225
                    X.30E r4 = r0.A0q
                    X.4FS r3 = r4.A02
                    r11 = 23
                    X.3ac r2 = new X.3ac
                    r6 = r2
                    r7 = r4
                    r8 = r0
                    r9 = r1
                    r6.<init>(r7, r8, r9, r10, r11)
                    r3.BkM(r2)
                L_0x0225:
                    r0.A7I(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A78():void");
            }

            public final void A79() {
                if (this.A0h.A00()) {
                    C113995mK r3 = this.A0i;
                    int i = this.A01;
                    r3.A0A((byte) 0, Integer.valueOf(i), C113995mK.A01(i));
                }
            }

            public final void A7A() {
                File file;
                List singletonList;
                C116155pp r1 = this.A0n;
                if (r1 != null && this.A0m != null && (file = r1.A09) != null) {
                    C116175pr r0 = r1.A08;
                    if (r0 != null) {
                        r0.A01();
                    }
                    C116145po r02 = this.A0k;
                    if (r02 != null) {
                        singletonList = Collections.unmodifiableList(r02.A08);
                    } else {
                        singletonList = Collections.singletonList(C135166kE.A00);
                    }
                    if (!A7M(singletonList)) {
                        C116145po r3 = this.A0k;
                        if (r3 != null) {
                            AnonymousClass7VK r2 = r3.A05;
                            if (r2.A00 == AnonymousClass58Q.SEND_VOICE) {
                                r2.A00();
                                ((CreationModeBottomBar) r3.A0L).A05.setEnabled(false);
                            }
                        }
                        C60072xx r32 = new C60072xx(this.A0n.A0C, this.A00);
                        C621033m r22 = this.A0L;
                        C108845de r12 = (C108845de) this.A15.A07();
                        Objects.requireNonNull(r12);
                        boolean z = this.A0y;
                        boolean z2 = !singletonList.equals(Collections.singletonList(C135166kE.A00));
                        AnonymousClass33C r14 = new AnonymousClass33C();
                        r14.A0F = file;
                        int A0F2 = C107655bf.A0F(file);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        Iterator it = singletonList.iterator();
                        while (it.hasNext()) {
                            C95814uZ A0P2 = C18300x5.A0P(it);
                            C30721mu A002 = r22.A1Y.A00(r14, A0P2, (C624134x) null, file.getName(), r22.A0V.A0H(), file.length(), false);
                            A002.A0B = A0F2;
                            A002.A23(r32);
                            if (A0P2 instanceof C135166kE) {
                                Objects.requireNonNull(r12);
                                A002.A0O = r12;
                                if (r12 != null) {
                                    A002.A0E = r12.A00;
                                }
                            }
                            A0s2.add(A002);
                        }
                        r22.A08(new AnonymousClass30M(A0s2), (byte[]) null, z, z2);
                        A7I(singletonList);
                    }
                }
            }

            public final void A7B() {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                int[] A1Z = C86664Kz.A1Z();
                A1Z[0] = (this.A00 & 16777215) | -436207616;
                A1Z[1] = 0;
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, A1Z);
                gradientDrawable.setCornerRadius(0.0f);
                ViewGroup viewGroup = this.A08;
                if (viewGroup != null) {
                    viewGroup.setBackground(gradientDrawable);
                }
            }

            public final void A7C() {
                View view = this.A07;
                if (view != null) {
                    view.setVisibility(0);
                    this.A07.setAlpha(0.0f);
                    C86634Kw.A1E(C86624Kv.A0B(this.A07), 320);
                    C69263Wi r0 = this.A05;
                    Runnable runnable = this.A18;
                    r0.A0R(runnable);
                    this.A05.A0T(runnable, 3500);
                }
            }

            public final void A7E() {
                int i;
                DisplayMetrics displayMetrics = this.A06;
                float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A09);
                ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(this.A0j);
                if (f > 360.0f) {
                    i = this.A03;
                } else {
                    i = this.A04;
                }
                int i2 = this.A05;
                A0T2.setMargins(i, i2, i, i2);
                A0T3.setMargins(i, this.A05, i, 0);
                this.A09.requestLayout();
                this.A0j.requestLayout();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0147, code lost:
                if (r2.A0V == null) goto L_0x0149;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x014a, code lost:
                if (r2 != null) goto L_0x014c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x014c, code lost:
                r0 = r2.A09;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x014e, code lost:
                if (r0 == null) goto L_0x0162;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0152, code lost:
                if (r0.A00 <= 0) goto L_0x0162;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x0154, code lost:
                r9.A0r.A0L(r4, false);
                r6.setLayoutParams(r5);
                X.C107415bH.A08(r9, r9.A09);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0161, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0162, code lost:
                X.C86644Kx.A1A(r9.A0r.A0Q);
                r4 = r1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void A7G(int r10) {
                /*
                    r9 = this;
                    X.3Ls r0 = r9.A0M
                    if (r0 == 0) goto L_0x016b
                    android.graphics.Bitmap r4 = r0.A03()
                    X.3Ls r0 = r9.A0M
                    if (r0 == 0) goto L_0x0113
                    android.graphics.Bitmap r3 = r0.A03()
                    if (r3 == 0) goto L_0x0113
                    X.3Ls r0 = r9.A0M
                    boolean r0 = X.C107415bH.A09(r0, r10)
                    if (r0 == 0) goto L_0x0113
                    android.util.DisplayMetrics r2 = r9.A06
                    int r0 = r2.heightPixels
                    float r1 = (float) r0
                    float r0 = r2.density
                    float r1 = r1 / r0
                    r0 = 1142947840(0x44200000, float:640.0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 < 0) goto L_0x0113
                    android.content.res.Resources r1 = r9.getResources()
                    r0 = 2131168330(0x7f070c4a, float:1.7950959E38)
                    int r2 = r1.getDimensionPixelSize(r0)
                    android.widget.ScrollView r0 = r9.A0B
                    int r1 = r0.getHeight()
                    com.whatsapp.status.playback.widget.StatusEditText r0 = r9.A0j
                    int r1 = X.C86664Kz.A0D(r0, r1)
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    android.widget.LinearLayout r0 = r0.A0E
                    int r0 = X.C86664Kz.A0D(r0, r1)
                    if (r0 < r2) goto L_0x0113
                    android.content.res.Resources r1 = r9.getResources()
                    r0 = 2131168331(0x7f070c4b, float:1.795096E38)
                    float r1 = X.C86664Kz.A01(r1, r0)
                    android.util.DisplayMetrics r0 = r9.A06
                    float r0 = r0.density
                    float r1 = r1 / r0
                    int r1 = (int) r1
                    int r0 = r3.getWidth()
                    if (r0 < r1) goto L_0x0113
                    if (r4 == 0) goto L_0x0113
                    X.4UA r0 = r9.A0O
                    boolean r0 = r0.A0Q()
                    if (r0 == 0) goto L_0x0074
                    boolean r0 = r9.A0z
                    if (r0 == 0) goto L_0x0074
                    X.4UA r1 = r9.A0O
                    r0 = 0
                    r1.A0P(r0)
                L_0x0074:
                    android.content.res.Resources r1 = r9.getResources()
                    r0 = 2131168331(0x7f070c4b, float:1.795096E38)
                    int r6 = r1.getDimensionPixelSize(r0)
                    com.whatsapp.webpagepreview.WebPagePreviewView r1 = r9.A0r
                    r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
                    android.widget.ImageView r3 = X.AnonymousClass0x9.A0F(r1, r0)
                    android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r3)
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    r0.A01()
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    android.widget.LinearLayout r0 = r0.A0E
                    int r7 = r0.getHeight()
                    int r0 = r4.getWidth()
                    float r1 = (float) r0
                    r0 = 1068708659(0x3fb33333, float:1.4)
                    float r1 = r1 * r0
                    int r8 = (int) r1
                    int r5 = r4.getHeight()
                    int r5 = r5 * r6
                    int r0 = r4.getWidth()
                    int r5 = r5 / r0
                    android.widget.ScrollView r0 = r9.A0B
                    int r1 = r0.getHeight()
                    com.whatsapp.status.playback.widget.StatusEditText r0 = r9.A0j
                    int r0 = X.C86664Kz.A0D(r0, r1)
                    int r0 = r0 - r7
                    int r0 = java.lang.Math.min(r5, r0)
                    int r1 = java.lang.Math.min(r8, r0)
                    int r7 = r7 + r1
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    r0.A0A(r6, r1)
                    android.view.ViewGroup r0 = r9.A09
                    android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                    r1.width = r6
                    r1.height = r7
                    android.view.ViewGroup r0 = r9.A09
                    r0.setLayoutParams(r1)
                    r0 = 1
                    android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r4, r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x00e2 }
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r     // Catch:{ OutOfMemoryError -> 0x00e2 }
                    r0.setImageLargeThumbWithBitmap(r1)     // Catch:{ OutOfMemoryError -> 0x00e2 }
                    goto L_0x00e7
                L_0x00e2:
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    r0.setImageLargeThumbWithBitmap(r4)
                L_0x00e7:
                    android.content.res.Resources r1 = r9.getResources()
                    r0 = 2131103185(0x7f060dd1, float:1.781883E38)
                    int r0 = r1.getColor(r0)
                    r3.setColorFilter(r0)
                    r0 = 2131233677(0x7f080b8d, float:1.8083498E38)
                    r3.setBackgroundResource(r0)
                    android.content.res.Resources r1 = r9.getResources()
                    r0 = 2131168332(0x7f070c4c, float:1.7950963E38)
                    int r1 = r1.getDimensionPixelSize(r0)
                    r0 = 0
                    r2.setMargins(r0, r1, r1, r0)
                    r3.setLayoutParams(r2)
                    android.view.ViewGroup r0 = r9.A09
                    r0.requestLayout()
                    return
                L_0x0113:
                    com.whatsapp.webpagepreview.WebPagePreviewView r1 = r9.A0r
                    r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
                    android.widget.ImageView r6 = X.AnonymousClass0x9.A0F(r1, r0)
                    android.view.ViewGroup$MarginLayoutParams r5 = X.AnonymousClass001.A0T(r6)
                    android.util.TypedValue r2 = X.AnonymousClass4L0.A0B()
                    android.content.res.Resources$Theme r1 = r9.getTheme()
                    r0 = 16843868(0x101045c, float:2.3696686E-38)
                    r4 = 1
                    r1.resolveAttribute(r0, r2, r4)
                    r6.clearColorFilter()
                    int r0 = r2.resourceId
                    r6.setBackgroundResource(r0)
                    r3 = 0
                    r5.setMargins(r3, r3, r3, r3)
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    r0.A03()
                    X.3Ls r2 = r9.A0M
                    if (r2 == 0) goto L_0x0149
                    byte[] r0 = r2.A0V
                    r1 = 1
                    if (r0 != 0) goto L_0x014c
                L_0x0149:
                    r1 = 0
                    if (r2 == 0) goto L_0x0162
                L_0x014c:
                    X.7Kq r0 = r2.A09
                    if (r0 == 0) goto L_0x0162
                    int r0 = r0.A00
                    if (r0 <= 0) goto L_0x0162
                L_0x0154:
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    r0.A0L(r4, r3)
                    r6.setLayoutParams(r5)
                    android.view.ViewGroup r0 = r9.A09
                    X.C107415bH.A08(r9, r0)
                    return
                L_0x0162:
                    com.whatsapp.webpagepreview.WebPagePreviewView r0 = r9.A0r
                    com.whatsapp.components.button.ThumbnailButton r0 = r0.A0Q
                    X.C86644Kx.A1A(r0)
                    r4 = r1
                    goto L_0x0154
                L_0x016b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A7G(int):void");
            }

            public final void A7J(boolean z) {
                int i;
                C116175pr r0;
                if (this.A0j.getText() == null || C86624Kv.A03(this.A0j) <= 0) {
                    C116155pp r1 = this.A0n;
                    if (r1 == null || this.A0m == null || r1.A09 == null) {
                        super.onBackPressed();
                        return;
                    }
                    i = 2;
                } else {
                    i = 1;
                }
                Bon(DiscardWarningDialogFragment.A00(i, z), (String) null);
                C116155pp r12 = this.A0n;
                if (r12 != null && this.A0m != null && (r0 = r12.A08) != null) {
                    r0.A00();
                }
            }

            public final void A7K(boolean z) {
                List singletonList;
                AnonymousClass5PH r1 = new AnonymousClass5PH(this);
                r1.A0H = true;
                r1.A0L = true;
                C116145po r0 = this.A0k;
                if (r0 != null) {
                    singletonList = Collections.unmodifiableList(r0.A08);
                } else {
                    singletonList = Collections.singletonList(C135166kE.A00);
                }
                r1.A0b = singletonList;
                AnonymousClass5PH.A02(r1, (byte) 0);
                r1.A0M = Boolean.valueOf(z);
                Intent A012 = AnonymousClass5PH.A01(r1);
                AnonymousClass5TZ r12 = this.A0g;
                C108845de r02 = (C108845de) this.A15.A07();
                Objects.requireNonNull(r02);
                r12.A01(A012, r02);
                startActivityForResult(A012, 2);
            }

            public final boolean A7L() {
                VoiceRecordingView voiceRecordingView = this.A0m;
                if (voiceRecordingView == null || this.A0n == null || !this.A10 || voiceRecordingView.getVisibility() == 4 || this.A0m.getVisibility() == 8) {
                    return true;
                }
                return false;
            }

            public void BU1() {
            }

            public void BU2() {
                this.A04.BkM(new C117635sF(this, 43));
            }

            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                C94294qu r0 = this.A0Z;
                if (r0 != null && r0.A02()) {
                    ViewGroup viewGroup = this.A08;
                    int[] iArr = this.A19;
                    viewGroup.getLocationOnScreen(iArr);
                    if (motionEvent.getRawY() >= ((float) iArr[1])) {
                        if (motionEvent.getRawY() < ((float) C86664Kz.A0C(this.A08, iArr[1]))) {
                            if (motionEvent.getAction() == 0) {
                                this.A12 = true;
                            } else if (motionEvent.getAction() == 1 && this.A12) {
                                this.A0Z.A01(true);
                                this.A12 = false;
                                return false;
                            }
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            public void onCreate(Bundle bundle) {
                boolean z;
                boolean z2;
                getWindow().setFlags(67108864, 67108864);
                Bundle bundle2 = bundle;
                super.onCreate(bundle2);
                AnonymousClass4UA r1 = (AnonymousClass4UA) AnonymousClass4L0.A0F(new C86124Ix(this.A13, this.A0F, this, 2), this).A01(AnonymousClass4UA.class);
                this.A0O = r1;
                C86604Kt.A1M(this, r1.A0D, 354);
                C86604Kt.A1M(this, this.A0O.A0G, 355);
                AnonymousClass6C6.A01(this, this.A0O.A0F, 353);
                AnonymousClass08M r15 = this.A0E;
                AnonymousClass6C6.A01(this, r15, 352);
                this.A10 = this.A0D.A0Y(C58422vE.A01, 1874);
                this.A0z = this.A0D.A0X(2343);
                setContentView((int) R.layout.f8nameremoved);
                VoiceRecordingView voiceRecordingView = (VoiceRecordingView) findViewById(R.id.voice_recording_view);
                this.A0m = voiceRecordingView;
                if (voiceRecordingView != null) {
                    AnonymousClass5E0 r2 = this.A0J;
                    AnonymousClass1VX A4B = C64333Db.A4B(r2.A00.A03);
                    C118075sx r22 = r2.A00;
                    C88834as r8 = r22.A01;
                    C64333Db r23 = r22.A03;
                    C620633i A2o = C64333Db.A2o(r23);
                    AnonymousClass4FS A8y = C64333Db.A8y(r23);
                    C113995mK A0q2 = C86634Kw.A0q(r23);
                    C116155pp r16 = new C116155pp((AnonymousClass5M5) r8.A1x.get(), (AnonymousClass5E1) r8.A1y.get(), this, A2o, A4B, A0q2, voiceRecordingView, (C104995Td) r23.A00.A0e.get(), A8y);
                    this.A0n = r16;
                    r16.A06 = this;
                }
                this.A06 = AnonymousClass000.A0B(this);
                this.A05 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                this.A04 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                if (bundle == null) {
                    A77();
                } else {
                    this.A00 = bundle2.getInt("background_color");
                    C86644Kx.A17(getWindow(), this.A00);
                }
                View findViewById = findViewById(R.id.color_picker_btn);
                C18280x3.A0o(findViewById, this, 30);
                AnonymousClass692.A00(findViewById, this, 13);
                TextView A0L2 = C18310x6.A0L(this, R.id.font_picker_btn);
                this.A0C = A0L2;
                C18280x3.A0o(A0L2, this, 31);
                AnonymousClass692.A00(this.A0C, this, 14);
                AnonymousClass08M r24 = this.A15;
                r24.A0H(getIntent().getParcelableExtra("status_distribution"));
                if (r24.A07() == null) {
                    if (this.A0u.A00() && !this.A0N.A02()) {
                        z = Boolean.TRUE.equals(this.A0s.A01(AnonymousClass21S.A0U));
                    } else if (this.A0N.A02()) {
                        C60492ye A002 = this.A0N.A00();
                        z = A002.A00;
                        z2 = A002.A01;
                        r24.A0H(new C108845de(this.A0Q.A07(), this.A0Q.A08(), this.A0Q.A02(), z, z2));
                    } else {
                        z = false;
                    }
                    z2 = false;
                    r24.A0H(new C108845de(this.A0Q.A07(), this.A0Q.A08(), this.A0Q.A02(), z, z2));
                }
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) C005205m.A00(this, R.id.bottom_bar);
                C101235Dz r4 = this.A0I;
                C56612sH A2p = C64333Db.A2p(r4.A00.A03);
                C64333Db r3 = r4.A00.A03;
                AnonymousClass1VX A4B2 = C64333Db.A4B(r3);
                AnonymousClass08M r17 = r24;
                C116145po r162 = new C116145po(r17, this, A2p, C64333Db.A2q(r3), C64333Db.A2t(r3), A4B2, (C55612qd) r3.A00.A9t.get(), C86634Kw.A0q(r3), creationModeBottomBar);
                this.A0k = r162;
                r162.A06 = this;
                creationModeBottomBar.setRecipientsListener(this);
                this.A09 = C86664Kz.A0m(this, R.id.web_page_preview_container);
                this.A0j = (StatusEditText) C005205m.A00(this, R.id.entry);
                View findViewById2 = findViewById(R.id.web_page_cardview_container);
                View.OnClickListener onClickListener = this.A14;
                findViewById2.setOnClickListener(onClickListener);
                findViewById(R.id.close_keyboard_container).setOnClickListener(onClickListener);
                C18280x3.A0o(findViewById(R.id.back), this, 32);
                this.A0B = (ScrollView) findViewById(R.id.scroll_container);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(2);
                layoutTransition.enableTransitionType(3);
                this.A09.setLayoutTransition(layoutTransition);
                A7E();
                C101225Dy r32 = this.A0H;
                C135166kE r21 = C135166kE.A00;
                ViewGroup viewGroup = this.A09;
                StatusEditText statusEditText = this.A0j;
                C150617Rm r10 = this.A17;
                AnonymousClass4UA r9 = this.A0O;
                ScrollView scrollView = this.A0B;
                C116145po r82 = this.A0k;
                C106685Zz A0m2 = C86634Kw.A0m(r32.A00.A03);
                C64333Db r25 = r32.A00.A03;
                AnonymousClass5Y0 A3o = C64333Db.A3o(r25);
                C620633i A2o2 = C64333Db.A2o(r25);
                C107695bk r5 = r25.A00;
                AnonymousClass2X0 Aqw = r25.Aqw();
                C113995mK A0q3 = C86634Kw.A0q(r25);
                C60152y5 A74 = C64333Db.A74(r25);
                C151257Ua r163 = (C151257Ua) r5.A2I.get();
                AnonymousClass5WL r12 = new AnonymousClass5WL(viewGroup, scrollView, r15, r163, r9, A2o2, C107695bk.A1l(r5), A3o, r21, A0m2, (C50022hV) r25.AFU.get(), A74, (AnonymousClass7SV) r5.A2J.get(), Aqw, A0q3, statusEditText, r10, r82);
                this.A0l = r12;
                AnonymousClass52Q r26 = new AnonymousClass52Q(r12);
                r12.A02 = r26;
                StatusEditText statusEditText2 = r12.A0L;
                statusEditText2.addTextChangedListener(r26);
                statusEditText2.setFilters(new InputFilter[]{new C109115e6(r12)});
                if (this.A0h.A00()) {
                    Intent intent = getIntent();
                    if (intent.hasExtra("entry_point")) {
                        this.A01 = intent.getIntExtra("entry_point", 0);
                    }
                    if (!(bundle == null && this.A01 == 5)) {
                        this.A0i.A09(Boolean.valueOf(AnonymousClass000.A1U(this.A01, 5)));
                    }
                    C113995mK r42 = this.A0i;
                    Integer valueOf = Integer.valueOf(this.A01);
                    AnonymousClass5Z9 r7 = r42.A0C;
                    if (r7.A04.A00()) {
                        Integer A003 = AnonymousClass5Z9.A00(valueOf);
                        C95044sW A012 = r7.A01();
                        A012.A03 = 25;
                        A012.A02 = A003;
                        A012.A01 = 2;
                        C102215Hx r27 = r7.A05;
                        r27.A01 = A003;
                        r27.A00 = 2;
                        r7.A02.BhB(A012);
                    }
                }
                String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
                if (stringExtra == null || TextUtils.getTrimmedLength(stringExtra) == 0) {
                    this.A11 = true;
                } else {
                    this.A11 = false;
                    String A032 = this.A0d.A03(stringExtra);
                    StatusEditText statusEditText3 = this.A0j;
                    if (!TextUtils.isEmpty(A032)) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        AnonymousClass0x2.A1N(A0o2, stringExtra);
                        stringExtra = A0o2.toString();
                    }
                    statusEditText3.setText(stringExtra);
                    AnonymousClass691.A00(this.A0j, this, 12);
                }
                this.A0j.requestFocus();
                this.A0j.setOnEditorActionListener(new AnonymousClass90I(this, 3));
                AnonymousClass5WS r43 = new AnonymousClass5WS();
                this.A0j.A0F = new C1235368u(r43, 2, this);
                this.A08 = C86664Kz.A0m(this, R.id.controls);
                A7B();
                this.A0A = (ImageButton) C005205m.A00(this, R.id.emoji_picker_btn);
                if (AnonymousClass4SG.A41(this)) {
                    this.A0D = (CoordinatorLayout) C005205m.A00(this, R.id.coordinator);
                    this.A0K = (KeyboardPopupLayout) C005205m.A00(this, R.id.main);
                    this.A0S = (EmojiSearchKeyboardContainer) C005205m.A00(this, R.id.expressions_emoji_search_container);
                    AnonymousClass4TE r33 = new AnonymousClass4TE(this.A0D, 0, false);
                    this.A0c = r33;
                    C05820Vc.A01(this.A0D, r33);
                    C94334qy r92 = this.A0V;
                    CoordinatorLayout coordinatorLayout = this.A0D;
                    ImageButton imageButton = this.A0A;
                    StatusEditText statusEditText4 = this.A0j;
                    KeyboardPopupLayout keyboardPopupLayout = this.A0K;
                    EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0S;
                    AnonymousClass4TE r34 = this.A0c;
                    C162457s7.A0J(coordinatorLayout, 1);
                    r92.A0A = statusEditText4;
                    r92.A02 = this;
                    r92.A01 = this;
                    r92.A05 = imageButton;
                    r92.A06 = coordinatorLayout;
                    r92.A09 = keyboardPopupLayout;
                    r92.A0B = emojiSearchKeyboardContainer;
                    r92.A04 = coordinatorLayout;
                    r92.A0G = r34;
                    this.A0V.A0A((int) (((double) C86634Kw.A0J().heightPixels) * 0.3d));
                    C94334qy r28 = this.A0V;
                    AnonymousClass4CE r35 = this.A16;
                    C162457s7.A0J(r35, 0);
                    r28.A08 = r35;
                    ExpressionsBottomSheetView expressionsBottomSheetView = r28.A0F;
                    if (expressionsBottomSheetView != null) {
                        expressionsBottomSheetView.A03 = r35;
                    }
                    C94334qy r52 = this.A0V;
                    AnonymousClass93Z r36 = new AnonymousClass93Z(this, 1);
                    ExpressionsBottomSheetView expressionsBottomSheetView2 = r52.A0F;
                    if (expressionsBottomSheetView2 != null) {
                        expressionsBottomSheetView2.A0H = r36;
                    }
                    r52.A0D = new C1899093c(this, 1);
                    r52.A0E = new C114115mW(this);
                    C18280x3.A0o(this.A0A, this, 33);
                    C18280x3.A0o(this.A0j, this, 34);
                } else {
                    AnonymousClass5PB r53 = this.A0X;
                    r53.A00 = this;
                    ImageButton imageButton2 = this.A0A;
                    StatusEditText statusEditText5 = this.A0j;
                    r53.A02 = (KeyboardPopupLayout) findViewById(R.id.main);
                    r53.A01 = imageButton2;
                    r53.A03 = statusEditText5;
                    AnonymousClass5PB.A00(this.A0P, r53);
                    C94264qq A013 = r53.A01();
                    this.A0Y = A013;
                    A013.A0C(this.A16);
                    A013.setOnDismissListener(new AnonymousClass91Z(this, 2));
                    AnonymousClass4FV r102 = this.A0W;
                    C55922r8 r93 = this.A0b;
                    C94264qq r6 = this.A0Y;
                    AnonymousClass5Y0 r54 = this.A0C;
                    C27821ej r44 = this.A0R;
                    C94294qu r11 = new C94294qu(this, this.A00, r44, r54, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), r102, r6, (GifSearchContainer) findViewById(R.id.gif_search_container), r93, this.A0f);
                    this.A0Z = r11;
                    AnonymousClass5S9.A00(r11, this, 10);
                    r11.A00 = new C171288Gm(this);
                }
                this.A07 = findViewById(R.id.voice_status_tip);
                if (!C86654Ky.A1T(AnonymousClass1Hf.A27(this), "show_voice_status_tooltip") || !this.A10) {
                    View view = this.A07;
                    if (view != null) {
                        view.clearAnimation();
                        this.A07.setVisibility(8);
                    }
                    this.A05.A0R(this.A18);
                    return;
                }
                A7C();
                C18270x1.A0v(this.A09, "show_voice_status_tooltip", false);
            }

            public boolean onKeyUp(int i, KeyEvent keyEvent) {
                ExpressionsBottomSheetView expressionsBottomSheetView;
                if (i == 82 || i == 4) {
                    if (!AnonymousClass4SG.A41(this) || (expressionsBottomSheetView = this.A0V.A0F) == null || expressionsBottomSheetView.getVisibility() != 0) {
                        C94264qq r0 = this.A0Y;
                        if (r0 != null && r0.isShowing()) {
                            this.A0Y.dismiss();
                            return false;
                        }
                    } else {
                        this.A0V.A03();
                        return false;
                    }
                }
                return super.onKeyUp(i, keyEvent);
            }

            public TextStatusComposerActivity(int i) {
                this.A0x = false;
                C86604Kt.A1K(this, 106);
            }

            public final void A7D() {
                C86644Kx.A17(getWindow(), this.A00);
                A7B();
                VoiceRecordingView voiceRecordingView = this.A0m;
                if (voiceRecordingView != null) {
                    voiceRecordingView.setBackgroundTint(AnonymousClass0YI.A03(0.2f, this.A00, -16777216));
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
                r1 = X.C18300x5.A07(r4).setAction("com.whatsapp.intent.action.CHATS");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
                if (r3 != false) goto L_0x001d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
                if (r3 == false) goto L_0x0023;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
                if (r5.size() != 1) goto L_0x0040;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
                r1 = X.C86664Kz.A1B().A1O(r4, (X.C95814uZ) r5.get(0), 0);
                X.AnonymousClass5VI.A00(r1, "TextStatusComposerActivity:sendEntry");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
                startActivity(r1);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void A7I(java.util.List r5) {
                /*
                    r4 = this;
                    android.view.Window r1 = r4.getWindow()
                    r0 = 3
                    r1.setSoftInputMode(r0)
                    r4.A74()
                    X.4uZ r0 = X.C627336j.A03(r5)
                    boolean r3 = X.AnonymousClass000.A1W(r0)
                    int r0 = r5.size()
                    r2 = 0
                    r1 = 1
                    if (r0 != r1) goto L_0x0021
                    if (r3 == 0) goto L_0x0023
                L_0x001d:
                    r4.finish()
                    return
                L_0x0021:
                    if (r3 != 0) goto L_0x0040
                L_0x0023:
                    int r0 = r5.size()
                    if (r0 != r1) goto L_0x0040
                    X.36r r1 = X.C86664Kz.A1B()
                    java.lang.Object r0 = r5.get(r2)
                    X.4uZ r0 = (X.C95814uZ) r0
                    android.content.Intent r1 = r1.A1O(r4, r0, r2)
                    java.lang.String r0 = "TextStatusComposerActivity:sendEntry"
                    X.AnonymousClass5VI.A00(r1, r0)
                L_0x003c:
                    r4.startActivity(r1)
                    goto L_0x001d
                L_0x0040:
                    android.content.Intent r1 = X.C18300x5.A07(r4)
                    java.lang.String r0 = "com.whatsapp.intent.action.CHATS"
                    android.content.Intent r1 = r1.setAction(r0)
                    goto L_0x003c
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A7I(java.util.List):void");
            }

            public final boolean A7M(List list) {
                if (list.size() == 0) {
                    A7K(false);
                    return true;
                }
                if (this.A0Q.A0F()) {
                    C620233e r1 = this.A0Q;
                    if (r1.A02() != 1 || !r1.A07().isEmpty()) {
                        return false;
                    }
                }
                Boo(new FirstStatusConfirmationDialogFragment());
                return true;
            }

            public void BZc(boolean z) {
                C18260x0.A1D("TextStatusComposerActivity/onRecipientsClicked/statusChipClicked: ", AnonymousClass001.A0o(), z);
                this.A0y = true;
                if (this.A0D.A0X(6132)) {
                    boolean z2 = true;
                    this.A0y = z;
                    if ((!this.A0u.A00() || this.A0N.A02()) && !this.A0N.A02()) {
                        z2 = false;
                    }
                    StatusPrivacyBottomSheetDialogFragment A002 = AnonymousClass5C3.A00(z2);
                    this.A0g.A02(A002.A0H(), (C108845de) this.A15.A07());
                    Boo(A002);
                    Dialog dialog = A002.A03;
                    if (dialog != null) {
                        C626936e.A06(dialog);
                        C86654Ky.A0u(dialog, this, 9);
                        return;
                    }
                    return;
                }
                A7K(z);
            }

            public void BcW() {
                A79();
                if (A7L()) {
                    A78();
                } else {
                    A7A();
                }
            }

            public void onActivityResult(int i, int i2, Intent intent) {
                super.onActivityResult(i, i2, intent);
                if (i != 1) {
                    if (i == 2) {
                        C626936e.A06(intent);
                        C108845de A002 = this.A0g.A00(intent.getExtras());
                        AnonymousClass08M r0 = this.A15;
                        C626936e.A06(A002);
                        r0.A0H(A002);
                        C116145po r02 = this.A0k;
                        if (r02 != null) {
                            r02.A01(intent);
                        }
                        if (i2 == -1) {
                            A79();
                            if (A7L()) {
                                A78();
                            } else {
                                A7A();
                            }
                        }
                    }
                } else if (i2 == -1) {
                    finish();
                }
            }

            public void onBackPressed() {
                ExpressionsBottomSheetView expressionsBottomSheetView;
                if (!AnonymousClass4SG.A41(this) || (expressionsBottomSheetView = this.A0V.A0F) == null || expressionsBottomSheetView.getVisibility() != 0) {
                    C94294qu r0 = this.A0Z;
                    if (r0 == null || !r0.A03()) {
                        A7J(true);
                        return;
                    }
                    return;
                }
                this.A0V.A03();
            }

            public void onConfigurationChanged(Configuration configuration) {
                ViewTreeObserver viewTreeObserver;
                super.onConfigurationChanged(configuration);
                this.A06 = AnonymousClass000.A0B(this);
                A7E();
                Number A0i2 = C86654Ky.A0i(this.A0E);
                if (!(this.A0j.getText() == null || A0i2 == null)) {
                    A7G(A0i2.intValue());
                }
                if (AnonymousClass4SG.A41(this)) {
                    this.A0V.A00 = (int) (((double) C86634Kw.A0J().heightPixels) * 0.3d);
                    C94334qy r4 = this.A0V;
                    CoordinatorLayout coordinatorLayout = r4.A06;
                    if (coordinatorLayout != null && (viewTreeObserver = coordinatorLayout.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass6BP(2, r4, true));
                    }
                }
            }

            public void onDestroy() {
                super.onDestroy();
                C94264qq r0 = this.A0Y;
                if (r0 != null) {
                    r0.A0F();
                }
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0S;
                if (emojiSearchKeyboardContainer != null) {
                    emojiSearchKeyboardContainer.A02();
                }
                if (AnonymousClass4SG.A41(this)) {
                    this.A0V.A05();
                }
                this.A0c = null;
                AnonymousClass5WL r2 = this.A0l;
                StatusEditText statusEditText = r2.A0L;
                statusEditText.removeTextChangedListener(r2.A02);
                statusEditText.setFilters(new InputFilter[0]);
                r2.A02 = null;
                this.A05.A0R(this.A18);
            }

            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (!keyEvent.isPrintingKey() || !this.A0j.isShown() || this.A0j.hasFocus()) {
                    return super.onKeyDown(i, keyEvent);
                }
                this.A0j.requestFocus();
                dispatchKeyEvent(keyEvent);
                return true;
            }

            public void onSaveInstanceState(Bundle bundle) {
                super.onSaveInstanceState(bundle);
                bundle.putInt("background_color", this.A00);
            }

            public void onStart() {
                super.onStart();
                if ((!this.A10 || C86604Kt.A02(this) != 2) && this.A11) {
                    int i = 2;
                    if (AnonymousClass4SG.A41(this)) {
                        Window window = getWindow();
                        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0V.A0F;
                        if (expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 0) {
                            i = 4;
                        }
                        window.setSoftInputMode(i | 1);
                        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0V.A0F;
                        if (expressionsBottomSheetView2 != null && expressionsBottomSheetView2.getVisibility() == 0) {
                            return;
                        }
                    } else if (this.A0Y != null) {
                        Window window2 = getWindow();
                        if (!this.A0Y.isShowing()) {
                            i = 4;
                        }
                        window2.setSoftInputMode(i | 1);
                        if (this.A0Y.isShowing()) {
                            return;
                        }
                    } else {
                        return;
                    }
                    this.A0j.A07(true);
                }
            }

            public TextStatusComposerActivity() {
                this(0);
                this.A13 = AnonymousClass000.A0A();
                this.A18 = new C117635sF(this, 44);
                this.A00 = C107415bH.A00();
                this.A02 = 0;
                this.A15 = AnonymousClass08M.A01();
                this.A0E = C18330xA.A01(0);
                this.A0c = null;
                this.A16 = new AnonymousClass694(this, 15);
                this.A17 = new C150617Rm(this);
                this.A14 = new C109675f0((Object) this, 35);
                this.A19 = C86664Kz.A1Z();
            }
        }
