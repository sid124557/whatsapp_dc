package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass33O;
import X.AnonymousClass33p;
import X.AnonymousClass3LQ;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4LD;
import X.AnonymousClass4LE;
import X.AnonymousClass4vJ;
import X.AnonymousClass5GV;
import X.AnonymousClass5UO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YF;
import X.AnonymousClass7XM;
import X.C003203q;
import X.C08310eF;
import X.C105305Uj;
import X.C105425Uw;
import X.C105895Wv;
import X.C106085Xo;
import X.C114825nf;
import X.C158927km;
import X.C182648ol;
import X.C182678oo;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C183538qC;
import X.C27801eg;
import X.C27831ek;
import X.C28071fd;
import X.C29361ih;
import X.C41532Kp;
import X.C54182oJ;
import X.C54292oU;
import X.C55682qk;
import X.C56932sn;
import X.C620633i;
import X.C620733j;
import X.C624134x;
import X.C66663Mh;
import X.C67513Po;
import X.C69263Wi;
import X.C71533cG;
import X.C72333dY;
import X.C86604Kt;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C95814uZ;
import X.C989053r;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.VideoQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;
import java.util.Objects;

public abstract class MediaComposerFragment extends Hilt_MediaComposerFragment implements C182678oo {
    public Uri A00;
    public Toast A01;
    public C55682qk A02;
    public C69263Wi A03;
    public C66663Mh A04;
    public C620633i A05;
    public C54292oU A06;
    public AnonymousClass33p A07;
    public C620733j A08;
    public AnonymousClass5Y0 A09;
    public AnonymousClass1VX A0A;
    public C28071fd A0B;
    public AnonymousClass5UO A0C;
    public AnonymousClass5GV A0D;
    public C114825nf A0E;
    public C27831ek A0F;
    public C67513Po A0G;
    public C27801eg A0H;
    public AnonymousClass3LQ A0I;
    public AnonymousClass33O A0J;
    public C29361ih A0K;
    public C56932sn A0L;
    public C54182oJ A0M;
    public C105895Wv A0N;
    public C989053r A0O;
    public AnonymousClass4FS A0P;
    public C183538qC A0Q;
    public C183538qC A0R;
    public C183538qC A0S;
    public boolean A0T;
    public final int[] A0U = C86664Kz.A1Z();

    public void A0k(int i, int i2, Intent intent) {
        Bundle extras;
        if (i != 2) {
            super.A0k(i, i2, intent);
            return;
        }
        C86644Kx.A0Y(this).A10.A07(0);
        if (i2 == -1 && (extras = intent.getExtras()) != null) {
            String string = extras.getString("locations_string");
            if (TextUtils.isEmpty(string)) {
                string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            }
            double d = extras.getDouble("longitude");
            double d2 = extras.getDouble("latitude");
            AnonymousClass4vJ r1 = new AnonymousClass4vJ(A0G(), this.A08, string, false);
            r1.A01 = d;
            r1.A00 = d2;
            this.A0E.A08(r1);
        }
    }

    public void A0r(Bundle bundle) {
        this.A0X = true;
        C114825nf r3 = this.A0E;
        if (r3 != null) {
            r3.A0M.BnS(r3.A0J.A05.A00, r3.A0K.A00);
            r3.A0A = true;
        }
    }

    public void A1J() {
        this.A0T = true;
        C114825nf r2 = this.A0E;
        C105305Uj r1 = r2.A0V;
        r1.A05 = r2.A05;
        r1.A06 = r2;
    }

    public void A0c() {
        AnonymousClass5UO r2 = this.A0C;
        if (r2 != null) {
            C105305Uj r1 = C86644Kx.A0Y(this).A10;
            if (r1.A05 == r2) {
                r1.A05 = null;
            }
        }
        C114825nf r4 = this.A0E;
        if (r4 != null) {
            DoodleView doodleView = r4.A0M;
            C106085Xo r22 = doodleView.A0F;
            Bitmap bitmap = r22.A07;
            if (bitmap != null) {
                bitmap.recycle();
                r22.A07 = null;
            }
            Bitmap bitmap2 = r22.A08;
            if (bitmap2 != null) {
                bitmap2.recycle();
                r22.A08 = null;
            }
            Bitmap bitmap3 = r22.A06;
            if (bitmap3 != null) {
                bitmap3.recycle();
                r22.A06 = null;
            }
            Bitmap bitmap4 = r22.A05;
            if (bitmap4 != null) {
                bitmap4.recycle();
                r22.A05 = null;
            }
            doodleView.setEnabled(false);
            r4.A0C.removeCallbacksAndMessages((Object) null);
            C72333dY r12 = r4.A0Y;
            if (r12.A08()) {
                C158927km r23 = (C158927km) r12.get();
                C18290x4.A1L(r23.A02);
                r23.A06.quit();
                r23.A0K.removeMessages(0);
                r23.A0e.clear();
                r23.A0S.A00 = null;
                r23.A0X.A07(r23.A0W);
                r23.A0R.A02();
            }
            C105305Uj r0 = r4.A0V;
            if (r0 != null) {
                r0.A0I.setToolbarExtraVisibility(8);
            }
        }
        Toast toast = this.A01;
        if (toast != null) {
            toast.cancel();
            this.A01 = null;
        }
        this.A00 = null;
        super.A0c();
    }

