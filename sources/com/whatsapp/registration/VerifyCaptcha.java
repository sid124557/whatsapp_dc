package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass317;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.AnonymousClass644;
import X.AnonymousClass68W;
import X.AnonymousClass6AO;
import X.C107405bG;
import X.C107695bk;
import X.C108565dC;
import X.C108935do;
import X.C1235268t;
import X.C153017aX;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C184578sA;
import X.C185138t9;
import X.C19340zH;
import X.C386328l;
import X.C50102hd;
import X.C50152hi;
import X.C53202mi;
import X.C54292oU;
import X.C55092pm;
import X.C56912sl;
import X.C614930z;
import X.C620633i;
import X.C620733j;
import X.C621433s;
import X.C627736r;
import X.C64333Db;
import X.C69263Wi;
import X.C71543cH;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import X.C97694z5;
import X.C994055p;
import X.C998958p;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.io.FileOutputStream;

public final class VerifyCaptcha extends C89644eZ implements C185138t9, C184578sA, AnonymousClass644 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AudioManager A07;
    public MediaPlayer A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ProgressBar A0B;
    public ProgressBar A0C;
    public CodeInputField A0D;
    public AnonymousClass5WY A0E;
    public WaImageButton A0F;
    public WaImageButton A0G;
    public WaImageView A0H;
    public C614930z A0I;
    public C54292oU A0J;
    public AnonymousClass5ZR A0K;
    public C50102hd A0L;
    public AnonymousClass1VW A0M;
    public C53202mi A0N;
    public C108565dC A0O;
    public C50152hi A0P;
    public C56912sl A0Q;
    public AnonymousClass317 A0R;
    public C55092pm A0S;
    public C153017aX A0T;
    public WDSButton A0U;
    public File A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;

    public static final void A0C(VerifyCaptcha verifyCaptcha, String str) {
        File file = verifyCaptcha.A0V;
        if (file == null || !file.exists()) {
            C86644Kx.A1Q(verifyCaptcha.A04, verifyCaptcha, 5);
        }
        byte[] decode = Base64.decode(str, 0);
        File file2 = verifyCaptcha.A0V;
        if (file2 == null) {
            throw C18270x1.A0S("captchaAudioFile");
        }
        FileOutputStream A0h = AnonymousClass0x9.A0h(file2);
        A0h.write(decode);
        A0h.close();
        MediaPlayer mediaPlayer = verifyCaptcha.A08;
        if (mediaPlayer != null) {
            try {
                Log.d("VerifyCaptcha/decodeAudio/mediaPlayer/prepare");
                mediaPlayer.reset();
                Context context = verifyCaptcha.A74().A00;
                File file3 = verifyCaptcha.A0V;
                if (file3 == null) {
                    throw C18270x1.A0S("captchaAudioFile");
                }
                mediaPlayer.setDataSource(context, Uri.fromFile(file3));
                mediaPlayer.prepare();
            } catch (Exception e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "VerifyCaptcha/decodeAudio/mediaPlayer ex: ", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r6.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A7B(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r4 = 0
            r2 = 1
            if (r6 == 0) goto L_0x000b
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            java.lang.String r3 = "captcha_bad_image_blob_response"
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/bad image blob response"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 7
            X.C621433s.A01(r5, r0)
            X.33p r0 = r5.A09
            r0.A1Q(r3)
            return r4
        L_0x001f:
            byte[] r1 = android.util.Base64.decode(r6, r4)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            int r0 = r1.length     // Catch:{ IllegalArgumentException -> 0x00c2 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r1 == 0) goto L_0x0035
            com.whatsapp.WaImageView r0 = r5.A0H     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "captchaImage"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
        L_0x0034:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c2 }
        L_0x0035:
            java.lang.String r0 = "bMap is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            goto L_0x0034
        L_0x003c:
            r0.setImageBitmap(r1)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r7 == 0) goto L_0x00a7
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00a7
            X.4FS r3 = r5.A04     // Catch:{ FileNotFoundException -> 0x008b }
            r1 = 6
            X.3c0 r0 = new X.3c0     // Catch:{ FileNotFoundException -> 0x008b }
            r0.<init>(r1, r7, r5)     // Catch:{ FileNotFoundException -> 0x008b }
            r3.BkM(r0)     // Catch:{ FileNotFoundException -> 0x008b }
            com.whatsapp.WaImageButton r0 = r5.A0F
            java.lang.String r3 = "captchaAudioBtn"
            if (r0 != 0) goto L_0x005d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x005d:
            r0.setVisibility(r4)
            com.whatsapp.WaImageButton r1 = r5.A0F
            if (r1 != 0) goto L_0x0069
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0069:
            r0 = 2131233573(0x7f080b25, float:1.8083287E38)
            X.C86614Ku.A11(r5, r1, r0)
            com.whatsapp.WaImageButton r1 = r5.A0F
            if (r1 != 0) goto L_0x0078
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0078:
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            X.C86634Kw.A14(r5, r1, r0)
            com.whatsapp.WaImageButton r0 = r5.A0F
            if (r0 != 0) goto L_0x0087
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0087:
            r0.setEnabled(r2)
            return r2
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudio/FileNotFoundException"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.WaImageButton r1 = r5.A0F
            if (r1 != 0) goto L_0x009c
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x009c:
            r0 = 8
            r1.setVisibility(r0)
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/failed to setup captcha audio"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x00a7:
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/bad audio blob response"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.WaImageButton r1 = r5.A0F
            if (r1 != 0) goto L_0x00b7
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b7:
            r0 = 8
            r1.setVisibility(r0)
            X.33p r0 = r5.A09
            r0.A1Q(r3)
            return r2
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaImage/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.WaImageButton r1 = r5.A0F
            if (r1 != 0) goto L_0x00d3
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d3:
            r0 = 8
            r1.setVisibility(r0)
            X.C621433s.A01(r5, r0)
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/failed to setup captcha image"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyCaptcha.A7B(java.lang.String, java.lang.String):boolean");
    }

    public void BPK(C998958p r6, C108935do r7, String str) {
        String str2;
        C18260x0.A1P(C18280x3.A0g(r6, 1), "VerifyCaptcha/onCodeEntrypointResponse/status=", r6);
        int ordinal = r6.ordinal();
        if (ordinal != 7) {
            int i = 8;
            if (ordinal != 9) {
                if (ordinal == 3) {
                    C69263Wi r0 = this.A05;
                    C162457s7.A0C(r0);
                    C386328l.A00(r0);
                    this.A09.A1Q("captcha_request_failed");
                    return;
                } else if (ordinal == 6 || ordinal == 19) {
                    i = 7;
                } else {
                    String str3 = null;
                    if (r7 != null) {
                        str2 = r7.A0G;
                        str3 = r7.A0A;
                    } else {
                        str2 = null;
                    }
                    A7B(str2, str3);
                    return;
                }
            }
            C621433s.A01(this, i);
            this.A09.A1Q("captcha_request_failed");
            return;
        }
        C621433s.A01(this, 5);
        this.A09.A1Q("captcha_too_many_guesses_failed");
    }

    public void Bpy() {
        A7A(true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C107405bG.A05(this);
        setContentView((int) R.layout.f8nameremoved);
        C86644Kx.A1Q(this.A04, this, 5);
        this.A0C = (ProgressBar) C18280x3.A0E(this.A00, R.id.progress_bar_code_input_blocked);
        this.A0H = C18280x3.A0J(this.A00, R.id.captcha_image);
        this.A0D = (CodeInputField) C18280x3.A0E(this.A00, R.id.captcha_code_input);
        this.A0F = (WaImageButton) C18280x3.A0E(this.A00, R.id.captcha_audio_btn);
        this.A0G = (WaImageButton) C18280x3.A0E(this.A00, R.id.captcha_refresh_btn);
        this.A0A = (ViewStub) C18280x3.A0E(this.A00, R.id.captcha_warning_view_stub);
        this.A0U = C86614Ku.A0p(this.A00, R.id.captcha_submit);
        this.A0B = (ProgressBar) C18280x3.A0E(this.A00, R.id.captcha_progress_bar);
        this.A09 = (ViewStub) C18280x3.A0E(this.A00, R.id.captcha_error_description_view_stub);
        AnonymousClass1VW r0 = this.A0M;
        if (r0 != null) {
            AnonymousClass36l.A0M(this, r0, R.id.captcha_title_toolbar_text);
            CodeInputField codeInputField = this.A0D;
            if (codeInputField == null) {
                throw C18270x1.A0S("codeInputField");
            }
            codeInputField.A0A(new AnonymousClass6AO(this, 1), 3);
            if (!AnonymousClass36l.A0P(getResources())) {
                CodeInputField codeInputField2 = this.A0D;
                if (codeInputField2 == null) {
                    throw C18270x1.A0S("codeInputField");
                }
                codeInputField2.A07(false);
            }
            WaImageButton waImageButton = this.A0G;
            if (waImageButton == null) {
                throw C18270x1.A0S("captchaRefreshBtn");
            }
            AnonymousClass0x2.A0y(waImageButton, this, 40);
            WDSButton wDSButton = this.A0U;
            if (wDSButton == null) {
                throw C18270x1.A0S("captchaSubmitButton");
            }
            AnonymousClass0x2.A0y(wDSButton, this, 43);
            this.A07 = this.A08.A0G();
            WaImageButton waImageButton2 = this.A0F;
            if (waImageButton2 == null) {
                throw C18270x1.A0S("captchaAudioBtn");
            }
            AnonymousClass0x2.A0y(waImageButton2, this, 41);
            ProgressBar progressBar = this.A0C;
            if (progressBar == null) {
                throw C18270x1.A0S("progressBar");
            }
            progressBar.setProgress(100);
            WaImageView waImageView = this.A0H;
            if (waImageView == null) {
                throw C18270x1.A0S("captchaImage");
            }
            waImageView.setClipToOutline(true);
            if (C86614Ku.A0D(this) != null) {
                boolean booleanExtra = getIntent().getBooleanExtra("change_number", false);
                this.A0Y = booleanExtra;
                C18260x0.A1D("VerifyCaptcha/onCreate/changeNumber: ", AnonymousClass001.A0o(), booleanExtra);
            }
            C620733j r6 = this.A00;
            View view = this.A00;
            C614930z r1 = this.A0I;
            if (r1 != null) {
                AnonymousClass36l.A0K(view, this, r6, R.id.captcha_title_toolbar, false, true, r1.A0B(this.A0Y));
                String A0Z2 = this.A09.A0Z();
                C162457s7.A0D(A0Z2);
                this.A0W = A0Z2;
                String A0b = this.A09.A0b();
                C162457s7.A0D(A0b);
                this.A0X = A0b;
                String str = this.A0W;
                if (str == null) {
                    throw C18270x1.A0S("countryCode");
                } else if (str.length() == 0 || A0b.length() == 0) {
                    Log.w("VerifyCaptcha/create/cc or num is missing, bounce to regphone");
                    A78();
                } else {
                    this.A09.A1Q("captcha_entered");
                    String str2 = this.A0W;
                    if (str2 == null) {
                        throw C18270x1.A0S("countryCode");
                    }
                    String str3 = this.A0X;
                    if (str3 == null) {
                        throw C18270x1.A0S("phoneNumber");
                    }
                    A79(AnonymousClass4SG.A2p(this), str2, str3);
                }
            } else {
                throw C18270x1.A0S("accountSwitcher");
            }
        } else {
            throw C18270x1.A0S("abPreChatdProps");
        }
    }

    public void A5r() {
        if (!this.A0Z) {
            this.A0Z = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            this.A0J = C64333Db.A2q(r1);
            this.A0E = (AnonymousClass5WY) r1.AUS.get();
            this.A0M = C86624Kv.A0S(r1);
            this.A0T = (C153017aX) r2.A0h.get();
            this.A0I = C86614Ku.A0O(r1);
            this.A0P = A2W.AD3();
            this.A0N = C86654Ky.A0Z(r1);
            this.A0L = (C50102hd) r2.A50.get();
            this.A0R = C86614Ku.A0i(r1);
            this.A0K = C64333Db.A2r(r1);
            this.A0S = AnonymousClass4SG.A2o(r1);
            this.A0Q = (C56912sl) r1.ATe.get();
        }
    }

    public final C54292oU A74() {
        C54292oU r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public final void A75() {
        File file = this.A0V;
        if (file != null) {
            file.delete();
        }
        WaImageButton waImageButton = this.A0F;
        if (waImageButton == null) {
            throw C18270x1.A0S("captchaAudioBtn");
        }
        C86614Ku.A11(this, waImageButton, R.color.f5nameremoved);
        WaImageButton waImageButton2 = this.A0F;
        if (waImageButton2 == null) {
            throw C18270x1.A0S("captchaAudioBtn");
        }
        C86634Kw.A14(this, waImageButton2, R.color.f5nameremoved);
        WaImageButton waImageButton3 = this.A0F;
        if (waImageButton3 == null) {
            throw C18270x1.A0S("captchaAudioBtn");
        }
        waImageButton3.setEnabled(false);
    }

    public final void A76() {
        ProgressBar progressBar = this.A0C;
        if (progressBar == null) {
            throw C18270x1.A0S("progressBar");
        }
        progressBar.setEnabled(false);
        CodeInputField codeInputField = this.A0D;
        if (codeInputField == null) {
            throw C18270x1.A0S("codeInputField");
        }
        codeInputField.setEnabled(false);
        WDSButton wDSButton = this.A0U;
        if (wDSButton == null) {
            throw C18270x1.A0S("captchaSubmitButton");
        }
        wDSButton.setEnabled(false);
    }

    public final void A77() {
        CodeInputField codeInputField = this.A0D;
        if (codeInputField == null) {
            throw C18270x1.A0S("codeInputField");
        }
        codeInputField.setCode("");
        WDSButton wDSButton = this.A0U;
        if (wDSButton == null) {
            throw C18270x1.A0S("captchaSubmitButton");
        }
        wDSButton.setEnabled(false);
    }

    public final void A78() {
        Intent A042;
        Log.d("VerifyCaptcha/returnToCallingScreen");
        boolean z = this.A0Y;
        AnonymousClass317 r2 = this.A0R;
        if (r2 != null) {
            if (z) {
                r2.A0B(3, true);
                AnonymousClass317 r0 = this.A0R;
                if (r0 != null) {
                    if (!r0.A0F()) {
                        finish();
                    }
                    A042 = C18320x8.A07();
                    A042.setClassName(getPackageName(), "com.whatsapp.registration.ChangeNumber");
                } else {
                    throw C18270x1.A0S("registrationManager");
                }
            } else {
                r2.A0B(1, true);
                A042 = C627736r.A04(this);
                C162457s7.A0D(A042);
                A042.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
            }
            startActivity(A042);
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public final void A79(C97694z5 r22, String str, String str2) {
        AnonymousClass4FS r1 = this.A04;
        int A042 = this.A09.A04();
        int i = AnonymousClass1Hf.A27(this).getInt("pref_flash_call_manage_call_permission_granted", -1);
        int i2 = AnonymousClass1Hf.A27(this).getInt("pref_flash_call_call_log_permission_granted", -1);
        C54292oU A74 = A74();
        C620633i r3 = this.A08;
        AnonymousClass33p r5 = this.A09;
        C56912sl r6 = this.A0Q;
        if (r6 != null) {
            C153017aX r7 = this.A0T;
            if (r7 != null) {
                r1.BkL(new C994055p(r3, A74, r5, r6, r7, r22, this, str, str2, "captcha", (String) null, (String) null, (String) null, A042, i, i2, true, false), new String[0]);
                return;
            }
            throw C18270x1.A0S("autoconfManager");
        }
        throw C18270x1.A0S("registrationHttpManager");
    }

    public void BFe(boolean z, String str) {
        Log.d("VerifyCaptcha/hideRequestCodeProgressDialog/");
        ProgressBar progressBar = this.A0B;
        if (progressBar == null) {
            throw C18270x1.A0S("captchaRequestLoading");
        }
        progressBar.setVisibility(8);
    }

    public void BhU() {
        int i = this.A02;
        if (!(i == 1 || i == 3 || this.A00 == 1 || i == 4)) {
            AnonymousClass5ZR r1 = this.A0K;
            if (r1 == null) {
                throw C18270x1.A0S("waPermissionsHelper");
            } else if (r1.A02("android.permission.RECEIVE_SMS") != 0) {
                Log.i("VerifyCaptcha/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                AnonymousClass36l.A0L(this, 1);
                return;
            }
        }
        Log.i("VerifyCaptcha/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
        A7A(false);
    }

    public void BpC(boolean z, String str) {
        Log.d("VerifyCaptcha/showRequestCodeProgressDialog/");
        ProgressBar progressBar = this.A0B;
        if (progressBar == null) {
            throw C18270x1.A0S("captchaRequestLoading");
        }
        progressBar.setVisibility(0);
    }

    public void onBackPressed() {
        C614930z r1 = this.A0I;
        if (r1 == null) {
            throw C18270x1.A0S("accountSwitcher");
        } else if (r1.A0B(this.A0Y)) {
            Log.i("VerifyCaptcha/onBackPressed/is adding new account");
            C614930z r2 = this.A0I;
            if (r2 != null) {
                AnonymousClass36l.A0D(this, r2, this.A09, this.A0A);
                return;
            }
            throw C18270x1.A0S("accountSwitcher");
        } else {
            A78();
        }
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        int i4 = i;
        switch (i) {
            case 1:
                CodeInputField codeInputField = this.A0D;
                if (codeInputField != null) {
                    codeInputField.setImportantForAccessibility(2);
                    ViewStub viewStub = this.A0A;
                    if (viewStub != null) {
                        viewStub.setVisibility(8);
                        ViewStub viewStub2 = this.A09;
                        if (viewStub2 != null) {
                            viewStub2.setVisibility(8);
                            r2 = AnonymousClass5V0.A00(this);
                            r2.A0U(R.string.f11nameremoved);
                            r2.A0T(R.string.f11nameremoved);
                            i2 = R.string.f11nameremoved;
                            i3 = 103;
                            break;
                        } else {
                            throw C18270x1.A0S("captchaErrorDescription");
                        }
                    } else {
                        throw C18270x1.A0S("captchaWarningIcon");
                    }
                } else {
                    throw C18270x1.A0S("codeInputField");
                }
            case 2:
                return AnonymousClass36l.A06(this, getString(R.string.f11nameremoved));
            case 3:
                CodeInputField codeInputField2 = this.A0D;
                if (codeInputField2 != null) {
                    codeInputField2.setImportantForAccessibility(2);
                    ViewStub viewStub3 = this.A0A;
                    if (viewStub3 != null) {
                        viewStub3.setVisibility(8);
                        ViewStub viewStub4 = this.A09;
                        if (viewStub4 != null) {
                            viewStub4.setVisibility(8);
                            r2 = AnonymousClass5V0.A00(this);
                            r2.A0U(R.string.f11nameremoved);
                            i2 = R.string.f11nameremoved;
                            i3 = 104;
                            break;
                        } else {
                            throw C18270x1.A0S("captchaErrorDescription");
                        }
                    } else {
                        throw C18270x1.A0S("captchaWarningIcon");
                    }
                } else {
                    throw C18270x1.A0S("codeInputField");
                }
            case 4:
                AnonymousClass5WY r10 = this.A0E;
                if (r10 != null) {
                    C620733j r11 = this.A00;
                    C53202mi r12 = this.A0N;
                    if (r12 != null) {
                        String str = this.A0W;
                        if (str == null) {
                            throw C18270x1.A0S("countryCode");
                        }
                        String str2 = this.A0X;
                        if (str2 != null) {
                            return AnonymousClass36l.A03(this, r10, r11, r12, new C71543cH((Object) this, 4), str, str2);
                        }
                        throw C18270x1.A0S("phoneNumber");
                    }
                    throw C18270x1.A0S("supportGatingUtils");
                }
                throw C18270x1.A0S("sendFeedback");
            case 5:
                ViewStub viewStub5 = this.A09;
                if (viewStub5 != null) {
                    viewStub5.setVisibility(0);
                    A75();
                    A76();
                    r2 = AnonymousClass5V0.A00(this);
                    r2.A0U(R.string.f11nameremoved);
                    r2.A0T(R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                    i3 = 105;
                    break;
                } else {
                    throw C18270x1.A0S("captchaErrorDescription");
                }
            case 6:
                AnonymousClass5WY r112 = this.A0E;
                if (r112 != null) {
                    C620733j r122 = this.A00;
                    C53202mi r13 = this.A0N;
                    if (r13 != null) {
                        String str3 = this.A0W;
                        if (str3 == null) {
                            throw C18270x1.A0S("countryCode");
                        }
                        String str4 = this.A0X;
                        if (str4 == null) {
                            throw C18270x1.A0S("phoneNumber");
                        }
                        C71543cH r15 = new C71543cH((Object) this, 4);
                        return AnonymousClass36l.A08(this.A00, this, this.A05, r112, r122, r13, this.A0O, r15, str3, str4);
                    }
                    throw C18270x1.A0S("supportGatingUtils");
                }
                throw C18270x1.A0S("sendFeedback");
            case 7:
                ViewStub viewStub6 = this.A0A;
                if (viewStub6 != null) {
                    viewStub6.setVisibility(0);
                    ViewStub viewStub7 = this.A09;
                    if (viewStub7 != null) {
                        viewStub7.setVisibility(0);
                        WaImageView waImageView = this.A0H;
                        if (waImageView != null) {
                            waImageView.setImageBitmap((Bitmap) null);
                            A75();
                            A76();
                            r2 = AnonymousClass5V0.A00(this);
                            r2.A0T(R.string.f11nameremoved);
                            r2.A0i(false);
                            C1235268t.A03(r2, this, 106, R.string.f11nameremoved);
                            i2 = R.string.f11nameremoved;
                            i3 = 101;
                            break;
                        } else {
                            throw C18270x1.A0S("captchaImage");
                        }
                    } else {
                        throw C18270x1.A0S("captchaErrorDescription");
                    }
                } else {
                    throw C18270x1.A0S("captchaWarningIcon");
                }
            case 8:
                ViewStub viewStub8 = this.A0A;
                if (viewStub8 != null) {
                    viewStub8.setVisibility(0);
                    ViewStub viewStub9 = this.A09;
                    if (viewStub9 != null) {
                        viewStub9.setVisibility(0);
                        WaImageView waImageView2 = this.A0H;
                        if (waImageView2 != null) {
                            waImageView2.setImageBitmap((Bitmap) null);
                            A75();
                            A76();
                            r2 = AnonymousClass5V0.A00(this);
                            r2.A0U(R.string.f11nameremoved);
                            i2 = R.string.f11nameremoved;
                            i3 = 102;
                            break;
                        } else {
                            throw C18270x1.A0S("captchaImage");
                        }
                    } else {
                        throw C18270x1.A0S("captchaErrorDescription");
                    }
                } else {
                    throw C18270x1.A0S("captchaWarningIcon");
                }
            case 9:
                AnonymousClass5WY r3 = this.A0E;
                if (r3 != null) {
                    C53202mi r22 = this.A0N;
                    if (r22 != null) {
                        String str5 = this.A0W;
                        if (str5 == null) {
                            throw C18270x1.A0S("countryCode");
                        }
                        String str6 = this.A0X;
                        if (str6 != null) {
                            return AnonymousClass36l.A04(this, r3, r22, str5, str6);
                        }
                        throw C18270x1.A0S("phoneNumber");
                    }
                    throw C18270x1.A0S("supportGatingUtils");
                }
                throw C18270x1.A0S("sendFeedback");
            default:
                return super.onCreateDialog(i4);
        }
        C1235268t.A04(r2, this, i3, i2);
        return r2.create();
    }

    public VerifyCaptcha(int i) {
        this.A0Z = false;
        AnonymousClass68W.A00(this, 86);
    }

    public final void A7A(boolean z) {
        int i;
        Intent A0y;
        boolean z2 = z;
        C18260x0.A1E("VerifyCaptcha/startVerifySms useSmsRetriever ", AnonymousClass001.A0o(), z2);
        AnonymousClass317 r5 = this.A0R;
        if (r5 != null) {
            int i2 = this.A02;
            boolean z3 = true;
            if (!(i2 == 1 || i2 == 3)) {
                z3 = false;
            }
            if (z3) {
                i = 15;
            } else {
                i = 4;
                if (this.A00 == 1) {
                    i = 17;
                }
            }
            r5.A0B(i, true);
            int i3 = this.A02;
            if (i3 == 4) {
                A0y = C627736r.A0B(this, this.A01, this.A04, this.A05, this.A06, this.A03, this.A0Y);
            } else {
                A0y = C627736r.A0y(this, (String) null, this.A01, i3, 0, this.A04, this.A05, this.A06, this.A03, z2, true, this.A0Y, false, false);
            }
            startActivity(A0y);
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass4SG.A39(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.A08;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            MediaPlayer mediaPlayer2 = this.A08;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.A08 = null;
        }
        File file = this.A0V;
        if (file != null && file.exists()) {
            File file2 = this.A0V;
            if (file2 == null) {
                throw C18270x1.A0S("captchaAudioFile");
            }
            file2.delete();
        }
        C50152hi r0 = this.A0P;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C18270x1.A0S("registrationHelper");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            C50152hi r3 = this.A0P;
            if (r3 != null) {
                C55092pm r2 = this.A0S;
                if (r2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("verify-captcha +");
                    String str = this.A0W;
                    if (str == null) {
                        throw C18270x1.A0S("countryCode");
                    }
                    A0o.append(str);
                    String str2 = this.A0X;
                    if (str2 == null) {
                        throw C18270x1.A0S("phoneNumber");
                    }
                    r3.A01(this, r2, AnonymousClass000.A0X(str2, A0o));
                } else {
                    throw C18270x1.A0S("verificationFlowState");
                }
            } else {
                throw C18270x1.A0S("registrationHelper");
            }
        } else if (A042 == 2) {
            AnonymousClass4SG.A35(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public VerifyCaptcha() {
        this(0);
    }
}
