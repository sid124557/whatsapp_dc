package X;

import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.1gh  reason: invalid class name and case insensitive filesystem */
public abstract class C28341gh extends AnonymousClass1Fl {
    public RelativeLayout A00;
    public LottieAnimationView A01;
    public CircularProgressBar A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public RoundCornerProgressBar A06;
    public C53602nM A07;
    public AnonymousClass5ZR A08;
    public ChatTransferViewModel A09;
    public AnonymousClass5PT A0A;
    public C106715a2 A0B;
    public AnonymousClass5UY A0C;
    public WDSButton A0D;
    public WDSButton A0E;
    public final AnonymousClass0O1 A0F = Bid(new AnonymousClass4KP(this, 6), new C003403v());

    public void A77(int i) {
        AnonymousClass5UF r4;
        AnonymousClass310 r42 = this.A05;
        AnonymousClass5ZR r3 = this.A08;
        String A74 = A74(R.string.f11nameremoved);
        String A742 = A74(R.string.f11nameremoved);
        String A743 = A74(R.string.f11nameremoved);
        if (C107385bE.A0A()) {
            if (!r3.A06()) {
                r4 = RequestPermissionActivity.A0Z(this, A74);
            }
            C06270Wx.A03(this.A09.A0C, 3);
            return;
        } else if (r42.A0B() || r3.A0E()) {
            if (r3.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r4 = new AnonymousClass5UF(this);
                r4.A01 = R.drawable.permission_location;
                r4.A0D = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                r4.A04 = R.string.f11nameremoved;
                r4.A06 = A742;
            }
            C06270Wx.A03(this.A09.A0C, 3);
            return;
        } else {
            r4 = new AnonymousClass5UF(this);
            r4.A0A = new int[]{R.drawable.permission_location, R.drawable.permission_plus, R.drawable.permission_storage};
            r4.A0D = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
            r4.A04 = R.string.f11nameremoved;
            r4.A06 = A743;
        }
        startActivityForResult(r4.A02(), i);
    }

    public void A79(int i) {
        ChatTransferViewModel chatTransferViewModel = this.A09;
        boolean A1T = AnonymousClass000.A1T(i);
        chatTransferViewModel.A0H();
        chatTransferViewModel.A07 = false;
        chatTransferViewModel.A0a.BkM(new C71703cX(45, (Object) chatTransferViewModel, A1T));
        C18270x1.A0l(C18270x1.A03(chatTransferViewModel.A0N), "chat_transfer_in_progress", false);
        setResult(i);
        finish();
    }