    public void A0d() {
        C114825nf r2 = this.A0E;
        if (r2 != null) {
            r2.A0J.A04(false);
            r2.A05.A00();
        }
        super.A0d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0074, code lost:
        if (r13.A0A.A0X(1493) == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r42, android.view.View r43) {
        /*
            r41 = this;
            r13 = r41
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "uri"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r13.A00 = r0
        L_0x0010:
            boolean r1 = r13 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r1 == 0) goto L_0x00b8
            r0 = r13
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            X.68B r2 = new X.68B
            r2.<init>((com.whatsapp.mediacomposer.VideoComposerFragment) r0)
        L_0x001c:
            r13.A0C = r2
            X.1VX r0 = r13.A0A
            r25 = r0
            X.5Wv r0 = r13.A0N
            r22 = r0
            X.4FS r0 = r13.A0P
            r21 = r0
            X.5Y0 r0 = r13.A09
            r23 = r0
            X.1ek r0 = r13.A0F
            r19 = r0
            X.33i r0 = r13.A05
            r20 = r0
            X.33j r15 = r13.A08
            X.1ih r12 = r13.A0K
            X.2sn r11 = r13.A0L
            X.1eg r10 = r13.A0H
            X.33p r9 = r13.A07
            X.3Po r8 = r13.A0G
            X.33O r7 = r13.A0J
            X.8qC r6 = r13.A0Q
            X.8qC r0 = r13.A0R
            java.lang.Object r5 = r0.get()
            X.5YE r5 = (X.AnonymousClass5YE) r5
            X.03q r17 = r13.A0R()
            X.5UO r4 = r13.A0C
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = X.C86644Kx.A0Y(r13)
            X.5Uj r3 = r0.A10
            if (r1 == 0) goto L_0x00aa
            r0 = r13
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            X.7zB r2 = new X.7zB
            r2.<init>(r0)
        L_0x0064:
            X.5GV r1 = r13.A0D
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0076
            X.1VX r14 = r13.A0A
            r0 = 1493(0x5d5, float:2.092E-42)
            boolean r0 = r14.A0X(r0)
            r40 = 1
            if (r0 != 0) goto L_0x0078
        L_0x0076:
            r40 = 0
        L_0x0078:
            X.5nf r0 = new X.5nf
            r27 = r13
            r31 = r13
            r18 = r13
            r16 = r43
            r29 = r19
            r30 = r8
            r32 = r10
            r33 = r3
            r34 = r7
            r35 = r12
            r36 = r11
            r37 = r22
            r38 = r21
            r39 = r6
            r19 = r13
            r21 = r9
            r22 = r15
            r24 = r5
            r26 = r4
            r28 = r1
            r14 = r0
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r13.A0E = r0
            return
        L_0x00aa:
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00b6
            r0 = r13
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.5eK r2 = r0.A04
            goto L_0x0064
        L_0x00b6:
            r2 = 0
            goto L_0x0064
        L_0x00b8:
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00c6
            r0 = r13
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.68B r2 = new X.68B
            r2.<init>((com.whatsapp.mediacomposer.ImageComposerFragment) r0)
            goto L_0x001c
        L_0x00c6:
            X.5UO r2 = new X.5UO
            r2.<init>(r13)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1K() {
        C003203q A0Q2;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            View findViewById = videoComposerFragment.A0J().findViewById(R.id.content);
            findViewById.setVisibility(0);
            C86604Kt.A1H(findViewById, AnonymousClass4L0.A0C(0.0f, 1.0f));
            videoComposerFragment.A0W.A09().setAlpha(1.0f);
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A08.setVisibility(0);
            if (imageComposerFragment.A0E != null && (A0Q2 = imageComposerFragment.A0Q()) != null && A0Q2.getIntent().getIntExtra("origin", 1) == 29) {
                C69263Wi r3 = imageComposerFragment.A03;
                C114825nf r2 = imageComposerFragment.A0E;
                Objects.requireNonNull(r2);
                r3.A0S(new C71533cG((Object) r2, 38));
            }
        } else if (this instanceof GifComposerFragment) {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            gifComposerFragment.A00.A09().setAlpha(1.0f);
            gifComposerFragment.A00.A09().setVisibility(0);
        }
    }

    public void A1L() {
        if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A08.setVisibility(4);
            C003203q A0Q2 = imageComposerFragment.A0Q();
            if (A0Q2 != null && A0Q2.getIntent().getIntExtra("origin", 1) == 29) {
                imageComposerFragment.A1X(false, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4.A0b != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1M() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0063
            r4 = r5
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.5mA r0 = r4.A0K
            r0.A06()
            X.5YG r3 = r4.A0W
            boolean r0 = r4.A0d
            r2 = 1
            if (r0 != 0) goto L_0x0018
            boolean r1 = r4.A0b
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r3.A0Z(r0)
            X.5YG r0 = r4.A0W
            r0.A0F()
            X.5nf r0 = r4.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r0.A0M
            X.5Xo r0 = r1.A0F
            r0.A0A = r2
            android.os.SystemClock.elapsedRealtime()
            r1.invalidate()
            X.5YG r0 = r4.A0W
            android.view.View r0 = r0.A09()
            r0.setKeepScreenOn(r2)
            X.5YG r0 = r4.A0W
            android.view.View r0 = r0.A09()
            java.lang.Runnable r3 = r4.A0i
            r0.removeCallbacks(r3)
            X.5YG r0 = r4.A0W
            android.view.View r2 = r0.A09()
            r0 = 50
            r2.postDelayed(r3, r0)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.View r0 = r4.A0C
            r0.startAnimation(r2)
            android.view.View r1 = r4.A0C
            r0 = 4
            r1.setVisibility(r0)
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 != 0) goto L_0x0062
            r3 = r5
            com.whatsapp.mediacomposer.GifComposerFragment r3 = (com.whatsapp.mediacomposer.GifComposerFragment) r3
            X.5YG r0 = r3.A00
            r0.A0F()
            X.5nf r0 = r3.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r0.A0M
            X.5Xo r0 = r2.A0F
            r1 = 1
            r0.A0A = r1
            android.os.SystemClock.elapsedRealtime()
            r2.invalidate()
            X.5YG r0 = r3.A00
            android.view.View r0 = r0.A09()
            r0.setKeepScreenOn(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A1M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (X.AnonymousClass001.A1Z(r1.A00()) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0070
            r4 = r12
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            android.widget.ImageView r2 = r4.A0G
            boolean r1 = r4.A0d
            r0 = 2131232266(0x7f08060a, float:1.8080636E38)
            if (r1 == 0) goto L_0x0013
            r0 = 2131232268(0x7f08060c, float:1.808064E38)
        L_0x0013:
            r2.setImageResource(r0)
            X.33D r1 = r4.A0U
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r7 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r1.A00()
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            r11 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r11 = 1
        L_0x002d:
            long r0 = r4.A08
            long r2 = r4.A07
            long r0 = r0 - r2
            r9 = 7000(0x1b58, double:3.4585E-320)
            r2 = 100
            r6 = 8
            r5 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0071
            boolean r0 = r4.A0c
            if (r0 != 0) goto L_0x0071
            if (r11 == 0) goto L_0x0071
            android.widget.ImageView r0 = r4.A0G
            int r0 = r0.getVisibility()
            if (r0 != r6) goto L_0x0064
            android.widget.ImageView r0 = r4.A0G
            r0.measure(r7, r7)
            android.widget.ImageView r0 = r4.A0G
            int r0 = r0.getMeasuredWidth()
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r0, r5, r5, r5)
            r1.setDuration(r2)
            android.widget.ImageView r0 = r4.A0G
            r0.startAnimation(r1)
        L_0x0064:
            android.widget.ImageView r1 = r4.A0G
            android.view.View$OnClickListener r0 = r4.A0A
            r1.setOnClickListener(r0)
            android.widget.ImageView r0 = r4.A0G
            r0.setVisibility(r7)
        L_0x0070:
            return
        L_0x0071:
            android.widget.ImageView r0 = r4.A0G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x008d
            android.widget.ImageView r0 = r4.A0G
            int r0 = r0.getMeasuredWidth()
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r0, r5, r5)
            r1.setDuration(r2)
            android.widget.ImageView r0 = r4.A0G
            r0.startAnimation(r1)
        L_0x008d:
            android.widget.ImageView r1 = r4.A0G
            r0 = 0
            r1.setOnClickListener(r0)
            android.widget.ImageView r0 = r4.A0G
            r0.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A1N():void");
    }

    public final void A1O() {
        C114825nf r3 = this.A0E;
        r3.A09 = AnonymousClass000.A1U(C86604Kt.A0A(this).orientation, 2);
        C105305Uj r2 = r3.A0V;
        r2.A01 = r3.A0K.A00;
        int i = 0;
        r3.A0J.A04(false);
        r3.A05.A00();
        if (!AnonymousClass0x7.A1S(r3.A0T.A03.A00)) {
            i = 4;
        }
        r2.A0I.setUndoButtonVisibility(i);
        r3.A05();
        r3.A06();
        AnonymousClass4LE r0 = r3.A08;
        if (r0 != null && r0.isShowing()) {
            r3.A08.A01.A01.A07(true);
        }
    }

    public void A1P(Rect rect) {
        C114825nf r5;
        if (this.A0B != null && (r5 = this.A0E) != null) {
            View view = r5.A0W.A03;
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
            A0T2.leftMargin = rect.left;
            A0T2.topMargin = rect.top;
            A0T2.rightMargin = rect.right;
            A0T2.bottomMargin = rect.bottom;
            view.setLayoutParams(A0T2);
            r5.A0J.setInsets(rect);
            C72333dY r1 = r5.A0Y;
            if (r1.A08()) {
                ((C158927km) r1.get()).A0R.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            r5.A0B.set(rect);
        }
    }

    public void A1Q(AnonymousClass5YF r12, Integer num) {
        C182648ol r1;
        DialogFragment imageQualitySettingsBottomSheetFragment;
        C003203q A0R2;
        C182648ol r3;
        Integer num2 = num;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            C003203q A0Q2 = videoComposerFragment.A0Q();
            if (A0Q2 instanceof C182648ol) {
                r3 = (C182648ol) A0Q2;
            } else {
                r3 = null;
            }
            imageQualitySettingsBottomSheetFragment = new VideoQualitySettingsBottomSheetFragment(r3, num2, videoComposerFragment.A0Y, videoComposerFragment.A0Z, videoComposerFragment.A01, videoComposerFragment.A06);
            A0R2 = videoComposerFragment.A0R();
        } else if (this instanceof ImageComposerFragment) {
            C003203q A0Q3 = A0Q();
            if (A0Q3 instanceof C182648ol) {
                r1 = (C182648ol) A0Q3;
            } else {
                r1 = null;
            }
            imageQualitySettingsBottomSheetFragment = new ImageQualitySettingsBottomSheetFragment(r12, r1, num);
            A0R2 = A0R();
        } else {
            return;
        }
        imageQualitySettingsBottomSheetFragment.A1O(A0R2.getSupportFragmentManager(), "media_quality_fragment");
    }

    public void A1R(boolean z) {
        int captionTop;
        int i;
        Toast A0C2;
        Toast toast = this.A01;
        if (toast != null) {
            toast.cancel();
        }
        if (z && A1D() != null) {
            Context A0G2 = A0G();
            MediaComposerActivity A0Y = C86644Kx.A0Y(this);
            AnonymousClass4LD r0 = A0Y.A0x;
            if (r0 == null || r0.A03.A04.getCaptionTop() == 0) {
                captionTop = A0Y.A0w.A04.A04.getCaptionTop();
            } else {
                captionTop = Math.min(A0Y.A0w.A04.A04.getCaptionTop(), A0Y.A0x.A03.A04.getCaptionTop());
            }
            List B8s = C86664Kz.A1E(this).B8s();
            if (B8s != null && B8s.size() == 1) {
                C95814uZ r3 = (C95814uZ) C18290x4.A0k(B8s);
                byte b = 42;
                if (this instanceof VideoComposerFragment) {
                    b = 43;
                }
                C41532Kp r2 = new C41532Kp(r3, b);
                A0C2 = null;
                if (!ViewOnceNuxBottomSheet.A01(A0T(), r2, this.A0I, (C624134x) null)) {
                    if (!C18280x3.A1W(AnonymousClass0x2.A0F(this.A07), "view_once_nux_secondary")) {
                        ViewOnceSecondaryNuxBottomSheet.A00(A0T(), r2);
                    }
                }
                this.A01 = A0C2;
            }
            C69263Wi r5 = this.A03;
            if (this instanceof VideoComposerFragment) {
                i = R.string.f11nameremoved;
            } else if (this instanceof ImageComposerFragment) {
                i = R.string.f11nameremoved;
            } else {
                i = 0;
            }
            A0C2 = r5.A0C(A0G2.getString(i));
            A0C2.setGravity(49, 0, captionTop / 2);
            A0C2.show();
            this.A01 = A0C2;
        }
    }

    public boolean A1S() {
        C114825nf r2 = this.A0E;
        if (!r2.A0A()) {
            C105305Uj r3 = r2.A0V;
            if (C86604Kt.A05(r3.A0G.A05) != 2) {
                return false;
            }
            r3.A07(0);
            r2.A03();
        }
        AnonymousClass7XM r32 = ((C158927km) r2.A0Y.get()).A0N;
        ClearableEditText clearableEditText = r32.A0A;
        if (clearableEditText.getVisibility() == 0) {
            C86634Kw.A1I(clearableEditText);
        } else {
            ValueAnimator valueAnimator = r32.A01;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                C105305Uj r1 = r2.A0V;
                r1.A0I.setBackButtonDrawable(false);
                r1.A04(r1.A00);
                r2.A04();
                return true;
            }
            long currentPlayTime = r32.A01.getCurrentPlayTime();
            r32.A01.cancel();
            r32.A00(currentPlayTime, false);
        }
        C18320x8.A18(r32.A0C.A00, false);
        return true;
    }

    public boolean A1T() {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            boolean A0a = videoComposerFragment.A0W.A0a();
            videoComposerFragment.A0W.A0C();
            videoComposerFragment.A05 = (long) videoComposerFragment.A0W.A05();
            DoodleView doodleView = videoComposerFragment.A0E.A0M;
            doodleView.A0F.A0A = false;
            doodleView.invalidate();
            videoComposerFragment.A0W.A09().setKeepScreenOn(false);
            AlphaAnimation A0H2 = C86604Kt.A0H();
            A0H2.setDuration(200);
            videoComposerFragment.A0C.startAnimation(A0H2);
            videoComposerFragment.A0C.setVisibility(0);
            return A0a;
        } else if (this instanceof ImageComposerFragment) {
            return false;
        } else {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            boolean A0a2 = gifComposerFragment.A00.A0a();
            gifComposerFragment.A00.A0C();
            DoodleView doodleView2 = gifComposerFragment.A0E.A0M;
            doodleView2.A0F.A0A = false;
            doodleView2.invalidate();
            gifComposerFragment.A00.A09().setKeepScreenOn(false);
            return A0a2;
        }
    }

    public void BbR(C105425Uw r6) {
        String str;
        boolean A052 = this.A0B.A05(A1D());
        Context A1D = A1D();
        Intent A072 = C18320x8.A07();
        A072.putExtra("mode", 1);
        String packageName = A1D.getPackageName();
        if (A052) {
            str = "com.whatsapp.location.LocationPicker2";
        } else {
            str = "com.whatsapp.location.LocationPicker";
        }
        A072.setClassName(packageName, str);
        startActivityForResult(A072, 2);
    }

    public void A15(boolean z) {
        try {
            super.A15(z);
        } catch (NullPointerException unused) {
            this.A02.A0A("mediacomperserfragment-visibility-npe", true, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        if (r2 == 180) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r3 = r4.A0G()
            java.lang.String r2 = "window"
            boolean r0 = r3 instanceof android.app.Application
            r1 = r0 ^ 1
            java.lang.String r0 = "Application context should not be used here"
            X.C626936e.A0D(r1, r0)
            java.lang.Object r0 = r3.getSystemService(r2)
            X.C626936e.A06(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getRotation()
            X.5nf r3 = r4.A0E
            int r1 = r5.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 1
            if (r2 != r0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            boolean r0 = r3.A09
            if (r0 == r1) goto L_0x0072
            r3.A09 = r1
            r3.A05()
            X.4LE r0 = r3.A08
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0072
            X.4LE r2 = r3.A08
            android.view.View r0 = r3.A03
            android.view.LayoutInflater r1 = X.C18280x3.A0D(r0)
            r0 = 2131624795(0x7f0e035b, float:1.887678E38)
            android.view.View r1 = X.C18310x6.A0H(r1, r0)
            r0 = 2131431144(0x7f0b0ee8, float:1.8484009E38)
            android.view.View r1 = r1.findViewById(r0)
            X.4vO r1 = (X.AnonymousClass4vO) r1
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0073
            X.5Uj r0 = r3.A0V
            android.graphics.Rect r0 = r0.A03
            int r0 = r0.top
        L_0x0067:
            r2.A01 = r1
            r2.A00 = r0
            X.5ng r0 = r2.A02
            r0.A00 = r1
            r2.A00()
        L_0x0072:
            return
        L_0x0073:
            r0 = 0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }
}
