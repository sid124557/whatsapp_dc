package com.whatsapp.inappsupport.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x7;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass3XC;
import X.AnonymousClass4SG;
import X.AnonymousClass69Q;
import X.AnonymousClass7PC;
import X.AnonymousClass8K1;
import X.C107695bk;
import X.C109485eh;
import X.C111095hX;
import X.C116575qV;
import X.C1222663s;
import X.C131666dx;
import X.C138326q8;
import X.C138386qG;
import X.C147457Ej;
import X.C153387bE;
import X.C153407bG;
import X.C162387ry;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C25441aW;
import X.C53302ms;
import X.C54292oU;
import X.C54322oX;
import X.C55682qk;
import X.C58172up;
import X.C620633i;
import X.C635439q;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import X.C89644eZ;
import X.C95154si;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.util.concurrent.TimeUnit;

public final class SupportVideoActivity extends C89644eZ {
    public int A00;
    public FrameLayout A01;
    public Mp4Ops A02;
    public C153407bG A03;
    public C54292oU A04;
    public C54322oX A05;
    public AnonymousClass7PC A06;
    public ExoPlaybackControlView A07;
    public ExoPlayerErrorFrame A08;
    public C138386qG A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public final void A75(int i) {
        Integer valueOf;
        String str;
        if (i == 2 || i == 5) {
            valueOf = Integer.valueOf(A74().A05() - this.A00);
        } else {
            valueOf = null;
        }
        AnonymousClass7PC r5 = this.A06;
        if (r5 != null) {
            int A052 = A74().A05();
            int A062 = A74().A06();
            if (A74().A0O.A02.getVisibility() == 0) {
                str = "on";
            } else {
                str = "off";
            }
            C95154si r4 = new C95154si();
            r4.A06 = r5.A01;
            r4.A00 = Integer.valueOf(i);
            r4.A09 = r5.A02;
            r4.A0B = r5.A00;
            r4.A0A = r5.A03;
            r4.A0C = r5.A04;
            r4.A0D = String.valueOf(A052);
            r4.A07 = String.valueOf(A062);
            r4.A03 = str;
            r4.A01 = C58172up.A0B;
            r4.A04 = "mobile";
            r4.A05 = "Android";
            r4.A08 = String.valueOf(System.currentTimeMillis());
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                r4.A0E = String.valueOf(intValue);
                r4.A02 = String.valueOf(C1222663s.A00((double) TimeUnit.MILLISECONDS.toSeconds((long) intValue)));
            }
            r5.A06.BhA(r4);
            return;
        }
        throw C18270x1.A0S("supportVideoLogger");
    }

    public void A5r() {
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = C64333Db.A2q(A2Y);
            this.A02 = (Mp4Ops) A2Y.AN5.get();
            this.A05 = (C54322oX) A2Y.AXY.get();
            this.A03 = (C153407bG) A2Y.AbG.get();
            this.A06 = (AnonymousClass7PC) r1.ABX.get();
        }
    }

    public final C138386qG A74() {
        C138386qG r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("exoPlayerVideoPlayer");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Uri uri;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        FrameLayout frameLayout = (FrameLayout) C18290x4.A0N(this, R.id.rootView);
        this.A01 = frameLayout;
        if (frameLayout == null) {
            throw C18270x1.A0S("rootView");
        }
        frameLayout.setClipChildren(false);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q(false);
        }
        AnonymousClass1Hf.A2E(this);
        C131666dx A0J = AnonymousClass0x7.A0J(this, this.A00, R.drawable.ic_back);
        A0J.setColorFilter(getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
        A28.setNavigationIcon((Drawable) A0J);
        Bundle A0D = C86614Ku.A0D(this);
        String str4 = null;
        if (A0D == null || (str = A0D.getString("video_url", "")) == null) {
            str = "";
        }
        Bundle A0D2 = C86614Ku.A0D(this);
        if (A0D2 != null) {
            str2 = A0D2.getString("captions_url", (String) null);
        } else {
            str2 = null;
        }
        Bundle A0D3 = C86614Ku.A0D(this);
        if (A0D3 != null) {
            str3 = A0D3.getString("media_group_id", "");
        } else {
            str3 = null;
        }
        this.A0A = str3;
        Bundle A0D4 = C86614Ku.A0D(this);
        if (A0D4 != null) {
            str4 = A0D4.getString("video_locale", "");
        }
        this.A0B = str4;
        AnonymousClass1VX r7 = this.A0D;
        C69263Wi r14 = this.A05;
        C620633i r15 = this.A08;
        C54292oU r10 = this.A04;
        if (r10 != null) {
            Mp4Ops mp4Ops = this.A02;
            if (mp4Ops != null) {
                C55682qk r8 = this.A03;
                C153407bG r4 = this.A03;
                if (r4 != null) {
                    Activity A022 = C111095hX.A02(this);
                    Uri parse = Uri.parse(str);
                    C138326q8 r16 = new C138326q8(r8, mp4Ops, r4, r10, C162387ry.A07(this, getString(R.string.f11nameremoved)));
                    if (str2 != null) {
                        uri = Uri.parse(str2);
                    } else {
                        uri = null;
                    }
                    C138386qG r12 = new C138386qG(A022, r14, r15, r7, (C147457Ej) null, (C153387bE) null, 0, false);
                    r12.A04 = parse;
                    r12.A03 = uri;
                    r12.A0i(r16);
                    this.A09 = r12;
                    FrameLayout frameLayout2 = this.A01;
                    if (frameLayout2 == null) {
                        throw C18270x1.A0S("rootView");
                    }
                    frameLayout2.addView(A74().A09(), 0);
                    int intExtra = getIntent().getIntExtra("video_start_position", 0);
                    boolean A1W = AnonymousClass001.A1W(intExtra);
                    A74().A0E = A1W;
                    this.A07 = (ExoPlaybackControlView) C18290x4.A0N(this, R.id.controlView);
                    C138386qG A74 = A74();
                    ExoPlaybackControlView exoPlaybackControlView = this.A07;
                    if (exoPlaybackControlView == null) {
                        throw C18270x1.A0S("exoPlayerControlView");
                    }
                    A74.A0W(exoPlaybackControlView);
                    FrameLayout frameLayout3 = this.A01;
                    if (frameLayout3 == null) {
                        throw C18270x1.A0S("rootView");
                    }
                    ExoPlayerErrorFrame exoPlayerErrorFrame = (ExoPlayerErrorFrame) C18290x4.A0M(frameLayout3, R.id.exoplayer_error_elements);
                    this.A08 = exoPlayerErrorFrame;
                    if (exoPlayerErrorFrame == null) {
                        throw C18270x1.A0S("exoPlayerErrorFrame");
                    }
                    ExoPlaybackControlView exoPlaybackControlView2 = this.A07;
                    if (exoPlaybackControlView2 == null) {
                        throw C18270x1.A0S("exoPlayerControlView");
                    }
                    A74().A0U(new C53302ms(exoPlayerErrorFrame, exoPlaybackControlView2, true));
                    ExoPlaybackControlView exoPlaybackControlView3 = this.A07;
                    if (exoPlaybackControlView3 == null) {
                        throw C18270x1.A0S("exoPlayerControlView");
                    }
                    exoPlaybackControlView3.A06 = new C116575qV(this);
                    FrameLayout frameLayout4 = this.A01;
                    if (frameLayout4 == null) {
                        throw C18270x1.A0S("rootView");
                    }
                    C635439q.A00(frameLayout4, this, 43);
                    A74().A0V(new AnonymousClass69Q(this, 1));
                    A74().A07 = new AnonymousClass8K1(this);
                    A74().A08 = new AnonymousClass3XC(this, str);
                    ExoPlaybackControlView exoPlaybackControlView4 = this.A07;
                    if (exoPlaybackControlView4 == null) {
                        throw C18270x1.A0S("exoPlayerControlView");
                    }
                    exoPlaybackControlView4.A0H.setVisibility(8);
                    A74().A0F();
                    if (A1W) {
                        A74().A0P(intExtra);
                    }
                    if (str2 != null) {
                        ImageView A0M = C86654Ky.A0M(this, R.id.captions_button);
                        A0M.setVisibility(0);
                        A74().A0O.setCaptionsEnabled(false);
                        A0M.setImageResource(R.drawable.vec_ic_caption_disabled);
                        A0M.setOnClickListener(new C109485eh(this, 22, A0M));
                    }
                    C54322oX r42 = this.A05;
                    if (r42 != null) {
                        String str5 = this.A0A;
                        String str6 = this.A0B;
                        C25441aW r1 = new C25441aW();
                        r1.A00 = 27;
                        r1.A07 = str;
                        r1.A04 = str5;
                        r1.A06 = str6;
                        r42.A00.BhA(r1);
                        return;
                    }
                    throw C18270x1.A0S("supportLogging");
                }
                throw C18270x1.A0S("wamediaWamLogger");
            }
            throw C18270x1.A0S("mp4Ops");
        }
        throw C18270x1.A0S("waContext");
    }

    public SupportVideoActivity(int i) {
        this.A0C = false;
        C86604Kt.A1K(this, 52);
    }

    public void onBackPressed() {
        Intent A072 = C18320x8.A07();
        A072.putExtra("video_start_position", A74().A05());
        setResult(-1, A072);
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        A74().A0G();
    }

    public void onPause() {
        super.onPause();
        A74().A0C();
    }

    public void onResume() {
        super.onResume();
        ExoPlaybackControlView exoPlaybackControlView = this.A07;
        if (exoPlaybackControlView == null) {
            throw C18270x1.A0S("exoPlayerControlView");
        } else if (!C86604Kt.A1Y(exoPlaybackControlView.A0E)) {
            ExoPlaybackControlView exoPlaybackControlView2 = this.A07;
            if (exoPlaybackControlView2 == null) {
                throw C18270x1.A0S("exoPlayerControlView");
            }
            exoPlaybackControlView2.A05();
        }
    }

    public SupportVideoActivity() {
        this(0);
    }
}
