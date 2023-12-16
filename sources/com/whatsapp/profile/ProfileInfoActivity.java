package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass088;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1RR;
import X.AnonymousClass331;
import X.AnonymousClass36P;
import X.AnonymousClass3ZH;
import X.AnonymousClass4EF;
import X.AnonymousClass4FV;
import X.AnonymousClass4Pz;
import X.AnonymousClass4SG;
import X.AnonymousClass5P5;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZC;
import X.AnonymousClass67I;
import X.AnonymousClass681;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C107275b2;
import X.C107695bk;
import X.C116985rC;
import X.C1232967w;
import X.C1238469z;
import X.C18280x3;
import X.C18320x8;
import X.C29421in;
import X.C30191m3;
import X.C46132b8;
import X.C54042o5;
import X.C54482on;
import X.C55262q4;
import X.C55862r2;
import X.C55912r7;
import X.C56602sG;
import X.C58152un;
import X.C613330g;
import X.C625635p;
import X.C627736r;
import X.C633939b;
import X.C64333Db;
import X.C71273bq;
import X.C71373c0;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import X.C90084fo;
import X.C989653x;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileInfoActivity extends C89644eZ implements AnonymousClass4EF {
    public Handler A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public FrameLayout A05;
    public ImageView A06;
    public C116985rC A07;
    public C116985rC A08;
    public C54042o5 A09;
    public C55912r7 A0A;
    public AnonymousClass4Pz A0B;
    public AnonymousClass5P5 A0C;
    public C90084fo A0D;
    public AnonymousClass5UX A0E;
    public C29421in A0F;
    public C613330g A0G;
    public C55262q4 A0H;
    public AnonymousClass3ZH A0I;
    public AnonymousClass4FV A0J;
    public WhatsAppLibLoader A0K;
    public C55862r2 A0L;
    public C30191m3 A0M;
    public ProfileSettingsRowIconText A0N;
    public ProfileSettingsRowIconText A0O;
    public ProfileSettingsRowIconText A0P;
    public SettingsRowPhotoOrInitialText A0Q;
    public C46132b8 A0R;
    public C54482on A0S;
    public Runnable A0T;
    public boolean A0U;
    public boolean A0V;
    public final C56602sG A0W;

    public final void A75() {
        this.A03.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        boolean A002 = AnonymousClass331.A00(AnonymousClass4SG.A2m(this));
        ImageView imageView = this.A06;
        if (A002) {
            imageView.setEnabled(false);
            this.A03.setVisibility(0);
        } else {
            imageView.setEnabled(true);
            this.A03.setVisibility(4);
        }
        Bitmap A032 = this.A0G.A03(this, this.A0I, -1.0f, dimensionPixelSize, false);
        if (A032 == null) {
            AnonymousClass3ZH r1 = this.A0I;
            if (r1.A06 == 0 && r1.A05 == 0) {
                this.A03.setVisibility(0);
                Handler handler = this.A00;
                if (handler == null) {
                    handler = AnonymousClass000.A0A();
                    this.A00 = handler;
                    this.A0T = new C71273bq((Object) this, 8);
                }
                handler.removeCallbacks(this.A0T);
                this.A00.postDelayed(this.A0T, C625635p.A0L);
            } else {
                this.A03.setVisibility(4);
            }
            A032 = this.A0E.A02(this.A06.getContext(), -1.0f, R.drawable.avatar_contact, dimensionPixelSize);
            this.A0U = false;
        } else {
            this.A0U = true;
        }
        this.A06.setImageBitmap(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r5.A0A.A01("profile") == 0) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r1 = -1
            switch(r6) {
                case 12: goto L_0x003a;
                case 13: goto L_0x0014;
                case 14: goto L_0x0008;
                case 15: goto L_0x00aa;
                default: goto L_0x0004;
            }
        L_0x0004:
            super.onActivityResult(r6, r7, r8)
        L_0x0007:
            return
        L_0x0008:
            if (r7 != r1) goto L_0x0007
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r5.A0N
            java.lang.String r0 = X.AnonymousClass4SG.A2u(r5)
            r1.setSubText(r0)
            return
        L_0x0014:
            X.1m3 r0 = r5.A0M
            X.AnonymousClass4SG.A3m(r0)
            if (r7 != r1) goto L_0x0030
            X.1m3 r1 = r5.A0M
            X.3ZH r0 = r5.A0I
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x0007
            r5.A75()
            X.2on r2 = r5.A0S
            r1 = 1
            r0 = 2
            r2.A03(r1, r0)
            return
        L_0x0030:
            if (r7 != 0) goto L_0x0007
            if (r8 == 0) goto L_0x0007
            X.1m3 r0 = r5.A0M
            r0.A04(r8, r5)
            return
        L_0x003a:
            if (r7 != r1) goto L_0x005d
            r1 = 0
            if (r8 == 0) goto L_0x00a2
            java.lang.String r0 = "is_reset"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0087
            android.view.View r0 = r5.A03
            r0.setVisibility(r1)
            X.1m3 r1 = r5.A0M
            X.3ZH r0 = r5.A0I
            r1.A0E(r0)
            r5.A74()
        L_0x0056:
            X.2on r2 = r5.A0S
            r1 = 1
            r0 = 2
            r2.A03(r1, r0)
        L_0x005d:
            android.view.View r0 = r5.A02
            float r0 = r0.getScaleX()
            double r1 = (double) r0
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0007
            android.view.View r0 = r5.A02
            float r0 = r0.getScaleY()
            double r1 = (double) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0007
            android.view.View r0 = r5.A02
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = X.C86634Kw.A0P(r1, r0)
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            return
        L_0x0087:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00a2
            X.1m3 r0 = r5.A0M
            X.AnonymousClass4SG.A3m(r0)
            X.1m3 r1 = r5.A0M
            X.3ZH r0 = r5.A0I
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x005d
            r5.A75()
            goto L_0x0056
        L_0x00a2:
            X.1m3 r1 = r5.A0M
            r0 = 13
            r1.A05(r8, r5, r0)
            goto L_0x005d
        L_0x00aa:
            X.1VX r1 = r5.A0D
            r0 = 6149(0x1805, float:8.617E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00bf
            X.2r7 r1 = r5.A0A
            java.lang.String r0 = "profile"
            int r1 = r1.A01(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            android.view.View r1 = r5.A01
            int r0 = X.C86614Ku.A09(r0)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfileInfoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        C71273bq r1 = new C71273bq((Object) this, 7);
        if (C107275b2.A00) {
            A76(r1);
        } else {
            r1.run();
        }
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r4 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r4, this, AnonymousClass4SG.A2t(r1, r4, this));
            this.A09 = (C54042o5) r1.ANE.get();
            C88744aj r3 = C88744aj.A00;
            this.A08 = r3;
            this.A0J = C64333Db.A4H(r1);
            this.A0L = (C55862r2) r1.A1T.get();
            this.A0E = C86614Ku.A0R(r1);
            this.A0R = (C46132b8) r4.A9v.get();
            this.A07 = r3;
            this.A0F = C86614Ku.A0S(r1);
            this.A0K = C86614Ku.A0d(r1);
            this.A0M = C86634Kw.A0o(r1);
            this.A0G = C86624Kv.A0P(r1);
            this.A0S = (C54482on) r4.A7A.get();
            this.A0C = A2X.ABQ();
            this.A0D = A2X.ABT();
            this.A0H = (C55262q4) r1.A5q.get();
            this.A0A = (C55912r7) r1.ARR.get();
        }
    }

    public boolean A64() {
        return true;
    }

    public final void A74() {
        if (this.A0D.A02()) {
            if (this.A05 == null) {
                this.A05 = (FrameLayout) C86664Kz.A0o(this, R.id.banner_stub).inflate();
            }
            AnonymousClass5P5 r2 = this.A0C;
            r2.A00 = null;
            r2.A00(new C1238469z(this, 3));
        }
    }

    public final void A76(Runnable runnable) {
        if (this.A02 == null || (!AnonymousClass4SG.A45(this) && C86634Kw.A1b(this.A0D))) {
            runnable.run();
        } else {
            C86634Kw.A0P(this.A02.animate(), 0.0f).setDuration(125).setListener(new AnonymousClass67I(this, runnable));
        }
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BRm(int i, String str) {
        if (i == 0 && str.length() != 0) {
            this.A04.BkM(new C71373c0(0, str, this));
            this.A0N.setSubText(str);
            this.A0S.A03(2, 2);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean A0X;
        if (C107275b2.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(200);
            changeBounds.setInterpolator(new AnonymousClass088());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.setDuration(220);
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.setDuration(240);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
        if (!this.A0K.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0N(true);
            }
            AnonymousClass1RR A2c = AnonymousClass4SG.A2c(this);
            this.A0I = A2c;
            if (A2c == null) {
                Log.i("profileinfo/create/no-me");
                startActivity(C627736r.A03(this));
            } else {
                this.A0N = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_name_card);
                this.A0O = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_username_card);
                this.A04 = findViewById(R.id.profile_info_username_card_divider);
                this.A0N.setSubText(AnonymousClass4SG.A2u(this));
                if (AnonymousClass4SG.A45(this)) {
                    A0X = C18280x3.A1W(this.A0H.A01(), "username_creation_supported_on_primary");
                } else {
                    A0X = this.A0D.A0X(4745);
                }
                if (A0X) {
                    this.A0O.setVisibility(0);
                    this.A0O.setText(getString(R.string.f11nameremoved));
                    this.A0O.setDescription(getString(R.string.f11nameremoved));
                    this.A0O.setPrimaryIcon(R.drawable.vec_ic_at_symbol);
                    this.A04.setVisibility(0);
                    AnonymousClass6C6.A01(this, ((UsernameViewModel) AnonymousClass0x9.A0H(this).A01(UsernameViewModel.class)).A0D(), 274);
                }
                C633939b.A00(this.A0N, this, 30);
                ImageView A0M2 = C86654Ky.A0M(this, R.id.photo_btn);
                this.A06 = A0M2;
                C633939b.A00(A0M2, this, 31);
                View findViewById = findViewById(R.id.change_photo_btn);
                this.A02 = findViewById;
                C633939b.A00(findViewById, this, 32);
                if (bundle == null && (AnonymousClass4SG.A45(this) || !C86634Kw.A1b(this.A0D))) {
                    Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
                    getWindow().setSharedElementExitTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReenterTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReturnTransition(sharedElementEnterTransition.clone());
                    this.A02.setScaleX(0.0f);
                    this.A02.setScaleY(0.0f);
                    this.A02.setVisibility(0);
                    getWindow().getSharedElementEnterTransition().addListener(new C1232967w(this, 2));
                    getWindow().getSharedElementExitTransition().addListener(new C1232967w(this, 3));
                    getWindow().getSharedElementReenterTransition().addListener(new C1232967w(this, 4));
                }
                this.A03 = findViewById(R.id.change_photo_progress);
                A75();
                ProfileSettingsRowIconText profileSettingsRowIconText = (ProfileSettingsRowIconText) findViewById(R.id.profile_phone_info);
                profileSettingsRowIconText.A00.setTextDirection(3);
                profileSettingsRowIconText.setSubText(AnonymousClass36P.A02(this.A0I));
                if (!AnonymousClass4SG.A45(this)) {
                    C989653x.A00(profileSettingsRowIconText, this, 22);
                }
                this.A0P = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_status_card);
                boolean A0X2 = this.A0D.A0X(4921);
                ProfileSettingsRowIconText profileSettingsRowIconText2 = this.A0P;
                if (A0X2) {
                    profileSettingsRowIconText2.setVisibility(8);
                } else {
                    C989653x.A00(profileSettingsRowIconText2, this, 23);
                    this.A0P.setSubText(this.A09.A00());
                }
                this.A0F.A06(this.A0W);
                if ("android.intent.action.ATTACH_DATA".equals(getIntent().getAction())) {
                    setTitle(R.string.f11nameremoved);
                    this.A0M.A05(getIntent(), this, 13);
                } else {
                    setTitle(R.string.f11nameremoved);
                }
                this.A0L.A01(4);
                this.A01 = findViewById(R.id.alt_profile_view);
                if (!this.A0D.A0X(6149) || this.A0A.A01("profile") == 0) {
                    this.A01.setVisibility(8);
                } else {
                    SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) findViewById(R.id.alt_profile_row);
                    this.A0Q = settingsRowPhotoOrInitialText;
                    settingsRowPhotoOrInitialText.setName(AnonymousClass4SG.A2u(this));
                    this.A01.setVisibility(0);
                }
                A74();
                AnonymousClass4SG.A3d(this);
                return;
            }
        }
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0D.A0X(6149)) {
            return false;
        }
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return true;
    }

    public ProfileInfoActivity(int i) {
        this.A0V = false;
        AnonymousClass68W.A00(this, 74);
    }

    public void BNi(String str) {
        Boo(PushnameEmojiBlacklistDialogFragment.A00(str));
    }

    public /* synthetic */ void BOP(int i) {
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0L.A00(4);
        this.A0F.A07(this.A0W);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A0T);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            startActivityForResult(C18320x8.A07().setClassName(this, "com.whatsapp.profile.ProfilePhotoPrivacyActivity"), 15);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (C107275b2.A00) {
                A76(new C71273bq((Object) this, 9));
                return true;
            }
            finish();
            return true;
        }
    }

    public int A5t() {
        return 78318969;
    }

    public ProfileInfoActivity() {
        this(0);
        this.A0W = AnonymousClass681.A00(this, 32);
    }
}
