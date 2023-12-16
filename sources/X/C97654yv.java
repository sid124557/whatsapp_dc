package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4yv  reason: invalid class name and case insensitive filesystem */
public abstract class C97654yv extends C89464d1 implements AnonymousClass4BC, C179208im {
    public Uri A00;
    public ImageView A01;
    public ViewPager A02;
    public C57012sv A03;
    public C106175Xx A04;
    public C48352el A05;
    public C85244Fm A06;
    public PagerSlidingTabStrip A07;
    public C42662Pa A08;
    public C64773Ex A09;
    public C47882dz A0A;
    public C56422rx A0B;
    public AnonymousClass5ZU A0C;
    public C66413Li A0D;
    public AnonymousClass314 A0E;
    public C57162tC A0F;
    public AnonymousClass5ZR A0G;
    public C620733j A0H;
    public C53412n3 A0I;
    public C42182Nc A0J;
    public AnonymousClass4FV A0K;
    public AnonymousClass31C A0L;
    public C105355Up A0M;
    public C1907099n A0N;
    public AnonymousClass9U4 A0O;
    public AnonymousClass9Th A0P;
    public AnonymousClass5PT A0Q;
    public AnonymousClass33I A0R;
    public C87464Ta A0S;
    public ContactQrMyCodeFragment A0T;
    public QrScanCodeFragment A0U;
    public C989053r A0V;
    public String A0W;
    public boolean A0X;
    public boolean A0Y = false;
    public boolean A0Z;
    public boolean A0a;
    public final C182958pG A0b = new AnonymousClass3U3(this);

    public void A75() {
        if (!this.A0G.A0E()) {
            C626936e.A06(this);
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f11nameremoved;
            if (i >= 30) {
                i2 = R.string.f11nameremoved;
                if (i < 33) {
                    i2 = R.string.f11nameremoved;
                }
            }
            BpY(RequestPermissionActivity.A0C(this, R.string.f11nameremoved, i2, false), 4);
        } else if (this.A0W == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            this.A05.A0H(R.string.f11nameremoved, 0);
        } else {
            Bp9(R.string.f11nameremoved);
            AnonymousClass4FS r2 = this.A04;
            C69263Wi r11 = this.A05;
            C56972sr r12 = this.A01;
            boolean z = true;
            C33511tF r8 = new C33511tF(this, this.A04, r11, r12, AnonymousClass002.A0F(this, AnonymousClass000.A0V("https://wa.me/qr/", this.A0W, AnonymousClass001.A0o()), new Object[1], 0, R.string.f11nameremoved));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass1RR A0V2 = C86634Kw.A0V(this.A01);
            if (C18280x3.A02(AnonymousClass0x2.A0F(this.A09), "privacy_profile_photo") != 0) {
                z = false;
            }
            bitmapArr[0] = AnonymousClass35W.A00(this, A0V2, AnonymousClass000.A0T("https://wa.me/qr/", this.A0W), getString(R.string.f11nameremoved), z);
            r2.BkL(r8, bitmapArr);
        }
    }

    public abstract void A77(boolean z);

