package com.whatsapp.registration.profilecheckpoint;

import X.AnonymousClass0x2;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass317;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4SG;
import X.AnonymousClass52T;
import X.AnonymousClass5IY;
import X.AnonymousClass5S9;
import X.AnonymousClass5UX;
import X.AnonymousClass5XU;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZR;
import X.AnonymousClass68W;
import X.AnonymousClass694;
import X.C005205m;
import X.C105895Wv;
import X.C107405bG;
import X.C107555bV;
import X.C107695bk;
import X.C109095e4;
import X.C162457s7;
import X.C181568my;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C27821ej;
import X.C30191m3;
import X.C44772Xk;
import X.C50152hi;
import X.C55092pm;
import X.C55682qk;
import X.C56332ro;
import X.C56502s5;
import X.C60152y5;
import X.C614930z;
import X.C619933b;
import X.C620633i;
import X.C620733j;
import X.C621533t;
import X.C64333Db;
import X.C66523Lt;
import X.C71543cH;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C88834as;
import X.C89224c7;
import X.C89644eZ;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.registration.RegistrationScrollView;
import com.whatsapp.util.Log;

public final class RequestName extends C89644eZ {
    public ImageView A00;
    public AnonymousClass5XU A01;
    public WaEditText A02;
    public C614930z A03;
    public C44772Xk A04;
    public AnonymousClass5UX A05;
    public C56332ro A06;
    public AnonymousClass5ZR A07;
    public C89224c7 A08;
    public AnonymousClass5IY A09;
    public C27821ej A0A;
    public EmojiSearchProvider A0B;
    public AnonymousClass1VW A0C;
    public C66523Lt A0D;
    public C619933b A0E;
    public C60152y5 A0F;
    public C30191m3 A0G;
    public C50152hi A0H;
    public AnonymousClass317 A0I;
    public RegistrationScrollView A0J;
    public C55092pm A0K;
    public C56502s5 A0L;
    public boolean A0M;

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            this.A01 = AnonymousClass4SG.A2d(r1);
            this.A0L = AnonymousClass4SG.A2q(r2);
            this.A0A = C86604Kt.A0X(r1);
            this.A09 = C107695bk.A1m(r2);
            this.A05 = C86614Ku.A0R(r1);
            this.A0D = AnonymousClass4SG.A2n(r1);
            this.A0C = C86624Kv.A0S(r1);
            this.A03 = C86614Ku.A0O(r1);
            this.A06 = (C56332ro) r1.A6Q.get();
            this.A0H = A2W.AD3();
            this.A04 = C86614Ku.A0P(r1);
            this.A0B = C107695bk.A1n(r2);
            this.A0E = C86624Kv.A0V(r1);
            this.A0G = C86634Kw.A0o(r1);
            this.A0I = C86614Ku.A0i(r1);
            this.A07 = C64333Db.A2r(r1);
            this.A0K = AnonymousClass4SG.A2o(r1);
            this.A0F = C64333Db.A74(r1);
        }
    }

    public void onBackPressed() {
        Log.i("RequestName/onBackPressed");
        C89224c7 r0 = this.A08;
        if (r0 == null) {
            throw C18270x1.A0S("emojiPopup");
        } else if (r0.isShowing()) {
            C89224c7 r02 = this.A08;
            if (r02 == null) {
                throw C18270x1.A0S("emojiPopup");
            }
            r02.dismiss();
        } else {
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        C620733j r3 = this.A00;
        View view = this.A00;
        C614930z r0 = this.A03;
        if (r0 != null) {
            AnonymousClass36l.A0K(view, this, r3, R.id.title_toolbar, false, false, r0.A0B(false));
            C107405bG.A05(this);
            WaTextView waTextView = (WaTextView) C18290x4.A0L(this, R.id.title);
            waTextView.setText(R.string.f11nameremoved);
            ((TextView) C18290x4.A0L(this, R.id.biz_info_description)).setText(R.string.f11nameremoved);
            AnonymousClass1VW r02 = this.A0C;
            if (r02 != null) {
                AnonymousClass36l.A0M(this, r02, R.id.title);
                RegistrationScrollView registrationScrollView = (RegistrationScrollView) findViewById(R.id.reg_scroll_view);
                this.A0J = registrationScrollView;
                if (registrationScrollView != null) {
                    registrationScrollView.setTopAndBottomScrollingElevation((LinearLayout) findViewById(R.id.accept_button_and_shortcut_layout), waTextView, findViewById(R.id.title_bottom_shadow), findViewById(R.id.accept_button_top_shadow));
                }
                WaEditText waEditText = (WaEditText) C18290x4.A0N(this, R.id.registration_name);
                this.A02 = waEditText;
                C620733j r03 = this.A00;
                if (waEditText == null) {
                    throw C18270x1.A0S("registrationName");
                }
                C107555bV.A09(waEditText, r03);
                WaEditText waEditText2 = this.A02;
                if (waEditText2 == null) {
                    throw C18270x1.A0S("registrationName");
                }
                AnonymousClass5Y0 r9 = this.A0C;
                C620633i r8 = this.A08;
                C620733j r7 = this.A00;
                C60152y5 r6 = this.A0F;
                if (r6 != null) {
                    WaEditText waEditText3 = waEditText2;
                    C620633i r20 = r8;
                    waEditText2.addTextChangedListener(new AnonymousClass52T(waEditText3, C005205m.A01(this, R.id.name_counter_tv), r20, r7, this.A0B, r9, r6, 25, 0, false, false, false));
                    WaEditText waEditText4 = this.A02;
                    if (waEditText4 == null) {
                        throw C18270x1.A0S("registrationName");
                    }
                    C109095e4.A00(waEditText4, new InputFilter[1], 25);
                    WaEditText waEditText5 = this.A02;
                    if (waEditText5 == null) {
                        throw C18270x1.A0S("registrationName");
                    }
                    waEditText5.A07(false);
                    ImageView imageView = (ImageView) C18290x4.A0N(this, R.id.change_photo_btn);
                    this.A00 = imageView;
                    if (imageView == null) {
                        throw C18270x1.A0S("changePhotoButton");
                    }
                    C18300x5.A13(this, imageView, R.string.f11nameremoved);
                    ImageView imageView2 = this.A00;
                    if (imageView2 == null) {
                        throw C18270x1.A0S("changePhotoButton");
                    }
                    AnonymousClass0x2.A10(imageView2, this, 25);
                    ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_btn);
                    if (imageButton != null) {
                        AnonymousClass694 r92 = new AnonymousClass694(this, 12);
                        AnonymousClass1VX r18 = this.A0D;
                        C105895Wv r17 = this.A0B;
                        C55682qk r15 = this.A03;
                        AnonymousClass5Y0 r14 = this.A0C;
                        C27821ej r12 = this.A0A;
                        if (r12 != null) {
                            C620633i r11 = this.A08;
                            C620733j r10 = this.A00;
                            AnonymousClass5IY r82 = this.A09;
                            if (r82 != null) {
                                EmojiSearchProvider emojiSearchProvider = this.A0B;
                                if (emojiSearchProvider != null) {
                                    AnonymousClass33p r62 = this.A09;
                                    C60152y5 r5 = this.A0F;
                                    if (r5 != null) {
                                        C181568my r32 = (C181568my) findViewById(R.id.main);
                                        WaEditText waEditText6 = this.A02;
                                        if (waEditText6 == null) {
                                            throw C18270x1.A0S("registrationName");
                                        }
                                        C105895Wv r26 = r17;
                                        C27821ej r21 = r12;
                                        AnonymousClass5Y0 r22 = r14;
                                        C620633i r172 = r11;
                                        AnonymousClass33p r182 = r62;
                                        C620733j r19 = r10;
                                        C55682qk r142 = r15;
                                        C181568my r152 = r32;
                                        WaEditText waEditText7 = waEditText6;
                                        C89224c7 r112 = new C89224c7(this, imageButton, r142, r152, waEditText7, r172, r182, r19, r82, r21, r22, emojiSearchProvider, r18, r5, r26);
                                        this.A08 = r112;
                                        r112.A0C(r92);
                                        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) findViewById(R.id.emoji_search_container);
                                        C89224c7 r72 = this.A08;
                                        if (r72 == null) {
                                            throw C18270x1.A0S("emojiPopup");
                                        }
                                        AnonymousClass5Y0 r52 = this.A0C;
                                        C27821ej r33 = this.A0A;
                                        if (r33 != null) {
                                            C620733j r1 = this.A00;
                                            C60152y5 r04 = this.A0F;
                                            if (r04 != null) {
                                                C620733j r122 = r1;
                                                AnonymousClass5S9 r102 = new AnonymousClass5S9(this, r122, r72, r33, r52, emojiSearchContainer, r04);
                                                AnonymousClass5S9.A00(r102, r92, 8);
                                                C89224c7 r34 = this.A08;
                                                if (r34 == null) {
                                                    throw C18270x1.A0S("emojiPopup");
                                                }
                                                r34.A0E = new C71543cH((Object) r102, 47);
                                            } else {
                                                throw C18270x1.A0S("sharedPreferencesFactory");
                                            }
                                        } else {
                                            throw C18270x1.A0S("recentEmojis");
                                        }
                                    } else {
                                        throw C18270x1.A0S("sharedPreferencesFactory");
                                    }
                                } else {
                                    throw C18270x1.A0S("emojiSearchProvider");
                                }
                            } else {
                                throw C18270x1.A0S("emojiTrayLogger");
                            }
                        } else {
                            throw C18270x1.A0S("recentEmojis");
                        }
                    }
                    C86644Kx.A0k(this, R.id.shortcut_layout);
                    View A002 = C005205m.A00(this, R.id.cbx_app_shortcut);
                    C162457s7.A0K(A002, "null cannot be cast to non-null type android.widget.CheckBox");
                    ((CompoundButton) A002).setChecked(false);
                    AnonymousClass5XU r05 = this.A01;
                    if (r05 != null) {
                        if (r05.A03()) {
                            Log.w("RequestName/clock-wrong");
                            C66523Lt r13 = this.A0D;
                            if (r13 != null) {
                                C619933b r06 = this.A0E;
                                if (r06 != null) {
                                    C621533t.A02(this, r13, r06);
                                } else {
                                    throw C18270x1.A0S("messageNotification");
                                }
                            } else {
                                throw C18270x1.A0S("messageHandler");
                            }
                        } else {
                            AnonymousClass5XU r07 = this.A01;
                            if (r07 == null) {
                                throw C18270x1.A0S("roadblocks");
                            } else if (r07.A02()) {
                                Log.w("RequestName/sw-expired");
                                C66523Lt r16 = this.A0D;
                                if (r16 != null) {
                                    C619933b r08 = this.A0E;
                                    if (r08 != null) {
                                        C621533t.A03(this, r16, r08);
                                    } else {
                                        throw C18270x1.A0S("messageNotification");
                                    }
                                } else {
                                    throw C18270x1.A0S("messageHandler");
                                }
                            }
                        }
                        AnonymousClass5ZR r09 = this.A07;
                        if (r09 != null) {
                            char c = 0;
                            if (r09.A08()) {
                                AnonymousClass5ZR r010 = this.A07;
                                if (r010 != null) {
                                    int i4 = AnonymousClass0x2.A0F(r010.A01).getInt("reg_skip_storage_perm", 0);
                                    i = R.string.f11nameremoved;
                                    if (i4 == 2) {
                                        i = R.string.f11nameremoved;
                                    }
                                    i2 = R.string.f11nameremoved;
                                    iArr = new int[1];
                                    i3 = R.drawable.permission_contacts_small;
                                } else {
                                    throw C18270x1.A0S("waPermissionsHelper");
                                }
                            } else {
                                i = R.string.f11nameremoved;
                                i2 = R.string.f11nameremoved;
                                iArr = new int[3];
                                iArr[0] = R.drawable.permission_contacts_small;
                                iArr[1] = R.drawable.permission_plus;
                                c = 2;
                                i3 = R.drawable.permission_storage;
                            }
                            iArr[c] = i3;
                            AnonymousClass5ZR r011 = this.A07;
                            if (r011 != null) {
                                boolean A0H2 = r011.A0H();
                                C44772Xk r012 = this.A04;
                                if (r012 != null) {
                                    RequestPermissionActivity.A0o(this, "connect_with_friends", iArr, 0, i, i2, R.string.f11nameremoved, A0H2, !r012.A00());
                                    AnonymousClass0x2.A10(C005205m.A00(this, R.id.register_name_accept), this, 24);
                                    return;
                                }
                                throw C18270x1.A0S("contactAccessHelper");
                            }
                            throw C18270x1.A0S("waPermissionsHelper");
                        }
                        throw C18270x1.A0S("waPermissionsHelper");
                    }
                    throw C18270x1.A0S("roadblocks");
                }
                throw C18270x1.A0S("sharedPreferencesFactory");
            }
            throw C18270x1.A0S("abPreChatdProps");
        }
        throw C18270x1.A0S("accountSwitcher");
    }

    public void onDestroy() {
        C50152hi r0 = this.A0H;
        if (r0 != null) {
            r0.A00();
            RegistrationScrollView registrationScrollView = this.A0J;
            if (registrationScrollView != null) {
                registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A09);
                if (registrationScrollView.A02 != null) {
                    registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A02);
                }
            }
            this.A0J = null;
            super.onDestroy();
            return;
        }
        throw C18270x1.A0S("registrationHelper");
    }

    public RequestName(int i) {
        this.A0M = false;
        AnonymousClass68W.A00(this, 90);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RequestName/activity-result request:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " result:"
            X.C18260x0.A0y(r0, r1, r7)
            r0 = 12
            if (r6 == r0) goto L_0x0031
            r0 = 13
            if (r6 == r0) goto L_0x001d
            super.onActivityResult(r6, r7, r8)
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = "RequestName/handleContactPhotoCropped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            if (r7 == r0) goto L_0x0065
            if (r7 != 0) goto L_0x001c
            if (r8 == 0) goto L_0x001c
            X.1m3 r0 = r5.A0G
            if (r0 == 0) goto L_0x00a9
            r0.A04(r8, r5)
            return
        L_0x0031:
            java.lang.String r0 = "RequestName/handleContactPhotoPicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = -1
            if (r7 != r3) goto L_0x001c
            java.lang.String r2 = "profile_photo"
            r1 = 0
            if (r8 == 0) goto L_0x012d
            java.lang.String r0 = "is_reset"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0098
            X.2s5 r1 = r5.A0L
            if (r1 == 0) goto L_0x0114
            java.lang.String r0 = "did_not_set"
            r1.A04(r2, r0)
            X.1m3 r0 = r5.A0G
            if (r0 == 0) goto L_0x010d
            X.AnonymousClass4SG.A3m(r0)
            X.2ro r0 = r5.A06
            if (r0 == 0) goto L_0x0106
            X.3Dh r1 = r0.A00
            java.lang.String r0 = "tmpp"
            java.io.File r0 = r1.A0S(r0)
        L_0x0062:
            r0.delete()
        L_0x0065:
            java.lang.String r0 = "RequestName/updatePhoto"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168010(0x7f070b0a, float:1.795031E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168008(0x7f070b08, float:1.7950306E38)
            float r3 = r1.getDimension(r0)
            X.2ro r0 = r5.A06
            if (r0 == 0) goto L_0x00ff
            X.3Dh r1 = r0.A00
            java.lang.String r0 = "tmpp"
            java.io.File r2 = r1.A0S(r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "RequestName/updatePhoto/photo-file-exists"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00b0
        L_0x0098:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0122
            X.1m3 r0 = r5.A0G
            if (r0 == 0) goto L_0x011b
            java.io.File r0 = r0.A02()
            goto L_0x0062
        L_0x00a9:
            java.lang.String r0 = "profilePhotoUpdater"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b0:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00c9, IOException -> 0x00d9 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00c9, IOException -> 0x00d9 }
            android.graphics.Bitmap r1 = X.C114015mM.A01(r0, r3, r4)     // Catch:{ all -> 0x00bf }
            r0.close()     // Catch:{ FileNotFoundException -> 0x00c9, IOException -> 0x00d9 }
            if (r1 == 0) goto L_0x00d9
            goto L_0x00e9
        L_0x00bf:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00c9, IOException -> 0x00d9 }
        L_0x00c8:
            throw r1     // Catch:{ FileNotFoundException -> 0x00c9, IOException -> 0x00d9 }
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wacontact/getRoundRectBitmap/error opening stream/"
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            X.C18260x0.A1K(r1, r0)
        L_0x00d9:
            java.lang.String r0 = "RequestName/updatePhoto/creating-avatar-bitmap"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5UX r1 = r5.A05
            if (r1 == 0) goto L_0x00f8
            r0 = 2131232550(0x7f080726, float:1.8081212E38)
            android.graphics.Bitmap r1 = r1.A02(r5, r3, r0, r4)
        L_0x00e9:
            android.widget.ImageView r0 = r5.A00
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "changePhotoButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f4:
            r0.setImageBitmap(r1)
            return
        L_0x00f8:
            java.lang.String r0 = "contactAvatars"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ff:
            java.lang.String r0 = "contactPhotoHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0106:
            java.lang.String r0 = "contactPhotoHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x010d:
            java.lang.String r0 = "profilePhotoUpdater"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0114:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011b:
            java.lang.String r0 = "profilePhotoUpdater"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0122:
            java.lang.String r1 = "photo_source"
            boolean r0 = r8.hasExtra(r1)
            if (r0 == 0) goto L_0x012d
            r8.getIntExtra(r1, r3)
        L_0x012d:
            X.2s5 r1 = r5.A0L
            if (r1 == 0) goto L_0x0147
            java.lang.String r0 = "set_photo"
            r1.A04(r2, r0)
            X.1m3 r1 = r5.A0G
            if (r1 == 0) goto L_0x0140
            r0 = 13
            r1.A05(r8, r5, r0)
            return
        L_0x0140:
            java.lang.String r0 = "profilePhotoUpdater"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0147:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.profilecheckpoint.RequestName.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 0) {
            C55092pm r1 = this.A0K;
            if (r1 != null) {
                r1.A02("register-name");
                C50152hi r2 = this.A0H;
                if (r2 != null) {
                    C55092pm r12 = this.A0K;
                    if (r12 != null) {
                        r2.A01(this, r12, "request-name");
                        return true;
                    }
                    throw C18270x1.A0S("verificationFlowState");
                }
                throw C18270x1.A0S("registrationHelper");
            }
            throw C18270x1.A0S("verificationFlowState");
        } else if (A042 != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass317 r0 = this.A0I;
            if (r0 != null) {
                r0.A09();
                AnonymousClass4SG.A35(this);
                return true;
            }
            throw C18270x1.A0S("registrationManager");
        }
    }

    public RequestName() {
        this(0);
    }
}
