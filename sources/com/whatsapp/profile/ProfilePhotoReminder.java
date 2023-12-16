package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass1RR;
import X.AnonymousClass1VX;
import X.AnonymousClass331;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CE;
import X.AnonymousClass4SG;
import X.AnonymousClass52T;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5UX;
import X.AnonymousClass5XU;
import X.AnonymousClass5Y0;
import X.AnonymousClass681;
import X.AnonymousClass68W;
import X.AnonymousClass694;
import X.C001902e;
import X.C005205m;
import X.C105895Wv;
import X.C107555bV;
import X.C107695bk;
import X.C109095e4;
import X.C181568my;
import X.C27821ej;
import X.C29421in;
import X.C30191m3;
import X.C46132b8;
import X.C55682qk;
import X.C56602sG;
import X.C60152y5;
import X.C613330g;
import X.C619933b;
import X.C620633i;
import X.C620733j;
import X.C621533t;
import X.C625635p;
import X.C633939b;
import X.C64333Db;
import X.C66523Lt;
import X.C71273bq;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C89224c7;
import X.C89644eZ;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.util.Log;

public class ProfilePhotoReminder extends C89644eZ {
    public Bitmap A00;
    public Handler A01;
    public View A02;
    public ImageView A03;
    public AnonymousClass5XU A04;
    public WaEditText A05;
    public AnonymousClass5UX A06;
    public C29421in A07;
    public C613330g A08;
    public AnonymousClass3ZH A09;
    public AnonymousClass5IY A0A;
    public C27821ej A0B;
    public AnonymousClass5S9 A0C;
    public EmojiSearchProvider A0D;
    public C66523Lt A0E;
    public C619933b A0F;
    public C60152y5 A0G;
    public C30191m3 A0H;
    public C46132b8 A0I;
    public Runnable A0J;
    public boolean A0K;
    public final AnonymousClass4CE A0L;
    public final C56602sG A0M;