    public void A74() {
        boolean A042;
        C107405bG.A05(this);
        setTitle(getString(R.string.f11nameremoved));
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A2T = AnonymousClass4SG.A2T(this);
        C18260x0.A0E(this, getResources(), A2T, this.A0H, R.drawable.ic_back);
        A2T.setTitle((CharSequence) getString(R.string.f11nameremoved));
        A2T.setNavigationOnClickListener(new C109385eX(this, 1));
        setSupportActionBar(A2T);
        this.A0Q = new AnonymousClass5PT();
        this.A02 = (ViewPager) C005205m.A00(this, R.id.contact_qr_pager);
        this.A07 = (PagerSlidingTabStrip) C005205m.A00(this, R.id.contact_qr_tab_strip);
        ImageView A0u = C86664Kz.A0u(this, R.id.contact_qr_preview);
        this.A01 = A0u;
        AnonymousClass0YY.A06(A0u, 2);
        C56612sH r34 = this.A06;
        AnonymousClass1VX r29 = this.A0D;
        C69263Wi r28 = this.A05;
        C56972sr r26 = this.A01;
        AnonymousClass4FS r25 = this.A04;
        AnonymousClass4FV r23 = this.A0K;
        C57012sv r21 = this.A03;
        C66663Mh r24 = this.A06;
        C85244Fm r22 = this.A06;
        AnonymousClass31C r20 = this.A0L;
        C64773Ex r27 = this.A09;
        C620633i r18 = this.A08;
        AnonymousClass5ZU r30 = this.A0C;
        C48352el r19 = this.A05;
        AnonymousClass9U4 r17 = this.A0O;
        C106175Xx r15 = this.A04;
        C42182Nc r12 = this.A0J;
        C56422rx r11 = this.A0B;
        AnonymousClass314 r10 = this.A0E;
        C1907099n r9 = this.A0N;
        C105355Up r8 = this.A0M;
        AnonymousClass9Th r7 = this.A0P;
        C29441ip r6 = this.A07;
        C47882dz r5 = this.A0A;
        C53412n3 r4 = this.A0I;
        C57162tC r3 = this.A0F;
        AnonymousClass4FS r45 = r25;
        AnonymousClass33I r16 = new AnonymousClass33I(r21, r15, r19, this, r28, r22, r26, r24, this.A08, r6, r27, r5, r11, r30, this.A0D, r10, r18, r34, r3, r4, r12, r29, r23, r20, r8, r9, r17, r7, r45, C18290x4.A0a(), false, true);
        this.A0R = r16;
        r16.A02 = true;
        C87464Ta r2 = new C87464Ta(getSupportFragmentManager(), this);
        this.A0S = r2;
        this.A02.setAdapter(r2);
        this.A02.A0G(new C1232067n(this, 1));
        AnonymousClass0YH.A06(this.A07, 0);
        this.A07.setViewPager(this.A02);
        String stringExtra = getIntent().getStringExtra("qrcode");
        if (stringExtra != null) {
            this.A0X = true;
            A78(stringExtra, false, 5);
        }
        if (!this.A0X) {
            A77(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0a = booleanExtra;
        C620733j r0 = this.A0H;
        if (booleanExtra) {
            A042 = C102805Ki.A00(r0);
        } else {
            A042 = C620733j.A04(r0);
        }
        boolean z = !A042;
        this.A02.A0F(z ? 1 : 0, false);
        C87464Ta r32 = this.A0S;
        int i = 0;
        do {
            r32.A00[i].A00.setSelected(AnonymousClass000.A1U(i, z));
            i++;
        } while (i < 2);
    }

    public final void A76() {
        if (this.A0U == null) {
            return;
        }
        if (this.A0G.A02("android.permission.CAMERA") != 0) {
            AnonymousClass5UF r5 = new AnonymousClass5UF(this);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.f11nameremoved};
            r5.A02 = R.string.f11nameremoved;
            r5.A0B = iArr;
            int[] iArr2 = {R.string.f11nameremoved};
            r5.A03 = R.string.f11nameremoved;
            r5.A09 = iArr2;
            r5.A0D = new String[]{"android.permission.CAMERA"};
            startActivityForResult(AnonymousClass5UF.A00(r5, true), 1);
            return;
        }
        this.A0U.A1J();
    }

    public boolean A78(String str, boolean z, int i) {
        if (this.A0R.A0e || this.A0Z) {
            return false;
        }
        return this.A0R.A02((AnonymousClass2z0) null, str, i, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r3 != 1) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            androidx.viewpager.widget.ViewPager r0 = r4.A02
            int r3 = r0.getCurrentItem()
            X.33j r0 = r4.A0H
            boolean r2 = X.C620733j.A04(r0)
            r1 = 1
            if (r3 == 0) goto L_0x0012
            if (r3 == r1) goto L_0x0014
        L_0x0011:
            return r1
        L_0x0012:
            r2 = r2 ^ 1
        L_0x0014:
            r0 = 0
            if (r2 == 0) goto L_0x001d
            if (r2 != r1) goto L_0x0011
            r5.setGroupVisible(r0, r0)
            return r1
        L_0x001d:
            r5.setGroupVisible(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97654yv.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onStop() {
        this.A0Q.A00(getWindow());
        super.onStop();
    }

    public void A5d(C08310eF r5) {
        super.A5d(r5);
        if (r5 instanceof ContactQrMyCodeFragment) {
            ContactQrMyCodeFragment contactQrMyCodeFragment = (ContactQrMyCodeFragment) r5;
            this.A0T = contactQrMyCodeFragment;
            String str = this.A0W;
            if (str != null) {
                contactQrMyCodeFragment.A02 = str;
                ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                if (contactQrContactCardView != null) {
                    contactQrContactCardView.setQrCode(AnonymousClass000.A0V("https://wa.me/qr/", str, AnonymousClass001.A0o()));
                }
            }
        } else if (r5 instanceof QrScanCodeFragment) {
            this.A0U = (QrScanCodeFragment) r5;
            ViewPager viewPager = this.A02;
            if (viewPager == null) {
                Log.e("BaseQrActivity/onAttachFragment/viewPagerNull");
            } else if (1 == viewPager.getCurrentItem()) {
                A76();
            }
        }
    }

    public void BZD() {
        if (C621433s.A03(this)) {
            return;
        }
        if (this.A0X) {
            finish();
            return;
        }
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
        if (this.A0U != null) {
            this.A0R.A0e = false;
            QrScanCodeFragment qrScanCodeFragment = this.A0U;
            qrScanCodeFragment.A07 = null;
            WaQrScannerView waQrScannerView = qrScanCodeFragment.A06;
            if (waQrScannerView != null) {
                waQrScannerView.Bjp();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                if (i2 == -1) {
                    if (intent != null) {
                        Uri data = intent.getData();
                        this.A00 = data;
                        if (data != null) {
                            Bp9(R.string.f11nameremoved);
                            AnonymousClass0x7.A1B(new AnonymousClass554(this.A00, this, this.A0V, this.A01.getWidth(), this.A01.getHeight()), this.A04);
                            return;
                        }
                        this.A05.A0H(R.string.f11nameremoved, 0);
                    } else {
                        return;
                    }
                }
                this.A0Z = false;
            } else if (i == 3) {
                QrScanCodeFragment qrScanCodeFragment = this.A0U;
                qrScanCodeFragment.A07 = null;
                WaQrScannerView waQrScannerView = qrScanCodeFragment.A06;
                if (waQrScannerView != null) {
                    waQrScannerView.Bjp();
                }
            } else if (i == 4 && i2 == -1) {
                A75();
            }
        } else if (i2 != 0) {
            this.A0U.A1J();
        } else if (this.A0a) {
            finish();
        } else {
            this.A02.A0F(C620733j.A04(this.A0H) ^ true ? 1 : 0, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A74();
    }

    public void onStart() {
        super.onStart();
        this.A0Q.A01(getWindow(), this.A08);
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
    }
}