    public void A7A(AnonymousClass2T5 r6) {
        AnonymousClass4K2 r0;
        if (r6.A06) {
            this.A01.A00();
            this.A02.setVisibility(8);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(r6.A03);
        A002.A0T(r6.A00);
        int i = r6.A02;
        if (r6.A04 != null) {
            r0 = new AnonymousClass4K2(r6, 141);
        } else {
            r0 = null;
        }
        A002.A0d(this, r0, i);
        int i2 = r6.A01;
        if (i2 != 0) {
            A002.A0c(this, (C15930sC) null, i2);
        }
        A002.A0i(r6.A05);
        C18280x3.A0q(A002);
    }

    public void A7B(AnonymousClass2UG r9) {
        C109375eW r1;
        if (r9 == null) {
            Log.e("fpm/P2pTransferActivity/onCurrentScreenChanged/viewData is null");
            return;
        }
        this.A00.setVisibility(r9.A00);
        if (r9.A00 == 0) {
            this.A01.setFrame(r9.A02);
            LottieAnimationView lottieAnimationView = this.A01;
            lottieAnimationView.A0F.A0A(r9.A02, r9.A01);
            this.A01.A01();
            int i = r9.A02;
            int i2 = r9.A01;
            LottieAnimationView lottieAnimationView2 = this.A01;
            if (i == i2) {
                lottieAnimationView2.A00();
            } else {
                lottieAnimationView2.A01();
                LottieAnimationView lottieAnimationView3 = this.A01;
                int i3 = 0;
                if (r9.A0I) {
                    i3 = -1;
                }
                lottieAnimationView3.setRepeatCount(i3);
            }
        }
        this.A05.setText(r9.A0B);
        boolean z = r9.A0G;
        WaTextView waTextView = this.A04;
        int i4 = r9.A0A;
        if (z) {
            C106715a2 r6 = this.A0B;
            C53602nM r5 = this.A07;
            waTextView.setText(r6.A05(this, new C70113Zy(r5, 27, this), AnonymousClass002.A0F(this, "learn-more", AnonymousClass002.A0L(), 0, i4), "learn-more"));
            C18270x1.A0q(this.A04, this.A0D);
        } else {
            C18280x3.A1E(getString(i4), waTextView);
        }
        C151137To r3 = r9.A0C;
        C109375eW r2 = null;
        if (r3 != null) {
            this.A0C.A06(0);
            QrImageView qrImageView = (QrImageView) C005205m.A00(this, R.id.chat_transfer_qr_code_image_view);
            qrImageView.setAlpha(1.0f);
            qrImageView.setQrCode(r3);
            ImageView imageView = (ImageView) C005205m.A00(this, R.id.chat_transfer_qr_code_image_view_overlay);
            imageView.setImageResource(R.drawable.ic_qr_walogo);
            imageView.setClickable(false);
            imageView.setOnClickListener((View.OnClickListener) null);
            this.A0A.A01(getWindow(), this.A08);
        } else {
            this.A0C.A06(8);
            this.A0A.A00(getWindow());
        }
        this.A02.setVisibility(r9.A07);
        this.A03.setVisibility(r9.A06);
        this.A06.setVisibility(8);
        this.A03.setText(r9.A05);
        this.A0D.setVisibility(r9.A04);
        this.A0D.setText(r9.A03);
        WDSButton wDSButton = this.A0D;
        if (r9.A0E != null) {
            r2 = new C109375eW(r9, 1);
        }
        wDSButton.setOnClickListener(r2);
        this.A0E.setVisibility(r9.A09);
        this.A0E.setText(r9.A08);
        WDSButton wDSButton2 = this.A0E;
        if (r9.A0F != null) {
            r1 = new C109375eW(r9, 2);
        } else {
            r1 = new C109375eW(this, 3);
        }
        wDSButton2.setOnClickListener(r1);
        this.A05.A01(new C19330zG(this, r9), this);
        boolean z2 = r9.A0H;
        Window window = getWindow();
        if (z2) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public final String A74(int i) {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = "https://faq.whatsapp.com/209942271778103/?cms_platform=android";
        return AnonymousClass002.A0F(this, C107575bX.A04(this, C18290x4.A00(this)), A0M, 1, i);
    }

    public final void A75() {
        AnonymousClass08M r1;
        int i;
        LocationManager locationManager = (LocationManager) AnonymousClass0Y8.A08(getApplicationContext(), LocationManager.class);
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            r1 = this.A09.A0C;
            i = 4;
        } else {
            r1 = this.A09.A0C;
            i = 5;
        }
        C06270Wx.A03(r1, i);
    }

    public final void A76() {
        AnonymousClass08M r1;
        int i;
        WifiManager wifiManager = (WifiManager) AnonymousClass0Y8.A08(getApplicationContext(), WifiManager.class);
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            r1 = this.A09.A0C;
            i = 6;
        } else {
            r1 = this.A09.A0C;
            i = 7;
        }
        C06270Wx.A03(r1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A78(int r9) {
        /*
            r8 = this;
            switch(r9) {
                case 1: goto L_0x0004;
                case 2: goto L_0x0003;
                case 3: goto L_0x0009;
                case 4: goto L_0x001b;
                case 5: goto L_0x0035;
                case 6: goto L_0x000d;
                case 7: goto L_0x0039;
                case 8: goto L_0x0082;
                default: goto L_0x0003;
            }
        L_0x0003:
            return
        L_0x0004:
            r0 = 1
            r8.A77(r0)
            return
        L_0x0009:
            r8.A75()
            return
        L_0x000d:
            r2 = 2131887740(0x7f12067c, float:1.9410096E38)
            r3 = 2131887739(0x7f12067b, float:1.9410094E38)
            r4 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r5 = 2131891264(0x7f121440, float:1.9417243E38)
            r0 = 3
            goto L_0x0028
        L_0x001b:
            r2 = 2131887738(0x7f12067a, float:1.9410092E38)
            r3 = 2131887737(0x7f120679, float:1.941009E38)
            r4 = 2131887053(0x7f1203cd, float:1.9408702E38)
            r5 = 2131891264(0x7f121440, float:1.9417243E38)
            r0 = 1
        L_0x0028:
            X.4Hd r1 = new X.4Hd
            r1.<init>(r8, r0)
            r6 = 0
            r7 = 1
            X.2T5 r0 = new X.2T5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0099
        L_0x0035:
            r8.A76()
            return
        L_0x0039:
            r5 = r8
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r5 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r5
            android.content.Context r4 = r5.getApplicationContext()
            X.2po r3 = r5.A02
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.wifi.direct"
            boolean r0 = r1.hasSystemFeature(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "fpm/TransferUtils/Feature not available"
        L_0x0051:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0058
            r3.A00 = r0
        L_0x0058:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r5.A09
            X.08M r1 = r0.A0C
            if (r2 == 0) goto L_0x0064
            r0 = 9
        L_0x0060:
            X.C06270Wx.A03(r1, r0)
            return
        L_0x0064:
            r0 = 8
            goto L_0x0060
        L_0x0067:
            java.lang.Class<android.net.wifi.WifiManager> r0 = android.net.wifi.WifiManager.class
            java.lang.Object r1 = X.AnonymousClass0Y8.A08(r4, r0)
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            if (r1 != 0) goto L_0x0074
            java.lang.String r0 = "fpm/TransferUtils/WifiManager not available"
            goto L_0x0051
        L_0x0074:
            boolean r0 = X.C107385bE.A02()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r1.isP2pSupported()
            if (r0 == 0) goto L_0x0058
            r2 = 1
            goto L_0x0058
        L_0x0082:
            r2 = 2131887713(0x7f120661, float:1.941004E38)
            r3 = 2131887712(0x7f120660, float:1.9410039E38)
            r4 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r5 = 0
            r0 = 2
            X.4Hd r1 = new X.4Hd
            r1.<init>(r8, r0)
            r7 = 1
            X.2T5 r0 = new X.2T5
            r6 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0099:
            r8.A7A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28341gh.A78(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r1.A02("android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3.A08.A06() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A09
            X.08M r0 = r0.A0C
            java.lang.Object r0 = r0.A07()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x002c
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x002d
            X.5ZR r0 = r3.A08
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0048
        L_0x0024:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A09
            X.08M r1 = r0.A0C
            r0 = 3
        L_0x0029:
            X.C06270Wx.A03(r1, r0)
        L_0x002c:
            return
        L_0x002d:
            X.310 r0 = r3.A05
            boolean r0 = r0.A0B()
            X.5ZR r1 = r3.A08
            if (r0 != 0) goto L_0x003f
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0048
            X.5ZR r1 = r3.A08
        L_0x003f:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x0024
        L_0x0048:
            if (r4 != r2) goto L_0x005e
            X.5ZR r0 = r3.A08
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x005e
            X.33p r1 = r3.A09
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            X.C18260x0.A0K(r1, r0)
            r0 = 2
            r3.A77(r0)
            return
        L_0x005e:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A09
            X.08M r1 = r0.A0C
            r0 = 2
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28341gh.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        C56952sp r2;
        int i;
        C70023Zo r22;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A0A = new AnonymousClass5PT();
        this.A00 = (RelativeLayout) C005205m.A00(this, R.id.chat_transfer_image_layout);
        this.A01 = (LottieAnimationView) C005205m.A00(this, R.id.chat_transfer_lottie_animation);
        if (C1001059l.A04) {
            C005205m.A00(this, R.id.chat_transfer_temporary_illustration).setVisibility(0);
        }
        this.A0C = new AnonymousClass5UY(C005205m.A00(this, R.id.chat_transfer_qr_code_stub));
        this.A05 = (WaTextView) C005205m.A00(this, R.id.chat_transfer_title);
        this.A04 = (WaTextView) C005205m.A00(this, R.id.chat_transfer_subtitle);
        this.A02 = (CircularProgressBar) C005205m.A00(this, R.id.chat_transfer_progress_spinner);
        this.A03 = (WaTextView) C005205m.A00(this, R.id.chat_transfer_progress_description);
        this.A06 = (RoundCornerProgressBar) C005205m.A00(this, R.id.chat_transfer_progress_bar);
        this.A0D = (WDSButton) C005205m.A00(this, R.id.chat_transfer_primary_btn);
        this.A0E = (WDSButton) C005205m.A00(this, R.id.chat_transfer_secondary_btn);
        ChatTransferActivity chatTransferActivity = (ChatTransferActivity) this;
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) AnonymousClass0x9.A0H(chatTransferActivity).A01(ChatTransferViewModel.class);
        chatTransferActivity.A03 = chatTransferViewModel;
        chatTransferActivity.A09 = chatTransferViewModel;
        Bundle extras = chatTransferActivity.getIntent().getExtras();
        if (!chatTransferViewModel.A07) {
            chatTransferViewModel.A0L(extras);
            C56022rI r0 = chatTransferViewModel.A0R;
            r0.A03();
            C183538qC r3 = r0.A02;
            C18270x1.A0g(AnonymousClass0x2.A0E(r3), "/export/logging/attemptId");
            C18270x1.A0l(AnonymousClass0x2.A0E(r3), "/export/isDonor", chatTransferViewModel.A06);
            C18270x1.A0l(AnonymousClass0x2.A0E(r3), "/export/startedOnReceiver", chatTransferViewModel.A08);
            C55112po r8 = chatTransferViewModel.A0X;
            r8.A01(2);
            if (chatTransferViewModel.A06) {
                r2 = chatTransferViewModel.A0P;
                i = 3979;
            } else {
                r2 = chatTransferViewModel.A0O;
                i = 3980;
            }
            if (r2.A0Y(C58422vE.A02, i)) {
                Log.e("fpm/ChatTransferViewModel/disabled: app version for platform migration is not supported");
                AnonymousClass08M r32 = chatTransferViewModel.A0H;
                AnonymousClass2UG r23 = new AnonymousClass2UG();
                r23.A0B = R.string.f11nameremoved;
                r23.A0A = R.string.f11nameremoved;
                r23.A03 = R.string.f11nameremoved;
                r23.A08 = R.string.f11nameremoved;
                r23.A0E = new C85654Hc(chatTransferViewModel, 4);
                r23.A0F = new C85654Hc(chatTransferViewModel, 5);
                r23.A0D = new C85654Hc(chatTransferViewModel, 6);
                r23.A02 = 376;
                r23.A01 = 376;
                r32.A0H(r23);
            } else {
                C28801hn r02 = chatTransferViewModel.A0Q;
                AnonymousClass3R4 r33 = chatTransferViewModel.A0Y;
                r02.A06(r33);
                chatTransferViewModel.A0S.A06(r33);
                AnonymousClass4FS r7 = chatTransferViewModel.A0a;
                if (chatTransferViewModel.A06) {
                    r22 = new C70023Zo(chatTransferViewModel, 22);
                } else {
                    AnonymousClass2UI r1 = chatTransferViewModel.A0U;
                    Objects.requireNonNull(r1);
                    r22 = new C70023Zo(r1, 23);
                }
                r7.BkM(r22);
                r8.A01(3);
                C18270x1.A0l(C18270x1.A03(chatTransferViewModel.A0N), "chat_transfer_in_progress", true);
                if (!chatTransferViewModel.A07) {
                    chatTransferViewModel.A0L(extras);
                    chatTransferViewModel.A0V.A06(r33);
                    chatTransferViewModel.A0J(1);
                    chatTransferViewModel.A07 = true;
                }
            }
        }
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0H, 133);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0C, 134);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0B, 135);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A09, 136);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0A, 137);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0D, 138);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0E, 139);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A09.A0F, 140);
        AnonymousClass1Ha.A21(chatTransferActivity, chatTransferActivity.A03.A0G, 132);
    }

    public void onResume() {
        super.onResume();
        Number number = (Number) this.A09.A0C.A07();
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 4) {
                A75();
            } else if (intValue == 6) {
                A76();
            }
        }
    }
}