    public final void A74() {
        Bitmap A032;
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        float dimension = getResources().getDimension(R.dimen.f6nameremoved);
        if (AnonymousClass331.A00(AnonymousClass4SG.A2m(this))) {
            this.A03.setEnabled(false);
            this.A02.setVisibility(0);
            A032 = this.A00;
            if (A032 == null) {
                A032 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                this.A00 = A032;
            }
        } else {
            this.A03.setEnabled(true);
            this.A02.setVisibility(4);
            A032 = this.A08.A03(this, this.A09, dimension, dimensionPixelSize, false);
            if (A032 == null) {
                AnonymousClass3ZH r1 = this.A09;
                if (r1.A06 == 0 && r1.A05 == 0) {
                    this.A02.setVisibility(0);
                    Handler handler = this.A01;
                    if (handler == null) {
                        handler = AnonymousClass000.A0A();
                        this.A01 = handler;
                        this.A0J = new C71273bq((Object) this, 14);
                    }
                    handler.removeCallbacks(this.A0J);
                    this.A01.postDelayed(this.A0J, C625635p.A0L);
                } else {
                    this.A02.setVisibility(4);
                }
                A032 = this.A06.A02(this.A02.getContext(), dimension, R.drawable.avatar_contact, dimensionPixelSize);
            }
        }
        this.A03.setImageBitmap(A032);
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = AnonymousClass4SG.A2d(A2Y);
            this.A0B = C86604Kt.A0X(A2Y);
            this.A0A = C107695bk.A1m(r1);
            this.A06 = C86614Ku.A0R(A2Y);
            this.A0E = AnonymousClass4SG.A2n(A2Y);
            this.A0I = (C46132b8) r1.A9v.get();
            this.A07 = C86614Ku.A0S(A2Y);
            this.A0D = C107695bk.A1n(r1);
            this.A0F = C86624Kv.A0V(A2Y);
            this.A0H = C86634Kw.A0o(A2Y);
            this.A0G = C64333Db.A74(A2Y);
            this.A08 = C86624Kv.A0P(A2Y);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            AnonymousClass4SG.A3m(this.A0H);
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0H.A04(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A02.setVisibility(0);
                    this.A0H.A0E(this.A09);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    AnonymousClass4SG.A3m(this.A0H);
                }
            }
            this.A0H.A05(intent, this, 13);
            return;
        } else {
            return;
        }
        if (this.A0H.A0G(this.A09)) {
            this.A02.setVisibility(0);
        }
    }

    public void onBackPressed() {
        if (!this.A0C.A03()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass0R8 A0R = C86634Kw.A0R(this);
        A0R.A0O(true);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1RR A2c = AnonymousClass4SG.A2c(this);
        this.A09 = A2c;
        if (A2c == null) {
            Log.i("profilephotoreminder/create/no-me");
            AnonymousClass4SG.A36(this);
            return;
        }
        TextView A012 = C005205m.A01(this, R.id.name_counter_tv);
        this.A05 = (WaEditText) findViewById(R.id.registration_name);
        AnonymousClass1VX r17 = this.A0D;
        C55682qk r15 = this.A03;
        AnonymousClass5Y0 r10 = this.A0C;
        C27821ej r9 = this.A0B;
        C620633i r8 = this.A08;
        C620733j r7 = this.A00;
        AnonymousClass5IY r6 = this.A0A;
        EmojiSearchProvider emojiSearchProvider = this.A0D;
        AnonymousClass33p r4 = this.A09;
        C60152y5 r3 = this.A0G;
        C105895Wv r30 = this.A0B;
        C55682qk r18 = r15;
        C181568my r19 = (C181568my) findViewById(R.id.main);
        WaEditText waEditText = this.A05;
        ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_btn);
        C89224c7 r152 = new C89224c7(this, imageButton, r18, r19, waEditText, r8, r4, r7, r6, r9, r10, emojiSearchProvider, r17, r3, r30);
        r152.A0C(this.A0L);
        AnonymousClass5Y0 r5 = this.A0C;
        C27821ej r42 = this.A0B;
        AnonymousClass5S9 r153 = new AnonymousClass5S9(this, this.A00, r152, r42, r5, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), this.A0G);
        this.A0C = r153;
        AnonymousClass5S9.A00(r153, this, 6);
        r152.A0E = new C71273bq((Object) this, 12);
        ImageView A0M2 = C86654Ky.A0M(this, R.id.change_photo_btn);
        this.A03 = A0M2;
        C633939b.A00(A0M2, this, 33);
        C620733j r52 = this.A00;
        String string = getString(R.string.f11nameremoved);
        C633939b r32 = new C633939b(this, 34);
        View A0F2 = C86604Kt.A0F(LayoutInflater.from(A0R.A02()), R.layout.f8nameremoved);
        C001902e r1 = new C001902e(-2, -2);
        r1.A00 = C86664Kz.A04(C620733j.A04(r52) ? 1 : 0);
        A0R.A0H(A0F2, r1);
        AnonymousClass002.A09(A0F2, R.id.action_done_text).setText(string.toUpperCase(C620733j.A02(r52)));
        A0F2.findViewById(R.id.action_done).setOnClickListener(r32);
        this.A02 = findViewById(R.id.change_photo_progress);
        A74();
        C107555bV.A09(this.A05, this.A00);
        WaEditText waEditText2 = this.A05;
        AnonymousClass5Y0 r62 = this.A0C;
        WaEditText waEditText3 = waEditText2;
        waEditText2.addTextChangedListener(new AnonymousClass52T(waEditText3, A012, this.A08, this.A00, this.A0B, r62, this.A0G, 25, 0, false, false, false));
        C109095e4.A00(this.A05, new InputFilter[1], 25);
        this.A05.setText(AnonymousClass4SG.A2u(this));
        WaEditText waEditText4 = this.A05;
        waEditText4.setSelection(waEditText4.length());
        if (this.A04.A03()) {
            Log.w("profilephotoreminder/clock-wrong");
            C621533t.A02(this, this.A0E, this.A0F);
        } else if (this.A04.A02()) {
            Log.w("profilephotoreminder/sw-expired");
            C621533t.A03(this, this.A0E, this.A0F);
        }
        this.A07.A06(this.A0M);
    }

    public ProfilePhotoReminder(int i) {
        this.A0K = false;
        AnonymousClass68W.A00(this, 75);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A07(this.A0M);
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A0J);
        }
    }

    public ProfilePhotoReminder() {
        this(0);
        this.A0L = new AnonymousClass694(this, 10);
        this.A0M = AnonymousClass681.A00(this, 33);
    }
}
