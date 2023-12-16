package com.whatsapp.identity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0K7;
import X.AnonymousClass0XH;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass21X;
import X.AnonymousClass2NZ;
import X.AnonymousClass2TZ;
import X.AnonymousClass2V1;
import X.AnonymousClass33Z;
import X.AnonymousClass36P;
import X.AnonymousClass3QC;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FJ;
import X.AnonymousClass4H6;
import X.AnonymousClass4HK;
import X.AnonymousClass4HY;
import X.AnonymousClass54E;
import X.AnonymousClass5TW;
import X.AnonymousClass5WX;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass75J;
import X.C107695bk;
import X.C141426vY;
import X.C143916zg;
import X.C150907Sr;
import X.C151137To;
import X.C15770ru;
import X.C159727mM;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18330xA;
import X.C28771hk;
import X.C28821hp;
import X.C29041iB;
import X.C29231iU;
import X.C34061uA;
import X.C368620a;
import X.C43622Sv;
import X.C48482ey;
import X.C48952fk;
import X.C54172oI;
import X.C56972sr;
import X.C59682xJ;
import X.C620733j;
import X.C627536m;
import X.C64333Db;
import X.C64393Dh;
import X.C64773Ex;
import X.C66433Lk;
import X.C66653Mg;
import X.C67413Pe;
import X.C70003Zm;
import X.C70103Zx;
import X.C72173dI;
import X.C836549g;
import X.C837449p;
import X.C84994En;
import X.C85244Fm;
import X.C85574Gu;
import X.C85924Id;
import X.C88834as;
import X.C88944b3;
import X.C89644eZ;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IdentityVerificationActivity extends C89644eZ implements C84994En, C836549g, C837449p {
    public int A00;
    public MenuItem A01;
    public View A02;
    public ImageView A03;
    public ProgressBar A04;
    public TextView A05;
    public TextView A06;
    public Toolbar A07;
    public C151137To A08;
    public AnonymousClass2V1 A09;
    public C28821hp A0A;
    public C85244Fm A0B;
    public AnonymousClass5TW A0C;
    public C64773Ex A0D;
    public AnonymousClass5ZU A0E;
    public C48952fk A0F;
    public C29231iU A0G;
    public AnonymousClass5ZR A0H;
    public AnonymousClass2NZ A0I;
    public C28771hk A0J;
    public AnonymousClass3ZH A0K;
    public C29041iB A0L;
    public AnonymousClass33Z A0M;
    public C43622Sv A0N;
    public AnonymousClass2TZ A0O;
    public C54172oI A0P;
    public UserJid A0Q;
    public C59682xJ A0R;
    public C66653Mg A0S;
    public AnonymousClass5WX A0T;
    public WaQrScannerView A0U;
    public C66433Lk A0V;
    public boolean A0W;
    public boolean A0X;
    public final AnonymousClass4FJ A0Y;
    public final C67413Pe A0Z;
    public final C67413Pe A0a;
    public final Runnable A0b;

    public final void A74() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new AnonymousClass4H6(this, 0));
        translateAnimation.setDuration(300);
        this.A02.startAnimation(translateAnimation);
    }

    public final void A7A(Spanned spanned, TextEmojiLabel textEmojiLabel) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel2);
        SpannableStringBuilder A002 = C18330xA.A00(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) A002.getSpans(0, A002.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A002.setSpan(new C88944b3(this, this.A0B, this.A05, this.A08, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A002.removeSpan(removeSpan);
            }
        }
        AnonymousClass0x2.A12(textEmojiLabel2, this.A08);
        textEmojiLabel2.setText(A002, TextView.BufferType.SPANNABLE);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A76();
        }
    }

    public void A5r() {
        if (!this.A0W) {
            this.A0W = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r3 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass1Ha.A23(r3, r2, r2, this);
            AnonymousClass1Ha.A24(r3, this);
            this.A0B = C64333Db.A05(r3);
            this.A0C = (AnonymousClass5TW) r3.ASQ.get();
            this.A0E = C64333Db.A28(r3);
            this.A0D = C64333Db.A26(r3);
            this.A0V = C64333Db.A8X(r3);
            this.A0N = (C43622Sv) r2.A5C.get();
            this.A0F = (C48952fk) r3.A3e.get();
            this.A0S = (C66653Mg) r3.AN6.get();
            this.A0A = (C28821hp) r3.AHK.get();
            this.A0H = C64333Db.A2r(r3);
            this.A0M = (AnonymousClass33Z) r3.A85.get();
            this.A0L = C64333Db.A3S(r3);
            this.A0R = A0I2.ACd();
            this.A0G = (C29231iU) r3.A1l.get();
            this.A0J = (C28771hk) r3.AZN.get();
            this.A0T = (AnonymousClass5WX) r2.A9K.get();
            this.A09 = (AnonymousClass2V1) A0I2.A3J.get();
            this.A0P = A0I2.ACY();
        }
    }

    public void A6O(int i) {
        if (i == 101) {
            A78();
            this.A0X = false;
        }
    }

    public final void A75() {
        String charSequence;
        StringBuilder A0m;
        FileOutputStream A0h;
        Point A1j = AnonymousClass1Ha.A1j(this);
        int min = (Math.min(A1j.x, A1j.y) * 2) / 3;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        C150907Sr r14 = this.A08.A04;
        int i = r14.A01;
        int i2 = r14.A00;
        int i3 = min / 12;
        float f = ((float) (min - (i3 * 2))) * 1.0f;
        float f2 = f / ((float) i);
        float f3 = f / ((float) i2);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        int i4 = 0;
        while (true) {
            byte b = 1;
            if (i4 >= i) {
                break;
            }
            int i5 = 0;
            while (i5 < i2) {
                if (r14.A02[i5][i4] == b) {
                    float f4 = (float) i3;
                    float f5 = (((float) i4) * f2) + f4;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f5, (((float) i5) * f3) + f4, (((float) (i4 + 1)) * f2) + f4, f4 + (((float) (i5 + 1)) * f3), paint);
                }
                i5++;
                b = 1;
            }
            i4++;
        }
        File A002 = C64393Dh.A00(this.A04, "code.png");
        try {
            A0h = AnonymousClass0x9.A0h(A002);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, A0h);
            A0h.close();
        } catch (FileNotFoundException e) {
            Log.e("idverification/sharefailed", e);
            this.A05.A0H(R.string.f11nameremoved, 0);
            createBitmap.recycle();
            return;
        } catch (IOException e2) {
            try {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                createBitmap.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        createBitmap.recycle();
        C48482ey r0 = this.A0I.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (r0 != null) {
            String str = r0.A00;
            String str2 = r0.A01;
            if (str.compareTo(str2) <= 0) {
                A0m = AnonymousClass000.A0m(str, str2);
            } else {
                A0m = AnonymousClass000.A0m(str2, str);
            }
            String obj = A0m.toString();
            int length = obj.length();
            for (int i6 = 1; i6 <= length; i6++) {
                A0o.append(obj.charAt(i6 - 1));
                if (i6 != length) {
                    if (i6 % 20 == 0) {
                        A0o.append(10);
                    } else if (i6 % 5 == 0) {
                        AnonymousClass001.A1L(A0o);
                    }
                }
            }
        }
        Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
        PhoneUserJid A052 = C56972sr.A05(this.A01);
        Object[] A0M2 = AnonymousClass002.A0M();
        C620733j.A03(this.A00, this.A01.A0D.A03(), A0M2, 0);
        intent.putExtra("android.intent.extra.SUBJECT", AnonymousClass002.A0F(this, this.A00.A0I(AnonymousClass36P.A07(A052.user)), A0M2, 1, R.string.f11nameremoved));
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass0x2.A0s(this, A0o2, R.string.f11nameremoved);
        A0o2.append("\n");
        C620733j r02 = this.A00;
        String obj2 = A0o.toString();
        String[] split = obj2.split("\n");
        AnonymousClass0XH r8 = r02.A05().A01;
        int length2 = obj2.length();
        StringBuilder sb = new StringBuilder(length2 + (r6 * 4));
        for (String str3 : split) {
            C15770ru r03 = AnonymousClass0K7.A04;
            if (str3 == null) {
                charSequence = null;
            } else {
                charSequence = r8.A03(r03, str3).toString();
            }
            sb.append(charSequence);
            sb.append(10);
        }
        AnonymousClass000.A1B(sb, A0o2);
        intent.putExtra("android.intent.extra.TEXT", A0o2.toString());
        intent.putExtra("android.intent.extra.STREAM", C627536m.A01(getApplicationContext(), A002));
        intent.setType("image/png");
        intent.addFlags(524288);
        startActivity(Intent.createChooser(intent, (CharSequence) null));
        return;
        throw th;
    }

    public final void A76() {
        WaQrScannerView waQrScannerView = this.A0U;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            return;
        }
        if (this.A0H.A02("android.permission.CAMERA") != 0) {
            AnonymousClass0x9.A1J(this);
            return;
        }
        findViewById(R.id.overlay).setVisibility(0);
        this.A0U.setVisibility(0);
        this.A05.setVisibility(8);
        this.A05.A0R(this.A0b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        r1 = getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A79(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r0 = r7.getParcelableArrayExtra(r0)
            r5 = 0
            r1 = r0[r5]
            android.nfc.NdefMessage r1 = (android.nfc.NdefMessage) r1
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r5]
            byte[] r3 = r0.getPayload()
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r5]
            byte[] r2 = r0.getId()
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)
            if (r1 == 0) goto L_0x0055
            X.3Ex r0 = r6.A0D
            X.3ZH r1 = r0.A0A(r1)
            r6.A0K = r1
            X.5ZU r0 = r6.A0E
            java.lang.String r4 = X.C18300x5.A0h(r0, r1)
            r0 = 2131894960(0x7f1222b0, float:1.942474E38)
            r2 = 1
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r6, r4, r2, r0)
            r6.A6d(r0)
            r6.A7D(r5)
            X.2NZ r0 = r6.A0I
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "idverification/ndef/no-fingerprint"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0055:
            return
        L_0x0056:
            X.2oI r0 = r6.A0P
            X.2KJ r3 = r0.A00(r3)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0064
            r6.A7F(r2)
            return
        L_0x0064:
            boolean r0 = r3 instanceof X.C22851Qi
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "idverification/handleIntentV1Error result = "
            X.C18260x0.A1S(r1, r0, r3)
            int r1 = r3.A00
            r0 = -3
            if (r1 == r0) goto L_0x00c3
            r0 = -2
            if (r1 == r0) goto L_0x0093
            r0 = 2
            if (r1 != r0) goto L_0x0055
            r6.A7F(r5)
            return
        L_0x0080:
            boolean r0 = r3 instanceof X.C22861Qj
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "idverification/handleIntentV3Error result = "
            X.C18260x0.A1S(r1, r0, r3)
            int r0 = r3.A00
            switch(r0) {
                case -22: goto L_0x0097;
                case -21: goto L_0x009b;
                case -20: goto L_0x009b;
                case -19: goto L_0x009b;
                case -18: goto L_0x009b;
                case -17: goto L_0x0097;
                case -16: goto L_0x009f;
                case -15: goto L_0x009f;
                case -14: goto L_0x009f;
                case -13: goto L_0x00ab;
                case -12: goto L_0x00af;
                case -11: goto L_0x00b3;
                case -10: goto L_0x00b7;
                case -9: goto L_0x00bb;
                default: goto L_0x0092;
            }
        L_0x0092:
            return
        L_0x0093:
            r0 = 2131894966(0x7f1222b6, float:1.9424752E38)
            goto L_0x00c6
        L_0x0097:
            r0 = 2131889372(0x7f120cdc, float:1.9413406E38)
            goto L_0x00c6
        L_0x009b:
            r0 = 2131889374(0x7f120cde, float:1.941341E38)
            goto L_0x00c6
        L_0x009f:
            X.2oI r1 = r6.A0P
            r0 = 29
            X.3Zm r0 = X.C70003Zm.A00(r6, r0)
            r1.A02(r0)
            return
        L_0x00ab:
            r0 = 2131889373(0x7f120cdd, float:1.9413408E38)
            goto L_0x00c6
        L_0x00af:
            r0 = 2131889375(0x7f120cdf, float:1.9413412E38)
            goto L_0x00c6
        L_0x00b3:
            r0 = 2131889376(0x7f120ce0, float:1.9413414E38)
            goto L_0x00c6
        L_0x00b7:
            r0 = 2131889377(0x7f120ce1, float:1.9413416E38)
            goto L_0x00be
        L_0x00bb:
            r0 = 2131889378(0x7f120ce2, float:1.9413418E38)
        L_0x00be:
            java.lang.String r1 = r6.getString(r0)
            goto L_0x00ca
        L_0x00c3:
            r0 = 2131894967(0x7f1222b7, float:1.9424754E38)
        L_0x00c6:
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r6, r4, r2, r0)
        L_0x00ca:
            X.3Wi r0 = r6.A05
            r0.A0P(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A79(android.content.Intent):void");
    }

    public final void A7B(UserJid userJid) {
        if (this.A01.A0a(userJid) || userJid.equals(AnonymousClass3ZH.A03(this.A0K))) {
            runOnUiThread(C70003Zm.A00(this, 27));
        }
    }

    public final void A7C(String str, String str2) {
        this.A0O.A05.animate().alpha(0.0f).setDuration(150).setListener(new C85574Gu(this, str, str2, 1));
    }

    public final void A7E(boolean z) {
        MenuItem menuItem = this.A01;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        int i = 0;
        findViewById(R.id.footer).setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        findViewById(R.id.verify_identity_tip).setVisibility(AnonymousClass001.A08(z));
        View findViewById = findViewById(R.id.qr_code_group);
        if (!z) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public final void A7F(boolean z) {
        this.A03.setVisibility(0);
        ImageView imageView = this.A03;
        int i = R.drawable.red_circle;
        if (z) {
            i = R.drawable.green_circle;
        }
        imageView.setBackgroundResource(i);
        ImageView imageView2 = this.A03;
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        C18300x5.A13(this, imageView2, i2);
        ImageView imageView3 = this.A03;
        int i3 = R.drawable.ill_verification_failure;
        if (z) {
            i3 = R.drawable.ill_verification_success;
        }
        imageView3.setImageResource(i3);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration((long) getResources().getInteger(17694721));
        this.A03.startAnimation(animationSet);
        this.A03.setFocusable(true);
        this.A03.setFocusableInTouchMode(true);
        this.A03.requestFocus();
        this.A05.A0T(this.A0b, 4000);
    }

    public void BTz(DeviceJid deviceJid, int i) {
        runOnUiThread(new C70103Zx(this, 41, deviceJid));
    }

    public void BUO(DeviceJid deviceJid) {
        A7B(deviceJid.userJid);
    }

    public void BUP(DeviceJid deviceJid) {
        A7B(deviceJid.userJid);
    }

    public void BUQ(DeviceJid deviceJid) {
        A7B(deviceJid.userJid);
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0U;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0 && findViewById(R.id.main_layout).getVisibility() == 8) {
            this.A0P.A02((Runnable) null);
        } else {
            super.finish();
        }
    }

    public IdentityVerificationActivity(int i) {
        this.A0W = false;
        AnonymousClass4HY.A00(this, 67);
    }

    public final void A77() {
        if (!AnonymousClass1Ha.A26(this)) {
            C368620a r2 = C368620a.FAIL;
            C18260x0.A1P(AnonymousClass001.A0o(), "idverification/updateui Updating UI based off of key transparency verification result: ", r2);
            runOnUiThread(new C70103Zx(this, 42, r2));
        }
        Jid A032 = AnonymousClass3ZH.A03(this.A0K);
        PhoneUserJid A042 = C56972sr.A04(this.A01);
        if (A042 == null) {
            Log.d("idverification/onverificationresult Self JID is null.");
            return;
        }
        Object[] objArr = new UserJid[2];
        objArr[0] = A032;
        this.A09.A00(new AnonymousClass3QC(this), AnonymousClass0x9.A1A(A042, objArr, 1)).A00(1);
    }

    public final void A78() {
        float f;
        StringBuilder A0m;
        char c;
        boolean A26 = AnonymousClass1Ha.A26(this);
        if (this.A0I != null) {
            A77();
            C48482ey r0 = this.A0I.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            String str = null;
            if (r0 != null) {
                String str2 = r0.A00;
                String str3 = r0.A01;
                if (str2.compareTo(str3) <= 0) {
                    A0m = AnonymousClass000.A0m(str2, str3);
                } else {
                    A0m = AnonymousClass000.A0m(str3, str2);
                }
                String obj = A0m.toString();
                int length = obj.length();
                for (int i = 1; i <= length; i++) {
                    A0o.append(obj.charAt(i - 1));
                    if (i != length) {
                        if (i % 20 == 0) {
                            if (str == null) {
                                str = A0o.toString();
                            }
                            c = 10;
                        } else if (i % 5 == 0) {
                            A0o.append("     ");
                        } else if (!A26) {
                            c = ' ';
                        }
                        A0o.append(c);
                    }
                }
            }
            if (A26) {
                this.A0O.A07.setOnClickListener(new AnonymousClass54E(A0o, 11, this));
                this.A0O.A07.setEnabled(true);
                return;
            }
            float textSize = this.A06.getTextSize();
            if (str != null) {
                f = this.A06.getPaint().measureText(str);
            } else {
                f = 0.0f;
            }
            Point A1j = AnonymousClass1Ha.A1j(this);
            float min = ((float) Math.min(A1j.x, A1j.y)) - getResources().getDimension(R.dimen.f6nameremoved);
            while (f > min && textSize > 1.0f) {
                textSize -= 1.0f;
                this.A06.setTextSize(textSize);
                f = this.A06.getPaint().measureText(str);
            }
            this.A06.setText(A0o.toString());
            this.A06.setTextDirection(3);
            QrImageView qrImageView = (QrImageView) findViewById(R.id.qr_code);
            try {
                EnumMap enumMap = new EnumMap(C141426vY.class);
                C151137To A002 = C159727mM.A00(AnonymousClass21X.L, new String(this.A0I.A02.A0F(), "ISO-8859-1"), enumMap);
                this.A08 = A002;
                qrImageView.setQrCode(A002);
            } catch (C143916zg | UnsupportedEncodingException e) {
                Log.w("idverification/", e);
            }
            A7E(true);
        } else if (!A26) {
            A7E(false);
            AnonymousClass001.A0y(this, this.A06, new Object[]{C18300x5.A0h(this.A0E, this.A0K)}, R.string.f11nameremoved);
        }
    }

    public final void A7D(boolean z) {
        C67413Pe r4;
        BjL();
        if (z) {
            r4 = this.A0a;
        } else {
            r4 = this.A0Z;
        }
        C43622Sv r1 = this.A0N;
        UserJid A072 = AnonymousClass3ZH.A07(this.A0K);
        C72173dI r3 = r1.A06;
        r3.A02();
        new C34061uA(r4, r1, A072).A02.executeOnExecutor(r3, new Void[0]);
    }

    public void BNB(List list) {
        UserJid userJid;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid A0R2 = AnonymousClass0x7.A0R(it);
            if (A0R2 == null) {
                userJid = null;
            } else {
                userJid = A0R2.userJid;
            }
            if (AnonymousClass75J.A00(AnonymousClass3ZH.A03(this.A0K), userJid)) {
                A7D(false);
            }
        }
    }

    public void Bf8(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            A7B(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (r9.A0D.A0Y(X.C58422vE.A02, 1967) == false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r9)     // Catch:{ 24P -> 0x0275 }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A09(r0)     // Catch:{ 24P -> 0x0275 }
            r9.A0Q = r1     // Catch:{ 24P -> 0x0275 }
            X.3Ex r0 = r9.A0D
            X.3ZH r0 = r0.A0A(r1)
            r9.A0K = r0
            boolean r1 = X.AnonymousClass1Ha.A26(r9)
            r0 = 2131625100(0x7f0e048c, float:1.8877398E38)
            if (r1 == 0) goto L_0x0021
            r0 = 2131625101(0x7f0e048d, float:1.88774E38)
        L_0x0021:
            r9.setContentView((int) r0)
            boolean r0 = X.AnonymousClass1Ha.A26(r9)
            r5 = 2131894978(0x7f1222c2, float:1.9424776E38)
            if (r0 == 0) goto L_0x0030
            r5 = 2131894979(0x7f1222c3, float:1.9424778E38)
        L_0x0030:
            r9.setTitle(r5)
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r4 = X.C005205m.A00(r9, r0)
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            r9.A07 = r4
            X.33j r3 = r9.A00
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131101247(0x7f06063f, float:1.7814898E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A0B(r2, r0)
            X.6dx r0 = new X.6dx
            r0.<init>(r1, r3)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            androidx.appcompat.widget.Toolbar r0 = r9.A07
            r0.setTitle((int) r5)
            X.2sr r1 = r9.A01
            X.3ZH r0 = r9.A0K
            boolean r0 = X.C56972sr.A08(r1, r0)
            if (r0 == 0) goto L_0x007e
            X.1VX r2 = r9.A0D
            r1 = 1967(0x7af, float:2.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            r5 = 1
            r4 = 0
            androidx.appcompat.widget.Toolbar r6 = r9.A07
            if (r0 == 0) goto L_0x012d
            X.5ZU r2 = r9.A0E
            X.33j r1 = r9.A00
            X.3ZH r0 = r9.A0K
            java.lang.String r0 = X.C100235Ac.A00(r9, r2, r1, r0)
        L_0x008f:
            r6.setSubtitle((java.lang.CharSequence) r0)
            androidx.appcompat.widget.Toolbar r1 = r9.A07
            android.content.Context r0 = r1.getContext()
            int r0 = X.AnonymousClass34K.A00(r0)
            r1.setBackgroundResource(r0)
            androidx.appcompat.widget.Toolbar r1 = r9.A07
            r0 = 2132083773(0x7f15043d, float:1.9807698E38)
            r1.A0J(r9, r0)
            androidx.appcompat.widget.Toolbar r2 = r9.A07
            r1 = 20
            X.39q r0 = new X.39q
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.setNavigationOnClickListener(r0)
            androidx.appcompat.widget.Toolbar r0 = r9.A07
            r9.setSupportActionBar(r0)
            boolean r0 = X.AnonymousClass1Ha.A26(r9)
            if (r0 == 0) goto L_0x014c
            android.view.View r0 = r9.A00
            X.2TZ r3 = new X.2TZ
            r3.<init>(r0)
            r9.A0O = r3
            r0 = 2131894975(0x7f1222bf, float:1.942477E38)
            java.lang.String r1 = r9.getString(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r9)
            int r2 = r0.widthPixels
            com.whatsapp.TextEmojiLabel r6 = r3.A05
            android.text.TextPaint r0 = r6.getPaint()
            float r1 = r0.measureText(r1)
            float r0 = (float) r2
            float r1 = r1 / r0
            double r0 = (double) r1
            double r2 = java.lang.Math.ceil(r0)
            int r1 = (int) r2
            int r0 = r6.getLineHeight()
            int r1 = r1 * r0
            int r0 = r6.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r6.getPaddingBottom()
            int r1 = r1 + r0
            r6.setHeight(r1)
            r9.A77()
            X.2TZ r0 = r9.A0O
            com.whatsapp.settings.SettingsRowIconText r1 = r0.A08
            r0 = 44
            X.C18310x6.A18(r1, r9, r0)
            r9.A7D(r4)
            X.2TZ r0 = r9.A0O
            com.whatsapp.settings.SettingsRowIconText r0 = r0.A07
            r0.setEnabled(r4)
            X.3Lk r1 = r9.A0V
            java.lang.String r0 = "28030015"
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            java.lang.String r2 = r0.toString()
            X.2TZ r0 = r9.A0O
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            r0 = 2131886403(0x7f120143, float:1.9407384E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r9, r2, r5, r0)
            android.text.Spanned r0 = X.AnonymousClass0x9.A0B(r0)
            r9.A7A(r0, r1)
            return
        L_0x012d:
            r3 = 2131894960(0x7f1222b0, float:1.942474E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.5ZU r1 = r9.A0E
            X.3ZH r0 = r9.A0K
            java.lang.String r0 = X.C18300x5.A0h(r1, r0)
            java.lang.String r2 = X.AnonymousClass002.A0F(r9, r0, r2, r4, r3)
            androidx.appcompat.widget.Toolbar r0 = r9.A07
            android.content.Context r1 = r0.getContext()
            X.5Y0 r0 = r9.A0C
            java.lang.CharSequence r0 = X.C107345b9.A05(r1, r0, r2)
            goto L_0x008f
        L_0x014c:
            r0 = 2131430662(0x7f0b0d06, float:1.8483031E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r9, r0)
            r9.A06 = r0
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A04 = r0
            r0 = 2131429884(0x7f0b09fc, float:1.8481453E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r9, r0)
            r9.A05 = r0
            r0 = 2131432787(0x7f0b1553, float:1.8487341E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.qrcode.WaQrScannerView r0 = (com.whatsapp.qrcode.WaQrScannerView) r0
            r9.A0U = r0
            r0 = 2131430544(0x7f0b0c90, float:1.8482792E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.A02 = r0
            X.33p r0 = r9.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "security_notifications"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x01a9
            X.33p r3 = r9.A09
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            java.lang.String r0 = "security_notifications_alert_timestamp"
            boolean r0 = r3.A2P(r0, r1)
            if (r0 == 0) goto L_0x01a9
            android.view.View r3 = r9.A02
            r0 = 30
            X.3Zm r2 = X.C70003Zm.A00(r9, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x01a9:
            r0 = 2131429767(0x7f0b0987, float:1.8481216E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 21
            X.C635439q.A00(r1, r9, r0)
            r0 = 2131428787(0x7f0b05b3, float:1.8479228E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 45
            X.C18310x6.A18(r1, r9, r0)
            X.2oI r3 = r9.A0P
            android.view.View r2 = r9.A00
            com.whatsapp.jid.UserJid r1 = r9.A0Q
            X.4Kj r0 = new X.4Kj
            r0.<init>(r9, r4)
            r3.A01(r2, r0, r1)
            X.2oI r2 = r9.A0P
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A0G
            if (r1 == 0) goto L_0x01e2
            java.util.Map r0 = r2.A0I
            r1.setQrDecodeHints(r0)
            X.4Kr r0 = new X.4Kr
            r0.<init>(r2, r4)
            r1.setQrScannerCallback(r0)
        L_0x01e2:
            r9.A7E(r4)
            r9.A7D(r4)
            r0 = 2131433122(0x7f0b16a2, float:1.848802E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.A03 = r0
            r0 = 2131433225(0x7f0b1709, float:1.848823E38)
            android.view.View r1 = X.C005205m.A00(r9, r0)
            r0 = 22
            X.C635439q.A00(r1, r9, r0)
            boolean r0 = X.C107385bE.A0B()
            if (r0 != 0) goto L_0x025e
            X.5ZR r1 = r9.A0H
            java.lang.String r0 = "android.permission.NFC"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x025e
            android.nfc.NfcAdapter r8 = android.nfc.NfcAdapter.getDefaultAdapter(r9)
            if (r8 == 0) goto L_0x0247
            java.lang.Class<android.nfc.NfcAdapter> r3 = android.nfc.NfcAdapter.class
            java.lang.String r2 = "setNdefPushMessageCallback"
            r7 = 3
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            java.lang.Class<android.nfc.NfcAdapter$CreateNdefMessageCallback> r0 = android.nfc.NfcAdapter.CreateNdefMessageCallback.class
            r1[r4] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r1[r5] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            java.lang.Class<android.app.Activity[]> r0 = android.app.Activity[].class
            r6 = 2
            r1[r6] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            java.lang.reflect.Method r3 = r3.getMethod(r2, r1)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            android.app.Activity[] r2 = new android.app.Activity[r4]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            X.4JZ r0 = new X.4JZ     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            r0.<init>(r9, r4)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            r1[r4] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            r1[r5] = r9     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            r1[r6] = r2     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            r3.invoke(r8, r1)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0241 }
            goto L_0x0247
        L_0x0241:
            r1 = move-exception
            java.lang.String r0 = "idverification/ "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0247:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025e
            android.content.Intent r0 = r9.getIntent()
            r9.A79(r0)
        L_0x025e:
            X.1iU r0 = r9.A0G
            r0.A06(r9)
            X.1hp r0 = r9.A0A
            r0.A06(r9)
            X.1hk r0 = r9.A0J
            r0.A06(r9)
            X.1iB r1 = r9.A0L
            X.4FJ r0 = r9.A0Y
            r1.A06(r0)
            return
        L_0x0275:
            r1 = move-exception
            java.lang.String r0 = "idverification/finishing due to invalid jid"
            com.whatsapp.util.Log.e(r0, r1)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!AnonymousClass1Ha.A26(this)) {
            MenuItem icon = menu.add(0, R.id.menuitem_share, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_share);
            this.A01 = icon;
            icon.setShowAsAction(2);
            this.A01.setVisible(AnonymousClass000.A1W(this.A0I));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0G.A07(this);
        this.A0A.A07(this);
        this.A0J.A07(this);
        this.A0L.A07(this.A0Y);
        this.A05.A0R(this.A0b);
        C54172oI r1 = this.A0P;
        r1.A02 = null;
        r1.A0G = null;
        r1.A0F = null;
        r1.A01 = null;
        r1.A06 = null;
        r1.A05 = null;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            A79(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_share) {
            WaQrScannerView waQrScannerView = this.A0U;
            if (waQrScannerView == null || waQrScannerView.getVisibility() != 0) {
                A75();
                return true;
            }
            this.A0P.A02(C70003Zm.A00(this, 28));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        if (!AnonymousClass1Ha.A26(this) && this.A0U.getVisibility() == 0) {
            this.A0U.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (!AnonymousClass1Ha.A26(this) && this.A0U.getVisibility() == 4) {
            this.A0U.setVisibility(0);
        }
    }

    public IdentityVerificationActivity() {
        this(0);
        this.A0b = C70003Zm.A00(this, 25);
        this.A0Y = new C85924Id(this, 2);
        this.A0Z = new AnonymousClass4HK(this, 0);
        this.A0a = new AnonymousClass4HK(this, 1);
    }
}
