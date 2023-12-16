package com.whatsapp.migration.android.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0AQ;
import X.AnonymousClass0x9;
import X.AnonymousClass4EE;
import X.AnonymousClass4SG;
import X.AnonymousClass5UF;
import X.AnonymousClass6BG;
import X.C005205m;
import X.C107035aa;
import X.C107555bV;
import X.C107695bk;
import X.C111095hX;
import X.C18260x0;
import X.C18320x8;
import X.C54622p1;
import X.C56282rj;
import X.C56502s5;
import X.C626936e;
import X.C64333Db;
import X.C72333dY;
import X.C86604Kt;
import X.C89644eZ;
import X.C989653x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class GoogleMigrateImporterActivity extends C89644eZ implements AnonymousClass4EE {
    public static final int A0C = 11;
    public static final int A0D = -1;
    public static final String A0E = "GoogleMigrateImporterActivity/";
    public static final String A0F = "com.whatsapp.migration.ACTION_OPENED_VIA_NOTIFICATION";
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public GoogleMigrateImporterViewModel A04;
    public View A05;
    public WaTextView A06;
    public WaTextView A07;
    public RoundCornerProgressBar A08;
    public WDSButton A09;
    public WDSButton A0A;
    public boolean A0B;

    public void BR8(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        boolean z;
        switch (i) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0D.A03("google_migrate_recoverable_error", "google_migrate_attempt_to_skip_import");
                A0f(4, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            case 3:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 4:
                googleMigrateImporterViewModel = this.A04;
                z = true;
                break;
            default:
                return;
        }
        googleMigrateImporterViewModel.A0H(z);
    }

    public void BRA(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        String str;
        boolean z = true;
        switch (i) {
            case 1:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0H(true);
                return;
            case 3:
            case 4:
                googleMigrateImporterViewModel = this.A04;
                break;
            default:
                return;
        }
        C56502s5 r2 = googleMigrateImporterViewModel.A0D;
        if (z) {
            str = "google_migrate_cancel_import_dialog";
        } else {
            str = "google_migrate_unrecoverable_error";
        }
        r2.A04(str, "google_migrate_confirm_skip_import");
        Context context = googleMigrateImporterViewModel.A07.A00;
        C54622p1 r22 = googleMigrateImporterViewModel.A0F;
        Log.i("GoogleMigrateService/cancelImport()");
        r22.A03(context, AnonymousClass0x9.A09("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT"), GoogleMigrateService.class);
    }

    private void A0Z() {
        C86604Kt.A1K(this, 64);
    }

    public static /* synthetic */ void A0a() {
    }

    public static /* synthetic */ void A0b() {
    }

    public static /* synthetic */ void A0c() {
    }

    public static /* synthetic */ void A0d() {
    }

    public static void A0g(Context context) {
        AnonymousClass0x9.A08(context, GoogleMigrateImporterActivity.class).addFlags(335544320);
    }

    public static void A0l(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        View view;
        if (i == 100) {
            googleMigrateImporterActivity.A06.setVisibility(8);
            view = googleMigrateImporterActivity.A08;
        } else {
            RoundCornerProgressBar roundCornerProgressBar = googleMigrateImporterActivity.A08;
            if (i == -1) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(0);
                googleMigrateImporterActivity.A06.setVisibility(0);
                googleMigrateImporterActivity.A06.setText(R.string.f11nameremoved);
                return;
            } else if (i >= 0) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(i);
                googleMigrateImporterActivity.A06.setVisibility(0);
                WaTextView waTextView = googleMigrateImporterActivity.A06;
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = googleMigrateImporterActivity.A00.A0N().format(((double) i) / 100.0d);
                AnonymousClass001.A0y(googleMigrateImporterActivity, waTextView, A0L, R.string.f11nameremoved);
                return;
            } else {
                roundCornerProgressBar.setVisibility(8);
                view = googleMigrateImporterActivity.A06;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0128, code lost:
        r12 = com.whatsapp.R.string.f11nameremoved;
        r13 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012e, code lost:
        r3.A0f(r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0138, code lost:
        r12.A0e(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r6 = null;
        r8 = null;
        r9 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r3.A0u(r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0o(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r12, java.lang.Integer r13) {
        /*
            if (r13 != 0) goto L_0x0008
            java.lang.String r0 = "GoogleMigrateImporterActivity/currentScreen is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0008:
            r0 = 2131889707(0x7f120e2b, float:1.9414085E38)
            r3 = r12
            java.lang.String r5 = r12.getString(r0)
            r1 = 18
            X.934 r0 = new X.934
            r0.<init>(r12, r1)
            r1 = 0
            X.3dY r4 = new X.3dY
            r4.<init>(r1, r0)
            com.whatsapp.components.RoundCornerProgressBar r0 = r12.A08
            r2 = 8
            r0.setVisibility(r2)
            com.whatsapp.WaTextView r0 = r12.A06
            r0.setVisibility(r2)
            int r0 = r13.intValue()
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0057;
                case 2: goto L_0x0031;
                case 3: goto L_0x008e;
                case 4: goto L_0x0031;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00dc;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0031;
                case 9: goto L_0x00dc;
                case 10: goto L_0x0100;
                case 11: goto L_0x010e;
                case 12: goto L_0x011b;
                case 13: goto L_0x0120;
                case 14: goto L_0x00d3;
                case 15: goto L_0x0134;
                case 16: goto L_0x0116;
                case 17: goto L_0x013d;
                default: goto L_0x0031;
            }
        L_0x0031:
            r6 = r1
            r8 = r1
            r9 = r1
            r10 = r1
        L_0x0035:
            r3.A0u(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0039:
            r0 = 2131889709(0x7f120e2d, float:1.941409E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131889711(0x7f120e2f, float:1.9414093E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131889724(0x7f120e3c, float:1.941412E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131886155(0x7f12004b, float:1.940688E38)
            java.lang.String r10 = r12.getString(r0)
            r9 = r1
            goto L_0x0035
        L_0x0057:
            r0 = 2131889720(0x7f120e38, float:1.9414112E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131889709(0x7f120e2d, float:1.941409E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131889711(0x7f120e2f, float:1.9414093E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131889724(0x7f120e3c, float:1.941412E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131889706(0x7f120e2a, float:1.9414083E38)
            java.lang.String r9 = r12.getString(r0)
            r2 = 19
            X.934 r0 = new X.934
            r0.<init>(r12, r2)
            X.3dY r4 = new X.3dY
            r4.<init>(r1, r0)
            r0 = 2131886154(0x7f12004a, float:1.9406879E38)
            java.lang.String r10 = r12.getString(r0)
            goto L_0x0035
        L_0x008e:
            r0 = 2131889708(0x7f120e2c, float:1.9414087E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            java.lang.String r9 = r12.getString(r0)
            com.whatsapp.components.RoundCornerProgressBar r2 = r12.A08
            r0 = 0
            r2.setVisibility(r0)
            r12.BjL()
            r0 = 2131886153(0x7f120049, float:1.9406877E38)
            java.lang.String r10 = r12.getString(r0)
            r8 = r1
            goto L_0x0035
        L_0x00ae:
            r0 = 2131889710(0x7f120e2e, float:1.9414091E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131891152(0x7f1213d0, float:1.9417016E38)
            java.lang.String r8 = r12.getString(r0)
            r2 = 20
            X.934 r0 = new X.934
            r0.<init>(r12, r2)
            X.3dY r4 = new X.3dY
            r4.<init>(r1, r0)
            r0 = 2131886152(0x7f120048, float:1.9406875E38)
            java.lang.String r10 = r12.getString(r0)
            r6 = r1
            r9 = r1
            goto L_0x0035
        L_0x00d3:
            r9 = 9
            r10 = 2131889721(0x7f120e39, float:1.9414114E38)
            r11 = 2131889701(0x7f120e25, float:1.9414073E38)
            goto L_0x0128
        L_0x00dc:
            r9 = 1
            r10 = 2131889726(0x7f120e3e, float:1.9414124E38)
            r11 = 2131889725(0x7f120e3d, float:1.9414122E38)
            r12 = 2131889723(0x7f120e3b, float:1.9414118E38)
            r13 = -1
            goto L_0x012e
        L_0x00e8:
            r0 = 2131889708(0x7f120e2c, float:1.9414087E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            java.lang.String r9 = r12.getString(r0)
            r0 = 2131889700(0x7f120e24, float:1.941407E38)
            r12.Bp9(r0)
            r8 = r1
            r10 = r1
            goto L_0x0035
        L_0x0100:
            r9 = 3
            r10 = 2131890120(0x7f120fc8, float:1.9414923E38)
            r11 = 2131890119(0x7f120fc7, float:1.941492E38)
            r12 = 2131890118(0x7f120fc6, float:1.9414919E38)
            r13 = 2131889722(0x7f120e3a, float:1.9414116E38)
            goto L_0x012e
        L_0x010e:
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r2 = r12.A04
            r0 = 1
            r2.A0H(r0)
            goto L_0x0031
        L_0x0116:
            r2 = 7
            r0 = 2131887758(0x7f12068e, float:1.9410132E38)
            goto L_0x0138
        L_0x011b:
            r2 = 2
            r0 = 2131895949(0x7f12268d, float:1.9426745E38)
            goto L_0x0138
        L_0x0120:
            r9 = 8
            r10 = 2131889704(0x7f120e28, float:1.941408E38)
            r11 = 2131889703(0x7f120e27, float:1.9414077E38)
        L_0x0128:
            r12 = 2131889705(0x7f120e29, float:1.9414081E38)
            r13 = 2131889723(0x7f120e3b, float:1.9414118E38)
        L_0x012e:
            r8 = r3
            r8.A0f(r9, r10, r11, r12, r13)
            goto L_0x0031
        L_0x0134:
            r2 = 6
            r0 = 2131889702(0x7f120e26, float:1.9414075E38)
        L_0x0138:
            r12.A0e(r2, r0)
            goto L_0x0031
        L_0x013d:
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            r12.Bp9(r0)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A0o(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity, java.lang.Integer):void");
    }

    public static void A0q(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        if (!z) {
            googleMigrateImporterActivity.A0f(5, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, -1);
        }
    }

    public static void A0r(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        int i;
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                if (i2 < 33) {
                    i = R.string.f11nameremoved;
                }
            }
            if (googleMigrateImporterActivity.isFinishing()) {
                Log.d("request/permission/activity/requestContactAndStorageAccess/activity is finishing: do nothing");
                return;
            }
            AnonymousClass5UF r2 = new AnonymousClass5UF(googleMigrateImporterActivity);
            r2.A0A = new int[]{R.drawable.permission_contacts, R.drawable.permission_plus, R.drawable.permission_storage};
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add("android.permission.GET_ACCOUNTS");
            A0s.add("android.permission.READ_CONTACTS");
            A0s.add("android.permission.WRITE_CONTACTS");
            r2.A0D = C107035aa.A06(A0s);
            r2.A02 = R.string.f11nameremoved;
            r2.A0B = null;
            r2.A03 = i;
            r2.A09 = null;
            googleMigrateImporterActivity.startActivityForResult(AnonymousClass5UF.A00(r2, false), 11);
        }
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
        }
    }

    public GoogleMigrateImporterActivity(int i) {
        this.A0B = false;
        A0Z();
    }

    /* access modifiers changed from: private */
    public AnonymousClass0AQ A0Y(int i) {
        AnonymousClass0AQ A032 = AnonymousClass0AQ.A03((Resources.Theme) null, getResources(), i);
        C626936e.A07(A032, AnonymousClass000.A0Y("GoogleMigrateImporterActivity/getVectorDrawable/drawableId is invalid/drawableId = ", AnonymousClass001.A0o(), i));
        return A032;
    }

    private void A0e(int i, int i2) {
        A0f(i, R.string.f11nameremoved, i2, R.string.f11nameremoved, R.string.f11nameremoved);
    }

    private void A0f(int i, int i2, int i3, int i4, int i5) {
        String string;
        String string2;
        String num = Integer.toString(i);
        if (getSupportFragmentManager().A0D(num) != null) {
            C18260x0.A0s("GoogleMigrateImporterActivity/showDialog/dialog is already shown/dialogId = ", num, AnonymousClass001.A0o());
            return;
        }
        C56282rj r3 = new C56282rj(i);
        String str = null;
        if (i2 == -1) {
            string = null;
        } else {
            string = getString(i2);
        }
        r3.A06(string);
        r3.A02(getString(i3));
        r3.A07(false);
        if (i4 == -1) {
            string2 = null;
        } else {
            string2 = getString(i4);
        }
        r3.A05(string2);
        if (i5 != -1) {
            str = getString(i5);
        }
        r3.A03(str);
        Bon(r3.A00(), num);
    }

    public static void A0k(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        String str;
        googleMigrateImporterActivity.setResult(i);
        if (googleMigrateImporterActivity.getIntent() != null && A0F.equals(googleMigrateImporterActivity.getIntent().getAction())) {
            Intent className = C18320x8.A07().setClassName(googleMigrateImporterActivity.getPackageName(), "com.whatsapp.registration.RegisterName");
            if (i == 2) {
                str = "google_migrate_import_canceled";
            } else {
                if (i == 1) {
                    str = "google_migrate_import_success";
                }
                googleMigrateImporterActivity.startActivity(className);
            }
            className.putExtra(str, true);
            googleMigrateImporterActivity.startActivity(className);
        }
        googleMigrateImporterActivity.finish();
    }

    private void A0u(C72333dY r8, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
            this.A01.setImageDrawable((Drawable) r8.get());
            if (str6 != null) {
                this.A01.setFocusable(true);
            }
            this.A01.setContentDescription(str6);
            WaTextView waTextView = this.A02;
            int i = 0;
            int i2 = 8;
            if (str2 != null) {
                i2 = 0;
            }
            waTextView.setVisibility(i2);
            WaTextView waTextView2 = this.A07;
            int i3 = 8;
            if (str3 != null) {
                i3 = 0;
            }
            waTextView2.setVisibility(i3);
            WDSButton wDSButton = this.A09;
            int i4 = 8;
            if (str4 != null) {
                i4 = 0;
            }
            wDSButton.setVisibility(i4);
            WDSButton wDSButton2 = this.A0A;
            if (str5 == null) {
                i = 8;
            }
            wDSButton2.setVisibility(i);
            boolean isEmpty = TextUtils.isEmpty(str5);
            Resources resources = getResources();
            int i5 = R.dimen.f6nameremoved;
            if (isEmpty) {
                i5 = R.dimen.f6nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i5);
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A09);
            C107555bV.A06(this.A09, this.A00, A0T.leftMargin, A0T.topMargin, A0T.rightMargin, dimensionPixelSize);
            this.A03.setText(str);
            this.A02.setText(str2);
            this.A07.setText(str3);
            this.A09.setText(str4);
            this.A0A.setText(str5);
        }
    }

    public void BR9(int i) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A04;
            if (googleMigrateImporterViewModel.A09.A0G()) {
                Log.i("GoogleMigrateImporterViewModel/onPermissionGranted/import already successfully finished, skipping import again");
                return;
            }
            googleMigrateImporterViewModel.A0D.A04("google_migrate_permission", "google_migrate_accepted_permission");
            googleMigrateImporterViewModel.A0E();
            return;
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel2 = this.A04;
        boolean A0E2 = googleMigrateImporterViewModel2.A08.A0E();
        boolean A002 = googleMigrateImporterViewModel2.A06.A00();
        if (!A0E2) {
            if (!A002) {
                str = "google_migrate_rejected_contact_and_storage_permission";
            } else {
                str = "google_migrate_rejected_storage_permission";
            }
        } else if (!A002) {
            str = "google_migrate_rejected_contact_permission";
        } else {
            str = "unknown";
        }
        googleMigrateImporterViewModel2.A0D.A04("google_migrate_permission", str);
        googleMigrateImporterViewModel2.A0F(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A03 = (WaTextView) C005205m.A00(this, R.id.google_migrate_title);
        this.A02 = (WaTextView) C005205m.A00(this, R.id.google_migrate_sub_title);
        this.A07 = (WaTextView) C005205m.A00(this, R.id.google_migrate_warning);
        this.A09 = (WDSButton) C005205m.A00(this, R.id.google_migrate_main_action);
        this.A0A = (WDSButton) C005205m.A00(this, R.id.google_migrate_sub_action);
        this.A01 = (WaImageView) C005205m.A00(this, R.id.google_migrate_image_view);
        this.A08 = (RoundCornerProgressBar) C005205m.A00(this, R.id.google_migrate_progress_bar);
        this.A06 = (WaTextView) C005205m.A00(this, R.id.google_migrate_progress_description);
        View findViewById = findViewById(R.id.google_migrate_importer_view_layout);
        this.A05 = findViewById;
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) AnonymousClass0x9.A0H(this).A01(GoogleMigrateImporterViewModel.class);
        this.A04 = googleMigrateImporterViewModel;
        C86604Kt.A1M(this, googleMigrateImporterViewModel.A01, 281);
        C86604Kt.A1M(this, this.A04.A03, 282);
        C86604Kt.A1M(this, this.A04.A00, 283);
        C86604Kt.A1M(this, this.A04.A04, 284);
        C86604Kt.A1M(this, this.A04.A02, 285);
        C989653x.A00(this.A09, this, 8);
        C989653x.A00(this.A0A, this, 9);
    }

    public void onDestroy() {
        super.onDestroy();
        BjL();
    }

    public void onBackPressed() {
        C111095hX.A06(this);
    }

    public GoogleMigrateImporterActivity() {
        this(0);
        this.A00 = new AnonymousClass6BG((Object) this, 26);
    }
}
